package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable_ex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().window().maximize(); 
	    
		System.out.println("--------------10th capital----------------");
		List<WebElement> rcapital = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[10]/td[3]"));
		for (WebElement cap : rcapital) {
			System.out.println(cap.getText());	
		}
		System.out.println("--------------13th row data----------------");
		List<WebElement> rowdata = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr[13]"));
		for (WebElement rd : rowdata) {
			System.out.println(rd.getText());	
		}
		System.out.println("--------------5th column data----------------");
		List<WebElement> columndata = driver.findElements(By.xpath("//table[@id='countries']/tbody/tr/td[5]"));
		for (WebElement cd :columndata ) {
			System.out.println(cd.getText());	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
