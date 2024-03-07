package ultraautomationtesting;


import java.io.IOException;
import org.testng.annotations.Test;

import base.Hooks;
import pageObjects.ContentPage;
import pageObjects.CreatingTest;
import pageObjects.LoginPage;
import pageObjects.StreamPage;





public class CreateTest extends Hooks{
	
	
	public CreateTest () throws IOException{
		super();
	}
	
	@Test
	public void loginUltra() throws IOException, InterruptedException {
		
		
		LoginPage loginPage = new LoginPage();
		loginPage.getUserName().sendKeys("instructor");
		Thread.sleep(4000);
		loginPage.getCookie().click();
		Thread.sleep(4000);
		loginPage.getPassword().sendKeys("changeme");
		Thread.sleep(4000);
		loginPage.getSignInBtn().click();
		Thread.sleep(4000);
		
		StreamPage streamPage = new StreamPage();
		streamPage.getSreamLink().click();
		Thread.sleep(4000);
		streamPage.getTestName().click();
		Thread.sleep(4000);
		
		ContentPage contentPage = new ContentPage();
		Thread.sleep(3000);
		contentPage.getAddBtn().click();
		Thread.sleep(4000);
		contentPage.getCreate().click();
		Thread.sleep(4000);
		contentPage.getTest().click();
		Thread.sleep(4000);
		
		CreatingTest creatingTest = new CreatingTest();
		//creatingTest.getEditField().clear();
		//Thread.sleep(3000);
		creatingTest.getAddQuestion().click();
		Thread.sleep(5000);
		creatingTest.getTrueFalseQuestion().click();
		Thread.sleep(5000);
		creatingTest.getTypeQuestion().sendKeys("True/False");
		Thread.sleep(4000);
		creatingTest.getCheckBox().click();
		//Thread.sleep(3000);
		//creatingTest.getFeedSwitch().click();
		Thread.sleep(4000);
		creatingTest.getSaveBtn().click();

	}
	

}
