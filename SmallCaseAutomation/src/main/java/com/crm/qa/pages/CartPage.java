package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class CartPage extends TestBase{
	
	@FindBy(xpath="//div[@class=\"_3md1dr\"]/button[2]")
	WebElement increaseQuantityIcon;
	
	@FindBy(xpath="//div[@class=\"JAUzCh\"]")
	WebElement warningText;
	
	// Initializing the Page Objects:
		public CartPage(WebDriver driver) {
			driver=this.driver;
			PageFactory.initElements(driver, this);
		}
		
public void getWarningtext() {
	String warningMessage=warningText.getText();
	//system not allowing to select multiple items
	System.out.println(warningMessage);
}
		
	public void increaseTheProductQuantityInNums() throws InterruptedException {
		Thread.sleep(5000);
		increaseQuantityIcon.click();
		Thread.sleep(2000);
		getWarningtext();
	}
	
}
