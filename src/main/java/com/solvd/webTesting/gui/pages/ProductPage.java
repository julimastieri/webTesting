package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BHAbstractPage{
	
	@FindBy(xpath = "//h1")
	private WebElement productTitle;
	
	@FindBy(xpath = "//a[contains(@data-selenium, 'itemLayerViewCartBtn')]")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div[contains(@class,'cart')]/a[contains(@class,'viewCart')]")
	private WebElement viewCartButton;
	
	@FindBy(className = "header_3x3pcE85dy_6zMpObNhIbb")
	private WebElement itemAddedTitle;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getProductTitle() {
		return productTitle.getText();
	}
	
	public String getAddToCartTitle() {
		addToCartButton.click();
		return itemAddedTitle.getText();
	}
	
	public CartPage clickOnViewCart() {
		addToCartButton.click();
		viewCartButton.click();
		return new CartPage(driver);
	}

}
