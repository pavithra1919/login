package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id(""));
		Select s= new Select(dropdown);
		//by index
		s.selectByIndex(1);
		
		Thread.sleep(2000);
		//visible text
		WebElement text = driver.findElement(By.name("dropdown2"));
		//Select s1 =new Select(text);
		//s1.selectByVisibleText("");
		//value
		WebElement value = driver.findElement(By.id("dropdown3"));
		Select s2 = new Select(value);
		//s2.selectByValue(arg0);
		
	
		//boolean multiple = s2.isMultiple();
		System.out.println("single or multiple");
		
		
		
	}

}
