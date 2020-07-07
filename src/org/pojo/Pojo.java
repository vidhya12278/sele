package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends Base
{
public Pojo() 
{
PageFactory.initElements(driver, this);	
}

@FindBy(id="email")
private WebElement user;

@FindBys({
@FindBy(id="Pass"),
@FindBy(xpath="(//input[@type='password'])[1]")
})

private WebElement pass;

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}

}
