package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage {

	public WebDriver driver;

	public SignInPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	WebElement username;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(xpath = "//input[@type='submit']")
	WebElement clickBtn;
	@FindBy(xpath = "//a[text()='Register!']")
	WebElement clickRegisterLink;
	@FindBy(xpath = "//div[@role='alert']")
	WebElement errorMessage;
	@FindBy(xpath = "//div[@role='alert']")
	WebElement message;

	public void enterUsername(String name) {
		username.clear();
		username.sendKeys(name);
	}

	public void enterPassword(String passwrd) {
		password.clear();
		password.sendKeys(passwrd);
	}

	public void clickLoginBtn() {
		clickBtn.click();
		//System.out.println();
	}

	// login for excel sheet data
	public String click_login() {

		clickBtn.click();
		String msg = message.getText();
		return msg;
	}

	public void clickRegisterLink() {
		clickRegisterLink.click();
	}

	public String getErrorMsg() {
		return errorMessage.getText();
	}
}
