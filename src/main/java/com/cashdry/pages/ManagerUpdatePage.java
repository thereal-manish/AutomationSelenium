package com.cashdry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManagerUpdatePage {

	By managerPage = By.cssSelector("a[href='manager']");

	By managerId = By.name("managerId");
	By managerName = By.name("m_name");
	By submitBtn = By.xpath("//button[@type='submit']");
	String updateManager = "01";
	By updateManagerBtn = By.cssSelector("a[href='editmana/" + updateManager + "']");
	String managerTitle = "Manager Details";

	WebDriver driver;

	// Constructor
	public ManagerUpdatePage(WebDriver driver) {
		this.driver = driver;

	}

	// getting manager panel
	public void getManagerPanel() {
		driver.findElement(managerPage).click();
	}

	// verifying title
	public boolean verifyManagerTitle() {
		return driver.getTitle().contentEquals(managerTitle);
	}

	// clicking updating manager
	public void clickUpdateManagerBtn() {
		driver.findElement(updateManagerBtn).click();
	}

	// verifying correct id is loaded
	public boolean verifyUpdateManagerPage() {
		WebElement retrivedIdWeb = driver.findElement(managerId);
		String retrivedId = retrivedIdWeb.getAttribute("value");
		return retrivedId.equals(updateManager);
	}

	// update the new manager details
	public void updateExistingManager(String newNameManager) {
		driver.findElement(managerName).clear();
		driver.findElement(managerName).sendKeys(newNameManager);
	}

	// update manager -- call clickManagerSave() instead
	public void clickUpdateManagerSave() {
		driver.findElement(submitBtn).click();
		driver.switchTo().alert().accept();

	}

}
