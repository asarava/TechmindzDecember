package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Wrapper.Wrapper;
import com.base.Testbase;

import freemarker.core.Macro;

public class HomePage extends Testbase{
	Wrapper objWrapper=new Wrapper() ;




	
@FindBy(id="signin2")
WebElement pSignUpButton;

@FindBy(id="login2")
WebElement pLoginButton;
@FindBy(xpath="//*[text()='Contact']")

WebElement pContactButton;



@FindBy(xpath="(//button[@class='btn btn-secondary'])[3]")
WebElement pLoginCloseButton;

@FindBy(xpath="(//button[@class='btn btn-secondary'])[2]")
WebElement pSignUpCloseButton;
@FindBy(xpath="//input[@id='recipient-email']")
WebElement pContactEmail;

@FindBy(xpath="//input[@id='recipient-name']")
WebElement pContactName;


@FindBy(id="message-text")
WebElement pContactMessage;
@FindBy(xpath="//*[text()='Send message']")
WebElement pSendMessage;

@FindBy(xpath="//*[text()='Send message']")
WebElement pAlertMessage;
@FindBy(id="sign-username")
WebElement pSignupName;
@FindBy(id="sign-password")
WebElement pSignupPassword;

@FindBy(xpath="(//button[@class='btn btn-primary'])[2]")
WebElement pSignupButtonCreate;
@FindBy(id="loginusername")
WebElement pLoginName;
@FindBy(id="loginpassword")
WebElement pLoginPassword;
@FindBy(xpath="(//button[@class='btn btn-primary'])[3]")
WebElement pLogInCreate;


@FindBy(xpath="//a[@id=\"cartur\"]")
WebElement cart;
@FindBy(xpath="//a[@id=\"cat\"] [1]")
WebElement categories;
@FindBy(xpath="//a[@class=\"hrefch\"] [2]")
WebElement apple ;
@FindBy(xpath="//a[@class=\"hrefch\"] [3]")
WebElement Nokia;
@FindBy(xpath="//a[@class=\"hrefch\"] [4]")
WebElement Nexus;
@FindBy(xpath="//button[@type='button']")
WebElement placeorder;
@FindBy(xpath="//label[@class='form-control-label'] [8]")
WebElement name;
@FindBy(xpath="//label[@class='form-control-label'] [9]")
WebElement country;
@FindBy(xpath="//label[@class='form-control-label'] [10]")
WebElement city;
@FindBy(xpath="//label[@class=\"form-control-label\"] [11]")
WebElement creditcard;
@FindBy(xpath="//label[@class=\"form-control-label\"] [12]")
WebElement month;
@FindBy(xpath="label[@class=\\\"form-control-label] [13]")
WebElement year;
@FindBy(xpath="//a[@id=\"itemc\"] [1]")
WebElement phone;
@FindBy(xpath="//a[@id=\"itemc\"] [2]")
WebElement Laptops;
@FindBy(xpath="//a[@class=\"hrefch\"] [1]")
WebElement vaioi5 ;
@FindBy(xpath="//a[@class=\"hrefch\"] [2]")
WebElement  vaioi7;
@FindBy(xpath="//a[@class=\"hrefch\"] [3]")
WebElement MacBookair;
@FindBy(xpath="//a[@class=\"hrefch\"] [4]")
WebElement Delli78gb;
@FindBy(xpath="//a[@id=\"itemc\"] [3]")
WebElement Monitors;
@FindBy(xpath="//a[@class=\"hrefch\"] [1]")
WebElement AppleMonitor ;
@FindBy(xpath="//a[@class=\"hrefch\"] [2]")
WebElement AsusFullHd;

















public HomePage() {
PageFactory.initElements(driver, this);
}
public void clickSignUpButton(){
pSignUpButton.click();
}
public void clickLoginButton() throws InterruptedException {
Thread.sleep(2000);
pLoginButton.click();

}
public void clickContactButton() {
pContactButton.click();
}

public void clickLoginCloseButton() {
objWrapper.waitforElement(driver, pLoginCloseButton);

pLoginCloseButton.click();
}
public void clickSignUpCloseButton() throws InterruptedException {
objWrapper.waitforElement(driver, pSignUpCloseButton);

pSignUpCloseButton.click();
Thread.sleep(2000);
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
objWrapper.alert(driver);


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

objWrapper.alert(driver);

}
public void clickLoginUsername(String pValue) {
objWrapper.enterText(pValue, pLoginName, driver);
}

public void clickLoginPassword(String pValue) {
objWrapper.enterText(pValue,pLoginPassword , driver);
}
public void clickLoginCreateButton() throws InterruptedException {
pLogInCreate.click();
Thread.sleep(2000);

objWrapper.alert(driver);



}


public void clearUsername() {
objWrapper.clearText(pLoginName, driver);
}
public void clearPassword() {
objWrapper.clearText(pLoginPassword, driver);

}





public void  clickcart()  throws InterruptedException{
	cart.click();
	Thread.sleep(2000);
	
	objWrapper.alert(driver);
	}
public void clickcategories() throws InterruptedException{
	categories.click();
	Thread.sleep(2000);
	objWrapper.alert(driver);
}
	public void clickapple() throws InterruptedException{
		apple.click();
		
	}
	public void clickNokia() throws InterruptedException{
		Nokia.click();
		
	}
	
