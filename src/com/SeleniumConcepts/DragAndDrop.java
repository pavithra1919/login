package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
	
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("//div[@id='box1']"));
		WebElement to = driver.findElement(By.xpath("//div[@id='box104']"));
		Thread.sleep(2000);
		act.clickAndHold(from).moveToElement(to).release().build().perform();
		
		
		
		
	}

}


