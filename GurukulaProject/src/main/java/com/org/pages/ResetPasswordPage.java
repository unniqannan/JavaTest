package com.org.pages;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.org.util.LoggerHelper;

public class ResetPasswordPage {
	
	private WebDriver driver;
	Logger logger=LoggerHelper.getLogger(ResetPasswordPage.class);
	
	@FindBy(xpath="//h1[@translate='reset.request.title']")
	WebElement ResetPasswordPageTitle; 
	
	@FindBy(xpath="//a[text()='Did you forget your password?']")
	WebElement ForgotPasswordLink;
	
	@FindBy(xpath="//input[@name='email']")
	WebElement EmailTextField;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[1]")
	WebElement ErrorMessage;
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/form/div/div/p[2]")
	WebElement InvalidEmailidErrorMessage;
	 
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/form/div/div/p[3]")
	WebElement InvalidEmailid5charsErrorMessage;
	 
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/form/div/div/p[4]")
	WebElement InvalidEmailidErrorMsgwith50Chars;
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/form/div/div/p[1]")
	WebElement EmailidRequireErrorMessageExpectedElement;
	
	private static final String ERROR="E-Mail address isn't registered! Please check and try again";
	private static final String ResetPasswordTitle="Reset your password";
	private static final String InvalidEmailidErrorMessageExpected="Your e-mail is invalid.";
	private static final String InvalidEmailid5charsErrorMessageExpected="Your e-mail is required to be at least 5 characters.";
	private static final String InvalidEmailid50charsErrorMessageExpected="Your e-mail cannot be longer than 50 characters.";
	private static final String EmailidRequireErrorMessageExpected="Your e-mail is required.";
	public ResetPasswordPage(WebDriver driver) {
		this.driver=driver;
		logger.info("ResetPasswordPage elements are initialized");
		PageFactory.initElements(driver, this);
	}
	
	public void ResetPasswordPageVerification() {
			logger.info("ResetPasswordPageVerification is in progress");
		ResetPasswordPageTitle.getText();
			logger.info("ExpectedResult is "+ResetPasswordTitle);
			logger.info("ActualResult is "+ResetPasswordPageTitle.getText());
		assertEquals(ResetPasswordPageTitle.getText(),ResetPasswordTitle);
	}
	
	public void ForgotPasswordlinkClick() {
		ForgotPasswordLink.click();		
		logger.info("Forgot Password link is clicked");
		}
	
	public void validEmailIdverification(String emailid ) {
		EmailTextField.sendKeys(emailid);		
		logger.info("Emailid is entered as "+emailid);
		submit.click();
		logger.info("Submit button is clicked");
		logger.info("Verifying the emailid and submit button is displayed still or not ");
		assertFalse(EmailTextField.isDisplayed());		
		}
	
	public void InvalidEmailIdverification(String emailid) {
		EmailTextField.sendKeys(emailid);		
		logger.info("Invalid and unregistered Emailid is entered as "+emailid);
		submit.click();
		logger.info("Submit button is clicked");
		logger.info("ExpectedResult is "+ERROR);
		logger.info("ActualResult is "+ErrorMessage.getText());
		assertEquals(ERROR,ErrorMessage.getText());
		EmailTextField.clear();
		}

	public void InvalidEmailidWithoutSymbol(String emailid) {
		EmailTextField.sendKeys(emailid);		
		logger.info("Invalid and unregistered Emailid is entered as "+emailid);
		logger.info("ExpectedResult is "+InvalidEmailidErrorMessageExpected);
		logger.info("ActualResult is "+InvalidEmailidErrorMessage.getText());
		assertEquals(InvalidEmailidErrorMessageExpected,InvalidEmailidErrorMessage.getText());
		EmailTextField.clear();
		
	}
	public void InvalidEmailid5CharsCheck(String emailid) {
		EmailTextField.sendKeys(emailid);		
		logger.info("Invalid and unregistered Emailid is entered as "+emailid);
		logger.info("ExpectedResult is "+InvalidEmailid5charsErrorMessageExpected);
		logger.info("ActualResult is "+InvalidEmailid5charsErrorMessage.getText());
		assertEquals(InvalidEmailid5charsErrorMessageExpected,InvalidEmailid5charsErrorMessage.getText());
		EmailTextField.clear();
	}
	
	public void InvalidEmailidwith50CharsValidation(String emailid) {
		EmailTextField.sendKeys(emailid);		
		logger.info("Invalid and unregistered Emailid is entered as "+emailid);
		logger.info("ExpectedResult is "+InvalidEmailid50charsErrorMessageExpected);
		logger.info("ActualResult is "+InvalidEmailidErrorMsgwith50Chars.getText());
		assertEquals(InvalidEmailid50charsErrorMessageExpected,InvalidEmailidErrorMsgwith50Chars.getText());
		EmailTextField.clear();
	}

	public void NoEmailidVerificationWarningMessage() {
		EmailTextField.sendKeys("remove");
		EmailTextField.clear();
		logger.info("Emailid text field is made empty");
		logger.info("Invalid and unregistered Emailid is entered as blank ");
		logger.info("ExpectedResult is "+EmailidRequireErrorMessageExpected);
		logger.info("ActualResult is "+EmailidRequireErrorMessageExpectedElement.getText());
		assertEquals(EmailidRequireErrorMessageExpected,EmailidRequireErrorMessageExpectedElement.getText());
	}
	 
	
	
	

}
