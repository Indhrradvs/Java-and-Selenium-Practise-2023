package com.SeleniumPractice2023;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author venkatdhanyamraju
 * 
 * Verifying MoveToElements or MouseHover, Click, Double Click, Right or Context Click  
 *
 */


public class MouseHoverActions {

	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		Actions testActions = new Actions(driver); // Defining action calss here helps to use in multiple actions
		
		driver.manage().window().maximize();
		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		Thread.sleep(3000);
//
//		/* Login into Application */
//		
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		
//		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
//		
//		Thread.sleep(3000);
//		
//		/* Performing MoveToElements, click operations */
//		
//		testActions.moveToElement(driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[1]"))).click().perform();
//		
//		Thread.sleep(3000);
//		
//		testActions.moveToElement(driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[3]"))).click().perform();
//		
//		Thread.sleep(3000);
//		
//		testActions.moveToElement(driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-link'])[2]"))).click().perform();
//		
//		Thread.sleep(3000);
//		
//		
//		/* Double Click Operations */
//		
//		WebElement inputField = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
//		
//		inputField.sendKeys("FrankMartin");
//		
//		Thread.sleep(3000);
//			
//		testActions.doubleClick(inputField).perform();
//		
//		Thread.sleep(3000);
		
		/* Right Click Operation */
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html"); //using different website for RIGHT CLICK action
		
		Thread.sleep(3000);

		testActions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[.='Edit']")).click();
		
		Thread.sleep(3000);
		
		//Switching to Pop-up to click OK
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept(); 
		
		driver.quit();
		           
		
        }

}
