package com.dsalgoportal.stepdefintion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.QueuePage;
import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;
import com.dsalgoportal.utils.ExcelReader;
import com.dsalgoportal.utils.LoggerLoad;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueueStep {
	public WebDriver driver = DriverFactory.getdriver();
	HomePage home = new HomePage(driver);
	QueuePage queue = new QueuePage(driver);
	String expected, actual;

	//String  pythoncode;
	String Excelpath = ConfigReader.getexcelfilepath();
	String url = ConfigReader.getHomePageUrl();
	String result;

	@When("The user clicks on DataStructure drop down")
	public void the_user_clicks_on_data_structure_drop_down() {
		driver.get(url);
		home.clickOnDataStructure();
		LoggerLoad.info("The user clicks on DataStructure dropdown");
	}

	@When("The user clicks {string}")
	public void the_user_clicks_queue(String option) {
		home.clickOnDSOption(option);
	}

	@Then("Queue page gets displayed")
	public void queue_page_gets_displayed() {
		expected = "https://dsportalapp.herokuapp.com/Queue/";
		actual = queue.getPageUrl();
		Assert.assertTrue(expected.equalsIgnoreCase(actual));
		LoggerLoad.info("Queue page is displayed");

	}

	@When("The user clicks on Topics Covered with {string} link")
	public void the_user_clicks_on_topics_covered_with_link(String string) throws InterruptedException {
		queue.clickonTopics(string);
		
	}

	@When("The user clicks on Tryhere link")
	public void the_user_clicks_on_tryhere_link() {
		queue.clickOnTryHere();
		LoggerLoad.info("The user clicks on Tryhere link");
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			LoggerLoad.error("***unsuccessful login***");
			driver.close();
			Assert.assertTrue(false);
		} else 
		{
			Assert.assertEquals(title, driver.getTitle());
			LoggerLoad.info("Page title should be : " + driver.getTitle());
		}
	}

	@When("The user enters python code in Editor from sheet {string} and {string}")
	public void the_user_enters_python_code_in_editor_from_sheet_and(String sheetName, String rowNumber)
			throws Exception {
		String pythonCode = ExcelReader.readExcelValue(Excelpath, sheetName, rowNumber);
		//System.out.println("Python Code: " + pythonCode);
		queue.enterText(pythonCode);
		queue.clickonRun();
	}
	/*	@When("The user enters python code in Editor from sheet {string} and {int}")
		public void the_user_enters_python_code_in_editor_from_sheet_and(String sheetName, int rowNumber)
				throws Exception {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetName);
		 pythoncode = testdata.get(rowNumber).get("pythonCode");
		 result = testdata.get(rowNumber).get("Result");
		 System.out.println(pythoncode);
		 queue.enterText(pythoncode);
			queue.clickonRun();

	}  */

	@When("User click on Get Started of datastructure")
	public void user_click_on_get_started_of_datastructure() {

	}

	@When("The user clicks on Run button")
	public void the_user_clicks_on_run_button() {
		queue.clickonRun();
		LoggerLoad.info("Clicked on run");
	}

	@Then("user should be  presented with run result")
	public void user_should_be_presented_with_run_result() {
		queue.clickTogetoutput();

	}

	@When("user navigate to home page")
	public void user_navigate_to_home_page() {
		driver.navigate().back();
		driver.navigate().back();
	}

}
