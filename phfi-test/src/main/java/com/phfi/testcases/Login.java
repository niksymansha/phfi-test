package com.phfi.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void Logi() {

		try {

			System.setProperty("webdriver.chrome.driver", "D:\\Nikita\\jars\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8080/smh-web/sp/login#no-back-button");

			//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			// Check whether email field exists or not
			try {

				WebElement id = driver.findElement(By.id("spUser"));
				System.out.println("******* UserID Exists*******");
				id.sendKeys("rakesh");
			} catch (Throwable e) {
				System.out.println("User ID doesnt exists" + e.getStackTrace());
			}

			// Check whether password field exists or not
			try {
				WebElement password = driver.findElement(By.id("spPass"));
				System.out.println("*****Password Field Exists******");
				password.sendKeys("Phfi@123");
			} catch (Throwable e) {
				System.out.println("Password doesnt exists" + e.getStackTrace());
			}

			// Check whether Sign In button exists or not.
			try {
				WebElement button = driver.findElement(By.id("loginSubmit"));
				System.out.println("*****Login Button Exists******");
				button.submit();
				//driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			} catch (Throwable e) {
				System.out.println("Login button does not exists" + e.getMessage());
			}

			// Check if login was proper or not.
			try {
				WebElement dashboard = driver.findElement(By.linkText("Dashboard"));
				System.out.println("Check whether we can login to dashboard or not");
				String text = dashboard.getText();
				if (text.equals("Dashboard")) {
					System.out.println("Login successful");
				} else {
					System.out.println("Login unsuccessfull");
				}
			} catch (Throwable e) {
				System.out.println("Dashboard login does not exists" + e.getMessage());
			}

			// Check whether the logout button is present or not.
			try {
				WebElement signout = driver.findElement(By.linkText("Logout"));
				System.out.println("Check whether the logout button is there or not");
				String text = signout.getText();
				if (text.equals("Logout")) {
					System.out.println("logout button is there");
				} else {
					System.out.println("Logout button is not there");
				}

			} catch (Throwable e) {
				System.out.println("Logout button is not there" + e.getMessage());
			}

			// Check whether the signout was proper or not.
			try {
				WebElement signout = driver.findElement(By.linkText("Logout"));
				System.out.println("Check whether the logout is properly functioning or not");
				signout.click();
				WebElement refresh = driver.findElement(By.linkText("Logout Successfully Please click here to"));
				String text = refresh.getText();
				if (text.equals("Logout Successfully Please click here to")) {
					System.out.println("Logout is successfull");
				} else {
					System.out.println("Logout is unsuccessful");
				}

			} catch (Throwable e) {
				System.out.println("Logout button is not functioning properly" + e.getMessage());
			}

			// Check whether both email and password fields are blank
			try {
				driver.findElement(By.linkText("Login")).click();
				WebElement button = driver.findElement(By.id("loginSubmit"));
				button.click();
				WebElement user1 = driver.findElement(By.id("spUserErr"));
				WebElement password1 = driver.findElement(By.id("passwordError"));
				String str1 = user1.getText();
				String str2 = password1.getText();
				if (str1.equals("Please Enter Username") && str2.equals("Please Enter Password")) {
					System.out.println("Yes both email and password fields are blank");
				} else {
					System.out.println("No you cannot login successfully");
				}
			} catch (Throwable e) {
				System.out.println("Yes there is an unexpected condition" + e.getMessage());
			}

			driver.close();
		} catch (Throwable e) {
			System.out.println("issue" + e.getMessage());
		}
	}

}
