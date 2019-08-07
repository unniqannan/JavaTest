package cucumber.stepdefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import com.org.managers.WebDriverManager;
import com.org.pages.LoginPage;
import com.org.pages.RegistrationPage;
import com.org.pages.ResetPasswordPage;
import com.org.pages.SettingsPage;
import com.org.util.Log;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.org.util.LoggerHelper;
//

public class LoginProgram {
	public static WebDriver driver;
	Logger logger=LoggerHelper.getLogger(LoginProgram.class);

	 
	
@Given("^A user launch the Gurukul application$")
public void naviagate_to_GurukulaURL_page() {
	driver=CommonPageStepDefinition.lanuchApplication();
   }

@Given("^User logs in by clicking Login button$")
public void user_logs_in_by_clicking_Login_button() throws Throwable {
	LoginPage loginpage=new LoginPage(driver);
	loginpage.ApplicationLaunchLoginButtonClick();

}

@Then("^User should not be able to login with invalid credentials <username> and <password>$")
public void user_should_not_be_able_to_login_with_invalid_credentials_username_and_password(DataTable testdata) throws Throwable {
	LoginPage loginpage=new LoginPage(driver);
	List<List<String>> data = testdata.raw();
	for(int i=1;i<5;i++) {
		loginpage.LoginIntoGuruKulPage(data.get(i).get(0),data.get(i).get(1));
		logger.info("Invalid Credentials provided and Login should fail");
		loginpage.clearLogintext();
	}
}
  
@Then("^User should be able to login successfully with valid credentials <username> and <password>$")
public void user_should_be_able_to_login_successfully_with_correct_credentials_username_and_password(DataTable testdata) {
	List<String> login=testdata.asList(String.class);
	LoginPage loginpage=new LoginPage(driver);
	System.out.println(login.get(0));
	System.out.println(login.get(1));
	loginpage.LoginIntoGuruKulPage(login.get(0),login.get(1));
}



@Then("^User should be able to navigate to Reset Password page by clicking Forgot Password link$")
public void user_clicking_the_Forgot_Password_link(){
     ResetPasswordPage resetPassword=new ResetPasswordPage(driver);
     resetPassword.ForgotPasswordlinkClick();
}
  
@Then("^User clicking on Register new account link should navigate to register new user page$")
public void User_clicking_Register_new_account_link_navigate_register_user_page()   {
	 RegistrationPage registrationPage=new RegistrationPage(driver);
	 registrationPage.RegisterNewAccountClick();
}

@Then("^user logout button should successfully logout from the application$")
public void user_logout_button_should_successfully_logout_from_the_application() {
	LoginPage loginpage=new LoginPage(driver);
	loginpage.Logout();
}

@Then("^clicking Gurukula logo link navigates to Home page$")
public void clicking_Gurukula_logo_link_navigates_to_Home_page() {
	LoginPage loginpage=new LoginPage(driver);
	loginpage.GurukulaLogoclick();
}

@Then("^clicking Home link navigates to Home page$")
public void clicking_Home_link_navigates_to_Home_page() {
	LoginPage loginpage=new LoginPage(driver);
	loginpage.GurukulaHomeLinkClick();
}

@Then("^uncheck the remember me checkbox in login page$")
public void check_the_check_box_remember_me_in_login_page() {
	LoginPage loginpage=new LoginPage(driver);
	loginpage.rememberMecheckboxClick();
}
 
@Then("^after Reopen the browser should see the user remain login$")
public void after_Reopen_the_browser_should_see_the_user_remain_login() throws Throwable {
	driver.get("http://127.0.0.1:8080/#/");
}

@Then("^Login_FunctionalityCheck_Feature_user closes the session$")
public void login_functionalitycheck_feature_user_closes_the_session() throws Throwable {
	CommonPageStepDefinition.Close_session();
}

@Then("^user should not be logged in the new browser$")
public void user_should_not_be_logged_in_the_new_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
}


 }