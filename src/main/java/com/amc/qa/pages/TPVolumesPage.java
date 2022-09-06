package com.amc.qa.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amc.qa.Baseclass.TestBase;


public class TPVolumesPage extends TestBase{

	
	WebDriver driver;
	
   @FindBy(xpath="//span[contains(text(),'TP Volumes')]") 
	
	WebElement TpVolumes;
	
	@FindBy(xpath="(//p-dropdown)[1]") 	
	WebElement TradingPatnerdropdown;
	
    @FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
	 List<WebElement> TradingPatnerdropdownOptions;
    
    @FindBy(xpath="(//p-dropdown)[2]") 	
	WebElement DocumentTypedropdown;
	
    @FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
	 List<WebElement> DocumentTypedropdownOptions;
    
    @FindBy(xpath="(//p-dropdown)[3]") 	
	WebElement Statusdropdown;
	
    @FindBy(xpath="//*[@class='ui-dropdown-items-wrapper']/child::*/child::*") 
	List<WebElement> StatusDropdownOptions;
    
    
    @FindBy(xpath="(//div[@class='p-field p-col-12 p-md-4 ui-fluid'])[1]/child::*[2]") 
	WebElement datePicker;
    
    @FindBy(xpath="//*[contains(text(),'Generate')]") 
	WebElement GenerateButton;
    
    
    @FindBy(xpath="(//div[@class='p-field p-col-12 p-md-4 ui-fluid'])[1]/child::*[2]") 
   	WebElement dateInput;
    
    
    @FindBy(xpath="//*[@class='btn']") 
   	WebElement applyButton;
    
    
        
	
    
    public  TPVolumesPage(WebDriver driver)
	{
    	 this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonTPVolumes() {
		
		 TpVolumes.click();
	}
	
	public void SelectTradingPartnerdropDown(String value) {
		
		 TradingPatnerdropdown.click(); 
		 List<WebElement> list = TradingPatnerdropdownOptions;
			for(int i=0; i<list.size(); i++) 
				if(list.get(i).getText().equals(value)) 
				{
					list.get(i).click();
					break;
				}
			}

	
	
	
    public  void SelectDocumentTypeDropdown(String value) throws InterruptedException {
	   
	   DocumentTypedropdown.click();	    
	   List<WebElement> list = DocumentTypedropdownOptions;
		for(int i=0; i<list.size(); i++) 
			if(list.get(i).getText().equals(value)) 
			{
				list.get(i).click();
				break;
			}
		}

    
    public  void SelectStatusDropdown(String value) throws InterruptedException {
 	   
       Statusdropdown.click();	    
 	   List<WebElement> list = StatusDropdownOptions;
 		for(int i=0; i<list.size(); i++) 
 			if(list.get(i).getText().equals(value)) 
 			{
 				list.get(i).click();
 				break;
 			}
 		}

       
    public void ClickonGenerateButton() {
		
    	GenerateButton.click();
    
	}
	   
	   
     public  List<String> validateTradingPartnerDropdownOptions() throws InterruptedException {
 	   
       TradingPatnerdropdown.click(); 	    
 	   List<WebElement> list = TradingPatnerdropdownOptions;
 	   
 	   List<String> ExpectedDropDownValues = new ArrayList<String>();

		for(WebElement listOfDropDownValues : list) 
		{
			ExpectedDropDownValues.add(listOfDropDownValues.getText());
		}
		 Collections.sort(ExpectedDropDownValues);
		 return ExpectedDropDownValues;
 	   
    }
    
     public  List<String> validateDocumentTypeDropdownOptions() throws InterruptedException {
  	   
       DocumentTypedropdown.click(); 	    
  	   List<WebElement> list = DocumentTypedropdownOptions; 
  	   List<String> ExpectedDropDownValues = new ArrayList<String>();

 		for(WebElement listOfDropDownValues : list) 
 		{
 			ExpectedDropDownValues.add(listOfDropDownValues.getText());
 		}
 		
 		 Collections.sort(ExpectedDropDownValues);
 		 return ExpectedDropDownValues;
  	   
     }
     
     public  List<String> validateStatusDropdownOptions() throws InterruptedException {
    	   
    	  Statusdropdown.click();	    
    	  List<WebElement> list = StatusDropdownOptions; 
    	  List<String> ExpectedDropDownValues = new ArrayList<String>();

   		for(WebElement listOfDropDownValues : list) 
   		{
   			ExpectedDropDownValues.add(listOfDropDownValues.getText());
   		}
   		 return ExpectedDropDownValues;
    	   
       }
    
 
     public void ClickonDate() {
 		
		 dateInput.click();
	 }
     
     
     public void ClickonApply() {
  		
		 applyButton.click();
	 }
       
 
}
 	   
 	   
 	    
	   
	   
	   
	   
	
	
	
	


