package com.SeleniumConcepts;

import java.io.File;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavascriptExecuter_ex {

	

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
		Thread.sleep(2000);
		
		TakesScreenshot ss =(TakesScreenshot)driver;
		File Sourcefile = ss.getScreenshotAs(OutputType.FILE);
        File destinationfile =new File("C:\\Users\\HP\\eclipse-workspace\\selenium\\Screenshot\\amazon.png");
        FileHandler.copy(Sourcefile,destinationfile);
		
		
		
		
		
		
		
	}

}





//use javascriptexecuter ,casting,narrowing

//js.executeScript("arguments[0].scrollIntoView(true);", back_to_top);//scroll down till
//use javascriptexecuter ,casting,narrowing
//JavascriptExecutor js =(JavascriptExecutor) driver;





//WebElement back_to_top = driver.findElement(By.xpath("//*[@id='navBackToTop']/div/span"));
////chck element got is true
//js.executeScript("arguments[0].scrollIntoView(true)",back_to_top);
////if s click 
////js.executeScript("arguments[0].click()",free_shipping);//click open in new tab










//1.scrolling by using pixel
//js.executeScript(" window.scroll(0,1000)","");//scroll down
//2.scrolling page till we find element
//findelement---->js.executeScript("arguments[0].scrollIntoView();",backtotop);
//3.scroll page till bottom
//js.executeScript("window.scrollTo(0,document.body.scrollHeight",arg1)





