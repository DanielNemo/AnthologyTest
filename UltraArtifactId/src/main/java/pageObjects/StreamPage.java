package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class StreamPage extends BasePage {
	
	public WebDriver driver;

	
	By streamLink = By.cssSelector("bb-base-navigation-button:nth-of-type(2) ng-switch  .link-text");
	By testName = By.linkText("test-daniel");

	
	public StreamPage() throws IOException{
		super();
	}
	
	public WebElement getSreamLink() throws IOException{
		this.driver = getDriver();
		return driver.findElement(streamLink);
	}
	
	public WebElement getTestName() throws IOException{
		this.driver = getDriver();
		return driver.findElement(testName);
	}


}
