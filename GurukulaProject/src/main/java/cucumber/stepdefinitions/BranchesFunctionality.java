package cucumber.stepdefinitions;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.org.managers.WebDriverManager;
import com.org.pages.BranchesPage;
import com.org.pages.LoginPage;
import com.org.util.LoggerHelper;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class BranchesFunctionality {
	public static WebDriver driver;
	//public static WebDriverManager webdrivermanager;
Logger logger=LoggerHelper.getLogger(BranchesFunctionality.class);



@Given("^Branches Feature_User launches the application$")
public void lanuchApplication() {
	 //webdrivermanager=new WebDriverManager();
	// driver=webdrivermanager.getDriver();	
	// logger.info("driver is initialized for Branches Feature");
	// logger.info("Application is launched");
	driver=CommonPageStepDefinition.lanuchApplication();
}

@Given("^User logs in and navigates to Branches page by clicking Account Menu > Branches$")
public void user_logs_in_and_navigates_to_Branches_page_by_clicking_Account_Menu_Branches() {
	    LoginPage loginpage=new LoginPage(driver);
	    loginpage.ApplicationLaunchLoginButtonClick();
		loginpage.LoginIntoGuruKulPage("admin","admin");
		BranchesPage branchesPage=new BranchesPage(driver);
		branchesPage.BranchesPageNavigate();
}
@Then("^User should be able to see the Branches page$")
public void user_should_be_able_to_see_the_Branches_page(){
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchesPageTitleValidation();
}
@Given("^User able to click Create a new Branch link$")
public void user_able_to_click_Create_a_new_Branch_link() {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.NewBranchButtonClick();
}
@Then("^User should be able to see a popup for creating a Branch$")
public void user_should_be_able_to_see_a_popup_for_creating_a_Branch() {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchDetailsPopupCheck();
}

@Given("^User provides the details \"([^\"]*)\" and \"([^\"]*)\" in the Create new Branch popup page and clicks Save button$")
public void user_provides_the_details_and_in_the_Create_new_Branch_popup_page_and_clicks_Save_button(String Name, String Code) {
BranchesPage branchesPage=new BranchesPage(driver);
branchesPage.CreateBranch(Name,Code);
}

@Then("^User can see the Branch \"([^\"]*)\" and \"([^\"]*)\" created and listed in the Branches page$")
public void user_can_see_the_Branch_and_created_and_listed_in_the_Branches_page(String Name, String Code){
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchCheck(Name,Code);
}
//Cancel
@Given("^User provides the details \"([^\"]*)\" and \"([^\"]*)\" in the Create new Branch popup page and clicks Cancel button$")
public void user_provides_the_details_and_in_the_Create_new_Branch_popup_page_and_clicks_Cancel_button(String Name, String Code) {
BranchesPage branchesPage=new BranchesPage(driver);
branchesPage.EnterNewBranchNametextfield(Name);
branchesPage.EnterNewBranchCodetextfield(Code);
branchesPage.NewBranchCancelButton();
}
@Then("^User cannot see the Branch \"([^\"]*)\" and \"([^\"]*)\" in the Branches page as it is cancelled$")
public void user_cannot_see_the_Branch_and_in_the_Branches_page_as_it_is_cancelled(String Name, String Code) {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchNotAvailable(Name,Code);
}
@Given("^User clicks the view link for the <NewBranchName> code in the webtable$")
public void user_clicks_the_view_link_for_the_BranchID_in_the_webtable()  {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.ClickViewButton();
}

@Then("^User can see the Branch details$")
public void user_can_see_the_Branch_details()  {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.ViewBranchDetailsScreen();
    
}

@Given("^User clicks the Branch ID of given <NewBranchName> in the webtable$")
public void user_clicks_the_Branch_ID_of_given_BranchID_in_the_webtable()  {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.ClickingBranchID();
}
@Then("^User can see the Branch details of \"([^\"]*)\" and \"([^\"]*)\" of the BranchID$")
public void user_can_see_the_Branch_details_of_and_of_the_BranchID(String Name, String Code) {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.ViewBranchDetailsNameCode(Name,Code);
}
@Then("^Back should be available in Branch details page and cicking Back button should navigate to Branches page$")
public void back_should_be_available_in_Branch_details_page_and_cicking_Back_button_should_navigate_to_Branches_page() {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.clickBackButtonBranchDetailsPage();
}
@Then("^Name text field has functionality of mandatory check,minmum char length, max char lenth$")
public void name_text_field_has_mandatory_check_minmum_char_length_max_char_lenth()  {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.NameTextFieldNewBranchmandatoryfieldCheck();
	branchesPage.MiniumCharLengthValidationNameTextField();
    
}

@Then("^Code text field has functionality of mandatory check,only digits can be entered$")
public void code_text_field_has_functionality_of_mandatory_check_only_digits_can_be_entered(){
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.CodeTextFieldNewBranchmandatoryfieldCheck();
	branchesPage.MiniumCharLengthValidationCodeTextField();
	branchesPage.OnlyDigitsInputValidationNameTextField();
}

//Edit
@Given("^User clicks Edit link$")
public void user_clicks_Edit_link_for_and()  {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.ClickEditButtonBranchList();
}

@Then("^Name and Code is shown for for \"([^\"]*)\" and \"([^\"]*)\" in Edit Branch page$")
public void name_and_Code_should_be_shown_in_Edit_Branch_page(String Name,String Code)  {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.EditScreenValidation(Name,Code);   
}

@Given("^User provides the details \"([^\"]*)\" and \"([^\"]*)\" in the Create new Branch popup page and clicks save button$")
public void user_provides_the_details_and_in_the_Create_new_Branch_popup_page_and_clicks_save_button(String Name, String Code) {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.CreateBranch(Name,Code);
}
  
@Given("^User clicks the Delete link for <EditedBranchName>$")
public void user_clicks_the_Delete_link_for_Branch_ID()  {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchIDDelete();
    
}

@Then("^User Clicks the cancel button in popup window$")
public void user_Clicks_the_cancel_button_and_seen_that_Branch_ID_is_not_deleted_and_can_be_seen_in_Branch_details_page()  {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchDeletepopupCancelButton();
}

@Then("^User Clicks the Delete button in popup window$")
public void user_Clicks_the_Delete_button_and_seen_that_Branch_ID_is_deleted_and_will_not_be_listed_in_Branch_details_page()  {
    // Write code here that turns the phrase above into concrete actions
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchListDeletebuttonInPopup();
}

@Then("^User cannot see the Branch \"([^\"]*)\" and \"([^\"]*)\" created and listed in the Branches page$")
public void user_cannot_see_the_Branch_and_created_and_listed_in_the_Branches_page(String Name, String Code) {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchCheckNotAvailable(Name,Code);
}

@Then("^Branches_FunctionalityCheck_Feature_user closes the session$")
public  void closeBrowser() {
	logger.info("user closes the session");
	CommonPageStepDefinition.Close_session();
}

	   
 }