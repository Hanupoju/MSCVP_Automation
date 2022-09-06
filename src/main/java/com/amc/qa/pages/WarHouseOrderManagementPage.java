package com.amc.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amc.qa.Baseclass.TestBase;

public class WarHouseOrderManagementPage extends TestBase{
	
	
	    WebDriver driver;
		
	    @FindBy(xpath="//*[@class='layout-menuitem-text'][contains(text(),'Warehouse Order Management')]") 
		WebElement WarHouseOrderManagementbtn;
		
		@FindBy(xpath="//*[@class='title'][contains(text(),'Warehouse Order Management')]") 	
		WebElement WarHouseOrderManagementTitle;
		
		@FindBy(xpath="(//*[@ng-reflect-model='LIVE'or @ng-reflect-model='ARCHIV'])[1]") 	
		WebElement LiveRadioBtn;
		@FindBy(xpath="(//*[@ng-reflect-model='LIVE'or @ng-reflect-model='ARCHIV'])[2]") 	
		WebElement ArchiveRadioBtn;
		@FindBy(xpath="//*[@class='ui-button-text ui-clickable'][contains(text(),'Add Filter')]") 	
		WebElement AddFilterBtn;
	    @FindBy(xpath="(//p-dropdown)[1]") 	
		WebElement DocumentTypedropdown;
		@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
		List<WebElement> DocumentTypedropdownOptions;
		@FindBy(xpath="(//p-dropdown)[2]") 	
		WebElement Senderdropdown;
		@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
		List<WebElement> SenderdropdownOptions;
		@FindBy(xpath="(//p-dropdown)[3]") 	
		WebElement Receiverdropdown;
		@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
		List<WebElement> ReceiverdropdownOptions;
		@FindBy(xpath="(//p-dropdown)[4]") 	
		WebElement Warhousedropdown;
		@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
		List<WebElement> WarhousedropdownOptions;
		@FindBy(xpath="(//p-dropdown)[5]") 	
		WebElement Statusdropdown;
		@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
		List<WebElement> StatusdropdownOptions;
		@FindBy(xpath="(//p-dropdown)[6]") 	
		WebElement Correlationdropdown;
		@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
		List<WebElement> CorrelationdropdownOptions;
		
		
		
		
		
		
		 		
		
		public  WarHouseOrderManagementPage(WebDriver driver)
		{
	    	 this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
		public void clickonWarHouseOrderManagementBtn()
		{
			WarHouseOrderManagementbtn.click();
		}
		
		public String verifytheWarHouseOrderManagementTitle() {
			
			String WarHouseOrderManagementPageTitle=WarHouseOrderManagementTitle.getText();
			
			return WarHouseOrderManagementPageTitle;
			
		}
	
		
		public  boolean validateWarHouseOrderManagementDataBaseLiveRadioBtn() throws InterruptedException {
			
		      boolean radioselectState=LiveRadioBtn.isSelected();
		      return radioselectState;

				
		}

		
		public  boolean validateWarHouseOrderManagementDataBaseArchiveRadioBtn() throws InterruptedException {
			
			  boolean archiveselectState=ArchiveRadioBtn.isSelected();
			  return archiveselectState;
}



		public String validateWarHouseOrderManagementAddFilterAlertMessage() throws InterruptedException {
			
		    	for(int i=0;i<3;i++) {
				AddFilterBtn.click();
				Thread.sleep(2000);
			}
		    	
		        String getData=driver.switchTo().alert().getText();
		        
		        return getData;
			
			
		} 
		
		
		
		 public  List<String> validateDocumentTypeDropdownOptions() throws InterruptedException {
		  	   
		       DocumentTypedropdown.click(); 	    
		  	   List<WebElement> list = DocumentTypedropdownOptions; 
		  	   List<String> ExpectedDropDownValues = new ArrayList<String>();

		 		for(WebElement listOfDropDownValues : list) 
		 		{
		 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
		 		}
		 		 return ExpectedDropDownValues;
		  	   
		     }
		     
		 
		 public  List<String> validateSenderDropdownOptions() throws InterruptedException {
		  	   
		       Senderdropdown.click(); 	    
		  	   List<WebElement> list = SenderdropdownOptions; 
		  	   List<String> ExpectedDropDownValues = new ArrayList<String>();

		 		for(WebElement listOfDropDownValues : list) 
		 		{
		 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
		 		}
		 		 return ExpectedDropDownValues;
		  	   
		     }



		    public List<String> validateRecevierDropdownOptions() {
		   	   Receiverdropdown.click(); 	    
		  	   List<WebElement> list =  ReceiverdropdownOptions; 
		  	   List<String> ExpectedDropDownValues = new ArrayList<String>();

		 		for(WebElement listOfDropDownValues : list) 
		 		{
		 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
		 		}
		 		 return ExpectedDropDownValues;
		  	   
		     }

		    
		    public List<String> validateWarhouseDropdownOptions() {
		    	   Warhousedropdown.click(); 	    
			  	   List<WebElement> list =  WarhousedropdownOptions; 
			  	   List<String> ExpectedDropDownValues = new ArrayList<String>();

			 		for(WebElement listOfDropDownValues : list) 
			 		{
			 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
			 		}
			 		 return ExpectedDropDownValues;
			  	   
			     }
		    
		    
		    
		    public List<String> validateStatusDropdownOptions() {
		    	   Statusdropdown.click(); 	    
			  	   List<WebElement> list = StatusdropdownOptions; 
			  	   List<String> ExpectedDropDownValues = new ArrayList<String>();

			 		for(WebElement listOfDropDownValues : list) 
			 		{
			 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
			 		}
			 		 return ExpectedDropDownValues;
			  	   
			     }
		    
		    
		    public List<String> validateCorrelationDropdownOptions() {
		    	   Correlationdropdown.click(); 	    
			  	   List<WebElement> list = CorrelationdropdownOptions; 
			  	   List<String> ExpectedDropDownValues = new ArrayList<String>();

			 		for(WebElement listOfDropDownValues : list) 
			 		{
			 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
			 		}
			 		 return ExpectedDropDownValues;
			  	   
			     }
		}

