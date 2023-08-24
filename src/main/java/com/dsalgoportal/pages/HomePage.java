package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@role='alert']")
	WebElement logOutMsg;
	@FindBy(xpath = "//div[@role='alert']")
	WebElement logInMsg;

	public String logoutMsg() {
		return logOutMsg.getText();
	}

	public String logInMsg() {
		return logInMsg.getText();
	}
}
