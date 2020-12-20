package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PosterdSuccessfullyPage extends GSMArenaAbstractPage{
	
	@FindBy(xpath = "//div[contains(@class, 'normal-text res-warning')]//h3")
	private WebElement messageTitle;
	
	public PosterdSuccessfullyPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public String getMessageTitle(){
		return messageTitle.getText();
	}

}
