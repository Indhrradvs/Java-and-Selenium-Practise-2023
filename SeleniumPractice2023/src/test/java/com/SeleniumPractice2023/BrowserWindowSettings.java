package com.SeleniumPractice2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowSettings {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
//		WebDriver driver = new ChromeDriver();
		
		
		/* Method-1: Maximizing the window after window open */
		
//		driver.manage().window().maximize();
		
		
		/* Method-2: Opening the window from Maximized Mode */
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com/");

	}

}
