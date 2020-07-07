package org.soft;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	static WebDriver driver;
	static JavascriptExecutor js;
public static WebDriver browserlaunch() {
	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("http://demo.automationtesting.in/Alerts.html");
	return driver;
	}
   public static  void open() {
	driver.get("https://www.snapdeal.com/");

   }
   public static  void send(WebElement t,String text) {
	t.sendKeys(text);
}
   public  static void click(WebElement t) {
	
     t.click();
}
   public static  void scriptjava(WebElement r) 
   {
	 js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('style','background:pink');",r);

}
   public static  void down(String text,WebElement r) {

		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('value','"+text+"')",r);
}
   public static void downs(WebElement p) {
	   js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true)", p);

}
   public static void  ups(WebElement p) {
	   js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(false)", p);

}
  /* private void read() {
	   File file = new File("C:\\Users\\user\\Desktop\\dev\\Data\\excel\\hote.xlsx");
		Workbook w=new XSSFWorkbook(file);
	Sheet s = w.getSheet("sheet1");
	Row r = s.getRow(rowno);
	Cell c = r.getCell(colno);
	CellType cellType = c.getCellType();
	String value="";
		if(cellType==CellType.STRING)
	{
	value=c.getStringCellValue();	
	}
	else 
		if(DateUtil.isCellDateFormatted(c))
		{
			    Date e=c.getDateCellValue();
			    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			    value=sdf.format(e);
		}
		else
		{
			double d = c.getNumericCellValue();
			long l=(long)d;
			value=String.valueOf(l);
				}
	return value;
	}
*/
}














