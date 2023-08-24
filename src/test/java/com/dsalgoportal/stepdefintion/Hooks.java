package com.dsalgoportal.stepdefintion;

import org.openqa.selenium.WebDriver;

import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

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
}
