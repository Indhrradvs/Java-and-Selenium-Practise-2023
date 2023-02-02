package com.SeleniumPractice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author venkatdhanyamraju
 * 
 * How to get WebElment Properties like- Tag Name, HTML Attribute Value, Text, CSS Value using selenium Webdriver?
 *
 */


public class WebElementProperties {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://github.com/login");
		
		/* Retrieving-TAG NAME */
		
        System.out.println(driver.findElement(By.name("commit")).getTagName());	
        
        
        /* Retrieving-HTML Attribute Value */
        
        System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
        
        /* Retrieving-Text from Text Box */

        WebElement userNameTxt = driver.findElement(By.id("login_field"));
        
        userNameTxt.sendKeys("Test@gmail.com");
        
        System.out.println(userNameTxt.getAttribute("value")); // In Webpage VALUE field will generate after text enterd in the Text Filed
        
       /* Retrieving-Text from webpage */
        
        System.out.println(driver.findElement(By.xpath("//label[@for ='login_field']")).getText());
      
        /* Retrieving-CSS Value */
        
        System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
        
        driver.quit();
        
	}

}
