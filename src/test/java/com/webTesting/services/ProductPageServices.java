package com.webTesting.services;

import org.openqa.selenium.WebDriver;

import com.solvd.webTesting.gui.pages.HomePage;
import com.solvd.webTesting.gui.pages.ProductPage;
import com.solvd.webTesting.gui.pages.SearchResultsPage;

public interface ProductPageServices {
	
	public default ProductPage openProductPage(WebDriver driver, String product, String productName) {
		HomePage hp = new HomePage(driver);
		hp.open();
		SearchResultsPage sp = hp.searchProduct(product);
		return sp.clickOnProduct(productName);
		
	}

}
