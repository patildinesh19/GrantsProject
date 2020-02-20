package GlobalGrantScenario.Grants;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resources.Base;
import resources.ExtentReporterNG;

public class OpenGrantPage extends Base
{
	@BeforeTest
	public void openloginpage() throws Exception 
	{
		
		intilizebrowser();
		fullscreenshotforpassmethod("openloginpage");
		
		
	}
	
	@Test
	public void openurl() throws IOException, InterruptedException
	{
		
		opengranturl();
		driver.manage().window().maximize();
		fullscreenshotforpassmethod("openurl");
		
	}
}
