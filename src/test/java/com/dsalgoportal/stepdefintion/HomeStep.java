package com.dsalgoportal.stepdefintion;

import org.openqa.selenium.WebDriver;

import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.utils.DriverFactory;

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

@When("User click on Data Structure DropDown")
public void user_click_on_data_structure_drop_down() {
	home.clickOnDataStructure();
}

@When("User click on {string}")
public void user_click_on(String option) {
	home.clickOnDSOption(option);
}
@Then("The user get warning message {string}")
public void the_user_get_warning_message(String string) {
	home.getErrorMessage();
}


@When("User click on Get Started of {string}")
public void user_click_on_get_started_of(String option) {
	home.clickOnGetStartedOfEachSection(option);
}
}





