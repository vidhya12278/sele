package org.pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	static WebDriver driver;
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
	Pojo p=new Pojo();
	WebElement j = p.getUser();
	j.sendKeys("java");
	
	WebElement l = p.getPass();
	l.sendKeys("sleep");
	
	driver.quit();
	
}
}
