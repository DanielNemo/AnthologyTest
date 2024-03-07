package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class LoginPage extends BasePage {
	
	public WebDriver driver;

	
	By userName = By.cssSelector("input#user_id");
	By password = By.cssSelector("input#password");
	By signInBtn = By.cssSelector(".outline");
	By cookie = By.cssSelector("button#agree_button");

	
	public LoginPage() throws IOException{
		super();
	}
	
	public WebElement getUserName() throws IOException{
		this.driver = getDriver();
		return driver.findElement(userName);
	}
	public WebElement getPassword() throws IOException{
		this.driver = getDriver();
		return driver.findElement(password);
	}
	public WebElement getSignInBtn() throws IOException{
		this.driver = getDriver();
		return driver.findElement(signInBtn);
	}
	public WebElement getCookie() throws IOException{
		this.driver = getDriver();
		return driver.findElement(cookie);
	}

}
