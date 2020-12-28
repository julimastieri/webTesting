package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.solvd.webTesting.gui.components.NavigationBar;

public class HomePage extends BHAbstractPage{
	private final static String CATEGORY_XPATH = "//div/a//span[text()='%s']";
	
	@FindBy(id = "header")
    private NavigationBar navBar;
	
	@FindBy(className = "exploraSvgWrap")
    private WebElement exploraLink;
	
	@FindBy(name = "Header-Help Center")
	private WebElement helpLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public NavigationBar getNavBar() {
		return navBar;
	}
	
	public SearchResultsPage searchProduct(String product) {
		navBar.search(product);
		return new SearchResultsPage(driver);
	}
	
	private WebElement findCategoryLink(String category) {
		return findByXpath(CATEGORY_XPATH, category);
	}
	
	public CategoryPage selectCategory(String category) {
		WebElement categoryLink = findCategoryLink(category);
		categoryLink.click();
		return new CategoryPage(driver);
	}
	
	public ExploraPage goToExplora() {
		exploraLink.click();
		return new ExploraPage(driver);
	}
	
	public HelpCenterPage clickOnHelp() {
		helpLink.click();
		return new HelpCenterPage(driver);
	}
	
}
