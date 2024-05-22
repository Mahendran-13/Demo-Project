package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GAdminBankBranchDetails {
	static WebDriver driver;


	public WebDriver bankbranchdetails() throws InterruptedException 
	{
		FAdminIADetails Iadetails1 = new FAdminIADetails();
		driver=Iadetails1.Iadeatils();
		
		Thread.sleep(3000);
		WebElement BankBranchdetails=driver.findElement(By.xpath("//span[text()='Bank Branch Details ']"));
		BankBranchdetails.click();     
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Search ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("SBIN0007438");                  //user name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Search ']")).click();                                  //search button 
		Thread.sleep(3000);

		//or method 

		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		System.out.println("User type viewed successfully");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"stakeholderName\"]")).click();                      //stakeholder name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' BANKS ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"userLevel\"]")).click();                            //userlevel
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' HO ']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//mat-select[@id=\"state\"]")).click();                              //state
		//Thread.sleep(3000); 
		//driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);                                                              //scroll page 
		System.out.println("User name and password viewed successfully");
		Thread.sleep(2000);
		return driver;

	}

}
