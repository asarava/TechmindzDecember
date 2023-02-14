package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class Contact extends TestBase {
Wrapper objWrapper = new Wrapper();

public Contact() {
	PageFactory.initElements(driver, this);
}

@FindBy (xpath = "(//a[@class='nav-link'])[2]")
WebElement pContactButton;

@FindBy (id = "recipient-email")
WebElement pContactEmail;

@FindBy (id ="recipient-name")
WebElement pContactName;

@FindBy (id ="message-text")
WebElement pContactMessage;

@FindBy (xpath = "(//button[@type='button'])[3]")
WebElement pSendMessage;

@FindBy (xpath = "(//button[@type='button'])[2]")
WebElement pContactClose;

private String pValue;

public void clickContactButton() {
	objWrapper.waitForElement(driver, pContactButton);
	pContactButton.click();
}

public void contactEmailEnterText (String pValue) {
	objWrapper.enterText(driver, pContactEmail, pValue);
	}

public void contactNameEnterText (String pValue) {
objWrapper.enterText(driver, pContactName, pValue);
}

public void contactMessageEnterText (String pValue) {
	objWrapper.enterText(driver, pContactMessage, pValue);
	}

public void clickSendMessage() {
	objWrapper.waitForElement(driver, pSendMessage);
	pSendMessage.click();
}

public void clickContactCloseButton() {
	objWrapper.waitForElement(driver, pContactClose);
	pContactClose.click();
}

}