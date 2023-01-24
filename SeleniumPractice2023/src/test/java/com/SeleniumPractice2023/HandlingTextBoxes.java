package com.SeleniumPractice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTextBoxes {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(" https://github.com/login ");

		Thread.sleep(3000);

		WebElement checkboxText = driver.findElement(By.id("login_field"));

		if (checkboxText.isDisplayed()) {

			if (checkboxText.isEnabled()) {

				checkboxText.sendKeys(" INDHRRA "); // Entering Text into field

				String enteredText = checkboxText.getAttribute("value"); // Retreiving the entered text

				System.out.println(enteredText); // Printing the retrieved text

				Thread.sleep(3000);

				checkboxText.clear();

			}

			else

				System.out.println(" User textbox is not enabled ");

		}

		else

		System.out.println(" User Textbox is not displayed");
		
		/* Password Field */

		WebElement password = driver.findElement(By.id("password"));

		password.sendKeys("Hello");

		String enteredPwd = password.getAttribute("value");

		System.out.println(enteredPwd);

		Thread.sleep(3000);

		driver.quit();

	}

}
