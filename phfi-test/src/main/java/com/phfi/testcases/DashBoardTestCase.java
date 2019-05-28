package com.phfi.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.phfi.pageobjectmodel.DashBoardPageObject;

public class DashBoardTestCase {
	
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
		DashBoardPageObject.btn_input(driver);
		DashBoardPageObject.btn_reports(driver);
		DashBoardPageObject.dropdwn_setup(driver).click();
		driver.navigate().back();
		Thread.sleep(6000);
		DashBoardPageObject.btn_logout(driver).click();
		
		
	}

}
