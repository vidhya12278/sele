package org.soft;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webpages 
{
	public static void main(String[] args) throws IOException 
	{
      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\driver\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  
	  WebElement field = driver.findElement(By.xpath("//input[@type='text']"));
	  field.sendKeys("samsung mobiles");
	
	  driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
      List<WebElement> all = driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']"));
	  int t = all.size();
	  WebElement p = all.get(10);
	  System.out.println(p.getClass());
	  p.click();
	  
	  TakesScreenshot ts =(TakesScreenshot)driver;
	  for (int i = 0; i < all.size(); i++) 
	  {
		  File s = ts.getScreenshotAs(OutputType.FILE);
		  File d = new File("C:\\Selenium\\screenshots\\first.jpeg\\second.jpeg\\third.jpeg");
		  FileUtils.copyFile(s, d);
	
	}
	 
	  
	 /* for (int i = 0; i < t; i++) 
	    {
		  WebElement l = all.get(10);	
		  System.out.println(l.getClass());
		  l.click();
		}
	    
	    */
	    
	    
	    
	    
	    
	    
	    
	  
}
}