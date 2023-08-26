package com.dsalgoportal.stepdefintion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import com.dsalgoportal.pages.GetStartedPage;
import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.RegisterPage;
import com.dsalgoportal.utils.ConfigReader;


public class RegisterStep {
	public WebDriver driver;
	GetStartedPage getstartedpage;
	HomePage home;
	RegisterPage regist;

@Given("User Launch Chrome browser")
public void user_launch_chrome_browser() {
	WebDriverManager.chromedriver().setup();
	//RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	home = new HomePage(driver);
	getstartedpage = new GetStartedPage(driver);
	regist = new RegisterPage(driver);
}

@When("User opens URL {string}")
public void user_opens_url(String url) {
  driver.get(url);
}

@When("Click on Get Started")
public void click_on_get_started() {
	getstartedpage.clickGetStartBtn();
		
	}
   

@Then("Page Title should be {string}")

	public void page_title_should_be(String titile) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(titile, driver.getTitle());
		}
   
}

@When("User click on Register link")
public void user_click_on_register_link() {
	
		HomePage.clickOnRegister();
}
  


@When("User enters Username as {string} , Password as {string} and Password confirmation as {string}")
public void user_enters_username_as_password_as_and_password_confirmation_as(String username, String password,
		String password3) {
	regist.enterTxtintoUsername(username);
	regist.enterTxtintoPassword(password);
	regist.enterTxtintoconfirmationPassword(password3);

}

@When("The user clicks on Register button")
public void the_user_clicks_on_register_button() {
	regist.clickonRegisterButton();
}
  

@Then("The user should get error message {string} below first empty field {string} {string} {string}.")
public void the_user_should_get_error_message_below_first_empty_field(String expectedMessage, String username, String password, String passwordconfirm) {
	
	if(username.isEmpty())
	{
		String actualMessage = regist.txtUsername.getAttribute("validationMessage");
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	else if(password.isEmpty())
	{
		String actualMessage = regist.txtPassword.getAttribute("validationMessage");
		Assert.assertEquals(actualMessage, expectedMessage);
	}
	else if(passwordconfirm.isEmpty()) {
		
		String actualMessage = regist.txtPasswordConfirmation.getAttribute("validationMessage");
		Assert.assertEquals(actualMessage, expectedMessage);
	}	
	}

@Then("close browser")
public void close_browser() {
	driver.quit();
}
  

@Then("It should display an error message {string}")

public void it_should_display_an_error_message(String expectedMessage) {
		
		String actualMessage =home.getErrorMessage();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, expectedMessage);
}

@Then("The user should be redirected to Homepage with the message {string}")
public void the_user_should_be_redirected_to_homepage_with_the_message(String expectedMessage) {
	String actualMessage =home.getErrorMessage();
	Assert.assertEquals(actualMessage, expectedMessage);
	System.out.println(driver.getTitle());
	System.out.println(actualMessage);
}




}
