package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GrantsHomePAgeObjects 
{
	private WebDriver driver;
	private WebDriverWait wt;
	private By AplyforGrant= By.xpath("//a[contains(text(),'Apply for a Grant')]");
	
	public GrantsHomePAgeObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement clickonApplyforGrant()
	{
		return driver.findElement(AplyforGrant);
	}
	
	
}