package com.amc.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amc.qa.Baseclass.TestBase;

public class WarHouseVolumesPage extends TestBase{

	
	WebDriver driver;
	
	@FindBy(xpath="//*[@class='layout-menuitem-text'][contains(text(),'Warehouse Volumes')]") 
	WebElement WarhouseVolumesButton;
	
	@FindBy(xpath="(//p-dropdown)[1]") 
	WebElement WMSsystemdropDown;
	
	@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
	List<WebElement> WMSsystemdropDownOptions;
	
	
	@FindBy(xpath="(//p-dropdown)[2]") 
	WebElement WarehousedropDown;
	
	@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
	List<WebElement> WarehousedropDownOptions;
	
	@FindBy(xpath="(//p-dropdown)[3]") 
	WebElement DocumentTypedropDown;
	
	@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
	List<WebElement> DocumentTypedropDownOptions;
	
	@FindBy(xpath="(//p-dropdown)[4]") 
	WebElement StatusdropDown;
	
	@FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
	List<WebElement> StatusdropDownOptions;
	
	@FindBy(xpath="//*[@class='ui-button-text ui-clickable'][contains(text(),'Generate')]") 
	WebElement GenerateButton;
	
	@FindBy(xpath="//*[contains(text(),'From and To date')]") 
	WebElement dateTextBox;
	
	@FindBy(xpath="(//div[@class='p-field p-col-12 p-md-4 ui-fluid'])[1]/child::*[2]") 
	WebElement dateInput;
	    
	    
	@FindBy(xpath="//*[@class='btn']") 
	WebElement applyButton;
	    		
	
	
	public WarHouseVolumesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnWarHouseVolumes() {
		
		WarhouseVolumesButton.click();
		
	}
	
	
     public void clickOnGenerateButton() {
		
	       GenerateButton.click();
		
	}
     
     
     public void ClickonDate() {
  		
		 dateInput.click();
	 }
	
     
     public void ClickonApply() {
   		
		 applyButton.click();
	 }
       
	
	public void selectWMSsystemdropDown(String value) {
		
		 WMSsystemdropDown.click(); 
		 List<WebElement> list = WMSsystemdropDownOptions;
			for(int i=0; i<list.size(); i++) 
				if(list.get(i).getText().equals(value)) 
				{
					list.get(i).click();
					break;
				}
		}
	
	
	public void selectWarehousedropDown(String value) {
		
		 WarehousedropDown.click(); 
		 List<WebElement> list = WarehousedropDownOptions;
			for(int i=0; i<list.size(); i++) 
				if(list.get(i).getText().equals(value)) 
				{
					list.get(i).click();
					break;
				}
			}
	
	 public void selectDocumentTypedropDown(String value) {
		
		 DocumentTypedropDown.click(); 
		 List<WebElement> list = DocumentTypedropDownOptions;
			for(int i=0; i<list.size(); i++) 
				if(list.get(i).getText().equals(value)) 
				{
					list.get(i).click();
					break;
				}
			}
	 
	 
	  public void selectStatusdropDown(String value) {
			
		 StatusdropDown.click(); 
		 List<WebElement> list = StatusdropDownOptions;
			for(int i=0; i<list.size(); i++) 
				if(list.get(i).getText().equals(value)) 
				{
					list.get(i).click();
					break;
				}
			}


	public String verifyFromandDateBox() {

		String fromToDatelabel=dateTextBox.getText();
		
		return fromToDatelabel;
		
	}
	
	
	 public  List<String> validateWMSSystemDropdownOptions() throws InterruptedException {  
	  WMSsystemdropDown.click();	    
   	  List<WebElement> list = WMSsystemdropDownOptions; 
   	  List<String> ExpectedDropDownValues = new ArrayList<String>();

  		for(WebElement listOfDropDownValues : list) 
  		{
  			ExpectedDropDownValues.add(listOfDropDownValues.getText());
  		}
  		
  		  Collections.sort(ExpectedDropDownValues);
  		 return ExpectedDropDownValues;
   	   
      }
   
	  public  List<String> validateWarhouseDropdownOptions() throws InterruptedException {  
		  WarehousedropDown.click();	    
	   	  List<WebElement> list = WarehousedropDownOptions; 
	   	  List<String> ExpectedDropDownValues = new ArrayList<String>();

	  		for(WebElement listOfDropDownValues : list) 
	  		{
	  			ExpectedDropDownValues.add(listOfDropDownValues.getText());
	  		}
	  		
	  		 Collections.sort(ExpectedDropDownValues);
	  		 return ExpectedDropDownValues;
	   	   
	      }
	  
	  
	  public  List<String> validateDocumentTypeDropdownOptions() throws InterruptedException {
	  	   
		   DocumentTypedropDown.click(); 	    
	  	   List<WebElement> list = DocumentTypedropDownOptions; 
	  	   List<String> ExpectedDropDownValues = new ArrayList<String>();

	 		for(WebElement listOfDropDownValues : list) 
	 		{
	 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
	 		}
	 		Collections.sort(ExpectedDropDownValues);
	 		 return ExpectedDropDownValues;
	  	   
	     }
	     
	     public  List<String> validateStatusDropdownOptions() throws InterruptedException {
	    	   
	    	  StatusdropDown.click();	    
	    	  List<WebElement> list = StatusdropDownOptions; 
	    	  List<String> ExpectedDropDownValues = new ArrayList<String>();

	   		for(WebElement listOfDropDownValues : list) 
	   		{
	   			ExpectedDropDownValues.add(listOfDropDownValues.getText());
	   		}
	   		 return ExpectedDropDownValues;
	    	   
	       }
	    
	   
	 
	 
	
	

	
	

}
