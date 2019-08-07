package cucumber.stepdefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.org.pages.StaffPage;
import com.org.pages.BranchesPage;
import com.org.pages.LoginPage;
import com.org.util.LoggerHelper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StaffPageFunctionality {
	public static WebDriver driver;
Logger logger=LoggerHelper.getLogger(StaffPageFunctionality.class);

@Given("^Staff Feature_User launches the application$")
public void lanuchApplication() {
	driver=CommonPageStepDefinition.lanuchApplication();
}
@Given("^User logs in and navigates to Staff page by clicking Account Menu > Staff$")
public void user_logs_in_and_navigates_to_Staff_page_by_clicking_Account_Menu_Staff() {
	    LoginPage loginpage=new LoginPage(driver);
	    loginpage.ApplicationLaunchLoginButtonClick();
		loginpage.LoginIntoGuruKulPage("admin","admin");
		StaffPage searchStaffPage=new StaffPage(driver);
		searchStaffPage.StaffPageNavigate();
}
@Then("^User should be able to see the Staff page$")
public void user_should_be_able_to_see_the_Staff_page(){
	StaffPage StaffPage=new StaffPage(driver);
	StaffPage.StaffPageTitleValidation();
}
@Given("^User able to click Create a new Staff link$")
public void user_able_to_click_Create_a_new_Staff_link() throws Throwable {
	StaffPage staffPage=new StaffPage(driver);
		staffPage.NewStaffButtonClick();
}

@Then("^User should be able to see a popup for creating a Staff$")
public void user_should_be_able_to_see_a_popup_for_creating_a_Staff() throws Throwable {
	StaffPage staffPage=new StaffPage(driver);
	staffPage.CreateorEditStaffPopupCheck();    
}
 

@Then("^create four different Staffs  of <Name> and <Branch>$")
public void create_four_different_Staffs_of_Name_and_Branch(DataTable testdata) throws Throwable {
	StaffPage staffPage=new StaffPage(driver);
	List<List<String>> data = testdata.raw();
	for(int i=1;i<data.size();i++) {
		staffPage.NewStaffButtonClick();
		staffPage.CreateStaff(data.get(i).get(0),data.get(i).get(1));
		logger.info("New Branches are created for Search functionality check");
		}
	}

@When("^on the same page, user search for the Staff using Staff name \"([^\"]*)\"$")
public void on_the_same_page_user_search_for_the_Staff_using_Staff_name(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	BranchesPage branchPage=new BranchesPage(driver);
	branchPage.BranchSearch(arg1);
}

@Then("^Staff details page should be shown in the Staff list for \"([^\"]*)\" as the staff is created$")
public void staff_details_page_should_be_shown_in_the_Staff_list_for_as_the_staff_is_created(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	BranchesPage branchPage=new BranchesPage(driver);
	Thread.sleep(2000);
	branchPage.BranchCheck(arg1);
}

@Given("^User provides the details \"([^\"]*)\" and \"([^\"]*)\" in the Create new Staff popup page and clicks Cancel button$")
public void user_provides_the_details_and_in_the_Create_new_Staff_popup_page_and_clicks_Cancel_button(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//StaffPage staffPage=new StaffPage(driver);
	//staffPage.CreateStaff(arg1,arg2);
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.EnterNewBranchNametextfield(arg1);
	Thread.sleep(500);
	branchesPage.NewBranchCancelButton();
	logger.info("User is clicked the cancel button");
}

@Then("^User cannot see the Staff \"([^\"]*)\" and \"([^\"]*)\" in the Staffs page as it is cancelled$")
public void user_cannot_see_the_Staff_and_in_the_Staffs_page_as_it_is_cancelled(String arg1, String arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	BranchesPage branchPage=new BranchesPage(driver);
	branchPage.BranchCheckNotAvailable(arg1, arg2);
}

@Given("^User clicks the view link for the <OneStaffSelenium> code in the webtable$")
public void user_clicks_the_view_link_for_the_OneStaffSelenium_code_in_the_webtable() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.ClickViewButton();
}

@Then("^User can see the Staff details$")
public void user_can_see_the_Staff_details() throws Throwable {
	StaffPage staffPage=new StaffPage(driver);
	staffPage.ViewBranchDetailsScreen();
}

@Given("^Back should be available in Branch details page and cicking Back button should navigate to Staff page$")
public void back_should_be_available_in_Branch_details_page_and_cicking_Back_button_should_navigate_to_Staff_page() throws Throwable {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.clickBackButtonBranchDetailsPage();
}

