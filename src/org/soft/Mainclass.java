package org.soft;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mainclass extends Baseclass{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=browserlaunch();
		open();
		
		//login
		WebElement g = driver.findElement(By.xpath("//span[text()='Sign In']"));
		click(g);
		WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
		click(login);
		
		//----------------------------frame concept-----------------
		//registration ---------------1st page
		driver.switchTo().frame("loginIframe");
		Thread.sleep(2000);
		WebElement o = driver.findElement(By.xpath("//input[@name='username']"));
		send(o,"greens@gmail.com");
		WebElement u = driver.findElement(By.id("checkUser"));
		click(u);	
		Thread.sleep(2000);
		
		//2nd page
		driver.switchTo().defaultContent();
		driver.switchTo().frame("loginIframe");
		WebElement mobile = driver.findElement(By.xpath("//input[@id='j_number']"));
		send(mobile,"8939262472");
		WebElement name = driver.findElement(By.id("j_name"));
		send(name,"vidhya");
		WebElement date = driver.findElement(By.id("j_dob"));
		date.clear();
		send(date,"01/05/1998");
		WebElement pass = driver.findElement(By.id("j_password"));
		send(pass,"esv@9899");
		WebElement show = driver.findElement(By.xpath("//i[@data-pass='j_password']"));
		click(show);
		WebElement con = driver.findElement(By.xpath("//button[@id='userSignup']"));
		click(con);
		
		
		
		//----------------------------javascript--------------------------
		driver.navigate().refresh();
		WebElement pro = driver.findElement(By.xpath("//h2[text()='TRENDING PRODUCTS']"));
		scriptjava(pro);
		
		/*WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));	
		down("girls watch",search);
		//thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		button.click();*/
		
		//driver.navigate().back();
		//down
		Thread.sleep(2000);
	    WebElement snap = driver.findElement(By.xpath("//div[text()='Snapdeal Business']"));
	    downs(snap);
	    scriptjava(snap);
	    System.out.println("print line: " + snap.getText());
	
        //down
	    WebElement high = driver.findElement(By.xpath("//a[text()='Media Enquiries']"));
	    scriptjava(high);
	    System.out.println("line: " + high.getText());
	
	    //up
	    Thread.sleep(4000);
	    WebElement oops = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
	    ups(oops);
	    click(oops);
	   /* WebElement sun = driver.findElement(By.xpath("(//span[text()='Sunglasses'])[2]"));
	    click(sun);
	   
	    WebElement title = driver.findElement(By.xpath("//img[@title='Walrus - Black Wayfarer Sunglasses ( WS-DON-III-020302 )']"));
	    System.out.println("print product title:" + title.getAttribute("value") );
	
	    WebElement price = driver.findElement(By.xpath("//span[text()='Rs.  299']"));
	    System.out.println("print product price: " + price.getAttribute("value"));
	    scriptjava(price);
	    click(title);*/
	
	
	
	
	
	
	
	
		
	}
}
