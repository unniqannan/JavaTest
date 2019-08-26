package com.org.tests;

import com.gurukula.common.Constants;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.ResetPasswordPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(groups = { "resetPassword" })
public class ResetPasswordTest extends Init {

	WelcomePage welcomePage;
	ResetPasswordPage resetPasswordPage;

	@Test
	public void tc_01_testResetPasswordPageHeading() {
		preSteps();
		resetPasswordPage.assertResetPasswordPageHeading();
	}

	@Test
	public void tc_02_testResetPasswordWithRegisteredEmail() {
		preSteps();
		resetPasswordPage.enterEmailAndSubmit("admin@localhost");
		resetPasswordPage.assertSuccessMsg();
	}

	@Test
	public void tc_03_testResetPasswordWithUnRegisteredEmail() {
		preSteps();
		resetPasswordPage.enterEmailAndSubmit("cdac.anuj@gmail.com");
		resetPasswordPage.assertErrorMsg();

	}

	@Test(dataProvider = "validations")
	public void tc_04_testEmailFieldValidations(String value, String expectedMsg) {
		preSteps();
		resetPasswordPage.enterEmail(value);
		resetPasswordPage.assertValidationMsg(expectedMsg);
		resetPasswordPage.assertResetPasswordBtnDisable();
	}

	@Test
	public void tc_05_testRequiredEmailValidation() {
		preSteps();
		resetPasswordPage.enterEmail("anuj");
		resetPasswordPage.clearText();
		resetPasswordPage.assertValidationMsg(Constants.EMAIL_REQUIRED);
		resetPasswordPage.assertResetPasswordBtnDisable();
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		resetPasswordPage = new ResetPasswordPage(driver);

		welcomePage.clickOnLink(WelcomeEnum.LOGIN_LINK.getVal());
		resetPasswordPage.clickOnLink();
	}

	@DataProvider(name = "validations")
	public Object[][] validations() {
		return new Object[][] {
			// @formatter:off
			{ "abcde", Constants.EMAIL_INVALID }, 
			{ "a@b", Constants.EMAIL_MINIMUM },
			{ "ThisEmailIsToValidateTheMaximumLimitOfEmail@TextField.com", Constants.EMAIL_MAXIMUM } 
			// @formatter:on
		};
	}
}
