package com.SeleniumPractice2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


/**
 * 
 * How to Get URL, TITLE, PAGE SOURCE using Selenium webdriver.?
 * 
 */



public class WebPageproperties {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.seleniumhq.org");

		/* URL */

	    String currentUrl = driver.getCurrentUrl();

		System.out.println("Current URL is : " + currentUrl); 
		
		
		/* Title */

		String Title = driver.getTitle();

		System.out.println("Title of the Page: " + Title);
		
				
		/* HTML Page Source */
		
//		String pageSource = driver.getPageSource();
//		
//		System.out.println(pageSource);
		
		driver.quit();
	}

}
