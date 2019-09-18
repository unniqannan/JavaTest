package GurukulaProject.GurukulaProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.org.pages.LoginPage;

import cucumber.stepdefinitions.CommonPageStepDefinition;

public class TestNG_Demo {
	public static WebDriver driver;
	@Test
	public void googleSearch() {
		driver=CommonPageStepDefinition.lanuchApplication();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.ApplicationLaunchLoginButtonClick();
		loginpage.LoginIntoGuruKulPage("admin","admin");
	}
	
}
