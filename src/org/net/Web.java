package org.net;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

public static void main(String[] args) throws IOException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	/*	driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		button.click();
		Thread.sleep(2000);
		Alert r=driver.switchTo().alert();
		r.accept();
		boolean w = button.isEnabled();
		System.out.println("enabled or not:" + w);
		boolean t = button.isDisplayed();
		System.out.println("displayed or not: " +t);*/
		
		driver.get("http://facebook.com/");
		WebElement select = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		System.out.println(select.getClass());
		//select.click();
		boolean u = select.isSelected();
		System.out.println("selected or not: " + u);
		if(u==false)
		{
		select.click();
		boolean e = select.isSelected();
		System.out.println("selected or not :" +  e);
		}
}
}