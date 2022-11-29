package com.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
  
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");

  WebDriver driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
  WebElement email = driver.findElement(By.id("ap_email"));
  email.sendKeys("pavithrashrivani@gmail.com");
  WebElement button = driver.findElement(By.id("continue"));
  button.click();
  WebElement psd = driver.findElement(By.id("ap_password"));
  psd.sendKeys("ieuu98");
  WebElement sig = driver.findElement(By.id("signInSubmit"));
  //driver.findElement(By.id("signInSubmit");
  sig.click();
  
  
 	
	}		
}
