package org.soft;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasktoday 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
	
	
	Scanner p=new Scanner(System.in);
	System.out.println("enter search word : " );
	String s = p.next();
	System.out.println("output is  : " + s);
	
	
	Thread.sleep(4000);
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\driver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	
	WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	search.sendKeys(s);
	String y = search.getAttribute("value");
	System.out.println("search result : " + y);
	//driver.quit();
	
	
	
}
}