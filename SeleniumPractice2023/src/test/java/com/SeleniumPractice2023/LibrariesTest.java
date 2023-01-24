package com.SeleniumPractice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibrariesTest {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get(" https://github.com/login ");

		Thread.sleep(3000);
		
		Highlight(driver, driver.findElement(By.className("header-logo")));

		Thread.sleep(3000);

		Highlight(driver, driver.findElement(By.tagName("h1")));

		Thread.sleep(3000);
		
		Highlight(driver, driver.findElement(By.id("login_field")));

		Thread.sleep(3000);

		Highlight(driver, driver.findElement(By.name("password")));

		Thread.sleep(3000);

		Highlight(driver, driver.findElement(By.linkText("Create an account")));

		Thread.sleep(3000);
		
		Highlight(driver, driver.findElement(By.partialLinkText("Forgot pa")));

		Thread.sleep(3000);
		
		Highlight(driver, driver.findElement(By.xpath("//a[@href='/site/terms']")));

		Thread.sleep(3000);
		
		Highlight(driver, driver.findElement(By.cssSelector("input[name=\"commit\"] ")));

		Thread.sleep(3000);
		
		driver.quit();

	}

	private static void Highlight(WebDriver driver, WebElement findElement) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')",
				findElement);

	}

}
