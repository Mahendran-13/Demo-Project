package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LAdminMerchantTopUP {
	static WebDriver driver;

	public WebDriver merchanttopup() throws InterruptedException  
	{
		KAdminRecharge recharge1 = new KAdminRecharge();
		driver=recharge1.recharge();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Merchant TopUp ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='merchantCode']")).sendKeys("AE33001207");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='maxLimit']")).sendKeys("1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='beneficiaryAccountNumber']")).sendKeys("TEST2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Proceed']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(3000);
		return driver;
		

	}

}
