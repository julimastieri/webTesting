package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsPage extends GSMArenaAbstractPage{
	
	@FindBy(className = "article-info-name")
	private WebElement newsTitle;
	
	@FindBy(xpath = "//*[@id=\"news\"]/div/div[1]")
	private WebElement firstNews;
	
	public NewsPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getNewsTitle() {
		return newsTitle.getText();
	}
	
	public NewsDetailPage clickOnFirstNews() {
		firstNews.click();
		return new NewsDetailPage(driver); 
	}
	
}
