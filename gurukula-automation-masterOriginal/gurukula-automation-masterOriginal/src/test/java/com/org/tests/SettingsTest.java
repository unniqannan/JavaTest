package com.org.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.enums.AppUserActionsEnum;
import com.gurukula.common.Constants;
import com.gurukula.common.MenuEnum;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.LoginPage;
import com.gurukula.pages.SettingsPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;

@Test(groups = { "settings" })
public class SettingsTest extends Init {

	WelcomePage welcomePage;
	LoginPage loginPage;
	SettingsPage settingsPage;

	@Test
	public void tc_01_testSettingsPageHeading() {
		preSteps();
		settingsPage.assertSettingsPageHeading(USERNAME);
	}

	@Test(dataProvider = "updateDetails")
	public void tc_02_testUpdateSettings(String firstName, String lastName, String email, String lang) {
		preSteps();
		settingsPage.enterDetailsAndSubmit(firstName, lastName, email, lang);
		settingsPage.assertMessage(SettingsPage.SUCCESS);
	}

	@Test(dataProvider = "validations")
	public void tc_03_testSettingsFieldValidation(String fieldName, String vMsg, String txt) {
		preSteps();
		settingsPage.enterTextIn(fieldName, txt);
		settingsPage.assertFieldValidationMessage(fieldName, vMsg);
		settingsPage.assertSaveBtnDisable();
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		loginPage = new LoginPage(driver);
		settingsPage = new SettingsPage(driver);

		welcomePage.clickOnLink(WelcomeEnum.LOGIN_LINK.getVal());
		loginPage.loginAndAssertSuccessfulMessage(USERNAME, PASSWORD);

		welcomePage.clickOnOption(MenuEnum.Account.name(), AppUserActionsEnum.Settings.getVal());
	}

	@DataProvider(name = "updateDetails")
	public Object[][] updateDetails() {
		return new Object[][] { { "Anuj", "Kumar", "cdac.anuj@gamil.com", "English" } };
	}

	@DataProvider(name = "validations")
	public Object[][] validations() {
		return new Object[][] {
			// @formatter:off
            {SettingsPage.FIRST_NAME, Constants.FIRST_NAME_REQUIRED, " "},
            {SettingsPage.FIRST_NAME, Constants.FIRST_NAME_MINIMUM, ""},
            {SettingsPage.FIRST_NAME, Constants.FIRST_NAME_MAXIMUM,
                "this text is to test the maximum limit of the First Name text field"},

            {SettingsPage.LAST_NAME, Constants.LAST_NAME_REQUIRED, " "},
            {SettingsPage.LAST_NAME, Constants.LAST_NAME_MINIMUM, ""},
            {SettingsPage.LAST_NAME, Constants.LAST_NAME_MAXIMUM,
                "this text is to test the maximum limit of the Last Name text field"},

            {SettingsPage.EMAIL, Constants.EMAIL_REQUIRED, " "},
            {SettingsPage.EMAIL, Constants.EMAIL_MINIMUM, "a@b"},
            {SettingsPage.EMAIL, Constants.EMAIL_INVALID, "abcdef"},
            {SettingsPage.EMAIL, Constants.EMAIL_MAXIMUM,
                "ThisEmailIsToValidateTheMaximumLimitOfEmail@TextField.com"}
            //@formatter:on
		};
	}
}
