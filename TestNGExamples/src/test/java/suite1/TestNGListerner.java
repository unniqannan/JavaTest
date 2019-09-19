package suite1;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListerner implements ITestListener, ISuiteListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("ITest Result started"+result.getTestClass().getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Success");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failure"+result.getTestClass().getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ISuite suite) {
		System.out.println("Suite Listener Call.... Suite Started ");
		
	}

	public void onFinish(ISuite suite) {
		System.out.println("Suite Listener Call.... Suite got End ");
		
	}

}
