package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class LogInPage extends TestBase {

	Wrapper objWrapper = new Wrapper();

	@FindBy(xpath = "//a[@href='index.html']")
	WebElement pHome;
	@FindBy(id = "login2")
	WebElement pLoginButton;
	@FindBy(id = "loginusername")
	WebElement pLoginUserName;
	@FindBy(id = "loginpassword")
	WebElement pLoginPassword;
	@FindBy(xpath = "(//*[text()='Log in'])[2]")
	WebElement pLogin;
	@FindBy(xpath = "(//*[text()='Close'])[3]")
	WebElement pLogInCloseButton;
	@FindBy(xpath = "//a[@id='nameofuser']")
	WebElement pGetUserName;
	@FindBy(xpath = "//*[text()='Log out']")
	WebElement pLogOut;

	public LogInPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickLoginButton() {
		objWrapper.waitForElement(driver, pLoginButton);
		pLoginButton.click();
	}
	public String clickLoginVerify() {
		objWrapper.waitForElement(driver, pGetUserName);
		String pActualText = pGetUserName.getText();
		return (pActualText);
	}
	public void clickLogInCloseButton() {
		objWrapper.waitForElement(driver, pLogInCloseButton);
		pLogInCloseButton.click();
	}

	// <-----Login Enter Text----->
	public void clearLoginUName() {
		objWrapper.clearText(pLoginUserName);
	}

	public void loginEnterUserName(String pValue) {
		objWrapper.enterText(pValue, pLoginUserName, driver);
	}

	public void clearLoginPwd() {
		objWrapper.clearText(pLoginPassword);
	}

	public void loginEnterPassword(String pValue) {
		objWrapper.enterText(pValue, pLoginPassword, driver);
	}

	public void clickLogin() {
		pLogin.click();
	}

	public void clickLoginAlert() {
		// objWrapper. waitForAlert(driver);
		objWrapper.alertMessage(driver);
		}

	public void clickLogOutButton() {
		pLogOut.click();
	}

}
