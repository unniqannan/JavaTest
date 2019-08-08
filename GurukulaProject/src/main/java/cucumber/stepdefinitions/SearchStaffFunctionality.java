package cucumber.stepdefinitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.org.pages.BranchesPage;
import com.org.pages.LoginPage;
import com.org.pages.StaffPage;
import com.org.util.LoggerHelper;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStaffFunctionality {
	
	public static WebDriver driver;
	Logger logger=LoggerHelper.getLogger(SearchBranchFunctinality.class);
	
	@Given("^Search_Staff_Feature_User launches the application and navigates to Account Menu > Staffes with default admin login$")
	public void LaunchesApplication_NavigatesStaffPage() throws Throwable {
	    driver=CommonPageStepDefinition.lanuchApplication();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.ApplicationLaunchLoginButtonClick();
		loginpage.LoginIntoGuruKulPage("admin","admin");
		StaffPage searchStaffPage=new StaffPage(driver);
		searchStaffPage.StaffPageNavigate();
	}
	@Then("^Navigate to Account menu > Staffs and create four different Staffs  of <Name> and <Branch>$")
	public void navigate_to_Account_menu_Staffs_and_create_four_different_Staffs_of_Name_and_Branch(DataTable testdata) throws Throwable {
		StaffPage staffPage=new StaffPage(driver);
		List<List<String>> data = testdata.raw();
		for(int i=1;i<data.size();i++) {
			staffPage.NewStaffButtonClick();
			staffPage.CreateStaff(data.get(i).get(0),data.get(i).get(1));
			logger.info("New Branches are created for Search functionality check");
		}
	}	
	@When("^user search for the Staff using Staff name \"([^\"]*)\"$")
	public void user_search_for_the_Staff_using_Staff_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BranchesPage branchPage=new BranchesPage(driver);
		branchPage.BranchSearch(arg1);
	}
	@Then("^Staff details should be shown in the Staff list for \"([^\"]*)\"$")
	public void staff_details_should_be_shown_in_the_Staff_list_for(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		BranchesPage branchPage=new BranchesPage(driver);
		branchPage.BranchCheck(arg1);
	}
	@Then("^Staff details should NOT be shown for \"([^\"]*)\" search criteria as it is partial name$")
	public void staff_details_should_NOT_be_shown_for_search_criteria_as_it_is_partial_name(String arg1) throws Throwable {
		BranchesPage branchPage=new BranchesPage(driver);
		branchPage.BranchNotAvailable(arg1);	   
	}
	@When("^user search for the Staff using Staff name with <lowercasesANDuppercases> then Staff details should be shown$")
	public void user_search_for_the_Staff_using_Staff_name_with_lowercasesANDuppercases_then_Staff_details_should_be_shown(DataTable testdata) throws Throwable {
		BranchesPage branchPage=new BranchesPage(driver);
		List<List<String>> data = testdata.raw();
		for(int i=1;i<data.size();i++) {
			branchPage.BranchSearch(data.get(i).get(0));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			branchPage.BranchCheck(data.get(i).get(0));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	  
	@When("^user search for the Staff using Staff name with <workwithspaces> then Staff details should NOT be shown$")
	public void user_search_for_the_Staff_using_Staff_name_with_workwithspaces_then_Staff_details_should_NOT_be_shown(DataTable testdata) throws Throwable {
		BranchesPage branchPage=new BranchesPage(driver);
		List<List<String>> data = testdata.raw();
		for(int i=1;i<data.size();i++) {
			branchPage.BranchSearch(data.get(i).get(0));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			branchPage.BranchNotAvailable(data.get(i).get(0));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	   
	}

	@When("^user search for the Staff using Staff ID with \"([^\"]*)\"$")
	public void user_search_for_the_Staff_using_Staff_ID_with(String arg1) throws Throwable {
		BranchesPage branchPage=new BranchesPage(driver);
		   branchPage.BranchSearch(arg1);
	}

	@Then("^Staff details should be shown with \"([^\"]*)\"$")
	public void staff_details_should_be_shown_with(String arg1) throws Throwable {
		 BranchesPage branchPage=new BranchesPage(driver);
		   branchPage.BranchCheck(arg1);
	}

	@When("^user search for staff with invalid characters <invalidcharacters> and see that search page will not shown any results$")
	public void user_search_for_staff_with_invalid_characters_invalidcharacters_and_see_that_search_page_will_not_shown_any_results(DataTable testdata) throws Throwable {
		BranchesPage branchPage=new BranchesPage(driver);
		List<List<String>> data = testdata.raw();
		for(int i=1;i<data.size();i++) {
			branchPage.BranchSearch(data.get(i).get(0));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			branchPage.BranchNotAvailable(data.get(i).get(0));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@When("^user search for the Staff using \"([^\"]*)\" name where results are not shown$")
	public void user_search_for_the_Staff_using_name_where_results_are_not_shown(String arg1) throws Throwable {
		BranchesPage branchPage=new BranchesPage(driver);
		   branchPage.BranchSearch(arg1);
	}

	@When("^user clears the search criteria and clicks the search with blank in search text field$")
	public void user_clears_the_search_criteria_and_clicks_the_search_with_blank_in_search_text_field() throws Throwable {
		BranchesPage branchPage=new BranchesPage(driver);
		   branchPage.BranchSearch("");
	}

	@Then("^all Staff details should be shown in the Staff list$")
	public void all_Staff_details_should_be_shown_in_the_Staff_list() throws Throwable {
		 BranchesPage branchPage=new BranchesPage(driver);
		   branchPage.BranchCheck("ONEBRANCHSELENIUM");
	}
}
