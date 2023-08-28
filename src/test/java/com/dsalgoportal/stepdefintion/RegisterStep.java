package com.dsalgoportal.stepdefintion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.GetStartedPage;
import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.RegisterPage;
import com.dsalgoportal.utils.DriverFactory;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStep {
	public WebDriver driver = DriverFactory.getdriver();
	GetStartedPage getstartedpage = new GetStartedPage(driver);
	HomePage home = new HomePage(driver);
	RegisterPage regist = new RegisterPage(driver);

	
	
	@When("User click on Register link")
	public void user_click_on_register_link() {
		home.clickOnRegister();
	}
	
	

	@When("User enters Username as {string} , Password as {string} and Password confirmation as {string}")
	public void user_enters_username_as_password_as_and_password_confirmation_as(String username, String password,
			String confirmPassword) {
		regist.enterTxtintoUsername(username);
		regist.enterTxtintoPassword(password);
		regist.enterTxtintoconfirmationPassword(confirmPassword);

	}

	@When("The user clicks on Register button")
	public void the_user_clicks_on_register_button() {
		regist.clickonRegisterButton();
	}

	@Then("The user should get error message {string} below first empty field {string} {string} {string}.")
	public void the_user_should_get_error_message_below_first_empty_field(String expectedMessage, String username,
			String password, String passwordconfirm) {

		if (username.isEmpty()) {
			String actualMessage = regist.txtUsername.getAttribute("validationMessage");
			Assert.assertEquals(actualMessage, expectedMessage);
		} else if (password.isEmpty()) {
			String actualMessage = regist.txtPassword.getAttribute("validationMessage");
			Assert.assertEquals(actualMessage, expectedMessage);
		} else if (passwordconfirm.isEmpty()) {
			String actualMessage = regist.txtPasswordConfirmation.getAttribute("validationMessage");
			Assert.assertEquals(actualMessage, expectedMessage);
		}
	}

	

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String expectedMessage) {
		String actualMessage = regist.getErrorMessage();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Then("The user should be redirected to Homepage with the message {string}")
	public void the_user_should_be_redirected_to_homepage_with_the_message(String expectedMessage) {
		String actualMessage = regist.getErrorMessage();
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.println(driver.getTitle());
		System.out.println(actualMessage);
	}

}






















