package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.cashdry.pages.BasePage;
import com.cashdry.pages.ManagerAddPage;

public class ManagerAddPageTest extends BasePage {

	@Test(priority = 0)
	public void getManagerPage() {
		ManagerAddPage manager = new ManagerAddPage(driver);
		manager.getManagerPanel();
		manager.verifyManagerTitle();
	}

	@Test(priority = 1)
	public void openAddManagerPage() {

		SoftAssert sAssert = new SoftAssert();

		ManagerAddPage manager = new ManagerAddPage(driver);

		manager.clickAddManagerButton();

		// hard assertion
//		manager.verifyAddManagerTitle();

		// soft Assertion
		sAssert.assertTrue(manager.verifyAddManagerTitle());
		
		sAssert.assertAll();
	}

	@Test(priority = 2)
	@Parameters({ "managerId", "managerName", "managerEmail", "managerAddress", "managerNumber", "managerPassword" })
	public void enterDetails(String id, String name, String email, String address, String number, String password) {

		ManagerAddPage manager = new ManagerAddPage(driver);

		manager.enterDetailsForAddManager(id, name, email, address, number, password);
		manager.clickManagerSave();
	}

}
