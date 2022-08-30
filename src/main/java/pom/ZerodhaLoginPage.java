package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {
@FindBy(xpath="//input[@type='text']")private WebElement user;
@FindBy(xpath="//input[@type='password']")private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement submit;
@FindBy(xpath="//input[@type='password']")private WebElement submitpin;
@FindBy(xpath="//button[@type='submit']")private WebElement submitclick;
//@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement Signup;

public ZerodhaLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterUsername(String username)
{
	user.sendKeys(username);
}
public void entePass(String pass1)
{
	password.sendKeys(pass1);
}
public void submitclick()
{
	submit.click();
}
public void enterPin(String pin)
{
	submitpin.sendKeys(pin);
}
public void clickSub()
{
	submitclick.click();
}
//public void forgotUIDPass()
//{
//	forgot.click();
//}
public void Signup(WebDriver driver)
{
	Signup.click();	
}

}