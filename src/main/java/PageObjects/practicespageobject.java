package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practicespageobject

{
	WebDriver driver;
	private By Tableobject= By.id("product");
	private By autodropdown=By.id("autocomplete");
	
	public practicespageobject(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement courcetable()
	{
		return driver.findElement(Tableobject);
	}
	public WebElement enterautodropdown()
	{
		return driver.findElement(autodropdown);
	}
}
