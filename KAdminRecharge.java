package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KAdminRecharge {
	static WebDriver driver;


	public WebDriver recharge() throws InterruptedException 
	{
		JAdminFundTransfer fundtransfer1 = new JAdminFundTransfer();
		driver=fundtransfer1.fundtransfer();
		
		Thread.sleep(3000);
		WebElement recharge=driver.findElement(By.xpath("//span[text()='Recharge ']"));
		recharge.click();                                                                                  //recharge
		Thread.sleep(3000);
		WebElement walletbalance=driver.findElement(By.xpath("//a[text()=' Balance ']"));
		walletbalance.click();                                                                             //wallet balance
		Thread.sleep(4000);
		System.out.println("Wallet Balance viewed successfully");
		Thread.sleep(3000);
		
		WebElement samplerecharge=driver.findElement(By.xpath("//a[text()=' Sample Recharge ']"));
		samplerecharge.click();                                                                            //sample recharge
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"rechargeNumber\"]")).sendKeys("9786094689");            //mobile number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='location']")).click();                            //location
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Tamilnadu ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='provider']")).click();                            //provider
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()=' Vi ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		System.out.println("Sample Recharged successfully");
		return driver;	

	}

}
