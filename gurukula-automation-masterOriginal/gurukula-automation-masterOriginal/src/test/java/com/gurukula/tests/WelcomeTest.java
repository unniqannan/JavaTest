
package com.gurukula.tests;

import org.testng.annotations.Test;

import com.gurukula.common.MenuEnum;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.LoginPage;
import com.gurukula.pages.RegistrationPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;

/**
 * @author AnujKumar
 */

@Test(groups = "welcome")
public class WelcomeTest extends Init {

	@Test
	public void tc_01_testWelcomePage() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.assertWelcomePageHeading();
	}

	@Test
	public void tc_02_testLoginLink() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickOnLink(WelcomeEnum.LOGIN_LINK.getVal());

		LoginPage loginPage = new LoginPage(driver);
		loginPage.assertLoginPageHeading();
	}

	@Test
	public void tc_03_testRegistrationLink() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickOnLink(WelcomeEnum.REGISTER_LINK.getVal());

		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.assertRegistrationPageHeading();
	}

	@Test
	public void tc_04_testAuthenticateMenuOption() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.clickOnOption(MenuEnum.Account.name(), WelcomeEnum.AUTHENTICATE.getVal());

		LoginPage loginPage = new LoginPage(driver);
		loginPage.assertLoginPageHeading();
	}

	@Test
	public void tc_05_testRegisterMenuOption() {
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.assertWelcomePageHeading();
		welcomePage.clickOnOption(MenuEnum.Account.name(), WelcomeEnum.REGISTER.getVal());

		RegistrationPage registrationPage = new RegistrationPage(driver);
		registrationPage.assertRegistrationPageHeading();
	}
}
