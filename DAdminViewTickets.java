package com.anniyam.adminpanel;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DAdminViewTickets {
	static WebDriver driver;

	
	public WebDriver viewticket() throws InterruptedException  
	{
		CAdminUsers users1= new CAdminUsers();
		driver=users1.users();
		
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='View Tickets ']")).click();
		Thread.sleep(10000);
		WebElement Viewtickets=driver.findElement(By.xpath("//mat-select[@id=\"serviceType\"]"));
		Viewtickets.click();
		Thread.sleep(10000);
		WebElement type=driver.findElement(By.xpath("//span[text()=' eKYC']"));
		type.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-mat-calendar='mat-datepicker-0']")).click();                 //from date
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();                                
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()=' 2022 ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();                                          //month field
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                            // from date field
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@data-mat-calendar='mat-datepicker-1']")).click();                 //to date
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                            // to date field
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"status\"]")).click();                                   //status
		Thread.sleep(3000); 
		driver.findElement(By.xpath("(//span[text()='Close'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);                                                                     //scroll page 
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//mat-icon[text()=' add_comment'])[1]")).click();                          // adding comment for tickets 
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//mat-label[text()='Comments']")).sendKeys("test");
		Thread.sleep(3000);
		System.out.println("User view the Ticket successfully");
		return driver;


	}

}
