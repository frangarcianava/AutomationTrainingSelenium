package test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class ProductPageTesting extends BaseTest{
	
	@Test(priority=1)
	public void addToCart() {
		assertTrue(pom.getProductPage().isAvailableToBuy(), "No se pudo comprar el producto");
	}

}
