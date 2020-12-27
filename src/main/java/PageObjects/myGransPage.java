package PageObjects;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.Base;

public class myGransPage extends Base
{	WebDriver driver;
	private By mygrantpagetitle=By.xpath("//h1[@class='pageTitle']");
	private String Session_Name;
	private By Session_name=By.xpath("//label[@class='label700'][contains(text(),"+Session_Name+")]");
	private By Draft_Table=By.id("tblGrants_Draft");
	private By row_of_draft_table= By.tagName("tr");
	public myGransPage(WebDriver driver) throws IOException
	{
		this.driver=driver;
		ArrayList<String> testdata=readexceldata(System
				.getProperty("user.dir")+"\\src\\main\\java\\resources\\Grants_Input.xlsx",
				"Step 1");
		
		this.Session_Name=testdata.get(1);
	}
	public WebElement mygrantpagetitle()
	{
		return driver.findElement(mygrantpagetitle);
	}
	
	
}

