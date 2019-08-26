/**
 *
 */
package com.org.tests;

import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.gurukula.common.ActionsEnum;
import com.gurukula.common.Constants;
import com.gurukula.common.EntitiesEnum;
import com.gurukula.common.MenuEnum;
import com.gurukula.common.WelcomeEnum;
import com.gurukula.pages.BranchPage;
import com.gurukula.pages.LoginPage;
import com.gurukula.pages.StaffDetailPage;
import com.gurukula.pages.StaffPage;
import com.gurukula.pages.WelcomePage;
import com.gurukula.utility.Init;

/**
 * @author AnujKumar
 */
@Test(groups = { "staff" })
public class StaffTest extends Init {

	WelcomePage welcomePage;
	LoginPage loginPage;
	StaffPage staffPage;
	StaffDetailPage staffDetailPage;
	BranchPage branchPage;

	@Test(dataProvider = "newBranchDetails")
	public void tc_01_testCreateNewBranch(String name, String code, ITestContext context) {
		preSteps();
		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Branch.name());
		int id = branchPage.createNewBranch(name, code);

		branchPage.assertBranchRowBy(id, name, code);
		context.setAttribute("id", id);
	}

	@Test
	public void tc_02_testStaffPage() {
		preSteps();
		staffPage.assertStaffPageHeading();
	}

	@Test(dataProvider = "newStaffDetails", dependsOnMethods = "tc_01_testCreateNewBranch")
	public void tc_03_testCreateNewStaff(String name, String branch, ITestContext context) {
		preSteps();
		int id = staffPage.createNewStaff(name, branch);

		staffPage.assertStaffRowBy(id, name, branch);
		context.setAttribute("id", id);
	}

	@Test(dataProvider = "newStaffDetails", dependsOnMethods = "tc_01_testCreateNewBranch")
	public void tc_04_testCreateNewStaffAndCancel(String name, String branch) {
		preSteps();
		int maxIdBefore = staffPage.getMaxId();
		int maxIdAfter = staffPage.createAndCancel(name, branch);

		assertEquals(maxIdAfter, maxIdBefore, "New Staff should not be created.");
	}

	@Test(dataProvider = "newStaffDetails", dependsOnMethods = { "tc_03_testCreateNewStaff" })
	public void tc_05_testStaffDetailsByIdLink(String name, String branch, ITestContext context) {
		preSteps();
		int id = (Integer) context.getAttribute("id");
		staffPage.navigateToStaffDetailPageById(id);

		staffDetailPage.assertInfoOnStaffDetailPage(id, name, branch);
	}

	@Test(dataProvider = "newStaffDetails", dependsOnMethods = { "tc_03_testCreateNewStaff" })
	public void tc_06_testStaffDetailsByView(String name, String branch, ITestContext context) {
		preSteps();
		int id = (Integer) context.getAttribute("id");
		staffPage.clickOnActionCorrespondingToId(ActionsEnum.View.name(), id);

		staffDetailPage.assertInfoOnStaffDetailPage(id, name, branch);
	}

	@Test(dataProvider = "newStaffDetails", dependsOnMethods = { "tc_03_testCreateNewStaff" })
	public void tc_07_testDetailsOnEditStaff(String name, String branch, ITestContext context) {
		preSteps();
		int id = (Integer) context.getAttribute("id");
		staffPage.clickOnActionCorrespondingToId(ActionsEnum.Edit.name(), id);

		staffPage.assertDetailsOnEditForm(id, name, branch);
	}

	@Test(dataProvider = "editStaffDetails", dependsOnMethods = { "tc_03_testCreateNewStaff" })
	public void tc_08_testEditStaffDetailsAndCancel(String name, String branch, String updatedName,
			String updatedbranch, ITestContext context) {
		preSteps();
		int id = (Integer) context.getAttribute("id");
		staffPage.clickOnActionCorrespondingToId(ActionsEnum.Edit.name(), id);
		staffPage.assertDetailsOnEditForm(id, name, branch);
		staffPage.updateStaffDetails(ActionsEnum.Cancel.name(), updatedName, updatedbranch);

		staffPage.assertStaffRowBy(id, name, branch);
	}

	@Test(dataProvider = "editStaffDetails", dependsOnMethods = { "tc_03_testCreateNewStaff" })
	public void tc_09_testEditStaffDetails(String name, String branch, String updatedName, String updatedbranch,
			ITestContext context) {
		preSteps();
		int id = (Integer) context.getAttribute("id");
		staffPage.clickOnActionCorrespondingToId(ActionsEnum.Edit.name(), id);

		staffPage.assertDetailsOnEditForm(id, name, branch);
		staffPage.updateStaffDetails(ActionsEnum.Save.name(), updatedName, updatedbranch);

		staffPage.assertStaffRowBy(id, updatedName, updatedbranch);
	}

	@Test(dependsOnMethods = { "tc_03_testCreateNewStaff" })
	public void tc_10_testDeleteStaffAndCancel(ITestContext context) {
		preSteps();
		int id = (Integer) context.getAttribute("id");
		Map<String, String> staffRow = staffPage.getStaffRowById(id);
		staffPage.clickOnActionCorrespondingToId(ActionsEnum.Delete.name(), id);

		staffPage.assertDeleteConfirmationModalForStaff(id);
		staffPage.deleteStaff(ActionsEnum.Cancel.name());

		staffPage.assertStaffRowBy(id, staffRow.get("Name"), staffRow.get("Branch"));
	}

	@Test(dependsOnMethods = { "tc_03_testCreateNewStaff" })
	public void tc_11_testDeleteStaff(ITestContext context) {
		preSteps();
		int id = (Integer) context.getAttribute("id");
		staffPage.clickOnActionCorrespondingToId(ActionsEnum.Delete.name(), id);

		staffPage.assertDeleteConfirmationModalForStaff(id);
		staffPage.deleteStaff(ActionsEnum.Delete.name());
		int index = staffPage.getRowIndexById(id);

		assertEquals(index, -1, "Staff should get deleted.");
	}

	@Test(dataProvider = "validations")
	public void tc_12_testNewStaffFormValidations(String msg, String txt) {
		preSteps();

		staffPage.assertValidationMsg(txt, msg);
		staffPage.assertSaveBtnDisable();
	}

	private void preSteps() {
		welcomePage = new WelcomePage(driver);
		loginPage = new LoginPage(driver);
		branchPage = new BranchPage(driver);
		staffPage = new StaffPage(driver);
		staffDetailPage = new StaffDetailPage(driver);

		welcomePage.clickOnLink(WelcomeEnum.LOGIN_LINK.getVal());
		loginPage.loginAndAssertSuccessfulMessage(USERNAME, PASSWORD);
		welcomePage.clickOnOption(MenuEnum.Entities.name(), EntitiesEnum.Staff.name());
	}

	@DataProvider(name = "newBranchDetails")
	public Object[][] newBranchDetails() {
		return new Object[][] { { "Computer Science", "CS" } };
	}

	@DataProvider(name = "newStaffDetails")
	public Object[][] newStaffDetails() {
		return new Object[][] { { "Anuj Kumar", "Computer Science" } };
	}

	@DataProvider(name = "editStaffDetails")
	public Object[][] editBranchDetails() {
		return new Object[][] { { "Anuj Kumar", "Computer Science", "Robin", "Computer Science" } };
	}

	@DataProvider(name = "validations")
	public Object[][] validations() {
		return new Object[][] {
			// @formatter:off
			{ Constants.STAFF_NAME_REQUIRED, "" },
			{ Constants.STAFF_NAME_MINIMUM, "A" },
			{ Constants.STAFF_NAME_MAXIMUM, "test the maximum limit of text field on the staff edit form" },
			{ Constants.STAFF_NAME_PATTERN, "test1" },
			{ Constants.STAFF_NAME_PATTERN, "test@" }
			
			// @formatter:on
		};
	}

}
