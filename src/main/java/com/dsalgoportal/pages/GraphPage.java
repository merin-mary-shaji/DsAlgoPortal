package com.dsalgoportal.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GraphPage extends BasePage  {

	public GraphPage (WebDriver driver) {
			super(driver);
			this.driver = driver;
			PageFactory.initElements(driver, this);
			}
	@FindBy (xpath = "//a[@href ='graph']")WebElement getStartGraphBtn;
	@FindBy (xpath = "//ul/a[text()='Graph']")WebElement GraphLink;
	@FindBy (xpath = "//li/a[text()='Graph Representations']") WebElement GraphRepresentations;
	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement GraphPracticeQuestions;
	@FindBy (xpath = "//a[@href ='/tryEditor']")WebElement tryherebtn;
	@FindBy (xpath = "//div[@class ='CodeMirror-scroll']")WebElement codeinput;
	@FindBy (xpath = "//button[@type ='button']")WebElement Runbtn;
	@FindBy (id = "output")WebElement msgoutput;
	
	
	
	public void clickgetStartGraphBtn() {
		getStartGraphBtn.click();
		}
	public void clickGraphLink() {
		 GraphLink.click();
		}
		public void clickGraphRepresentations() {
			GraphRepresentations.click();
			}
		public void clickGraphPracticeQuestions() {
			GraphPracticeQuestions.click();
		}
		public void clicktryherebtn() {
			tryherebtn.click();
	}
		public void clickcodeinput() {
			codeinput.click();
		}
		public void enterText(String code) {
			codeinput.click();
			WebElement focuselement = driver.switchTo().activeElement();
			focuselement.sendKeys(code);
			}
		public void clickRunbtn() {
			Runbtn.click();
		}
		 public String msgoutput() {
				return msgoutput.getText();
				}
		 public String alertPopUp() {
				String alertmsg = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				return alertmsg;
			
		}	
		}
	
	