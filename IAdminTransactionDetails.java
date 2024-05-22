package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IAdminTransactionDetails {
	static WebDriver driver;

	public WebDriver transactiondetails() throws InterruptedException 
	{
		HAdminMerchantDetails merchantdetails1 = new HAdminMerchantDetails();
		driver=merchantdetails1.merchantdetails();
		
		Thread.sleep(3000);
		WebElement TransactionDetails=driver.findElement(By.xpath("//span[text()='Transaction Details ']"));
		TransactionDetails.click();                                                                             //Transaction
		driver=XScrollFunction.scrollmore(driver);
		Thread.sleep(5000);
		driver=XScrollFunction.scrollupmore(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@id=\"state_name\"]")).click();                               //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district_name\"]")).click();                            //district
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' DHARMAPURI ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='name_of_SHPI']")).click();                             //IA
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='trainers_Name']")).click();                            //Merchant name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' ANVARBASHA HARIP ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);

		driver=XScrollFunction.scroll(driver);	                                                                 //scroll page down 
		Thread.sleep(5000);
		driver=XScrollFunction.scrollup(driver);                                                                 //scroll page up 
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();                     //from date
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='FEB 2023']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()=' 2022 ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();                      //to date
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                      
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver= XScrollFunction.scroll(driver);                                                                    //scrolldown 
		Thread.sleep(3000);
		System.out.println("Transaction deatils viewed successfully");


		//merchantcode
		WebElement Merchantcode=driver.findElement(By.xpath("//input[@id='merchantCode']"));
		Merchantcode.sendKeys("AE33000003");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		driver=XScrollFunction.scroll(driver);                                                                     //scrolldown 
		Thread.sleep(3000);
		return driver;
	}

}
