package com.phfi.pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AshaPageObject {

	public static WebElement element = null;

	public static WebElement btn_input(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Input')]"));
		if (element.isEnabled())
			System.out.println("Button Enabled");
		else
			System.out.println("Button Failed");
		return element;
	}

	public static WebElement btn_asha(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Asha')]"));
		if (element.isEnabled())
			System.out.println("Button Enabled");
		else
			System.out.println("Button Failed");
		return element;
	}

	public static boolean logo_verify(WebDriver driver) {
		boolean element = driver.findElement(By.xpath("//img[contains(@alt,'Logo')]")).isDisplayed();

		return element;
	}

	public static WebElement btn_regis(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'New Registration')]"));
		if (element.isEnabled())
			System.out.println("Button Enabled");
		else
			System.out.println("Button Failed");

		return element;
	}

	public static WebElement btn_addvisit(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Add Visit Detail')]"));
		if (element.isEnabled())
			System.out.println("Button Enabled");
		else
			System.out.println("Button Failed");
		return element;
	}

	public static WebElement btn_adddelivery(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Add Delivery Registration')]"));
		if (element.isEnabled())
			System.out.println("Button Enabled");
		else
			System.out.println("Button Failed");
		return element;
	}

	public static WebElement btn_back(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Back')]"));
		if (element.isEnabled())
			System.out.println("Button Enabled");
		else
			System.out.println("Button Failed");
		return element;
	}

	public static int count_btn(WebDriver driver) {
		List<WebElement> element = driver.findElements(By.xpath(("//input[@class='button']")));
		return element.size();
	}

	public static WebElement logout(WebDriver driver) {
		WebElement element = driver.findElement(By.linkText("Logout"));
		return element;
	}

	public static String btntext(WebDriver driver) {
		String text = null;
		List<WebElement> elements = driver.findElements(By.xpath(("//input[@class='button']")));
		for (WebElement element : elements) {
			text = element.getText();
		}
		return text;
	}

}
