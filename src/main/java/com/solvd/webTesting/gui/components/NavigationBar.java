package com.solvd.webTesting.gui.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.webTesting.gui.pages.ExploraPage;
import com.solvd.webTesting.gui.pages.HelpCenterPage;
import com.solvd.webTesting.gui.pages.SearchResultsPage;

public class NavigationBar extends AbstractUIObject {
    
    @FindBy(id = "top-search-input")
    private ExtendedWebElement SearchBox;
    
    @FindBy(id="js-ttlitm")
    private ExtendedWebElement cartCount;
    
    @FindBy(className = "exploraSvgWrap")
    private ExtendedWebElement exploraLink;
	
	@FindBy(name = "Header-Help Center")
	private ExtendedWebElement helpLink;
	
	public NavigationBar(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public SearchResultsPage search(String product) {
		SearchBox.type(product);
		SearchBox.sendKeys(Keys.ENTER);
		return new SearchResultsPage(driver);
	}
	
	public String getCartCount() {
		return cartCount.getText();
	}
	
	public HelpCenterPage clickOnHelp() {
		helpLink.click();
		return new HelpCenterPage(driver);
	}
	
	public ExploraPage clickOnExplora() {
		exploraLink.click();
		return new ExploraPage(driver);
	}
}
