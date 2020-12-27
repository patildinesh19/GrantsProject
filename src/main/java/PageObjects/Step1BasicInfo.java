package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Step1BasicInfo
{
	private WebDriver driver;
	private By pageheading=By.xpath("//div[@id='divGG_Step1']/div[@class='activeStepHeader']");
	private By Projectname=By.id("cf_1321580_edit");
	private By Humanitarian_project_checkbox= By.xpath("//input[@value='Humanitarian project']");
	private By Vocational_training_team_checkbox=By.xpath("//input[@value='Vocational training team']");
	private By Scholarship_checkbox=By.xpath("input[@value='Scholarship']");
	private By addprimarycontact_link=By.xpath("//a[contains(text(),' Add Primary Contact')]");
	private By heading_add_primary_contact_page= By.xpath("//h1[contains(text(),'Primary Contacts')]");
	private By selectfirst_primarycontact_roel_dropdown=By.id("primaryContactServingAs");
	private By selectfirst_projctsponosr_dropdown=By.id("primaryContactSponsoredBy");
	private By selectsecond_primarycontact_dropdown= By.id("secondPrimaryContactSponsoredBy");
	private By selectsecond_primarycontact_district_dropdown=By.id("secondPrimaryContact_District");
	private By selectsecond_primarycontact_club_dropdown=By.id("secondPrimaryContact_Club");
	private By searchresult_textbox=By.id("filterSearchResults");
	private By primarcontact_table=By.id("tblPrimaryContactSearchResults");
	
	
	public Step1BasicInfo(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement verifypagetitle()
	{
		return driver.findElement(pageheading);
		
	}
	
	public WebElement setprojectname() {
		// TODO Auto-generated method stub
		return driver.findElement(Projectname);
	}
	public WebElement setHumanitarianProject()
	{
		return driver.findElement(Humanitarian_project_checkbox);
	}
	public WebElement addprimarycontactlink()
	{
		return driver.findElement(addprimarycontact_link);
	}
	public WebElement getaddprimarycontactpagetitle()
	{
		return driver.findElement(heading_add_primary_contact_page);
	}
	public WebElement setprimarycontactrole()
	{
		return driver.findElement(selectfirst_primarycontact_roel_dropdown);
	}
	public WebElement setprimarycontactsponsor()
	{
		return driver.findElement(selectfirst_projctsponosr_dropdown);
	}
	
}
