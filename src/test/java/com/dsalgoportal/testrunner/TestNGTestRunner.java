package com.dsalgoportal.testrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Features",
  glue = "com.dsalgoportal.stepdefintion", 
   monochrome = true, dryRun = false, 
   plugin = {"html:target/cucumber.html" })

public class TestNGTestRunner extends AbstractTestNGCucumberTests {

}
