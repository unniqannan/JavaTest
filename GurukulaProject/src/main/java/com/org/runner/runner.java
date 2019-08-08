package com.org.runner;
 

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


/*@CucumberOptions(features= {"src//main//resources//featuresFile"},glue= {"cucumber.stepdefinitions"},
plugin = { "pretty", "html:target/cucumber-reports" },tags = {"@SmokeTest"}, monochrome = true)
*/
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//main//resources//featuresFile"},glue= {"cucumber.stepdefinitions"},
plugin = { "pretty", "html:target/cucumber-html-report","json:target/cucuber.json","junit:target/cucumber.xml","rerun:target/rerun.txt" }
,tags = {"@SmokeTest"}, monochrome = true)
public class runner {

}

 

 
