package GlobalGrantScenario.Grants;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.Step1BasicInfo;
import resources.Base;

public class Step1Basicinfo extends Base
{
	private String Project_Name;
	private String Primary_Contact_Role;
	private String PrimaryContact_sponsor;
	private String Secondary_Contact_Sponsor;
	private String Secondary_Contact_District;
	private String Secondary_Contact_Club;
	private String Secondary_Contact_ID;
	private String Primary_Contact_Name;
	private String Secondary_Contact_Name;
	private String Step1_Name;
	
	public Step1Basicinfo() throws IOException
	{
		ArrayList<String> testdata=readexceldata(System
				.getProperty("user.dir")+"\\src\\main\\java\\resources\\Grants_Input.xlsx",
				"Step 1");
		this.Project_Name=testdata.get(0);
		this.Primary_Contact_Role=testdata.get(1);
		this.PrimaryContact_sponsor=testdata.get(2);
		this.Secondary_Contact_Sponsor=testdata.get(3);
		this.Secondary_Contact_District=testdata.get(4);
		this.Secondary_Contact_Club=testdata.get(5);
		this.Secondary_Contact_ID=testdata.get(6);
		this.Primary_Contact_Name=testdata.get(7);
		this.Secondary_Contact_Name=testdata.get(8);
		this.Step1_Name=testdata.get(9);
	}
	@Test
	public void complete_Step1()
	{
		Step1BasicInfo step1= new Step1BasicInfo(driver);
		driver.switchTo().defaultContent();
		selectframe("app_win");
		selectframe("page_win");
		selectframe("page_win");
		String actual_name_of_Step=step1.verifypagetitle().getText();
		System.out.println("Step nmae="+actual_name_of_Step);
		Assert.assertEquals(actual_name_of_Step,Step1_Name);
		step1.setprojectname().sendKeys(Project_Name);
		step1.setHumanitarianProject().click();
		step1.addprimarycontactlink().click();
		
		selectdropdownvaluebyname(step1.setprimarycontactrole(),Primary_Contact_Role);
		selectdropdownvaluebyname(step1.setprimarycontactsponsor(),PrimaryContact_sponsor);
		Assert.assertEquals(step1.getaddprimarycontactpagetitle().getText(),"Primary Contacts");
		
		
		
	}
}
