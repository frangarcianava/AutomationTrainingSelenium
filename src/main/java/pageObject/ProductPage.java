package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.codeborne.selenide.Selenide.$;

public class ProductPage extends BasePage{

	@FindBy(id = "add-to-cart-button")
	private WebElement addToCartButton;
	
	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean isAvailableToBuy() {
		return $(addToCartButton).isDisplayed();
	}
	
	

}
