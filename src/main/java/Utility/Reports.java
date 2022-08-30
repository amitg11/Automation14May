package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {
	
	public static ExtentReports generateReport()
	{
		ExtentReports reports= new ExtentReports();
		ExtentSparkReporter htmlReporter= new ExtentSparkReporter("projectreport.html");
		reports.attachReporter(htmlReporter);
		reports.setSystemInfo("Suite", "Reporter");
		reports.setSystemInfo("Testedby", "Amit");
		return reports;
		
	}



	}


