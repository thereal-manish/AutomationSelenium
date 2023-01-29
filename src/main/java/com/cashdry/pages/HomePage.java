package com.cashdry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage{

	By adminLoginPage = By.xpath("//a[@href='/admin/adminLogin']");

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void adminLogin() {
		driver.findElement(adminLoginPage).click();
	}

}
