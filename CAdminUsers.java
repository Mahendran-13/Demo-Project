package com.anniyam.adminpanel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CAdminUsers {
	static WebDriver driver;


	public WebDriver users() throws InterruptedException 
	{
		BAdminDashboard dashboard1 = new BAdminDashboard();
		driver=dashboard1.dashboard();
		
		WebElement users=driver.findElement(By.xpath("//span[text()='User Registration ']"));
		users.click();
		Thread.sleep(2000);
		System.out.println("Users opened successfully");
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("mahen");                                            //first name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("TestER");                                            //last name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("mahen@anniyam.com");                                    //email
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9876543210");                                          //mobile number
		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@id=\"mat-select-value-1\"]")).click();                                                 //group name
		System.out.println("verified successfully");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Test Testing']")).click();                                                    //group name drop down
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id=\"mat-select-value-3\"]")).click();                                                 //role name
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Finding Issuess ']")).click();                                                // role name drop down
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-expansion-panel-header[@id=\"mat-expansion-panel-header-0\"]")).click();                //menu
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-panel-title[text()=' Automation ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-panel-title[text()=' Automation ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-expansion-panel-header[@id=\"mat-expansion-panel-header-0\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Register']")).click();
		Thread.sleep(3000);
		System.out.println("User has register successfully");
		Thread.sleep(3000);
		


		// clear

//		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"email\"]")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).clear();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//a[@id=\"Users\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("Jagatheeswari");                                    //firstname
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"lastName\"]")).sendKeys("Test");                                              //lastname
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("abctest@gmail.com");                                    //email
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@name=\"mobile\"]")).sendKeys("9786094689");                                          //mobile number
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@name=\"group\"]")).click();                                                     //group
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@id=\"input\"]")).sendKeys(" Field Staffs");                                          //group drop down 
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//span[text()=' FIELD STAFFS']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//mat-select[@id=\"roleId\"]")).click();                                                      //role
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()=' Zonal Manager ']")).click();                                             //role drop down 
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//mat-panel-title[text()=' Menu ']")).click();                                                //menu
//		Thread.sleep(3000);
//		System.out.println("Menu has been opened successfully");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//mat-panel-title[text()=' Users ']")).click();                                               //menu drop down 
//		Thread.sleep(3000);
//		driver=WScrollFunction.scroll(driver);                                                                                     //scroll page  
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//mat-panel-title[text()=' Ticket ']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//mat-panel-title[text()=' Ticket ']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//mat-panel-title[text()=' Users ']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//mat-panel-title[text()=' Menu ']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[text()='Register']")).click();
//		Thread.sleep(3000);
//		System.out.println("User register successfully");
		return driver;
	}
}


