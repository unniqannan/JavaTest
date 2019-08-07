package cucumber.stepdefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.org.pages.RegistrationPage;
import com.org.pages.WelcomePage;
import com.org.util.LoggerHelper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationPageFunctionality {
	public static WebDriver driver;

Logger logger=LoggerHelper.getLogger(RegistrationPageFunctionality.class);
private static final String FiftyCharsCheck="50chars";
private static final String specialCharsCheck="specialCharsCheck";
private static final String NoTextEntry="NoTextEntry";
private static final String MinCharCheck="MinCharCheck";

  
@Given("^Registration_Feature_User launches the application$")
public void registration_feature_user_launches_the_application() throws Throwable {
	driver=CommonPageStepDefinition.lanuchApplication();
}

@Given("^user navigates to Registration details page by clicking Register a new Account link in welcome screen$")
public void UserNavigatesto_RegistrationDetailsPage_usingRegisternewAccountLink(){
	 WelcomePage welcomepage=new WelcomePage(driver);
		welcomepage.RegisterANewAccountlinkclick(); 
   }	
  
@Then("^user provides the Registration details$")
public void RegistrationDetailsWithUsername() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.EnterUsername("kan");
	registrationPage.EnterEmail("add2kannan@yahoo.com"); 
	registrationPage.Enterpassword("password");
	registrationPage.EnterconfirmPassword("password");
	
}
   
@Then("^Clicking Register button$")
public void clicking_Register_button() {
	 driver.findElement(By.xpath("//button[text()='Register']")).click();
}

@When("^user provides the Registration details as <username> ,<Email>, <password>, <ConfirmPassword>$")
public void user_shoudl_provide_credentials_username_and_password(DataTable testdata) {
	List<String> login=testdata.asList(String.class);
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.EnterRegistrationDetails(login.get(0),login.get(1),login.get(2),login.get(3));
}
@Then("^User should not be able to register as it is an existing user$")
public void user_should_not_be_able_to_register() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.RegistrationValidationMessage("ExistingUser");
}

@Then("^user should be successfully able to register$")
public void user_should_be_successfully_able_to_register() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.RegistrationValidationMessage("Success");
}
@Given("^mandatory field check for Login text field if login is not provided$")
public void mandatory_field_check_for_Login_text_field_if_login_is_not_provided(){
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.LoginFieldfieldValidation("NoTextEntry");
}

@Given("^Max chars length check for Login text field if more than fifty chars entered$")
public void max_chars_length_check_for_Login_text_field_if_more_than_chars_entered(){
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.LoginFieldfieldValidation(FiftyCharsCheck);	
}

@Given("^lower-case letters and digits check for Login text field if special chars entered$")
public void lower_case_letters_and_digits_check_for_Login_text_field_if_special_chars_entered(){
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.LoginFieldfieldValidation(specialCharsCheck);	
}
 
@Given("^mandatory field check for Password text field if text is not entered$")
public void mandatory_field_check_for_Password_text_field_if_text_is_not_entered() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.PasswordFieldfieldValidation(NoTextEntry);	
}

@Given("^Min chars length check for Password text field if text is less than five chars$")
public void min_chars_length_check_for_Password_text_field_if_text_is_less_than_five_chars() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.PasswordFieldfieldValidation(MinCharCheck);	
}

@Given("^Max chars length check for Password text field if text is more than fifty chars$")
public void max_chars_length_check_for_Password_text_field_if_text_is_more_than_fifty_chars() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.PasswordFieldfieldValidation(FiftyCharsCheck);
}

@Given("^mandatory field check for confirmation Password text field if text is not entered$")
public void mandatory_field_check_for_confirmation_Password_text_field_if_text_is_not_entered() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.ConfirmPasswordFieldfieldValidation(NoTextEntry);	
}

@Given("^Min chars length check for confirmation Password text field if text is less than five chars$")
public void min_chars_length_check_for_confirmation_Password_text_field_if_text_is_less_than_five_chars() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.ConfirmPasswordFieldfieldValidation(MinCharCheck);	
}

@Given("^Max chars length check for confirmation Password text field if text is more than fifty chars$")
public void max_chars_length_check_for_confirmation_Password_text_field_if_text_is_more_than_fifty_chars() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.ConfirmPasswordFieldfieldValidation(FiftyCharsCheck);
}


@Then("^Verify that valid warning Error message is shown up if new password and confirm password not matching$")
public void verify_that_valid_warning_Error_message_is_shown_up_if_new_password_and_confirm_password_not_matching() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.ValidationMessageCheck_for_PasswordMatching();
}

@Given("^user provides different password text in Registration page for complexity check and seen that password Strength is shown up$")
public void user_provides_different_password_text_in_Registration_page_for_complexity_check_and_seen_that_password_Strength_is_shown_up() {
	RegistrationPage registrationPage=new RegistrationPage(driver);
	registrationPage.PasswordStrengthCheck("Kannan", "Kannan@","Kannan@112");
}
 

@Then("^Registration_FunctionalityCheck_Feature_user closes the session$")
public void registration_functionalitycheck_feature_user_closes_the_session() throws Throwable {
	//CommonPageStepDefinition.Close_session();
}	   
 }