package com.example.dayone.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CC1_1 {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
    	WebDriver driver = new EdgeDriver();
    	driver.get("https://www.saucedemo.com/");
    	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
    	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce",Keys.ENTER);
    	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    	driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("standard_");
    	driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("user");
    	driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("686238");
    	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		String cart = driver.getCurrentUrl();
		if(cart.equals("https://www.saucedemo.com/cart.html"))
			System.out.println("The cart can be viewed");
		driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		Thread.sleep(2000);
		String check = driver.getCurrentUrl();
		if(check.equals("https://www.saucedemo.com/checkout-step-one.html"))
			System.out.println("Your Information page was opened and checked");
    	String bill = driver.getCurrentUrl();
		if(bill.equals("https://www.saucedemo.com/checkout-step-two.html"))
			System.out.println("Product overview was checked as it is displayed");
		System.out.println("Name: "+driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText());
		System.out.println("Price: "+driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText());
		
		
		String url2 = driver.getCurrentUrl();
		if(url2.equals("https://www.saucedemo.com/checkout-step-two.html"))
			System.out.println("Url is Correct as given");
		else
			System.out.println("Url is Wrong ");
		
		String title = driver.getTitle();
		if(title.equals("Swag Labs"))
			System.out.println("Title is Correct");
		else
			System.out.println("Title is Wrong");
		Thread.sleep(1000);
		driver.quit();
    	
	}

}
