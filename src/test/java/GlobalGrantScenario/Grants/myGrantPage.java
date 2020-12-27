package GlobalGrantScenario.Grants;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.myGransPage;
import resources.Base;

public class myGrantPage extends Base
{
	private String mygrantpagetitle;
	myGransPage mg=new myGransPage(driver);
	public myGrantPage() throws IOException
	{
		ArrayList<String> testdata=readexceldata(System
				.getProperty("user.dir")+"\\src\\main\\java\\resources\\Grants_Input.xlsx",
				"My Grants");
		this.mygrantpagetitle=testdata.get(0);
		
	}
	@Test
	public void verifyMyGrantpageTitle()
	{
		String actualstring=mg.mygrantpagetitle().getText();
		Assert.assertEquals(actualstring, mygrantpagetitle, "My GrantPAge Title is verifed");
		
	}
	
}
