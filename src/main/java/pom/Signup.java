package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	
	@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement Signup;
	@FindBy(xpath="//button[@type='submit']")private WebElement clickcontinue;
	public Signup(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);	
	}

	public void signupPage(WebDriver driver) throws InterruptedException
	{
	
		Signup.click();

	}
	public void mobno(WebDriver driver)
	{
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> i= handles.iterator();
		while(i.hasNext())
		{
			String forswitch= i.next();
			driver.switchTo().window(forswitch);
			String currenttitle= driver.getTitle();
			
		if(currenttitle.equals("Signup and open a Zerodha trading and demat account online and start investing � Zerodha"))
			{
			WebElement mobno=driver.findElement(By.xpath("//input[@id='user_mobile']"));
			mobno.sendKeys("1234");
			}
		}
	}
		public void clickCon()
		{
			clickcontinue.click();
		}
		
	}



