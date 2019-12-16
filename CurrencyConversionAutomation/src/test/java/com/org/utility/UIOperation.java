
package com.org.utility;

import static org.testng.Assert.assertTrue;

import java.util.List;

import com.org.enums.AppValidationConstantMessages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.org.UIElementLibrary.*;

 
public abstract class UIOperation extends IdentifyElement{

    protected WebDriver driver;

    public UIOperation(WebDriver driver) {
        this.driver = driver;
    }

    /*
    public void elementAvailable(String element) {
    	try{assertElementPresentByXpath(element);}catch(Exception e) {}
    	try{assertElementPresentById(element);}catch(Exception e) {}
    	try{isElementVisible(element);}catch(Exception e) {}
    }
    */
    
    /**
     * This function is to assert and click on the element.
     */
    protected void assertAndClick(String element) {
       // assertElementPresent(xpath);
    	String locator=elementAvailable(driver,element);
    	if(locator.equalsIgnoreCase("xpath"))
    		driver.findElement(By.xpath(element)).click();
    }
    
    /**
     * This function is to assert and click on the id element.
     */
    protected void assertAndClickID(String locator) {
        //assertElementPresentById(id);
    	elementAvailable(driver,locator);
       // driver.findElement(By.id(locator)).click();
    	elementClick(driver,locator);
    }

    /**
     * This function is assert and get the text present in element.
     */
  /*  protected String assertAndGetText(String locator) {
       // assertElementPresentByXpath(locator);
    	//String locatorActual=elementAvailable(driver,locator);
          //  if(locatorActual.equalsIgnoreCase(anotherString))
    	String text=elementGetText(driver,locator);
    	return text;
    	//return driver.findElement(By.xpath(locator)).getText();
    }*/
    
    protected String assertAndGetText(String locator) {
     	String text=elementGetText(driver,locator);
     	return text;
     }

    /**
     * This function is to assert and type.
     */
    protected void assertAndType(String xpath, String txt) {
        //assertElementPresent(xpath);
    	elementAvailable(driver,xpath);
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(txt);
    }

    /**
     * This functions is to assert and type in element by id
     */
    protected void assertEnterText(String id, String txt) {
        //assertElementPresentById(id);
    	elementAvailable(driver,id);
        driver.findElement(By.id(id)).sendKeys(txt);
    }

    /**
     * This function is to assert element is present by id.
     */
    private void assertElementPresentById(String id) {
    	try{
    		if(isElementPresentById(id))
    		{
    		assertTrue(isElementPresentById(id), "Element " + id + " not found.");
    		}
    	}catch(Exception e) {}
    }

    /**
     * This function is to verify weather element is present or not.
     */
   /* protected boolean isElementPresentById(String id) {
        try {
            driver.findElement(By.id(id));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }*/

    /**
     * This function is to get element visibility.
     */
 /*   protected boolean isElementVisible(String xpath) {
        try {
            driver.findElement(By.xpath(xpath)).isDisplayed();
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }*/

    /**
     * This function is to assert element by xpath.
     *
     * @param xpath: locator as xpath
     */
    private void assertElementPresentByXpath(String xpath) {
      try{
  		if(isElementPresentByXpath(xpath))
  		{assertTrue(isElementPresentByXpath(xpath), "Element " + xpath + " not found.");
  		}
  			}catch(Exception e) {}
    }
    
    private void assertElementPresentID(String id) {
    	try{
    		if(isElementPresentById(id))
		{ assertTrue(isElementPresentById(id), "Element " + id + " not found.");
		}
			}catch(Exception e) {}
    }

    /**
     * This function is to get the presence os element.
     *
     * @param xpath: locator as xpath
     * @return true/false
     */
    /*
    protected boolean isElementPresent(String xpath) {
        try {
            driver.findElement(By.xpath(xpath));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    protected boolean isElementIDPresent(String id) {
        try {
            driver.findElement(By.id(id));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }*/
    /**
     * This function is to assert and get value by attribute.
     */
    protected String assertAndGetAttributeValue(String xpath, String attribute) {
        assertElementPresentByXpath(xpath);
        return driver.findElement(By.xpath(xpath)).getAttribute(attribute);
    }

    /**
     * This function is to wait for element.
     *
     * @param xpath: locator as xpath
     */
    protected void waitForElement(String xpath) {
        new WebDriverWait(driver, AppValidationConstantMessages.EXPLICIT_WAIT_TIME)
            .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
    
    protected void waitForElementID(String id) {
        new WebDriverWait(driver, AppValidationConstantMessages.EXPLICIT_WAIT_TIME)
            .until(ExpectedConditions.presenceOfElementLocated(By.id(id)));
    }

    /**
     * This function is to wait for element to be clickable.
     *
     * @param xpath: locator as xpath
     */
    protected void waitForElementClickable(String xpath) {
        new WebDriverWait(driver, AppValidationConstantMessages.EXPLICIT_WAIT_TIME)
            .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    /**
     * This function is to wait for element visibility.
     */
    protected void waitForElementVisibility(String xpath) {
        new WebDriverWait(driver, AppValidationConstantMessages.EXPLICIT_WAIT_TIME)
            .until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    /**
     * This function is to wait for element invisibility.
     */
    protected void waitForElementInvisibility(String xpath) {
        new WebDriverWait(driver, AppValidationConstantMessages.EXPLICIT_WAIT_TIME)
            .until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
    }

    /**
     * This function is to select option by visible text.
     */
    protected void selectByVisibleText(String xpath, String txt) {
        waitForElement(xpath);
        WebElement ele = driver.findElement(By.xpath(xpath));
        Select select = new Select(ele);
        select.selectByVisibleText(txt);
    }

    /**
     * This function is to select option by value.
     */
    protected void selectByValue(String xpath, String value) {
        waitForElement(xpath);
        WebElement ele = driver.findElement(By.xpath(xpath));
        Select select = new Select(ele);
        select.selectByValue(value);
    }
    
    /**
     * This function is to select option by value.
     */
    protected void selectByValue_UsingID(String id, String value) {
        waitForElementID(id);
        WebElement ele = driver.findElement(By.id(id));
        Select select = new Select(ele);
        select.selectByValue(value);
    }
    /*
	public void setDropDownValue(String idStr,String xpathStr,String currency)  {
		waitForElementID(idStr);
		WebElement selectFromCurrencyDropDown = driver.findElement(By.id(idStr));
		
		Actions action = new Actions(driver);
			action.moveToElement(selectFromCurrencyDropDown);
				action.click();
					action.build().perform();

		waitForElement(xpathStr);
			driver.findElement(By.xpath(xpathStr)).sendKeys(currency);
				action.sendKeys(Keys.ENTER).build().perform();
	}*/
	
	public void setDropDownValue(String idStr,String xpathStr,String currency)  {
		waitForElementID(idStr);
		WebElement selectFromCurrencyDropDown = driver.findElement(By.id(idStr));
		
		Actions action = new Actions(driver);
			action.moveToElement(selectFromCurrencyDropDown);
				action.click();
					action.build().perform();

		waitForElement(xpathStr);
		elementSendKeys(driver,xpathStr,currency);
		//driver.findElement(By.xpath(xpathStr)).sendKeys(currency);
				action.sendKeys(Keys.ENTER).build().perform();
	}

    /**
     * This function is get the first selected option fron Select element.
     */
    protected String getSelectTextByAttribute(String xpath, String attribute) {
        waitForElement(xpath);
        WebElement ele = driver.findElement(By.xpath(xpath));
        Select select = new Select(ele);
        return select.getFirstSelectedOption().getAttribute(attribute);
    }

}
