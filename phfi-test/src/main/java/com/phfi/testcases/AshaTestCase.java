package com.phfi.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.phfi.pageobjectmodel.AshaPageObject;

public class AshaTestCase {
	
	
	public static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException 
	{
		
					
			System.setProperty("webdriver.chrome.driver", "D:\\Nikita\\jars\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8080/smh-web/sp/login#no-back-button");
			driver.findElement(By.id("spUser")).sendKeys("rakesh");
			driver.findElement(By.id("spPass")).sendKeys("Phfi@123");
			driver.findElement(By.id("loginSubmit")).click();
			Thread.sleep(6000);	
			
			AshaPageObject.btn_input(driver).click();
			Thread.sleep(6000);		
							
			AshaPageObject.btn_asha(driver).click();
			Thread.sleep(6000);	
			
			
//			AshaPageObject.btn_regis(driver).click();        error poplated
//			Thread.sleep(6000);	
//			driver.navigate().back();
			
			int btnc=AshaPageObject.count_btn(driver);
		    System.out.println(btnc);
		    
		    boolean verify=AshaPageObject.logo_verify(driver);
		    System.out.println(verify);
		    
		    String text=AshaPageObject.btntext(driver);
		    System.out.println(text);
			
			AshaPageObject.btn_addvisit(driver).click();
			Thread.sleep(6000);	
			driver.navigate().back();
						
//			AshaPageObject.btn_adddelivery(driver).click(); error sa poplated for cancel btton 
//			Thread.sleep(6000);	
//			driver.navigate().back();
			
			
			AshaPageObject.btn_back(driver).click();
			driver.navigate().back();
			
			
			
			
			AshaPageObject.logout(driver).click();
     
	}

}
