package com.webTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.webTesting.gui.pages.HelpCenterPage;
import com.solvd.webTesting.gui.pages.HomePage;
import com.solvd.webTesting.gui.pages.InternationaIPage;
import com.solvd.webTesting.gui.pages.PaymentPage;
import com.solvd.webTesting.gui.pages.ReturnsPage;
import com.solvd.webTesting.gui.pages.StoreInfoPage;

public class HelpCenterTest extends AbstractTest {

	@Test(description = "Go to store info page")
	@MethodOwner(owner = "jmastieri")
	public void goToStoreInfo() {
		HomePage hp = new HomePage(this.getDriver());
		hp.open();
		HelpCenterPage hcp = hp.clickOnHelp();
		StoreInfoPage sip = hcp.clickOnStoreInfo();
		Assert.assertEquals(sip.getPageTitle(), "Store Info");
	}

	@Test(description = "Go to international ships info page")
	@MethodOwner(owner = "jmastieri")
	public void goToInternationalPage() {
		HomePage hp = new HomePage(this.getDriver());
		hp.open();
		HelpCenterPage hcp = hp.clickOnHelp();
		InternationaIPage ip = hcp.clickOnInternationalInfo();
		Assert.assertEquals(ip.getPageTitle(), "International");
	}

	@Test(description = "Go to returns product page")
	@MethodOwner(owner = "jmastieri")
	public void goToReturnsPage() {
		HomePage hp = new HomePage(this.getDriver());
		hp.open();
		HelpCenterPage hcp = hp.clickOnHelp();
		ReturnsPage rp = hcp.clickOnReturn();
		Assert.assertEquals(rp.getPageTitle(), "Returns & Exchanges");
	}

	@Test(description = "Go to payment page")
	@MethodOwner(owner = "jmastieri")
	public void goToPaymentPage() {
		HomePage hp = new HomePage(this.getDriver());
		hp.open();
		HelpCenterPage hcp = hp.clickOnHelp();
		PaymentPage pp = hcp.clickOnPayment();
		Assert.assertEquals(pp.getPageTitle(), "Payments");
	}

}
