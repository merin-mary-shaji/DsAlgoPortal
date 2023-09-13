package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePage extends BasePage {
	public WebDriver driver;
	public TreePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[text()='Overview of Trees']")
	WebElement overviewOfTreesLink;
	@FindBy(xpath="//a[text()='Terminologies']")
	WebElement terminologiesLink;
	@FindBy(xpath="//a[text()='Types of Trees']")
	WebElement typesOfTreesLink;
	@FindBy(xpath="//a[text()='Tree Traversals']")
	WebElement treeTraversalsLink;
	@FindBy(xpath="//a[text()='Traversals-Illustration']")
	WebElement traversalsIllustrationLink;
	@FindBy(xpath="//a[text()='Binary Trees']")
	WebElement binaryTreesLink;
	@FindBy(xpath="//a[text()='Types of Binary Trees']")
	WebElement typesOfBinaryTreesLink;
	@FindBy(xpath="//a[text()='Implementation in Python']")
	WebElement implementationInPythonLink;
	@FindBy(xpath="//a[text()='Binary Tree Traversals']")
	WebElement binaryTreeTraversalsLink;
	@FindBy(xpath="//a[text()='Implementation of Binary Trees']")
	WebElement implementationOfBinaryTreesLink;
	@FindBy(xpath="//a[text()='Applications of Binary trees']")
	WebElement applicationsOfBinaryTreesLink;
	@FindBy(xpath="//a[text()='Binary Search Trees']")
	WebElement binarySearchTreesLink;
	@FindBy(xpath="//a[text()='Implementation Of BST']")
	WebElement implementationOfBSTLink;
	@FindBy(xpath="//a[text()='Practice Questions']")
	WebElement practiceQuestionsLink;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHereBtn;
	
	
	public void clickOnOverviewOfTreesLink()
	{
	
		overviewOfTreesLink.click();
	}
	public void clickOnTerminologiesLink()
	{
		terminologiesLink.click();
	}
	
	public void clickOnTreeTraversalsLink()
	{
		treeTraversalsLink.click();
	}
	
	public void clickOnTypesOfTreesLink()
	{
		 typesOfTreesLink.click();
	}
	
	public void  clickOnTraversalsIllustrationLink()
	{
		 traversalsIllustrationLink.click();
	}
	public void  clickOnBinaryTreesLink()
	{
		binaryTreesLink.click();
	}
	public void  clickOnTypesOfBinaryTreesLink()
	{
		typesOfBinaryTreesLink.click();
	}
	public void  clickOnImplementationInPythonLink()
	{
		implementationInPythonLink.click();
	}
	public void  clickOnBinaryTreeTraversalsLink()
	{
		binaryTreeTraversalsLink.click();
	}
	public void  clickOnImplementationOfBinaryTreesLink()
	{
		 implementationOfBinaryTreesLink.click();
	}
	public void  clickOnApplicationsOfBinaryTreesLink()
	{
		applicationsOfBinaryTreesLink.click();
	}
	public void  clickOnBinarySearchTreesLink()
	{
		binarySearchTreesLink.click();
	}
	public void  clickOnImplementationOfBSTLink()
	{
		implementationOfBSTLink.click();
	}
	public void  clickOnPracticeQuestionsLink()
	{
		practiceQuestionsLink.click();
	}
	
	public void clickTryHereBtn() {
		tryHereBtn.click();
	}

}
