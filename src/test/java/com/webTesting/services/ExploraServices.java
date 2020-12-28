package com.webTesting.services;

import org.openqa.selenium.WebDriver;

import com.solvd.webTesting.gui.pages.ExploraPage;
import com.solvd.webTesting.gui.pages.HomePage;

public interface ExploraServices {
	
	public default ExploraPage goToExploraPage(WebDriver driver) {
		HomePage hp = new HomePage(driver);
		hp.open();
		ExploraPage ep = hp.goToExplora(); 
		return ep;
		
	}

}
