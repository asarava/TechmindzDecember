package com.homepagetestcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;

public class HomePageTestCases extends TestBase{
	
	HomePage homePage;
	
	public HomePageTestCases() {
		super();
	}
	@BeforeClass
	public void setUp() {
		initialization();
		homePage =new HomePage();
	}
	@Test(priority = 0)
	public void ClickSignupButton() {
		homePage.ClickSignUp();
	}
	@Test(priority = 1)
	  public void signup() {
		  homePage.SignUp("Test");
	  }
	@Test(priority = 2)
	public void ClickSCloseButton() {
		homePage.ClickSClose();
	}
	@Test(priority = 3)
	public void loginClick() {
		homePage.ClickLogin();
	}
	 @Test(priority = 4)
	  public void Login() {
		  homePage.EnterUserName("Test");
		  homePage.EnterPassword("Test");
		  homePage.Login();
		  homePage.ClearText(null);
	  }
	@Test(priority = 5)
	public void ClickLCloseButton() {
		homePage.ClickLClose();
	}
	@Test(priority = 6)
	public void AboutUs() {
		homePage.AboutUs();
	}
	@Test(priority = 7)
	public void CloseAboutUs() {
		homePage.CloseAbout();
	}
	@Test(priority = 8)
	public void Contact() {
		homePage.Contact();
		homePage.EnterMail("TestMail");
		 homePage.EnterName("TestName"); 
		 homePage.EnterMessage("TestMessage");
	}
  @Test(priority = 9) 
      public void Sendmessage() {
	  homePage.sendmessage();
	  } 
  @Test(priority = 10) 
  	  public void ClickCart() {
	  homePage.Cart();
	  } 
  @Test (priority = 11)
  	  public void Home() {
	  homePage.Home();
  }
}
