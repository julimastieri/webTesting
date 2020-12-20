package com.webTesting;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.webTesting.gui.pages.BrandPage;
import com.solvd.webTesting.gui.pages.HomePage;
import com.solvd.webTesting.gui.pages.NewsDetailPage;
import com.solvd.webTesting.gui.pages.NewsPage;
import com.solvd.webTesting.gui.pages.PostCommentPage;
import com.solvd.webTesting.gui.pages.PosterdSuccessfullyPage;
import com.solvd.webTesting.gui.pages.ProductPage;
import com.solvd.webTesting.gui.pages.SearchResultsPage;
import com.webTesting.services.PhonePageServices;

public class SearchTest extends AbstractTest implements PhonePageServices {

	private HomePage hp;

	@BeforeMethod
	public void setHomePage() {
		hp = this.openHomePage(this.getDriver());
	}

	@Test(description = "Search product by search bar", dataProvider = "DataProvider")
	@MethodOwner(owner = "jmastieri")
	@XlsDataSourceParameters(path = "xls/products.xlsx", sheet = "SearchProducts", dsUid = "TUID", dsArgs = "product")
	public void testSearchProduct(String product) {
		SearchResultsPage srp = hp.searchProduct(product);
		Assert.assertEquals(srp.getSearchTitle(), "Search results for \"" + product + "\"");
	}

	@DataProvider(name = "brands")
	public Object[][] createBrands() {
		return new Object[][] { 
			{ "Xiaomi", "Mi Watch Lite", "Xiaomi Mi Watch Lite" },
				{ "Apple", "iPhone 12 Pro Max", "Apple iPhone 12 Pro Max" }, };
	}

	@Test(description = "Search product by brand section", dataProvider = "brands")
	@MethodOwner(owner = "jmastieri")
	public void testSearchByBrand(String brand, String product, String productTitle) {
		BrandPage bp = hp.selectBrand(brand);
		ProductPage pp = bp.clickProduct(product);
		Assert.assertEquals(pp.getProductTitle(), productTitle);
	}

	@Test(description = "Go to news section and check the title")
	@MethodOwner(owner = "jmastieri")
	public void testNewsTitle() {
		NewsPage np = this.openNewsPage(hp);
		Assert.assertEquals(np.getNewsTitle(), "News");
	}

	@Test(description = "Post a comment in a news")
	@MethodOwner(owner = "jmastieri")
	public void testPostComment() {
		NewsPage np = this.openNewsPage(hp);
		NewsDetailPage ndp = np.clickOnFirstNews();
		PostCommentPage pcp = ndp.clickPostCommentButton();
		PosterdSuccessfullyPage psp = pcp.postComment("Great News");
		Assert.assertEquals(psp.getMessageTitle(), "Your comment was saved to the DB.");

	}

}
