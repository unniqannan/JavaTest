package cucumber.stepdefinitions;

import org.apache.log4j.Logger;
import org.junit.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

import com.org.managers.WebDriverManager;
import com.org.pages.LoginPage;
import com.org.pages.SessionsPage;
import com.org.util.Log;
import com.org.util.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SessionsPageFunctionality {

	public static WebDriver driver;
	Logger logger=LoggerHelper.getLogger(SessionsPageFunctionality.class);
	
	@Given("^Sessions_FunctionalityCheck_Feature_user login into the Gurukul application$")
	public void user_login_into_the_Gurukul_application() {
		driver=CommonPageStepDefinition.lanuchApplication();
		 LoginPage loginpage=new LoginPage(driver);
		 loginpage.ApplicationLaunchLoginButtonClick();
		 loginpage.LogindefaultUserDetails();
	}

	@When("^user navigates navigate to the sessions page through Account > Sessions menu$")
	public void user_navigates_navigate_to_the_sessions_page_through_Account_Sessions_menu(){
		SessionsPage sessionpage=new SessionsPage(driver);
		sessionpage.NaviateToSessionPage();
	}

	@Then("^user should be able to navigate and see the sessions page$")
	public void user_should_be_able_to_navigate_and_see_the_sessions_page(){
		SessionsPage sessionpage=new SessionsPage(driver);
		sessionpage.SessionPageTitleVaidation();
	}
/*
	@Given("^user login into the Gurukul application and navigates to Sessions page from Accounts menu$")
	public void user_login_into_the_Gurukul_application_and_navigates_to_Sessions_page_from_Accounts_menu() {
		LoginPage loginpage=new LoginPage(driver);
		loginpage.LogindefaultUserDetails();
		SessionsPage sessionpage=new SessionsPage(driver);
		sessionpage.NaviateToSessionPage();		
	}
*/
	@Given("^User should be able to invalidate the sessions$")
	public void user_should_be_able_to_invalidate_the_sessions() {
		SessionsPage sessionpage=new SessionsPage(driver);
		sessionpage.InvalidateSession();
	}

	@Then("^Valid message should be shown stating the session is invalidated$")
	public void valid_message_should_be_shown_stating_the_session_is_invalidated(){
		SessionsPage sessionpage=new SessionsPage(driver);
		sessionpage.InvalidatedSessionPageTitleVerfication();
	} 
	
	@Then("^Sessions_FunctionalityCheck_Feature_user closes the session$")
	public void user_closes_the_session() {
			logger.info("user closes the session");
			//CommonPageStepDefinition.Close_session();
			//webdrivermanager.closeDriver();
	}
}
 
