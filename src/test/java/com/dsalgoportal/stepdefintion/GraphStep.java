package com.dsalgoportal.stepdefintion;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.SignInPage;
import com.dsalgoportal.pages.GraphPage;
import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;
import com.dsalgoportal.utils.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphStep{
	public WebDriver driver = DriverFactory.getdriver();
	public SignInPage signinpage = new SignInPage(driver);
	public HomePage homepage = new HomePage(driver);
	public GraphPage Graphpage = new GraphPage(driver);
	String Excelpath = ConfigReader.getexcelfilepath();
	String url = ConfigReader.signInPageUrl();
	String title = "NumpyNinja";
	String title1 = "Graph";
	String title2 = "Graph";
	String title3 = "Assessment";
	String title4 ="Graph Representations";
	String title5 ="Practice Questions";
	String alertmsg ="SyntaxError: bad input on line 1";
	String pythonCode;
	String Result;
	
	
	
	@Given("The user is on the Graph page after logged in")
	public void the_user_is_on_the_graph_page_after_logged_in() {
		homepage.clickgetStartGraphBtn();
		Assert.assertEquals(driver.getTitle(), title1);
	}

	@When("The user clicks on the Graph link on Graph page")
	public void the_user_clicks_on_the_graph_link_on_graph_page() {
		Graphpage.clickGraphLink();
	}

	@Then("The user should then be directed to Graph Graph page")
	public void the_user_should_then_be_directed_to_graph_graph_page() {
		Assert.assertEquals(driver.getTitle(), title2);
	}

	@When("The user clicks Tryhere button in Graph page")
	public void the_user_clicks_tryhere_button_in_graph_page() {
		Graphpage.clicktryherebtn();
	}

	@Then("The user should be redirected to a page having an tryEditor page  with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_page_with_a_run_button_to_test() {
		Assert.assertEquals(driver.getTitle(), title3);
	}

	@When("The user gets input from Excel sheet {string} and {int}")
	public void the_user_gets_input_from_excel_sheet_and(String Sheetname, Integer RowNumber)throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath,Sheetname);
		 pythonCode = testdata.get(RowNumber).get("pythonCode");
		 Result = testdata.get(RowNumber).get("Result");
		 System.out.println(pythonCode);
	}

	@When("The user clicks on Run button after Entering valid python code in Graph tryEditor page")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_graph_try_editor_page() {
		System.out.println(pythonCode);
	    Graphpage.enterText(pythonCode);
	   Graphpage.clickRunbtn();
	}

	@Then("The user should be presented with Run output welcome to Graph page")
	public void the_user_should_be_presented_with_run_output_welcome_to_graph_page() {
		String msgoutput=Graphpage.msgoutput();
	    Assert.assertEquals(msgoutput, Result);
	}

	@Given("The user is in Graph  page having an tryEditor page with a Run button to test")
	public void the_user_is_in_graph_page_having_an_try_editor_page_with_a_run_button_to_test() {
		driver.navigate().back();
	    Graphpage.clicktryherebtn();

	}

	@When("The user gets invalid input from Excel sheet {string} and {int}")
	public void the_user_gets_invalid_input_from_excel_sheet_and(String Sheetname, Integer RowNumber)throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath,Sheetname);
		 pythonCode = testdata.get(RowNumber).get("pythonCode");
		 Result = testdata.get(RowNumber).get("Result");

	}

	@When("The user clicks on Run button after Entering invalid python code in Graph tryEditor page")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_graph_try_editor_page() {
		System.out.println(pythonCode);
		Graphpage.enterText(pythonCode);
	    Graphpage.clickRunbtn();

	}

	@Then("The user should get the error message of Graph page")
	public void the_user_should_get_the_error_message_of_graph_page() {
		String actualAlertmsg =Graphpage.alertPopUp();
		 Assert.assertEquals(actualAlertmsg, alertmsg);
	}

	@When("The user clicks on the Graph Representation button")
	public void the_user_clicks_on_the_graph_representation_button() {
		driver.navigate().back();
		Graphpage.clickGraphRepresentations();
	}

	@Then("The user should then be directed to Graph Representation Page")
	public void the_user_should_then_be_directed_to_graph_representation_page() {
		Assert.assertEquals(driver.getTitle(), title4);
	}

	@When("The user clicks Tryhere button in Graph Representation page")
	public void the_user_clicks_tryhere_button_in_graph_representation_page() {
		Graphpage.clicktryherebtn();
	}

	@When("The user clicks on the Practice Questions button in Graph page")
	public void the_user_clicks_on_the_practice_questions_button_in_graph_page() {
		driver.navigate().back();
		Graphpage.clickGraphPracticeQuestions();
	}

	@Then("The user should be redirected to Practice Questions page of Graph page")
	public void the_user_should_be_redirected_to_practice_questions_page_of_graph_page() {
		 Assert.assertEquals(driver.getTitle(), title5);
		 }
	}
  