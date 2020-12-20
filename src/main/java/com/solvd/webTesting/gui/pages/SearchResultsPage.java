package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends GSMArenaAbstractPage {
	
	@FindBy(className = "article-info-name")
	private WebElement searchTitle;

	public SearchResultsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getSearchTitle() {
		return searchTitle.getText();
	}
}
