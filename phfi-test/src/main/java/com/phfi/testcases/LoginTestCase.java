package com.phfi.testcases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.phfi.pageobjectmodel.LoginPageObject;

public class LoginTestCase {

	private static WebDriver driver = null;
	private static WebElement element=null;
    @Test
	public static void main(String[] args) {
		
		//invoke  driver 
		System.setProperty("webdriver.chrome.driver", "D:\\Nikita\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		//invoke hitting URL
		driver.get("http://localhost:8080/smh-web");
		
		//let the window maximize
		driver.manage().window().maximize();
		
		/*we are calling LoginPageObject model class and passing driver 
		as a reference to txtbx_UserName() and the return type of this method is element and passing the values in
		that element by using sendKeys()*/
		LoginPageObject.txtbx_UserName(driver).sendKeys("rakesh");
//		String text1=LoginPageObject.txtbx_UserName(driver);
//		try{
//			System.out.println("****Check whether the username field is there or not*****");
//			if(text1.equals("rakesh"))
//			{
//				System.out.println("Login field there");
//				
//			}
//			else
//				System.out.println("Login field is not there");
//			
//			//WebElement element=driver.findElement(By.id("spUser"));
//			//element.sendKeys("rakesh");
//			
//		}
//		catch(Throwable e)
//		{
//		System.out.println("Some problem in login field"+e.getMessage());	
//		}
//		
		LoginPageObject.txtbx_Password(driver).sendKeys("Phfi@123");
		
		
		LoginPageObject.btn_LogIn(driver).click();
		//System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
		
		// wait for particular period of time to perform operation
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//driver.quit();
	}
}
