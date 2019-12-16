package com.org.UIElementLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class IdentifyElement {
WebDriver driver;

	 public String elementAvailable(WebDriver driver,String element) {
		 this.driver=driver;
		 if(isElementPresentById(element))
			 if(isElementVisibleById(element))
			  return "id";
		  if(isElementPresentByXpath(element))
			 if(isElementVisibleByXpath(element))
				  return "xpath";
		  if(isElementPresentBylinkText(element))
				 if(isElementVisibleBylinkText(element))
					  return "linkText";
		 return null;
	    }

	 public boolean elementSelectValue(WebDriver driver,String SelectLocator,String element) {
		 Select sel=null;
		 	String local_locator=elementAvailable(driver,SelectLocator);
		  
		 			if(local_locator.equalsIgnoreCase("xpath"))
		 					 sel=new Select(driver.findElement(By.xpath(element)));
		 			if (local_locator.equalsIgnoreCase("id"))
		 				 sel=new Select(driver.findElement(By.id(SelectLocator)));
		 			
		 			try{sel.selectByValue(element);return true;}catch(Exception e) {}
		 			try{sel.selectByVisibleText(element); return true;}catch(Exception e) {}
					return false;
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
		 	if (local_locator.equalsIgnoreCase("linkText"))
				  driver.findElement(By.linkText(element)).click();
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
	 protected boolean isElementPresentBySelect(String element) {
		 try {
	            driver.findElement(By.xpath(element));
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	}
	 protected boolean isElementVisibleBySelect(String xpath) {
	        try {
	            driver.findElement(By.xpath(xpath)).isDisplayed();
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
	    }
	 protected boolean isElementPresentBylinkText(String linktext) {
		 try {
	            driver.findElement(By.linkText(linktext));
	            return true;
	        } catch (NoSuchElementException e) {
	            return false;
	        }
		}
	 protected boolean isElementVisibleBylinkText(String linktext) {
	        try {
	            driver.findElement(By.linkText(linktext)).isDisplayed();
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
