package com.test;

import org.testng.annotations.Test;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import com.base.TestBase;
import com.page.SignUpPage;
import com.utilities.Utilities;
import com.wrapper.Wrapper;

public class SignUpTestCases extends TestBase {
	SignUpPage signUpPage;

	public SignUpTestCases() {
		super();
	}

	Wrapper objWrapper = new Wrapper();

	@BeforeClass
	public void setUp() {
		signUpPage = new SignUpPage();
	}

	@DataProvider(name = "dataprovider1")
	public Object[][] dpMethod1() throws InvalidFormatException {
		Object newTestData[][] = Utilities.getTestData("Sheet1");
		return newTestData;
	}

	@DataProvider(name = "dataprovider2")
	public Object[][] dpMethod2() {
		return new Object[][] { { "555dong", "874561621" } };
	}

	@DataProvider(name = "dataprovider3")
	public Object[][] dpMethod3() {
		return new Object[][] { { "yeah", "" } };
	}

	@DataProvider(name = "dataprovider4")
	public Object[][] dpMethod4() {
		return new Object[][] { { "", "12345" } };
	}

	@Test(priority = 1)
	public void verifySignUpAccess() {
		signUpPage.clickSignUpButton();
		String pActualText = signUpPage.verifySignUp();
		Assert.assertEquals(pActualText, "Sign up", "Sign Up Page is not as expected - Assert Failed");
		signUpPage.clickSignUpCloseButton();
	}

	@Test(priority = 2, dataProvider = "dataprovider1")
	public void verifyValidSignUp(String a, String b) {
		signUpPage.clickSignUpButton();
		signUpPage.signUpEnterUserName(a);
		signUpPage.signUpEnterPassword(b);
		signUpPage.clickSignUp();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		Assert.assertEquals(actualText, "Sign up successful.", "Assert Failed - Unsuccessful sign up");
		alert.accept();
		signUpPage.clickSignUpCloseButton();
		
	}

	@Test(priority = 3, dataProvider = "dataprovider2",enabled = false)
	public void verifyExistingSignUpData(String a, String b) {
		signUpPage.clickSignUpButton();
		signUpPage.clearSignUpUName();
		signUpPage.clearSignUpPwd();
		signUpPage.signUpEnterUserName(a);
		signUpPage.signUpEnterPassword(b);
		signUpPage.clickSignUp();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		Assert.assertEquals(actualText, "This user already exist.", "Assert Failed - Unsuccessful sign up");
		alert.accept();
		signUpPage.clickSignUpCloseButton();
	}

	@Test(priority = 4, dataProvider = "dataprovider3",enabled = false)
	public void verifySignUpDataWthBlankPasswd(String a, String b) {
		signUpPage.clickSignUpButton();
		signUpPage.clearSignUpUName();
		signUpPage.clearSignUpPwd();
		signUpPage.signUpEnterUserName(a);
		signUpPage.signUpEnterPassword(b);
		signUpPage.clickSignUp();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		Assert.assertEquals(actualText, "Please fill out Username and Password.",
				"Assert Failed - Unsuccessful sign up");
		alert.accept();
		signUpPage.clickSignUpCloseButton();
	}

	@Test(priority = 5, dataProvider = "dataprovider4",enabled = false)
	public void verifySignUpDataWthBlankUname(String a, String b) {
		signUpPage.clickSignUpButton();
		signUpPage.clearSignUpUName();
		signUpPage.clearSignUpPwd();
		signUpPage.signUpEnterUserName(a);
		signUpPage.signUpEnterPassword(b);
		signUpPage.clickSignUp();
		objWrapper.waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		String actualText = alert.getText();
		Assert.assertEquals(actualText, "Please fill out Username and Password.","Assert Failed - Unsuccessful sign up");
		alert.accept();
		signUpPage.clickSignUpCloseButton();
	}

}
