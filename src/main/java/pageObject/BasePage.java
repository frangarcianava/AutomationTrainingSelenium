package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	private WebDriver driver;
	private WebDriverWait wait;
	
	public BasePage(WebDriver driver){
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,3);
        this.driver = driver;
    }

    protected WebDriver getDriver(){
        return  driver;
    }

    protected WebDriverWait getWait(){
        return wait;
    }

    protected void clickables(WebElement webElement){
        getWait().until(ExpectedConditions.elementToBeClickable(webElement));
        webElement.click();
    }

    protected void waitElementToBeVisible(WebElement webElement){
        getWait().until(ExpectedConditions.visibilityOf(webElement));
    }
    
    protected void waitAllElementsVisible(List<WebElement> list) {
    	getWait().until(ExpectedConditions.visibilityOfAllElements(list));
    }

    protected void sendKeysField(WebElement webElement, String field){
        waitElementToBeVisible(webElement);
        webElement.sendKeys(field);
    }

    public void dispose(){
        if(driver != null){
            driver.quit();
        }
    }
}
