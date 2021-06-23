package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import managers.FileReaderManager;

public class ResultsPage extends BasePage{

	@FindBy(css = ".a-color-state.a-text-bold")
	private WebElement productSearchedLabel;

	@FindBy(css = ".a-normal:nth-child(3)")
	private WebElement secondPage;

	@FindBy(css = "h2 > a > span")
	private List<WebElement> results;
	
	public ResultsPage(WebDriver driver) {
		super(driver);
	}

	public String getProductSearched() {
		waitElementToBeVisible(productSearchedLabel);
		return productSearchedLabel.getText();
	}

	public void clickOnSecondPage() {
		clickables(secondPage);
	}

	public void clickOnThirdItem() throws InterruptedException {
		waitAllElementsVisible(results);
		results.get(2).click();
	}
}
