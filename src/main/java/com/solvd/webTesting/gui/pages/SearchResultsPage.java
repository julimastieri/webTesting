package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BHAbstractPage {
	private final static String PRODUCT_XPATH = "//span[text()='%s']";
	
	@FindBy(xpath = "//strong")
	WebElement resultsTitle;

	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	private WebElement findProductLink(String product) {
		return findByXpath(PRODUCT_XPATH, product);
	}
	
	public String getProductTitle(String productName) {
		WebElement productLink = findProductLink(productName);
		return productLink.getText();
	}
	
	public ProductPage clickOnProduct(String productName) {
		WebElement productLink = findProductLink(productName);
		productLink.click();
		return new ProductPage(driver);
	}
	
	public String getResultsTitle() {
		return resultsTitle.getText();
	}
	
}
