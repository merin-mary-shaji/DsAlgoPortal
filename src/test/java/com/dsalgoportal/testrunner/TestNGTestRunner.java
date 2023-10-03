package com.dsalgoportal.testrunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/resources/Features",glue="com.dsalgoportal.stepdefintion",
monochrome=false,dryRun=false,plugin= {"pretty","html:target/cucumber.html"
		,"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class TestNGTestRunner extends AbstractTestNGCucumberTests {


}
