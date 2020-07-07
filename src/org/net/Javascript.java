package org.net;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws IOException, InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://facebook.com/");
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	WebElement email = driver.findElement(By.id("email"));
	js.executeScript("arguments[0].setAttribute('value','java')", email);
	Object o = js.executeScript("return arguments[0].getAttribute('value')", email);
	String s=(String)o;
	System.out.println(s);
	
	WebElement pass = driver.findElement(By.id("pass"));
	js.executeScript("arguments[0].setAttribute('value','sleep')", pass);
	
	WebElement face = driver.findElement(By.xpath("//div[contains(text(),'Facebook ')]"));
	js.executeScript("arguments[0].setAttribute('style','background:green');",face);
	File s1 = ts.getScreenshotAs(OutputType.FILE);
	File d = new File("C:\\Selenium\\screen\\output.jpg");
	FileUtils.copyFile(s1, d);
	
	/*WebElement log = driver.findElement(By.id("loginbutton"));
	js.executeScript("arguments[0].click()",log);*/
	
	driver.navigate().to("http://greenstech.in/selenium-course-content.html");
	
	WebElement copy = driver.findElement(By.xpath("//div[text()='Copyright © 2019 greenstech.in. All Rights Reserved.']"));
	js.executeScript("arguments[0].scrollIntoView(true)",copy );
	
	/*Thread.sleep(2000);
	File s1 = ts.getScreenshotAs(OutputType.FILE);
	File d = new File("C:\\Selenium\\screen\\output.jpg");
	FileUtils.copyFile(s1, d);*/
	
	
}
}