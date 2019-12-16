package suite1;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

 
public class Flipkart {
	WebDriver driver; 
	String username = ""; // Change to your username and passwrod
	String password = "";
	
	 String nodeURL;
	 
	    @Parameters({"portNO"})
	   @BeforeTest()
	    public void setUp(String portNO) throws MalformedURLException {
	    	System.out.println("selenium grid tests");
	    	DesiredCapabilities cap = new DesiredCapabilities();
			if(portNO.equals("4547")) {
				System.out.println("firefox browser kicking off");
	    		cap.setBrowserName("firefox");
		    	cap.setPlatform(Platform.WINDOWS);
				nodeURL="http://localhost:4547/wd/hub";	
	    	}
			else if(portNO.equals("4548")) {
				cap.setBrowserName("chrome");
		    	cap.setPlatform(Platform.WINDOWS);
				nodeURL="http://localhost:4548/wd/hub";	
			}
			else if(portNO.equals("4549")) {
				//DesiredCapabilities cap1 = DesiredCapabilities.internetExplorer();
				//DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				cap.setBrowserName("internet explorer");
		    	cap.setPlatform(Platform.WINDOWS);
		    //	cap.setCapability(InternetExplorerDriver.
		    	//		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		    	cap.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);
				nodeURL="http://localhost:4549/wd/hub";	
			}
	    	
			driver=new RemoteWebDriver(new URL(nodeURL), cap);
			driver.navigate().to("https://www.amazon.de/");
	    }
	    
	//@BeforeClass
	public void init() throws InterruptedException {
		
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	
		
	}
	
	// Search For product
		//@Test
		public void searchAndSelectProduct() {
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tablet");
			//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9949606089_a");
			//driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
			System.out.println("Tablet entered in text box");
		}
		
		@Test
		public void searchAndSelectProduct1() {
			System.out.println("Flipkart test");
		}
		
	//	@Test
		public void searchAndSelectProduct2() {
			Assert.assertTrue(true);
		}
	//	@AfterClass
		public void quit() throws InterruptedException {
			 
			//driver.close();
		}
}
