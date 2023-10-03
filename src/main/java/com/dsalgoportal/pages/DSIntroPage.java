package com.dsalgoportal.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DSIntroPage extends BasePage{

	public DSIntroPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);	}

	By getStartedDSintro = By.xpath("//a[@href='data-structures-introduction']");
	By clkonTimeComplexity=By.xpath("//a[text()='Time Complexity']");
	By clkTryHere = By.xpath("/html/body/div[2]/div/div[2]/a");
	By clickonEntercode = By.xpath("//div[@class='CodeMirror-code']");
	By runBtn = By.xpath("//form[@id='answer_form']//button");
	By pythonOutPut = By.id("output");
	
	
	public boolean clickElement(By oLocator)
	{
		try
		{	
			driver.findElement(oLocator).click();
			return true;
		}
		catch (Exception e) 
		{
			System.out.println("Error description :"+e);
			return false;
		}		
	}
	
	public boolean clickOnGetStarted() {
		return clickElement(getStartedDSintro);
	}
	public boolean clickOnTimeCompexity() {
				return clickElement(clkonTimeComplexity);
	}
	public boolean clickOnTryHere() {
				return clickElement(clkTryHere);
	}
	
	public void codeEditor(String pythcode) {
		driver.findElement(clickonEntercode).click();
		WebElement focuselement = driver.switchTo().activeElement();
		focuselement.sendKeys(pythcode);
	}
	public boolean clickOnRunBtn() {
		return clickElement(runBtn);
	}
	public String alerMsg() {
    	String alertMessage = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return alertMessage;
    }
	public void codeOutput() {

		String s = driver.findElement(pythonOutPut).getText();
		//System.out.println(s);
	}
	public void navigateback()
	{ 
		driver.navigate().back();
		driver.getTitle();
		
	}
	public void clearEditor() 

	{ driver.findElement(clickonEntercode).clear();}
}
