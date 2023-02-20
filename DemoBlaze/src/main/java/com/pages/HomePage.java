package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase{
	Wrapper wrapper=new Wrapper();
	@FindBy(id="nava") WebElement dHomePageHeading;
	@FindBy(id="signin2") WebElement dHomePageSignUp;
	@FindBy(id="sign-username") WebElement dHomePageSinUpUserName;
	@FindBy(id="sign-password") WebElement dSingUpPassword;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[2]") WebElement dSingUpWindowSinupButton;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[2]") WebElement dSinupWindowCancelButton;
	@FindBy(id="login2") WebElement dHomePageLoginButton;
	@FindBy(id="loginusername") WebElement dLonginUserName;
	@FindBy(id="loginpassword") WebElement dLonginPassword;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[3]") WebElement dLoginPageLoginButton;
	@FindBy(id="nameofuser") WebElement dLoginPageUser;
	@FindBy(id="logout2") WebElement dLogOut;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[3]") WebElement dLoginPageCloseButton;
	@FindBy(xpath = "(//*[@class=\"nav-link\"])[2]") WebElement dHomePageContactButton;
	@FindBy(id="recipient-email") WebElement dContactEmailButton;
	@FindBy(id="recipient-name") WebElement dContactNameButton;
	@FindBy(id="message-text") WebElement dMessage;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[1]") WebElement dSendMessage;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[1]") WebElement dContactClose;
	@FindBy(xpath = "(//*[@class=\"nav-link\"])[1]") WebElement dHomeButton;
	@FindBy(xpath = "//a[text()=\"Samsung galaxy s6\"]" ) WebElement dPhone;
	@FindBy(xpath = "//*[@class=\"btn btn-success btn-lg\"]") WebElement dAddToCart;
	@FindBy(xpath = "(//*[@class=\"nav-link\"])[4]") WebElement dCartButton;
	@FindBy(xpath = "//*[@class=\"table-responsive\"]") WebElement dProductWindow;
	@FindBy(xpath = "//a[text()=\"Delete\"]") WebElement dDeleteButton;
	@FindBy(xpath = "//button[@class=\"btn btn-success\"]") WebElement dPlaceOrder;
	@FindBy(id="name") WebElement dPlaceOrderName;
	@FindBy(id="country") WebElement dCountry;
	@FindBy(id="city") WebElement dCity;
	@FindBy(id="card") WebElement dCreditCard;
	@FindBy(id="month") WebElement dMonth;
	@FindBy(id="year") WebElement dYear;
	@FindBy(xpath = "(//button[@class=\"btn btn-primary\"])[3]") WebElement dPurchaseButton;
	@FindBy(xpath = "//button[@class=\"confirm btn btn-lg btn-primary\"]") WebElement dOkButton;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[3]") WebElement dPCloseButton;
	@FindBy(xpath = "//*[@class=\"sweet-alert  showSweetAlert visible\"]/h2") WebElement dResult;
	@FindBy(xpath = "(//*[@class=\"nav-link\"])[3]") WebElement dAboutUsButton;
	@FindBy(xpath = "(//button[@class=\"btn btn-secondary\"])[4]") WebElement dAboutUsCloseButton;
	@FindBy(xpath = "//button[@class=\"vjs-big-play-button\"]") WebElement dPlayVideo;
	@FindBy(xpath = "//button[@class=\"vjs-play-control vjs-control vjs-button vjs-playing\"]") WebElement dPauseButton;
	@FindBy(xpath = "//button[@class=\"vjs-play-control vjs-control vjs-button vjs-paused\"]") WebElement dPlayButton;
	@FindBy(xpath = "//button[@class=\"vjs-fullscreen-control vjs-control vjs-button\"]")WebElement dFullScreen;
	@FindBy(xpath = "//button[@title=\"Non-Fullscreen\"]") WebElement dNonFullScreen;
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public void URL(String expectedData,String message) {
		wrapper.asseRT(dHomePageHeading, expectedData, message, 0);
		
	}
	public void singUp(String UserName,String Passwrod) {
		wrapper.waitForElement(dHomePageSignUp);
		dHomePageSignUp.click();
		wrapper.waitForElement(dHomePageSinUpUserName);
		wrapper.enterData(dHomePageSinUpUserName, UserName);
		wrapper.enterData(dSingUpPassword, Passwrod);
		dSingUpWindowSinupButton.click();
		wrapper.handleAlert();
		dSinupWindowCancelButton.click();
		
	}
	public void login(String UserName,String Password) {
		wrapper.waitForElement(dHomePageLoginButton);
		dHomePageLoginButton.click();
		wrapper.waitForElement(dLonginUserName);
		wrapper.enterData(dLonginUserName, UserName);
		wrapper.enterData(dLonginPassword, Password);
		dLoginPageLoginButton.click();
		wrapper.waitForElement(dLoginPageUser);
		wrapper.asseRT(dLoginPageUser, UserName, "usernamemissmatch loginfailed",8);
		dLogOut.click();
		
	}
	public void loginWithInvalidPassword(String UserName,String Passwrod) {
		wrapper.waitForElement(dHomePageLoginButton);
		dHomePageLoginButton.click();
		wrapper.waitForElement(dLonginUserName);
		wrapper.enterData(dLonginUserName, UserName);
		wrapper.enterData(dLonginPassword, Passwrod);
		dLoginPageLoginButton.click();
		wrapper.assertAlrt("Wrong password.","error");
		wrapper.handleAlert();
		dLoginPageCloseButton.click();
		
	}
	public void loginWithInvalidUserName(String UserName,String Passwrod) {
		wrapper.waitForElement(dHomePageLoginButton);
		dHomePageLoginButton.click();
		wrapper.waitForElement(dLonginUserName);
		wrapper.enterData(dLonginUserName, UserName);
		wrapper.enterData(dLonginPassword, Passwrod);
		dLoginPageLoginButton.click();
		wrapper.assertAlrt("User does not exist.", "error");
		wrapper.handleAlert();
		dLoginPageCloseButton.click();
		
	}
	public void loginWithInvalidUserNameandInvalidPassword(String UserName,String Passwrod) {
		wrapper.waitForElement(dHomePageLoginButton);
		dHomePageLoginButton.click();
		wrapper.waitForElement(dLonginUserName);
		wrapper.enterData(dLonginUserName, UserName);
		wrapper.waitForElement(dLonginPassword);
		wrapper.enterData(dLonginPassword, Passwrod);
		dLoginPageLoginButton.click();
		wrapper.assertAlrt("Wrong password.","error");
		wrapper.handleAlert();
		dLoginPageCloseButton.click();
	 
	}
	public void contact() {
		wrapper.waitForElement(dHomePageContactButton);
		dHomePageContactButton.click();
		wrapper.waitForElement(dContactClose);
		dContactClose.click();
	   
	}
	public void contactValidData(String ContactEmail,String ContactName,String Message) {
		wrapper.waitForElement(dHomePageContactButton);
		dHomePageContactButton.click();
		wrapper.waitForElement(dContactEmailButton);
		wrapper.enterData(dContactEmailButton, ContactEmail);
		wrapper.enterData(dContactNameButton, ContactName);
		wrapper.enterData(dMessage, Message);
		dSendMessage.click();
		wrapper.assertAlrt("Thanks for the message!!", "successful");
		wrapper.handleAlert();
			
	}
	public void lenthOfMessage(String ContactEmail,String ContactName,String Message) {
		wrapper.waitForElement(dHomePageContactButton);
		dHomePageContactButton.click();
		wrapper.waitForElement(dContactEmailButton);
		wrapper.enterData(dContactEmailButton, ContactEmail);
		wrapper.enterData(dContactNameButton, ContactName);
		wrapper.enterData(dMessage, Message);
		dSendMessage.click();
		wrapper.assertAlrt("Thanks for the message!!", "successful");
		wrapper.handleAlert();
		
	}
	public void home() {
		wrapper.waitForElement(dHomeButton);
		dHomeButton.click();
		wrapper.waitForElement(dPhone);
		dPhone.click();
		wrapper.waitForElement(dAddToCart);
		dAddToCart.click();
		wrapper.handleAlert();	
		
	}
	public void cart() {
		wrapper.waitForElement(dCartButton);
		dCartButton.click();
	   
	}
	public void delectButton() {
		wrapper.waitForElement(dDeleteButton);
		dDeleteButton.click();
	   
	}
	public void home2() {
		wrapper.waitForElement(dHomeButton);
		dHomeButton.click();
		wrapper.waitForElement(dPhone);
		dPhone.click();
		wrapper.waitForElement(dAddToCart);
		dAddToCart.click();
		wrapper.handleAlert();
	   
	}
	
	public void cart2(String Name,String Country,String City,String CreditCard,String Month,String Year) {
		wrapper.waitForElement(dCartButton);
		dCartButton.click();
		wrapper.waitForElement(dPlaceOrder);
		dPlaceOrder.click();
		wrapper.waitForElement(dPlaceOrderName);
		wrapper.enterData(dPlaceOrderName, Name);
		wrapper.enterData(dCountry, Country);
		wrapper.enterData(dCity, City);
		wrapper.enterData(dCreditCard, CreditCard);
		wrapper.enterData(dMonth, Month);
		wrapper.enterData(dYear, Year);
		wrapper.waitForElement(dPurchaseButton);
		dPurchaseButton.click();
		wrapper.waitForElement(dResult);
		wrapper.asseRT(dResult, "Thank you for your purchase!", "purchase result is success", 0);
		dOkButton.click();
	   
	}
	public void cart3(String Name,String Country,String City,String CreditCard,String Month,String Year) {
		wrapper.waitForElement(dCartButton);
		dCartButton.click();
		wrapper.waitForElement(dPlaceOrder);
		dPlaceOrder.click();
		wrapper.waitForElement(dPlaceOrderName);
		wrapper.enterData(dPlaceOrderName, Name);
		wrapper.enterData(dCountry, Country);
		wrapper.enterData(dCity, City);
		wrapper.enterData(dCreditCard, CreditCard);
		wrapper.enterData(dMonth, Month);
		wrapper.enterData(dYear, Year);
		wrapper.waitForElement(dPurchaseButton);
		dPurchaseButton.click();
		wrapper.waitForElement(dResult);
		wrapper.asseRT(dResult, "Thank you for your purchase!", "purchase not accepted", 0);
		dOkButton.click();
	
	}
	public void aboutAs() {
		wrapper.waitForElement(dAboutUsButton);
		dAboutUsButton.click();
		wrapper.waitForElement(dAboutUsCloseButton);
		dAboutUsCloseButton.click();	
	 
	}
	public void aboutAs1() {
		wrapper.waitForElement(dAboutUsButton);
		dAboutUsButton.click();
		wrapper.waitForElement(dPlayVideo);
		dPlayVideo.click();
		wrapper.waitForElement(dAboutUsCloseButton);
		dAboutUsCloseButton.click();

	}
	public void fullScreenVideo() {
		wrapper.waitForElement(dAboutUsButton);
		dAboutUsButton.click();
		wrapper.waitForElement(dFullScreen);
		dFullScreen.click();
		wrapper.waitForElement(dNonFullScreen);
		dNonFullScreen.click();
		
	}
	public void pauseButton() {
		wrapper.waitForElement(dAboutUsButton);
		dAboutUsButton.click();
		wrapper.waitForElement(dPauseButton);
		dPauseButton.click();
		
	}
	public void playButton() {

		wrapper.waitForElement(dPlayButton);
		dPlayButton.click();
        wrapper.waitForElement(dPauseButton);
		dPauseButton.click();	
	
	}
	public void aboutUsCloseButton() {
		wrapper.waitForElement(dAboutUsCloseButton);
		dAboutUsCloseButton.click();
		
	}

	
	

}
