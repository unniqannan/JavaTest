package cucumber.stepdefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.org.managers.WebDriverManager;
import com.org.pages.LoginPage;
import com.org.pages.RegistrationPage;
import com.org.pages.ResetPasswordPage;
import com.org.util.LoggerHelper;
import com.org.pages.SettingsPage;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import org.junit.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SettingsPageFunctionality {
	public static WebDriver driver;
//	public static WebDriverManager webdrivermanager;
static Logger logger=LoggerHelper.getLogger(SettingsPageFunctionality.class);
private static final String FiftyCharsCheck="50chars";
private static final String specialCharsCheck="specialCharsCheck";
private static final String NoTextEntry="NoTextEntry";
private static final String MinCharCheck="MinCharCheck";

public void lanuchApplication() {
	 
}

@Given("^A User launches application logs in successfully with valid credentials$")
public void a_User_launches_application_logs_in_successfully_with_valid_credentials()  {
	driver=CommonPageStepDefinition.lanuchApplication();
	LoginPage loginpage=new LoginPage(driver);
	loginpage.ApplicationLaunchLoginButtonClick();
	 loginpage.LoginIntoGuruKulPage("admin","admin");
	   
}

@Given("^User navigates to Settings page by clicking Account Menu > Settings welcome screen$")
public void user_navigates_to_Settings_page_by_clicking_Account_Menu_Settings_welcome_screen()  {
   SettingsPage settingspage=new SettingsPage(driver);
   settingspage.SettingsPageNaviate();
    
}

@Then("^User should be able to see the Settings page$")
public void user_should_be_able_to_see_the_Settings_page()  {
	SettingsPage settingspage=new SettingsPage(driver);
	   settingspage.SetttingsPageTitleValidation();
    
}

@Given("^User Logs in and navigates to Settings page from Account Menu > Settings$")
public void user_Logs_in_and_navigates_to_Settings_page_from_Account_Menu_Settings()  {
	lanuchApplication();
	LoginPage loginpage=new LoginPage(driver);
	 loginpage.LoginIntoGuruKulPage("admin","admin");
	   SettingsPage settingspage=new SettingsPage(driver);
	     settingspage.SettingsPageNaviate();
}

@Then("^user without any changes should be able to change the Settings details by clicking Save button$")
public void user_should_be_able_to_change_the_Settings_details_by_clicking_Save_button()  {
	SettingsPage settingspage=new SettingsPage(driver);
		settingspage.SaveClick();
			settingspage.settingssavedValidmessageVerification();
      
}
@Then("^user does the changes the settings and clicking save button should be able to change the settings$")
public void user_does_the_changes_the_firstname_and_clicking_save_button_should_be_able_to_change_the_settings(){
	SettingsPage settingspage=new SettingsPage(driver);
	settingspage.SettingsChange("firstname","lastname","add2kann@yahoo.com");
	settingspage.settingssavedValidmessageVerification();
}

@Given("^mandatory field check for First Name field if text is not provided$")
public void mandatory_field_check_for_First_Name_field_if_text_is_not_provided()  {
	SettingsPage settingspage=new SettingsPage(driver);
	settingspage.ConfirmFirstNameFieldfieldValidation(NoTextEntry);	
    
}

@Given("^Max chars can enter is fifty in the length for First Name field$")
public void max_chars_can_enter_is_fifty_in_the_length_for_First_Name_field()  {
	SettingsPage settingspage=new SettingsPage(driver);
	settingspage.ConfirmFirstNameFieldfieldValidation(FiftyCharsCheck);	
}

@Given("^mandatory field check for Last Name field if text is not provided$")
public void mandatory_field_check_for_Last_Name_field_if_text_is_not_provided() {
	SettingsPage settingspage=new SettingsPage(driver);
	settingspage.ConfirmLastNameFieldfieldValidation(NoTextEntry);
}
@Given("^Max chars can enter is fifty in the length for Last Name field$")
public void max_chars_can_enter_is_fifty_in_the_length_for_Last_Name_field()  {
	SettingsPage settingspage=new SettingsPage(driver);
	settingspage.ConfirmLastNameFieldfieldValidation(FiftyCharsCheck);	
}

@Then("^user provides email text with less than five chars in <Emailid> and verify proper error message is shown$")
public void user_provides_email_text_with_less_than_five_chars_in_Emailid_and_verify_proper_error_message_is_shown(DataTable testdata)  {
	List<List<String>> data = testdata.raw();
	SettingsPage settingspage=new SettingsPage(driver);
	for(int i=1;i<data.size();i++) 
		settingspage.MinimumCharEmailIdverification(data.get(i).get(0));
}


 
@Then("^User provides no emailid and verify warning error message showing up$")
public void user_provides_no_emailid_and_verify_warning_error_message_showing_up(){
	SettingsPage settingspage=new SettingsPage(driver);
	settingspage.NoEmailIdverification();
}

@Then("^user provides email text having less than five chars without @ symbol in <Emailid> and verify validation is done for minimum char$")
public void user_provides_email_text_having_less_than_five_chars_without_symbol_in_Emailid_and_verify_validation_is_done_for_minimum_char(DataTable testdata) {
	List<List<String>> data = testdata.raw();
	SettingsPage settingspage=new SettingsPage(driver);
	for(int i=1;i<data.size();i++) 
		settingspage.MinimumCharEmailIdverification(data.get(i).get(0));
}

@Then("^user provides email text without @ symbol in <Emailid> and verify validation is done for invalid emailid$")
public void user_provides_email_text_without_symbol_in_Emailid_and_verify_validation_is_done_for_invalid_emailid(DataTable testdata) {
	List<List<String>> data = testdata.raw();
	SettingsPage settingspage=new SettingsPage(driver);
	for(int i=1;i<data.size();i++)
		settingspage.InvalidEmailIdverification(data.get(i).get(0));
}

@Then("^User would be able to select the English text in Language drop down$")
public void user_would_be_able_to_select_the_English_text_in_Language_drop_down() {
	SettingsPage settingspage=new SettingsPage(driver);
	settingspage.SelectLanguage();
}

@Then("^save button is disabled if any of the field of firstname,lastname, email is not provided$")
public void save_button_is_disabled_if_any_of_the_field_of_firstname_lastname_email_is_not_provided(){
	SettingsPage settingspage=new SettingsPage(driver);
	settingspage.saveButtonDisableCheck();
}
@Then("^Settings_FunctionalityCheck_Feature_user closes the session$")
public static void closeBrowser() {
	logger.info("user closes the session");
	//CommonPageStepDefinition.Close_session();
}

	   
 }