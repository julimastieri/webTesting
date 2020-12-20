package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends GSMArenaAbstractPage{
	
	@FindBy(className = "specs-phone-name-title")
	private WebElement productTitle;
	
	public ProductPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getProductTitle() {
		return productTitle.getText();
	}

}
