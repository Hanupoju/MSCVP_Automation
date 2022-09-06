package com.amc.qa.testcases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amc.qa.Baseclass.TestBase;
import com.amc.qa.DBAutomation.DBDropdownValuesValidation;
import com.amc.qa.Utilities.DateUtilites;
import com.amc.qa.pages.AMCLoginPage;
import com.amc.qa.pages.TPVolumesPage;

public class TPVolumesTestCases extends TestBase{
	
	
	
	
	 @Test(enabled=false) 
//	  @Test(priority=1)
	  public void VerifyTPVolumesPage() throws InterruptedException {  
		 
		 
		  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  TPVolumesPage TPVolumes=new TPVolumesPage(driver);
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          TPVolumes.ClickonTPVolumes();
          Log.info("Successfully Logged into AMC Application");
          Thread.sleep(2000);
          TPVolumes.SelectTradingPartnerdropDown(property.getProperty("TradingPartnerDropdownOption"));
          Thread.sleep(2000);
          TPVolumes.SelectDocumentTypeDropdown(property.getProperty("DocumentTypeDropdownOption"));
          Thread.sleep(2000);
          TPVolumes.SelectStatusDropdown(property.getProperty("StatusDropDownOption"));
          Thread.sleep(2000);
          TPVolumes.ClickonGenerateButton();
          Thread.sleep(2000);      
          
		   
	  
	  
  }
  
	  @Test(enabled=false) 
//	  @Test(priority=2)
	  public void ValidateTradingPartnerDropDownOptions() throws Exception { 
		  	  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  TPVolumesPage TPVolumes=new TPVolumesPage(driver);
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          TPVolumes.ClickonTPVolumes();
          Log.info("Successfully Logged into AMC Application");
          Thread.sleep(2000);
          List<String> ExpectedDropdownValues= TPVolumes.validateTradingPartnerDropdownOptions();
          System.out.println(ExpectedDropdownValues);
          Thread.sleep(3000);        
          DBDropdownValuesValidation dbvalidation=new DBDropdownValuesValidation(driver);
	      List<String>ActualDropDownValues=dbvalidation.validateTPdropdownDBValidation(property.getProperty("DBURL"), property.getProperty("DBUserName"),property.getProperty("DBPassword"), property.getProperty("TPQuery"));
		  System.out.println(ActualDropDownValues);
          Assert.assertEquals(ActualDropDownValues,ExpectedDropdownValues);
          Log.info("Successfully Validated Trading partner Dropdown Options");
	  
  }
	  
	  @Test(enabled=true) 
//	  @Test(priority=1)
	  public void ValidateDocumentTypeDropDownOptions() throws Exception {  
		  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  TPVolumesPage TPVolumes=new TPVolumesPage(driver);
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          TPVolumes.ClickonTPVolumes();
          Thread.sleep(2000);
          List<String> ExpectedDropdownValues= TPVolumes.validateDocumentTypeDropdownOptions();  
          System.out.println(ExpectedDropdownValues); 
          DBDropdownValuesValidation dbvalidation=new DBDropdownValuesValidation(driver);
	      List<String>ActualDropDownValues=dbvalidation.validateDocumentTypedropdownDBValidation(property.getProperty("DBURL"), property.getProperty("DBUserName"),property.getProperty("DBPassword"), property.getProperty("TPDocumetTypeQuery"));
		  System.out.println(ActualDropDownValues);
          Assert.assertEquals(ActualDropDownValues,ExpectedDropdownValues);
          Log.info("Successfully Validated Document Type Dropdown Options");
           
	  
  }
	  @Test(enabled=false) 
//	  @Test(priority=1)
	  public void ValidateStatusDropDownOptions() throws Exception {  
		  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  TPVolumesPage TPVolumes=new TPVolumesPage(driver);
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          TPVolumes.ClickonTPVolumes();
          Thread.sleep(2000);
          List<String> ExpectedDropdownValues= TPVolumes.validateStatusDropdownOptions();  
          String DropdownOptions= property.getProperty("ActualStatusDropdownOptions");     
          Thread.sleep(3000);
          String[] DropdownOptionsSplit = DropdownOptions.split(",");
          List<String> ActualList = new ArrayList<String>(
          Arrays.asList(DropdownOptionsSplit));
          Assert.assertEquals(ActualList,ExpectedDropdownValues);
          Log.info("Successfully Validated Status Dropdown Options");
	 
          
	  }
	  
	  @Test(enabled=false) 
//	  @Test(priority=1)
      public void GenerateTPVolumesData() throws Exception {
	  
	  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
	  TPVolumesPage TPVolumes=new TPVolumesPage(driver);
	  DateUtilites date=new DateUtilites();
	  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
      Log.info("Successfully Logged into AMC Application");
      TPVolumes.ClickonTPVolumes();
      TPVolumes.ClickonDate();
      date.selectDate(property.getProperty("startingDate"));
      Thread.sleep(1000);
      date.selectDate(property.getProperty("EndingDate"));
      date.startDateSetTime(property.getProperty("StartDateHours"), property.getProperty("StartDateMintiues"));
      date.endDateSetTime(property.getProperty("EndDateHours"), property.getProperty("EndDateMintiues"));
      TPVolumes.ClickonApply();
      TPVolumes.SelectTradingPartnerdropDown(property.getProperty("TradingPartnerDropdownOption"));
      Thread.sleep(1000);
      TPVolumes.SelectDocumentTypeDropdown(property.getProperty("DocumentTypeDropdownOption"));
      Thread.sleep(1000);
      TPVolumes.SelectStatusDropdown(property.getProperty("StatusDropDownOption"));
      Thread.sleep(1000);
      TPVolumes.ClickonGenerateButton();
      Thread.sleep(1000);
                            
  
}
  

	  
	  
	  
	  
	  
	  
	  
	  
	  

	  
	    
	
	  
	  
	  
	
	
	
}
