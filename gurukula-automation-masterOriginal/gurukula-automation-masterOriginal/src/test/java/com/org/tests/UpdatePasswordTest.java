package com.org.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.enums.AppUserActionsEnum;
import com.gurukula.common.Constants;
import com.gurukula.common.MenuEnum;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.LoginPage;
import com.gurukula.pages.UpdatePasswordPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;

@Test(groups = { "password" })
public class UpdatePasswordTest extends Init {

	WelcomePage welcomePage;
	LoginPage loginPage;
	UpdatePasswordPage updatePasswordPage;

	@Test
	public void tc_01_testUpdatePasswordPageHeading() {
		preSteps();
		updatePasswordPage.assertUpdatePasswordPageHeading(USERNAME);
	}

	@Test
	public void tc_02_testUpdatePassword() {
		preSteps();
		updatePasswordPage.enterNewPasswordAndSubmit("Test#123", "Test#123");

		updatePasswordPage.assertMessage(UpdatePasswordPage.SUCCESS);
	}

	@Test(dataProvider = "validations")
	public void tc_03_testUpdatePasswordFieldValidation(String fieldName, String vMsg, String txt) {
		preSteps();
		updatePasswordPage.enterTextIn(fieldName, txt);

		updatePasswordPage.assertFieldValidationMessage(fieldName, vMsg);
		updatePasswordPage.assertSaveBtnDisable();

	}

	@Test(dataProvider = "requiredField")
	public void tc_04_testPasswordRequiredValidation(String fieldName, String vMsg, String txt) {
		preSteps();
		updatePasswordPage.enterTextIn(fieldName, txt);
		updatePasswordPage.clearText(fieldName);

		updatePasswordPage.assertFieldValidationMessage(fieldName, vMsg);
		updatePasswordPage.assertSaveBtnDisable();
	}

	@Test
	public void tc_05_testPasswordAndConfirmPasswordMatch() {
		preSteps();
		updatePasswordPage.enterNewPasswordAndSubmit("Test#123", "Abc#123");
		updatePasswordPage.assertMessage(Constants.PASSWORD_NOT_MATCHED);
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		loginPage = new LoginPage(driver);
		updatePasswordPage = new UpdatePasswordPage(driver);

		welcomePage.clickOnLink(WelcomeEnum.LOGIN_LINK.getVal());
		loginPage.loginAndAssertSuccessfulMessage("admin", "admin");
		welcomePage.clickOnOption(MenuEnum.Account.name(), AppUserActionsEnum.Password.getVal());
	}

	@DataProvider(name = "requiredField")
	public Object[][] requiredField() {
		return new Object[][] {
			// @formatter:off
            {UpdatePasswordPage.PASSWORD, Constants.PASSWORD_REQUIRED, "req"},
            {UpdatePasswordPage.CONFIRM_PASSWORD, Constants.CONFIRM_PASSWORD_REQUIRED, "req"},
            //@formatter:on
		};
	}

	@DataProvider(name = "validations")
	public Object[][] validations() {
		return new Object[][] {
			// @formatter:off
            {UpdatePasswordPage.PASSWORD, Constants.PASSWORD_MINIMUM, "A"},
            {UpdatePasswordPage.PASSWORD, Constants.PASSWORD_MAXIMUM,
                "this text is to test the max limit of the password1"},

            {UpdatePasswordPage.CONFIRM_PASSWORD, Constants.CONFIRM_PASSWORD_MINIMUM, "A"},
            {UpdatePasswordPage.CONFIRM_PASSWORD, Constants.CONFIRM_PASSWORD_MAXIMUM,
                "this text is to test the max limit of the password1"}
            //@formatter:on
		};
	}
}