@Then("^Create_Edit_Staff_Pop_Up_Name text field has functionality of mandatory check,max char lenth$")
public void name_text_field_has_mandatory_check_minmum_char_length_max_char_lenth()  throws Throwable {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.NameTextFieldNewBranchmandatoryfieldCheck();
	//branchesPage.MaxCharLengthValidationNameTextField();
	StaffPage staffPage=new StaffPage(driver);
	Thread.sleep(5000);
	staffPage.maxfiftyCharslengthCheck();
}

//Edit
@Then("^Name and Branch is shown in Edit Staff page$")
public void name_and_Branch_is_shown_in_Edit_Staff_page() throws Throwable {
	StaffPage staffPage=new StaffPage(driver);
	staffPage.CheckNameAndbranchDetailsAvailableforEditedStaff();
}
@Given("^User clicks Edit Staff link$")
public void user_clicks_Edit_Staff_link() throws Throwable {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.ClickEditButtonBranchList();
}

@Given("^User provides the details \"([^\"]*)\" in the Create new Staff popup page and clicks Cancel button$")
public void user_provides_the_details_in_the_Create_new_Staff_popup_page_and_clicks_Cancel_button(String arg1) throws Throwable {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.EnterNewBranchNametextfield(arg1);
	Thread.sleep(500);
	branchesPage.NewBranchCancelButton();
	logger.info("User is clicked the cancel button");
}

@Then("^User cannot see the staff \"([^\"]*)\" in the Staff page as it is cancelled$")
public void user_cannot_see_the_staff_in_the_Staff_page_as_it_is_cancelled(String arg1) throws Throwable {
	BranchesPage branchPage=new BranchesPage(driver);
	branchPage.BranchCheckNotAvailable(arg1);
}

//Edit and Save 
@Given("^User provides the details \"([^\"]*)\" in the Edit Staff popup page and clicks save button$")
public void user_provides_the_details_and_in_the_Edit_Staf_popup_page_and_clicks_save_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	StaffPage staffPage=new StaffPage(driver);
	staffPage.CreateStaff(arg1,"");
	logger.info("Edited and Save button is clicked");
}

@Then("^User can see the Staff \"([^\"]*)\" created and listed in the Staff page$")
public void user_can_see_the_Branch_and_created_and_listed_in_the_Staff_page(String arg1) throws Throwable {
	BranchesPage branchPage=new BranchesPage(driver);
	Thread.sleep(200);
	branchPage.BranchCheck(arg1);
}

//Delete
@Given("^User clicks the Delete link for <EditedStaffName>$")
public void user_clicks_the_Delete_link_for_EditedStaffName() throws Throwable {
	BranchesPage branchesPage=new BranchesPage(driver);
	branchesPage.BranchIDDelete();
}
@Then("^User Clicks the cancel button in Staff popup window$") 
public void user_Clicks_the_cancel_button_and_seen_that_Branch_ID_is_not_deleted_and_can_be_seen_in_Branch_details_page() throws Throwable {
	BranchesPage branchesPage=new BranchesPage(driver);
	Thread.sleep(5000);
	branchesPage.BranchDeletepopupCancelButton();
}

@Then("^User can see the Staff \"([^\"]*)\" listed in the Staffs page$")
public void user_can_see_the_Staff_listed_in_the_Staffs_page(String arg1) throws Throwable {
	BranchesPage branchPage=new BranchesPage(driver);
	Thread.sleep(500);
	branchPage.BranchCheck(arg1);
}
@Then("^User Clicks the Delete button in Staff popup window$")
public void user_Clicks_the_Delete_button_and_seen_that_Branch_ID_is_deleted_and_will_not_be_listed_in_Branch_details_page() throws Throwable  {
    // Write code here that turns the phrase above into concrete actions
	BranchesPage branchesPage=new BranchesPage(driver);
	Thread.sleep(500);
	branchesPage.BranchListDeletebuttonInPopup();
}

@Then("^User cannot see the Staff \"([^\"]*)\" in the Staffs page$")
public void user_cannot_see_the_Staff_in_the_Staffs_page(String arg1) throws Throwable {
	BranchesPage branchPage=new BranchesPage(driver);
	Thread.sleep(500);
	branchPage.BranchCheckNotAvailable(arg1);
}

}
