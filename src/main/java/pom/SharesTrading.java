package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SharesTrading {
	

	@FindBy(xpath="//label[@for='radio-180']") private WebElement  IntradayRadio;
	@FindBy(xpath="//input[@type='number'][1]") private WebElement shareqty;
	@FindBy(xpath="//label[@for='radio-108']") private WebElement marketradio;
	@FindBy(xpath="//button[@type='submit']")private WebElement buybutton;
public SharesTrading(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
public void clickOnIntrday() throws InterruptedException
{
	Thread.sleep(3000);
	IntradayRadio.click();
}

public void sharesQty(String numbers)
{
	shareqty.sendKeys(numbers);
}
public void clickonMarket()
{
	marketradio.click();
}
public void clickonBuy()
{
	buybutton.click();
}
}