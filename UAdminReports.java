package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UAdminReports {
	public static WebDriver driver;


	public WebDriver reports () throws InterruptedException
	{
		TAdminPayment payment1 = new TAdminPayment();
		driver=payment1.payment();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Reports ']")).click();                                     //Reports
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Group Count ']")).click();                                   //Group count
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='state_name']")).click();                              //state name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' PONDICHERRY ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                       //submit
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='state_name']")).click();                               //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' PONDICHERRY ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='district_name']")).click();                            //district
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' KARAIKAL ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='name_of_SHPI']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' DEMO ']")).click();                                         //IA name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                         //submit
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);
		Thread.sleep(3000);



		driver.findElement(By.xpath("//a[text()=' Savings & Loans ']")).click();                                  //savings and loans 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='state_name']")).click();                                 //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' PONDICHERRY ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                          //submit
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='state_name']")).click();                                  //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' PONDICHERRY ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='district_name']")).click();                                //district   
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' KARAIKAL ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='name_of_SHPI']")).click();                                 //IA name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' DEMO ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                            //submit 
		Thread.sleep(3000);

		return driver;

	}

}
