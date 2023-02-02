package com.SeleniumPractice2023;

import java.time.Duration;
import java.util.Set;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWait {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//		WebDriverWait wait = new WebDriverWait(driver,10); //Older version of Defining
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://testproject.io/");
		
		String parentWindow = driver.getWindowHandle(); //Returns current window Handle
		
		driver.findElement(By.linkText("Login")).click();
		
		Set<String> childWindows = driver.getWindowHandles(); //Returns all the opened windows
		
		for (String windowHandle : childWindows) {     //taking each window handle from childwindows.
			
			if(!windowHandle.equals(parentWindow)) {  
				
				driver.switchTo().window(windowHandle);
				
				/* Method-1: We are using EXPECTED CONDITION defined by Webdriver */
				
				
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"))); 
					
				
				/* Method-2: Now, Instead of using Expected Condition, building our own Function to work like above statement */
				
				
				Function<WebDriver, Boolean> testFunction = new Function<WebDriver, Boolean>() {

					@Override
					public Boolean apply(WebDriver test) {

						return test.findElement(By.id("username")).isDisplayed();
					}

				};

				
				wait.until(testFunction);

				
				/* Method-3: by using Lambda expression we can pass within the UNTIL Method*/
				
//				wait.until(d->d.findElement(By.id("username")).isDisplayed());
				
				
				driver.findElement(By.id("username")).sendKeys("Frank Martin");
				
			}
			
		}

		driver.quit();
	}

}
