package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploraPage extends BHAbstractPage{
	
	@FindBy(id = "block-views-category-pages-block-1")
	private WebElement firstPost;
	
	@FindBy(id = "menu-6376-1")
	private WebElement videoTab;

	public ExploraPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public PostPage clickOnFirstPost() {
		firstPost.click();
		return new PostPage(driver);
	}
	
	public VideoPage clickOnVideoTab() {
		videoTab.click();
		return new VideoPage(driver);
	}
	
	
}
