package test;


import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

import Utility.BaseTest;
import Utility.Parameterization;
import Utility.Reports;
import pojo.LaunchBrowser;
import pom.ForgotUserPass;
import pom.Signup;
import pom.ZerodhaLoginPage;

@Listeners(Utility.Listeners.class)
public class LoginPageTest extends BaseTest {

ExtentReports reports;
ExtentTest test;

@BeforeTest
 public void addReports()
 {
	reports = Reports.generateReport();
 }


 @BeforeMethod
 public void launchBrowser() throws InterruptedException
 {
	driver= LaunchBrowser.chromeBrowser("https://kite.zerodha.com/");
	 
}
// @AfterMethod
// public void ScreenShot1() throws IOException
// {
//	 Screenshot.page(driver, "loginpage");
// }
 
 @Test
 public void zerodhaLoginTest() throws InterruptedException, EncryptedDocumentException, IOException
{
	 test= reports.createTest("zerodhaLoginTest");
	 ZerodhaLoginPage zerodhaloginpage= new ZerodhaLoginPage(driver);
	 String username1= Parameterization.Exceldata("Sheet1", 1, 1);
	 String pass1= Parameterization.Exceldata("Sheet1", 2, 1);
	 String pin1= Parameterization.Exceldata("Sheet1", 5, 0);
	 zerodhaloginpage.enterUsername(username1);	
	 zerodhaloginpage.entePass(pass1);
	 zerodhaloginpage.submitclick();
	 Thread.sleep(2000);
	 zerodhaloginpage.enterPin(pin1); 
	 zerodhaloginpage.clickSub();	 
	 Assert.assertTrue(false);
}
 
 @Test
 public void forgotPassword()
 {
	test= reports.createTest("forgotPassword");
	 ForgotUserPass forgotuserpass=new ForgotUserPass(driver);
	 forgotuserpass.forgotUIDPass();
	 forgotuserpass.clickRadio();
	 forgotuserpass.clickReset();
 }
 
 
 public void SignupPage() throws InterruptedException
 {
	 
	 Signup signup= new Signup(driver);
			 signup.signupPage(driver);
			 Thread.sleep(5000);
			 signup.mobno(driver);
			 
 }
 
// @AfterMethod
// 
// public void postTest(ITestResult result) {
//	 if(result.getStatus()==ITestResult.FAILURE)
//	 {
//		 test.log(Status.FAIL, result.getName());
//	 }else if(result.getStatus()==ITestResult.SUCCESS)
//	 {
//		 test.log(Status.PASS, result.getName());
//	 }else if(result.getStatus()==ITestResult.SKIP)
//	 {
//		 test.log(Status.SKIP, result.getName());
//	 }
// }
// 
// @AfterTest
// public void flushReport()
// {
//	 reports.flush();
// }
}