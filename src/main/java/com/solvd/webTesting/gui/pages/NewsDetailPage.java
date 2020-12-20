package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsDetailPage extends GSMArenaAbstractPage {

	@FindBy(xpath = "//*[@id=\"body\"]/div/div[5]/div[1]/ul/li/a")
	private WebElement postCommentButton;

	public NewsDetailPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public PostCommentPage clickPostCommentButton() {
		postCommentButton.click();
		return new PostCommentPage(driver);
	}

}
