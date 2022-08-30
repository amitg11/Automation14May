package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Parameterization;
import pojo.LaunchBrowser;
import pom.Homepage;
import pom.ZerodhaLoginPage;

public class ZerodhaHomePage {
	WebDriver driver;
	
	@BeforeMethod
	public void callBrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver = LaunchBrowser.chromeBrowser("https://kite.zerodha.com/");
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
		 
	}
	
	@Test
	public void searchBox() throws InterruptedException
	{
		Homepage homepage= new Homepage(driver);
		homepage.searchBox("TATA");
		homepage.searchandSelectStock(driver, "TATAPOWER");		
		homepage.searchBuyClick();
		Assert.assertEquals("TATAPOWER", "TATAPOWER");
		System.out.println("passed-1");
	}
	
	@Test
	public void addToWatchList() throws InterruptedException
	{
		Homepage homepage= new Homepage(driver);
		homepage.searchBox("GRAN");
		homepage.searchandSelectStock(driver, "GRANULES");		
		homepage.forwatchList();
		
	}
	@Test
	public void deletefromWatchList() throws InterruptedException
	{
		Homepage homepage= new Homepage(driver);
		homepage.searchDesiredStock(driver,"TCPLPACK");
		homepage.deleteStock();
	}
	

}
