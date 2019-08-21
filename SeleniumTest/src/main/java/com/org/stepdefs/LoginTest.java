package com.org.stepdefs;

import org.openqa.selenium.WebDriver;

import com.org.managers.WebDriverManager;

import cucumber.api.java.en.Given;


public class LoginTest {
	public static WebDriver driver;
	WebDriverManager webdriverManager=new WebDriverManager();
	
	@Given("^I launch Chrome browser$")
	public void LaunchChrome() throws Throwable {
		
		driver=webdriverManager.getDriver();	
		 System.out.println("driver is initialized");	 
	}
	
	@Given("^I open Google Homepage$")
	public void i_open_Google_Homepage() throws Throwable {
	    driver.get("http://www.google.com");
	    
	}

	@Given("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() throws Throwable {
	    
	    
	}

	@Given("^the page displays Google Search button$")
	public void the_page_displays_Google_Search_button() throws Throwable {
	    
	    
	}

	@Given("^the page displays Im Feeling Lucky button$")
	public void the_page_displays_Im_Feeling_Lucky_button() throws Throwable {
	    
	    
	}
}
