package TestNGExamples.TestNGExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest{
	
	
	//Session Handling
	//Parallel tests run
	@Test
	public void session1() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/V4/");
		   driver.findElement(By.name("uid")).sendKeys("Driver 1");
	}
	
	@Test
	public void session2() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/V4/");
		   driver.findElement(By.name("uid")).sendKeys("Driver 2");
	}
	
	@Test
	public void session3() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   driver.get("http://demo.guru99.com/V4/");
		   driver.findElement(By.name("uid")).sendKeys("Driver 3");
	}
}