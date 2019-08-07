package cucumber.stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.org.managers.WebDriverManager;
import com.org.pages.LoginPage;
import com.org.util.FunctionLibrary;
import com.org.util.LoggerHelper;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonPageStepDefinition extends AbstractPageStepDefinition {

	static Logger logger=LoggerHelper.getLogger(CommonPageStepDefinition.class);
	 
	public static WebDriver driver;
	 
	public static WebDriver lanuchApplication() {
		webdrivermanager=new WebDriverManager();
		 driver=webdrivermanager.getDriver();	
		 logger.info("driver is initialized");
	 
		 return driver;
	}	
	
	 
	public static void Close_session() {
			 webdrivermanager.closeDriver();
	}
	
	@After
	public void endTest(Scenario scenario) {
		//String kk;
		//if(scenario.isFailed()) {
			//kk=FunctionLibrary.fn_TakeSnapshot(driver, "target/Screenshots/Fail/ScreeshotFail");
		logger.info(scenario.getName() + "  execution is completed");
			final byte[] screenshot=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
			//}
		//else
			//kk=FunctionLibrary.fn_TakeSnapshot(driver, "target/Screenshots/Pass/ScreenshotPass");
		 
		driver.close();
		driver.quit();
	}
	
}
