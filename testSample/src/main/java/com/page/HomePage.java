package com.page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Wrapper.Wrapper;
import com.base.TestBase;

public class HomePage extends TestBase {
	Wrapper objWrapper = new Wrapper();
	
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
     
     @FindBy(id="(button[@class='btn btn-primary'])[2]")
     WebElement pSignupButtonCreate;
     
     @FindBy(id="loginusername")
     WebElement pLoginName;
     
     @FindBy(id="loginpassword")
     WebElement pLoginPassword;
     
     @FindBy(id="(//button[@class='btn btn-primary'])[3]")
     WebElement pLoginCreate;
     
     @FindBy(xpath="(//*[text()='About us'])[2]")
     WebElement pAboutButton;
     
     @FindBy(xpath="//*[text()='Cart']")
     WebElement pCartButton;
     
     @FindBy(xpath="//*[text()='Phones']")
     WebElement pPhonesButton;
     
     @FindBy(xpath="//*[text()='Laptops']")
     WebElement pLaptopsButton;
     
     @FindBy(xpath="//*[text()='Monitors']")
     WebElement pMonitorsButton;
     
     @FindBy(id="//button[@class='btn btn-success']")
     WebElement pOrderButton;
     
     public HomePage() {
    	 PageFactory.initElements(driver,this);
     }
     public void clicksSignUpButton() {
     pSignUpButton.click();
}
     public void clicksLoginButton() {
         pLoginButton.click();
    }
     public void clicksLoginCloseButton(){
    	 objWrapper.waitForElement(driver,pLoginCloseButton);
         pLoginCloseButton.click();
    }
     public void clicksSignUpCloseButton(){
    	 objWrapper.waitForElement(driver,pSignUpCloseButton);
    	 pSignUpCloseButton.click();
    }
     public void clicksContactButton() {
         pContactButton.click();
     }
     public void contactEmailEnterText(String pvalue) {
    	 objWrapper.enterText(pvalue,pContactEmail,driver);
     }
     public void contactNameEnterText(String pvalue) {
    	 objWrapper.enterText(pvalue,pContactName,driver);
     }
     public void contactMessageEnterText(String pvalue) {
    	 objWrapper.enterText(pvalue,pContactMessage,driver);
     }
     public void clickSendMessage() throws InterruptedException {
    	 pSendMessage.click();
    	 Thread.sleep(2000);
    	 objWrapper.alert(driver);
     }
     public void clicksignupNameEnterText(String pvalue) {
    	 objWrapper.enterText(pvalue,pSignupName,driver);
     }
     public void clicksignupPasswordEnterText(String pvalue) {
    	 objWrapper.enterText(pvalue,pSignupPassword,driver);
     }
     public void clicksignupButton() {
    	 pSignupButtonCreate.click();
    	 objWrapper.dissmissAlert(driver);
     }
     public void clickLoginUsername(String pvalue) {
    	 objWrapper.enterText(pvalue,pLoginName,driver);
     }
     public void clickLoginPassword(String pvalue) {
    	 objWrapper.enterText(pvalue,pLoginPassword,driver);
     }
     public void clickLoginCreateButton()throws InterruptedException{
    	 pLoginCreate.click();
    	 Thread.sleep(2000);
    	 objWrapper.alert(driver);
     }
     public void clicksAboutButton() {
         pAboutButton.click();
     }
     public void clicksCartButton() {
         pCartButton.click();
     }
     public void clicksPhonesButton() {
         pPhonesButton.click();
     }
     public void clicksLaptopsButton() {
         pLaptopsButton.click();
     }
     public void clicksMonitorsButton() {
         pMonitorsButton.click();
     }
     public void clicksOrderButton()throws InterruptedException {
         pOrderButton.click();
    	 Thread.sleep(2000);
    	 objWrapper.alert(driver);
     }
     
}
