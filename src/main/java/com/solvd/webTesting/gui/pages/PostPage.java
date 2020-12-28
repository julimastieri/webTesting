package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostPage extends BHAbstractPage{
	
	@FindBy(id = "page-title")
	private WebElement pageTitle;

	public PostPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle(){
		return pageTitle.getText();
	}

}
