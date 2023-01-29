package com.cashdry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ManagerAddPage {

	By managerPage = By.cssSelector("a[href='manager']");
	By addManagerButton = By.xpath("//button[contains(text(),'Add Manager')]");
	By managerId = By.name("managerId");
	By managerName = By.name("m_name");
	By managerEmail = By.name("m_email");
	By managerAddress = By.xpath("//input[@name='m_address']");
	By managerNumber = By.xpath("//input[@type='number']");
	By managerPassword = By.id("m_password");
	By submitBtn = By.xpath("//button[@type='submit']");

	String managerTitle = "Manager Details";
	String addManagerTitle = "Add Manager #ToBeFailed";

	WebDriver driver;

	// Constructor
	public ManagerAddPage(WebDriver driver) {
		this.driver = driver;

	}

	// getting manager panel
	public void getManagerPanel() {
		driver.findElement(managerPage).click();
	}

	// verifying title
	public void verifyManagerTitle() {
		Assert.assertEquals(driver.getTitle(), managerTitle);
	}


	// Clicking Add Manager Button
	public void clickAddManagerButton() {
		driver.findElement(addManagerButton).click();
	}

	// Verify add manager page is loaded
	public boolean verifyAddManagerTitle() {
//		Assert.assertEquals(driver.getTitle(), addManagerTitle);
		return driver.getTitle().contentEquals(addManagerTitle);
	}

	// Enter Details
	public void enterDetailsForAddManager(String id, String name, String email, String address, String number,
			String password) {
		driver.findElement(managerId).sendKeys(id);
		driver.findElement(managerName).sendKeys(name);
		driver.findElement(managerEmail).sendKeys(email);
		driver.findElement(managerAddress).sendKeys(address);
		driver.findElement(managerNumber).sendKeys(number);
		driver.findElement(managerPassword).sendKeys(password);
	}

	// save
	public void clickManagerSave() {
		driver.findElement(submitBtn).click();
		driver.switchTo().alert().accept();
	}

}
