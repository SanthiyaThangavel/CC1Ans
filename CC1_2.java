package com.example.dayone.testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CC1_2{
	WebDriver driver;

	  @BeforeTest
	  public void beforeTest() {
	 driver=new FirefoxDriver();
	  }

	  @Test
	  public void Test1() throws InterruptedException {
	 String url="https://www.saucedemo.com/";
	 driver.get(url);
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 System.out.println("opened");
	driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	Thread.sleep(5000);

	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[1]")).click();
	WebElement az1=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
	String taz1=az1.getText();
	System.out.println(taz1);

	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
	WebElement az2=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
	String taz2=az2.getText();
	System.out.println(taz2);

	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
	WebElement az3=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	String taz3=az3.getText();
	System.out.println(taz3);

	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
	WebElement az4=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	String taz4=az4.getText();
	System.out.println(taz4);


	  }
	 
	  @AfterTest
	  public void afterTest() throws InterruptedException {
	 Thread.sleep(2000);
	 driver.quit();
	  }
}