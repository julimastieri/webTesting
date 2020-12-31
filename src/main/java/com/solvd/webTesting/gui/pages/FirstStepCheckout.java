package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstStepCheckout extends BHAbstractPage{

	@FindBy(xpath = "//h2[@data-selenium=\"shippingHeader\"]")
	private WebElement shippingAddressTitle;
	
	public FirstStepCheckout(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getShippingAddressTitle() {
		return shippingAddressTitle.getText();
	}
}
