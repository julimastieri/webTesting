package com.solvd.webTesting.gui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class GSMArenaAbstractPage extends AbstractPage{

	public GSMArenaAbstractPage(WebDriver driver){
		super(driver);
	}
	
	protected WebElement findByXpath(String xpath, String item){
		String xpathFormatted = String.format(xpath, item);
		return driver.findElement(By.xpath(xpathFormatted));
	}

}
