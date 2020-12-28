package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpCenterPage extends BHAbstractPage {

	@FindBy(xpath = "//a[@data-selenium=\"storeInfo\"]")
	private WebElement storeInfo;
	
	@FindBy(xpath = "//a[@data-selenium=\"returnExchange\"]")
	private WebElement returnsLink;
	
	@FindBy(xpath = "//a[@data-selenium=\"payments\"]")
	private WebElement paymentLink;
	
	@FindBy(xpath = "//a[@data-selenium=\"international\"]")
	private WebElement internationalInfo;

	public HelpCenterPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public StoreInfoPage clickOnStoreInfo() {
		storeInfo.click();
		return new StoreInfoPage(driver);
	}
	
	public ReturnsPage clickOnReturn() {
		returnsLink.click();
		return new ReturnsPage(driver);
	}
	
	public PaymentPage clickOnPayment() {
		paymentLink.click();
		return new PaymentPage(driver);
	}
	
	public InternationaIPage clickOnInternationalInfo() {
		internationalInfo.click();
		return new InternationaIPage(driver);
	}

}
