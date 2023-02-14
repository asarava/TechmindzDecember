package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase {

	Wrapper objWrapper = new Wrapper();

	@FindBy(xpath = "//img[@src='bm.png']")
	WebElement logo;
	@FindBy(xpath = "//a[@href='index.html']")
	WebElement pHome;
	@FindBy(xpath = "//*[text()='Contact']")
	WebElement pContactButton;
	@FindBy(xpath = "//*[text()='Contact Email:']")
	WebElement pVerifyContact;
	@FindBy(xpath = "(//*[text()='Close'])[1]")
	WebElement pContactCloseButton;
	@FindBy(id = "recipient-email")
	WebElement pContacteMail;
	@FindBy(id = "recipient-name")
	WebElement pContactName;
	@FindBy(id = "message-text")
	WebElement pContactMessage;
	@FindBy(xpath = "//*[text()='Send message']")
	WebElement pSendMessage;
	@FindBy(xpath = "(//*[text()='About us'])[2]")
	WebElement pAboutUs;
	@FindBy(xpath = "(//*[text()='About us'])[1]")
	public WebElement pVerifyAboutUs;
	@FindBy(xpath = "//button[@title='Play Video']")
	WebElement pPlayAboutUs;
	@FindBy(xpath = "//button[@title='Pause']")
	WebElement pPauseAboutUs;
	@FindBy(xpath = "//button[@title='Fullscreen']")
	WebElement pFullscreenAboutUs;
	@FindBy(xpath = "//button[@title='Non-Fullscreen']")
	WebElement pExitFullscreenAboutUs;
	@FindBy(xpath = "(//*[text()='Close'])[4]")
	WebElement pCloseAboutUs;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

	public boolean isLogoDisplayed() {
		return logo.isDisplayed();
	}

	// <........................................Contact..............................>
	public String clickContactButton() {
		pContactButton.click();
		objWrapper.waitForElement(driver, pVerifyContact);
		String pActualText = pVerifyContact.getText();
		return (pActualText);
	}

	public void clickContactCloseButton() {
		objWrapper.waitForElement(driver, pContactCloseButton);
		pContactCloseButton.click();
	}

	public void contactMsgEnterMail(String pValue) {
		objWrapper.waitForElement(driver, pContacteMail);
		objWrapper.enterText(pValue, pContacteMail, driver);
	}

	public void contactMsgEnterName(String pValue) {
		objWrapper.waitForElement(driver, pContactName);
		objWrapper.enterText(pValue, pContactName, driver);
	}

	public void contactMsgEnterMsg(String pValue) {
		objWrapper.waitForElement(driver, pContactMessage);
		objWrapper.enterText(pValue, pContactMessage, driver);
	}

	public void clickContactSendMsg() {
		objWrapper.waitForElement(driver, pSendMessage);
		pSendMessage.click();
	}

	public void clickContactAlert() {
		objWrapper.alertMessage(driver);
	}

	// <........................About Us.......................>

	public void clickAboutUs() {
		objWrapper.waitForElement(driver, pAboutUs);
		pAboutUs.click();
		}
	public String clickVerifyAbtus() {
		String pActualText = pVerifyAboutUs.getText();
		return (pActualText);
	}

	public void clickPlayAboutUs() {
		pPlayAboutUs.click();
	}

	public void clickPauseAboutUs() {
		pPauseAboutUs.click();
	}

	public void clickFullscreenAboutUs() {
		pFullscreenAboutUs.click();

	}

	public void clickNonFullscreenAboutUS() {
		objWrapper.waitForElement(driver, pExitFullscreenAboutUs);
		pExitFullscreenAboutUs.click();
	}

	public void clickCloseAboutUs() {
		objWrapper.waitForElement(driver, pCloseAboutUs);
		pCloseAboutUs.click();
	}

	public void clickHomeButton() {
		objWrapper.waitForElement(driver, pHome);
		pHome.click();
	}

}
