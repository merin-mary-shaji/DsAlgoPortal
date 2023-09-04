package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class linkedlistpage  {

		public WebDriver driver;

		public linkedlistpage (WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
			@FindBy (linkText = "Get Started")WebElement getStarted;
			@FindBy (xpath = "//a[@href='data-structures-introduction']")WebElement getStartDataStructures;
			@FindBy(xpath = "//a[@href='linked-list']")WebElement getstart_linkedlist;
			@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropDown;
			@FindBy(xpath = "//a[@href='/linked-list']")WebElement dropdown_linkedlist;

	  
  }
     
	public void DataStructureDD() {
	
		
	}
}
