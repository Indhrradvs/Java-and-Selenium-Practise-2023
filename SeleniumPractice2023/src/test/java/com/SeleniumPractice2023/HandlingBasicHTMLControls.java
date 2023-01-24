package com.SeleniumPractice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/* How to Handle Links, BUttons, RadioButtons and checkboxes using Selenium Webdriver */

public class HandlingBasicHTMLControls {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		Thread.sleep(4000);

		// Radio Button

		driver.findElement(By.id("femalerb")).click();

		Thread.sleep(3000);

		// checkbox

		driver.findElement(By.id("englishchbx")).click();

		Thread.sleep(3000);

		WebElement hindchkbox = driver.findElement(By.id("hindichbx"));
		
		hindchkbox.click(); // Check Box select
		
		Thread.sleep(3000);
		
		if(hindchkbox.isSelected()){
			
			hindchkbox.click(); //Check Box Un-Select
			
			Thread.sleep(4000);
	
			driver.findElement(By.id("registerbtn")).click();
			
			System.out.println(driver.findElement(By.id("msg")).getText());   
			
			Thread.sleep(5000);
			
			driver.findElement(By.linkText("Click here to navigate to the home page")).click();
			
			Thread.sleep(5000);
			
			driver.quit();
		
			
		}
		
			
	}

}
