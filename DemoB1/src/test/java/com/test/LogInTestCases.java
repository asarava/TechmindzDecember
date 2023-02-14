package com.test;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.LogInPage;
import com.utilities.Utilities;
import com.wrapper.Wrapper;

public class LogInTestCases extends TestBase {
	LogInPage logInPage;

	public LogInTestCases() {
		super();
	}

	Wrapper objWrapper = new Wrapper();

	@BeforeClass
	public void setUp() {
		logInPage = new LogInPage();
	}

	@DataProvider(name = "dataprovider1")
	public Object[][] dpMethod1() throws InvalidFormatException {
		Object newTestData[][] = Utilities.getTestData("Sheet1");
		return newTestData;
	}

	@Test(priority = 1, dataProvider = "dataprovider1")

	public void clickOnLoginButton(String a, String b) {
		logInPage.clickLoginButton();
		logInPage.loginEnterUserName(a);
		logInPage.loginEnterPassword(b);
		logInPage.clickLogin();
		// logInPage.clickLoginAlert();
		// logInPage.clickLogInCloseButton();
	}

	@Test(priority = 2)
	public void userNameVerification() {
		String pActualText = logInPage.clickLoginVerify().split(" ")[1];
		Assert.assertEquals(pActualText, "koil", "User Name is not as expected - Assert Failed");
	}
}
