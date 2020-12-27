package GlobalGrantScenario.Grants;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import resources.Base;
import resources.ExtentReporterNG;

public class OpenGrantPage extends Base

{	public WebDriver driver;
	@BeforeTest
	public void openloginpage() throws Exception 
	{
		
		driver=intilizebrowser();
		
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
	