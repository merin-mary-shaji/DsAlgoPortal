package com.dsalgoportal.stepdefintion;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	private static WebDriver driver;
	private static DriverFactory driverfactory;

	@BeforeAll
	public static void before() throws Throwable {
		// Get browser Type from config file
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
		// Initialize driver from driver factory
		driverfactory = new DriverFactory();
		driver = driverfactory.initializeDrivers(browser);
	}

	@AfterAll
	public static void after() {
		driverfactory.closeallDriver();
	}
	
	@After
	public void afterEach(Scenario scenario) {
		if(scenario.isFailed())
		{
			Allure.addAttachment(scenario.getName(),"image/png",
					new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)),  "png");
			
			//for extent report
			byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());

	
		}
		
	}

//	private String content;
//	private String fileExtension;
	
	
}
