package FirstClassSelenium.FirstClassSelenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.org.UIElementLibrary.IdentifyElement;

public class SeleniumExcercises extends IdentifyElement {
	
	WebDriver driver;
	//@Test
	public void ChromeTest() {
		
		//We create one variable for the interface
		//bind the interface to the chrome driver class 
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumGrid\\chromedriver.exe");//
		driver=new ChromeDriver();
		
		// navigate to the web appln - flipkart.com
			driver.get("http://www.google.com");
				//driver.findElement(By.name("q")).sendKeys("selenium");        //enteremail text - please enter as gauri@gmail.com
				  driver.findElement(By.id("gb_70")).click(); 
				  //driver.findElement(By.name("identifier")).sendKeys("selenium@gmail.com"); //text box enter
				  //absolute xpath
				  //driver.findElement((By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]"))).sendKeys("kannan@gmail.com");
				  //what is relative xpath
				  		driver.findElement(By.xpath("//div/input[@name='identifier']")).sendKeys("kk@gmail.com");
				  			driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();  //Next button click
	}

	
	//@Test
	public void FirefoxTest() throws InterruptedException {
		
		//We create one variable for the interface
		//bind the interface to the chrome driver class 
		System.setProperty("webdriver.gecko.driver","C:\\SeleniumGrid\\geckodriver.exe");//
		driver=new FirefoxDriver();//opens the firefox
		driver.get("http://http://demo.guru99.com/test/newtours/");//navigate
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		
		//clicking linktext
		driver.findElement(By.linkText("SIGN-ON")).click();
		  // i need to read the text from the link then verify whether it is registration form then only click
		    
			String registrationLinkText=driver.findElement(By.linkText("registration form")).getText();
		  
			System.out.println(registrationLinkText);
		   
		      if(registrationLinkText.equals("registration form"))
		    	  driver.findElement(By.linkText("registration form")).click();
		//  driver.findElement(By.linkText("registration form")).click();
		//  System.out.println(driver.getTitle());
		//  Thread.sleep(5000);
		//  driver.navigate().back();
		//     driver.findElement(By.partialLinkText("registration")).click();
		 //    		System.out.println(driver.getTitle());
		 //Ready the page whether the registration form link is available.  if available then click
	}
	
//	@Test()
    public void ChromeTest1() throws InterruptedException {
		
		//We create one variable for the interface
		//bind the interface to the chrome driver class 
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumGrid\\chromedriver.exe");//
		driver=new ChromeDriver();
		
		// navigate to the web appln - flipkart.com
		//	driver.get("http://demo.guru99.com/test/ajax.html");
			//where there is lot of elements in the option button .  now you need to check whether the required is there then only selection the option 
			 // List<WebElement> elements=  driver.findElements(By.xpath("//body//p[1]"));
			  //iterating with element in elements and priting the text
			      //loop that elements to read each and every element       // webtable trd td
			    //    for(WebElement OptionButtons : elements) {
			    //    		System.out.println(OptionButtons.getText());
			   //     }
			     //   driver.quit();
			        driver.get("https://www.phptravels.net/blog/Fiercely-Independent-Cultures");
			        Thread.sleep(5000);
			           //driver.close();
			           driver.quit();
			            
			
	}
	
	//@Test()
    public void Selectdropdown() throws InterruptedException {
		
		//We create one variable for the interface
		//bind the interface to the chrome driver class 
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumGrid\\chromedriver.exe");//
		driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		   //select is class
		   //create a object of select class
		    //assign the drop down list to the selct class object then read the elements
		  WebElement dropdownName=driver.findElement(By.name("country"));
		       
		      Select sel= new Select(dropdownName);
		        
		           sel.selectByVisibleText("INDIA");
		           Thread.sleep(5000);
		        sel.selectByIndex(6);
		        Thread.sleep(5000);
		        sel.selectByValue("6");
		           
		        //read all elements
		        
		        List<WebElement> CountryNames = sel.getOptions();
		        
		        for(WebElement ele : CountryNames) {
		        	System.out.println(ele.getText());
		        }
			            
			
	}
	
