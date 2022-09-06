package com.amc.qa.DBAutomation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amc.qa.Baseclass.TestBase;
	
public class DBDropdownValuesValidation extends TestBase{

		
		WebDriver driver;
		
		@FindBy(id="input_username")
		WebElement DBusername;
		
		@FindBy(id="input_password")
		WebElement DBpassword;
		
		@FindBy(id="input_go")
		WebElement DBsign;
		
		@FindBy(xpath="(//a[@class='nav-link text-nowrap' or @class='icon ic_b_sql'])[3]")
		WebElement SqlIcon;
		
		@FindBy(id="sqlquery")
		WebElement SqlQuery;
		
		@FindBy(xpath="//*[@class='btn btn-primary ms-1']")
		WebElement GoButton;
		
		
		@FindBy(xpath="//*[@class='data text pre_wrap']") 
		List<WebElement> TPdropdropdownValues;
		
		@FindBy(xpath="	(//*[@name='navig' and @class='btn btn-secondary aja'])[4]") 
		WebElement clickforwordbtn;
		
		@FindBy(xpath="//*[@class='data grid_edit click2 text pre_wrap']") 
		List<WebElement> DocumentTypedropdropdownValues;
	
		@FindBy(xpath="//*[@class='data grid_edit click2 text pre_wrap condition']") 
		List<WebElement> WMSSystemdropdropdownValues;
		
		@FindBy(xpath="//*[@class='data grid_edit click2 text pre_wrap condition']") 
		List<WebElement> warhousedropdropdownValues;
	
		
		
		public  DBDropdownValuesValidation(WebDriver driver)
		{
	    	this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
	    public List<String> validateTPdropdownDBValidation(String DB_URL,String DBUser,String DBPasswrd,String Query) throws InterruptedException{
	    	
	    	driver.get(DB_URL);
	    	DBusername.sendKeys(DBUser);
	    	DBpassword.sendKeys(DBPasswrd);
	    	DBsign.click();
	    	Thread.sleep(5000);
	    	SqlIcon.click();
	    	Thread.sleep(3000);
	    	SqlQuery.clear();
	    	Thread.sleep(2000);
	    	SqlQuery.sendKeys(Query);
	    	Thread.sleep(5000);
	    	GoButton.click();
	    	Thread.sleep(5000);
	    	List<WebElement> list = TPdropdropdownValues; 
		  	  List<String> ExpectedDropDownValues = new ArrayList<String>();
		  	  
               for(WebElement listOfDropDownValues : list) 
		 		{
		 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
		 			
		 		}
               
                  ExpectedDropDownValues.add("All");
                  Collections.sort(ExpectedDropDownValues);
		 		
		 		   return ExpectedDropDownValues;
		  	   
		     }
	    
	    
	    
  public List<String> validateDocumentTypedropdownDBValidation(String DB_URL,String DBUser,String DBPasswrd,String Query) throws InterruptedException{
	    	
	    	driver.get(DB_URL);
	    	DBusername.sendKeys(DBUser);
	    	DBpassword.sendKeys(DBPasswrd);
	    	DBsign.click();
	    	Thread.sleep(5000);
	    	SqlIcon.click();
	    	Thread.sleep(3000);
	    	SqlQuery.clear();
	    	Thread.sleep(2000);
	    	SqlQuery.sendKeys(Query);
	    	Thread.sleep(5000);
	    	GoButton.click();
	    	Thread.sleep(5000);
	    	List<WebElement> list = DocumentTypedropdropdownValues; 
		  	  List<String> ExpectedDropDownValues = new ArrayList<String>();
		  	  
               for(WebElement listOfDropDownValues : list) 
		 		{
		 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
		 			
		 		}
               
                  ExpectedDropDownValues.add("Select");
                  Collections.sort(ExpectedDropDownValues);
		 		
		 		   return ExpectedDropDownValues;
		  	   
		     }
  
  
  
  
  public List<String> validateWarehouseVolumeWMSSystemdropdownDBValidation(String DB_URL,String DBUser,String DBPasswrd,String Query) throws InterruptedException{
  	
  	driver.get(DB_URL);
  	DBusername.sendKeys(DBUser);
  	DBpassword.sendKeys(DBPasswrd);
  	DBsign.click();
  	Thread.sleep(5000);
  	SqlIcon.click();
  	Thread.sleep(3000);
  	SqlQuery.clear();
  	Thread.sleep(2000);
  	SqlQuery.sendKeys(Query);
  	Thread.sleep(5000);
  	GoButton.click();
  	Thread.sleep(5000);
  	List<WebElement> list = WMSSystemdropdropdownValues; 
	  	  List<String> ExpectedDropDownValues = new ArrayList<String>();
	  	  
         for(WebElement listOfDropDownValues : list) 
	 		{
	 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
	 			
	 		}
         
            ExpectedDropDownValues.add("All");
            Collections.sort(ExpectedDropDownValues);
	 		
	 		   return ExpectedDropDownValues;
	  	   
	     }
  

  public List<String> validateWarehouseVolumeWarhousedropdownDBValidation(String DB_URL,String DBUser,String DBPasswrd,String Query) throws InterruptedException{
	  	
	  	driver.get(DB_URL);
	  	DBusername.sendKeys(DBUser);
	  	DBpassword.sendKeys(DBPasswrd);
	  	DBsign.click();
	  	Thread.sleep(5000);
	  	SqlIcon.click();
	  	Thread.sleep(3000);
	  	SqlQuery.clear();
	  	Thread.sleep(2000);
	  	SqlQuery.sendKeys(Query);
	  	Thread.sleep(5000);
	  	GoButton.click();
	  	Thread.sleep(5000);
	  	List<WebElement> list = warhousedropdropdownValues; 
		  	  List<String> ExpectedDropDownValues = new ArrayList<String>();
		  	  
	         for(WebElement listOfDropDownValues : list) 
		 		{
		 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
		 			
		 		}
	         
	            ExpectedDropDownValues.add("All");
	            Collections.sort(ExpectedDropDownValues);
		 		
		 		   return ExpectedDropDownValues;
		  	   
		     }
	    		    	    	
}

