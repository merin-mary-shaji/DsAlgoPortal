package com.dsalgoportal.stepdefintion;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.ArrayPage;
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

public class ArraysStep {
	public WebDriver driver = DriverFactory.getdriver();
	public SignInPage signinpage = new SignInPage(driver);
	public HomePage homepage = new HomePage(driver);
	public ArrayPage arraypage = new ArrayPage(driver);
	String Excelpath = ConfigReader.getexcelfilepath();
	String url = ConfigReader.signInPageUrl();
	String hm = "Numpy Ninja";
	String arpage = "Array";
	String arpy = "Arrays in Python";
	String assess = "Assessment";
	String code;
	String rslt;
	String output = "Hello World";
	String arlist = "Arrays Using List";
	String prQu = "Practice Questions";
	String basicOp = "Basic Operations in Lists";

	String errormsg;
	

	@Given("The user has launched browser and is on sign in page")
	public void the_user_has_launched_browser_and_is_on_sign_in_page() {
		driver.get(url);
	}

	@When("User enters valid credentials Username {string} and Password {string}")
	public void user_enters_valid_credentials_username_and_password(String name, String password) {
		signinpage.enterUsername(name);
		signinpage.enterPassword(password);
		
	}

	@Then("The user is navigates to homepage")
	public void the_user_is_navigates_to_homepage() {
		signinpage.clickLoginBtn();
	}

	@Given("the user is signed into the homeopage {string}")
	public void the_user_is_signed_into_the_homeopage(String hm) {
		Assert.assertEquals(driver.getTitle(), hm);
	}

	@When("the user clicks on the get started button of the Array.")
	public void the_user_clicks_on_the_get_started_button_of_the_array() {
		if(arraypage.clickOnGetStarted())
			LoggerLoad.info(" Arrays Link clicked successfull");
		else
			LoggerLoad.error("Link not clicked");
	}

	@Then("the user is redirected to Array page {string}")
	public void the_user_is_redirected_to_array_page(String arpage) {
		Assert.assertEquals(driver.getTitle(), arpage);
	}

	@When("the user clicks on hyperlink Arrays in Python")
	public void the_user_clicks_on_hyperlink_arrays_in_python() {
		if(arraypage.clickOnArrayPython())
			LoggerLoad.info("Arrays in Python Link was clicked successfull");
		else
			LoggerLoad.error("Arrays in python Link was not clicked");
	}

	@Then("the user is redirected to Arrays in python page {string}")
	public void the_user_is_redirected_to_arrays_in_python_page(String arpy) {
		Assert.assertEquals(driver.getTitle(), arpy);
	}

	@When("the user clicks on the try here button.")
	public void the_user_clicks_on_the_try_here_button() {
		if(arraypage.clickOnTryHere())
			LoggerLoad.info("Try Here Button clicked successfull");
		else
			LoggerLoad.error("Try Here Button not clicked");
	}

	@Then("the user is redirected to the assessment page {string}")
	public void the_user_is_redirected_to_the_assessment_page(String assess) {
		Assert.assertEquals(driver.getTitle(), assess);
	}

	@When("The user is at the Try editor page with Run button.")
	public void the_user_is_at_the_try_editor_page_with_run_button() {
		if(arraypage.runButtonEnabled())
			LoggerLoad.info("Run Button clicked successfull");
		else
			LoggerLoad.error("Run Button not clicked");
	}

