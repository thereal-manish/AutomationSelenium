package com.cashdry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	By userName = By.id("adminUsername");
	By password = By.id("adminPassword");
	By signInButton = By.cssSelector("button[type='submit']");
	String dashboardTitle = "Admin DashBoard";
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void getAdminLoginPage(String username, String pass) {
		driver.findElement(userName).sendKeys(username);
		driver.findElement(password).sendKeys(pass);
	}

	public void clickSignIn() {
		driver.findElement(signInButton).click();
	}

	public boolean verifyNewPage() {
		return driver.getTitle().contains(dashboardTitle);
	}

}
