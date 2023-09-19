package com.dsalgoportal.stepdefintion;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.dsalgoportal.pages.HomePage;
import com.dsalgoportal.pages.TreePage;
import com.dsalgoportal.utils.ConfigReader;
import com.dsalgoportal.utils.DriverFactory;
import com.dsalgoportal.utils.LoggerLoad;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStep {
	
	public WebDriver driver = DriverFactory.getdriver();
	String Excelpath = ConfigReader.getexcelfilepath();
	String url = ConfigReader.getHomePageUrl();
	public HomePage homepage = new HomePage(driver);
	public TreePage treepage = new TreePage(driver);
	String title = "Overview of Trees";
	String title1 = "Terminologies";
	String title2 = "Types of Trees";
	String title3 = "Tree Traversals";
	String title4 = "Traversals-Illustration";
	String title5 = "Binary Trees";
	String title6 = "Types of Binary Trees";
	String title7 = "Implementation in Python";
	String title8 = "Binary Tree Traversals";
	String title9 = "Implementation of Binary Trees";
	String title10 = "Applications of Binary trees";
	String title11 = "Binary Search Trees";
	String title12 = "Implementation Of BST";
	String title13 = "Practice Questions";
	
	@Given("The user is on the Tree page after logged in")
	public void the_user_is_on_the_tree_page_after_logged_in() {
		driver.get(url);
		homepage.clickTree_GetStartBtn();
		LoggerLoad.info("User clicks on GetStarted Button of Tree");
		}
	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		
	    treepage.clickOnOverviewOfTreesLink();
	    LoggerLoad.info("User clicks on Overview of Trees Link");
	}
	@Then("The user should then be directed to Overview of Trees Page")
	public void the_user_should_then_be_directed_to_overview_of_trees_page() {
	   Assert.assertEquals(driver.getTitle(), title);
	   LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	
	@When("The user clicks Try Here button in Overview of Trees Page")
	public void the_user_clicks_try_here_button_in_overview_of_trees_page() {
	    treepage.clickTryHereBtn();
	    LoggerLoad.info("User clicks on TryHere Button");
	}

	@Given("The user is in tree page having an tryEditor with a Run button to test")
	public void the_user_is_in_tree_page_having_an_try_editor_with_a_run_button_to_test() {
		 driver.navigate().back();
		 treepage.clickTryHereBtn();
		 LoggerLoad.info("User clicks on TryHere Button");
	}
	
	@When("The user clicks on the Terminologies button")
	public void the_user_clicks_on_the_terminologies_button() {
		driver.navigate().back();
		treepage.clickOnTerminologiesLink();
		LoggerLoad.info("User clicks on Terminologies Link");
		
	}
	@Then("The user should then be directed to Terminologies Page")
	public void the_user_should_then_be_directed_to_terminologies_page() {
		Assert.assertEquals(driver.getTitle(), title1);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Terminologies page")
	public void the_user_clicks_try_here_button_in_terminologies_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	
	@When("The user clicks on the Types of Trees button")
	public void the_user_clicks_on_the_types_of_trees_button() {
		driver.navigate().back();
		treepage.clickOnTypesOfTreesLink();
		LoggerLoad.info("User clicks on Types of Trees Link");
	}
	@Then("The user should then be directed to Types of Trees Page")
	public void the_user_should_then_be_directed_to_types_of_trees_page() {
		Assert.assertEquals(driver.getTitle(), title2);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Types of Trees page")
	public void the_user_clicks_try_here_button_in_types_of_trees_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Tree Traversals button")
	public void the_user_clicks_on_the_tree_traversals_button() {
		driver.navigate().back();
		treepage.clickOnTreeTraversalsLink();
		LoggerLoad.info("User clicks on Tree Traversals Link");
	}
	@Then("The user should then be directed to Tree Traversals Page")
	public void the_user_should_then_be_directed_to_tree_traversals_page() {
		Assert.assertEquals(driver.getTitle(), title3);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Tree Traversals page")
	public void the_user_clicks_try_here_button_in_tree_traversals_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
		
	}
	@When("The user clicks on the Traversals-Illustration button")
	public void the_user_clicks_on_the_traversals_illustration_button() {
		driver.navigate().back();
		treepage.clickOnTraversalsIllustrationLink();
		LoggerLoad.info("User clicks on Traversals-Illustration Link");
	}
	@Then("The user should then be directed to Traversals-Illustration Page")
	public void the_user_should_then_be_directed_to_traversals_illustration_page() {
		Assert.assertEquals(driver.getTitle(), title4);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Traversals-Illustration page")
	public void the_user_clicks_try_here_button_in_traversals_illustration_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Binary Trees button")
	public void the_user_clicks_on_the_binary_trees_button() {
		driver.navigate().back();
		treepage.clickOnBinaryTreesLink();
		LoggerLoad.info("User clicks on Binary Trees Link");
	}
	@Then("The user should then be directed to Binary Trees Page")
	public void the_user_should_then_be_directed_to_binary_trees_page() {
		Assert.assertEquals(driver.getTitle(), title5);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Binary Trees page")
	public void the_user_clicks_try_here_button_in_binary_trees_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Types of Binary Trees button")
	public void the_user_clicks_on_the_types_of_binary_trees_button() {
		driver.navigate().back();
		treepage.clickOnTypesOfBinaryTreesLink();
		LoggerLoad.info("User clicks on Types of Binary Trees Link");
	}
	@Then("The user should then be directed to Types of Binary Trees Page")
	public void the_user_should_then_be_directed_to_types_of_binary_trees_page() {
		Assert.assertEquals(driver.getTitle(), title6);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Types of Binary Trees page")
	public void the_user_clicks_try_here_button_in_types_of_binary_trees_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Implementation in Python button")
	public void the_user_clicks_on_the_implementation_in_python_button() {
		driver.navigate().back();
		treepage.clickOnImplementationInPythonLink();
		LoggerLoad.info("User clicks on Implementation in Python Link");
	}
	@Then("The user should then be directed to Implementation in Python Page")
	public void the_user_should_then_be_directed_to_implementation_in_python_page() {
		Assert.assertEquals(driver.getTitle(), title7);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Implementation in Python page")
	public void the_user_clicks_try_here_button_in_implementation_in_python_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Binary Tree Traversals button")
	public void the_user_clicks_on_the_binary_tree_traversals_button() {
		driver.navigate().back();
		treepage.clickOnBinaryTreeTraversalsLink();
		LoggerLoad.info("User clicks on Binary Tree Traversals Link");
	}
	@Then("The user should then be directed to Binary Tree Traversals Page")
	public void the_user_should_then_be_directed_to_binary_tree_traversals_page() {
		Assert.assertEquals(driver.getTitle(), title8);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Binary Tree Traversals page")
	public void the_user_clicks_try_here_button_in_binary_tree_traversals_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Implementation of Binary Trees button")
	public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
		driver.navigate().back();
		treepage.clickOnImplementationOfBinaryTreesLink();
		LoggerLoad.info("User clicks on Implementation of Binary Trees Link");
	}
	@Then("The user should then be directed to Implementation of Binary Trees Page")
	public void the_user_should_then_be_directed_to_implementation_of_binary_trees_page() {
		Assert.assertEquals(driver.getTitle(), title9);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Implementation of Binary Trees page")
	public void the_user_clicks_try_here_button_in_implementation_of_binary_trees_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Applications of Binary trees button")
	public void the_user_clicks_on_the_applications_of_binary_trees_button() {
		driver.navigate().back();
		treepage.clickOnApplicationsOfBinaryTreesLink();
		LoggerLoad.info("User clicks on Applications of Binary trees Link");
	}
	@Then("The user should then be directed to Applications of Binary trees Page")
	public void the_user_should_then_be_directed_to_applications_of_binary_trees_page() {
		Assert.assertEquals(driver.getTitle(), title10);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Applications of Binary trees page")
	public void the_user_clicks_try_here_button_in_applications_of_binary_trees_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Applications of Binary Search Trees button")
	public void the_user_clicks_on_the_applications_of_binary_search_trees_button() {
		driver.navigate().back();
		treepage.clickOnBinarySearchTreesLink();
		LoggerLoad.info("User clicks on Applications of Binary Search Trees Link");
	}
	@Then("The user should then be directed to Binary Search Trees Page")
	public void the_user_should_then_be_directed_to_binary_search_trees_page() {
		Assert.assertEquals(driver.getTitle(), title11);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Binary Search Trees page")
	public void the_user_clicks_try_here_button_in_binary_search_trees_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Applications of Implementation Of BST button")
	public void the_user_clicks_on_the_applications_of_implementation_of_bst_button() {
		driver.navigate().back();
		treepage.clickOnImplementationOfBSTLink();
		LoggerLoad.info("User clicks on Applications of Implementation Of BST Link");
	}
	@Then("The user should then be directed to Implementation Of BST Page")
	public void the_user_should_then_be_directed_to_implementation_of_bst_page() {
		Assert.assertEquals(driver.getTitle(), title12);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}
	@When("The user clicks Try Here button in Implementation Of BST page")
	public void the_user_clicks_try_here_button_in_implementation_of_bst_page() {
		treepage.clickTryHereBtn();
		LoggerLoad.info("User clicks on TryHere Button");
	}
	@When("The user clicks on the Applications of Practice Questions button")
	public void the_user_clicks_on_the_applications_of_practice_questions_button() {
		driver.navigate().back();
		treepage.clickOnPracticeQuestionsLink();
		LoggerLoad.info("User clicks on Applications of Practice Questions Link");
	}
	@Then("The user should then be directed to Practice Questions Page")
	public void the_user_should_then_be_directed_to_practice_questions_page() {
		Assert.assertEquals(driver.getTitle(), title13);
		LoggerLoad.info("Title of the current page is : " + driver.getTitle());
	}

}