	//@Test
	public void IETest() throws InterruptedException {
		 
		//We create one variable for the interface
		//bind the interface to the chrome driver class 
		System.setProperty("webdriver.ie.driver","C:\\SeleniumGrid\\IEDriverServer.exe");//
		driver=new InternetExplorerDriver();
		
	//	System.setProperty("webdriver.gecko.driver","C:\\SeleniumGrid\\geckodriver.exe");//
		//driver=new FirefoxDriver();
		
	driver.get("http://www.flipkart.com");
		Thread.sleep(5000);
	//	WebElement ele=driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		
		String parentWinHandle = driver.getWindowHandle();
		
		Set<String> winHandles = driver.getWindowHandles();
		
		 for(String handle: winHandles){
	            if(!handle.equals(parentWinHandle)){
	            driver.switchTo().window(handle);
	            Thread.sleep(1000);
	            System.out.println("Title of the new window: " +
	driver.getTitle());
	           // System.out.println("Closing the new window...");
	          //  driver.close();
	            }
	        }
         
	}

	//@Test
		public void CurrencyConverter() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				driver=new ChromeDriver();	

//System.setProperty("webdriver.gecko.driver","C:\\SeleniumGrid\\geckodriver.exe");//
//driver=new FirefoxDriver();


   //Select object declaration for the webelement
	// sel.selectbyValue();

			driver.get("https://transferwise.com/ie/currency-converter/");
			driver.findElement(By.id("cc-amount")).clear();
			driver.findElement(By.id("cc-amount")).sendKeys("1");
Thread.sleep(5000);			
			//Read the select and select one country

WebElement dropdownele= driver.findElement(By.id("sourceCurrency"));
	//	Select sel=new Select(dropdownele);
		//	sel.selectByValue("EUR");

Actions action = new Actions(driver);  
action.moveToElement(dropdownele);
action.click();
action.build().perform();
driver.findElement(By.xpath("/html/body/main/div[1]/div/div/div/div[2]/div/div/form/div/div[2]/div/div/div[1]/div/div/div/input")).sendKeys("EUR");
Thread.sleep(2000);
action.sendKeys(Keys.ENTER).build().perform();
}


 // @Test
public void ActionClasses() {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
driver=new ChromeDriver();	

//System.setProperty("webdriver.gecko.driver","C:\\SeleniumGrid\\geckodriver.exe");//
//driver=new FirefoxDriver();

	driver.get("https://www.testandquiz.com/selenium/testing.html");

WebElement LocatorElement = driver.findElement(By.id("dblClkBtn"));
//WebElement to = driver.findElement(By.id("targetDiv"));

Actions action = new Actions(driver);
action.doubleClick(LocatorElement).build().perform();



//action.click(from).build().perform();
//action.dragAndDrop(from, to).build().perform();

 
}
 //checkboxes and radiobutton

//@Test
public void Checkbox_radiobutton() throws InterruptedException {
	
	//Browser declaration
	//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver(); 

	System.setProperty("webdriver.gecko.driver","C:\\SeleniumGrid\\geckodriver.exe");//
	driver=new FirefoxDriver();

	driver.manage().window().maximize();

	
	
	//Navigate to url
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		Thread.sleep(5000);
		driver.findElement(By.id("buttonwithclass")).click();
	//identify the locators for the radio button
	   WebElement ele=driver.findElement(By.id("sex-0"));
	   
		//Then do Action on the webelement
		ele.click();  
}


//@Test
public void Checkbox_radiobutton1() throws InterruptedException {
	
	//Browser declaration
	//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver(); 

	System.setProperty("webdriver.gecko.driver","C:\\SeleniumGrid\\geckodriver.exe");//
	driver=new FirefoxDriver();

	driver.manage().window().maximize();

	
	
	//Navigate to url
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		Thread.sleep(5000);
		WebElement ele=driver.findElement(By.id("doubleClickBtn"));
	 
		 
		Actions action = new Actions(driver);  //declaraing an object of action        
		//action.moveToElement(ele);				//assigned the driver
		action.doubleClick(ele).build().perform();							//Make use of action methods for navigating to the weblement
												//doing action on the element

}

 

