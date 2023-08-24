package com.dsalgoportal.stepdefintion;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.GetStartedPage;
import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetStartedStep extends BaseClass {

	public WebDriver driver = DriverFactory.getdriver();;
	public GetStartedPage getstartedpage = new GetStartedPage(driver);
	String title = "NumpyNinja";

	@Given("The user opens DS Algo portal link")
	public void The_user_opens_DS_Algo_portal_link() throws IOException {

		String url = ConfigReader.getApplicationUrl();
		driver.get(url);
	}

	@When("The user clicks the Get Started button")
	public void The_user_clicks_Get_started_button() {

		getstartedpage.clickGetStartBtn();
	}

	@Then("The user should be redirected to homepage")
	public void The_user_should_be_redirected_to_homepage() {

		Assert.assertEquals(driver.getTitle(), title);

	}
}