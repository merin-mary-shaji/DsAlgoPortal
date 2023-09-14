package com.dsalgoportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QueuePage extends BasePage {
	String expected, actual;

	public QueuePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	// a[contains(text(),'Time Complexity')]
		@FindBy(xpath = "//a[contains(text(),'Time Complexity')]")
		WebElement timeComplexicity;
		// Try here>>>
		@FindBy(partialLinkText = "Try here>>>")
		WebElement tryHere;

		
		// document.getElementsByClassName(" CodeMirror-line ")[0];
		// button[contains(text(),'Run')]
		@FindBy(xpath = "//button[contains(text(),'Run')]")
		WebElement run;
		//pre[@id='output']
		@FindBy(xpath = "//pre[@id='output']")
		WebElement output;
	
		public void clickOnTimeComplexity() {
			timeComplexicity.click();
		}

		

	public String getPageUrl() {
		actual=driver.getCurrentUrl();
		return actual;
	}

	
	public void clickonTopics(String topicLink) throws InterruptedException {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
			driver.findElement(By.xpath("//a[contains(text(),'"+topicLink+"')]")).click();	
			//System.out.println("clicked");
		
		}


	public void clickOnTryHere() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		tryHere.click();
		
	}

	public void enterText(String pythoncode) {
		WebElement focuselement = driver.switchTo().activeElement();
		focuselement.sendKeys(pythoncode);
		
	}

	public void clickonRun() {
		run.click();
		
	}

	public String clickTogetoutput() {
		String result=output.getText();
		return result;
	}

	

	
	
	
}
