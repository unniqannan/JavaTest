 
package com.org.pages;

import static org.testng.Assert.assertEquals;

import com.org.utility.UIOperation;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
 
public class CurrencyConverterPage extends UIOperation {

     static Logger logger = Logger.getLogger(CurrencyConverterPage.class.getName());

    public static final String HEADING = "Currency Converter";
    public static final String ConvertButton = "convert";

	public static final String convertButton = null;

    private String xpathHeading = "//h1[contains(text(),'Currency Converter')]";//ConverterPage Header
    private String idSourceCurrencySelectDropDown = "sourceCurrency";
    private String idTargetCurrencySelectDropDown = "targetCurrency";
    private String xpathSourceCurrency = "//h3[@class='cc__source-to-target m-t-2']/span[2]";//"//[contains(text(),'1 ')]";
    private String xpathTargetCurrency = "//h3[@class='cc__source-to-target m-t-2']/span[3]";//[contains(text(),'1.09790 USD')]";
    private String xpathSearchBox = "//input[@placeholder='Search...']";
    private String xpathTargetSearchBox="/html[1]/body[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]";

    WebDriver driver;

    public CurrencyConverterPage(WebDriver driver) {
        super(driver);
        this.driver = driver; 
    }

    /**
     * This function is to assert Converter Main page heading.
     */
    public void CurrencyConverterMainPageHeaderCheck() {
        waitForElement(xpathHeading);
        String actualHeading = assertAndGetText(xpathHeading);
        System.out.println(actualHeading);
        logger.info("# Convert Page Header " + actualHeading);
        assertEquals(actualHeading, HEADING,
            "Actual heading '" + actualHeading + "' should be same as expected heading '" + HEADING
                + "'.");
    }

 
    
    /**
     * This function is to select currencies for source country
     */
    public void selectSourceCurrency(String selectSourceCurrency) {
    	waitForElementID(idSourceCurrencySelectDropDown);
    		setDropDownValue(idSourceCurrencySelectDropDown,xpathSearchBox,selectSourceCurrency);
    			logger.info("# Source From Drop Down Selected " + selectSourceCurrency);
    }
    
    /**
     * This function is to select currencies for target countryr
     */
    public void selectTargetCurrency(String selectTargetCurrency) {
    	waitForElementID(idTargetCurrencySelectDropDown);
    		setDropDownValue(idTargetCurrencySelectDropDown,xpathTargetSearchBox,selectTargetCurrency);
    			logger.info("# Source From Drop Down Selected " + selectTargetCurrency);
    }
   
    /**
     * This function is to click on the id present on Currency Converter page.
     */
	public void clickOnButton(String id) {
	        waitForElementID(id);
	        assertAndClickID(id);
	        logger.info("# Clicked on button: " + id);
	}

	public void SourceCurrencyValidateResults(String SourceCurrency) {
		waitForElement(xpathSourceCurrency);
		 String actualSourceCurrencyResults = assertAndGetText(xpathSourceCurrency);
	        logger.info("# Actual Source Currency results " + actualSourceCurrencyResults.substring(0, 5));
	        assertEquals(actualSourceCurrencyResults.substring(0, 5), "1 "+SourceCurrency,
	            "Actual heading '" + actualSourceCurrencyResults.substring(0, 5) + "' should be same as expected heading '" + "1 "+SourceCurrency
	                + "'.");
	}
   
	public void TargetCurrencyValidateResults(String ConvertedToCurrencyResults) {
		waitForElement(xpathTargetCurrency);
		 String actualTargetCurrencyResults = assertAndGetText(xpathTargetCurrency);
	        logger.info("# Actual Target Currency results " + actualTargetCurrencyResults);
	        assertEquals(actualTargetCurrencyResults, ConvertedToCurrencyResults,
	            "Actual heading '" + actualTargetCurrencyResults + "' should be same as expected heading '" + ConvertedToCurrencyResults
	                + "'.");
	}
}
