package com.dsalgoportal.stepdefintion;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.SignInPage;
import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;
import com.dsalgoportal.utils.ExcelReader;
import com.dsalgoportal.utils.LoggerLoad;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStep {

	public WebDriver driver = DriverFactory.getdriver();;
	public SignInPage signinpage = new SignInPage(driver);
	String title = "Registration";
	String title1 = "NumpyNinja";
	String logOutMsg = "Logged out successfully";
	String errorMessage = "Invalid Username and Password";
	String Excelpath = ConfigReader.getexcelfilepath();
	String message;
	HomePage homepage = new HomePage(driver);

	@Given("The user is in the Sign in page")
	public void the_user_is_in_the_sign_in_page() {

		String url = ConfigReader.signInPageUrl();
		driver.get(url);
	}

	@When("The user enters a valid {string} and {string}")
	public void the_user_enters_a_valid_and(String name, String password)  {

		signinpage.enterUsername(name);
		signinpage.enterPassword(password);
		
	}

	@Then("click login button to verify")
	public void click_login_button_to_verify()  {
		signinpage.clickLoginBtn();
		LoggerLoad.info("User clicks on Login Button");
		
	}

	@When("The user clicks on register link on signin page")
	public void the_user_clicks_on_register_link_on_signin_page() {
		signinpage.clickRegisterLink();
		//homepage.clickOnRegister();
		LoggerLoad.info("User clicks register link on signin page");
	}

	@Then("The user redirected to Registration page from signin page")
	public void the_user_redirected_to_registration_page_from_signin_page() {
		Assert.assertEquals(title, driver.getTitle());
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}

	@When("The user enter invalid {string} and {string}")
	public void the_user_enter_invalid_and(String name, String password) {
		signinpage.enterUsername(name);
		signinpage.enterPassword(password);
	}

	@And("Error message will be displayed")
	public void Error_message_will_be_displayed() {
		Assert.assertEquals(errorMessage, signinpage.getErrorMsg());
		LoggerLoad.info("Error message displayed is : " + signinpage.getErrorMsg());
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String Sheetname, Integer Rownumber)
			throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, Sheetname);
		String username = testdata.get(Rownumber).get("UserName");
		String password = testdata.get(Rownumber).get("Password");
		message = testdata.get(Rownumber).get("ExpectedMessage");
		signinpage.enterUsername(username);
		signinpage.enterPassword(password);
	}

	@Then("click login button to verify the message")
	public void click_login_button_to_verify_the_message() {
		String msg = signinpage.click_login();
		Assert.assertEquals(msg, message);
		LoggerLoad.info("Message displayed is : " + msg);
		

	}

	@Then("The user is in the Home page with valid  log in")
	public void the_user_is_in_the_home_page_with_valid_log_in() {
		Assert.assertEquals(title1, driver.getTitle());
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}

	@And("The user clicks Sign out")
	public void the_user_clicks_sign_out()  {
		signinpage.clickSignOut();
		LoggerLoad.info("User clicks on SignOut Button");
	}

	@And("Logout message should be displayed")
	public void logout_message_should_be_displayed() {
		Assert.assertEquals(logOutMsg, homepage.logoutMsg());
		LoggerLoad.info("LogOut Message displayed is : " + homepage.logoutMsg());
	}

}
