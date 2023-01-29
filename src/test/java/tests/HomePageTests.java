package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.cashdry.pages.BasePage;
import com.cashdry.pages.HomePage;

public class HomePageTests extends BasePage {

	@Test(priority = 0)
	public void verifyTitle() {
		HomePage homePage = new HomePage(driver);
		try {
			Assert.assertEquals(homePage.getTitle(), "CashDry");
		} catch (Exception e) {
			System.out.println("failed" + e);
		}
	}
}
