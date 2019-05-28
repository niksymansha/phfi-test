package com.phfi.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputPageObject {

	
		
		public static WebElement element=null;
		
		public static WebElement btn_input(WebDriver driver)
		{
			WebElement element=driver.findElement(By.xpath("//input[contains(@value,'Input')]"));
			if(element.isEnabled())
				System.out.println("Button Enabled");
			else
				System.out.println("Button Failed");
	        return element;
		}
		public static WebElement btn_asha(WebDriver driver)
		{
			WebElement element=driver.findElement(By.xpath("//input[contains(@value,'Asha')]"));
			if(element.isEnabled())
				System.out.println("Button Enabled");
			else
				System.out.println("Button Failed");
				return element;
		}
	  
	    public static WebElement btn_doctor(WebDriver driver)
	    {
	    	WebElement element=driver.findElement(By.xpath("//input[contains(@value,'Doctor')]"));
	    	if(element.isEnabled())
				System.out.println("Button Enabled");
			else
				System.out.println("Button Failed");
				
	    	return element;
	    }
	    public static WebElement btn_logout(WebDriver driver)
	    {
	    	WebElement element=driver.findElement(By.linkText("Logout"));
	    	return element;
	    }
	

}
