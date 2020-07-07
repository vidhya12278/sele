package org.net;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung mobile m31");
	driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
	driver.findElement(By.xpath("(//span[text()='Samsung Galaxy M31 (Space Black, 6GB RAM, 128GB Storage)'])[1]")).click();
	
	String p = driver.getWindowHandle();
	Set<String> c = driver.getWindowHandles();
	for (String t : c) {
		if(!(p.equals(t)))
		{
			driver.switchTo().window(t);
		}
	}
	
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	
	
}
}