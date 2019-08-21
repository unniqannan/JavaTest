package com.org.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.enums.AppValidationMessages;
import com.org.enums.AppWelcomePageEnum;
import com.org.pages.RegistrationPage;
import com.org.pages.WelcomePage;
import com.org.utility.StartApplication;

@Test(groups = { "register" })
public class RegistrationPageTest extends StartApplication {

	WelcomePage welcomePage;
	RegistrationPage registrationPage;

	@Test
	public void tc_01_testRegistrationPageHeader() {
		preSteps();
		registrationPage.assertRegistrationPageHeading();
	}

	@Test(dataProvider = "newUser")
	public void tc_02_testRegistrationFunctionality(String name, String email, String password,
			String confirmPassword) {
		preSteps();
		registrationPage.registerNewUser(name, email, password, confirmPassword);
		registrationPage.assertMessage(RegistrationPage.SUCCESS);
	}

	@Test(dataProvider = "validations")
	public void tc_03_testRegistrationFieldValidation(String fieldName, String vMsg, String txt) {
		preSteps();
		registrationPage.enterTextIn(fieldName, txt);
		registrationPage.assertFieldValidationMessage(fieldName, vMsg);
		registrationPage.assertRegisterBtnDisable();
	}

	@Test(dataProvider = "requiredField")
	public void tc_04_testRequiredFieldValidation(String fieldName, String vMsg, String txt) {
		preSteps();
		registrationPage.enterTextIn(fieldName, txt);
		registrationPage.clearText(fieldName);

		registrationPage.assertFieldValidationMessage(fieldName, vMsg);
		registrationPage.assertRegisterBtnDisable();
	}

	@Test(dataProvider = "passwordMatch")
	public void tc_05_testPasswordAndConfirmPassword(String name, String email, String password,
			String confirmPassword) {
		preSteps();
		registrationPage.registerNewUser(name, email, password, confirmPassword);
		registrationPage.assertMessage(AppValidationMessages.PASSWORD_NOT_MATCHED);
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		registrationPage = new RegistrationPage(driver);

		welcomePage.clickOnLink(AppWelcomePageEnum.REGISTER_LINK.getVal());
	}

	@DataProvider(name = "newUser")
	public Object[][] newUserDetails() {
		return new Object[][] { { "anuj", "cdac.anuj@gmail.com", "Test#123", "Test#123" } };
	}

	@DataProvider(name = "passwordMatch")
	public Object[][] passwordMatch() {
		return new Object[][] { { "anuj", "cdac.anuj@gmail.com", "Test#123", "Abc#123" } };
	}

	@DataProvider(name = "requiredField")
	public Object[][] requiredField() {
		return new Object[][] {
			// @formatter:off
            {RegistrationPage.LOGIN, AppValidationMessages.LOGIN_REQUIRED, " "},
            {RegistrationPage.EMAIL, AppValidationMessages.EMAIL_REQUIRED, " "},
            {RegistrationPage.PASSWORD, AppValidationMessages.PASSWORD_REQUIRED, "req"},
            {RegistrationPage.CONFIRM_PASSWORD, AppValidationMessages.CONFIRM_PASSWORD_REQUIRED, "req"},
            //@formatter:on
		};
	}

	@DataProvider(name = "validations")
	public Object[][] validations() {
		return new Object[][] {
			// @formatter:off
            {RegistrationPage.LOGIN, AppValidationMessages.LOGIN_MINIMUM, "a"},
            {RegistrationPage.LOGIN, AppValidationMessages.LOGIN_MAXIMUM, "thisistotestthemaxlimitofthetextfieldonregistration"},
            {RegistrationPage.LOGIN, AppValidationMessages.LOGIN_LOWER_CASE, "Anuj"},

            {RegistrationPage.EMAIL, AppValidationMessages.EMAIL_MINIMUM, "a@b"},
            {RegistrationPage.EMAIL, AppValidationMessages.EMAIL_INVALID, "abcdef"},
            {RegistrationPage.EMAIL, AppValidationMessages.EMAIL_MAXIMUM, "ThisEmailIsToValidateTheMaxLimitEmail@TextField.com"},

            {RegistrationPage.PASSWORD, AppValidationMessages.PASSWORD_MINIMUM, "A"},
            {RegistrationPage.PASSWORD, AppValidationMessages.PASSWORD_MAXIMUM, "this text is to test the max limit of the password1"},
            {RegistrationPage.PASSWORD, AppValidationMessages.PASSWORD_RULE, "1admin"},

            {RegistrationPage.CONFIRM_PASSWORD, AppValidationMessages.CONFIRM_PASSWORD_MINIMUM, "A"},
            {RegistrationPage.CONFIRM_PASSWORD, AppValidationMessages.CONFIRM_PASSWORD_MAXIMUM, "this text is to test the max limit of the password1"},
            {RegistrationPage.CONFIRM_PASSWORD, AppValidationMessages.PASSWORD_RULE, "1admin"}

            //@formatter:on

		};
	}

}
