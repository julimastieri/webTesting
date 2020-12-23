package com.webTesting;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.dataprovider.annotations.XlsDataSourceParameters;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.webTesting.gui.pages.CategoryPage;
import com.solvd.webTesting.gui.pages.FirstStepCheckout;
import com.solvd.webTesting.gui.pages.HomePage;
import com.solvd.webTesting.gui.pages.CartPage;
import com.solvd.webTesting.gui.pages.ProductPage;
import com.solvd.webTesting.gui.pages.SearchResultsPage;
import com.webTesting.services.ProductPageServices;

public class SearchTest extends AbstractTest implements ProductPageServices {

	@BeforeMethod
	public void setHomePage() {
	
	}

	@Test(description = "Search product by search bar", dataProvider = "DataProvider")
	@MethodOwner(owner = "jmastieri")
	@XlsDataSourceParameters(path = "xls/products.xlsx", sheet = "SearchProducts", dsUid = "TUID", dsArgs = "product")
	public void testSearchProduct(String product) {
		HomePage hp = new HomePage(this.getDriver());
		hp.open();
		SearchResultsPage sp = hp.searchProduct(product);
		Assert.assertEquals(sp.getResultsTitle(), "“"+product+"”");
	}

	@DataProvider(name = "categories")
	public Object[][] createBrands() {
		return new Object[][] { 
			{ "Photography", "Digital Cameras", "Canon EOS R5 Mirrorless Digital Camera (Body Only)" },
				{ "Mobile", "Unlocked Cell Phones", "OnePlus 7T 128GB Smartphone (Factory Unlocked, Frosted Silver)" }, 
			};
	}

	@Test(description = "Search product by category section", dataProvider = "categories")
	@MethodOwner(owner = "jmastieri")
	public void testSearchByCategory(String category, String subcat, String productTitle) {
		HomePage hp = new HomePage(this.getDriver());
		hp.open();
		CategoryPage cp = hp.selectCategory(category);
		SearchResultsPage sp = cp.clickOnSubcategory(subcat);
		Assert.assertEquals(sp.getProductTitle(productTitle), productTitle);
	}

	@Test(description = "Search a product and add to cart")
	@MethodOwner(owner = "jmastieri")
	public void testBuyAProduct() {
		ProductPage pp = openProductPage(this.getDriver(), "TV", "Samsung TU7000 43\" Class HDR 4K UHD Smart LED TV");
		Assert.assertEquals(pp.getAddToCartTitle(), "1 Item Added to Your Cart");
		CartPage cp = pp.clickOnViewCart();
		//Assert.assertEquals(cp.getTotalItemsInCart(), "1");
		FirstStepCheckout fsc =  cp.goToCheckout();
		Assert.assertEquals(fsc.getShippingAddressTitle(), "Shipping Address");
		
	}

	@Test(description = "Search a product and check the title")
	@MethodOwner(owner = "jmastieri")
	public void testProductTitle() {
		ProductPage pp = openProductPage(this.getDriver(), "TV", "Samsung TU7000 43\" Class HDR 4K UHD Smart LED TV");
		Assert.assertEquals(pp.getProductTitle(), "Samsung TU7000 43\" Class HDR 4K UHD Smart LED TV");
	}

}
