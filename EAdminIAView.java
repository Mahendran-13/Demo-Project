package com.anniyam.adminpanel;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EAdminIAView {
	static WebDriver driver;


	public WebDriver Iaview() throws InterruptedException 
	{
		DAdminViewTickets viewtickets1 = new DAdminViewTickets();
		driver=viewtickets1.viewticket();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement IAView=driver.findElement(By.xpath("//span[text()='IA View ']"));
		IAView.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//mat-select[@id=\"state_name\"]")).click();                                           //state 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district_name\"]")).click();                                        //district
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()=' COIMBATORE ']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                                    //submit icon
		Thread.sleep(4000);
		driver.findElement(By.xpath("//mat-icon[text()='edit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='conNo_CEO']")).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='conNo_CEO']")).sendKeys("9876543210");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()= ' Save']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Cancel']")).click();
		System.out.println("Ia view viewed successfully");
		//driver.findElement(By.xpath("//input[@id=\"mat-input-32\"]")).sendKeys("Testing");

		// Add icon

		WebElement IAAdd=driver.findElement(By.xpath("//span[text()='Add New ']"));
		IAAdd.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name_of_SHPI']")).sendKeys("Demo User");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//mat-select[@name='category']")).click();                                             //category
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[text()=' MULTIPURPOSE ']")).click();                                            //category data
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@name='reg_No']")).sendKeys("9876543210");                                     //Reg number
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();                                   //reg date
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' APR ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='state_name']")).click();                                                 //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='district_name']")).click();                                       //district
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' COIMBATORE ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("Test demo");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name_of_CEO']")).sendKeys("mahendran");                                  //ceo name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='conNo_CEO']")).sendKeys("9876543210");                                   //ceo con number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name_of_Secretary']")).sendKeys("Testing");                              //sec name
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);                                                                               //scroll page 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='name_of_MIS_Operator']")).sendKeys("Demo");                              //MIS operator
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='conNo_MIS_Operator']")).sendKeys("9786094689");                          //MIS contact number
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email_ID1_SHPI']")).sendKeys("mahendranvsm@gmail.com");                   //IA email 1
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email_ID2_SHPI']")).sendKeys("jaga.99@gmail.com");                        //IA email 2 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("TestIA");                                          //username                            //passvisible 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Anniyam@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("Anniyam@123");                            //confirmpassword
		Thread.sleep(5000);
		driver=XScrollFunction.scroll(driver);                                                                               //scroll page 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=' Payout Provision ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=' SHG Txn Commission ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=' NGO Name ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=' NGO Logo ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=' Member Name ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		System.out.println("Ia created successfully");
		return driver;

	}
}