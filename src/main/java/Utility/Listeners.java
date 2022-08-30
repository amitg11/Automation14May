package Utility;

import java.io.IOException;
import Utility.BaseTest;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseTest implements ITestListener
{

	public void onTestStart(ITestResult result)
	{
		System.out.println("Test passed"+ result.getName());
	}
	
	public void onTestSucess(ITestResult result)
	{
		System.out.println("Test passed"+ result.getName());
	}
	
	public void onTestFailure(ITestResult result) 
	{
		try {
			Screenshot.page(driver, result.getName());
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test skipped"+ result.getName());
	}

}
