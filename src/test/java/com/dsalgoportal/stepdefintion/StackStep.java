package com.dsalgoportal.stepdefintion;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.SignInPage;
import com.dsalgoportal.pages.StackPage;
import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;
import com.dsalgoportal.utils.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackStep{
	public WebDriver driver = DriverFactory.getdriver();
	public SignInPage signinpage = new SignInPage(driver);
	public HomePage homepage = new HomePage(driver);
	public StackPage stackpage = new StackPage(driver);
	String Excelpath = ConfigReader.getexcelfilepath();
	String url = ConfigReader.signInPageUrl();
	String title = "NumpyNinja";
	String title1 = "Stack";
	String title2 = "Operations in Stack";
	String title3 = "Assessment";
	String title4 ="Implementation";
	String title5 ="Applications";
	String title6 ="Practice Questions";
	String alertmsg ="SyntaxError: bad input on line 1";
	String pythoncode;
	String result;
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
		
		driver.get(url);
	}
	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String name, String password) {
		signinpage.enterUsername(name);
		signinpage.enterPassword(password);  
	}
	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		signinpage.clickLoginBtn();
		Assert.assertEquals(driver.getTitle(), title);
	}

	@Given("The user is on the Stack page after logged in")
	public void the_user_is_on_the_stack_page_after_logged_in() {
		homepage.clickStack_GetStartBtn();
		Assert.assertEquals(driver.getTitle(), title1);
		
	}
	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
	    stackpage.clickOperationStackLink();
	}
	@Then("The user should then be directed to Operations in Stack Page")
	public void the_user_should_then_be_directed_to_operations_in_stack_page() {
		Assert.assertEquals(driver.getTitle(), title2);
	}

	
	@When("The user clicks Try Here button in stack page")
	public void the_user_clicks_try_here_button_in_stack_page() {
	   stackpage.clickTryHereBtn();
	}
	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		Assert.assertEquals(driver.getTitle(), title3);
	}
	@When("The user gets input from sheet {string} and {int}")
	public void the_user_gets_input_from_sheet_and(String Sheetname, Integer Rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, Sheetname);
		 pythoncode = testdata.get(Rownumber).get("pythonCode");
		 result = testdata.get(Rownumber).get("Result");
		 System.out.println(pythoncode);
	
	}
	@When("The user clicks on Run button after Entering valid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() {
		System.out.println(pythoncode);
	    stackpage.enterText(pythoncode);
	    stackpage.clickRunBtn();
	}
	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output() {
		String actualResult=stackpage.actualResult();
	    Assert.assertEquals(actualResult, result);
	}
	@Given("The user is in stack page having an tryEditor with a Run button to test")
	public void the_user_is_in_stack_page_having_an_try_editor_with_a_run_button_to_test() {
	    driver.navigate().back();
	    stackpage.clickTryHereBtn();
	}
	@When("The user gets invalid input from sheet {string} and {int}")
	public void the_user_gets_invalid_input_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath, Sheetname);
		 pythoncode = testdata.get(RowNumber).get("pythonCode");
		 result = testdata.get(RowNumber).get("Result");
	}
	@When("The user clicks on Run button after Entering invalid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_stack_try_editor() {
		System.out.println(pythoncode);
		stackpage.enterText(pythoncode);
	    stackpage.clickRunBtn();
	}
	@Then("The user should get the error message")
	public void the_user_should_get_the_error_message() {
	   String actualAlertmsg =stackpage.alertPopUp();
	   Assert.assertEquals(actualAlertmsg, alertmsg);
	    
	}
	@When("The user clicks on the Implementation button")
	public void the_user_clicks_on_the_implementation_button() {
		driver.navigate().back();
		stackpage.clickImplementationLink();
	}
	@Then("The user should then be directed to Implementation Page")
	public void the_user_should_then_be_directed_to_implementation_page() {
		Assert.assertEquals(driver.getTitle(), title4);
	}
	@When("The user clicks Try Here button in stack Implementation page")
	public void the_user_clicks_try_here_button_in_stack_implementation_page() {
		stackpage.clickTryHereBtn();
	}
	@When("The user clicks on the Applications button")
	public void the_user_clicks_on_the_applications_button() {
		driver.navigate().back();
		stackpage.clickApplicationsLink();;
	}
	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() {
	    Assert.assertEquals(driver.getTitle(), title5);
	}
	@When("The user clicks Try Here button in stack Applications page")
	public void the_user_clicks_try_here_button_in_stack_applications_page() {
		stackpage.clickTryHereBtn();
	}
	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		driver.navigate().back();
		stackpage.clickpracticeQuestionsLink();
	}
	@Then("The user should be redirected to Practice Questions pag")
	public void the_user_should_be_redirected_to_practice_questions_pag() {
		 Assert.assertEquals(driver.getTitle(), title6);
	}

}
