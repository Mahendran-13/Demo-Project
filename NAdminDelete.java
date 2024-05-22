package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NAdminDelete {
	static WebDriver  driver;

	public WebDriver delete() throws InterruptedException 
	{
		MAdminCreate create1 = new MAdminCreate();
		driver=create1.create();
		
		Thread.sleep(3000);
		WebElement delete=driver.findElement(By.xpath("//span[text()='Delete '] "));
		delete.click();                                                                                             //delete
		Thread.sleep(3000);
		WebElement SHG=driver.findElement(By.xpath("//a[text()=' SHG / JLG Group ']"));
		SHG.click();                                                                                               //SHG
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"state\"]")).click();                                       //State
		Thread.sleep(5000);   
		driver.findElement(By.xpath("//span[text()=' PONDICHERRY ']")).click();                     
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district\"]")).click();                                    //district
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' KARAIKAL ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"shpi\"]")).click();                                        //IA
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' DEMO ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"animatorname\"]")).click();                                //Animator
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' PRABHU']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(5000);
		driver=XScrollFunction.scroll(driver);                                                                               //scroll up 
		Thread.sleep(6000);



	
		driver.findElement(By.xpath("//a[text()=' Member ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-select[@name='state']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' PONDICHERRY ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='district']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' KARAIKAL ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='shpi']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' DEMO ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='animatorname']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' PRABHU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);
		Thread.sleep(2000);
		return driver;


	}

}
