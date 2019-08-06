package cucumber.stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import com.org.managers.WebDriverManager;
import com.org.pages.LoginPage;
import com.org.util.LoggerHelper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonPageStepDefinition extends AbstractPageStepDefinition {

	static Logger logger=LoggerHelper.getLogger(CommonPageStepDefinition.class);
	 
	public static WebDriver driver;
	 
	public static WebDriver lanuchApplication() {
		webdrivermanager=new WebDriverManager();
		 driver=webdrivermanager.getDriver();	
		 logger.info("driver is initialized");
		 driver.manage().window().setPosition(new Point(0, -500));
		 return driver;
	}	
	
	 
	public static void Close_session() {
			 webdrivermanager.closeDriver();
	}
}
