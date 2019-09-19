package suite1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 
public class Flipkart {
	WebDriver driver; 
	String username = ""; // Change to your username and passwrod
	String password = "";
	
	@BeforeClass
	public void init() {
		
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com");
	}
	
	// Search For product
		@Test
		public void searchAndSelectProduct() {
			System.out.println("flipkart");
		}
		
		@Test
		public void searchAndSelectProduct1() {
			Assert.assertTrue(true);
		}
		
		@Test
		public void searchAndSelectProduct2() {
			Assert.assertTrue(false);
		}
		@AfterClass
		public void quit() {
			driver.close();
		}
}
