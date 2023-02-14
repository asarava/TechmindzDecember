package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase {
	Wrapper objWrapper=new Wrapper();
	@FindBy(id="signin2")
	WebElement pSignUpButton;
	@FindBy(id="sign-username")
	WebElement pSignupName;
	@FindBy(id="sign-password")
	WebElement pSignupPassword;
	@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
	WebElement pSignupButtonCreate;
	@FindBy(xpath="(//button[@class='btn btn-secondary'])[2]")
	WebElement pSignUpCloseButton;
	
	@FindBy(id="login2")
	WebElement pLoginButton;
	@FindBy(id="loginusername")
	WebElement pLoginName;
	@FindBy(id="loginpassword")
	WebElement pLoginPassword;
	@FindBy(xpath="(//button[@class='btn btn-primary'])[4]")
	WebElement pLogInCreate;
	@FindBy(xpath="(//button[@class='btn btn-secondary'])[4]")
	WebElement pLoginCloseButton;
	@FindBy(xpath="(//*[text()='About us'])[2]")
	WebElement pAboutUs;
	@FindBy(xpath="(//button[@class='btn btn-secondary'])[4]")
	WebElement pCloseAboutUs;
	
	@FindBy(xpath="//*[text()='Contact']")
	WebElement pContactButton;
	
	@FindBy(xpath="//input[@id='recipient-email']")
	WebElement pContactEmail;
	
	@FindBy(xpath="//input[@id='recipient-name']")
	WebElement pContactName;
	

	@FindBy(id="message-text")
	WebElement pContactMessage;
	@FindBy(xpath="//*[text()='Send message']")
	WebElement pSendMessage;
	@FindBy(xpath="//*[text()='Laptops']")
	WebElement pLaptopLink;
	@FindBy(xpath="//*[text()='Monitors']")
	WebElement pMonitorLink;
	@FindBy(xpath="//*[text()='Phones']")
	WebElement pPhoneLink;
	@FindBy(xpath="//a[text()='Cart']")
	WebElement pCartLink;
	@FindBy(xpath="//a[text()='Home ']")
	WebElement pHomeLink;
	@FindBy(xpath="(//a[@class='hrefch'])[1]")
	WebElement pProduct;
	@FindBy(xpath="//a[@class='btn btn-success btn-lg']")
	WebElement pAddtoCart;
	@FindBy(xpath="(//button[@class='btn btn-secondary'])[3]")
	WebElement pPlaceOrderClose;
	@FindBy(xpath="//*[text()='Place Order']")
	WebElement pPlaceOrderClick;
	@FindBy(xpath="//*[text()='Log out']")
	WebElement pLogOut;
	@FindBy(xpath="(//a[@class='hrefch'])[2]")
	WebElement pProductDescription;
	
	
	
	
	
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void clickSignUpButton() throws InterruptedException{
		Thread.sleep(2000);
		pSignUpButton.click();

}
	public void clicksignupNameEnterText(String pValue) {
		objWrapper.enterText(pValue,pSignupName , driver);
	}
	public void clicksignupPasswordEnterText(String pValue) {
		objWrapper.enterText(pValue,pSignupPassword , driver);
}

	public void clicksignupButton() throws InterruptedException  {
		pSignupButtonCreate.click();
		Thread.sleep(2000);
		
		
		
		
	}
	public void clickAlertSignup() throws InterruptedException {
		Thread.sleep(2000);
		objWrapper.alert(driver);
	}
	public void clickSignUpCloseButton() throws InterruptedException {
		objWrapper.waitForElement(driver, pSignUpCloseButton);
		
		pSignUpCloseButton.click();
		Thread.sleep(2000);
}
	
	public void clickLoginButton() throws InterruptedException {
		Thread.sleep(2000);
		pLoginButton.click();
	}
	public void clickLoginUsername(String pValue) throws InterruptedException {
		Thread.sleep(2000);
		objWrapper.enterText(pValue, pLoginName, driver);
	}
	
	public void clickLoginPassword(String pValue) throws InterruptedException {
		Thread.sleep(2000);
		objWrapper.enterText(pValue,pLoginPassword , driver);
	}
	public void clickLoginCreateButton() throws InterruptedException {
		Thread.sleep(2000);
		pLogInCreate.click();
			
		
	}
	public void clickLoginClose() throws InterruptedException {
		pLoginCloseButton.click();
		Thread.sleep(2000);
	}
	
	public void clickOnAboutUs() throws InterruptedException {
		Thread.sleep(2000);
		pAboutUs.click();
		
	}
	public void clickOnCloseAboutus() throws InterruptedException {
		Thread.sleep(2000);
		pCloseAboutUs.click();
	}
	
	public void clickContactButton() {
		pContactButton.click();
	}
	
	public void contactEmailEnterText(String pValue) {
		objWrapper.enterText(pValue, pContactEmail, driver);
	}
	public void contactNameEnterText(String pValue) {
		objWrapper.enterText(pValue, pContactName, driver);
	
}
	public void contactMessageEnterText(String pValue) {
		objWrapper.enterText(pValue, pContactMessage, driver);
}
	public void clickSendMessage() throws InterruptedException {
		pSendMessage.click();
		Thread.sleep(2000);
		
		
		
	}
	public void clickAlertOnSendMessage() throws InterruptedException {
		Thread.sleep(2000);
		objWrapper.alert(driver);
		
	}
	public void clickOnLaptopLink() throws InterruptedException {
		Thread.sleep(2000);
		pLaptopLink.click();
		
		
		
	}
	public void clickOnMonitorLink() throws InterruptedException {
		Thread.sleep(2000);
		pMonitorLink.click();
		Thread.sleep(2000);
		
	}
	public void clickOnPhoneLink() throws InterruptedException {
		Thread.sleep(2000);
		pPhoneLink.click();
		Thread.sleep(2000);
		
	}
	public void clickOnCart() throws InterruptedException {
		Thread.sleep(2000);
		pCartLink.click();
	}
	public void clickOnHome() throws InterruptedException {
		Thread.sleep(2000);
		pHomeLink.click();
		
	}
	public void clickOnProduct() throws InterruptedException {
		Thread.sleep(2000);
		pProduct.click();
		
		
		
	}
	public void AddToCart() throws InterruptedException {
		Thread.sleep(2000);
		pAddtoCart.click();
	}
	public void PlaceOrderPresent() throws InterruptedException {
		Thread.sleep(2000);
		pCartLink.click();
	}
	public void ClickPlaceOrder() throws InterruptedException {
		Thread.sleep(2000);
		pPlaceOrderClick.click();
	}
	public void ClosePlaceOrder() throws InterruptedException {
		Thread.sleep(2000);
		pPlaceOrderClose.click();
	}
	public void clearUsername() throws InterruptedException {
		Thread.sleep(2000);
		objWrapper.clearText(pSignupName, driver);
	}
	public void clearPassword() throws InterruptedException {
		objWrapper.clearText(pSignupPassword, driver);
		Thread.sleep(2000);
	}
	public void clickLogout() throws InterruptedException {
		Thread.sleep(2000);
		pLogOut.click();
		
		
	}
	public void clearUserNameLogin() {
		objWrapper.clearText(pLoginName, driver);
	}
	public void clearPasswordLogin() {
		objWrapper.clearText(pLoginPassword, driver);
	}
	public void clickProductDescription() throws InterruptedException {
		Thread.sleep(2000);
		pProductDescription.click();
	}
	
}
