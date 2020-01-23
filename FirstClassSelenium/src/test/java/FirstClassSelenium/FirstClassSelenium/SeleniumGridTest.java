package FirstClassSelenium.FirstClassSelenium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	 String nodeURL;
	    WebDriver driver;
	    	DesiredCapabilities cap;
	    @Parameters({"Port"})
	    @BeforeMethod()
	    public void setUp(String Port) throws MalformedURLException {
	    	System.out.println("selenium grid tests");
	    		
	    	 if(Port.equals("5555")) {
	    			System.out.println("5555");
	    				cap=DesiredCapabilities.chrome();
	    				cap.setBrowserName("chrome");
	    				cap.setVersion("random");
	    				cap.setPlatform(Platform.WINDOWS);
	    				File file = new File("drivers/chromedriver.exe");
	    				System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, file.getAbsolutePath());
	    			//	System.setProperty("ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY", "C:\\Users\\unkan\\Downloads\\chromedriver75\\chromedriver.exe");
	    					nodeURL="http://192.168.2.5:5555/wd/hub";
	    					try {
	    						
	    					driver=new RemoteWebDriver(new URL(nodeURL),cap);
	    					}
	    					catch(Exception e) {e.printStackTrace();}
	    		}
	    	 else if(Port.equals("5556")){
	    			System.out.println("5556");
	    				cap = DesiredCapabilities.firefox();
	    				cap.setBrowserName("firefox");
	    				cap.setPlatform(Platform.WINDOWS);
	    					nodeURL="http://192.168.2.5:5556/wd/hub";
	    			}
	    		else if(Port.equals("5557")) {
	    			System.out.println("5557");
	    				cap=DesiredCapabilities.internetExplorer();
	    				cap.setBrowserName("iexplore");
	    				cap.setPlatform(Platform.WINDOWS);
	    					nodeURL="http://192.168.2.5:5557/wd/hub";
	    		}
	    	 driver=new RemoteWebDriver(new URL(nodeURL),cap);
				System.out.println("Remote driver setup done");
	    }
	    
	    @Test
		public void testApp() throws MalformedURLException, InterruptedException
	    {
	    	System.out.println("test created");
			   driver.get("http://demo.guru99.com/V4/");
			   driver.findElement(By.name("uid")).sendKeys("Driver 1");
			   Thread.sleep(5000);
	        AssertJUnit.assertTrue( true );
	        driver.quit();
	    }
}
