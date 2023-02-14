package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class SignUp extends TestBase {
	Wrapper objWrapper = new Wrapper();

	@FindBy(xpath = "//a[@class='navbar-brand']")
	WebElement pHomePageHeading;

	@FindBy(id = "signin2")
	WebElement pSignUpButton;

	@FindBy(id = "sign-username")
	WebElement pSignUpUserName;

	@FindBy(id = "sign-password")
	WebElement pSignUpPassword;

	@FindBy(xpath = "(//button[@type='button'])[6]")
	WebElement pSignUp;

	@FindBy(xpath = "(//button[@type='button'])[5]")
	WebElement pSignUpCloseButton;

	public SignUp() {
		PageFactory.initElements(driver, this);
	}

	public void URLClick() {
		pHomePageHeading.click();
	}

	public void clickSignUpButton() throws InterruptedException {
		pSignUpButton.click();
		Thread.sleep(1000);
	}

	public void signUpUserNameEnterText(String pValue) {
		objWrapper.enterText(driver, pSignUpUserName, "Diyababy");
	}

	public void signUpPasswordEnterText(String pValue) {
		objWrapper.enterText(driver, pSignUpPassword, "diyababy123");
	}

	public void clickSignUpCloseButton() {
		pSignUpCloseButton.click();
	}

	public void clickAlertSignUp() {
		objWrapper.alert(driver);
	}

	public void clickSignUp() {
		objWrapper.waitForElement(driver, pSignUp);
		pSignUp.click();
	}

	public void signUpUsernameClearText() {
		objWrapper.clearText(driver, pSignUpUserName);
	}

	public void signUpPasswordClearText() {
		objWrapper.clearText(driver, pSignUpPassword);
	}

}
