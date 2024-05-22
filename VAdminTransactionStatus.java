package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VAdminTransactionStatus {
	static WebDriver driver;

	public WebDriver transactionstatus()  throws InterruptedException 
	{
		UAdminReports reports1 = new UAdminReports();
		driver=reports1.reports();
		
		Thread.sleep(3000);
		WebElement transactionstatus=driver.findElement(By.xpath("//span[text()='Transaction Status ']"));
		transactionstatus.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"merchantcode\"]")).sendKeys("AE33000003");                                 //merchantcode
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='servicetype']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Recharge ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"mintransactionvalue\"]")).sendKeys("100");                                 //min value
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"maxtransactionvalue\"]")).sendKeys("10000");                               //max value
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		System.out.println("Transaction status viewed successfully");



		driver=XScrollFunction.scroll(driver);                                                                                        //scroll up 

		//merchantcode
		WebElement merchantcode=driver.findElement(By.xpath("//input[@id=\"merchantId\"]"));
		merchantcode.sendKeys("AE33000003");                                                                                   //merchantcode
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(5000);
		driver=XScrollFunction.scroll(driver);                                                                                          //scrollpage 
		Thread.sleep(5000);
		return driver;

	}

}
