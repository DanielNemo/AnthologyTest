package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class ContentPage extends BasePage {
	
	public WebDriver driver;

	By addBtn = By.id("add-content-menu-button-start-_11_1");
	By create = By.xpath("//div[@role='presentation']//ul[@role='menu']/li[1]//span[.='Create']");
	By test = By.linkText("Test");
	
	
	public ContentPage() throws IOException{
		super();
	}
	

	public WebElement getAddBtn() throws IOException{
		this.driver = getDriver();
		return driver.findElement(addBtn);
	}
	public WebElement getCreate() throws IOException{
		this.driver = getDriver();
		return driver.findElement(create);
	}
	public WebElement getTest() throws IOException{
		this.driver = getDriver();
		return driver.findElement(test);
	}


}
