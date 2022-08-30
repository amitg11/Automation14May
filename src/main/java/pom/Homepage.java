package pom;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	@FindBy(xpath="//input[@type='text']") private WebElement search;
	@FindBy(xpath="//span[@class='tradingsymbol']") private List<WebElement> searchstock;
	@FindBy(xpath="//button[@data-balloon='Buy']") private WebElement searchBuy;
	@FindBy(xpath="//button[@data-balloon='Sell']") private WebElement searchsell;
	@FindBy(xpath="//button[@data-balloon='Market depth widget']")private WebElement searchMarketdepth;
	@FindBy(xpath="//span[@class='icon icon-plus']") private WebElement watchlist;
	@FindBy(xpath="//span[@class='nice-name']")private List<WebElement> Removestock;
	@FindBy(xpath="//span[@class='icon icon-trash']") private WebElement delete;

	WebDriver driver;
public Homepage(WebDriver driver) 
{
	
	PageFactory.initElements(driver, this);
	
}
public void searchBox(String anystockname)throws InterruptedException
{
	Thread.sleep(3000);
	search.sendKeys(anystockname);	
	
}
public int searchResultNumber()
{
	int listsize= searchstock.size();
	return listsize;
}

public int searchandDelete()
{
	int totalstock= Removestock.size();
	return totalstock;
}
public void searchDesiredStock(WebDriver driver, String Requiredstoc) {
	for(int a = 0;a<Removestock.size();a++) {
		WebElement p=Removestock.get(a);
		String StockNam= p.getText();
		if(StockNam.equals(Requiredstoc))
		{
			Actions action = new Actions(driver);
			action.moveToElement(p);
			action.perform();
			break;
			
		}
	}
}
//public void searchandRemoveStock(WebDriver driver, String toberemoveStock )
//{
//	for(int b=0;b<Removestock.size();b++)
//	{
//		WebElement d=Removestock.get(b);
//		String stockname= d.getText();
//		if(stockname.equals(toberemoveStock))
//		{
//			Actions action= new Actions(driver);
//			action.moveToElement(d);
//			action.perform();
//			break;
//		}
//	}
//}
public void deleteStock() throws InterruptedException
{

//	Thread.sleep(3000);
	delete.click();
}

public void searchandSelectStock(WebDriver driver, String requiredstock )
{
	for(int a=0; a<searchstock.size();a++)
	{
		WebElement p= searchstock.get(a);
		String stockname= p.getText();
		if(stockname.equals(requiredstock))
		{
			Actions action= new Actions(driver);
			action.moveToElement(p);
			action.perform();
			break;
					
		}
	}
}
	
public void searchBuyClick()
{
searchBuy.click();
}
public void forwatchList()
{
	watchlist.click();
}



}
