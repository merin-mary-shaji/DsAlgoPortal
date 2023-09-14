package com.dsalgoportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DSIntroPage extends BasePage{

	public DSIntroPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	}

	By getStartedArray = By.xpath("//a[@href='data-structures-introduction']");
	By clkonTimeComplexity=By.xpath("//a[text()='Time Complexity']");
	By clkTryHere = By.xpath("/html/body/div[2]/div/div[2]/a");
	By clickonEntercode = By.xpath("//div[@class='CodeMirror-code']");
	By runBtn = By.xpath("//form[@id='answer_form']//button");
	By pythonOutPut = By.id("output");
	
	
	
	
	public void clickOnGetStarted() {
		driver.findElement(getStartedArray).click();
	}
	public void clickOnTimeCompexity() {
		driver.findElement(clkonTimeComplexity).click();
	}
	public void clickOnTryHere() {
		driver.findElement(clkTryHere).click();
	}
	
	public void codeEditor(String pythcode) {
		driver.findElement(clickonEntercode).click();
		WebElement focuselement = driver.switchTo().activeElement();
		focuselement.sendKeys(pythcode);
	}
	public void clickOnRunBtn() {
		driver.findElement(runBtn).click();
	}
	public String alerMsg() {
    	String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertMessage;
    }
	public void codeOutput() {

		String s = driver.findElement(pythonOutPut).getText();
		System.out.println(s);
	}
	public void navigateback()
	{ 
		driver.navigate().back();
		driver.getTitle();
		
	}
	public void clearEditor() 

	{ driver.findElement(clickonEntercode).clear();}
}

