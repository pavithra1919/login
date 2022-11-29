package com.SeleniumConcepts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Example {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile = new File("C:\\Users\\Public\\screenshot\\first.png");
		
		FileHandler.copy(sourcefile,destinationfile);
		
		
		
		
		
	
		
		
		
		
		
		
	}

}
