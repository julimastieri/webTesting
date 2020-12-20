package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.solvd.webTesting.gui.components.FooterMenu;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solvd.webTesting.gui.components.NavigationBar;

public class HomePage extends GSMArenaAbstractPage{
	
	@FindBy(id = "top-bar clearfix")
    private NavigationBar navBar;
	
	@FindBy(id = "footmenu")
    private FooterMenu footerMenu;

    private WebElement brandLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public NavigationBar getNavBar() {
		return navBar;
	}
	
	public FooterMenu getFooterMenu() {
		return footerMenu;
	}
	
	public SearchResultsPage searchProduct(String product) {
		navBar.search(product);
		return new SearchResultsPage(driver);
	}
	
	private void findBrandLink(String brand) {
		brandLink = findByXpath("//div[contains(@class, 'brandmenu-v2')]//a[.='%s']", brand);
	}
	
	public BrandPage selectBrand(String brand) {
		findBrandLink(brand);
		brandLink.click();
		return new BrandPage(driver);
	}
	
}