//@Test
public void AlertsExamples() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	
	driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver");
	   driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
	   Thread.sleep(5000);
	   	Alert alert1=driver.switchTo().alert();    
	   	   		 System.out.println(alert1.getText());
	   	   		 alert1.accept(); 
	   
}

//@Test
public void AlertsExamples2() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	   driver.findElement(By.name("cusid")).sendKeys("77777");
	   Thread.sleep(2000);
	   
	   driver.findElement(By.name("submit")).click();
	   
	   	Alert alert1=driver.switchTo().alert();					
	   	   		 System.out.println(alert1.getText());
	   	   	 Thread.sleep(2000);
	   	   		 alert1.dismiss();
	   	   		 
	   	      Thread.sleep(2000);
	   	   driver.findElement(By.name("submit")).click();
	   	Thread.sleep(2000);
	   	      	alert1.accept();
	   	     Thread.sleep(2000);
	   	     alert1.accept();
	   	     
}
//@Test
public void Checkbox_radiobuttonExcercise() throws InterruptedException {
	//1. Open URL
	//2. Read the locator of the webelement id=sex-1  (read 3 locators
	//click
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	   																		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	   driver.get("https://www.toolsqa.com/automation-practice-form/");
	   
	//   if(driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).isDisplayed())
	 //  	driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
	   
		try{
			driver.findElement(By.xpath("//*[@id=\"cookie_action_close_header\"]")).click();
		}
		catch(Exception e) {e.printStackTrace();}
	        
		WebElement ManualTester=driver.findElement(By.id("profession-0"));
		WebElement AutomationTester=driver.findElement(By.id("profession-1"));
	    
		WebElement SeleniumWebDriver=driver.findElement(By.xpath("//input[@name='tool' and @value='Selenium Webdriver']"));
	         		
	         	
		ManualTester.click();
	         		
	         		  Thread.sleep(5000);
	         		   		if(AutomationTester.isSelected())
	         		   		{
	         		   			System.out.println("Automation Teseter is selected");
	         		   				Thread.sleep(5000);
	         		   				//AutomationTool.click();
	         		   		}
	         		   		else
	         		   			System.out.println("Automation Teseter is NOT selected");
	         		   			
			 if(AutomationTester.isDisplayed()) {
				 Thread.sleep(10000);
				 System.out.println("automation tester is displayed");     
				 if(AutomationTester.isEnabled())
				 {Thread.sleep(10000);
					 System.out.println("automation tester is enabled");  
					 if(!AutomationTester.isSelected())
						 AutomationTester.click();   
					 
				 }
			 }
}

//@Test 
public void FindElementsExcercise() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); // Driver creation
	   
	   
	driver.get("https://www.techbeamers.com/");
	
		 List<WebElement> PythonElements=driver.findElements(By.xpath("//div[@class='main-container']//div[3]//div[1]//div[2]//div[1]//ul[1]/li")); 
		   
		 String ExpectedResult="Python Try Catch";
		 String ActualResults=null;
		   
		 
		 for(WebElement eachElement:PythonElements)
		    {
			   System.out.println(eachElement.getText());
		    	//if(eachElement.getText().equalsIgnoreCase(ExpectedResult)) {
		    		////ActualResults=eachElement.getText();
		    		//break;
		    	//}
		    }	
		  //  assertEquals(ActualResults, ExpectedResult, "I didn't found the element text");
		     
		   /* ExpectedResult="Python Try Catch";
		    for(WebElement eachElement:PythonElements)
		    {
		    	if(eachElement.getText().equalsIgnoreCase(ExpectedResult)) {
		    		ActualResults=eachElement.getText();
		    		break;
		    	}
		    }	
		    assertEquals(ActualResults, ExpectedResult, "I didn't found the element text");*/
