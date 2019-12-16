package TestNGExamples.TestNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest{
	
	
	//Session Handling
	//Parallel tests run
	//@Test
	public void session1() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/V4/");
		   driver.findElement(By.name("uid")).sendKeys("Driver 1");
	}
	
	//@Test
	public void session2() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/V4/");
		   driver.findElement(By.name("uid")).sendKeys("Driver 2");
	}
	
	//@Test
	public void session3() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/V4/");
		   driver.findElement(By.name("uid")).sendKeys("Driver 3");
	}

	@Test
	public void FacebookImageClick() {
		System.out.println("Facebook Page TestNG Examples");
		/*String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get(baseUrl);
		//driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a")).click();
		driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
			*/	 
	}
	
}