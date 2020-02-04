package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//input[@title=\"Search for products, brands and more\"]")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@class=\"_2AkmmA _29YdH8\"]")
	WebElement closeIcon;
	
	@FindBy(xpath="//button[@class=\"vh79eN\"]")
	WebElement searchIcon;

	
	// Initializing the Page Objects:
	public HomePage(WebDriver driver) {
		driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickClose() {
		closeIcon.click();
	}
	
	public void clickSearch() {
		searchIcon.click();
	}
	
	public void enterProductInProductsSearchBox(String productName) {
		searchBox.sendKeys(productName);
	}
	
	public void searchItemOnHomePage(String ProductName) throws InterruptedException {
		Thread.sleep(5000);
		clickClose();
		enterProductInProductsSearchBox(ProductName);
		clickSearch();
	}
}
