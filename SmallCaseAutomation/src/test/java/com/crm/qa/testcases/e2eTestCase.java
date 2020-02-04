package com.crm.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.CartPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.ProductDescriptionPage;
import com.crm.qa.pages.ProductsPage;



public class e2eTestCase extends TestBase{
	public WebDriver driver;
	
	@BeforeTest
	public void openBroswer() {
		loadProperties();
		initialization();
	}
	
	@Test	
	public void e2eTest() throws InterruptedException {
		
		HomePage hm =new HomePage(driver);
		hm.searchItemOnHomePage(prop.getProperty("ProductName"));
		
		ProductsPage product= new ProductsPage(driver);
		product.clickOnTheFirstProductFromListOfProducts();
		
		ProductDescriptionPage productDescription = new ProductDescriptionPage(driver);
		productDescription.readProductPrice();
		
		CartPage cart = new CartPage(driver);
		cart.increaseTheProductQuantityInNums();
	}
	
	@AfterTest
	public void closeBrowser() {
		closeBrowserWindow();
	}
	

}
