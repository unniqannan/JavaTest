/**
 *
 */
package com.gurukula.tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gurukula.common.EntitiesEnum;
import com.gurukula.common.MenuEnum;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.BranchPage;
import com.gurukula.pages.LoginPage;
import com.gurukula.pages.StaffPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;

/**
 * @author AnujKumar
 */

@Test(groups = { "searchStaff" })
public class SearchStaffTest extends Init {

	WelcomePage welcomePage;
	LoginPage loginPage;
	StaffPage staffPage;
	BranchPage branchPage;

	@Test
	public void tc_01_testCreateBranchAndMultipleSatffs() {
		preSteps();
		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Branch.name());
		int id = branchPage.createNewBranch("Associated Branch", "AS");
		branchPage.assertBranchRowBy(id, "Associated Branch", "AS");
		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Staff.name());
		id = staffPage.createNewStaff("Test Staff One", "Associated Branch");
		staffPage.assertStaffRowBy(id, "Test Staff One", "Associated Branch");

		id = staffPage.createNewStaff("Test Staff Two", "Associated Branch");
		staffPage.assertStaffRowBy(id, "Test Staff Two", "Associated Branch");

		id = staffPage.createNewStaff("StaffThree", "Associated Branch");
		staffPage.assertStaffRowBy(id, "StaffThree", "Associated Branch");
	}

	@Test(dataProvider = "searchKeywords", dependsOnMethods = "tc_01_testCreateBranchAndMultipleSatffs")
	public void tc_02_testSearchStaff(String searchKeyword) {
		preSteps();
		staffPage.searchStaff(searchKeyword);
		staffPage.assertSearchResult(searchKeyword);
	}

	@Test(dependsOnMethods = "tc_01_testCreateBranchAndMultipleSatffs")
	public void tc_03_testSearchStaffByMultipleKeywords() {
		preSteps();
		staffPage.searchStaff("One Two");
		staffPage.assertAtleatOneResultFound("One");
		staffPage.assertAtleatOneResultFound("Two");
	}

	@Test(dependsOnMethods = "tc_01_testCreateBranchAndMultipleSatffs")
	public void tc_04_testSearchStaffById() {
		preSteps();
		String id = String.valueOf(staffPage.getMaxId());
		staffPage.searchStaff(id);
		staffPage.assertSearchResult(id);
	}

	@Test(dependsOnMethods = "tc_01_testCreateBranchAndMultipleSatffs")
	public void tc_05_testSearchStaffShouldNotContain() {
		preSteps();
		staffPage.searchStaff("!One");
		staffPage.assertSearchResultShouldNotContain("One");
	}

	@Test(dependsOnMethods = "tc_01_testCreateBranchAndMultipleSatffs")
	public void tc_06_testSearchStaffNoResult() {
		preSteps();

		staffPage.searchStaff("doesNotExist");
		List<List<String>> lst = branchPage.getAllRows();
		assertEquals(lst.size(), 0, "Search result should be blank.");
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		loginPage = new LoginPage(driver);
		branchPage = new BranchPage(driver);
		staffPage = new StaffPage(driver);

		welcomePage.clickOnLink(WelcomeEnum.LOGIN_LINK.getVal());
		loginPage.loginAndAssertSuccessfulMessage(USERNAME, PASSWORD);
		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Staff.name());
	}

	@DataProvider(name = "searchKeywords")
	public Object[][] searchKeywords() {

		return new Object[][] { { "StaffThree" }, { "Staff" }, { "STAFFTHREE" }, { "Associated Branch" } };
	}

}
