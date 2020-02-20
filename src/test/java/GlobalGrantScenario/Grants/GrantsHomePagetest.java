package GlobalGrantScenario.Grants;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.GrantsHomePAgeObjects;
import resources.Base;

public class GrantsHomePagetest extends Base
{
	@Test
	public void navigatetoNewGrantpage() throws IOException, InterruptedException 
	{	
		GrantsHomePAgeObjects gh=new GrantsHomePAgeObjects(driver);
		
		selectframe("app_win");
		selectframe("page_win");
		Assert.assertTrue(gh.clickonApplyforGrant().isDisplayed(), "Apply For Grant element found");
		//softassersion.assertFalse(gh.clickonApplyforGrant().isDisplayed(), "Apply For Grant element found");
		fullscreenshotforpassmethod("navigatetoNewGrantpage");
		gh.clickonApplyforGrant().click();;
		
	}
}
