package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PostCommentPage extends GSMArenaAbstractPage{
	
	@FindBy(xpath = "//form[contains(@name, 'frmOpin')]//input[contains(@id, 'nick-submit')]")
	private WebElement submitButton;
	
	@FindBy(id="ucomment")
	private WebElement commentBox;
	
	public PostCommentPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public PosterdSuccessfullyPage postComment(String comment) {
		commentBox.sendKeys(comment);
		submitButton.click();
		return new PosterdSuccessfullyPage(driver);
		
	}

}
