package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class CreatingTest extends BasePage{
	
	public WebDriver driver;

	//By editField = By.cssSelector("[ng-show] [ng-click='panelHeader\\.onEditMode\\(\\)']:nth-of-type(2)r");
	By addQuestion = By.xpath("/html//section[@id='gradebook-item-panel-content']/div[@class='panel-content-inner submission-list-details']/div[@class='content-base tests']/form[@name='assessmentContentForm']/div[@class='panel-content-flex']/div[@class='panel-content-full panel-content-separator']//button[@type='button']");
	By trueFalseQuestion = By.xpath("//div[@id='assessment-canvas-add-content-menu']//ul[@role='menu']/li[9]//span[.='Add True/False question']");
	By typeQuestion = By.cssSelector("div[role='textbox'] > p"); 
	By checkBox = By.id("assessments-questions-truefalse-false");
	//By feedSwitch = By.cssSelector(".MuiSwitchroot-0-2-776.automated-question-feedback-edit__toggleSwitch.makeStylestoggleSwitch-0-2-917 > .MuiButtonBaseroot-0-2-745.MuiIconButtonroot-0-2-736.MuiSwitchcolorSecondary-0-2-781");
	By saveBtn = By.xpath("/html//section[@id='gradebook-item-panel-content']/div[@class='panel-content-inner submission-list-details']/div[@class='content-base tests']/form[@name='assessmentContentForm']/div[@class='panel-content-flex']/div[@class='panel-content-full panel-content-separator']/div[@class='assessment-wrapper']/div[@class='react-container']//div[@class='module-section']//div[@class='question-container__buttons']/button[2]");
	
	public CreatingTest() throws IOException{
		super();
	}
	

	/*public WebElement getEditField() throws IOException{
		this.driver = getDriver();
		return driver.findElement(editField);
	}*/
	public WebElement getAddQuestion() throws IOException{
		this.driver = getDriver();
		return driver.findElement(addQuestion);
	}
	public WebElement getTrueFalseQuestion() throws IOException{
		this.driver = getDriver();
		return driver.findElement(trueFalseQuestion);
	}
	public WebElement getTypeQuestion() throws IOException{
		this.driver = getDriver();
		return driver.findElement(typeQuestion);
	}
	public WebElement getCheckBox() throws IOException{
		this.driver = getDriver();
		return driver.findElement(checkBox);
	}
	/*public WebElement getFeedSwitch() throws IOException{
		this.driver = getDriver();
		return driver.findElement(feedSwitch);
	}*/
	public WebElement getSaveBtn() throws IOException{
		this.driver = getDriver();
		return driver.findElement(saveBtn);
	}

}
