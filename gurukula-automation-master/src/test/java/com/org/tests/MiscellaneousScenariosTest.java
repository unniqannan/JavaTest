 
package com.org.tests;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.org.enums.AppUserActionsEnum;
import com.org.enums.AppPageAttributesEnum;
import com.org.enums.AppMenuEnum;
import com.org.enums.AppWelcomePageEnum;
import com.org.pages.BranchMainPage;
import com.org.pages.LoginPage;
import com.org.pages.StaffMainPage;
import com.org.pages.WelcomePage;
import com.org.utility.StartApplication;

 
@Test(groups = { "misc" })
public class MiscellaneousScenariosTest extends StartApplication {

	WelcomePage welcomePage;
	LoginPage loginPage;
	StaffMainPage staffPage;
	BranchMainPage branchPage;

	@Test(dataProvider = "branchAndStaffDetails")
	public void tc_01_testUpdatedBranchNameOnStaff(String branch, String code, String staff, ITestContext context) {
		preSteps();
		int branchId = branchPage.createNewBranch(branch, code);
		branchPage.assertBranchRowBy(branchId, branch, code);
		context.setAttribute("branchId", branchId);

		welcomePage.clickOnOption(AppMenuEnum.Entities.name(), EntitiesEnum.Staff.name());

		int staffId = staffPage.createNewStaff(staff, branchId);
		staffPage.assertStaffRowBy(staffId, staff, branch);

		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Branch.name());
		branchPage.clickOnActionCorrespondingToId(ActionsEnum.Edit.name(), branchId);
		branchPage.assertDetailsOnEditForm(branchId, branch, code);
		branchPage.updateBranchDetails(ActionsEnum.Save.name(), "Civil", code);

		branchPage.assertBranchRowBy(branchId, "Civil", code);

		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Staff.name());
		staffPage.assertStaffRowBy(staffId, staff, "Civil");

	}

	@Test
	public void tc_02_testDeleteBranchAssociatedWithStaff(ITestContext context) {
		preSteps();
		int branchId = (Integer) context.getAttribute("branchId");
		branchPage.clickOnActionCorrespondingToId(ActionsEnum.Delete.name(), branchId);
		branchPage.assertDeleteConfirmationModalForBranch(branchId);
		branchPage.deleteBranch(ActionsEnum.Delete.name());

		/*
		 * TODO: Code need to be added after defect ID [defect_25] get fixed.
		 */
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

	@DataProvider(name = "branchAndStaffDetails")
	public Object[][] newBranchDetails() {
		return new Object[][] { { "Mechanical", "ME", "Anuj" } };
	}

}
