package GlobalGrantScenario.Grants;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LandingPageObject;
import PageObjects.practicespageobject;
import resources.Base;

public class practicepagetest extends Base
{
	@Test
	public void verifyTitlepracticepage()
	{
		String practicetitle=driver.getTitle();
		Assert.assertEquals(practicetitle, "Practice Page");
	}
	
	@Test
	public void practicewebtable()
	{
		//navigate to perticuler row and print all column values from that row
		practicespageobject pt= new practicespageobject(driver);
		List <WebElement>rowelement=pt.courcetable().findElements(By.tagName("tr"));
		int totalrownumber=rowelement.size();
		System.out.println(totalrownumber);
		List<WebElement> columnelement=pt.courcetable().findElements(By.xpath("//tr/th"));
		int totalcolumn=columnelement.size();
		System.out.println(totalcolumn);
		
		for(int i=0; i<totalrownumber;i++)
		{
			if(i==2)
			{
				for(int j=0;j<totalcolumn;j++)
				{
					WebElement secondrow=pt.courcetable().findElements(By.tagName("tr")).get(i);
					String secondrowcolumntext=secondrow.findElements(By.tagName("td")).get(j).getText();
					System.out.println("secondrowcolumntext:"+secondrowcolumntext);
				}
				break;
			}
			else
			{
				System.out.println("second row not found");
			}
		}
	}	
			@Test
		public void printrowvalueaspercondition()
		{
			//navigate to perticuler value and find out respective value of that column
				practicespageobject pt= new practicespageobject(driver);
			
			List <WebElement>rowelement=pt.courcetable().findElements(By.tagName("tr"));
			int totalrownumber=rowelement.size();
			System.out.println(totalrownumber);
			List<WebElement> columnelement=pt.courcetable().findElements(By.xpath("//tr/th"));
			int totalcolumn=columnelement.size();
			System.out.println(totalcolumn);
			
			for(int i=1; i<totalrownumber;i++)
			{
					for(int j=0;j<totalcolumn;j++)
					{
						WebElement secondrow=pt.courcetable().findElements(By.tagName("tr")).get(i);
						String courcename=secondrow.getText();
						if(courcename.contains("Master Selenium Automation in simple Python Language"))
						{
							if(j==2)
							{
							String secondrowcolumntext=secondrow.findElements(By.tagName("td")).get(j).getText();
							System.out.println("secondrowcolumntext:"+secondrowcolumntext);
							}
						}
						
					}
					
				}
				
			}
		@Test	
		public void printalltablevalues()
		{	ArrayList<String> newaraylist=new ArrayList<String>();
			ArrayList<String> sortedlist=new ArrayList<String>();
		
			//navigate to all row and column and print all values
			practicespageobject pt= new practicespageobject(driver);
			List <WebElement>rowelement=pt.courcetable().findElements(By.tagName("tr"));
			int totalrownumber=rowelement.size();
			System.out.println(totalrownumber);
			List<WebElement> columnelement=pt.courcetable().findElements(By.xpath("//tr/th"));
			int totalcolumn=columnelement.size();
			System.out.println(totalcolumn);
			
			for(int i=1; i<totalrownumber;i++)
			{
				WebElement secondrow=pt.courcetable().findElements(By.tagName("tr")).get(i);
				for(int j=0;j<totalcolumn;j++)
					{
						String secondrowcolumntext=secondrow.findElements(By.tagName("td")).get(j).getText();
						newaraylist.add(secondrowcolumntext);
						System.out.println("secondrowcolumntext:"+secondrowcolumntext);
						
					}
				
			}
			
		}
		@Test
		public void printvaluesfromperticulercolumn()
		{
			int sum=0;
			practicespageobject pt= new practicespageobject(driver);
			List <WebElement>rowelement=pt.courcetable().findElements(By.tagName("tr"));
			int totalrownumber=rowelement.size();
			System.out.println(totalrownumber);
			List<WebElement> columnelement=pt.courcetable().findElements(By.xpath("//tr/th"));
			int totalcolumn=columnelement.size();
			System.out.println(totalcolumn);
			List<WebElement> threedcolumn=pt.courcetable().findElements(By.xpath("//tr/td[3]"));
			int threedcoluncount=threedcolumn.size();
			System.out.println("only threed coulmn all vales"+threedcolumn.size());
			
			for(int j=0;j<threedcoluncount;j++)
				{
					String priceinstring=threedcolumn.get(j).getText();
					System.out.println(priceinstring);
					int columninnumber=Integer.parseInt(priceinstring);
					System.out.println("valuein number"+columninnumber);
					sum=sum+columninnumber;
					System.out.println("Total run="+sum);
				}
			//System.out.println("Total run="+sum);
			
		}
		
		@Test
		public void handelajaxdropdown()
		{
			practicespageobject pt= new practicespageobject(driver);
			pt.enterautodropdown().sendKeys("India");
			
			String javaexecuter= "return document.getElementById(\"autocomplete\").value;";
			JavascriptExecutor js=(JavascriptExecutor)driver;
			String actualvalue=(String) js.executeScript(javaexecuter);
			System.out.println(actualvalue);
						
		}
		@Test
		public void courceordsort()
		{
			int sum=0;
			ArrayList<String>orignallist=new ArrayList<String>();
			
			practicespageobject pt= new practicespageobject(driver);
			List <WebElement>rowelement=pt.courcetable().findElements(By.tagName("tr"));
			int totalrownumber=rowelement.size();
			System.out.println(totalrownumber);
			List<WebElement> columnelement=pt.courcetable().findElements(By.xpath("//tr/th"));
			int totalcolumn=columnelement.size();
			System.out.println(totalcolumn);
			List<WebElement> threedcolumn=pt.courcetable().findElements(By.xpath("//tr/td[2]"));
			int threedcoluncount=threedcolumn.size();
			System.out.println("only threed coulmn all vales"+threedcolumn.size());
			
			for(int j=0;j<threedcoluncount;j++)
				{
					String priceinstring=threedcolumn.get(j).getText();
					orignallist.add(priceinstring);
				}			
		
			System.out.println(orignallist);
			Collections.sort(orignallist);
			System.out.println(orignallist);
			
		}
		
		
}
