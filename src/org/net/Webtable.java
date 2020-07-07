package org.net;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-table/");
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int u = rows.size();
		for (int i = 0; i < u; i++)
		{
			WebElement e = rows.get(i);
			List<WebElement> heads = e.findElements(By.tagName("th"));
			int h = heads.size();
			for (int j = 0; j < h; j++) {
				System.out.println(heads.get(j).getText());
			}
			List<WebElement> datas = e.findElements(By.tagName("td"));
			int s = datas.size();
			for (int j = 0; j < s; j++) 
			{
				System.out.println(datas.get(j).getText());
				
			}
		}
		
		
}
}