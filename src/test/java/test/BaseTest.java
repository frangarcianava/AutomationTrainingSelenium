package test;

import java.net.MalformedURLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import managers.MyDriver;
import managers.PageObjectManager;

public class BaseTest {

	protected static MyDriver myDriver;
	protected static PageObjectManager pom;
	
	
	@BeforeSuite(alwaysRun = true)
	public void beforeSuite() throws MalformedURLException {
		myDriver = new MyDriver();
		pom = new PageObjectManager(myDriver.getDriver());
	}
	
	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		myDriver.getDriver().quit();
	}
}