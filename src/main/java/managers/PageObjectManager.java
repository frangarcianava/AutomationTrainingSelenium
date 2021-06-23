package managers;

import org.openqa.selenium.WebDriver;
import pageObject.BasePage;
import pageObject.MainPage;
import pageObject.ProductPage;
import pageObject.ResultsPage;

public class PageObjectManager {

	private WebDriver driver;
	private MainPage mainPage;
	private ResultsPage resultsPage;
	private ProductPage productPage;
	private BasePage basePage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public BasePage getBasePage() {
		return (basePage == null) ? basePage = new BasePage(driver) : basePage;
	}
	
	public MainPage getMainPage() {
		return (mainPage == null) ? mainPage = new MainPage(driver) : mainPage;
	}
	
	public ResultsPage getResultsPage() {
		return (resultsPage == null) ? resultsPage = new ResultsPage(driver) : resultsPage;
	}
	
	public ProductPage getProductPage() {
		return (productPage == null) ? productPage = new ProductPage(driver) : productPage;
	}

}
