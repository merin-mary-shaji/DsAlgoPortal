package com.dsalgoportal.testrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/resources/Features",
  glue = "com.dsalgoportal.stepdefintion", 
   monochrome = true, dryRun = false, 
   plugin = {"html:target/CucumberReports/Cucumber.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"} )

public class TestNGTestRunner extends AbstractTestNGCucumberTests {


}
