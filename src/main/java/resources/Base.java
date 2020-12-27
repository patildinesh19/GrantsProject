package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Base
{
	public  static WebDriver driver;
	public static Properties pr; //we can use this object in other class also to get values from properties file
	public static Properties pr1;
	public static SoftAssert softassersion= new SoftAssert();;
	
	
	//------------Browser Initialization for different browser -------------------------------- 
	public  static WebDriver intilizebrowser() throws IOException
	{	//below scenario is singleton design pattern 
		//where initializing webdriver only once
		
	    pr= new Properties ();
		FileInputStream fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\globaldata.properties");
		pr.load(fp);
		String mavenbrowsername=System.getProperty("browser");
		String browsername=pr.getProperty("browser");
		
		
		if(browsername.contentEquals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
			//System.getProperty("user.dir");
			ChromeOptions option= new ChromeOptions();
			option.addArguments("headless");
			if(browsername.contentEquals("Chromeheadless"))
			{
				driver=new ChromeDriver(option);
			}
			driver=new ChromeDriver();
		}
		if(browsername.contentEquals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\chromedriver\\geckodriver.exe");
			
			driver =new FirefoxDriver();
		}
		
		 
		//----defined Implisit Wait Globally through Jenkins--------------
		
		/*String impisitwait = System.getProperty("Implicitwait");
		int wait=Integer.parseInt(impisitwait); */
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    
		return driver;
		
		
	}
	
	//----------Screenshot for Failed Scenarios ------------------
	public static void fullscreenshot(String result) throws IOException
	{		
		File fullscreenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullscreenshot, new File(System.getProperty("user.dir")+"\\Fail_Test_screenshots"+"\\Test_screenshots_Fail"+result+"screenshot.png"));
	}
	//--------------Screenshot for PAss method  -----------------
	public  static void fullscreenshotforpassmethod(String methodname) throws IOException, InterruptedException
	{	Thread.sleep(1000);
		File fullscreenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fullscreenshot, new File(System.getProperty("user.dir")+"\\Pass_Test_screenshots"+"\\Test_screenshots_Pass"+methodname+"screenshot.png"));
	}
	
		
	public  static WebDriver opengranturl() throws IOException
	{
		
		pr1= new Properties ();
		FileInputStream fp=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\globaldata.properties");
		pr1.load(fp);
		StringBuilder envirnomt= new StringBuilder(pr.getProperty("GrantsEnvronment"));
		//String envirnomt=pr.getProperty("GrantsEnvronment");
		System.out.println(envirnomt);
		String grantsenvirnomt=System.getProperty("Environemt");
		
		if(envirnomt.toString().equals("QAT"))
		{
		driver.get("https://grantsqat.rotary.org/s_Login.jsp");
		}

		if(envirnomt.toString().equals("UAT"))
		{
			System.out.println("started url");
			driver.get("https://grantsuat.rotary.org/s_Login.jsp");
			System.out.println("completed url");
		}
		return driver;
				
	}
	
	
	public  static WebDriver selectframe(String framename)
	{
		driver.switchTo().frame(framename);
		return driver;
	}
	public  static void selectdropdownvaluebyname(WebElement selectfild, String selectvalue)
	{
		Select sc= new Select(selectfild);
		sc.selectByVisibleText(selectvalue);
		
	}
	
	//---------------Data Driven Testing fatch values from excel sheet------------------
	public  static ArrayList<String> readexceldata(String filepath, String Sheetname) throws IOException
	{
		//XSSFSheet sheet;
		ArrayList<String> ap=new ArrayList<String> ();
		FileInputStream fi= new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fi); ;
		XSSFSheet sheet=workbook.getSheet(Sheetname);
		Iterator<Row> rowiterator= sheet.iterator();
		Row firstrow=rowiterator.next();
		while(rowiterator.hasNext())
		{
			
			Row row= rowiterator.next();
			Iterator <Cell> celliterator=row.cellIterator();
			while(celliterator.hasNext())
			{
				Cell cell=celliterator.next();
				/*if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC)
				{
					String numericstr = NumberToTextConverter.toText(cell.getNumericCellValue());
					ap.add(numericstr);
				}*/
				ap.add(cell.getStringCellValue());
				
			}
				
		}
		
		return ap;
		
	}
	public  static WebDriver savebutton()
	{
		driver.findElement(By.id("btnSaveContact"));
		return driver;
	}
}
