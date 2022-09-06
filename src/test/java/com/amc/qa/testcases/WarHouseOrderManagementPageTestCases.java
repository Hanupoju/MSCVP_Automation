package com.amc.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amc.qa.Baseclass.TestBase;
import com.amc.qa.Constants.Constants;
import com.amc.qa.pages.AMCLoginPage;
import com.amc.qa.pages.WarHouseOrderManagementPage;

public class WarHouseOrderManagementPageTestCases extends TestBase{
	
	@Test(priority=0)
	public void verifyDocmentRepositoryPageTitle() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		whom.clickonWarHouseOrderManagementBtn();
		String ActualTitle=whom.verifytheWarHouseOrderManagementTitle();
		Assert.assertEquals(ActualTitle, Constants.Warehouse_Management_PageTitle,"War house order management Page Title verified Successfully");
		
	}

	
	@Test(priority=1)
	public void validateWarHouseOrderManagementdataBaseRadioBtns() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		whom.clickonWarHouseOrderManagementBtn();
		boolean LiveRadioBtnStatus=whom.validateWarHouseOrderManagementDataBaseLiveRadioBtn();
		Assert.assertTrue(LiveRadioBtnStatus, "By Default Live Radio button in Selected State");
		boolean ArchiveRadioBtnStatus=whom.validateWarHouseOrderManagementDataBaseArchiveRadioBtn();
		Assert.assertFalse(ArchiveRadioBtnStatus, "Archive Radio button is not in Selected State");
	}
		
	
	@Test(priority=2)
	public void validateWarHouseOrderManagementAddFilterBtnAlertMessage() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		whom.clickonWarHouseOrderManagementBtn();
		String ActualAlertMessge=whom.validateWarHouseOrderManagementAddFilterAlertMessage();
		Assert.assertEquals(ActualAlertMessge, Constants.Alert_Message,"Clicking the Add Filter button more than 3 time, then user got the Alert Message");
	
	}
	
	
	@Test(priority=3)
	public void validateWarHouseOrderManagementDocumentTypedropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		whom.clickonWarHouseOrderManagementBtn();
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= whom.validateDocumentTypeDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
	
	
	
	
	@Test(priority=4)
	public void validateWarHouseOrderManagementSenderdropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		whom.clickonWarHouseOrderManagementBtn();
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= whom.validateSenderDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
	
	
	@Test(priority=5)
	public void validateWarHouseOrderManagementReceiverdropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		whom.clickonWarHouseOrderManagementBtn();
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= whom.validateRecevierDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
	
	
	@Test(priority=6)
	public void validateWarHouseOrderManagementWarHousedropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		whom.clickonWarHouseOrderManagementBtn();
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= whom.validateWarhouseDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
	
	
	@Test(priority=8)
	public void validateWarHouseOrderManagementStatusdropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		whom.clickonWarHouseOrderManagementBtn();
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= whom.validateStatusDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
   }
	
	@Test(priority=7)
	public void validateWarHouseOrderManagementCorrelationdropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		WarHouseOrderManagementPage whom=new WarHouseOrderManagementPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		whom.clickonWarHouseOrderManagementBtn();
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= whom.validateCorrelationDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
}


