package GlobalGrantScenario.Grants;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.LandingPageObject;
import PageObjects.LoginpageObjects;
import resources.Base;

public class HomePageTest extends Base
{
	@BeforeTest
	public void openloginpage() throws Exception 
	{
		intilizebrowser();
		
	}
	
	@Test(dataProvider="getdata")
	public void navigatetologinpage(String username,String Password) throws IOException, Exception
	{
		String urlname=pr.getProperty("URL");
		System.out.println(urlname);
		//driver.get(pr.getProperty("URL"));
		driver.get("http://www.qaclickacademy.com/");
		LandingPageObject ld=new LandingPageObject(driver);
		/*Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(ld.closedialogbox()).click().build().perform();
		ld.closedialogbox().click();
		System.out.println("Sucessfully closed on dialogbox"); */
		ld.clickonloginlikn().click();; 
		LoginpageObjects lo=new LoginpageObjects(driver);
		
		lo.enterusername().sendKeys(username);
		lo.enterpassword().sendKeys(Password);
		//System.out.println(text);
		lo.clickonusername().click();
		String titleoftext=lo.verifyTitle().getText();
		Assert.assertEquals(titleoftext, "Log In to Rahul Shetty Academy");
		//Assert.assertEquals(actual, expected);
		
	}
	
	@Test
	public void navigatoLoginpage()
	{
		String urlname=pr.getProperty("URL");
		System.out.println(urlname);
		//driver.get(pr.getProperty("URL"));
		driver.get("http://www.qaclickacademy.com/");
		LandingPageObject ld=new LandingPageObject(driver);
		ld.clickonloginlikn().click();
		System.out.println("Only nanigate to Login page");
		
	}
	@Test
	public void navigatetopracticepage()
	{
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		LandingPageObject ld=new LandingPageObject(driver);
		ld.practicelink().click();
		
	}

	@Test
	public void handeljavascripts() throws Exception
	{
		String urlname=pr.getProperty("URL");
		System.out.println(urlname);
		
		driver.get("http://www.qaclickacademy.com/");
		LandingPageObject ld=new LandingPageObject(driver);
		WebDriverWait wt= new WebDriverWait(driver,1000);
		wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='sumome-react-svg-image-container']")));
		System.out.println("Element is found");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(ld.closedialogbox()).click().build().perform();
		System.out.println("Sucessfully closed on dialogbox"); 

	}
	
	
	@AfterTest
	public void closedbrowser()
	{
		driver.close();
		driver=null;
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="dinesh";
		data[0][1]="Dinesh123";
		
		data[1][0]="Mangesh";
		data[1][1]="Mangesh123";
		
	return data;
	
		}
	
	}
