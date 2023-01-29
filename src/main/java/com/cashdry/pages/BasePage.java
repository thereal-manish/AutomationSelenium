package com.cashdry.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;

	String url = "http://localhost:8080/";


	@Parameters({ "username", "password" })
	public void login(String username, String pass) {
		HomePage homePage = new HomePage(driver);
		LoginPage loginPage = new LoginPage(driver);

		homePage.adminLogin();
		loginPage.getAdminLoginPage(username, pass);
		loginPage.clickSignIn();
		Assert.assertTrue(loginPage.verifyNewPage());

	}

	@BeforeClass(alwaysRun = true)
	@Parameters({ "username", "password" })
	public void basePage(String username, String pass) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get(url);
		login(username, pass);
	}
	
	
	
	By logout=By.xpath("(//span[contains(text(),'Logout')])");

	@AfterClass
	public void closeBasePage() {
		driver.findElement(logout).click();
		driver.quit();
	}

}
