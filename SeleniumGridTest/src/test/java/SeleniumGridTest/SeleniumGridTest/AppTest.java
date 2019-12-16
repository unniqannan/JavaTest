package SeleniumGridTest.SeleniumGridTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.AssertJUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
    }

    /**
     * Rigourous Test :-)
     */
    String nodeURL;
    WebDriver driver;
   // @Parameters({})
    @BeforeTest()
    public void setUp() throws MalformedURLException {
    	System.out.println("selenium grid tests");
    	DesiredCapabilities cap = DesiredCapabilities.firefox();
    	cap.setBrowserName("firefox");
    	cap.setPlatform(Platform.WINDOWS);
		nodeURL="http://localhost:4547/wd/hub";
		driver=new RemoteWebDriver(new URL(nodeURL), cap);
    }
    @Test
	public void testApp() throws MalformedURLException
    {
    	
		 
		   driver.get("http://demo.guru99.com/V4/");
		   driver.findElement(By.name("uid")).sendKeys("Driver 1");
        AssertJUnit.assertTrue( true );
    }
}
