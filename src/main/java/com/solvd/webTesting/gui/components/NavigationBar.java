package com.solvd.webTesting.gui.components;

import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class NavigationBar extends AbstractUIObject {
    
    @FindBy(id = "top-search-input")
    private ExtendedWebElement SearchBox;
    
    @FindBy(id="js-ttlitm")
    private ExtendedWebElement cartCount;
	
	public NavigationBar(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public void search(String product) {
		SearchBox.type(product);
		SearchBox.sendKeys(Keys.ENTER);
	}
	
	public String getCartCount() {
		return cartCount.getText();
	}
}
