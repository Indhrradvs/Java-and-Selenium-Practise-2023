package com.SeleniumPractice2023;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCalanders {

	public static void main(String[] args) throws Exception {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
//		/* if we mention in INT value then in future if we change the date then Automatically selects 
//		  the provided date. instead of changing the code, we can change here */
		
//		int date = 4; 
		
		// First Calendar
	
//		driver.findElement(By.id("first_date_picker")).click();
		
//		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()= "+date+"]")).click(); //Define INT variable name in X-path
	
		
		// Second Calendar
		
//		driver.findElement(By.id("second_date_picker")).click();

//		Thread.sleep(3000);

//		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month'))]/a[text()="+date+"]")).click();
		
		/*  Method-1: Validating user entered DATE is correct of not */
		
		String targetDate = "25/feb/2018";  // Dates needs to be adjusted as per PAST or FUTURE
		
//		SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy"); // defining Date Format. It will change along with the date entered in above statement
		
		/* if we don't set Lenient to FALSE then Java won't return error message if we provide the wrong date. 
		 
		 Ex: if we give FEB 30 then it will display as MAR 2. To stop this we use Lenient */
		
//		targetDateFormat.setLenient(false); 
		
//		Date formattedTargetDate = targetDateFormat.parse(targetDate);  // Converting the Date to above provided format
		 				
		
		/* Method-2. If we want to print our custom message */
		
		Calendar calendar = Calendar.getInstance();  //Creating Calendar instance. I.e instance created with today's time & Date
		
		try {

			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");

			targetDateFormat.setLenient(false);

			Date formattedTargetDate = targetDateFormat.parse(targetDate);

			calendar.setTime(formattedTargetDate); // Calendar got set with Target Date

		} catch (Exception e) {

			throw new Exception(" Invalid Date is povided, Please check the input date..!! ");
		}
			
			int targetMonth = calendar.get(Calendar.MONTH); // From the TargetDate retreiving MONTH
			
			int targetYear = calendar.get(Calendar.YEAR); // From the TargetDate retreiving YEAR
			
			int targetDay = calendar.get(Calendar.DAY_OF_MONTH); // From the TargetDate retreiving Day
					 	
		
			driver.findElement(By.id("first_date_picker")).click();
			
			
			// Feb 2023
			 	 
			String currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();

			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate)); 

			int currentMonth = calendar.get(Calendar.MONTH); 

			int currentYear = calendar.get(Calendar.YEAR); 
			
			
			
			// To Select Future date by clicking on Next button
			
			while (currentMonth < targetMonth || currentYear < targetYear) {
				
				driver.findElement(By.className("ui-datepicker-next")).click();
				
				currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();

				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate)); 

				currentMonth = calendar.get(Calendar.MONTH); 

				currentYear = calendar.get(Calendar.YEAR); 
				
			}
			
			// To Select Past date by clicking on Next button
			
			while (currentMonth > targetMonth || currentYear > targetYear) {

				driver.findElement(By.className("ui-datepicker-prev")).click();

				currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();

				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));

				currentMonth = calendar.get(Calendar.MONTH);

				currentYear = calendar.get(Calendar.YEAR);

			}
			
			if(currentMonth == targetMonth && currentYear == targetYear)
			
			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()= "+targetDay+"]")).click(); 
			
			else throw new Exception(" Unable to select the date beacuse of Target and Current Dates mismatch ");
			
		
	}
	
}

