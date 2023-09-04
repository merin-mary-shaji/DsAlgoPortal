package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage extends BasePage {

	public WebDriver driver;

	public GetStartedPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "btn")
	WebElement getStartedBtn;

	public void clickGetStartBtn() {
		getStartedBtn.click();
	}
}
