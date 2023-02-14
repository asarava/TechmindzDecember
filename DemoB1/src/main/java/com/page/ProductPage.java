package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class ProductPage extends TestBase{

Wrapper objWrapper = new Wrapper();
	//-----------Testing Only first product--------
@FindBy(xpath = "//a[@href='prod.html?idp_=1']")
WebElement pSamsungGalaxyS6;
@FindBy(xpath = "//*[text()='Samsung galaxy s6']")
WebElement pVerifyS6;
@FindBy(xpath = "//a[text()='Add to cart']")
WebElement pAddToCart;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	//-----------Testing Only first product--------
	public void clickSamsungGalaxyS6() {
		objWrapper.waitForElement(driver, pSamsungGalaxyS6);
		pSamsungGalaxyS6.click();
		}
	public String verifyProduct() {
		objWrapper.waitForElement(driver, pVerifyS6);
		String pActualText = pVerifyS6.getText();
		return (pActualText);
		}
	public void clickAddToCart() {
		objWrapper.waitForElement(driver, pAddToCart);
		pAddToCart.click();
		}
	
	
}
