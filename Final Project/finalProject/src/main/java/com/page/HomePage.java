package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase {
	Wrapper objWrapper = new Wrapper();
	
	@FindBy (id="cat")
	WebElement pCategories;
	
	@FindBy (xpath = "(//a[@class='nav-link'])[1]")
	WebElement pHome;
	
	@FindBy (xpath= "(//a[@class='hrefch'])[1]")
	WebElement pSamsung;
	
	@FindBy (xpath = "//a[@onclick='addToCart(1)']")
	WebElement pAddCart;
	
	@FindBy (xpath = "(//a[@class='nav-link'])[4]")
	WebElement pCartPage;
	
	@FindBy (xpath = "(//button[@type='button'])[30]")
	WebElement pPlaceOrderButton;
	
	@FindBy (id = "name")
	WebElement pOrderName;
	
	@FindBy (id = "country")
	WebElement pOrderCountry;
	
	@FindBy (id = "city")
	WebElement pOrderCity;
	
	@FindBy (id = "card")
	WebElement pOrderCreditCard;
	
	@FindBy (id = "month")
	WebElement pOrderMonth;
	
	@FindBy (id = "year")
	WebElement pOrderYear;
	
	@FindBy (xpath = "//button[@onclick='purchaseOrder()']")
	WebElement pPurchaseButton;
	
	@FindBy (xpath = "(//a[@id='itemc'])[2]")
	WebElement pLaptops;
	
	@FindBy (xpath = "(//a[@id='itemc'])[3]")
	WebElement pMonitor;
	
	@FindBy (xpath = "(//a[@class='hrefch'])[6]")
	WebElement pSonyxperiaz5;
	
	@FindBy (xpath = "(//a[@class='hrefch'])[1]")
	WebElement pSonyvaioi5;
	
	@FindBy (xpath="//button[@tabindex='1']")
	WebElement pPurchaseOkButton;
	
	@FindBy (xpath = "(//button[@type='button'])[7]")
	WebElement pPurchaseCloseButton;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickHome() {
		pHome.click();
	}
	public void clickProduct() throws InterruptedException {
		Thread.sleep(500);
		objWrapper.waitForElementProduct(driver, pSamsung);
		pSamsung.click();
	}
	
	public void clickAddToCart() throws InterruptedException {
		Thread.sleep(1000);
		objWrapper.waitForElement(driver, pAddCart);
	   pAddCart.click();
	}
	
	public void clickSonyVaioi5() {
		objWrapper.waitForElement(driver, pSonyvaioi5);
		pSonyvaioi5.click();
	}

	public void clickCartMenu() {
		objWrapper.waitForElement(driver, pCartPage);
	   pCartPage.click();
	}
	
	public void categoryClick() throws InterruptedException {
		Thread.sleep(1000);
		pCategories.click();
	}
	
	public void PlaceOrder() {
		objWrapper.waitForElement(driver, pPlaceOrderButton);
		pPlaceOrderButton.click();
		
	}
	
	public void EnterOrderName(String pValue) {
		objWrapper.waitForElement(driver, pOrderName);
		objWrapper.enterText(driver, pOrderName,"Revathy");
	}
	
	public void EnterOrderCountry(String pValue) {
		objWrapper.waitForElement(driver, pOrderCountry);
		objWrapper.enterText(driver, pOrderCountry,"India");
	}
	
	public void EnterOrderCity(String pValue) {
		objWrapper.waitForElement(driver, pOrderCity);
		objWrapper.enterText(driver, pOrderCity,"Kochi");
	}
	
	public void EnterOrderCreditCard(String pValue) {
		objWrapper.waitForElement(driver, pOrderCreditCard);
		objWrapper.enterText(driver, pOrderCreditCard,"1234567891234567");
	}
	
	public void EnterOrderMonth(String pValue) {
		objWrapper.waitForElement(driver, pOrderMonth);
		objWrapper.enterText(driver, pOrderMonth,"February");
	}
	
	public void EnterOrderYear(String pValue) {
		objWrapper.waitForElement(driver, pOrderYear);
		objWrapper.enterText(driver, pOrderYear,"2023");
	}
	
	
	public void ClickPurchaseButton() {
		objWrapper.waitForElement(driver, pPurchaseButton);
		pPurchaseButton.click();
		objWrapper.dismissAlert(driver, pPurchaseButton);
	}
	
	public void ClickPurchaseOkButton() {
		objWrapper.waitForElement(driver, pPurchaseOkButton);
		pPurchaseOkButton.click();
		objWrapper.dismissAlert(driver, pPurchaseOkButton);
	}
	
	public void ClickPurchaseCloseButton() {
		objWrapper.waitForElement(driver, pPurchaseCloseButton);
		pPurchaseCloseButton.click();
		objWrapper.dismissAlert(driver, pPurchaseCloseButton);
	}
	
	public void ClickLaptop() throws InterruptedException {
		objWrapper.waitForElement(driver, pLaptops);
		pLaptops.click();
		Thread.sleep(1000);
	}
	
	public void ClickMonitor() throws InterruptedException {
		objWrapper.waitForElement(driver, pMonitor);
		pMonitor.click();
		Thread.sleep(1000);
	}
	
	public void ClickSonyXperiaz5() throws InterruptedException {
		objWrapper.waitForElement(driver, pSonyxperiaz5);
		pSonyxperiaz5.click();
		Thread.sleep(2000);
	}
	
	public void Samsung() {
		objWrapper.waitForElement(driver, pSamsung);
	}
}
