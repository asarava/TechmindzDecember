package com.loginpagetestcases;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;
import com.wrapper.Wrapper;

public class LoginPageTestCases extends TestBase{
	HomePage loginPage;
	Wrapper objWrapper=new Wrapper();
	public  LoginPageTestCases() {
		super();
	}
	@BeforeClass
	public void setUp() {
		initialization();
		loginPage =new HomePage();
	}
	@Test(enabled=false)
	public void alertMessage() {
		loginPage.ClickLogin();
		loginPage.EnterUserName("Test");
		loginPage.EnterPassword("Test");
		loginPage.LoginTest();
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		Assert.assertEquals(alertText,"Wrong password.");
	}
	@Test(priority = 0)
	public void Login() {
		loginPage.ClickLogin();
		loginPage.EnterUserName("Test123");
		loginPage.EnterPassword("Test123");
		loginPage.LoginTest();
		Assert.assertEquals(loginPage.Logout(), true);
	}
	@Test(priority = 1)
	public void AddProduct() {
		loginPage.AddProduct();
	}
	@Test (priority = 2)
	  public void ClickCart() {
	  loginPage.Cart();
	  Assert.assertEquals(loginPage.cartValidation(), true);
	  } 
	@Test(priority = 3)
	public void DeleteProduct() {
		loginPage.DeleteProduct();
	}
	@Test(priority = 4,enabled = false)
	public void validateDelete() {
		loginPage.validateDelete();
		Assert.assertEquals(loginPage.validateDelete(), false);
	}

}