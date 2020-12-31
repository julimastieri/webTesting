package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solvd.webTesting.gui.components.NavigationBar;

public class CartPage extends BHAbstractPage{
	
	private final static String PRODUCT_XPATH = "//a[contains(text(), '%s')]";
	
	@FindBy(id = "header")
    private NavigationBar navBar;
	
	@FindBy(id = "loginCart")
	private WebElement beginCheckoutButton;
	
	@FindBy(xpath = "//button[@data-selenium='guestCheckoutBtn']")
	private WebElement checkOutAsAGuestButton;
	
	public CartPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public NavigationBar getNavBar() {
		return navBar;
	}

	private WebElement findProductLink(String product) {
		return findByXpath(PRODUCT_XPATH, product);
	}
	
	public String getProductName(String productName) {
		WebElement productLink =  findProductLink(productName);
		return productLink.getText();
	}
	
	public String getTotalItemsInCart() {
		return navBar.getCartCount();
	}
	
	public FirstStepCheckout goToCheckout() {
		beginCheckoutButton.click();
		checkOutAsAGuestButton.click();
		return new FirstStepCheckout(driver);
	}

}
