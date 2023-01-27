package com.SeleniumPractice2023;

import java.time.Duration;
import java.time.Instant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class PageLoadTimeOut {

	

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);// Defining PageLoad timeoout	
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
		
		driver.manage().window().maximize();
		
		Instant startTime = Instant.now(); //Capturing Current time before website load
		
		System.out.println(startTime.toString()); // Printing the current time in String format
		
		driver.get("https://www.royalmansour.com/");

		Instant endTime = Instant.now(); //Capturing current time after website load
		
		System.out.println(endTime.toString());
		
		Duration testDuration = Duration.between(startTime, endTime); //Finding time Duration
		
		System.out.println("PageLoad Time : "+testDuration.toMillis()+ " Milli Seconds ");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}
