package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TAdminPayment {
	public static WebDriver driver;

	public WebDriver payment() throws InterruptedException 
	{
		SAdminPasswordReset passreset1 = new SAdminPasswordReset();
		driver=passreset1.passreset();
		
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Payment ']")).click();                                         //payment
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Add Account ']")).click();                                       //add account 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='beneficiaryName']")).sendKeys("Mahendran V");                  //beneficaryname
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='shortName']")).sendKeys("Mahendran");                          //short name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='bankName']")).sendKeys("Indian Bank");                         //bank name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='branchName']")).sendKeys("Karur");                             //branch name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='beneficiaryIFSC']")).sendKeys("IDIB000K027");                  //BeneIFSC
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='beneficiaryAccountNumber']")).sendKeys("50487839878");         //BeneAccount number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='maxLimit']")).sendKeys("1");                                   //max limit
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Karur");                             // address
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@name='rechargeNumber']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text()='Validate']")).click();                                          //manual validate OTP
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Proceed']")).click();
		Thread.sleep(3000);
		
		//logout user
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();                          //user profile
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Logout'])[2]")).click();                                      // logout
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='YES']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("jagatheeswari@anniyam.com");           //login another username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anniyam#123");                         //password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Payment ']")).click();                                         //payment
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Account Details ']")).click();                                   //Account details 
		Thread.sleep(5000); 
		//driver.findElement(By.xpath("(//mat-icon[text()='task_alt'])[1]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()='YES']")).click();                                              //approve request
		Thread.sleep(12000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[1]")).click();                          //userprofile
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Logout'])[2]")).click();                                      //Logout 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='YES']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("mahendran@anniyam.com");            //valid username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Anniyam@123");                       //valid password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[text()='visibility_off']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator mat-raised-button mat-button-base mat-primary\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Payment ']")).click();                                         //payment
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Make Payment ']")).click();                                      //make payment
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='accountNumber']")).click();                               //choose account 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Gokul - 500101011657688 ']")).click();                        //select account number
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='rechargeNumber']")).sendKeys("1");                              //Amount
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='debitAccnumber']")).click();                               //Debit acc n/o
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' 069263400002577 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='transferType']")).clear();                                 //transfer mode
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='IMPS']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='remarks']")).sendKeys("Testing");                            //remarks
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Pay ']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[text()=' Validate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Proceed']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='Payment ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Report  ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='accountnumber']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Gokul - 500101011657688 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@aria-label='Previous month']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);
		Thread.sleep(3000);
		return driver;
	}
}
