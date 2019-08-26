package com.org.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gurukula.common.Constants;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.RegistrationPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;

@Test(groups = { "register" })
public class RegistrationPageTest extends Init {

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
		registrationPage.assertMessage(Constants.PASSWORD_NOT_MATCHED);
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		registrationPage = new RegistrationPage(driver);

		welcomePage.clickOnLink(WelcomeEnum.REGISTER_LINK.getVal());
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
            {RegistrationPage.LOGIN, Constants.LOGIN_REQUIRED, " "},
            {RegistrationPage.EMAIL, Constants.EMAIL_REQUIRED, " "},
            {RegistrationPage.PASSWORD, Constants.PASSWORD_REQUIRED, "req"},
            {RegistrationPage.CONFIRM_PASSWORD, Constants.CONFIRM_PASSWORD_REQUIRED, "req"},
            //@formatter:on
		};
	}

	@DataProvider(name = "validations")
	public Object[][] validations() {
		return new Object[][] {
			// @formatter:off
            {RegistrationPage.LOGIN, Constants.LOGIN_MINIMUM, "a"},
            {RegistrationPage.LOGIN, Constants.LOGIN_MAXIMUM, "thisistotestthemaxlimitofthetextfieldonregistration"},
            {RegistrationPage.LOGIN, Constants.LOGIN_LOWER_CASE, "Anuj"},

            {RegistrationPage.EMAIL, Constants.EMAIL_MINIMUM, "a@b"},
            {RegistrationPage.EMAIL, Constants.EMAIL_INVALID, "abcdef"},
            {RegistrationPage.EMAIL, Constants.EMAIL_MAXIMUM, "ThisEmailIsToValidateTheMaxLimitEmail@TextField.com"},

            {RegistrationPage.PASSWORD, Constants.PASSWORD_MINIMUM, "A"},
            {RegistrationPage.PASSWORD, Constants.PASSWORD_MAXIMUM, "this text is to test the max limit of the password1"},
            {RegistrationPage.PASSWORD, Constants.PASSWORD_RULE, "1admin"},

            {RegistrationPage.CONFIRM_PASSWORD, Constants.CONFIRM_PASSWORD_MINIMUM, "A"},
            {RegistrationPage.CONFIRM_PASSWORD, Constants.CONFIRM_PASSWORD_MAXIMUM, "this text is to test the max limit of the password1"},
            {RegistrationPage.CONFIRM_PASSWORD, Constants.PASSWORD_RULE, "1admin"}

            //@formatter:on

		};
	}

}
