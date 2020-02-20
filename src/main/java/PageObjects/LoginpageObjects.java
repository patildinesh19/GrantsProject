package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginpageObjects
{
	WebDriver driver;
	private By Username= By.id("user_email");
	private By Passowrd= By.id("user_password");
	private By Loginbutton = By.name("commit");
	private By Titleofpage=By.xpath("//h1[contains(text(),'Log In to Rahul Shetty Academy')]");
	
	public LoginpageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement enterusername()
	{
		return driver.findElement(Username);
	}
	public WebElement enterpassword()
	{
		return driver.findElement(Passowrd);
	}
	public WebElement clickonusername()
	{
		return driver.findElement(Loginbutton);
	}
	public WebElement verifyTitle()
	{
		return driver.findElement(Titleofpage);
	}
	
}
