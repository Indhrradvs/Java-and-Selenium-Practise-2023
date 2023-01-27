package com.SeleniumPractice2023;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaitTimeOut {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Providing time to wait until element found
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //New way to define Implicitly wait. Above statement is also TRUE
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		
		driver.findElement(By.id("txt1")).sendKeys("Frank Martin");
						
		Thread.sleep(3000);
		
		driver.quit();

	}

}
