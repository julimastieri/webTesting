package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BrandPage extends GSMArenaAbstractPage{
	
	private WebElement productLink;

	public BrandPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	private void findProductLink(String product) {
		productLink = findByXpath("//span[contains(text(), '%s')]", product);
	}
	
	public ProductPage clickProduct(String product) {
		findProductLink(product);
		productLink.click();
		return new ProductPage(driver);
	}
	
	
}
