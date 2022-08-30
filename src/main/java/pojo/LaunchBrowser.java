package pojo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LaunchBrowser {

	public static WebDriver chromeBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\selenium-server\\chrome webdriver\\chromedriver.exe");
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.navigate().to(url);
	//	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		return driver;
		
	}
	
}