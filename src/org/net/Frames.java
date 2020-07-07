package org.net;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/iframe-practice-page/");
		
		List<WebElement> i = driver.findElements(By.tagName("iframe"));
		int u = i.size();
		System.out.println("no of frames: " + u);
		driver.findElement(By.xpath("(//a[text()='Sortable'])[1]")).click();
		
		driver.navigate().back();
		driver.switchTo().frame("IF1");
		String r = driver.findElement(By.xpath("//div[text()='Free QA Automation Tools Tutorials']")).getText();
		System.out.println("print line: " + r);	
		
	//	driver.switchTo().frame("IF2");
	//	driver.findElement(By.xpath("(//a[text()='Sortable'])[1]")).click();
	}
}
