package com.SeleniumPractice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(" https://www.hyrtutorials.com/p/alertsdemo.html ");
		
		Thread.sleep(3000);
		
		//Alert Box
		
//		System.out.println(driver.findElement(By.id("output")).getText());
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.id("alertBox")).click();
//		
//		Thread.sleep(3000);
//		
//		System.out.println(driver.switchTo().alert().getText());
//		
//		Thread.sleep(3000);
//		
//		driver.switchTo().alert().accept();
//		
//		Thread.sleep(3000);
//		
//		System.out.println(driver.findElement(By.id("output")).getText());
//		
//		Thread.sleep(3000);
//		
//		driver.quit();
//		
		
		//Confirm Box
		
//		System.out.println(driver.findElement(By.id("output")).getText());
//
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("confirmBox")).click();
//
//		Thread.sleep(3000);
//
//		System.out.println(driver.switchTo().alert().getText());
//
//		Thread.sleep(3000);
//
//		driver.switchTo().alert().accept();  //Clicking on OK button
//
//		Thread.sleep(3000);
//
//		System.out.println(driver.findElement(By.id("output")).getText());
//
//		Thread.sleep(3000);
		
		// Performing Pop-up Cancel button
		
//		driver.findElement(By.id("confirmBox")).click();
//
//		Thread.sleep(3000);
//
//		System.out.println(driver.switchTo().alert().getText());
//
//		Thread.sleep(3000);
//
//		driver.switchTo().alert().dismiss();  //Clicking on CANCEL button
//
//		Thread.sleep(3000);
//
//		System.out.println(driver.findElement(By.id("output")).getText());
//
//		Thread.sleep(3000);
			

		
		
		
		//Prompt Box
		
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
		
		// Performing Pop-up Cancel button
		
		driver.findElement(By.id("promptBox")).click();

		Thread.sleep(3000);

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(3000);
		
		driver.switchTo().alert().sendKeys(" Hello USA! ");

		driver.switchTo().alert().dismiss();  //Clicking on CANCEL button

		Thread.sleep(3000);

		System.out.println(driver.findElement(By.id("output")).getText());

		Thread.sleep(3000);
		
		
		driver.quit();
		
		
	}

}
