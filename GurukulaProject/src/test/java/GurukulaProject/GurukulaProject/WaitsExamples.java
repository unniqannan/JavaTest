package GurukulaProject.GurukulaProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.org.pages.LoginPage;

import cucumber.stepdefinitions.CommonPageStepDefinition;

public class WaitsExamples {
	public static WebDriver driver;
	//@Test
	public void ImplicitWait() {
		
		driver=CommonPageStepDefinition.lanuchApplication();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.ApplicationLaunchLoginButtonClick();
		loginpage.LoginIntoGuruKulPage("admin","admin");
	}
	
	//@Test
	public void ExplicitWait() {
		
		driver=CommonPageStepDefinition.lanuchApplication();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.ApplicationLaunchLoginButtonClick();
		 
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("username")).sendKeys("admin");
		 
		WebElement dynamicElement = (new WebDriverWait(driver, 10))
				  .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit1' and text()='Authenticate1']")));
		
		
		dynamicElement.click();
		System.out.println("fter exception");
	}
	
	//@Test
	public void FluentWait() {
		
		driver=CommonPageStepDefinition.lanuchApplication();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.ApplicationLaunchLoginButtonClick();
		 
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("username")).sendKeys("admin");
		Duration interval=null;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(interval.ofSeconds(7))
				.pollingEvery(interval.ofSeconds(1))
				.ignoring(TimeoutException.class)
				.ignoring(NoSuchElementException.class);
				
		WebElement dynamicElement =wait.until(new Function<WebDriver,WebElement>(){

			public WebElement apply(WebDriver localDriver) {
				if(driver.findElement(By.id("password")).isDisplayed())
				{ System.out.println("verifying");
				  
				}
				else
					{					
				return localDriver.findElement(By.xpath("//button[@type='submit' and text()='Authenticate']"));
					}
				//return localDriver.findElement(By.xpath("//button[@type='submit' and text()='Authenticate']"));
				return null;
			}
	});
		System.out.println("element is displayed"+dynamicElement.isDisplayed());
		dynamicElement.click();
		System.out.println("fter FluentWait exception");
	}

	//@Test
	public void HandleDropDown() throws InterruptedException {
		driver=CommonPageStepDefinition.lanuchApplication();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		WebElement element=driver.findElement(By.id("testingDropdown"));
		Select selElement=new Select(element);
		selElement.selectByValue("Database");
		Thread.sleep(5000);
		selElement.selectByVisibleText("Performance Testing");		 
	}
	
	//@Test
	public void HandleRadioButton() throws InterruptedException {
		driver=CommonPageStepDefinition.lanuchApplication();
		driver.get("https://www.testandquiz.com/selenium/testing.html");
		//Selecting radio butotn male
		Thread.sleep(5000);
		WebElement MaleRadio=driver.findElement(By.id("Male"));
		MaleRadio.click();
		
		Thread.sleep(5000);
		int RadioButtonsCount=driver.findElements(By.xpath("//div[7]//div[1]//form[1]")).size();
		System.out.println(RadioButtonsCount);
		
		for(int i=0;i<RadioButtonsCount;i++) {
			System.out.println(driver.findElements(By.xpath("//div[7]//div[1]//form[1]")).get(i).getTagName());
		}
	}
	
	/*Invoke a Google chrome browser.
Navigate to the website in which you handle the checkbox.
Select the 'Senior Citizen' checkbox from the spicejet website.
Close the driver.
*/
	@Test
	public void HandlingCheckbox() throws InterruptedException {
		driver=CommonPageStepDefinition.lanuchApplication();
		driver.get("https://www.spicejet.com");
		//Selecting radio butotn male
		Thread.sleep(5000);
		
		//WebElement Checkbox=driver.findElement(By.xpath("//label[contains(text(),'Senior Citizen')]"));
		//Checkbox.click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();
				 
		 
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		 
	}
}
