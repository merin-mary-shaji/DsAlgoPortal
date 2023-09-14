package com.dsalgoportal.stepdefintion;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.LinkedlistPage;
import com.dsalgoportal.pages.SignInPage;
import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;
import com.dsalgoportal.utils.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LinkedlistStep {
	public WebDriver driver = DriverFactory.getdriver();
	public SignInPage signinpage = new SignInPage(driver);
	public HomePage homepage = new HomePage(driver);
	public LinkedlistPage Linkedlistpage = new LinkedlistPage(driver);
	String Excelpath = ConfigReader.getexcelfilepath();
	String url = ConfigReader.getHomePageUrl();
	String title = "NumpyNinja";
	String title1 = "Linked List";
	String title2 = "Introduction";
	String title3 = "Assessment";
	String title4 ="Creating Linked LIst";
	String title5 ="Types of Linked List";
	String title6 ="Implement Linked List in Python";
	String title7 = "Traversal";
	String title8 = "Insertion";
	String title9 = "Deletion";
	String title10 = "Practice Questions";
	String alertmsg ="NameError: name 'welcome' is not defined on line 1";
	String pythoncode;
	String result;
	
 

	@Given("The user is on the linkedlist page after logged in")
	public void the_user_is_on_the_linkedlist_page_after_logged_in() {
		driver.get(url);
		homepage.clicklinkedlist_GetStartBtn();
		Assert.assertEquals(driver.getTitle(), title1);
	}

	@When("The user clicks on the introduction link")
	public void the_user_clicks_on_the_introduction_link() {
		Linkedlistpage.clickIntroduction();
	}

	@Then("The user should then be directed to introduction page")
	public void the_user_should_then_be_directed_to_introduction_page() {
		Assert.assertEquals(driver.getTitle(), title2);
	}

	@When("The user clicks Try Here button in introduction of linkedlist page")
	public void the_user_clicks_try_here_button_in_introduction_of_linkedlist_page() {
		Linkedlistpage.clickTryherebtn();
	}
	@Then("The user should be redirected to a page having an Editor page with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_editor_page_with_a_run_button_to_test() {
		Assert.assertEquals(driver.getTitle(), title3);
	}
	@When("The user gets input from spread sheet {string} and {int}")
	public void the_user_gets_input_from_spread_sheet_and(String name, Integer Row) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath,name);
		 pythoncode = testdata.get(Row).get("pythonCode");
		 result = testdata.get(Row).get("Result");
		 //System.out.println(pythoncode);
		 }

	@When("The user clicks on Run button after Entering valid python code in introduction of linkedlist  tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_introduction_of_linkedlist_try_editor() {
		//System.out.println(pythoncode);
        Linkedlistpage.enterText(pythoncode);
       Linkedlistpage.clickrunbtn();
	}

	@Then("The user should be presented with Run output welcome to linkedlist page")
	public void the_user_should_be_presented_with_run_output_welcome_to_linkedlist_page() {
		String textoutput=Linkedlistpage.textoutput();
	    Assert.assertEquals(textoutput, result);
	}

	@Given("The user is in introduction of linkedlist  page having an tryEditor with a Run button to test")
	public void the_user_is_in_introduction_of_linkedlist_page_having_an_try_editor_with_a_run_button_to_test() {
		driver.navigate().back();
	    Linkedlistpage.clickTryherebtn();
	}

	@When("The user gets invalid input from spread sheet {string} and {int}")
	public void the_user_gets_invalid_input_from_spread_sheet_and(String name, Integer Row) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(Excelpath,name);
		 pythoncode = testdata.get(Row).get("pythonCode");
		 result = testdata.get(Row).get("Result");
	}

	@When("The user clicks on Run button after Entering invalid python code in introduction of linkedlist tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_introduction_of_linkedlist_try_editor() {
		//System.out.println(pythoncode);
		Linkedlistpage.enterText(pythoncode);
	    Linkedlistpage.clickrunbtn();
	}

	@Then("The user should expect the error message")
	public void the_user_should_expect_the_error_message() {
		String actualAlertmsg =Linkedlistpage.alertPopUp();
		 Assert.assertEquals(actualAlertmsg, alertmsg);

	}

	@When("The user clicks on the creating linkedlist button")
	public void the_user_clicks_on_the_creating_linkedlist_button() {
		driver.navigate().back();
		Linkedlistpage.clickCreatingLinkedLIst();
	}

	@Then("The user should then be directed to creating linkedlist Page")
	public void the_user_should_then_be_directed_to_creating_linkedlist_page() {
		Assert.assertEquals(driver.getTitle(), title4);
	}

	@When("The user clicks Try Here button in creatinglinkedlist page")
	public void the_user_clicks_try_here_button_in_creatinglinkedlist_page() {
		Linkedlistpage.clickTryherebtn();
	}

	@When("The user clicks on the types of linkedlist button")
	public void the_user_clicks_on_the_types_of_linkedlist_button() {
		driver.navigate().back();
		Linkedlistpage.clickTypesofLinkedList();
	}

	@Then("The user should be directed to types of linkedlist Page")
	public void the_user_should_be_directed_to_types_of_linkedlist_page() {
		Assert.assertEquals(driver.getTitle(), title5);
	}

	@When("The user clicks Try Here button in types of linkedlist page")
	public void the_user_clicks_try_here_button_in_types_of_linkedlist_page() {
		Linkedlistpage.clickTryherebtn();
	}

	@When("The user clicks on the implement linkedlist in python button")
	public void the_user_clicks_on_the_implement_linkedlist_in_python_button() {
		driver.navigate().back();
		Linkedlistpage.clickImplementLinkedListinPython();
	}

	@Then("The user should be directed to implement linkedlist in python Page")
	public void the_user_should_be_directed_to_implement_linkedlist_in_python_page() {
		Assert.assertEquals(driver.getTitle(), title6);
	}

	@When("The user clicks Try Here button in implement linkedlist in python  page")
	public void the_user_clicks_try_here_button_in_implement_linkedlist_in_python_page() {
		Linkedlistpage.clickTryherebtn();
	}

	@When("The user clicks on the linkedlist transversal button")
	public void the_user_clicks_on_the_linkedlist_transversal_button() {
		driver.navigate().back();
		Linkedlistpage.clickTraversal();
	}

	@Then("The user should be directed to linkedlist transversal Page")
	public void the_user_should_be_directed_to_linkedlist_transversal_page() {
		Assert.assertEquals(driver.getTitle(), title7);
	}

	@When("The user clicks Try Here button in linkedlist transversal page")
	public void the_user_clicks_try_here_button_in_linkedlist_transversal_page() {
		Linkedlistpage.clickTryherebtn();
	}

	@When("The user clicks on the linkedlist insertion button")
	public void the_user_clicks_on_the_linkedlist_insertion_button() {
		driver.navigate().back();
		Linkedlistpage.clickInsertion();
	}

	@Then("The user should be directed to linkedlist insertion Page")
	public void the_user_should_be_directed_to_linkedlist_insertion_page() {
		Assert.assertEquals(driver.getTitle(), title8);
	}

	@When("The user clicks Try Here button in linkedlist insertion page")
	public void the_user_clicks_try_here_button_in_linkedlist_insertion_page() {
		Linkedlistpage.clickTryherebtn();
	}

	@When("The user clicks on the linkedlist deletion button")
	public void the_user_clicks_on_the_linkedlist_deletion_button() {
		driver.navigate().back();
		Linkedlistpage.clickDeletion();
	}

	@Then("The user should be directed to linkedlist deletion Page")
	public void the_user_should_be_directed_to_linkedlist_deletion_page() {
		Assert.assertEquals(driver.getTitle(), title9);
	}

	@When("The user clicks Try Here button in linkedlist deletion page")
	public void the_user_clicks_try_here_button_in_linkedlist_deletion_page() {
		Linkedlistpage.clickTryherebtn();
	}

    @When("The user clicks on the Practice Questions button in linkedlist page")
  public void the_user_clicks_on_the_practice_questions_button_in_linkedlist_page() {
    	driver.navigate().back();
		Linkedlistpage.clickPracticeQuestions();
}

   @Then("The user should be redirected to Practice Questions page of linkedlist page")
   public void the_user_should_be_redirected_to_practice_questions_page_of_linkedlist_page() {
	   Assert.assertEquals(driver.getTitle(), title10);
}
}
