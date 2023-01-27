package com.SeleniumPractice2023;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestScreenshots {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();    // Using ChromeDriver instead of WebDriver
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		
		
		/* 1. Taking screenshot as FILE */
		
//		File sourceFile = driver.getScreenshotAs(OutputType.FILE); // Returns screenshot as RAW data (FILE format) and storing in a variable using FILE class
//		
//		File destFile = new File("./Screenshots/img1.jpg"); // Providing the Path and Screenshot type. Ex: JPG 
//		
//		FileUtils.copyFile(sourceFile, destFile); //Storing the screenshot in provided folder path
//		 
//		System.out.println(" Screenshots saved successfully! ");
		
		
		/* 2. Taking screenshot as BYTE */
				
//		byte[] byteArr = driver.getScreenshotAs(OutputType.BYTES); 
//		
//		File destFile = new File("./Screenshots/img1.jpg"); 
//
//		FileOutputStream fos = new FileOutputStream(destFile);
//		
//		fos.write(byteArr); 
//		
//		fos.close();  //Closing File output stream		
//
//		System.out.println(" Screenshots saved successfully! ");
		
		
		/* 3. Taking screenshot as BASE64.  */
		
		String base64Test = driver.getScreenshotAs(OutputType.BASE64); //Base64 is a encoded string
		
		byte[] byteArr = Base64.getDecoder().decode(base64Test); // converting encoded string to BYTE
		
		File destFile = new File("./Screenshots/img1.jpg"); 

		FileOutputStream fos = new FileOutputStream(destFile);
		
		fos.write(byteArr); 
		
		fos.close();  //Closing File output stream		

		System.out.println(" Screenshots saved successfully! ");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
