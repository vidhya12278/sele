package org.soft;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Table {
	static WebDriver driver;
public static void main(String[] args) throws AWTException, InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.google.com/");
    //driver.get("https://www.w3schools.com/html/html_tables.asp");
    
    WebElement r = driver.findElement(By.xpath("//input[@title='Search']"));
    Actions a=new Actions(driver);
    a.sendKeys(r,"paint").perform();
    String w = r.getAttribute("value");
    System.out.println(w);
    Thread.sleep(2000);
    r.clear();
    
    WebElement t = driver.findElement(By.xpath("//input[@title='Search']"));
    t.sendKeys("");
    Robot e=new Robot();
    Thread.sleep(2000);
    e.keyPress(KeyEvent.VK_SHIFT);
    //e.keyPress(KeyEvent.VK_TAB);
    e.keyPress(KeyEvent.VK_R);
    e.keyRelease(KeyEvent.VK_R);
    e.keyPress(KeyEvent.VK_I);
    e.keyRelease(KeyEvent.VK_I);
    e.keyPress(KeyEvent.VK_Y);
    e.keyRelease(KeyEvent.VK_Y);
    e.keyPress(KeyEvent.VK_A);
    e.keyRelease(KeyEvent.VK_A);
   // e.keyPress(KeyEvent.VK_BACK_SLASH);
    //e.keyRelease(KeyEvent.VK_BACK_SLASH);
    //e.keyPress(KeyEvent.VK_9);
    //e.keyRelease(KeyEvent.VK_9);
    
    e.keyRelease(KeyEvent.VK_SHIFT);
    
    
    String q = t.getAttribute("value");
    System.out.println(q);
    
    
    
    
   // driver.close();
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*List<WebElement> table = driver.findElements(By.tagName("table"));
     int s = table.size();		
     System.out.println("total no of table in page:" +s);
     WebElement tab = driver.findElement(By.xpath("//table[@id='customers']"));
     List<WebElement> row = tab.findElements(By.tagName("tr"));
     for (int i = 0; i < row.size(); i++)
     {
		WebElement r = row.get(i);
		List<WebElement> head = r.findElements(By.tagName("th"));
		for (int j = 0; j < head.size(); j++)
		{
		WebElement r1 = head.get(j);	
		String w = r1.getText();
		System.out.print(w + " ");
		}
		
		List<WebElement> data = r.findElements(By.tagName("td"));
		for (WebElement d : data) 
		{
		String t = d.getText();	
		System.out.println(t + " ");
		}
		System.out.println();
     }
      String l = driver.findElement(By.xpath("//table[@id='customers']//tr[3]//td[2]")).getText();
      System.out.println("print  word from webtable: " + l);
      
      List<WebElement> row2 = tab.findElements(By.tagName("tr"));
      for (int i = 0; i < row2.size(); i++)
      {
 		WebElement r = row2.get(i);
      List<WebElement> data1 = r.findElements(By.tagName("td"));
      for (WebElement u : data1) 
      {
		String c = u.getText();
		if(c.equalsIgnoreCase("Francisco Chang"))
		{
			System.out.println("print vega : " + c);
		}
	}
     /* for (int j = 0; j < data1.size(); j++) 
      {
		WebElement a = data1.get(i);
		String c = a.getText();
		if(c.equalsIgnoreCase("Francisco Chang"))
		{
			System.out.println("print vega : " + c);
		}
	
      }
     } 
      System.out.println("................print odd rows in webtable..............");
       List<WebElement> row1 = tab.findElements(By.tagName("tr"));
      int p = row1.size();
      for (int i1 = 1; i1< p; i1=i1+2)
      {
		WebElement q = row1.get(i1);
		String o= q.getText();
		System.out.println(o);
	  }
      
     
    /* for (int i = 0; i < p; i++)
     {
		if(i%2!=0)
		{
			WebElement j = row1.get(i);
			String h = j.getText();
			System.out.println(h);
		}
	}*/
      /*System.out.println("oddd print");
     
    int i=1;
    while(i<p)
    {
    	if(i%2!=0)
    	{
    	WebElement u = row1.get(i);
    	System.out.println(u.getText());
    	}
    	i++;
    }
    int i1=0;
    while(i1<=p)
    {
    	if(i1%2==0)
    	{
    	WebElement u = row1.get(i);
    	System.out.println(u.getText());
    	}
    	i++;
    }
      */
      
      
      
      
      
      /* for (WebElement t : row1) 
      {
		String e=t.getText();
		System.out.println(e);
	}*/
      
      
     // driver.close();
}
}

