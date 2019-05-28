package com.phfi.pageobjectmodel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	
	private static WebElement element = null;

	public static WebElement txtbx_UserName(WebDriver driver) {
		element = driver.findElement(By.id("spUser"));
		return element;
	}

	public static WebElement txtbx_Password(WebDriver driver){
		element=driver.findElement(By.id("spPass"));
		return element;
	}

	public static WebElement btn_LogIn(WebDriver driver){
		 element = driver.findElement(By.id("loginSubmit"));
		 return element;
	}

}

// WebDriver driver;
//
// public void login_username()
// {
// WebElement uid=driver.findElement(By.id("spUser")).sendKeys();
// return uid;
// }
// public void login_password()
// {
// WebElement upswd=driver.findElement(By.id("spPass")).sendKeys();
// return upswd;
// }
// public void submit()
// {
// WebElement button = driver.findElement(By.id("loginSubmit"));
// button.submit();
// }
//
//
// public static void main(String args[])
// {
//
// System.setProperty("webdriver.chrome.driver",
// "D:\\Nikita\\jars\\chromedriver.exe");
// WebDriver driver=new ChromeDriver();
// driver.get("http://localhost:8080/smh-web/sp/login#no-back-button");
// LoginPageObject obj=new LoginPageObject();
// obj.login_username();
// obj.login_password();
// obj.submit();
//
// }
// }
