package com.webTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.solvd.webTesting.gui.pages.ExploraPage;
import com.solvd.webTesting.gui.pages.PostPage;
import com.solvd.webTesting.gui.pages.VideoPage;
import com.webTesting.services.ExploraServices;

public class ExploraTest extends AbstractTest implements ExploraServices {
	
	@Test(description = "Go to the first post")
	@MethodOwner(owner = "jmastieri")
	public void goToFirstPost() {
		ExploraPage ep = goToExploraPage(this.getDriver());
		PostPage pp = ep.clickOnFirstPost();
		Assert.assertEquals(pp.getPageTitle(), "10 Things to Do First with Your New Camera");
	}
	
	@Test(description = "Go to Explora video search section")
	@MethodOwner(owner = "jmastieri")
	public void goToVideoSection() {
		ExploraPage ep = goToExploraPage(this.getDriver());
		VideoPage vp = ep.clickOnVideoTab();
		Assert.assertEquals(vp.getPageTitle(), "Welcome to the B&H Online Video Center");
	}
}