	public void clickNexus() throws InterruptedException {
		Nexus.click();
		
	}
	public void clickplaceorder() throws InterruptedException {
		placeorder.click();
		
	
		}
		
	
	public void clickname() throws InterruptedException {
		name.click();
		Thread.sleep(2000);
	}
	public void clickcountry() throws InterruptedException {
		country.click();
		Thread.sleep(2000);
	}
	public void clickcity() throws InterruptedException {
		city.click();
		Thread.sleep(2000);
	}
	public void clickcreditcard() throws InterruptedException {
		creditcard.click();
		Thread.sleep(2000);
	}
	public void clickmonth() throws InterruptedException {
		month.click();
		Thread.sleep(2000);
	}
	public void clickyear() throws InterruptedException {
		year.click();
		Thread.sleep(2000);
	
	}
	public void clicknameEnterText(String pValue) {
		objWrapper.enterText(pValue,pSignupName , driver);
	}
	
	public void clickcountryEnterText(String pValue) {
		objWrapper.enterText(pValue, country, driver);
	}
	
	public void clickcityEnterText(String pValue) {
		objWrapper.enterText(pValue, city, driver);
	}
	public void clickcreditcardEnterText(String pValue) {
		objWrapper.enterText(pValue, creditcard, driver);
	}
	public void clickmonthEnterText(String pValue) {
		objWrapper.enterText(pValue, month, driver);
	}
	public void clickyearEnterText(String  pValue) {
		objWrapper.enterText(pValue, year, driver);
		
	}
	
	
		
	
	
	public void clickphone() {
    phone.click();
	}
	
	public void  Laptops() {
		Laptops.click();
	}
	public void clickMonitors() {
		Monitors.click();
	}
	public void clickApplemonitors() {
		AppleMonitor.click();
		
	}
	public void clickAsusFullhd() {
		AsusFullHd.click();
	}
	public void clickAboutUsButton() {
		clickAboutUsButton();
	}
	  
	
	public void clickvaioi5() {
		vaioi5.click();
	}
	public void clickvaioi7() {
		vaioi7.click();
	}
	public void clickMacBookair() {
		MacBookair.click();
	}
	
	public void clickDelli78gb() {
		Delli78gb.click();
			
		}
	
	}
	
	
	
		
	

		
	
	
	
	

	
		
	
		
	
	

	
	
	
	
	
	


		
	
	
		
	





			
		
	
		
		
	
		

		
		

