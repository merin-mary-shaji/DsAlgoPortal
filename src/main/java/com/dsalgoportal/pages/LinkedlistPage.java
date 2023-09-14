package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LinkedlistPage extends BasePage {
	public LinkedlistPage (WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
@FindBy (linkText = "Get Started")WebElement getStarted;
@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropDown;
@FindBy(xpath = "//a[@href='/linked-list']")WebElement getstart_linkedlist;
@FindBy (linkText = "Introduction")WebElement Introduction;
@FindBy (xpath = "//a[text() = 'Creating Linked LIst']")WebElement CreatingLinkedLIst;
@FindBy (xpath = "//a[text() = 'Types of Linked List']")WebElement TypesofLinkedList;
@FindBy (xpath = "//a[text() = 'Implement Linked List in Python']")WebElement ImplementLinkedListinPython;
@FindBy (xpath = "//a[text() = 'Traversal']")WebElement Traversal;
@FindBy (xpath = "//a[text() = 'Insertion']")WebElement Insertion;
@FindBy (xpath = "//a[text() = 'Deletion']")WebElement Deletion;
@FindBy (xpath = "//a[@href='/linked-list/practice']")WebElement PracticeQuestions;
@FindBy (xpath = "//a[text() = 'Try here>>>']")WebElement Tryherebtn;
@FindBy (xpath = "//div[@class = 'CodeMirror-scroll']")WebElement textinput;
@FindBy (xpath = "//button [@type = 'button']")WebElement runbtn;
@FindBy (id = "output")WebElement textoutput;



 
public void clickgetStarted() {
	getStarted.click();
	}

public void clickdropDown() {
        dropDown.click();
}
public void clickdropdown_linkedlist() {
	getstart_linkedlist.click();
}

public void clickIntroduction() {
	Introduction.click();
	}
public void clickCreatingLinkedLIst() {
     CreatingLinkedLIst.click();
	}
public void clickTypesofLinkedList() {
	TypesofLinkedList.click();
}
public void clickImplementLinkedListinPython() {
	ImplementLinkedListinPython.click();
}
public void clickTraversal() {
	Traversal.click();
}
public void clickInsertion() {
	Insertion.click();
}
public void clickDeletion() {
	Deletion.click();
}
public void clickPracticeQuestions() {
	PracticeQuestions.click();
}
public void clickTryherebtn() {
	 Tryherebtn.click();
}
public void clicktextinput() {
	textinput.click();

}
public void enterText(String code) {
	textinput.click();
	WebElement focuselement = driver.switchTo().activeElement();
	focuselement.sendKeys(code);
	}

public void clickrunbtn() {
   runbtn.click();
}

public String  textoutput() {
		return textoutput.getText();
		}

public String alertPopUp() {
	String alertmsg = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	return alertmsg;

}	
}
