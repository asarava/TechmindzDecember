package com.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase {
	
	
	Wrapper objWrapper = new Wrapper();
	
	/*
	@FindBy(xpath = "//a[text()='Phones']")
	WebElement phones;
	
	@FindBy(xpath = "//a[text()='HTC One M9']")
	WebElement htcm9;
	
	
	@FindBy(xpath = "//a[text()='Add to cart']")
	WebElement Addcart;
	*/
	@FindBy(linkText = "CATEGORIES")
    WebElement linkCategories;

    @FindBy(linkText = "Phones")
    WebElement linkPhones;
    
    @FindBy(linkText = "Laptops")
    WebElement linkLaptops;
    
    @FindBy(linkText = "Samsung galaxy s6")
    WebElement linkSamsungGalaxyS6;
    
    @FindBy(xpath ="//*[text()='Product description']")
    WebElement element;
    
    @FindBy(xpath = "//a[text()='Add to cart']")
	WebElement Addcart;
    
    @FindBy(id = "nava")
    WebElement phomepage;
    
    @FindBy(id = "signin2")
	WebElement pSignUpButton;
	
	@FindBy(id = "sign-username")
	WebElement pSignUsername;
	
	@FindBy(id = "sign-password")
	WebElement pSignPassword;
	
	@FindBy(xpath = "(//*[text() = 'Sign up'])[2]")
	WebElement pSignUp;
	
	
	@FindBy(id = "login2")
	WebElement pLoginButton;
	
	@FindBy(id = "loginusername")
	WebElement pLoginUsername;
	
	@FindBy(id = "loginpassword")
	WebElement pLoginPassword;
	
	@FindBy(xpath = "(//*[text() = 'Log in'])[2]")
	WebElement pLogin;
	
	@FindBy(id = "nameofuser")
    WebElement linkWelcomeUser;
	
	//cart
	@FindBy(xpath = "//a[text()='Cart']")
	WebElement cartLink;
	@FindBy(xpath = "(//td[2])[1]")
	WebElement FirstItem;
	@FindBy(xpath = "(//a[text()='Delete'])[1]")
	WebElement deleteFirstItem;
	//product
	@FindBy(xpath = "//a[text()='Monitors']")
	WebElement monitors;
	@FindBy(xpath = "//a[text()='ASUS Full HD']")
	WebElement asusDesktop ;
	//payment page
	@FindBy(xpath = "//button[text()='Place Order']")
	WebElement PlaceOrderBtn;
	@FindBy(id = "name")
	WebElement name;
	
	@FindBy(id = "country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id = "card")
	WebElement card;
	
	@FindBy(id = "month")
	WebElement month;
	
	
	@FindBy(id = "year")
	WebElement year;
	
	@FindBy(xpath="//button[text()='Purchase']")
	WebElement PurchaseBtn;
	@FindBy(xpath="//h2[text()='Thank you for your purchase!']")
	WebElement succesmsg;
	@FindBy(xpath = "//button[text()='OK']")
    WebElement buttonOk;
	@FindBy(xpath = "(//*[text()='Close'])[3]")
	WebElement pClosebtn;
	
	//About Us
	
	@FindBy(xpath="//a[text()='About us']")
    WebElement aboutUs;
	
	@FindBy(id = "videoModalLabel")
	WebElement aboutusText;
	
	@FindBy(xpath="//div[@style='background-image: url(\"imgs/front.jpg\");']")
    WebElement videoBtn;
	
	@FindBy(xpath="//video[@poster='imgs/front.jpg']")
    WebElement pauseVideo;
	
	@FindBy(xpath="//button[@title='Fullscreen']")
    WebElement fullscreenBtn;
	
	@FindBy(xpath="//button[@title='Non-Fullscreen']")
    WebElement nonFullscreen;
	
	@FindBy(xpath = "(//*[text()='Close'])[4]")
    WebElement aCloseBtn;
	
	// contact
	
	@FindBy(xpath = "//*[text() = 'Contact']")
	WebElement contactBtn;
	
	@FindBy(id = "recipient-email")
	WebElement contactEmail;
	
	@FindBy(id = "recipient-name")
	WebElement contactName;
	
	@FindBy(id = "message-text")
	WebElement contactMessage;
	
	@FindBy(xpath = "//*[text() = 'Send message']")
	WebElement sendMessage;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public boolean phonesSlideDisplayed() {
        linkPhones.click();
        return linkPhones.isDisplayed();
    }
	public boolean laptopsSlideDisplayed() {
        linkLaptops.click();
        return linkLaptops.isDisplayed();
    }
	public boolean monitorsSlideDisplayed() {
        monitors.click();
        return monitors.isDisplayed();
    }
	
	
	public void AddtoCart() {
		//objWrapper.clickElement(linkCategories, driver);
	    //objWrapper.clickElement(linkPhones, driver);
		objWrapper.waitForElement(driver, linkSamsungGalaxyS6);	
	    objWrapper.clickElement(linkSamsungGalaxyS6, driver);	
	}
	public String getProductTagName() {
    	objWrapper.waitForElement(driver, element);
    	String name=element.getText();
    	return name;
    }
	public String AddCart() {
		Addcart.click();
    	objWrapper.waitForAlert(driver);
    	Alert alert = driver.switchTo().alert();
    	String alerttext=alert.getText();
    	objWrapper.acceptAlert(driver);
    	
    	return alerttext;
	}
	public Boolean SignUp() {
		phomepage.click();
		return pSignUpButton.isDisplayed();
		
	}
	public void ClickSignUpButton() {
		pSignUpButton.click();
	}
	public void SignUpUsername(String pValue) {
		objWrapper.enterText(pValue, pSignUsername, driver);
	}
	public void SignUpPassword(String pValue) {
		objWrapper.enterText(pValue, pSignPassword, driver);
	}
	public String SignUpButton() {
		pSignUp.click();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String alertmessage=alert.getText();
		objWrapper.acceptAlert(driver);
		
		return alertmessage;
	}
	public void clearEnterText() {
		pSignUsername.clear();
		pSignPassword.clear();
	}
	public void SignUsername(String value) {
		objWrapper.enterText(value, pSignUsername, driver);
	}
	public void SignUpWithUsername() {
		pSignUp.click();
		objWrapper.waitForAlert(driver);
		objWrapper.acceptAlert(driver);
		
	}
	public void clearUsername() {
		pSignUsername.clear();
	}
	public void SignUsernameLength(String pvalue) {
		objWrapper.enterText(pvalue, pSignUsername, driver);
	}
	public void SignPasswordlength(String pvalue) {
		objWrapper.enterText(pvalue, pSignPassword, driver);
	}
	public String SignUpLength() {
		pSignUp.click();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String length=alert.getText();
		objWrapper.acceptAlert(driver);
		
		return length;
		
	}
	public String SignUpBlank() {
		objWrapper.clickElement(pSignUp, driver);
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String bmsg = alert.getText();
		objWrapper.acceptAlert(driver);
		return bmsg;
	}
	public void ClickSignUp() {
		phomepage.click();
		objWrapper.clickElement(pSignUpButton, driver);
	}
	public void clickLoginButton() {
		pLoginButton.click();
	}
	public void loginUsernameEnterText(String pValue) {
		objWrapper.enterText(pValue, pLoginUsername, driver);
	}
	public void loginPasswordEnterText(String pValue) {
		objWrapper.enterText(pValue, pLoginPassword, driver);
	}
	public String clickLogin() {
		pLogin.click();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String txtmsg=alert.getText();
		//alert.accept();
		objWrapper.acceptAlert(driver);
		return txtmsg;
		
	}
	public void clearLogin() {
		pLoginUsername.clear();
		pLoginPassword.clear();
	}
	public void clickLoginactualdata() {
		pLogin.click();
		
	}
	public boolean isWelcomeUserDisplayed() {
        objWrapper.waitForElement(driver, linkWelcomeUser);
        return linkWelcomeUser.isDisplayed();
    }
	//cart
	public Boolean productVisible() {
		cartLink.click();
		objWrapper.clickElement(cartLink, driver);
    	objWrapper.waitForElement(driver, FirstItem);
    	return FirstItem.isDisplayed();
	}
	//product add
	public void productadd() {
		phomepage.click();
		objWrapper.clickElement(monitors, driver);
		objWrapper.clickElement(asusDesktop, driver);
		objWrapper.clickElement(Addcart, driver);
		objWrapper.waitForAlert(driver);
		objWrapper.acceptAlert(driver);
		
	}
	public Boolean productDisplayedcart() {
		cartLink.click();
		objWrapper.waitForElement(driver, FirstItem);
		return FirstItem.isDisplayed();
	}
	// payment page
	public void placeorder() {
		//objWrapper.clickElement(cartLink, driver);
		PlaceOrderBtn.click();
	}
	public void pName(String pValue) {
		objWrapper.enterText(pValue, name, driver);
	}
	public void pCountry(String pValue) {
		objWrapper.enterText(pValue, country, driver);
	}
	public void pCity(String pValue) {
		objWrapper.enterText(pValue, city, driver);
	}
	public void pCard(String pValue) {
		objWrapper.enterText(pValue, card, driver);
	}
	public void pMonth(String pValue) {
		objWrapper.enterText(pValue, month, driver);
	}
	public void pYear(String pValue) {
		objWrapper.enterText(pValue, year, driver);
	}
	public String getSuccessMsg() {
		objWrapper.clickElement(PurchaseBtn, driver);
		String msg = succesmsg.getText();
		objWrapper.clickElement(buttonOk, driver);
		return msg;
	}
	
	public void clearPaymentDetails() {
		name.clear();
		country.clear();
		city.clear();
		card.clear();
		month.clear();
		year.clear();
	}
	public Boolean firstItemDisplayed() {
		objWrapper.clickElement(cartLink, driver);
		
    	objWrapper.waitForElement(driver, FirstItem);
    	String FirstitemName = FirstItem.getText();
    	
    	objWrapper.clickElement(deleteFirstItem, driver);
    	
    	String pageSource  = driver.getPageSource();
		

    	return pageSource.contains(FirstitemName);
    	
    }
	public void closeButtonAccesibility() {
		objWrapper.clickElement(PlaceOrderBtn, driver);
		objWrapper.clickElement(pClosebtn, driver);
		
	}
	public Boolean aboutUs() {
		objWrapper.clickElement(phomepage, driver);
		aboutUs.click();
		return aboutUs.isDisplayed();
	}
	public void playpause() {
		objWrapper.clickElement(videoBtn, driver);
		objWrapper.clickElement(pauseVideo, driver);
	}
	public void fullscreen() {
		objWrapper.clickElement(fullscreenBtn, driver);
		nonFullscreen.click();
	}
	public Boolean aboutClosebtn() {
		//objWrapper.clickElement(phomepage, driver);
		//objWrapper.clickElement(aboutUs, driver);
		objWrapper.clickElement(aCloseBtn, driver);
		return aCloseBtn.isDisplayed();
	}
	//contact
    public void ContactButton() {
		contactBtn.click();
	}
	public void EmailEnterText(String pValue) {
		objWrapper.enterText(pValue, contactEmail, driver);
	}
	public void NameEnterText(String pValue) {
		objWrapper.enterText(pValue, contactName, driver);
	}
	public void MessageEntertext(String pValue) {
		objWrapper.enterText(pValue, contactMessage, driver);	
	}
	public String SendMessage() {
		sendMessage.click();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String cmsg = alert.getText();
		objWrapper.acceptAlert(driver);
		return cmsg;
	}
	public void clearcontactDeatails() {
		contactEmail.clear();
		contactName.clear();
		contactMessage.clear();
	}
	/*
	public void cartAdd() {
		objWrapper.waitForElement(driver, Addcart);
		Addcart.click();
		objWrapper.waitForAlert(driver);
		objWrapper.alertDismiss(driver);
	}
	*/
	

}
