package com.SeleniumConcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Contextclick {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//obj for Actions class,driver access,context clk(m),robot action(k)
		Actions actn = new Actions(driver);
		
		WebElement imgicn = driver.findElement(By.xpath("(//a[@class='gb_d'])[2]"));
		actn.contextClick(imgicn).build().perform();
		Thread.sleep(2000);
		
		//obj for robotclass,use vk press release,enter
		
	    Robot rt =new Robot();
		
	    rt.keyPress(KeyEvent.VK_DOWN);
	    rt.keyRelease(KeyEvent.VK_DOWN);
	    
	    rt.keyPress(KeyEvent.VK_ENTER);
	    rt.keyRelease(KeyEvent.VK_ENTER);
	    
	    
		
		
		
		
		
		
		
		
		
		
	}

}
