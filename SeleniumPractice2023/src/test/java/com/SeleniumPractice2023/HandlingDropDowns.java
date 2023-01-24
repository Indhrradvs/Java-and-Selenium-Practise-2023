package com.SeleniumPractice2023;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDowns {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		/* Selecting SINGLE VALUES in the dropdown */
		
//		WebElement courseElement = driver.findElement(By.id("course")); //Finding COURSE dropdown field
//		
//		Select courseNameDropdown = new Select(courseElement);
//		
//		List<WebElement> courseNameDropdownOptions  = courseNameDropdown.getOptions();
//		
//		for( WebElement option:courseNameDropdownOptions ) {
//			
//			System.out.println(option.getText());   //Printing all the values in the dropdown
//			
//		}
//		
//		courseNameDropdown.selectByIndex(1); //JAVA
//		
//		Thread.sleep(3000);
//		
//		courseNameDropdown.selectByValue("python"); //Python
//		
//		Thread.sleep(3000);
//		
//		courseNameDropdown.selectByVisibleText("Javascript"); //JavaScript
//		
//		Thread.sleep(3000);
//		
//		String selectedtext = courseNameDropdown.getFirstSelectedOption().getText();
//		
//		System.out.println("Select Visible Text- "+selectedtext);
		
		
		/* Selecting MULTIPLE VALUES in the dropdown */
		
        WebElement ideEelment = driver.findElement(By.id("ide")); //Finding IDE dropdown field
		
		Select IdeDropdown = new Select(ideEelment);
		
		List<WebElement> ideDropdownOptions  = IdeDropdown.getOptions();
		
		for( WebElement option:ideDropdownOptions ) {
			
			System.out.println(option.getText());   //Printing all the values in the dropdown
			
		}
		
		IdeDropdown.selectByIndex(1); //IntelliJ IDEA
		
		Thread.sleep(3000);
		
		IdeDropdown.selectByValue("vs"); //Python
		
		Thread.sleep(3000);
		
		IdeDropdown.selectByVisibleText("NetBeans"); //JavaScript
		
		Thread.sleep(3000);
		
		IdeDropdown.deselectByVisibleText("NetBeans");
		
				
		List<WebElement> selectedOptions = IdeDropdown.getAllSelectedOptions();
		
		for (WebElement selectedoption : selectedOptions) {
			
			System.out.println("Select Visible Text- "+selectedoption.getText());
		}
		
		driver.quit();
	}

}
