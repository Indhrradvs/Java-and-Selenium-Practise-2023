package com.SwagLabs.selenium.SwagLabsApplication;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlacingOrder {

	public static void main(String[] args) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.manage().window().maximize();
		
	driver.get("https://www.saucedemo.com/");
	
	Thread.sleep(3000);
		
	// Login Screen
	
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	
	driver.findElement(By.id("login-button")).click();
	
	Thread.sleep(3000);
	
	/* Home Screen */
	
	//Step 1: Perform Sorting
	
	WebElement sorting = driver.findElement(By.className("product_sort_container"));

	Select sortValue = new Select(sorting);

	List<WebElement> sortSelect = sortValue.getOptions();

	for (WebElement options : sortSelect) {

		System.out.println(options.getText()); // Printing all the values in the dropdown

	}

	sortValue.selectByValue("lohi");
	
	
	//Step 2: Opening each item and adding to cart
	
	driver.findElement(By.id("item_5_title_link")).click(); 
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		
	driver.findElement(By.id("back-to-products")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	
	System.out.println("User on Cart Page");
	
    Thread.sleep(3000);
	
	//Step 3: Checkout Proccess
	
	driver.findElement(By.id("checkout")).click(); //Clicked on Checkout button
	
	driver.findElement(By.id("first-name")).sendKeys("Frank"); // Entering First Name
	
	driver.findElement(By.id("last-name")).sendKeys("Martin"); // Entering Last Name
	
	driver.findElement(By.id("postal-code")).sendKeys("22031"); // Entering Zipcode
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("continue")).click(); // Clicked on Continue button
	
	Thread.sleep(3000);
	
	System.out.println(" Final Overview screen ");
	
	Thread.sleep(3000);
	
	//Step 4: Finalizing Order
	
	driver.findElement(By.id("finish")).click(); 
	
	System.out.println(" Order Placed Successfully!");
	
	Thread.sleep(3000);
	
	driver.quit();
	
	}

}
