/**
 * 
 */
package com.gurukula.pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.gurukula.utility.Services;

/**
 * @author AnujKumar
 *
 */
public class BranchDetailPage extends Services {
	static Logger logger = Logger.getLogger(BranchDetailPage.class.getName());

	public static final String HEADING = "Branch ";

	private String xpathHeading = "//h2";
	private String xpathInfoIF = "//input[@value='*val*']";

	WebDriver driver;

	public BranchDetailPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * This function is to assert branch details on the Branch Detail Page.
	 * @param id: branch id
	 * @param name: branch name
	 * @param code: branch code
	 */
	public void assertInfoOnBranchDetailPage(int id, String name, String code) {
		waitForElement(xpathHeading);

		String expectedHeading = HEADING + id;
		String actualHeading = assertAndGetText(xpathHeading);
		logger.info("# Branch Details page header: " + actualHeading);
		assertEquals(actualHeading, expectedHeading,
				"Actual heading '" + actualHeading + "' should be same as expected heading '" + expectedHeading + "'.");

		assertTrue(isElementPresent(xpathInfoIF.replace("*val*", name)), "Name '" + name + "' should be present.");
		assertTrue(isElementPresent(xpathInfoIF.replace("*val*", code)), "Code '" + code + "' should be present.");
	}

}
