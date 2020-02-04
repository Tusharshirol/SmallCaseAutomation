package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ProductDescriptionPage extends TestBase{

@FindBy(xpath="//button[@class=\"_2AkmmA _2Npkh4 _2MWPVK\"]")
WebElement addToCartButton;

@FindBy(xpath="//div[@class=\"_1vC4OE _3qQ9m1\"]")
WebElement priceText;

public ProductDescriptionPage(WebDriver driver) {
	driver=this.driver;
	PageFactory.initElements(driver, this);
}

public void clickAddToCart() {
	addToCartButton.click();
}

public void readProductPrice() throws InterruptedException {
	Thread.sleep(5000);
	getWindowHandles(1);
	String itemPrice = priceText.getText();
	System.out.println("The price of the selected item is:"+itemPrice);
	clickAddToCart();
}

}
