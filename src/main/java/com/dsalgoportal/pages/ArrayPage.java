package com.dsalgoportal.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.module.FindException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayPage extends BasePage {

	public ArrayPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	By getStartedArray = By.xpath("//a[@href='array']");
	By dropdownselection = By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div");
	By selectArray = By.xpath("//*[@id='navbarCollapse']//a[contains(@href, '/array')]");
	By header = By.xpath("//div[2]/h4");
	By alertMessage = By.xpath("//div[@class='alert alert-primary']");
	By clickArrayPython = By.xpath("//a [@href=\"arrays-in-python\"]");
	By clkTryHere = By.xpath("/html/body/div[2]/div/div[2]/a");
	By enterPythonText = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By runBtn = By.xpath("//form[@id='answer_form']//button");
	By pythonOutPut = By.id("output");
	By clickonEntercode = By.xpath("//pre[@class=' CodeMirror-line ']");
	By clickOnArraysUsingList = By.xpath("//a[text()='Arrays Using List']");
	By clickOnBasicOperation = By.xpath("//a[text()='Basic Operations in Lists']");
	By clickOnApplicationsOfArray = By.xpath("//a[text()='Applications of Array']");
	By clickOnPracticeQuest = By.xpath("/html/body/div[2]/div/div[1]/div/a");
	By clickOnSearchArray = By.xpath("//div[@class='list-group'][1]/a");
	By clickOnMaxConsecutiveOne = By.xpath("//div[@class='list-group'][2]/a");
	By clickOnFindNum = By.xpath("//div[@class='list-group'][3]/a");
	By clickOnSquares = By.xpath("//div[@class='list-group'][4]/a");
	By clickOnSubmit = By.xpath("//input[@value='Submit']");
	By subMsg = By.xpath("(//pre[@id='output'])");

	public void clickOnGetStarted() {

		driver.findElement(getStartedArray).click();
	}

	public void clickOnArrayPython() {
		driver.findElement(clickArrayPython).click();

	}

	public void clickOnTryHere() {
		driver.findElement(clkTryHere).click();

	}

	
	public void clickOnRunButton() {
		driver.findElement(runBtn).click();
	}

	public void codeEditor(String pythoncode) {
		driver.findElement(clickonEntercode).click();

		/*
		 * WebElement element = driver.findElement(clickonEntercode); Actions actions =
		 * new Actions (driver); actions.moveToElement(element).click();
		 * element.sendKeys(pythoncode);
		 */

		WebElement focuselement = driver.switchTo().activeElement();
		focuselement.sendKeys(pythoncode);
		System.out.println("Test");
	}

	public void codeOutput() {

		String s = driver.findElement(pythonOutPut).getText();
		System.out.println(s);
	}

	public void runButtonEnabled() {
		driver.findElement(runBtn).click();

	}

	public void clearEditor() throws InterruptedException {
//		driver.findElement(clickonEntercode).clear();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.elementToBeClickable(clickonEntercode));
		 */

		try {
			driver.findElement(By.xpath("//span[text()='def']")).click();
			WebElement text = driver.findElement(clickonEntercode);
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("document.getElementById('editor').clear()");
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_A);
			Thread.sleep(500);
			robot.keyPress(KeyEvent.VK_DELETE);
			Thread.sleep(500);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(500);
			robot.keyRelease(KeyEvent.VK_A);
			Thread.sleep(500);
			robot.keyRelease(KeyEvent.VK_DELETE);
			Thread.sleep(500);
			System.out.println();
//			driver.findElement(By.xpath("//span[text()='search']")).clear();
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}
		System.out.println("imhere");
	}

	public String alerMsg() {
		String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertMessage;
	}

	public void navigateBack() {
		driver.navigate().back();
		driver.getTitle();
	}

	public void clickOnArrayLink() {
		driver.findElement(clickOnArraysUsingList).click();

	}

	public void clickOnPraticeQuestions() {

		driver.findElement(clickOnPracticeQuest).click();
		
//	 WebElement focuselement = driver.switchTo().activeElement();
//      focuselement.click();
	}

	public void clickOnSearch() {

		driver.findElement(clickOnSearchArray).click();
	}

	public void clickOnBasicOperations() {
		driver.findElement(clickOnBasicOperation).click();
	}

	public void clickonAppArrayLink() {
		driver.findElement(clickOnApplicationsOfArray).click();
	}

	public void clickOnSearchArrayLink() {
		driver.findElement(clickOnSearchArray).click();
	}

	public void submitbutton() {
		driver.findElement(clickOnSubmit).clear();

	}

	public void clickOnSubmitButton() {
		driver.findElement(clickOnSubmit).click();
		String s = driver.findElement(pythonOutPut).getText();
		System.out.println(s);
	}

	public void clickOnMaxConsecutiveNum() {
		driver.findElement(clickOnMaxConsecutiveOne).click();
	}

	public void clickOnFindNumbers() {
		driver.findElement(clickOnFindNum).click();

	}

	public void clickOnSquares() {
		driver.findElement(clickOnSquares).click();
	}
}
