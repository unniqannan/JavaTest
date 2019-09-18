package testRunners;


	
	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	// import cucumber.api.testng.AbstractTestNGCucumberTests;

	 
	@RunWith(Cucumber.class)
	@CucumberOptions(dryRun = false, strict = true,features="src//main//java//com//org//resources", glue="src//main//java//com//org//stepdefs", monochrome = true,
			 format = { "pretty", "html:target/cucumber", "json:target_json/cucumber.json", "junit:taget_junit/cucumber.xml" } )
	public class TestRunner_Basic{
	// extends AbstractTestNGCucumberTests 
	 
	}
	
