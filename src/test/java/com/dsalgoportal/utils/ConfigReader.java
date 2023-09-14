package com.dsalgoportal.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigReader {

	public static Properties properties;
	private final static String propertyFilePath = System.getProperty("user.dir")
			+ "/src/test/resources/config.properties";

	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}

	}

	public static String getBrowserType() {
		String browserType = properties.getProperty("browser");
		return browserType;
	}

	public static String getApplicationUrl() {
		String url = properties.getProperty("baseURLWithoutHome");
		return url;
	}

	public static String getHomePageUrl() {
		String url = properties.getProperty("baseURL");
		return url;
	}

	public static String signInPageUrl() {
		String url = properties.getProperty("signInPage");
		return url;
	}

	public static String getexcelfilepath() {
		String excelfilelpath = properties.getProperty("excelfilepath");
		return excelfilelpath;

	}
}