package org.net;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form/");
		//get all options
		WebElement multi = driver.findElement(By.xpath("//select[@id='continentsmultiple']"));
		Select s=new Select(multi);
		List<WebElement> o = s.getOptions();
		for (WebElement r : o) {
			String t = r.getText();
			System.out.println("get all options:" + t);
		}
		
		//get first selected option
		WebElement such = driver.findElement(By.xpath("//select[@id='selenium_commands']"));
		Select s1=new Select(such);
		s1.selectByIndex(3);
		//s1.deselectAll();
		WebElement first = s1.getFirstSelectedOption();
		String e = first.getText();
		System.out.println("first selected option : "+ e);
		s1.deselectByIndex(3);
		
		//odd option
		List<WebElement> u = s1.getOptions();
		int a = u.size();
		for (int i = 0; i < a; i=i+2) 
		{
		String e1 = u.get(i).getText();
		System.out.println("odd options:\n " + e1);
		}
		
		//even option
		for (int i = 1; i < a; i=i+2) 
		{
		String e1 = u.get(i).getText();
		System.out.println("even options:\n " + e1);
		}
		
}
}