package com.dsalgoportal.stepdefintion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.GetStartedPage;
import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.RegisterPage;
import com.dsalgoportal.utils.DriverFactory;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BaseStep {
	public WebDriver driver = DriverFactory.getdriver();
	GetStartedPage getstartedpage = new GetStartedPage(driver);
	HomePage home = new HomePage(driver);
	RegisterPage regist = new RegisterPage(driver);

	@Given("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("Click on Get Started")
	public void click_on_get_started() throws InterruptedException {
		getstartedpage.clickGetStartBtn();
		Thread.sleep(2000);

}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}
}
