package com.solvd.webTesting.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class NavigationBar extends AbstractUIObject {
    
	@FindBy(className="go")
	private WebElement SearchButton;
    
    @FindBy(id = "topsearch-text")
    private WebElement SearchBox;
	
	public NavigationBar(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
		PageFactory.initElements(driver, this);
	}
	
	public void search(String product) {
		SearchBox.click();
		SearchBox.sendKeys(product);
		SearchButton.click();
	}
}
