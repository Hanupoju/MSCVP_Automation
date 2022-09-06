package com.amc.qa.testcases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amc.qa.Baseclass.TestBase;
import com.amc.qa.DBAutomation.DBDropdownValuesValidation;
import com.amc.qa.Utilities.DateUtilites;
import com.amc.qa.pages.AMCLoginPage;
import com.amc.qa.pages.WarHouseVolumesPage;


public class WarHouseVolumePageTestCases extends TestBase{
	

	  @Test(enabled=false)   
//	  @Test(priority=0)
	  public void generateWarHouseVolumeData() throws Exception {  
		  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  WarHouseVolumesPage whv=new WarHouseVolumesPage(driver);
		  DateUtilites date=new DateUtilites();
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          whv.clickOnWarHouseVolumes();
          Log.info("Successfully Clicked WarHouse volumes button");
          whv.ClickonDate();
          Log.info("Successfully Clicked Date Text Box");
          date.selectDate(property.getProperty("startingDate"));
          Log.info("Successfully Selected Starting date");
          date.selectDate(property.getProperty("EndingDate"));
          Log.info("Successfully Selected Ending date");
          date.startDateSetTime(property.getProperty("startDateHours"),property.getProperty("StartDateMintiues"));
          Log.info("Successfully Selected Starting date set Time");
          date.endDateSetTime(property.getProperty("EndDateHours"),property.getProperty("EndDateMintiues"));
          Log.info("Successfully Selected ending date set Time");
          whv.ClickonApply();
          Log.info("Successfully clicked apply button");
          whv.selectWMSsystemdropDown(property.getProperty("WMSSystemDropdownOption"));
          Thread.sleep(1000);
          Log.info("Successfully selected WMS System dropdown ");
          whv.selectWarehousedropDown(property.getProperty("WarehouseDropdownOption"));
          Thread.sleep(1000);
          Log.info("Successfully selected Warehouse dropdown ");
          whv.selectDocumentTypedropDown(property.getProperty("WarehouseDocumnentTypeOption"));
          Thread.sleep(1000);
          Log.info("Successfully selected DocumentType dropdown ");
          whv.selectStatusdropDown(property.getProperty("WarehouseStatusDropDownOption"));
          Thread.sleep(1000);
          Log.info("Successfully selected Status dropdown ");
          whv.clickOnGenerateButton(); 
          Log.info("Successfully Clicking on Generate button");
           	  
  }
	  @Test(enabled=false) 
//	  @Test(priority=1)
	  public void validateWMSSystemDropDownValues() throws Exception {  
		  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  WarHouseVolumesPage whv=new WarHouseVolumesPage(driver);
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          whv.clickOnWarHouseVolumes();
          Thread.sleep(1000);
          List<String> ExpectedDropdownValues= whv.validateWMSSystemDropdownOptions(); 
          System.out.println(ExpectedDropdownValues);
          Thread.sleep(3000);        
          DBDropdownValuesValidation dbvalidation=new DBDropdownValuesValidation(driver);
	      List<String>ActualDropDownValues=dbvalidation.validateWarehouseVolumeWMSSystemdropdownDBValidation(property.getProperty("DBURL"), property.getProperty("DBUserName"),property.getProperty("DBPassword"), property.getProperty("WMSSystemQuery"));
		  System.out.println(ActualDropDownValues);
          Assert.assertEquals(ActualDropDownValues,ExpectedDropdownValues);
          Log.info("Successfully Validated WMS System Dropdown Options");
  
          
           	  
  }
	  	  
	  
      @Test(enabled=false)     
//	  @Test(priority=2)
	  public void validateWarehoueDropDownValues() throws Exception {  
		  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  WarHouseVolumesPage whv=new WarHouseVolumesPage(driver);
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          whv.clickOnWarHouseVolumes();
          Thread.sleep(1000);
          List<String> ExpectedDropdownValues= whv.validateWarhouseDropdownOptions(); 
          System.out.println(ExpectedDropdownValues);
          Thread.sleep(3000);        
          DBDropdownValuesValidation dbvalidation=new DBDropdownValuesValidation(driver);
	      List<String>ActualDropDownValues=dbvalidation.validateWarehouseVolumeWarhousedropdownDBValidation(property.getProperty("DBURL"), property.getProperty("DBUserName"),property.getProperty("DBPassword"), property.getProperty("warHouseQuery"));
		  System.out.println(ActualDropDownValues);
          Assert.assertEquals(ActualDropDownValues,ExpectedDropdownValues);
          Log.info("Successfully Validated Warhouse Dropdown Options");
           	  
  }
	  
      @Test(enabled=false)     
//	  @Test(priority=3)
	  public void validateDocumentTypeDropDownOptions() throws Exception {  
		  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  WarHouseVolumesPage whv=new WarHouseVolumesPage(driver);
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          whv.clickOnWarHouseVolumes();
          Thread.sleep(1000);
          List<String> ExpectedDropdownValues= whv.validateDocumentTypeDropdownOptions(); 
          System.out.println(ExpectedDropdownValues);
          System.out.println(ExpectedDropdownValues);
          Thread.sleep(3000);        
          DBDropdownValuesValidation dbvalidation=new DBDropdownValuesValidation(driver);
	      List<String>ActualDropDownValues=dbvalidation.validateDocumentTypedropdownDBValidation(property.getProperty("DBURL"), property.getProperty("DBUserName"),property.getProperty("DBPassword"), property.getProperty("TPDocumetTypeQuery"));
		  System.out.println(ActualDropDownValues);
          Assert.assertEquals(ActualDropDownValues,ExpectedDropdownValues);
          Log.info("Successfully Validated Document Type Dropdown Options");
	  
  }
	 
	  
      @Test(enabled=true)     
//	  @Test(priority=4)
	  public void validateStatusDropDownOptions() throws Exception {  
		  
		  AMCLoginPage AMCLogin=new AMCLoginPage(driver);
		  WarHouseVolumesPage whv=new WarHouseVolumesPage(driver);
		  AMCLogin.login(property.getProperty("UserName"), property.getProperty("Password"));
          Log.info("Successfully Logged into AMC Application");
          whv.clickOnWarHouseVolumes();
          Thread.sleep(1000);
          List<String> ExpectedDropdownValues= whv.validateStatusDropdownOptions();
          System.out.println(ExpectedDropdownValues);
          String DropdownOptions= property.getProperty("StatusDropDownOptions");  
          System.out.println(DropdownOptions);
          Thread.sleep(3000);
          String[] DropdownOptionsSplit = DropdownOptions.split(",");
          List<String> ActualList = new ArrayList<String>(
          Arrays.asList(DropdownOptionsSplit));
          Assert.assertEquals(ActualList,ExpectedDropdownValues);
          Log.info("Successfully Verified Status Dropdown Options");
	 
          
	  }
}
