package com.SeleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe ");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.flipkart.com\r\n");
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	driver.navigate().to("https://www.nykaa.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();
	
	}

}
