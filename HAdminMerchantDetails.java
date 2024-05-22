package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HAdminMerchantDetails {
	static WebDriver driver;

	public WebDriver merchantdetails() throws InterruptedException 
	{
		GAdminBankBranchDetails bankbranchdetails1 = new GAdminBankBranchDetails();
		driver=bankbranchdetails1.bankbranchdetails();
		
		Thread.sleep(3000);
		WebElement MerchantDetails=driver.findElement(By.xpath("//span[text()='Merchant Details ']"));
		MerchantDetails.click();                                                                                     // merchant deatils
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                             //submit no
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"state\"]")).click();                                         // state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district_name\"]")).click();                                 //District
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' DHARMAPURI ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='name_of_SHPI']")).click();                                  //IA
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"merchantID\"]")).click();                                    //merchat id
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' BALAJI ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		System.out.println("Merchant deatils viewed successfully");



		//using merchant code 
		WebElement merchantcode=driver.findElement(By.xpath("//input[@id='merchantID']"));
		merchantcode.sendKeys("AE33000003");                                                                         //using merchant code 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		return driver;
		
	}

}
