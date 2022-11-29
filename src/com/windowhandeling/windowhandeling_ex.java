package com.windowhandeling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class windowhandeling_ex {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); 
		//Actions
		Actions actn = new Actions(driver);
		//robot
		WebElement Electronics = driver.findElement(By.xpath(" //a[text() = ' Electronics ' ]"));
		actn.contextClick(Electronics).build().perform();
		Robot robo =new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement Books = driver.findElement(By.xpath("//a[text()='Books']"));
		actn.contextClick(Books).build().perform();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement HK = driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
		actn.contextClick(HK).build().perform();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    
	    WebElement computers = driver.findElement(By.xpath("//a[text()='Computers']"));
	    actn.contextClick(computers).build().perform();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(2000);
	    
	    System.out.println("---------------------------------------------");
	    int size = driver.getWindowHandles().size();
	    System.out.println(size);
	   
	    System.out.println("---------------------------------------------");
	    String parentwindow = driver.getWindowHandle();
	    System.out.println(parentwindow);
	    //to get title of books
	    Set<String> allwindows = driver.getWindowHandles();
	    System.out.println("---------------------------------------------");
	    
	    //if books is not equal to allwindow it will enter loop
	    for (String childwindow : allwindows) {
	    	
	    	String title = driver.switchTo().window(childwindow ).getTitle();
	    	System.out.println(title);	
	    }
	    System.out.println("---------------------------------------------");
	    
	    driver.switchTo().defaultContent();
	    String bk ="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
	    		for(String childwindow : allwindows) {
	    			if(driver.switchTo().window(childwindow ).getTitle().equals(bk)) {
	    				break;
	    			}
	    		}
	 
	    Thread.sleep(2000);
	    WebElement sip = driver.findElement(By.xpath("//*[@id=\"sobe_d_b_6_2\"]/a/div[1]/img"));
	    actn.click(sip).build().perform();
	    WebElement atoc = driver.findElement(By.id("add-to-cart-button"));
	    actn.click(atoc).build().perform();
	    
	    String cp ="Computers & Accessories: Buy Computers & Accessories Online at Low Prices in India - Amazon.in";
	          for(String cw:allwindows) {
	        	  if(driver.switchTo().window(cw).getTitle().equals(cp)) {
	        	  break;
	        	  } 
	          }
	    JavascriptExecutor je = (JavascriptExecutor)driver;  
	    je.executeScript("window.scrollTo(0, document.body.scrollHeight)","");
	    Thread.sleep(2000);
	    
	    TakesScreenshot ts =(TakesScreenshot)driver;
	    File sourcefile = ts.getScreenshotAs(OutputType.FILE);
	    File destinationfile =new File("C:\\Users\\HP\\eclipse-workspace\\selenium\\Screenshot\\computer1.png");
	    FileHandler.copy(sourcefile, destinationfile);
	    Thread.sleep(2000);
	    for(String childwindow :allwindows) {
	    	if(!childwindow.equals(parentwindow)) {
	    		driver.switchTo().window(childwindow );
	    		driver.close();
	    	}
	    }
	    
	    
	    
	    
	  
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	   // Set<String> win = driver.getWindowHandles();
	   // for(String books:windows) {
	    //	driver.switchTo().window(win);
	    	
	    //}
	    
	    
	   
	   
		
				

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
