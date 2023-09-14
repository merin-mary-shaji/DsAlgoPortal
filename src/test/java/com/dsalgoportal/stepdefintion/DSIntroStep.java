package com.dsalgoportal.stepdefintion;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.dsalgoportal.pages.DSIntroPage;
import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.SignInPage;
import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;
import com.dsalgoportal.utils.ExcelReader;

import io.cucumber.java.en.*;

public class DSIntroStep {
	WebDriver driver = DriverFactory.getdriver();
	SignInPage signinpage = new SignInPage(driver);
	HomePage homepage = new HomePage(driver);
	DSIntroPage dsintropage = new DSIntroPage(driver);
	String Excelpath = ConfigReader.getexcelfilepath();
	String url = ConfigReader.getHomePageUrl();
	String dsintro = "Data Structures-Introduction";
	String timecomp = "Time Complexity"; 
	String assess = "Assessment"; 
	String code; 
	String rslt; 



	@When("the user clicks on the Get Started button on homepage")
	public void the_user_clicks_on_the_get_started_button_on_homepage() {
		 driver.get(url);
		 dsintropage.clickOnGetStarted();
	}

	@Then("The user is redirected to page with title {string}")
	public void the_user_is_redirected_to_page_with_title(String dsintro) {
		Assert.assertEquals(driver.getTitle(), dsintro);
	}

	@Given("The user is on the DataStructure Introduction page with Time complexity")
	public void the_user_is_on_the_data_structure_introduction_page_with_time_complexity() {
		 driver.getTitle(); 
	}

	@Then("The user clicks on the Time Complexity link.")
	public void the_user_clicks_on_the_time_complexity_link() {
		dsintropage.clickOnTimeCompexity();
	}

	@Then("The user is redirected to landing page with tile {string}")
	public void the_user_is_redirected_to_landing_page_with_tile(String timecomp) {
		Assert.assertEquals(driver.getTitle(),timecomp);
	}

	@Then("The user clicks on the Try Here button")
	public void the_user_clicks_on_the_try_here_button() {
		dsintropage.clickOnTryHere();
	}

	@Then("The user lands in the page with try editor with Title {string}")
	public void the_user_lands_in_the_page_with_try_editor_with_title(String assess) {
		Assert.assertEquals(driver.getTitle(),assess);
	}

	@When("The user enter valid python code in tryEditor of Time Complexity page from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_in_try_editor_of_time_complexity_page_from_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader(); 
	    List<Map<String, String>> tstdata = reader.getData(Excelpath, SheetName);
	    code = tstdata.get(RowNumber).get("arraycode"); 
	    rslt = tstdata.get (RowNumber).get("Result"); 
	    dsintropage.codeEditor(code);}
	
	@When("The user clicks on run button")
	public void the_user_clicks_on_run_button() {
	   dsintropage.clickOnRunBtn();
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
	    dsintropage.codeOutput();
//	    dsintropage.clearEditor();
	    }
	
	@Then("The user Navigates Back.")
	public void the_user_navigates_back() {
	    dsintropage.navigateback();
	}

@When("The user enter python code with invalid syntax in tryEditor of Time Complexity page from sheet {string} and {int}")
public void the_user_enter_python_code_with_invalid_syntax_in_try_editor_of_time_complexity_page_from_sheet_and(String SheetName, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader(); 
	    List<Map<String, String>> tstdata = reader.getData(Excelpath, SheetName);
	    code = tstdata.get(RowNumber).get("arraycode"); 
	    rslt = tstdata.get (RowNumber).get("Result"); 
	    dsintropage.codeEditor(code);}
	

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
	    dsintropage.alerMsg(); 
	}

	@Then("The user navigates to homepage.")
	public void the_user_navigates_to_homepage() {
	    
	}

	
}
