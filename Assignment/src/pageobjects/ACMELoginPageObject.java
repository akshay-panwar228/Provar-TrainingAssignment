package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( connection="UITestingDemo"
     )             
public class ACMELoginPageObject {


	WebDriver driver;
	
	public ACMELoginPageObject(WebDriver driver){
		this.driver= driver;
		
	
	}
	
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement EnterUsername;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement EnterPassword;
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	public WebElement loginBtn;
	
	public void loginApplication(String username, String password){
		
		EnterUsername.sendKeys(username);
		EnterPassword.sendKeys(password);
		loginBtn.click();
		
	}
			
}
