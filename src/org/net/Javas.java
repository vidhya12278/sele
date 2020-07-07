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
import org.openqa.selenium.opera.OperaDriver;

public class Javas {
public static void main(String[] args) throws InterruptedException, IOException {
	 String operaDriver="C:\\Testng\\newie3.4.0\\operadriver.exe";
	 System.setProperty("webdriver.opera.driver",operaDriver);
 	WebDriver driver = new OperaDriver();
 	 driver.get("https://www.snapdeal.com/");
 	 driver.manage().window().maximize();
		 JavascriptExecutor j=(JavascriptExecutor)driver;
		 WebElement d = driver.findElement(By.xpath("//div[text()='Copyright © 2020, Snapdeal Private Limited (formerly Jasper Infotech Private Limited). All Rights Reserved']"));
		 j.executeScript("arguments[0].scrollIntoView(true)", d);
		 
		 Thread.sleep(1000);
		 String about = driver.findElement(By.xpath("//p[text()='About Snapdeal']")).getText();
		 System.out.println("print line : " + about);
		 Thread.sleep(1000);
		  WebElement prol = driver.findElement(By.xpath("//div[contains(text(),'About Snapdeal – India’s Ultimate Online Shopping Site ')]"));
		 System.out.println(prol.getText());
		 
		 flash("rgb(0,200,0)", prol,driver);
		 }

public static  void flash(String color,WebElement element,WebDriver driver) throws IOException 
{
	 JavascriptExecutor j=((JavascriptExecutor)driver);
    String bgcolor = element.getCssValue("backgroundColor");
    change("rgb(0,200,0)",element,driver);
	 change(bgcolor,element,driver);
	 
	 j.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
	 try
	 {
		 Thread.sleep(2000);
	 }
	 catch(Exception e)
	 {
	 }
}
/*public static void change(String color,WebElement element,WebDriver driver) throws IOException {

			 JavascriptExecutor j=((JavascriptExecutor)driver);
		 j.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		 try
		 {
			 Thread.sleep(2000);
		 }
		 catch(Exception e)
		 {
		 }*/
private static void change(String string, WebElement element, WebDriver driver) {
	// TODO Auto-generated method stub
	
}
	
	 
}

