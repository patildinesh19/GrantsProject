package GlobalGrantScenario.Grants;

import java.io.IOException;
import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.cricbuzzHomePageObject;
import resources.Base;

public class CricbuzzHomePage extends Base
{
	@BeforeTest
	public void Initilaizebrowser() throws IOException
	{
		driver=intilizebrowser();
		
	}
	
	@Test
	public void navigatetocricbuzz()
	{
		int sum=0;
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22590/ausw-vs-indw-3rd-match-womens-t20i-tri-series-in-australia-2020");
		String titleofpage=driver.getTitle();
		System.out.println(titleofpage);
		driver.manage().window().maximize();
		
		cricbuzzHomePageObject cb=new cricbuzzHomePageObject(driver);
		Assert.assertTrue("WebTable Object foune", cb.verifyWebtable().isDisplayed());
		
		List<WebElement>totalrow=cb.verifyWebtable().findElements(By.cssSelector("div[class='cb-col cb-col-8 text-right text-bold']"));
		
		int numberofrow=totalrow.size();
		
		System.out.println(numberofrow);
		List<WebElement>totalcolumnrow=cb.verifyWebtable().findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		
		int runcolumrow=totalcolumnrow.size();
		System.out.println(runcolumrow);
		for(int i=0;i< runcolumrow-2;i++)
		{
			String eachrun=totalcolumnrow.get(i).getText();
			System.out.println(totalcolumnrow.get(i).getText());
			int valueint=Integer.parseInt(eachrun);
			sum=sum+valueint;
			
			
		}
		System.out.println("Total run="+sum);
		
		
		
	}
}
