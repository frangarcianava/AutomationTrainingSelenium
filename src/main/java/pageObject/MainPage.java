package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage{
	
	@FindBy(id = "twotabsearchtextbox")
	private WebElement searchBoxInput;

	@FindBy(id = "nav-search-submit-button")
	private WebElement searchButton;
	
	public MainPage(WebDriver driver) {
		super(driver);
	}

	public void enterProduct(String product) {
		waitElementToBeVisible(searchBoxInput);
		sendKeysField(searchBoxInput, product);
	}
	
	public void clickSearch() {
		clickables(searchButton);
	}
	
}
