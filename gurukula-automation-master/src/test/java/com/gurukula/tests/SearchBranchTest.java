/**
 *
 */
package com.gurukula.tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.ITestContext;
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

@Test(groups = { "searchBranch" })
public class SearchBranchTest extends Init {

	WelcomePage welcomePage;
	LoginPage loginPage;
	StaffPage staffPage;
	BranchPage branchPage;

	@Test
	public void tc_01_testCreateMultipleBranches(ITestContext context) {
		preSteps();
		int id = branchPage.createNewBranch("Test Branch One", "T1");
		branchPage.assertBranchRowBy(id, "Test Branch One", "T1");
		id = branchPage.createNewBranch("Test Branch Two", "T2");
		branchPage.assertBranchRowBy(id, "Test Branch Two", "T2");
		id = branchPage.createNewBranch("BranchThree", "T3");
		branchPage.assertBranchRowBy(id, "BranchThree", "T3");
		context.setAttribute("branch_id", id);
	}

	@Test(dataProvider = "searchKeywords", dependsOnMethods = "tc_01_testCreateMultipleBranches")
	public void tc_02_testSearchBranch(String searchKeyword) {
		preSteps();
		branchPage.searchBranch(searchKeyword);
		branchPage.assertSearchResult(searchKeyword);
	}

	@Test(dependsOnMethods = "tc_01_testCreateMultipleBranches")
	public void tc_03_testSearchBranchByMultipleKeywords() {
		preSteps();
		branchPage.searchBranch("One Two");
		branchPage.assertAtleatOneResultFound("One");
		branchPage.assertAtleatOneResultFound("Two");
	}

	@Test(dependsOnMethods = "tc_01_testCreateMultipleBranches")
	public void tc_04_testSearchBranchById() {
		preSteps();
		String id = String.valueOf(branchPage.getMaxId());
		branchPage.searchBranch(id);
		branchPage.assertSearchResult(id);
	}

	@Test(dependsOnMethods = "tc_01_testCreateMultipleBranches")
	public void tc_05_testSearchBranchShouldNotContain() {
		preSteps();
		branchPage.searchBranch("!One");
		branchPage.assertSearchResultShouldNotContain("One");
	}

	@Test(dependsOnMethods = "tc_01_testCreateMultipleBranches")
	public void tc_06_testSearchBranchNoResult() {
		preSteps();

		branchPage.searchBranch("doesNotExist");
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
		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Branch.name());
	}

	@DataProvider(name = "searchKeywords")
	public Object[][] searchKeywords() {

		return new Object[][] { { "BranchThree" }, { "Branch" }, { "BRANCHTHREE" }, { "T1" } };
	}

}
