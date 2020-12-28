package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends BHAbstractPage{

	@FindBy(css = "h1[class*='page-title']")
    private WebElement pageTitle;
	
	public PaymentPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return pageTitle.getText();
	}


}
