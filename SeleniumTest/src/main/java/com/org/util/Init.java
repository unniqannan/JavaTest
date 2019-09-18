package com.org.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Init {
	  
	   // static Logger logger = Logger.getLogger(Init.class.getName());

	    public WebDriver driver;
	    //private static Properties prop = ReadPropertiesFile.getProperties();
	    //public final static String URL = prop.getProperty("url");
	    //public final static String USERNAME = prop.getProperty("username");
	    //public final static String PASSWORD = prop.getProperty("password");

	    /**
	     * This function is to perform pre setup for every test case, like initializing the WebDriver,
	     * launching the browser, etc.
	     */
	    @BeforeMethod(alwaysRun = true)
	    public void setUp() {
	        driver = getDriver();
	        //driver.manage().window().maximize();
	        //driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
	        driver.get("http://google.com");

	    }

	   

	    private WebDriver getDriver() {
	        String browser = System.getProperty("browser");
	        if (null == browser) {
	            browser = "firefox";
	        }
	        if (browser.equalsIgnoreCase("chrome")) {
	            return new ChromeDriver();
	        }
	        return new FirefoxDriver();
	    }

	}

	 