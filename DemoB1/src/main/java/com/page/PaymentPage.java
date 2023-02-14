package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class PaymentPage extends TestBase{

	Wrapper objWrapper = new Wrapper();
	
	@FindBy(xpath = "//button[text()='Place Order']")
	WebElement pToPlaceOrder;
	@FindBy(id = "name")
	WebElement pName;
	@FindBy(id = "country")
	WebElement pCountry;
	@FindBy(id="city")
	WebElement pCity;
	@FindBy(id = "card")
	WebElement pCard;
	@FindBy(id = "month")
	WebElement pMonth;
	@FindBy(id = "year")
	WebElement pYear;
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement pPurchaseBtn;
	@FindBy(xpath="//button[text()='OK']")
	WebElement pPurchaseOK;
	@FindBy(id = "logout2")
	WebElement pLogOut;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickToOrder() {
		objWrapper.waitForElement(driver,pToPlaceOrder);
		pToPlaceOrder.click();
	}
	public void customerName(String pValue) {
		objWrapper.enterText(pValue, pName, driver);
	}
	public void customerCountry(String pValue) {
		objWrapper.enterText(pValue, pCountry, driver);
	}
	public void customerCity(String pValue) {
		objWrapper.enterText(pValue, pCity, driver);
	}
	public void customerCard(String pValue) {
		objWrapper.enterText(pValue, pCard, driver);
	}
	public void customerMonth(String pValue) {
		objWrapper.enterText(pValue, pMonth, driver);
	}
	public void customerYear(String pValue) {
		objWrapper.enterText(pValue, pYear, driver);
	}
	
	public void clickToPurchase() {
		objWrapper.waitForElement(driver,pPurchaseBtn);
		pPurchaseBtn.click();
	}
	public void clickPurchaseOK() {
		objWrapper.waitForElement(driver,pPurchaseOK);
		pPurchaseOK.click();
	}

	public void clickLogOutButton() {
		objWrapper.waitForElement(driver,pLogOut);
		pLogOut.click();
	}

}
