package com.amc.qa.Utilities;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.amc.qa.Baseclass.TestBase;

public class DateUtilites extends TestBase{
	
	public void selectDate(String selectDate) throws Exception{
		
		   WebElement previousButton = driver.findElement(By.xpath("(//*[@class='prev available ng-star-inserted'])[1]"));
		 
		   WebElement nextButton = driver.findElement(By.xpath("(//*[@class='next available ng-star-inserted'])[1]"));
		   
		
		
		    Calendar calender= Calendar.getInstance();
//		   
		    String TargetDate = selectDate;
		    
		    SimpleDateFormat targetdateformat=new SimpleDateFormat("dd-MMM-yyyy");
		    
		    Date formattedTaregetDate;
		    
		    try {
		    	
		    	targetdateformat.setLenient(false);
		    	
		    	formattedTaregetDate=targetdateformat.parse(TargetDate);
		    	calender.setTime(formattedTaregetDate);
		    	
		    	int targetDay = calender.get(Calendar.DAY_OF_MONTH);
		    	int targetMonth=calender.get(Calendar.MONTH);
		    	int targetYear=calender.get(Calendar.YEAR);
		    
		    	 String actualDate = driver.findElement(By.xpath("//*[@class='month drp-animate']")).getText();
		    	 calender.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
		    	 
		    	 int actualMonth=calender.get(Calendar.MONTH);
			     int actualYear=calender.get(Calendar.YEAR);
			     
			     while(targetMonth<actualMonth||targetYear<actualYear) {
			    	 
			    	 previousButton.click();
			    	 
			    	 actualDate = driver.findElement(By.xpath("//*[@class='month drp-animate']")).getText();
			    	 calender.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			    	 
			    	 actualMonth=calender.get(Calendar.MONTH);
				     actualYear=calender.get(Calendar.YEAR);
			    	
			      }
			     
			     
                  while(targetMonth>actualMonth||targetYear>actualYear) {
			    	 
                	 nextButton.click();
			    	 
			    	 actualDate = driver.findElement(By.xpath("//*[@class='month drp-animate']")).getText();
			    	 calender.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			    	 
			    	 actualMonth=calender.get(Calendar.MONTH);
				     actualYear=calender.get(Calendar.YEAR);
			    	
			      }
                  
                  
                List<WebElement> dateList = driver.findElements(By.xpath("(//*[@class='calendar-table'])[1]//td[not(contains(@class,'off available'))]"));
          		System.out.println(dateList.size());

          		String formatDate = String.valueOf(targetDay);
          		
          		for(int i=0; i<dateList.size(); i++) 
          		{
          			System.out.println(dateList.get(i).getText());
          			if(dateList.get(i).getText().equals(formatDate)) 
          			{
          				dateList.get(i).click();	
          				break;
          				
          			}
          		}
                           		     
			     
		    }
		    
		    	    
		    catch (ParseException e){
		    	
		    	throw new Exception("invalid date is provided please check input date");
		    	
		    }
		    
		
		    
		    
		    
	}
	
		
		
		  
		public void startDateSetTime(String selectHours,String selectMinitues) throws InterruptedException {
			
			
			 WebElement hoursInbox = driver.findElement(By.xpath("(//*[@class='calendar-time ng-star-inserted'])[1]/child::*[1]"));
			 List<WebElement> hoursInboxOptions= driver.findElements(By.xpath("(//div[@class='calendar-time ng-star-inserted'])[1]/child::*[1]/child::*"));
			 WebElement minInbox = driver.findElement(By.xpath("(//*[@class='calendar-time ng-star-inserted'])[1]/child::*[2]"));
			 List<WebElement> minInboxOptions= driver.findElements(By.xpath("(//*[@class='calendar-time ng-star-inserted'])[1]/child::*[2]/child::*"));
			
			 hoursInbox.click();
			 Thread.sleep(1000); 
			 
			 System.out.println(selectHours);
			
			 for(int i=0; i<hoursInboxOptions.size(); i++) 
	   		{
	   			
				System.out.println(hoursInboxOptions.get(i).getText());
	   			if(hoursInboxOptions.get(i).getText().equals(selectHours)) 
	   			{
	   				hoursInboxOptions.get(i).click();	
	   				break; 
	   				
	   			}
	  
	   		}
			 
			 
		    
		     minInbox.click();
		     Thread.sleep(1000);
		     System.out.println(selectMinitues);
			 for(int i=0; i<minInboxOptions.size(); i++) 
	   		{
	   			System.out.println(minInboxOptions.get(i).getText());
	   			if(minInboxOptions.get(i).getText().equals(selectMinitues)) 
	   			{
	   				minInboxOptions.get(i).click();	
	   				break;
	   				
	   			}
	   		}	
			
		}
		 
		
		public void endDateSetTime(String selectHours,String selectMinitues ) throws InterruptedException {
			
			
			 WebElement hoursInbox = driver.findElement(By.xpath("(//div[@class='calendar-time ng-star-inserted'])[2]/child::*[1]"));
			 List<WebElement> hoursInboxOptions= driver.findElements(By.xpath("(//div[@class='calendar-time ng-star-inserted'])[2]/child::*[1]/child::*"));
			 WebElement minInbox = driver.findElement(By.xpath("(//*[@class='calendar-time ng-star-inserted'])[2]/child::*[2]"));
			 List<WebElement> minInboxOptions= driver.findElements(By.xpath("(//*[@class='calendar-time ng-star-inserted'])[2]/child::*[2]/child::*"));
			
		     hoursInbox.click();
		     Thread.sleep(1000); 
			 for(int i=0; i<hoursInboxOptions.size(); i++) 
	   		{
	   			System.out.println(hoursInboxOptions.get(i).getText());
	   			if(hoursInboxOptions.get(i).getText().equals(selectHours)) 
	   			{
	   				hoursInboxOptions.get(i).click();	
	   				break;
	   				
	   			}
	   		}
			 
			 
		     minInbox.click();
		     Thread.sleep(1000); 
			 for(int i=0; i<minInboxOptions.size(); i++) 
	   		{
	   			System.out.println(minInboxOptions.get(i).getText());
	   			if(minInboxOptions.get(i).getText().equals(selectMinitues)) 
	   			{
	   				minInboxOptions.get(i).click();	
	   				break;
	   				
	   			}
	   		}
		 
		
		 
		
		
		
		
	}
}
	
	
	
	
		

	        
	        
	        
	        
	        
	        