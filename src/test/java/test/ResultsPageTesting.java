package test;

import org.testng.annotations.Test;

public class ResultsPageTesting extends BaseTest {
	@Test(priority=1)
	public void clickItem() throws InterruptedException{
		pom.getResultsPage().clickOnSecondPage();
		pom.getResultsPage().clickOnThirdItem();
	}

}
