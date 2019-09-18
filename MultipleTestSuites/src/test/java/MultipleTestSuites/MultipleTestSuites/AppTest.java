package MultipleTestSuites.MultipleTestSuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 

/**
 * Unit test for simple App.
 */
public class AppTest {
@Test
public void session1() {
	System.setProperty("webdriver.chrome.driver","D:\\DevTools\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	   driver.get("http://demo.guru99.com/V4/");
	   driver.findElement(By.name("uid")).sendKeys("Driver 1");
}
}
