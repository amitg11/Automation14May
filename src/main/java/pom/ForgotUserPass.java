package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotUserPass {
	@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
	@FindBy(xpath="//label[@for='radio-30']")private WebElement radioclick;
	@FindBy(xpath="//button[@type='submit']")private WebElement resetclick;

	public ForgotUserPass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void forgotUIDPass()
	{
		forgot.click();
	}
	public void clickRadio()
	{
		radioclick.click();
	}
	public void clickReset()
	{
		resetclick.click();
	}
}
