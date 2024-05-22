package com.anniyam.adminpanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RAdminStatement {
	static WebDriver driver;

	public WebDriver statement() throws InterruptedException 
	{
		QAdminSettings settings1= new QAdminSettings();
		driver=settings1.settings();

		Thread.sleep(3000);
		WebElement statement=driver.findElement(By.xpath("//span[text()='Statement ']"));
		statement.click();                                                                                                        //statement
		Thread.sleep(3000);
		WebElement SHGandPayout=driver.findElement(By.xpath("//a[text()=' SHG and Payout ']"));
		SHGandPayout.click();                                                                                                     //SHG and Payout
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='type']")).click();                                                       //service type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' All ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fromDate']")).click();                                                        //fromdate click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                               //fromdate end
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='toDate']")).click();                                                           //todate click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' 25 ']")).click();
		Thread.sleep(2000);
		driver=XScrollFunction.scrollmore(driver);                                                                                //scroll page 
		Thread.sleep(5000);
		driver=XScrollFunction.scrollupmore(driver);                                                                              // scroll page up 


		Thread.sleep(2000);
		WebElement DMT=driver.findElement(By.xpath("//a[text()=' DMT ']"));
		DMT.click();                                                                                                               //DMT
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fromDate']")).click();                                                        //fromdate click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                              //fromdate end                                          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='toDate']")).click();                                                          //todate click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                                          //submit 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' 25 ']")).click();
		Thread.sleep(2000);
		driver=XScrollFunction.scrollmore(driver);                                                                                 //scroll page 
		Thread.sleep(3000);
		driver=XScrollFunction.scrollupmore(driver);                                                                                //scroll page up 

		Thread.sleep(3000);
		WebElement BBPS=driver.findElement(By.xpath("//a[text()=' BBPS ']"));
		BBPS.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='transstartdate']")).click();                                                    //fromdate click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                              //fromdate end                                          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='transenddate']")).click();                                                    //todate click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                                          //submit 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' 25 ']")).click();
		Thread.sleep(2000);
		driver=XScrollFunction.scrollmore(driver);                                                                                 //scroll page 
		Thread.sleep(3000);
		driver=XScrollFunction.scrollupmore(driver);                                                                                //scroll page up 

		Thread.sleep(3000);
		WebElement recharge=driver.findElement(By.xpath("//a[text()=' Recharge ']"));
		recharge.click();                                                                                                          //recharge
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='transstartdate']")).click();                                                  //fromdate click     
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                              //fromdate end                                          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='toDate']")).click();                                                          //todate click
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                                          //submit 
		Thread.sleep(6000);
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' 25 ']")).click();
		Thread.sleep(2000);
		driver=XScrollFunction.scrollmore(driver);                                                                                 //scroll page 
		Thread.sleep(3000);
		driver=XScrollFunction.scrollupmore(driver);   

		Thread.sleep(3000);
		WebElement AePSandMATM=driver.findElement(By.xpath("//a[text()=' AePS and MATM ']"));
		AePSandMATM.click();                                                                                                       //AePS and MATM
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@id='type']")).click();                                                         //service type
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' AePS ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fromdate']")).click();                                                        //fromdate start
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                              //fromdate end                                          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='todate']")).click();                                                          //todate start
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' 25 ']")).click();
		Thread.sleep(2000);
		driver=XScrollFunction.scrollmore(driver);                                                                                 //scroll page 
		Thread.sleep(3000);
		driver=XScrollFunction.scrollupmore(driver);

		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()=' Wallet History ']")).click();                                                                                             //wallet history
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='transstartdate']")).click();                                                  //fromdate start
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' MAY ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                              //fromdate end                                          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='toDate']")).click();                                                          //todate start
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' 25 ']")).click();
		Thread.sleep(2000);
		driver=XScrollFunction.scrollmore(driver);                                                                                 //scroll page 
		Thread.sleep(3000);
		driver=XScrollFunction.scrollupmore(driver);

		Thread.sleep(3000);
		WebElement WalletDetails=driver.findElement(By.xpath("//a[text()=' Wallet Details ']"));
		WalletDetails.click();                                                                                                //walletinformation
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fromdate']")).click();                                                        //fromdate 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' MAR ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                              //fromdate end                                          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='today']")).click();                                                           //todate start
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                                          //submit 
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' 25 ']")).click();
		Thread.sleep(2000);
		driver=XScrollFunction.scrollmore(driver);                                                                                 //scroll page 
		Thread.sleep(3000);
		driver=XScrollFunction.scrollupmore(driver);

		Thread.sleep(3000);
		WebElement WalletTopup=driver.findElement(By.xpath("//a[text()=' Wallet Topup ']"));
		WalletTopup.click();                                                                                                        //wallet topup
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fromdate']")).click();                                                          //fromdate start
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' MAR ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                                                                          
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='today']")).click();                                                           //fromdate end
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='5']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=' 25 ']")).click();
		Thread.sleep(2000);
		driver=XScrollFunction.scrollmore(driver);                                                                                 //scroll page 
		Thread.sleep(3000);
		driver=XScrollFunction.scrollupmore(driver);

		Thread.sleep(3000);
		WebElement WalletIncentive=driver.findElement(By.xpath("//a[text()=' Wallet Incentive ']"));
		WalletIncentive.click();                                                                                                     //wallet incentive
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fromdate']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' MAR ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                                                                        
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='today']")).click();                                                                //fromdate end
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();                                                               //submit
		Thread.sleep(3000);
		driver=XScrollFunction.scrollmore(driver);
		Thread.sleep(5000);
		driver=XScrollFunction.scrollupmore(driver);


		driver.findElement(By.xpath("//a[text()=' PAN ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fromdate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' MAR ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                                                                        
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='today']")).click();                                                                //fromdate end
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click(); 
		Thread.sleep(3000);


		driver.findElement(By.xpath("//a[text()=' Digital Gold ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='fromdate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2023 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' MAR ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();                                                                                                        
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='today']")).click();                                                                //fromdate end
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click(); 
		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[text()=' Wallet Balance ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='state_name']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' PONDICHERRY ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='district_name']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' KARAIKAL ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='name_of_SHPI']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' DEMO ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@name='trainers_Name']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Prabhu ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='mat-button-wrapper'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='AUG 2023']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 2022 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' JAN ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='toDate']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()=' 1 ']")).click();
		Thread.sleep(3000);
		driver=XScrollFunction.scroll(driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Submit']")).click();
		Thread.sleep(3000);
		driver=XScrollFunction.scrollmore(driver);

		return driver;

	}

}
