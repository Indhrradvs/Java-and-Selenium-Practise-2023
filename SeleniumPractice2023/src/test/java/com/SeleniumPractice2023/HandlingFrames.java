package com.SeleniumPractice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.hyrtutorials.com/p/frames-practice.html ");
		
		
		driver.findElement(By.id("name")).sendKeys("Text1"); //Main WebPage
		
		Thread.sleep(3000);

		/* Handling FRAME-1 */
		
		driver.switchTo().frame("frm1"); 

		Select courseNameDropdown = new Select(driver.findElement(By.id("course")));

		courseNameDropdown.selectByVisibleText("Dot Net");
		
		Thread.sleep(3000);
		
		
		/* Switching to Parent Frame */

		driver.switchTo().defaultContent(); //Moving to Main Page
		
		driver.findElement(By.id("name")).clear();
		
		driver.findElement(By.id("name")).sendKeys("Text2");
						
		Thread.sleep(3000);

		driver.switchTo().frame("frm1");  //switching to Frame-1

		Select courseNameDropdown1 = new Select(driver.findElement(By.id("course")));

		courseNameDropdown1.selectByVisibleText("Java");
		
		Thread.sleep(3000);
		
		/* Switching to Frame-2 */
		
		
		driver.switchTo().defaultContent(); // Moving to Main Page

		driver.findElement(By.id("name")).clear();

		driver.findElement(By.id("name")).sendKeys("Text3");
		
		Thread.sleep(3000);
			
		driver.switchTo().frame("frm2");
		
		driver.findElement(By.id("firstName")).sendKeys("Frank Martin");
		
		Thread.sleep(3000);

		driver.findElement(By.id("englishchbx")).click();
		
		Thread.sleep(3000);

		driver.switchTo().defaultContent(); // Moving to Main Page

		driver.findElement(By.id("name")).clear();

		driver.findElement(By.id("name")).sendKeys("Text4");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		

	}

}
