package suite2;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class SnapDeal {
	WebDriver driver; 
	@BeforeClass
	public void init() {
		
		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.navigate().to("https://www.jobserve.com");
		
	}
	
	// Search For product
		@Test(priority=1)	
		public void AsearchAndSelectProduct() throws InterruptedException {	
			System.out.println("AsearchAndSelectProduct");
			driver.findElement(By.id("loginMnu")).click();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//ul[@class='dropit-submenu']//a[contains(text(),'Job Seekers')]")).click();
			driver.findElement(By.xpath("//*[@id=\"PolicyOptInLink\"]")).click();
			driver.findElement(By.name("ctl00$main$txbEmail")).sendKeys("unniqannan@gmail.com");
			driver.findElement(By.name("ctl00$main$txbPassword")).sendKeys("Kannan$1112");
			driver.findElement(By.name("ctl00$main$btnlogin")).click();
			driver.findElement(By.xpath("//*[@id=\"mnuJobSearch\"]/a")).click();
			
			WebElement nameInputField = driver.findElement(By.id("IntPromoHdrLinkTitle"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", nameInputField);
			
			Thread.sleep(15000);
			
			nameInputField=driver.findElement(By.xpath("//*[@id=\"SearchToolbarLinkList\"]/li[1]/a"));
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", nameInputField);
			
			String SearchWindow=null;
			String parentWindow = driver.getWindowHandle();
			Set<String> handles =  driver.getWindowHandles();
			   for(String windowHandle  : handles)
			       {
			       if(!windowHandle.equals(parentWindow))
			          {
			          driver.switchTo().window(windowHandle);
			            SearchWindow=driver.getWindowHandle();
			          }
			       } 
			   
			   driver.switchTo().window(parentWindow); //cntrl to parent window
		         driver.close();
		         driver.switchTo().window(SearchWindow);
		         System.out.println("searchWindow    > "+SearchWindow);
		         
			   Thread.sleep(15000);
			   driver.findElement(By.xpath("//div[12]//label[1]//a[2]")).click();
			   		driver.findElement(By.id("CHECKBOXSAL9")).click();
			   			Thread.sleep(5000);
			   				driver.findElement(By.id("refinebutton")).click();  
			   					
			   				
				 
		}
		
		@AfterClass
		public void quit() {
		//	driver.close();
		}

		@Test(priority=2)	
		public void JobApplication() {
			System.out.println("job application");
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			 for (int i=1;i<=50;i++) {
				 List<WebElement> divelements=driver.findElements(By.xpath("//div[@id='jsJobResContent']/div["+i+"]"));
				 for (WebElement element1: divelements) {
					// System.out.println(element1.getText());
					   try {
						   element1.click();
					   String apply=driver.findElement(By.id("td_apply_btn")).getText();
					      if(apply.equalsIgnoreCase("Apply")) {
					    	  driver.findElement(By.id("td_apply_btn")).click();
					    	        
					    	  
					    	//  Thread.sleep(15000);
					    	  
					    	  
					    	  String title=driver.findElement(By.id("jobtitle")).getText();
					    	  System.out.println(title);
					    	  driver.switchTo().frame("appFrame");
					    	  
					    	  
					    	  
					    	  Select sel=new Select(driver.findElement(By.name("ddlCV")));
					    	  sel.selectByVisibleText("UnniKannan_Resume_TestArchitec [11 Sep 2019]");
							    try {
							    	 driver.findElement(By.id("lnkClear")).click();
							    driver.findElement(By.name("filCover")).sendKeys("C:\\Users\\unkan\\Downloads\\UnniKannan_MotivationLetter.txt");
							    }catch(Exception e) {}
							    driver.findElement(By.id("btn1")).click();
							    try {
							   title=driver.findElement(By.xpath("//span[contains(text(),'Your application has been submitted.')]")).getText();
							   System.out.println(title);
							    }catch(Exception e) {}
							    try {
							    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick'][contains(text(),'close')]")).click(); }catch(Exception e) {}
							   driver.findElement(By.xpath("//span[contains(text(),'close')]")).click();
							   
							   
							
							   
							  // Thread.sleep(5000);
							//   WebElement Close=driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick'][contains(text(),'close')]"));
							//	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
							//	executor1.executeScript("arguments[0].click();", Close);
								
							//	Actions actions = new Actions(driver);
							//	actions.moveToElement(Close).click();
							//	actions.moveToElement(Close).click().build().perform();
								System.out.println(driver.getCurrentUrl());
								System.out.println(driver.getTitle());
								   //driver.switchTo().defaultContent();
									driver.navigate().to(driver.getCurrentUrl());
									 Thread.sleep(5000);
									 Actions actions = new Actions(driver);
									 actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
								   driver.close();
								
								
					  }
					   }  
					   catch(Exception e) {}			
			        		//	 System.out.println("--------------------------------------------------------------");
			  }
			 }
			
			
			/*
			String SearchWindow="CDwindow-A967C9647E470123CAD59B3E34CE8118";
			 driver.switchTo().window(SearchWindow);
	         System.out.println("searchWindow    > "+SearchWindow);
			 
			Set<String> handles =  driver.getWindowHandles();
			   for(String windowHandle  : handles)
			       {
			       if(!windowHandle.equals(parentWindow))
			          {
			          driver.switchTo().window(windowHandle);
			          System.out.println(driver.getTitle());
			          }
			       }
			   Select sel=new Select(driver.findElement(By.name("//select[@id='ddlCV']")));
			  // System.out.println(sel.ge);
			  sel.selectByVisibleText("UnniKannan_Resume_TestArchitec [14 Sep 2019]");
			   */
		}
		
}
