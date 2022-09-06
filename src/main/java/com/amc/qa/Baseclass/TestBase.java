package com.amc.qa.Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.amc.qa.Constants.Constants;
import com.amc.qa.Utilities.TestUtility;
import com.amc.qa.Utilities.WebEventListener;

public class TestBase {
	
	public static WebDriver driver; 
	public static Properties property;
	public static ChromeOptions chromeOptions;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static Logger Log;
	public  Connection con;
	public TestBase()
	{
		Log = Logger.getLogger(this.getClass());
		try 
		{
			property = new Properties();
			FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
			property.load(inputStream);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	@BeforeMethod(alwaysRun=true)
	public void setUp()
	{
		initialization();
				
		
	}
	
	

	public void dbConnection(String Query) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		/*
		 * String Url=property.getProperty("DBURL"); String
		 * dbUserName=property.getProperty("DBUser"); String
		 * dbPassword=property.getProperty("DBPassword"); String
		 * JDBCDribver=property.getProperty("JDBCDriver"); System.out.println(Url);
		 * System.out.println(dbUserName); System.out.println(dbPassword);
		 * System.out.println(JDBCDribver);
		 */
		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con = DriverManager.getConnection("jdbc:mysql://mysql:3306/mscvp?zeroDateTimeBehavior=convertToNull&serverTimezone=UTC",
				"mscvpedi","password");	
		Statement stmt = con.createStatement();
		ResultSet rs=stmt.executeQuery("SELECT id, name FROM tp ORDER BY name ASC");
		while (rs.next()){
    			
			System.out.println(rs);
        }		
		con.close();
	}
	
	
	
	@BeforeTest
	public void setLog4j()
	{
		TestUtility.setDateForLog4j();
	}
	
	public static void initialization()
	{
	
		chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
		driver = new ChromeDriver(chromeOptions);
		
		e_driver = new EventFiringWebDriver(driver);
		
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(property.getProperty("DevURL"));
	}
	
	@AfterTest
	public void endReport()
	{
		
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() throws IOException, SQLException
	{
		driver.quit();
		
		Log.info("Browser Terminated");
		Log.info("-----------------------------------------------");
	}

}
