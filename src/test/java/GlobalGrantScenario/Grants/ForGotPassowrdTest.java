package GlobalGrantScenario.Grants;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.forGotpassowrdObjects;
import resources.Base;

public class ForGotPassowrdTest extends Base
{
	@Test
	public void verfiyforgotpassowrd()
	{
		forGotpassowrdObjects fd= new forGotpassowrdObjects(driver);
		fd.forgotpassowrd().click();
		String actualpageheading=fd.pageheadingforgotpassword().getText();
		Assert.assertEquals(actualpageheading, "Rese3t Password");
		
	}
}
