package com.org.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//main//resources//featuresFile"},glue= {"cucumber.stepdefinitions"},
plugin = { "pretty", "html:target/cucumber-reports" },tags = {"@SmokeTest"}, monochrome = true)
public class runner {

}

 

 
