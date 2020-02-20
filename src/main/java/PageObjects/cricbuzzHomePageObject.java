package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cricbuzzHomePageObject
{
WebDriver driver;
	
	public By tablename= By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']");
	
	
	
	public cricbuzzHomePageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement verifyWebtable()
	{
		return driver.findElement(tablename);
	}
	
	
}
