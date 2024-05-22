package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OAdminUnMapping {
	static WebDriver driver;

	public WebDriver unmapping ()throws InterruptedException 
	{
		NAdminDelete delete1 = new NAdminDelete();
		driver=delete1.delete();
		
		Thread.sleep(3000);
		WebElement unmapping=driver.findElement(By.xpath("//span[text()='Unmapping ']"));
		unmapping.click();                                                                                       //unmapping
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"state_name\"]")).click();                                //state
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' TAMIL NADU ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"district_name\"]")).click();                             //district 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' COIMBATORE ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"name_of_SHPI\"]")).click();                               //Ia
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' YESTEAM FOUNDATION ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id=\"merchantID\"]")).click();                                 //merchant
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' GOKUL KRISHNA M ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                          //submit
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);                                                                    //scroll page 
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[text()=' New request']")).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath("//span[text()='YES']")).click();
		System.out.println("User unmapped successfully");
		Thread.sleep(3000);
		return driver;

	}

}
