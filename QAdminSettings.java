package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QAdminSettings {
	static WebDriver driver;

	public WebDriver settings() throws InterruptedException
	{
		PAdminModelChange modelchange1= new PAdminModelChange();
		driver=modelchange1.modelchange();
		
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);                                                                                // scroll page 
		Thread.sleep(3000);
		WebElement Settings=driver.findElement(By.xpath("//span[text()='Settings ']"));
		Settings.click();                                                                                                     //settings
		Thread.sleep(3000);
		WebElement group=driver.findElement(By.xpath("//a[text()=' Group ']"));
		group.click();                                                                                                        //group
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Add New ']")).click();                                                    //Addnew
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\"groupname\"]")).sendKeys("Testing Staff");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		System.out.println("Group created sucessfully");
		Thread.sleep(3000);


		driver=XScrollFunction.scrollmore(driver);                                                                            // scroll page 
		Thread.sleep(3000);
		WebElement Role=driver.findElement(By.xpath("//a[text()=' Role ']"));
		Role.click();                                                                                                         //select role
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Add New ']")).click();                                                   //add new
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='groupname']")).click();                                                //groupname 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Testing Staff ']")).click();                                             //groupname dropdown
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='rolename']")).sendKeys("Testing");                                          //add new role
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                                      //submit
		Thread.sleep(3000);
		System.out.println("Role created successfully");


		driver=XScrollFunction.scrollmore(driver);                                                                            //scroll page 
		Thread.sleep(3000);

		WebElement parentmenu=driver.findElement(By.xpath("//a[text()=' Parent Menu ']"));
		parentmenu.click();                                                                                                   //select parent menu
		Thread.sleep(4000); 
		driver.findElement(By.xpath("//span[text()=' Add New ']")).click();                                                   //add new role
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='groupName']")).click();                                                //select parent menu
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Testing Staff ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='parentMenuName']")).sendKeys("Demo user");                                  //parentmenu
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		System.out.println("Parent menu created successfully");

		driver=XScrollFunction.scrollmore(driver);                                                                            //scroll page 
		Thread.sleep(3000);
		WebElement menu=driver.findElement(By.xpath("//a[text()=' Menu ']"));
		menu.click();                                                                                                         //menu
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()=' Add New ']")).click();                                                   //Addnew
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='groupName']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Testing Staff ']"));                                                    //groupname dropdown 
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//mat-select[@id='parentMenuName']")).click();                                          //parentmenu
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Demo user ']")).click();                                                //parentmenudrop down
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='masterMenuName']")).sendKeys("Automation ");                               //menuname                    
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='navigationUrl']")).sendKeys("Admins");                                     //navigationurl
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='iconName']")).sendKeys("panels");                                          //icon name                         
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                                     //submit
        Thread.sleep(3000);

		driver=XScrollFunction.scrollmore(driver);                                                                           //scroll page 
		Thread.sleep(3000);
		WebElement menuorder=driver.findElement(By.xpath("//a[text()=' Menu order ']"));
		menuorder.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='roleGroupId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Testing Staff']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);


		driver=XScrollFunction.scrollmore(driver);                                                                         //scroll page 
		Thread.sleep(3000);
		WebElement assignmenu=driver.findElement(By.xpath("//a[text()=' Assign Menu ']"));
		assignmenu.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Testing Staff ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='roleId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Testing ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-panel-title[text()=' Master menu ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-panel-title[text()=' Demo user ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-panel-title[text()=' Demo user ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-panel-title[text()=' Master menu ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		return driver;

	}

}
