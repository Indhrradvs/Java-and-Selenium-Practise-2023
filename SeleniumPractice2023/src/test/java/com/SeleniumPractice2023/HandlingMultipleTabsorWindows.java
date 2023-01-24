package com.SeleniumPractice2023;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMultipleTabsorWindows {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(" https://www.hyrtutorials.com/p/window-handles-practice.html ");

		Thread.sleep(3000);
		
		
		//Single Window
//		
//		String parentWindowHandle =	driver.getWindowHandle();
//		
//		System.out.println(" Parent window Handle - "+parentWindowHandle + driver.getTitle());
//		
//		driver.findElement(By.id("newWindowBtn")).click();
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		for (String windowHandle : windowHandles) {
//			
//			if (!windowHandle.equals(parentWindowHandle)) {  // Verifying the field shouldn't be in Parent Window
//				
//				driver.switchTo().window(windowHandle);
//				
//				driver.manage().window().maximize();
//				
//				driver.findElement(By.id("firstName")).sendKeys("Frank Martin"); //Sending Text in Child Window
//				
//				Thread.sleep(3000);
//				
//				driver.close();
//			}
//			
//						
//			//System.out.println(windowHandle + driver.getTitle());
//			
//		}
//
//		driver.switchTo().window(parentWindowHandle);  // Switching back to Parent Window
//		
//		driver.findElement(By.id("name")).sendKeys(" I'm Back ");
		
		
		
		/* Handling Single Tab */
		
		String parentWindowHandle = driver.getWindowHandle();

		System.out.println(" Parent window Handle - " + parentWindowHandle + driver.getTitle());
		
		Thread.sleep(20000);
		
		driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
				
		Set<String> windowHandles = driver.getWindowHandles();

		for (String windowHandle : windowHandles) {

			if (!windowHandle.equals(parentWindowHandle)) { 

				driver.switchTo().window(windowHandle);

				System.out.println(driver.findElement(By.id("output")).getText());

				Thread.sleep(3000);

				driver.findElement(By.id("promptBox")).click();

				Thread.sleep(3000);

				System.out.println(driver.switchTo().alert().getText());

				Thread.sleep(3000);
				
				driver.switchTo().alert().sendKeys(" Hello India! ");

				driver.switchTo().alert().accept();  //Clicking on OK button

				Thread.sleep(3000);

				System.out.println(driver.findElement(By.id("output")).getText());

				Thread.sleep(3000);
				
				driver.close();
			}


		}

		driver.switchTo().window(parentWindowHandle); // Switching back to Parent Window

		driver.findElement(By.id("name")).sendKeys(" I'm Back ");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}