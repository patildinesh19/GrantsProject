package GlobalGrantScenario.Grants;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class Listeners implements ITestListener{
	Base b= new Base();
	
	public void onFinish(ITestContext context) {
		System.out.println("Pass Test cases name"+context.getPassedTests());
		System.out.println("Fail Test cases Names"+context.getFailedTests());
	}

	
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestFailure(ITestResult results) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2000);
			b.fullscreenshot(results.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void onTestSuccess(ITestResult results) {
		
		
		
		
	}

}
