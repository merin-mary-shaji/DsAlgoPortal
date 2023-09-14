package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StackPage extends BasePage {
	public WebDriver driver;
	public StackPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Operations in Stack']")
	WebElement operationStackLink;
	@FindBy(xpath = "//a[text()='Implementation']")
	WebElement implementationLink;
	@FindBy(xpath = "//a[text()='Applications']")
	WebElement applicationsLink;
	@FindBy(xpath = "//a[text()='Practice Questions']")
	WebElement practiceQuestionsLink;
	@FindBy(xpath = "//a[text()='Try here>>>']")
	WebElement tryHereBtn;
    @FindBy(xpath = "//button[@onclick='runit()']")
	WebElement runBtn;
	@FindBy(id = "output")
	WebElement actualresult;

	public void clickOperationStackLink() {
		operationStackLink.click();
	}

	public void clickImplementationLink() {
		implementationLink.click();
	}

	public void clickApplicationsLink() {
		applicationsLink.click();

	}

	public void clickpracticeQuestionsLink() {
		practiceQuestionsLink.click();

	}

	public void clickTryHereBtn() {
		tryHereBtn.click();
	}

	public void enterText(String code) {

		WebElement focuselement = driver.switchTo().activeElement();
		focuselement.sendKeys(code);
	}

	public void clickRunBtn() {
		runBtn.click();
	}

	public String actualResult() {
		return actualresult.getText();
	}

	public String alertPopUp() {
		String alertmsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertmsg;
	}
}
