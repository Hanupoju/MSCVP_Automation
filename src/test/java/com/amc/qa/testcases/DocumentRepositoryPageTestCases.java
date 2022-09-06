package com.amc.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.amc.qa.Baseclass.TestBase;
import com.amc.qa.Constants.Constants;
import com.amc.qa.pages.AMCLoginPage;
import com.amc.qa.pages.DocumentRepositoryPage;

public class DocumentRepositoryPageTestCases  extends TestBase{
	
	
	@Test(priority=0)
	public void verifyDocmentRepositoryPageTitle() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		drp.clickonDocumentRepositoryBtn();
		String ActualTitle=drp.verifytheDocumentRepositoryTitle();
		Assert.assertEquals(ActualTitle, Constants.DocmentRepository_PageTitle,"Document Repository Page Title verified Successfully");
		
	}

	
	@Test(priority=1)
	public void ValidateDocRepositoryDataBaseRadioBtns() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		boolean LiveRadioBtnStatus=drp.ValidateDocRepositoryDataBaseLiveRadioBtn();
		Assert.assertTrue(LiveRadioBtnStatus, "By Default Live Radio button in Selected State");
		boolean ArchiveRadioBtnStatus=drp.ValidateDocRepositoryDataBaseArchiveRadioBtn();
		Assert.assertFalse(ArchiveRadioBtnStatus, "Archive Radio button is not in Selected State");
	}
	
	
	
	@Test(priority=2)
	public void ValidateDocRepositoryAddFilterBtnAlertMessage() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		String ActualAlertMessge=drp.validateDocRepositoryAddFilterAlertMessage();
		Assert.assertEquals(ActualAlertMessge, Constants.Alert_Message,"Clicking the Add Filter button more than 3 time, then user got the Alert Message");
	
	}
	
	
	@Test(priority=3)
	public void ValidateDocRepositoryDocumentTypedropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= drp.validateDocumentTypeDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
	
	
	
	
	@Test(priority=4)
	public void ValidateDocRepositorySenderdropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= drp.validateSenderDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
	
	
	@Test(priority=5)
	public void ValidateDocRepositoryReceiverdropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= drp.validateRecevierDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
	
	
	@Test(priority=6)
	public void ValidateDocRepositoryWarHousedropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= drp.validateWarhouseDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
	
	
	@Test(priority=8)
	public void ValidateDocRepositoryStatusdropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= drp.validateStatusDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
   }
	
	@Test(priority=7)
	public void ValidateDocRepositoryCorrelationdropdown() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
		DocumentRepositoryPage drp=new DocumentRepositoryPage(driver);
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		List<String> ExpectedDropdownValues= drp.validateCorrelationDropdownOptions();
	    System.out.println(ExpectedDropdownValues);
	}
}
