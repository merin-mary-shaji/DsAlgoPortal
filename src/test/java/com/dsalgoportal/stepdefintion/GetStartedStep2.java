package com.dsalgoportal.stepdefintion;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.GetStartedPage;
import com.dsalgoportal.utils.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetStartedStep2  {
	public WebDriver driver;
	
	ConfigReader config= new ConfigReader();
	GetStartedPage getstartedpage;
    String title="NumpyNinja";
    
	@Given("The user opens DS Algo portal link")
	public void The_user_opens_DS_Algo_portal_link() throws IOException  {
		driver=config.initilizeDriver();
		String url = config.getApplicationUrl();
		driver.get(url);
	}

	@When("The user clicks the Get Started button")
	public void The_user_clicks_Get_started_button() {
		getstartedpage = new GetStartedPage(driver);
		getstartedpage.clickGetStartBtn();
	}

	@Then("The user should be redirected to homepage")
	public void The_user_should_be_redirected_to_homepage() {
		
		Assert.assertEquals(driver.getTitle(), title);

	}
}
