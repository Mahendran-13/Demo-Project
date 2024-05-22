package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SAdminPasswordReset {
	static WebDriver driver;


	public WebDriver passreset() throws InterruptedException 
	{
		RAdminStatement statement1= new RAdminStatement();
		driver=statement1.statement();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Password Reset ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mahendran@anniyam.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		return driver;
	}
}

