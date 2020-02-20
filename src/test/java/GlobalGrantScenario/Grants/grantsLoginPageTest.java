package GlobalGrantScenario.Grants;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.grantsLoginPageObjects;
import resources.Base;

public class grantsLoginPageTest extends Base
{
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
	
	
}
