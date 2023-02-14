package com.test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;
import com.utilities.Utilities;
import com.wrapper.Wrapper;

public class DBTestCases extends TestBase {
	HomePage homePage;

	public DBTestCases() {
		super();
	}

	Wrapper objWrapper = new Wrapper();
	Utilities objUtilities = new Utilities();

	@BeforeClass
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}

	@DataProvider(name = "dataprovider")
	public Object[][] dpMethod() {
		return new Object[][] { { "lal13@gmailcom", "lal38", "hai developer xyz546fgh message" } };
	}

	@DataProvider(name = "dataprovider1")
	public Object[][] dpMethod1() {
		return new Object[][] { { "", "", "" } };
	}

	@Test(priority = 1)
	public void verifyTitle() {
		Assert.assertEquals(homePage.validateHomePageTitle(), "STORE", "Title is correct");
	}

	@Test(priority = 2)
	public void verifyLogo() {
		Assert.assertTrue(homePage.isLogoDisplayed());
	}

	@Test(priority = 3)
	public void checkAboutUsAccess() {
		homePage.clickAboutUs();
		String pActualAbtUsText = homePage.clickVerifyAbtus();
		Assert.assertEquals(pActualAbtUsText, "About us", "About us page is not as expected - Assert Failed");
	}

	@Test(priority = 4)
	public void checkVideoPlayAboutUs() {
		homePage.clickPlayAboutUs();
	}

	@Test(priority = 5)
	public void checkVideoPauseAboutUs() {
		homePage.clickPauseAboutUs();
	}

	@Test(priority = 6)
	public void checkVideoFullscreenAboutUs() {
		homePage.clickFullscreenAboutUs();
	}

	@Test(priority = 7)
	public void checkVideoCloseAboutUs() {
		homePage.clickNonFullscreenAboutUS();
		homePage.clickCloseAboutUs();
	}

	@Test(priority = 8)
	public void checkContactAccess() {
		String pActualContactText = homePage.clickContactButton();
		Assert.assertEquals(pActualContactText, "Contact Email:", "Contact page is not as expected - Assert Failed");
	}

	@Test(priority = 9, dataProvider = "dataprovider")
	public void checkContactMsgWthValidData(String a, String b, String c) {
		homePage.contactMsgEnterMail(a);
		homePage.contactMsgEnterName(b);
		homePage.contactMsgEnterMsg(c);
		homePage.clickContactSendMsg();
		homePage.clickContactAlert();
	}

	@Test(priority = 10, dataProvider = "dataprovider1")
	public void checkContactMsgWthInValidData(String a, String b, String c) {
		homePage.contactMsgEnterMail(a);
		homePage.contactMsgEnterName(b);
		homePage.contactMsgEnterMsg(c);
		homePage.clickContactSendMsg();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String pAlertText = alert.getText();
		Assert.assertEquals(pAlertText, "Message cannot be send", "Contact Detail is blank - Assert Failed");
	}

}
