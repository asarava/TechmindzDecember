package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

public class HomePageTestCases extends TestBase {
	HomePage homePage;
	public HomePageTestCases() {
		super();
	}
    @BeforeClass
    public void setUp() {
    	initilization();
    	homePage = new HomePage();
    }
//    @Test
//    public void clickOnSignUp() {
//    	homePage.clickSignUpButton();
//    }
//     @Test
//    public void clickOnLoginButton() {
//    	homePage.clickInCloseButton();
//    }
    @Test(enabled = false)
    public void clickOnContactButton() {
    	homePage.clickContactButton();
    	homePage.contactEmailEnterText("Test Email");
    	homePage.contactNameEnterText("Test Name");
    	homePage.MessageEnterText("Test Message");
    }
}