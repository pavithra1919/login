package com.SeleniumConcepts;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Taskduplicate_dd {

	public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
            WebDriver driver =new ChromeDriver();
            driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			String title = driver.getTitle();
			System.out.println("title");
			WebElement createnewaccount = driver.findElement(By.xpath("//a role[contains(text(),'Create New Account')]"));
			createnewaccount.click();
			
            WebElement findElement_dd = driver.findElement(By.id("day"));
            Select select =new Select(findElement_dd);
            List<WebElement> list = select.getOptions();
            System.out.println("No.of elements:"+list.size());
            
            Set set =new HashSet();
            for(WebElement Element:list)
            {
            	set.add(Element);
            }
            System.out.println("after removing duplicates elements:"+list.size());
            
            
            
	}

}
