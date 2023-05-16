package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page(title = "ACMEBankingPage", summary = "", relativeUrl = "", connection = "UiTesting")
public class ACMEBankingPage {



	@PageRow()
	public static class BankTable {

		@TextType()
		@FindBy(xpath = "./td//span[@class='status-pill smaller green']/following-sibling::span")
		public WebElement Status;
		@TextType()
		@FindBy(xpath = "./td[3]//span")
		public WebElement Description;

	}

	@PageTable(row = BankTable.class, firstRowContainsHeaders = false)
	@FindBy(xpath = "//table[@class='table table-padded']/tbody//tr")
	public List<BankTable> BankTable;

}