driver.close();
}

//=========================================Wait========================================================================
//Example for using pageloadtimeout
//1. which implies that the maximum wait time is 20 seconds for the particular element to load or to arrive at the output
//2. Implicitly wait is applied globally, which means it is always available for all the web elements throughout the driver instance
//3. it implies that if the driver is interacting with 100 elements, then implicitly wait is applicable for all the 100 elements.

//@Test
public void ImplicitlyWait_PageLoadTimeout() throws InterruptedException {
	//declaration of chrome driver
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	   
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			
	   //Navigated to the webpage
	driver.get("https://contentstack.built.io");
    	driver.findElement(By.linkText("Forgot password?")).click();
    	
    //driver.quit();
}

 
//@Test
public void ImplicitlyWait_implicitlyWait() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
			
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	   
	driver.get("https://contentstack.built.io");
	Thread.sleep(5000);
	//driver.findElement(By.linkText("Forgot password?")).click();
	driver.findElement(By.partialLinkText("Forgot ")).click();
    
  //  driver.quit();
}

//1. one single weblement to wait for visible, enable or displayed or clickable
//2. WebDriverWait 
//1. Declare a object wait
//2. not a standard u use both implicit and explict
//3.they use both implicit and explicit. 

//@Test
public void Wait_ExplictWait() {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	   
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   			driver.get("https://contentstack.built.io");
	   			
	   			
						WebDriverWait wait=new WebDriverWait(driver, 15);
				
						driver.findElement(By.id("email")).sendKeys("kannan");
						
						WebElement link;
						link= wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("kForgot password?")));
						link.click();
    driver.quit();
}


//Java
//@Test		
public void JavaScriptEXecutorExcercise() throws InterruptedException 					
{		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	  
    //Creating the JavascriptExecutor interface object by Type casting		
    JavascriptExecutor js = (JavascriptExecutor)driver;		
    		
    //Launching the Site.		
    driver.get("http://demo.guru99.com/V4/");			
   
    js.executeScript("window.scrollBy(0,150)");
    Thread.sleep(5000);
    String sText =  js.executeScript("return document.title;").toString();
    System.out.println(sText);
    		 
    //Login to Guru99 		
    driver.findElement(By.name("uid")).sendKeys("mngr34926");					
    driver.findElement(By.name("password")).sendKeys("amUpenu");		
    
    WebElement button =driver.findElement(By.name("btnLogin"));		
     // button.click();
    //Perform Click on LOGIN button using JavascriptExecutor		
    js.executeScript("arguments[0].click();", button); 
}		


//@Test
		public void appleSite(){
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				driver=new ChromeDriver();
					driver.get("https://www.apple.com/");
			
			//	driver.findElement(By.linkText("Mac")).click();
					elementClick(driver,"Mac");
					String xpathtext="//span[contains(text(),'MacBook Pro 16')]";
						elementClick(driver,xpathtext);
							xpathtext="//span[contains(text(),'Compare all Mac models')]";
								elementClick(driver,xpathtext);
									elementSelectValue(driver, "selector-0", "r0c4");
				}
		//@Test
		public void GetAllElements(){
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				driver=new ChromeDriver();
					driver.get("https://www.fundsindia.com/registration/signin#SignIn.com/");
					 
					
		}

		
@Test
public void WebTableExcercise1() {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	ChromeOptions option=new ChromeOptions();
	option.setHeadless(true);

	WebDriver driver=new ChromeDriver(option);
	
	driver.get("https://www.techbeamers.com/");
	
	// driver.findElement(By.linkText("Python Tutorial – Beginners")).click();
	 
	 List<WebElement> WebTableElement= driver.findElements(By.xpath("//div[@class='main-container']//div[3]//div[1]//div[2]//div[1]/ul"));
	 for(WebElement e : WebTableElement) {
			System.out.println(e.getText());
		}
	 
	 driver.close();

}

		
		
		
}