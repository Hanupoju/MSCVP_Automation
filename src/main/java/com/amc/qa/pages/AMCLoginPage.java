package com.amc.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amc.qa.Baseclass.TestBase;

public class AMCLoginPage extends TestBase{

		
		WebDriver driver;
		
		@FindBy(id="loginId")
		WebElement username;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(xpath="//span[contains(text(),'Sign In')]") 
		WebElement SignInButton;
		
		@FindBy(xpath="//*[contains(text(),'Authentication Failed: Invalid Username or Password')]") 
		WebElement AuthenticationError;
		
		@FindBy(xpath="//*[contains(text(),' Forgot Username ?')]") 
		WebElement forgotUserId;
		
		@FindBy(xpath="//span[contains(text(),'Forgot Username')]") 
		WebElement forgotUserNamepopup;
		
		
		
		
		
		public  AMCLoginPage(WebDriver driver)
		{
	    	 this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
	    public void login(String uname,String passwrd) throws InterruptedException {
	    	
	    	username.sendKeys(uname);
	    	password.sendKeys(passwrd);
	    	SignInButton.click();
	    	Thread.sleep(2000);
	    	
	    	
	    }
	
	    public String AuthenticationError() {
	    	
	    	return AuthenticationError.getText();
	    	
	    }
	    
	    
	    public void clickforgotuserid() {
	    	
	    	forgotUserId.click();
	    	
	    }
	    
	    
         public boolean verifyforgotUserNamePopup() {
	    	
        	  return forgotUserNamepopup.isDisplayed();
	    	
	    }
	    
	

	}

