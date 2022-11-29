package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_example {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        
        WebElement singleframe = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
        driver.switchTo().frame(singleframe);
        WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
        textbox.sendKeys("single frame");
        driver.switchTo().defaultContent();
        
        
        
        

	}

}

