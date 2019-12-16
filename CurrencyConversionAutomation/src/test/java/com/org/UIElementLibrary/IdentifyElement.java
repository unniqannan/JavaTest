package com.org.UIElementLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class IdentifyElement  {
WebDriver driver;

	 public String elementAvailable(WebDriver driver,String element) {
		 this.driver=driver;
		 if(isElementPresentById(element))
			 if(isElementVisibleById(element))
			  return "id";
		  if(isElementPresentByXpath(element))
			 if(isElementVisibleByXpath(element))
				  return "xpath";
		 return null;
	    }

	 public String elementGetText(WebDriver driver,String element) {
		 System.out.println(element);
		 	String local_locator=elementAvailable(driver,element);
		 		System.out.println(local_locator);
		  
		 			if(local_locator.equalsIgnoreCase("xpath"))
		 					return driver.findElement(By.xpath(element)).getText();
		 			if (local_locator.equalsIgnoreCase("id"))
		 					return driver.findElement(By.id(element)).getText();
		 			return null;
	    }
	 
	 public void elementSendKeys(WebDriver driver,String element,String text) {
		 System.out.println(element);
		 	String local_locator=elementAvailable(driver,element);
		 		System.out.println(local_locator);
		  
		 			if(local_locator.equalsIgnoreCase("xpath"))
		 					driver.findElement(By.xpath(element)).sendKeys(text);
		 			if (local_locator.equalsIgnoreCase("id"))
		 					driver.findElement(By.id(element)).sendKeys(text);
	    }
	 
	 public void elementClick(WebDriver driver,String element) {
		 String local_locator=elementAvailable(driver,element);
		  	
		 	if(local_locator.equalsIgnoreCase("xpath"))
		 		driver.findElement(By.xpath(element)).click();
		 	if (local_locator.equalsIgnoreCase("id"))
			  driver.findElement(By.id(element)).click();
	    }
	 
	 
	 
	 protected boolean isElementPresentByXpath(String element) {
		 try {
	            driver.findElement(By.xpath(element));
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	}
	 protected boolean isElementVisibleByXpath(String xpath) {
	        try {
	            driver.findElement(By.xpath(xpath)).isDisplayed();
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }
	 
	 protected boolean isElementPresentById(String id) {
		  try {
	            driver.findElement(By.id(id));
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	 }
	 protected boolean isElementVisibleById(String id) {
	        try {
	            driver.findElement(By.id(id)).isDisplayed();
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }
}
