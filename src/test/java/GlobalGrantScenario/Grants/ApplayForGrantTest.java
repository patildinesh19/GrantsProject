package GlobalGrantScenario.Grants;


import java.io.IOException;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.LogStatus;

import PageObjects.ApplyForGrantObjects;
import resources.Base;

public class ApplayForGrantTest extends Base 
{
	private String applyforgrantpagetitle;
	private String granttype;
	
	public  ApplayForGrantTest() throws IOException
	{
		ArrayList<String> testdata= readexceldata(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Grants_Input.xlsx","Select Grant type");
		
		this.applyforgrantpagetitle=testdata.get(0);
		this.granttype=testdata.get(1);
		
	}
	
	@Test(priority=0)
	public void checkpagetitle() throws IOException, InterruptedException
	{	
		ApplyForGrantObjects ap= new ApplyForGrantObjects(driver);
		System.out.println("1");
		driver.switchTo().defaultContent();
		selectframe("app_win");
		selectframe("page_win");
		String applyforgranttitle=ap.applygrantpagetitle().getText();
		System.out.println(applyforgranttitle);
		Assert.assertEquals(applyforgranttitle, applyforgrantpagetitle);
		//Assert.assertEquals(applyforgranttitle, applyforgrantpagetitle, "verify grant page title");
		//softassersion.assertEquals(applyforgranttitle, applyforgrantpagetitle);
		//softassersion.assertEquals(applyforgranttitle, applyforgrantpagetitle, "verify grant page title");
		fullscreenshotforpassmethod("ApplyForGrantObjects");
		
		
	}
	
	
	@Test(priority=1)
	public void startglobalgrant() throws InterruptedException, IOException  
	{
		
		ApplyForGrantObjects ap= new ApplyForGrantObjects(driver);
		driver.switchTo().defaultContent();
		selectframe("app_win");
		selectframe("page_win");		
		Assert.assertTrue(ap.letsBeginbutton().isEnabled(), "Let's Begin Button is enalbe");	
		//softassersion.assertFalse(ap.letsBeginbutton().isEnabled(), "Let's Begin Button is enalbe");
		WebElement dropdown= ap.selectgrantType();		
		selectdropdownvaluebyname(dropdown,granttype);	
		Thread.sleep(100);
		Assert.assertTrue(ap.letsBeginbutton().isEnabled(), "let's begin button is in Displayed");;
		ap.letsBeginbutton().click();
		Thread.sleep(1000);
		//softassersion.assertAll();
		fullscreenshotforpassmethod("startglobalgrant");
			
		
		
	
		
	}
}
