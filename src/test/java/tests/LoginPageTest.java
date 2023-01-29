package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cashdry.pages.BasePage;
import com.cashdry.pages.HomePage;
import com.cashdry.pages.LoginPage;

public class LoginPageTest extends BasePage {

	@Test(priority = 0)
	@Parameters({ "username", "password" })
	public void verifyLoginPage(String username, String pass) {
		
		HomePage homePage=new HomePage(driver);
		homePage.adminLogin();
		
		LoginPage login = new LoginPage(driver);
		login.getAdminLoginPage(username, pass);
		login.clickSignIn();
		Assert.assertTrue(login.verifyNewPage());
	}

}
