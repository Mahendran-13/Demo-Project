package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MAdminCreate {
	static WebDriver driver;

	public WebDriver create() throws InterruptedException 
	{
		LAdminMerchantTopUP merchant1 = new LAdminMerchantTopUP();
		driver=merchant1.merchanttopup();
		
		Thread.sleep(3000);
		WebElement create=driver.findElement(By.xpath("//span[text()='Create ']"));
		create.click();                                                                                        //create
		Thread.sleep(3000);
		
		WebElement bankbranch=driver.findElement(By.xpath("//a[text()=' Bank Branch ']"));
		bankbranch.click();                                                                                    //Bank Branch
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"state\"]")).click();                                   //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district\"]")).click();                                //distict
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' COIMBATORE ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='bank_agency']")).click();                             //bank type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' COMMERCIAL ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='bank']")).click();                                    //bank
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='bank-panel']")).sendKeys("Indian Bank");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' INDIAN BANK ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"brancH_NAME\"]")).sendKeys("Roja Nagar");                   //branchname
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"ifsC_CODE\"]")).sendKeys("IDIB000K027");                    //ifsc 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"contact\"]")).sendKeys("9876543210");                       //mobile number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//span[text()='Create ']")).click();
		Thread.sleep(2000);
		WebElement panchayat=driver.findElement(By.xpath("//a[text()=' Panchayat ']"));
		panchayat.click();                                                                                        //panchayat
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"state_name\"]")).click();                                 //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district_name\"]")).click();                               //district
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' COIMBATORE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"block_name\"]")).click();                                    //block name
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()=' KARAMADAI']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\" village_panchayat_name\"]")).sendKeys("Thudiyalur");      //panchayat
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"village_name\"]")).sendKeys("Thendral nagar");             //village name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		System.out.println("Panchayat created successfully");
		Thread.sleep(5000);

		
		driver.findElement(By.xpath("//span[text()='Create ']")).click();
		Thread.sleep(2000);
		WebElement village=driver.findElement(By.xpath("//a[text()=' Village ']"));
		village.click();                                                                                  //village
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"state_name\"]")).click();                        //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district_name\"]")).click();                     //district
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' COIMBATORE']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"block_name\"]")).click();                        //block name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' KARAMADAI']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"village_panchayat_name\"]")).click();            //panchayat
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[text()=' BELLATHI']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"village_name\"]")).sendKeys("mohan nagar1");           //village
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		System.out.println("Village  created successfully");
		return driver;
	}

}
