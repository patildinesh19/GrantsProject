package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPageObject 

{	public  WebDriver driver;
    public WebDriverWait wt;
	
	
	//By Loginlink=By.cssSelector("a[href*='sing_in']");
	private By Loginlink=By.xpath("//span[text()='Login']");
	private By closedbox=By.xpath("//div[@class='sumome-react-svg-image-container']");
	
	private By practicelink= By.xpath("//a[contains(text(),'Practice')]");
	
	
	
	
	public LandingPageObject(WebDriver driver)
	{
		this.driver= driver;
	}

	public WebElement clickonloginlikn()
	{
		return driver.findElement(Loginlink);
	}
	public WebElement closedialogbox()
	{
		
		return driver.findElement(closedbox);
	}
	public WebElement practicelink()
	{
		return driver.findElement(practicelink);
		
	}
}
