package SeleniumTest.SeleniumTest;

import org.junit.Test;

import com.org.pages.LoginPage;
import com.org.util.Init;

public class LoginFunctinalityTest extends Init{
	@Test
	public void tc_01_testLoginWithValidCredentials() {
		LoginPage LoginPageObj=new LoginPage(driver);
		System.out.println("LoginFunctionalityTest");
		//LoginPageObj.assertLoginPageHeading();
	}

}