	@Then("the user passes valid code from data sheet {string} and {int}")
	public void the_user_passes_valid_code_from_data_sheet_and(String SheetName, Integer RowNumber)
			throws org.apache.commons.compress.archivers.dump.InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> tstdata = reader.getData(Excelpath, SheetName);
		code = tstdata.get(RowNumber).get("arraycode");
		rslt = tstdata.get(RowNumber).get("Result");
		arraypage.codeEditor(code);
	}

	@Then("clicks on the run button")
	public void clicks_on_the_run_button() {
		if(arraypage.clickOnRunButton())
			LoggerLoad.info("Run Button clicked successfull");
		else
			LoggerLoad.error("Run Button not clicked");
	}

	@Then("the user should be presented with valid output.")
	public void the_user_should_be_presented_with_valid_output() {
		arraypage.codeOutput();
	}

	@Then("The user navigates back to  Arrays in python page.")
	public void the_user_navigates_back_to_arrays_in_python_page() {
		arraypage.navigateBack();
		// arraypage.clickOnTryHere();
	}

	@Given("The user clicks the Try editor page with Run button.")
	public void the_user_clicks_the_try_editor_page_with_run_button() {
		if(arraypage.clickOnTryHere())
			LoggerLoad.info("Try Editor link was clicked successfull");
		else
			LoggerLoad.error("Try Editor Link not clicked");
	}

	@Then("The user send invalid code from datasheet {string} and {int}")
	public void the_user_send_invalid_code_from_datasheet_and(String SheetName, Integer RowNumber)
			throws org.apache.commons.compress.archivers.dump.InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> tstdata = reader.getData(Excelpath, SheetName);
		code = tstdata.get(RowNumber).get("arraycode");
		rslt = tstdata.get(RowNumber).get("Result");
		arraypage.codeEditor(code);
	}

	@Then("the user should be presented with an error message.")
	public void the_user_should_be_presented_with_an_error_message() {
		arraypage.alerMsg();
	}

	@When("The user clicks Array Using List link.")
	public void the_user_clicks_array_using_list_link() {
		if(arraypage.clickOnArrayLink())
			LoggerLoad.info("Array Using List Link was clicked successfull");
		else
			LoggerLoad.error("Array using list Link not clicked");
	}

	@Then("It should redirect the user to {string}")
	public void it_should_redirect_the_user_to(String arlist) {
		String s = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), arlist);
	}

	@When("The user clicks Basic Operations in List link.")
	public void the_user_clicks_basic_operations_in_list_link() {
		if(arraypage.clickOnBasicOperations())
			LoggerLoad.info("Basic Operations in List Link clicked successfull");
		else
			LoggerLoad.error("Basic Operations in List Link not clicked");
	}

	@When("The user clicks Applications of Array page link.")
	public void the_user_clicks_applications_of_array_page_link() {
		if(arraypage.clickonAppArrayLink())
			LoggerLoad.info("Applications of Array page Link clicked successfull");
		else
			LoggerLoad.error("Applications of Array page Link not clicked");
	}

	@When("The user clicks Applications of Practice questions link.")
	public void the_user_clicks_applications_of_practice_questions_link() {
		if(arraypage.clickOnPraticeQuestions())
			LoggerLoad.info("Applications of Practice questions Link clicked successfull");
		else
			LoggerLoad.error("Applications of Practice questions Link not clicked");
		
	}
	@Then("It should redirect the user to Practice Questions")
	public void it_should_redirect_the_user_to_practice_questions() {
		String s = driver.getTitle();
		Assert.assertEquals(driver.getTitle(), prQu);
	}


	@When("The user clicks Search the Array link.")
	public void the_user_clicks_search_the_array_link() throws InterruptedException {
		if(arraypage.clickOnSearchArrayLink())
			LoggerLoad.info("Search the Array Link clicked successfull");
		else
			LoggerLoad.error("Search the Array Link not clicked");
		arraypage.clearEditor();
	}

	@Then("It It should redirect the user to search the Array try editor page.")
	public void it_it_should_redirect_the_user_to_search_the_array_try_editor_page() {
		Assert.assertEquals(driver.getTitle(), assess);

	}

	@When("The user enter valid python code for practice questions in tryEditor from sheet {string} and {int}")
	public void the_user_enter_valid_python_code_for_practice_questions_in_try_editor_from_sheet_and(String SheetName,
			Integer RowNumber) throws org.apache.commons.compress.archivers.dump.InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> tstdata = reader.getData(Excelpath, SheetName);
		code = tstdata.get(RowNumber).get("arraycode");
		rslt = tstdata.get(RowNumber).get("Result");
		arraypage.codeEditor(code);
	}

	/*
	 * @When("clicks on the run button") public void clicks_on_the_run_button() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */

	@Then("The user navigates back to the Practice questions page")
	public void the_user_navigates_back_to_the_practice_questions_page() throws InterruptedException {
		arraypage.navigateBack();
//		arraypage.clearEditor();
	}

	@And("The user clicks on submit button")
	public void the_user_clicks_on_submit_button() {
		if(arraypage.clickOnSubmitButton())
			LoggerLoad.info("submit button clicked successfull");
		else
			LoggerLoad.error("submit button not clicked");
	}

	@When("The user clicks Max Consecutive Ones.")
	public void the_user_clicks_max_consecutive_ones() throws InterruptedException {
		if(arraypage.clickOnMaxConsecutiveNum())
			LoggerLoad.info("Max Consecutive Ones link clicked successfull");
		else
			LoggerLoad.error("Max Consecutive Ones link not clicked");
		arraypage.clearEditor();
	}

	@When("The user clicks Find Numbers with Even Number of Digits link.")
	public void the_user_clicks_find_numbers_with_even_number_of_digits_link() throws InterruptedException {
		if(arraypage.clickOnFindNumbers())
			LoggerLoad.info("Find Numbers with Even Number of Digits Link clicked successfull");
		else
			LoggerLoad.error("Find Numbers with Even Number of Digits Link not clicked");
		arraypage.clearEditor();
	}

	@When("The user clicks Squares of a Sorted Array link.")
	public void the_user_clicks_squares_of_a_sorted_array_link() throws InterruptedException {
		if(arraypage.clickOnSquares())
			LoggerLoad.info("Squares of a Sorted Array Link clicked successfull");
		else
			LoggerLoad.error("Squares of a Sorted Array Link not clicked");
		arraypage.clearEditor();
	}

}
