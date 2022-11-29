package com.SeleniumConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/frame.html");
		driver.manage().window().maximize();
	
		driver.switchTo().frame(0);
		WebElement f1 = driver.findElement(By.id("Click"));
		f1.click();
		String text= f1.getText();
		System.out.println("frame1:"+text);
		driver.switchTo().defaultContent();
		
		
		 List<WebElement> framesize = driver.findElements(By.tagName("iframe"));
         int size =framesize.size();
         System.out.println("frame size:"+size);
	}

}
