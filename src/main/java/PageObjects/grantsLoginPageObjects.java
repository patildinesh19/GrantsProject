package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class grantsLoginPageObjects
{
	private WebDriver driver;
	private By username= By.id("email");
	private By password= By.id("login-password");
	private By Loginbutton=By.xpath("//input[@class='ButtonSm']");
	
	public grantsLoginPageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement enterusername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginbutton()
	{
		return driver.findElement(Loginbutton);
		
	}
}
