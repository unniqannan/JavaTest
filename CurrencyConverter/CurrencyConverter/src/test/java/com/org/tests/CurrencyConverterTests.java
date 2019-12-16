
package com.org.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.pages.CurrencyConverterPage;
import com.org.utility.StartApplication;


@Test(groups = "CurrencyConverter")
public class CurrencyConverterTests extends StartApplication {

	public static Logger logger = Logger.getLogger(CurrencyConverterTests.class.getName());

	 
	CurrencyConverterPage currencyConverterPg;
	
	@Test(dataProvider = "CurrencyInput")
	public void tc_01_testLoginWithInValidCredentials(String sourceCountryCurrency, String targetCountryCurrency,String ConvertedToCurrencyResults) {
		preSteps();
		currencyConverterPg.CurrencyConverterMainPageHeaderCheck();
			currencyConverterPg.selectSourceCurrency(sourceCountryCurrency);
				currencyConverterPg.selectTargetCurrency(targetCountryCurrency);
					currencyConverterPg.clickOnButton(CurrencyConverterPage.ConvertButton);
						currencyConverterPg.SourceCurrencyValidateResults(sourceCountryCurrency);
							currencyConverterPg.TargetCurrencyValidateResults(ConvertedToCurrencyResults);
	}

	private void preSteps() {
		currencyConverterPg = new CurrencyConverterPage(driver);
	}

	@DataProvider(name = "CurrencyInput")
	public Object[][] CurrencySelection() {
		return new Object[][] {
			// @formatter:off
			{ "EUR", "USD","1.09820 USD" },
			{ "INR", "USD","0.01412 USD" }, 
			{ "GBP", "INR","87.20680 INR" },
			{ "CAD", "MXN","14.66340 MXN" },
			{ "AUD", "NZD","1.07160 NZD" } 
			// @formatter:on
		};
	}

}
