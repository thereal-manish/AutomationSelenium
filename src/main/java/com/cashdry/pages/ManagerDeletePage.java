package com.cashdry.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ManagerDeletePage {

	By managerPage = By.cssSelector("a[href='manager']");


	String deleteManager="10";
	By deleteManagerBtn=By.cssSelector("a[href='deletemana/"+deleteManager+"']");
	String managerTitle = "Manager Details";


	WebDriver driver;

	// Constructor
	public ManagerDeletePage(WebDriver driver) {
		this.driver=driver;
		
	}

	// getting manager panel
	public void getManagerPanel() {
		driver.findElement(managerPage).click();
		
	}

	

	// verifying title
	public void verifyManagerTitle() {
		Assert.assertEquals(driver.getTitle(), managerTitle);
		
	}

	


	
	//delete manager
	public void clickDeleteManagerBtn() {
		driver.findElement(deleteManagerBtn).click();
		driver.switchTo().alert().accept();

	}
	

}
