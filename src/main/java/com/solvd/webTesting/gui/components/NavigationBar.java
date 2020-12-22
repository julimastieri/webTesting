package com.solvd.webTesting.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class NavigationBar extends AbstractUIObject {
    
	@FindBy(className="go")
	private ExtendedWebElement SearchButton;
    
    @FindBy(id = "topsearch-text")
    private ExtendedWebElement SearchBox;
	
	public NavigationBar(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
	}
	
	public void search(String product) {
		SearchBox.click();
		SearchBox.type(product);
		SearchButton.click();
	}
}
