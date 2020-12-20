package com.webTesting.services;

import org.openqa.selenium.WebDriver;

import com.solvd.webTesting.gui.components.FooterMenu;
import com.solvd.webTesting.gui.pages.HomePage;
import com.solvd.webTesting.gui.pages.NewsPage;

public interface PhonePageServices {
	
	public default HomePage openHomePage(WebDriver driver) {
		HomePage hp = new HomePage(driver);
		hp.open();
		return hp;
	}
	
	public default NewsPage openNewsPage(HomePage hp) {
		FooterMenu fm = hp.getFooterMenu();
		return fm.openNewsPage();
	}

}
