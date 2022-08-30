package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.BaseTest;
import Utility.Parameterization;
import pojo.LaunchBrowser;
import pom.Homepage;
import pom.SharesTrading;
import pom.ZerodhaLoginPage;

public class SharesBuy extends BaseTest {

	
	@BeforeMethod
	public void searchandClickStock() throws EncryptedDocumentException, IOException, InterruptedException
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
		 Homepage homepage= new Homepage(driver);
		homepage.searchBox("TATA");
		homepage.searchandSelectStock(driver, "TATAPOWER");		
		homepage.searchBuyClick();
	}
	
	@Test
	public void buyShares() throws InterruptedException
	{
		SharesTrading sharestrading= new SharesTrading(driver);
		sharestrading.clickOnIntrday();
		sharestrading.sharesQty("10");
		sharestrading.clickonMarket();
		sharestrading.clickonBuy();
	}
}
