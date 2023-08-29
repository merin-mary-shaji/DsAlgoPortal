package com.dsalgoportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}

	@FindBy(xpath = "//div[@role='alert']")
	WebElement logOutMsg;
	@FindBy(xpath = "//div[@role='alert']")
	WebElement logInMsg;
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[2]")
	WebElement registerLink;
	//@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	public WebElement signinLink;
	@FindBy(xpath="//h5[text()='Stack']/..//a")WebElement getStartedStackBtn;
	
	@FindBy(xpath="//a[@class='nav-link dropdown-toggle']")
	public WebElement dataStructureDropdown;
	// div[@class='alert alert-primary']
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	public WebElement errorMessage;
	
	public String logoutMsg() {
		return logOutMsg.getText();
	}

	public String logInMsg() {
		return logInMsg.getText();
	}

	public  void clickOnRegister() {
		registerLink.click();
		
	}

	public void clickOnSignIn() {
		signinLink.click();		
	}
	
	public void clickOnDataStructure() {
		dataStructureDropdown.click();
		
	}

	public String getErrorMessage() {
		return errorMessage.getText();
	}
	public void clickOnDSOption(String option) {
		Actions act = new Actions(driver);
		WebElement linkEle = driver.findElement(By.xpath("//a[contains(text(),'"+option+"')]"));
		act.moveToElement(linkEle).perform();
		linkEle.click();
	}

	public void clickOnGetStartedOfEachSection(String option) {
		Actions act = new Actions(driver);
		WebElement linkEle = driver.findElement(By.xpath("//a[@href='"+option+"']"));
		act.moveToElement(linkEle).perform();
		linkEle.click();
		
	}
	public void clickStack_GetStartBtn()
	{
		getStartedStackBtn.click();
	}
	
}
