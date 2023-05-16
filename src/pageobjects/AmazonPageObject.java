package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="AmazonPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="AmazonConnection"
     )             
public class AmazonPageObject {

	@FindBy(xpath="//input[@id='ap_email']")
	public WebElement usernameField;
	
	@FindBy(xpath="//input[@id='continue']")
	public WebElement continueBtn;
	
	@FindBy(xpath="//input[@id='ap_password']")
	public WebElement passwordField;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	public WebElement loginBtn;
	
	@LinkType()
	@FindBy(xpath = "//div[@id='nav-signin-tooltip']/a[normalize-space(.)='Sign in']")
	public WebElement signIn;
	
	
	public void loginAmazon(String email, String passkeys) throws InterruptedException{
		
		usernameField.sendKeys(email);
		continueBtn.click();
		passwordField.sendKeys(passkeys);
		Thread.sleep(3);
		loginBtn.click();
	
	}


	@TextType()
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	public WebElement searchAmazonIn;
	
	public void selectProduct(String productName){
		searchAmazonIn.click();
		searchAmazonIn.sendKeys(productName);
	
	}

	
			
}
