package com.org.pages;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.org.enums.AppValidationMessages;
import com.org.util.FunctionLibrary;
import com.org.util.Log;
import com.org.util.LoggerHelper;

import cucumber.api.java.Before;

public class BranchesPage extends FunctionLibrary {
	
	private WebDriver driver;
	Logger logger=LoggerHelper.getLogger(BranchesPage.class);
	

	//@FindBy(xpath="//*[text()='Create a new Branch']']")
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div[1]/div/div[1]/button/span[2]")
	WebElement NewBranch;
	@FindBy(xpath="//*[text()='Entities']")
	WebElement Entities;
	@FindBy(xpath="//*[text()='Branch']")
	WebElement Branch;
	@FindBy(xpath="//h2[@translate='gurukulaApp.branch.home.title']")
	WebElement BranchesPageTitle;
	
	@FindBy(xpath="//h4[text()='Create or edit a Branch']")
	WebElement CreateorEditBranchpopup;
	
	//Edit Elements
	@FindBy(xpath="//button[@class='btn btn-primary btn-sm']")
	WebElement BranchListEdit;
	
	
	 //BranchPopup
	@FindBy(xpath="//input[@name='name']")
	WebElement NewBranchNametextfield;
	@FindBy(xpath="//input[@name='code']")
	WebElement NewBranchcodetextfield;
	@FindBy(xpath="//span[contains(text(),'Save')]")
	WebElement NewBranchSaveButton;
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]/span[2]")
	WebElement NewBranchCancelButton;
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/p[1]")
	WebElement NewBranchNameTextfieldValidationMsgTextdRequired;
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/p[1]")
	WebElement NewBranchNameCodeTextfieldValidationMsgfieldRequired;
			
	@FindBy(xpath="//p[contains(text(),'This field is required to be at least 5 characters')]")
	WebElement NewBranchNameTextfieldminCharlengthValidationMsgEle;
	@FindBy(xpath="//p[contains(text(),'This field is required to be at least 2 characters')]")
	WebElement NewBranchCodeTextfieldminCharlengthValidationMsgEle; 
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[1]/p[1]")
	WebElement NewBranchCodeTextfieldValidationMsgTextfieldRequired;
	@FindBy(xpath="//p[contains(text(),'This field should follow pattern ^[A-Z0-9]*$.')]")
	WebElement NewBranchCodeTextfieldValidationMsgOnlyDigits;
	
	@FindBy(xpath="//table[@class='table table-striped']//tbody")
	WebElement BranchListWebTable;
	@FindBy(xpath="//span[contains(text(),'View')]")
	WebElement BranchListView;
	@FindBy(xpath="//a[text()='1']")
	WebElement BranchListIDlink;
	
	@FindBy(xpath="//h2/span[@translate='gurukulaApp.branch.detail.title']")
	WebElement BranchDetailTitle;
	@FindBy(xpath="//tr[1]//td[2]//input[1]")
	WebElement BranchDetailNameTextField;
	@FindBy(xpath="//tr[2]//td[2]//input[1]")
	WebElement BranchDetailCodeTextField;
	@FindBy(xpath="//span[contains(text(),'Back')]")
	WebElement BranchDetailBackButton;
	
	//Delete
	@FindBy(xpath="//button[@class='btn btn-danger btn-sm']//span[@class='ng-scope'][contains(text(),'Delete')]")
	WebElement BranchListDelete;
	 
	@FindBy(xpath="//form[@name='deleteForm']//span[@class='ng-scope'][contains(text(),'Cancel')]")
	WebElement BranchDeletepopupCancelButton;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	WebElement BranchDeletepopupDeleteButton;
	
	
	public BranchesPage(WebDriver driver) {
		this.driver=driver;
		Log.info("BranchesPage elements are initialized");
		PageFactory.initElements(driver, this);
	}
	
	public void NewBranchButtonClick() {
		commonClick(NewBranch);
		Log.info("NewBranch link is clicked in Branches page");
		}
	
	 
	public void EnterNewBranchNametextfield(String BranchName) {
		commonSetTextTextBox(NewBranchNametextfield, BranchName);
	}
	public void EnterNewBranchCodetextfield(String Code) {
		commonSetTextTextBox(NewBranchcodetextfield, Code);
	}
	public void BranchesPageNavigate() {
		commonClick_MenuItem(driver, Entities, Branch);
	}
	public void BranchesPageTitleValidation() {
		assertTrue(commonVerifyLabelText(BranchesPageTitle,AppValidationMessages.BranchesPagetitle));
		}
	public void NewBranchCancelButton() {
		commonClick(NewBranchCancelButton);
	}

	public void BranchDetailsPopupCheck() {
		commonVerifyLabelText(CreateorEditBranchpopup, AppValidationMessages.CreateorEditBranchpopupStr);
	}

	public void CreateBranch(String NewBranchname,String NewBranchcode) {
		commonSetTextTextBox(NewBranchNametextfield, NewBranchname);		
		commonSetTextTextBox(NewBranchcodetextfield, NewBranchcode);
		commonClick(NewBranchSaveButton);
	}

	public void BranchCheck(String name, String code) {
		assertTrue(commonWebTableVerifyText(BranchListWebTable,name,code));
		
	}
	public void BranchNotAvailable(String name, String code) {
		logger.info("Branch details verification for Branch Name " +name+" having code " +code);
		assertTrue(!commonWebTableVerifyText(BranchListWebTable,name,code));
		
	}

	public void ClickViewButton() {
		commonClick(BranchListView);
	}
	public void clickBackButtonBranchDetailsPage() {
			commonClick(BranchDetailBackButton);
	}
	

	public void ViewBranchDetailsScreen() {
		commonVerifyLabelText(BranchDetailTitle,AppValidationMessages.BranchDetailTitleStr);
	}
	
	public void ClickingBranchID() {
		commonClick(BranchListIDlink);
	}

	public void ViewBranchDetailsNameCode(String Name,String Code) {
		assertTrue(commonVerifyValueTextBox(BranchDetailNameTextField, Name));
		assertTrue(commonVerifyValueTextBox(BranchDetailCodeTextField, Code));
	}

	public void NameTextFieldNewBranchmandatoryfieldCheck() {
		commonSetTextTextBox(NewBranchNametextfield, AppValidationMessages.NoCharStr);
		assertTrue(commonVerifyLabelText(NewBranchNameTextfieldValidationMsgTextdRequired,AppValidationMessages.NewBranchNameTextfieldValidationMsgfieldRequiredstr));
		
	}
	  
	public void MiniumCharLengthValidationNameTextField() {
		commonSetTextTextBox(NewBranchNametextfield,  AppValidationMessages.MinCharStr);
		assertTrue(commonVerifyLabelText(NewBranchNameTextfieldminCharlengthValidationMsgEle,AppValidationMessages.minimumcharlengthvalidationstr));
	}

	
	
	public void CodeTextFieldNewBranchmandatoryfieldCheck() {
		commonSetTextTextBox(NewBranchcodetextfield, AppValidationMessages.NoCharStr);
		assertTrue(commonVerifyLabelText(NewBranchNameCodeTextfieldValidationMsgfieldRequired,AppValidationMessages.NewBranchNameTextfieldValidationMsgfieldRequiredstr));
	}
	public void OnlyDigitsInputValidationNameTextField() {
		commonSetTextTextBox(NewBranchcodetextfield, AppValidationMessages.MinCharStr);
		assertTrue(commonVerifyLabelText(NewBranchCodeTextfieldValidationMsgOnlyDigits,AppValidationMessages.PatternfollowedTextFieldvalidationstr));
	}

	public void MiniumCharLengthValidationCodeTextField() { 
		commonSetTextTextBox(NewBranchcodetextfield, AppValidationMessages.MintwoCharStr);
		assertTrue(commonVerifyLabelText(NewBranchCodeTextfieldminCharlengthValidationMsgEle,AppValidationMessages.minimumtwocharlengthvalidationstr));
	}

	public void ClickEditButtonBranchList() {
		commonClick(BranchListEdit);	
		//driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
	}

	public void EditScreenValidation(String Name,String Code) {
		assertTrue(commonVerifyValueTextBox(NewBranchNametextfield,Name));
		assertTrue(commonVerifyValueTextBox(NewBranchcodetextfield,Code));
	}
public void BranchIDDelete() {
	commonClick(BranchListDelete);
}

public void BranchListDeletebuttonInPopup() {
	commonClick(BranchDeletepopupDeleteButton);
}
public void BranchDeletepopupCancelButton() {
	commonClick(BranchDeletepopupCancelButton);
}

public void BranchCheckNotAvailable(String name, String code) {
	assertTrue(!commonWebTableVerifyText(BranchListWebTable,name,code));
	
}

public void CloseSession() {
	logger.info("user closes the session");
	driver.close();
	driver.quit();
	
}
  
}
