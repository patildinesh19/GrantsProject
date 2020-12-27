package GlobalGrantScenario.Grants;

import java.io.IOException;

import org.openqa.selenium.NoSuchWindowException;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.GrantsHomePAgeObjects;
import resources.Base;

public class GrantsHomePagetest extends Base
{
	//GrantsHomePAgeObjects gh=new GrantsHomePAgeObjects(driver);
	@Test
	public void navigatetoNewGrantpage() throws IOException, InterruptedException 
	{	
		Thread.sleep(500);
		System.out.println("Done with sleep");
		GrantsHomePAgeObjects gh=new GrantsHomePAgeObjects(driver);
		//System.out.println("123");
		//driver.switchTo().defaultContent();
		//System.out.println("base frame selected");
		selectframe("app_win");
		System.out.println("app_win frame selected");
		selectframe("page_win");
		System.out.println("page_win frame selected");
		Assert.assertTrue(gh.clickonApplyforGrant().isDisplayed(), "Apply For Grant element found");
		System.out.println("Done with wait");
		//softassersion.assertFalse(gh.clickonApplyforGrant().isDisplayed(), "Apply For Grant element found");
		//fullscreenshotforpassmethod("navigatetoNewGrantpage");
		gh.clickonApplyforGrant().click();
		System.out.println("sucessfully clicked on Apply for grant");
		Thread.sleep(5000);
		System.out.println("Done with last sleep");
	
	}
	
	
	public void navigatetoMyGrantsPAge()
	{
		selectframe("app_win");
		selectframe("page_win");
		//gh.clickOnMyGrants().click();
	}
}
