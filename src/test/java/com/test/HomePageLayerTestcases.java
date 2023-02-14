package com.test;



import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.Utilities;

public class HomePageLayerTestcases extends TestBase {
     HomePage homePage;
     Utilities objUtilities;
     public ExtentReports extent;
     public ExtentTest extentTest;
	public HomePageLayerTestcases() {
		super();
	}
	@BeforeTest
	public void setExtent() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "Sohail ");
		extent.addSystemInfo("User Name", "Sohail");
		extent.addSystemInfo("Environment", "Testing");
		}
	@BeforeClass
	public void setUp(){
		initialization();
		homePage=new HomePage();
		objUtilities=new Utilities();	
	}
	
	@Test(priority=1)
	public void clickOnAboutus() throws InterruptedException {
		extentTest=extent.startTest("clickOnAboutus");
		homePage.clickOnAboutUs();
		Assert.assertTrue(driver.getPageSource().contains("About"));
		homePage.clickOnCloseAboutus();	
	}
	@Test(priority=2)
	public void clickOnContactButton() throws InterruptedException {
		extentTest=extent.startTest("clickOnContactButton");
		homePage.clickContactButton();
		homePage.contactEmailEnterText("Testmail");
		homePage.contactNameEnterText("Testname");
		homePage.contactMessageEnterText("Testmessage");
		homePage.clickSendMessage();
		Thread.sleep(2000);
		String expected="Thanks for the message!!";
		Alert alert=driver.switchTo().alert();
		String actual=alert.getText();
		Assert.assertEquals(actual, expected);
		homePage.clickAlertOnSendMessage();
}
	@Test(priority=3)
	public void clickOnLaptop() throws InterruptedException {
		extentTest=extent.startTest("clickOnLaptop");
		homePage.clickOnLaptopLink();
		Assert.assertTrue(driver.getPageSource().contains("Sony"));
	}
	@Test(priority=4)
    public void clickOnMonitor() throws InterruptedException {
    	extentTest=extent.startTest("clickOnMonitor");
    	homePage.clickOnMonitorLink();	
    	Assert.assertTrue(driver.getPageSource().contains("LED"));
    }
	@Test(priority=5)
	public void clickOnPhone() throws InterruptedException {
		extentTest=extent.startTest("clickOnPhone");
		homePage.clickOnPhoneLink();
    	Assert.assertTrue(driver.getPageSource().contains("Nokia"));
	}
	@Test(priority=6)
	public void clickToCart() throws InterruptedException {
		extentTest=extent.startTest("clickToCart");
		homePage.clickOnCart();
		Assert.assertTrue(driver.getPageSource().contains("Products"));	
	}
	@Test(priority=7)
	public void clickOnHome() throws InterruptedException {
		extentTest=extent.startTest("clickOnHome");
		homePage.clickOnHome();
		Assert.assertTrue(driver.getPageSource().contains(" PRODUCT STORE"));	
	}
	@Test(priority=21)
	public void ClickOnProduct() throws InterruptedException {
		extentTest=extent.startTest("ClickOnProduct");
		homePage.clickOnHome();
	    homePage.clickProductDescription();
	    Thread.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains("Qualcomm"));
		
	}
    @Test(priority=22)
	public void AddProduct() throws InterruptedException {
		extentTest=extent.startTest("AddProduct");
		homePage.clickOnHome();
		homePage.clickOnProduct();
		
		homePage.AddToCart();
		homePage.clickAlertSignup();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains("Samsung"));
	}
	
	@Test(priority=10)
	public void PlaceOrderPresent() throws InterruptedException {
		extentTest=extent.startTest("PlaceOrderPresent");
		homePage.clickOnCart();
		homePage.PlaceOrderPresent();
		Assert.assertTrue(driver.getPageSource().contains("Place Order"));
		
	}
	
	@Test(priority=11)
	public void EmailAddressPresent() throws InterruptedException {
		extentTest=extent.startTest("EmailAddressPresent");
		homePage.clickOnHome();
		Assert.assertTrue(driver.getPageSource().contains("demo@blazemeter.com"));	
	}
	
	@Test(priority=12)
	public void PlaceOrderFields() throws InterruptedException {
		extentTest=extent.startTest("PlaceOrderFields");
		homePage.clickOnCart();
		homePage.ClickPlaceOrder();
		Assert.assertTrue(driver.getPageSource().contains("Name"));
		homePage.ClosePlaceOrder();
	}
	@Test(priority=13)
	public void SignUpButtonValid() throws InterruptedException {
		extentTest=extent.startTest("SignUpButtonValid");
		homePage.clickSignUpButton();
		homePage.clicksignupNameEnterText("@Demo12Testsohail");
		homePage.clicksignupPasswordEnterText("Password");
		Thread.sleep(1000);
		homePage.clicksignupButton();
		String expected="Sign up successful.";
		Alert alert=driver.switchTo().alert();
		String actual=alert.getText();
		Assert.assertEquals(actual, expected);
		homePage.clickAlertSignup();
		
	}
	@Test(priority=14)
	public void SignUpButtonexisting() throws InterruptedException {
		extentTest=extent.startTest("SignUpButtonexisting");
		Thread.sleep(2000);
		homePage.clickSignUpButton();
		homePage.clearUsername();
		homePage.clearPassword();
		homePage.clicksignupNameEnterText("Test");
		homePage.clicksignupPasswordEnterText("Password");
		homePage.clicksignupButton();
		String expected="This user already exist.";
		Alert alert=driver.switchTo().alert();
		String actual=alert.getText();
		Assert.assertEquals(actual, expected);
		homePage.clickAlertSignup();	
	}
		@Test(priority=15)
		public void SignUpWithUsername() throws InterruptedException {
			extentTest=extent.startTest("SignUpWithUsername");
			homePage.clearUsername();
			homePage.clearPassword();
			homePage.clicksignupNameEnterText("Test");
			homePage.clicksignupPasswordEnterText("");
			homePage.clicksignupButton();
			String expected="Please fill out Username and Password.";
			Alert alert=driver.switchTo().alert();
			String actual=alert.getText();
			Assert.assertEquals(actual, expected);
			homePage.clickAlertSignup();	
		}
		@Test(priority=16)
		public void SignUpWithPassword() throws InterruptedException {
			extentTest=extent.startTest("SignUpWithPassword");
			homePage.clearUsername();
			homePage.clearPassword();
			homePage.clicksignupNameEnterText("");
			homePage.clicksignupPasswordEnterText("test");
			homePage.clicksignupButton();
			String expected="Please fill out Username and Password.";
			Alert alert=driver.switchTo().alert();
			String actual=alert.getText();
			Assert.assertEquals(actual, expected);
			homePage.clickAlertSignup();	
		}
		@Test(priority=17)
		public void SignUpWithBlankSpace() throws InterruptedException {
			extentTest=extent.startTest("SignUpWithBlankSpace");
			homePage.clearUsername();
			homePage.clearPassword();
			homePage.clicksignupNameEnterText("");
			homePage.clicksignupPasswordEnterText("");
			homePage.clicksignupButton();
			String expected="Please fill out Username and Password.";
			Alert alert=driver.switchTo().alert();
			String actual=alert.getText();
			Assert.assertEquals(actual, expected);
			homePage.clickAlertSignup();
			homePage.clickSignUpCloseButton();
		}
	
	@Test(priority=18)
	public void ClickOnLogInButtonInvalid() throws InterruptedException {
		extentTest=extent.startTest("ClickOnLogInButtonInvalid");
		homePage.clickLoginButton();
		homePage.clickLoginUsername("Tatata");
		homePage.clickLoginPassword("yyy");
		homePage.clickLoginCreateButton();
		Thread.sleep(2000);
		String expected="User does not exist.";
		Alert alert=driver.switchTo().alert();
		String actual=alert.getText();
		Assert.assertEquals(actual, expected);
		homePage.clickAlertSignup();
		homePage.clickLoginClose();
	}
		@Test(priority=19)
		
		public void ClickOnLogInButtonInvalidCases() throws InterruptedException {
			extentTest=extent.startTest("ClickOnLogInButtonInvalidCases");
			homePage.clickLoginButton();
			homePage.clearUserNameLogin();
			homePage.clearPasswordLogin();
			homePage.clickLoginUsername("Tatata");
			homePage.clickLoginPassword("yyyeee");
			homePage.clickLoginCreateButton();
			Thread.sleep(2000);
			String expected="User does not exist.";
			Alert alert=driver.switchTo().alert();
			String actual=alert.getText();
			Assert.assertEquals(actual, expected);
			homePage.clickAlertSignup();
			homePage.clickLoginClose();
		}
		@Test(priority=20)
		public void ClickOnLogInButtonBlank() throws InterruptedException {
			extentTest=extent.startTest("ClickOnLogInButtonInvalidCases");
			homePage.clickLoginButton();
			homePage.clearUserNameLogin();
			homePage.clearPasswordLogin();
			homePage.clickLoginUsername("");
			homePage.clickLoginPassword("");
			homePage.clickLoginCreateButton();
			Thread.sleep(2000);
			String expected="Please fill out Username and Password.";
			Alert alert=driver.switchTo().alert();
			String actual=alert.getText();
			Assert.assertEquals(actual, expected);
			homePage.clickAlertSignup();
			homePage.clickLoginClose();
		}
	
	
 @AfterMethod
 public void tearDown(ITestResult result) throws IOException {
 if (result.getStatus() == ITestResult.FAILURE) {
 extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
 extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
 String screenshotPath = objUtilities.getScreenshot(driver, result.getName());
 extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
}
 else if (result.getStatus() == ITestResult.SKIP) {
 extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
} else if (result.getStatus() == ITestResult.SUCCESS) {
 extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
 String screenshotPath = objUtilities.getScreenshot(driver, result.getName());
 extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(screenshotPath));
}
 extent.endTest(extentTest);
}

 @AfterClass
 public void endReport() {
 extent.flush();
 extent.close();
 driver.quit();
}
}

