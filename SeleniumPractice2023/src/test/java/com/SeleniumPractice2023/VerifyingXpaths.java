package com.SeleniumPractice2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyingXpaths {

	public static void main(String[] args) throws Exception {
		
						
				WebDriverManager.chromedriver().setup();

				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();

				driver.get(" https://www.hyrtutorials.com/p/window-handles-practice.html ");

				Thread.sleep(15000);
				
			    driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
									
				Thread.sleep(3000);
				
				driver.quit();

	}

}
