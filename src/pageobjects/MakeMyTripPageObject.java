package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MakeMyTripPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="UiTesting"
     )             
public class MakeMyTripPageObject {

	@LinkType()
	@FindBy(xpath = "//div/a[normalize-space(.)='Charter Flights']")
	public WebElement charterFlightsBtn;
	
	@LinkType()
	@FindBy(xpath = "//a[contains(text(),'Search')]")
	public WebElement searchBtn;
	
	@TextType()
	@FindBy(xpath = "//p[normalize-space(.)='Sorry, No Charters found for this search']")
	public WebElement ErrorMessage;
			
}
