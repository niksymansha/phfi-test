package com.phfi.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailPageVerify {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Nikita\\jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("niksy.mansha1@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.id("password")).sendKeys("rock@niki20");
		driver.findElement(By.id("passwordNext")).click();
		
		
		

	}

}
