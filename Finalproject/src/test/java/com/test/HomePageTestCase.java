package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.Page.HomePage;

@Test
public class HomePageTestCase extends TestBase {
          HomePage homePage;
	
	public HomePageTestCase() {
		super();	
	}
	@BeforeMethod
	@BeforeClass
	public void setUp() {
		initialization();
		homePage = new HomePage();
	}
	@Test
	public void clickSignUpButton() throws InterruptedException {
		homePage.clickSignUpButton();
		homePage.clickSignUpCloseButton();
		homePage.SignUpUsernameEnterText("Sreekala");
		homePage.SignUpPasswordEnterText("12345");
	}
	@Test
	public void clickLoginButtonpButton() throws InterruptedException {
		homePage.clickLoginButton();
		homePage.clickLoginCloseButton();
		homePage.loginUsernameEnterText("Sreekala");
		homePage.loginPasswordEnterText("12345");
	}
	
	@Test
	public void clickContactButton() throws InterruptedException {
		homePage.clickContactButton();
		homePage.contactEmailEnterText("24517");
		homePage.contactNameEnterText("Sreekala");
		homePage.meaasgeEnterText("message");
}
	@Test
	public void clickCartButton() throws InterruptedException {
		homePage.clickCartButton();
	}
	@Test
	public void clickAboutUsButton() throws InterruptedException {
		homePage.clickAboutUsButton();
	}
}