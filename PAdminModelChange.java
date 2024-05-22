package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PAdminModelChange {
	static WebDriver driver;

	public WebDriver modelchange() throws InterruptedException 
	{
		OAdminUnMapping unmapping1 = new OAdminUnMapping();
		driver=unmapping1.unmapping();
		
		Thread.sleep(3000);
		WebElement ModelChange=driver.findElement(By.xpath("//span[text()='Model Change ']"));
		ModelChange.click();                                                                              //model change
		Thread.sleep(5000);                                          
		driver.findElement(By.xpath("//mat-select[@id=\"state\"]")).click();                             //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district\"]")).click();                          //district
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' KARUR ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"ia\"]")).click();                                //IA
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"merchant\"]")).click();                          //merchant
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' MAHENDRAN V ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                 //click
		Thread.sleep(5000);
		driver=XScrollFunction.scroll(driver);                                                           //scroll page                         
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='New Request ']")).click();                 //add new
		Thread.sleep(4000);
		driver.findElement(By.xpath("//mat-select[@name='changemodel']")).click();                       //new model
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Premium ']")).click();                              //new model drop down 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Change Model']")).click();                           //change model 
		System.out.println("User model change successfully");
		Thread.sleep(3000);
		return driver;
	}

}
