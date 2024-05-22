package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAdminLogin {
	private static WebDriver driver;

	public WebDriver login() throws InterruptedException  
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://uatweb.anniyam.in/#/admin");
		System.out.println("URL launched successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='loginvalue2']")).sendKeys("abc@anniyam.com");                 //Invalid username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abc@123");                          //Invalid password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		System.out.println("User enter invaild user name and password");
		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@id='loginvalue2']")).sendKeys("abc@anniyam.com");                  //Invalid username
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);

		
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abc@123");                          //Invalid password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).clear();



		driver.findElement(By.xpath("//input[@id='loginvalue2']")).sendKeys("mahendran@anniyam.com");           //valid username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Anniyam@123");                      //valid password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[text()='visibility_off']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		System.out.println("User login successfully");
		return driver;
	}
}

