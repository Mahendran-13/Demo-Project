package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BAdminDashboard {
	static WebDriver driver;

	public WebDriver dashboard()  throws InterruptedException 
	{
		AAdminLogin login1= new AAdminLogin();
		driver= login1.login();
		
		Thread.sleep(5000);
		WebElement dashboard= driver.findElement(By.xpath("//span[text()='Dashboard ']"));
		dashboard.click();                                                                                              //dashboard 
		Thread.sleep(3000);
		return driver;
	}

}