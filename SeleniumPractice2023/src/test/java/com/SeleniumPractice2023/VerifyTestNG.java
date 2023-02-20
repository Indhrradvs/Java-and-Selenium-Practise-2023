package com.SeleniumPractice2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTestNG {

	WebDriver driver = null;
	
	@BeforeTest
	public void SetUp() {
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void googleSearch() throws Exception {
		
        driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("tosca testing");
		
		driver.findElement(By.name("btnK")).click();
		
		driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]")).click();
		
	}

	@AfterTest	
	public void tearDown() {
		
		driver.quit();

		System.out.println("Tests Executed Successfully!");

	}
}
