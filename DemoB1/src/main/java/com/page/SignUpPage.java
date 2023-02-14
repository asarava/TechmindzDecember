package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class SignUpPage extends TestBase {

	Wrapper objWrapper = new Wrapper();

	@FindBy(xpath = "//a[@href='index.html']")
	WebElement pHome;
	@FindBy(id = "signin2")
	WebElement pSignUpButton;
	@FindBy(id = "sign-username")
	WebElement pSignUpUserName;
	@FindBy(id = "sign-password")
	WebElement pSignUpPassword;
	@FindBy(xpath = "(//*[text()='Sign up'])[2]")
	WebElement pSignUp;
	@FindBy(xpath = "//button[text()='Sign up']")
	WebElement pVerifySignUp;
	@FindBy(xpath = "(//*[text()='Close'])[2]")
	WebElement pSignUpCloseButton;

	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickSignUpButton() {
		pSignUpButton.click();
	}

	public String verifySignUp() {
		objWrapper.waitForElement(driver, pSignUp);
		String pActualText = pSignUp.getText();
		return (pActualText);
	}

	public void clickSignUpCloseButton() {
		objWrapper.waitForElement(driver, pSignUpCloseButton);
		pSignUpCloseButton.click();
	}

	public void clearSignUpUName() {
		objWrapper.clearText(pSignUpUserName);
	}

	public void signUpEnterUserName(String pValue) {
		objWrapper.enterText(pValue, pSignUpUserName, driver);
	}

	public void clearSignUpPwd() {
		objWrapper.clearText(pSignUpPassword);
	}

	public void signUpEnterPassword(String pValue) {
		objWrapper.enterText(pValue, pSignUpPassword, driver);
	}

	public void clickSignUp() {
		// objWrapper.waitForElement(driver, pSignUp);
		pSignUp.click();
	}

	/*
	 * public void clickSignUpAlert() { objWrapper. waitForAlert(driver);
	 * objWrapper.alertMessage(driver); }
	 */

	public void clickHomeButton() {
		objWrapper.waitForElement(driver, pHome);
		pHome.click();
	}
}
