package com.amc.qa.Reports;


import com.amc.qa.Baseclass.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportSetup extends TestBase
{	
	public static ExtentReports extent;
	public static ExtentTest extentTest;
	public static ExtentSparkReporter sparkReport;
	
	public static ExtentReports extentReportSetup()
	{
		sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"/AMCExtentResults/AMCExtentReports.html");
		
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		sparkReport.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setReportName("AMC Test Automation Report");
		sparkReport.config().setDocumentTitle("AMC Test Automation Report");
		
		
		return extent;
	}
	
	
}
