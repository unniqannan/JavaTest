
package com.gurukula.tests;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gurukula.common.AccountEnum;
import com.gurukula.common.EntitiesEnum;
import com.gurukula.common.MenuEnum;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.LoginPage;
import com.gurukula.pages.RegistrationPage;
import com.gurukula.pages.ResetPasswordPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;

/**
 * @author AnujKumar
 */

@Test(groups = "login")
public class LoginTest extends Init {

	public static Logger logger = Logger.getLogger(LoginTest.class.getName());

	WelcomePage welcomePage;
	LoginPage loginPage;

	@Test
	public void tc_01_testLoginWithValidCredentials() {
		preSteps();
		loginPage.loginAndAssertSuccessfulMessage(USERNAME, PASSWORD);
	}

	@Test(dataProvider = "invalidCredentials")
	public void tc_02_testLoginWithInValidCredentials(String username, String password) {
		preSteps();
		loginPage.assertLoginValidationMsg(username, password);
	}

	@Test
	public void tc_03_testForgotPasswordLink() {
		preSteps();
		loginPage.clickOnLink(LoginPage.FORGET_LINK);

		ResetPasswordPage resetPasswordPage = new ResetPasswordPage(driver);
		resetPasswordPage.assertResetPasswordPageHeading();
	}

	@Test
	public void tc_04_testRegistrationLink() {
		preSteps();
		loginPage.clickOnLink(LoginPage.REGISTER_LINK);

		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.assertRegistrationPageHeading();
	}

	@Test
	public void tc_05_testLogout() {
		preSteps();
		loginPage.loginAndAssertSuccessfulMessage(USERNAME, PASSWORD);

		welcomePage.clickOnOption(MenuEnum.Account.name(), AccountEnum.Logout.getVal());
		welcomePage.assertWelcomePageHeading();

	}

	@Test
	public void tc_06_testHomeTab() {
		preSteps();
		loginPage.loginAndAssertSuccessfulMessage(USERNAME, PASSWORD);

		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Staff.name());
		welcomePage.clickOnMenu(MenuEnum.Home.name());
		welcomePage.assertWelcomePageHeading();
	}

	@Test
	public void tc_07_testLogoNavigation() {
		preSteps();
		loginPage.loginAndAssertSuccessfulMessage(USERNAME, PASSWORD);

		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Staff.name());
		welcomePage.clickOnLogo();
		welcomePage.assertWelcomePageHeading();
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		loginPage = new LoginPage(driver);

		welcomePage.clickOnLink(WelcomeEnum.LOGIN_LINK.getVal());
	}

	@DataProvider(name = "invalidCredentials")
	public Object[][] invalidCredentials() {
		return new Object[][] {
			// @formatter:off
			{ "!nv@lid", "INVALID" }, 
			{ "admin", "INVALID" }, 
			{ "INVALID", "admin" }, 
			{ "", "" },			
			{ "admin", "" }, 
			{ "", "admin" }
			// @formatter:on
		};
	}

}
