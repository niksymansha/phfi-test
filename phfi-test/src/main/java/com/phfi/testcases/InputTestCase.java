package com.phfi.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.phfi.pageobjectmodel.InputPageObject;

public class InputTestCase {
	
	public static WebDriver driver=null;
	public static void main(String args[]) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Nikita\\jars\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/smh-web/sp/login#no-back-button");
		driver.findElement(By.id("spUser")).sendKeys("rakesh");
		driver.findElement(By.id("spPass")).sendKeys("Phfi@123");
		driver.findElement(By.id("loginSubmit")).click();
		Thread.sleep(6000);	
		
		InputPageObject.btn_input(driver).click();
		Thread.sleep(6000);		
		
			
		InputPageObject.btn_asha(driver).click();
		Thread.sleep(6000);	
		driver.navigate().back();
		
			
		InputPageObject.btn_doctor(driver).click();
		Thread.sleep(6000);	
		driver.navigate().back();
		
		InputPageObject.btn_logout(driver).click();
		
	}
		

}
