package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class LogIn extends TestBase {
Wrapper objWrapper = new Wrapper();
	
@FindBy(id = "login2")
WebElement pLogInButton;

@FindBy (xpath = "(//input[@type='text'])[4]")
WebElement pLoginUserName;

@FindBy (xpath = "(//input[@type='password'])[2]")
WebElement pLogInPassword;

@FindBy (xpath = "(//button[@type='button'])[9]")
WebElement pClickLogIn;

@FindBy (xpath = "(//*[text()='Close'])[3]")
WebElement pcloseButton;

@FindBy (xpath = "(//button[@type='button'])[8]")
WebElement pLogInCloseButton;

@FindBy (id = "logout2")
WebElement pLogout;

	public LogIn() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogInButton() throws InterruptedException {
		pLogInButton.click();
		Thread.sleep(1000);
	}

	public void logInUserNameEnterText (String pValue) {
		objWrapper.enterText(driver, pLoginUserName, "Diyababy");
	}
	
	public void logInPasswordEnterText (String pValue) {
		objWrapper.enterText(driver, pLogInPassword, "diyababy123");
		
	}
	
	public void clickLogIn () {
		objWrapper.waitForElement(driver, pClickLogIn);
		pClickLogIn.click();
	}
	
    public void logInClearText () {
    	objWrapper.clearText(driver, pLoginUserName);
    }
    
    public void logInClearText1 () {
    	objWrapper.clearText(driver, pLogInPassword);
    }
	
	public void clickLogInCloseButton() {
		objWrapper.waitForElement(driver, pLogInCloseButton);
		pLogInCloseButton.click();
	}
	
	public void logOut() {
		objWrapper.waitForElement(driver, pLogout);
		pLogout.click();
	}
	
	

	
	
	
	
	
}
