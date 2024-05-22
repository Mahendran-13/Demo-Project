package com.anniyam.adminpanel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class XScrollFunction {
	public static WebDriver driver;
	
	
	public static WebDriver scroll(WebDriver driver) throws InterruptedException {
	    Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,800)", "");
	    Thread.sleep(3000);
		return driver;
	}
	
	
		public static WebDriver scrollmore(WebDriver driver)
		{
			JavascriptExecutor executor1= (JavascriptExecutor)driver;                                                                   //for half of the page
			executor1.executeScript("window.scroll(0,1200)", "");
			return driver;
			
		}
		public static WebDriver scrollup(WebDriver driver) throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("window.scrollBy(0,-800)", "");
		    Thread.sleep(3000);
			return driver;
		}
		public static WebDriver scrollupmore (WebDriver driver)
		{
			JavascriptExecutor executor1= (JavascriptExecutor)driver;                                                                   //for half of the page
			executor1.executeScript("window.scroll(0,-1200)", "");
			return driver;
		}
	

}
