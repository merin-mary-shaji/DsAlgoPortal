package com.dsalgoportal.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "src/test/resources/Features/Array.feature", glue = "com.dsalgoportal.stepdefintion", monochrome = true, dryRun = false, plugin = {
		"html:target/cucumber.html" })

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
