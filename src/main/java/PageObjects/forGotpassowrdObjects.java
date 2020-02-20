package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class forGotpassowrdObjects
{
	WebDriver driver;
	
	private By ForGotpasswordlink= By.xpath("//a[contains(text(),'Forgot Password?')]");
	private By titleofforgotpage= By.xpath("//h1[contains(text(),'Reset Password')]");
	
	public forGotpassowrdObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement forgotpassowrd()
	{
		return driver.findElement(ForGotpasswordlink);
	}
	
	public WebElement pageheadingforgotpassword()
	{
		return driver.findElement(titleofforgotpage);
	}
}
