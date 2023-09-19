package com.dsalgoportal.stepdefintion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.utils.DriverFactory;
import com.dsalgoportal.utils.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStep {
	public WebDriver driver = DriverFactory.getdriver();
	HomePage home = new HomePage(driver);
	
	@When("User click on Sign in link")
	public void user_click_on_sign_in_link() throws InterruptedException {
		home.clickOnSignIn();
		
	}


//home datastructures
@Given("User opens URL {string}")
	public void user_opens_url(String url) {
	LoggerLoad.info("****Launching URL****");
	   driver.get(url); 
	}
	
@When("User click on Data Structure DropDown")
public void user_click_on_data_structure_drop_down() {
	home.clickOnDataStructure();
	LoggerLoad.info("User clicks on Data Structure dropdown");
}

@When("User click on {string}")
public void user_click_on(String option) {
	home.clickOnDSOption(option);
}
@Then("The user get warning message {string}")
public void the_user_get_warning_message(String string) {
	home.getErrorMessage();
	LoggerLoad.info("** User gets warning message**");
}


@When("User click on Get Started of {string}")
public void user_click_on_get_started_of(String option) {
	home.clickOnGetStartedOfEachSection(option);
}

@Then("Page Title should be {string}")
public void page_title_should_be(String title) {
	Assert.assertEquals(title, driver.getTitle());
	LoggerLoad.info("Page title should be : "+ driver.getTitle());
}
}





