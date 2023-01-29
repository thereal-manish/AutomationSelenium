package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cashdry.pages.BasePage;
import com.cashdry.pages.ManagerUpdatePage;

public class ManagerUpdatePageTest extends BasePage {

	@Test(priority = 0)
	public void getManagerPage() {
		ManagerUpdatePage manager = new ManagerUpdatePage(driver);
		manager.getManagerPanel();
		manager.verifyManagerTitle();
	}

	@Test(priority = 1)
	public void updateManagerEnterDetails() {
		SoftAssert sAssert = new SoftAssert();

		ManagerUpdatePage manager = new ManagerUpdatePage(driver);
		
		manager.clickUpdateManagerBtn();
		// hard assert
//		manager.verifyUpdateManagerPage();

		// softAssert

		sAssert.assertTrue(manager.verifyUpdateManagerPage());

		sAssert.assertAll();

	}

	@Test(priority = 2)
	@Parameters({ "updatedNameManager" })

	public void updateManagerSave(String newNameManager) {

		ManagerUpdatePage manager = new ManagerUpdatePage(driver);

		manager.updateExistingManager(newNameManager);
		// calling existing method to reduce no of lines of code
		manager.clickUpdateManagerSave();
	}

}
