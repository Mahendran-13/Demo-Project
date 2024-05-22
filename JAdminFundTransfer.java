package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JAdminFundTransfer {
	static WebDriver driver;

	public WebDriver fundtransfer() throws InterruptedException 
	{
		IAdminTransactionDetails transactiondetails1 = new IAdminTransactionDetails();
		driver=transactiondetails1.transactiondetails();
		
		Thread.sleep(3000);
		WebElement FundTransfer=driver.findElement(By.xpath("//span[text()='Fund Transfer ']"));
		FundTransfer.click();                                                                                  //Fund Transfer
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Balance ']")).click();                                      //Balance
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"accountNumber\"]")).click();                          //Account number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' 069263400002577 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(4000);
		System.out.println("Balance viewed successfully");
		
		WebElement statement=driver.findElement(By.xpath("//a[text()=' Statement ']"));
		statement.click();                                                                                    //Statement
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"accountnumber\"]")).click();                          //accountnumber
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' 069263400002577 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();                     //start date
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label=\"Previous month\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[4]")).click();                     //end date
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                            // to date filed
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(4000);
		System.out.println("Account statement viewed successfully");



		WebElement Pennydrop=driver.findElement(By.xpath("//a[text()=' Penny Drop ']"));
		 Pennydrop.click();                                                                                 //penny drop
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"accountNumber\"]")).click();                         //Account number
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[text()=' 069263400002577 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		return driver;	
	}
}