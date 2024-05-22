package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WAdminUserProfile {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		VAdminTransactionStatus transactionstatus1 = new VAdminTransactionStatus();
		driver=transactionstatus1.transactionstatus();

		//driver=VAdminTransactionStatus.transactionstatus();
		Thread.sleep(4000);
		WebElement username=driver.findElement(By.xpath("//span[text()='Mahendran V']"));
		username.click();
		Thread.sleep(3000);
		WebElement editprofile=driver.findElement(By.xpath("//span[text()='Edit Profile']"));
		editprofile.click();                                                                                                             //edit profile
		Thread.sleep(3000);
		WebElement save=driver.findElement(By.xpath("//span[text()=' Save']"));
		save.click();                                                                                                                    //save
		Thread.sleep(3000);


		driver.findElement(By.xpath("//span[text()='Mahendran V']")).click();                                                            //profile
		Thread.sleep(3000);
		WebElement Logout=driver.findElement(By.xpath("//span[text()='Logout']"));
		Logout.click();                                                                                                                  //logout
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='YES']")).click();
		System.out.println("User logout successfully");
		Thread.sleep(3000);

		//driver.get("https://uatweb.anniyam.in/#/admin");
		WebElement Username =driver.findElement(By.xpath("//input[@name='username']"));
		Username.sendKeys("mahendran@anniyam.com");                                                                                    //valid username
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Anniyam@1234");                                                                                              //valid password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[text()='visibility_off']")).click();
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//span[text()='Login']"));
		submit.click();
		Thread.sleep(3000);



		driver.findElement(By.xpath("//span[text()='Mahendran V']")).click();                                                             //profile
		Thread.sleep(3000);
		WebElement changepassword=driver.findElement(By.xpath("//span[text()='Change Password']"));
		changepassword.click();


		//change password
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"oldPassword\"]")).sendKeys("Anniyam@1234");                                             //oldpassword
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Anniyam@123");                                               //new password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"confirmPassword\"]")).sendKeys("Anniyam@123");                                        //confirm password
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=' Reset']")).click();
		Thread.sleep(3000);
		System.out.println("User change password successfully");

		driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys("mahendran@anniyam.com");                                                                                    //valid username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Anniyam@123");                                                                                              //valid password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Mahendran V']")).click();                                                                                                                 //profile
		Thread.sleep(3000);
		WebElement logout=driver.findElement(By.xpath("//span[text()='Logout']"));
		logout.click();                                                                                                                    //logout
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='YES']")).click();
		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@id=\"mat-input-0\"]")).sendKeys("mahendran@anniyam.com");                                                                                    //valid username
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Anniyam@123");                                                                                              //valid password
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[text()='visibility_off']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"mat-focus-indicator mat-raised-button mat-button-base mat-primary\"]")).click();
		Thread.sleep(3000);
	}                                    

}
