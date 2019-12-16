package FirstClassSelenium.FirstClassSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchTo {
	WebDriver driver;
	
	//@Test //Switching to a frame + reading the elements
     public void SwitchToOneFrame() {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/"); //Navigate to WebPage
			driver.switchTo().frame("a077aa5e");
			 System.out.println(driver.findElement(By.xpath("//html//body//a")).getAttribute("href"));
			   driver.findElement(By.xpath("//html//body//a//img")).click();
			
	}
	
	@Test
	public void SwitchBackToMainFrame() {
    System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/guru99home/");
			driver.switchTo().frame("a077aa5e");
			driver.findElement(By.xpath("//html//body//a//img")).click();
			
			//driver.switchTo().defaultContent();
			driver.switchTo().parentFrame();
			System.out.println(driver.getTitle());
			
			driver.findElement(By.xpath("//input[@id='philadelphia-field-email']")).sendKeys("kannan");
			
			String textName=driver.findElement(By.xpath("//label[@class='previewLabel']")).getText();
				System.out.println(textName);
	}
	//@Test
	public void FindingTotalFramesInWebPage() {
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			
			driver=new ChromeDriver();
				driver.get("http://demo.guru99.com/test/guru99home/");
				
				int size = driver.findElements(By.tagName("iframe")).size();
				 System.out.println(size);
		}
	
	//@Test
	public void FindingTotalFramesInWebPage1() {
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			
			driver=new ChromeDriver();
				driver.get("http://demo.guru99.com/test/guru99home/");
				
				int size = driver.findElements(By.tagName("iframe")).size();
				 System.out.println(size);
				
				 
				  for(int i=0; i<=size; i++){
					  try {
						driver.switchTo().frame(i);
					  }
					  catch(Exception e) {}
						int total=driver.findElements(By.xpath("html/body/a/img")).size();
						System.out.println(total);
					    //driver.switchTo().defaultContent();
						}
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
}
