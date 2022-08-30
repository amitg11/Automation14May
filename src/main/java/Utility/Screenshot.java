package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import pojo.LaunchBrowser;

public class Screenshot {
	
	public static void page(WebDriver driver,  String name) throws IOException {
		TakesScreenshot screenshot=	((TakesScreenshot)driver);
		File source= screenshot.getScreenshotAs(OutputType.FILE);
		File destination= new File("C:\\Users\\Amit\\eclipse-workspace\\KiteZerodha\\Screenshot\\fail1.png");
		FileHandler.copy(source, destination);
		
	}
	
}
