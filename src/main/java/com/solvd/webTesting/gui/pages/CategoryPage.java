package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends BHAbstractPage{
	private final static String PRODUCT_XPATH = "//div/a//span[text()='%s']";

	public CategoryPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	private WebElement findProductLink(String product) {
		return findByXpath(PRODUCT_XPATH, product);
	}
	
	public SearchResultsPage clickOnSubcategory(String product) {
		WebElement productLink = findProductLink(product);
		productLink.click();
		return new SearchResultsPage(driver);
	}
	
	
}
