package com.Page;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.TestBase;
import com.Wrapper.Wrapper;

public class HomePage extends TestBase {
	Wrapper objWrapper = new Wrapper();
	
	@FindBy(id= "signin2")
	WebElement pSignUpButton;
	
	@FindBy(xpath = "(//*[@type='button'])[5]" )
    WebElement pCloseButton1;
	
	@FindBy(id ="sign-username")
	WebElement pUsername;
	
	@FindBy(id ="sign-password")
	WebElement pPassword;
	
	@FindBy(id= "login2")
	WebElement pLoginButton;
	
	@FindBy(xpath = "(//*[@type='button'])[8]" )
    WebElement pCloseButton2;
	
	@FindBy(id ="loginusername")
	WebElement pUsername1;
	
	@FindBy(id="loginpassword")
	WebElement pPassword1;
	
	@FindBy(xpath = "(//*[@class='nav-link'])[2]" )
    WebElement pContactButton;
	
	@FindBy(id ="recipient-email")
	WebElement pContactEmail;
	
	@FindBy(id ="recipient-name")
	WebElement pContactName;
	
	@FindBy(id ="message-text")
	WebElement pMessage;
	
	@FindBy(id ="cartur")
	WebElement pCartButton;
	
	@FindBy(id ="narvbarx")
	WebElement pAboutUsButton;
   
	
	public HomePage() {
		PageFactory.initElements(driver,this);
}
	public void clickSignUpButton() {
		 pSignUpButton.click();
	}
	public void clickSignUpCloseButton() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(pCloseButton1));
		 pCloseButton1.click();
		 Thread.sleep(10000);
	}
	
	
	public void SignUpUsernameEnterText(String pValue) {
		objWrapper.enterText(pValue, pUsername, driver);
	}
	public void SignUpPasswordEnterText(String pValue) {
		objWrapper.enterText(pValue, pPassword, driver);
	}
	public void clickLoginButton() {
		 pLoginButton.click();
	}
	
	public void clickLoginCloseButton() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(pCloseButton2));
		 pCloseButton2.click();
	}
	public void loginUsernameEnterText(String pValue) {
		objWrapper.enterText(pValue, pUsername1, driver);
	}
	public void loginPasswordEnterText(String pValue) {
		objWrapper.enterText(pValue, pPassword1, driver);
	}
	
	public void clickContactButton() {
		pContactButton.click();
	}
	public void contactNameEnterText(String pValue) {
		objWrapper.enterText(pValue,pContactName,driver);
	}
	public void contactEmailEnterText(String pValue) {
		
		objWrapper.enterText(pValue,pContactEmail,driver);
	}
	public void meaasgeEnterText(String pValue) {
		
		objWrapper.enterText(pValue,pMessage,driver);
	}
	public void clickCartButton() {
		 pCartButton.click();
    }
	public void clickAboutUsButton() {
		 pAboutUsButton.click();
}
	
}
