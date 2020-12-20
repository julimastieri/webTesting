package com.solvd.webTesting.gui.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.solvd.webTesting.gui.pages.NewsPage;

public class FooterMenu extends AbstractUIObject {
    
    @FindBy(linkText = "News")
    private WebElement newsLink;

    public FooterMenu(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
        PageFactory.initElements(driver, this);
    }
    
    public NewsPage openNewsPage() {
        newsLink.click();
        return new NewsPage(driver);
    }
}