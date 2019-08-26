package com.org.tests;

import org.testng.annotations.Test;

import com.org.enums.AppUserActionsEnum;
import com.gurukula.common.MenuEnum;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.LoginPage;
import com.gurukula.pages.SessionsPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;

@Test(groups = { "sessions" })
public class SessionsTest extends Init {

	WelcomePage welcomePage;
	LoginPage loginPage;
	SessionsPage sessionsPage;

	@Test
	public void tc_01_testSessionsPageHeading() {
		preSteps();
		sessionsPage.assertUpdatePasswordPageHeading("admin");
	}

	@Test
	public void tc_02_testInvalidateSession() {
		preSteps();
		sessionsPage.invalidateSession();
		sessionsPage.assertSuccessMessage();
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		loginPage = new LoginPage(driver);
		sessionsPage = new SessionsPage(driver);

		welcomePage.clickOnLink(WelcomeEnum.LOGIN_LINK.getVal());
		loginPage.loginAndAssertSuccessfulMessage(USERNAME, PASSWORD);
		welcomePage.clickOnOption(MenuEnum.Account.name(), AppUserActionsEnum.Sessions.getVal());
	}

}
