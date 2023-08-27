package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	//id_username
		@FindBy(id = "id_username")
		public WebElement txtUsername;
	//id_password1
		@FindBy(id = "id_password1")
		public WebElement txtPassword;
	//id_password2
		@FindBy(id = "id_password2")
		public WebElement txtPasswordConfirmation;
	//input[@value='Register']
		@FindBy(xpath = "//input[@value='Register']")
		public WebElement btnRegister;
	//error message	
		//@FindBy(xpath = "/html/body/div[3]")
	//	WebElement errorMsg;
		
		

		public void enterTxtintoUsername(String username) {
			txtUsername.sendKeys(username);
		}
		public void enterTxtintoPassword(String Password) {
			txtPassword.sendKeys(Password);
		}
		public void enterTxtintoconfirmationPassword(String Password) {
			txtPasswordConfirmation.sendKeys(Password);
		}
		public void clickonRegisterButton() {
			btnRegister.click();
			
		}
		
		public String getErrorMessage() {
			return errorMsg.getText();
		}
		
		// div[@class='alert alert-primary'] :-error message
		@FindBy(xpath = "//div[@class='alert alert-primary']")
		public WebElement errorMsg;
}


