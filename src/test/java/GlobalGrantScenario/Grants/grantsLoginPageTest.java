package GlobalGrantScenario.Grants;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.grantsLoginPageObjects;
import resources.Base;

public class grantsLoginPageTest extends Base
{	private String username;
	private String password;
	
	public grantsLoginPageTest() throws IOException
	{
ArrayList<String> testdata= readexceldata(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\Grants_Input.xlsx","DG login details");
		
		this.username=testdata.get(0);
		this.password=testdata.get(1);
	}
	@Test(dataProvider="getdata")
	public void loignintGrant(String username1,String Password1) throws IOException, InterruptedException
	{	
		
		grantsLoginPageObjects gl=new grantsLoginPageObjects(driver);
		System.out.println(username1);
		System.out.println(Password1);
		gl.enterusername().sendKeys(username1);
		gl.enterpassword().sendKeys(Password1);
		fullscreenshotforpassmethod("loignintGrant");
		gl.loginbutton().click();
	}
	
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[1][2];
		data[0][0]="gov64400708@aol.com";
		data[0][1]="Testing1";		
		
	return data;
	
		}
	@AfterTest
	public void closedbrowser()
	{		 
		driver.close();
		driver=null;
	}
	
	@Test
	public void loginforDG() throws Exception, InterruptedException
	{	
		grantsLoginPageObjects gl=new grantsLoginPageObjects(driver);
		System.out.println(username);
		System.out.println(password);
		gl.enterusername().sendKeys(username);
		gl.enterpassword().sendKeys(password);
		fullscreenshotforpassmethod("loignintGrant");
		gl.loginbutton().click();
	}
	
}
