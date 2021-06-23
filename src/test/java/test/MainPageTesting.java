package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import managers.FileReaderManager;

public class MainPageTesting extends BaseTest {
	
	private String textToSearch = FileReaderManager.getInstance().getConfigReader().getData("productToSearch");
	
	@Test(priority=1)
	public void search() {
		pom.getMainPage().enterProduct(textToSearch);
		pom.getMainPage().clickSearch();
		assertEquals(pom.getResultsPage().getProductSearched(), '"'+textToSearch+'"');
	}

}
