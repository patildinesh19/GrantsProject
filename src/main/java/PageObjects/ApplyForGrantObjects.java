package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplyForGrantObjects
{
	private WebDriver driver;
	private By selectgranttypebox= By.id("cmbGrantType");
	private By LetsBegin=By.id("btnCreateAGrant");
	private By pageheading=By.xpath("//h1[contains(text(),'Apply for a Grant')]");
	public ApplyForGrantObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public WebElement applygrantpagetitle()
	{
		return driver.findElement(pageheading);
	}
	public WebElement selectgrantType()
	{		
		return driver.findElement(selectgranttypebox);
	}
	public WebElement letsBeginbutton()
	{
		return driver.findElement(LetsBegin);
	}
}
