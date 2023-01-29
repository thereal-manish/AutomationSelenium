package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cashdry.pages.BasePage;
import com.cashdry.pages.ManagerDeletePage;

public class ManagerDeletePageTest extends BasePage {

	@Test(priority = 0)
	public void getManagerPage() {
		ManagerDeletePage manager = new ManagerDeletePage(driver);

		manager.getManagerPanel();
		manager.verifyManagerTitle();

	}

	@Test(priority = 1)
	public void deleteManager() {
		ManagerDeletePage manager = new ManagerDeletePage(driver);

		try {
			manager.clickDeleteManagerBtn();
		} catch (Exception e) {
			Assert.fail();
		}
	}

}
