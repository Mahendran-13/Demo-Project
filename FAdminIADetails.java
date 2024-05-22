package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FAdminIADetails {
	static WebDriver driver;


	public WebDriver Iadeatils() throws InterruptedException 
	{
		EAdminIAView Iaview1 = new EAdminIAView();
		driver=Iaview1.Iaview();
		
		WebElement Iadetails=driver.findElement(By.xpath("//span[text()='IA Details ']"));
		Iadetails.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"state_name\"]")).click();                       //state name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//mat-select[@id=\"district_name\"]")).click();                    //district name
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' COIMBATORE ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='name_of_SHPI']")).click();                   //IA name
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()=' TESTING '])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                 //submit
		Thread.sleep(3000);
		System.out.println("Ia details viewed successfully");
		return driver;

	}

}
