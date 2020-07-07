package org.net;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bug 
{
public static void main(String[] args) 
{
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\driver\\chromedriver.exe");	
WebDriver driver = new ChromeDriver();
driver.get("https://facebook.com/");
driver.manage().window().maximize();
String w = driver.getCurrentUrl();
System.out.println("first url : " + w);
WebElement  email= driver.findElement(By.id("email"));
email.sendKeys("riya");
WebElement  pass = driver.findElement(By.id("pass"));
pass.sendKeys("63456");

WebElement login = driver.findElement(By.xpath("//input[@value='Log In']"));
login.click();
String r = driver.getCurrentUrl();
System.out.println(r);

driver.quit();
}


}
