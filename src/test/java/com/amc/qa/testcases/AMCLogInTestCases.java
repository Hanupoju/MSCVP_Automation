package com.amc.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.amc.qa.Baseclass.TestBase;
import com.amc.qa.Constants.Constants;
import com.amc.qa.pages.AMCLoginPage;


public class AMCLogInTestCases extends TestBase{

	
	
	@Test(priority=0)
	public void LoginwithValidCredenticals() throws IOException, InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);
			
		amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		
		
	}
	
	
	@Test(priority=1)
	public void LoginwithInvalidCredentials() throws InterruptedException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);	
		
		amc.login(property.getProperty("InvalidUserName"), property.getProperty("InvalidPassword"));
		
		String AuthenticationError=amc.AuthenticationError();
	    
	    Assert.assertEquals(AuthenticationError,Constants.authenticationError);
	    
	    Log.info("Authentication error verified");
	
			
	}
	
	@Test(priority=2)
	public void VerifyForgotUsernameButton() throws InterruptedException, IOException {
		
		AMCLoginPage amc=new AMCLoginPage(driver);	
	    amc.clickforgotuserid();
		
		Thread.sleep(3000);
		
		amc.verifyforgotUserNamePopup();
	
	    driver.findElement(By.xpath("//input[@placeholder='Enter email id']")).sendKeys(property.getProperty("Email"));
	    
	    driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
	    
	    Thread.sleep(3000);
	    
	    String EmailErrorMessage=driver.findElement(By.xpath("//*[contains(text(),'Email is not existed. Please try again.')]")).getText();
	    
	    Assert.assertEquals(EmailErrorMessage,Constants.EmailAlert);
	
			
	}
	
	@Test(priority=4)
	
	public void VerifyTPVolumes() throws Exception {
		
		
		AMCLoginPage amc=new AMCLoginPage(driver);	
	    amc.login(property.getProperty("UserName"), property.getProperty("Password"));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'TP Volumes')]")).click();
		
		String TPVolumesHeader=driver.findElement(By.xpath("//h1[contains(text(),'TP Volumes')]")).getText();	
		Assert.assertEquals(TPVolumesHeader, "TP Volumes");
		

	
			
	}
	
	
	@Test(priority=3)
	
	public void VerifyForgotPasswordButton() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[contains(text(),'Forgot Password ?')]")).click();
		
		Thread.sleep(3000);
		
		String forgotUserName=driver.findElement(By.xpath("//span[contains(text(),'Forgot Password')]")).getText();
	    
	    Assert.assertEquals(forgotUserName, "Forgot Password");	
	    
	    driver.findElement(By.xpath("//input[@placeholder='Enter email id']")).sendKeys(property.getProperty("Email"));
	    
	    driver.findElement(By.xpath("//*[contains(text(),'Submit')]")).click();
	    
	    Thread.sleep(3000);
	    
	    String EmailErrorMessage=driver.findElement(By.xpath("//*[contains(text(),'Email is not existed. Please try again.')]")).getText();
	    
	    Assert.assertEquals(EmailErrorMessage,Constants.EmailAlert);
	
			
	}
//	
		

	
@Test(priority=3)
	
	public void DailyStatus() throws InterruptedException {
		
	AMCLoginPage amc=new AMCLoginPage(driver);	
    amc.login(property.getProperty("UserName"), property.getProperty("Password"));
	Thread.sleep(2000);

	
		
		
	
			
	}
	

}
