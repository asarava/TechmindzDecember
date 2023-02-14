package com.test;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.page.AboutUs;
import com.page.Contact;
import com.page.HomePage;
import com.page.LogIn;
import com.page.SignUp;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.Utilities;
import com.wrapper.Wrapper;

public class TestCases extends TestBase {
	SignUp homePage;
	LogIn homePage1;
	AboutUs homePage2;
	Contact homePage3;
	HomePage homePage4;
	Wrapper objWrapper;
	Utilities objUtilities;

	public ExtentReports extent;
	public ExtentTest extentTest;

	public TestCases() {
		super();
	}

	@BeforeTest
	public void setExtent() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.html", true);
		extent.addSystemInfo("Host Name", "Revathy C");
		extent.addSystemInfo("User Name", "Revathy C");
		extent.addSystemInfo("Environment", "Final Project");
	}

	@BeforeClass
	public void SetUp() {
		initialization();
		homePage = new SignUp();
		homePage1 = new LogIn();
		homePage2 = new AboutUs();
		homePage3 = new Contact();
		homePage4 = new HomePage();
		objUtilities = new Utilities();
		objWrapper = new Wrapper();
	}

//URL access
	@Test(priority=1)
	public void URLAccess() {
		extentTest = extent.startTest("URLAccess");
		homePage.URLClick();
	}

//SignUp with existing UserName and password
	@Test(priority=2)
	public void signupWithExistingUsernameAndPassword() throws InterruptedException {
		extentTest = extent.startTest("signupWithExistingUsernameAndPassword");
		homePage.clickSignUpButton();
		homePage.signUpUserNameEnterText("Diyababy");
		homePage.signUpPasswordEnterText("diyababy123");
		homePage.clickSignUp();
		objWrapper.waitForAlert(driver);
		String expected = "This user already exist.";
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.print(alertText);
		Assert.assertEquals(alertText, expected); 
		alert.accept(); 
		homePage.signUpUsernameClearText();
		homePage.signUpPasswordClearText();
		homePage.clickSignUpCloseButton();

	}

//SignUp with UserName only
	@Test(priority=3)
	public void SignUpWithUserNameOnly() throws InterruptedException {
		extentTest = extent.startTest("SignUpWithUserNameOnly");
		homePage.clickSignUpButton();
		homePage.signUpUserNameEnterText("Diyababy");
		homePage.clickSignUp();
		objWrapper.waitForAlert(driver);
		String expected = "Please fill out Username and Password.";
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		// String actual = alert.getText();
		Assert.assertEquals(alertText, expected);
		alert.accept(); 
		homePage.signUpUsernameClearText();
		homePage.clickSignUpCloseButton();
	}

//SignUp with Password only
	@Test(priority=4)
	public void SignUpWithPasswordOnly() throws InterruptedException {
		extentTest = extent.startTest("SignUpWithPasswordOnly");
		homePage.clickSignUpButton();
		homePage.signUpPasswordEnterText("diyababy123");
		homePage.clickSignUp();
		objWrapper.waitForAlert(driver);
		String expected = "Please fill out Username and Password.";
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals(alertText, expected);
		alert.accept();
		homePage.clickSignUpCloseButton();
	}

//Login with valid UserName and Password
	@Test(priority=5)
	public void LoginWithValidUserNameAndPassword() throws InterruptedException {
		extentTest = extent.startTest("LoginWithValidUserNameAndPassword");
		homePage1.clickLogInButton();
		homePage1.logInUserNameEnterText("Diyababy");
		homePage1.logInPasswordEnterText("diyababy123");
		homePage1.clickLogIn();
	}


//About Us page access
	@Test(priority=6)
	public void AboutUsButtonClick() throws InterruptedException {
		extentTest = extent.startTest("AboutUsButtonClick");
		Thread.sleep(1000);
		homePage2.clickAboutUsButton();
	}

	
//"About us" display
	@Test(priority=7)
	public void AboutusDisplay () throws InterruptedException {
		extentTest = extent.startTest("AboutusDisplay");
		Assert.assertTrue(driver.getPageSource().contains("About us"));
	}

//AboutUs close button functionality
	@Test(priority=8)
	public void AboutUsCloseButtonFunctionality() {
		extentTest = extent.startTest("AboutUsCloseButtonFunctionality");
		homePage2.clickAboutUsCloseButton();
	}

//Contact page access
	@Test(priority=9)
	public void ContactButtonClick() {
		extentTest = extent.startTest("ContactButtonClick");
		homePage3.clickContactButton();
	}

//Contact by giving valid data
	@Test(priority=10)
	public void ContactByGivingValidData() {
		extentTest = extent.startTest("ContactByGivingValidData");
		homePage3.contactEmailEnterText("revathyc3@gmail.com");
		homePage3.contactNameEnterText("Revathy");
		homePage3.contactMessageEnterText("Hi");
		homePage3.clickSendMessage();
		objWrapper.waitForAlert(driver);
		String expected = "Thanks for the message!!";
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.print(alertText);
		Assert.assertEquals(alertText, expected);
		alert.accept();
		Assert.assertEquals(true, true);
	}

	//click on monitor category
		@Test(priority = 11)
		public void ClickOnMonitor() throws InterruptedException {
			extentTest = extent.startTest("ClickOnMonitor");
			homePage4.ClickMonitor();
			Thread.sleep(1000);
			Assert.assertTrue(driver.getPageSource().contains("ASUS"));
		}
	
		//click on Laptop category
		@Test(priority = 12)
		public void ClickOnLaptop() throws InterruptedException {
		extentTest = extent.startTest("ClickOnLaptop");
		homePage4.ClickLaptop();
		Thread.sleep(1000);
		Assert.assertTrue(driver.getPageSource().contains("Sony vaio i5"));
			}
	
		//click on Sony vaio i5 
		@Test(priority=13)
		public void ClickOnSonyVaioi5() throws InterruptedException {
		extentTest = extent.startTest("ClickOnSonyVaioi5");
		homePage4.clickSonyVaioi5();
		Thread.sleep(2000);
		Assert.assertTrue(driver.getPageSource().contains("Product description"));
					}
	
		//Logout
		   @Test(priority=14)
		   public void ClickLogOut () {
		   extentTest = extent.startTest("ClickLogOut");
		   homePage1.logOut();
		   }

	//Click on Samsung
	@Test (priority = 15)
	public void ClickOnSamsung() throws InterruptedException {
		extentTest = extent.startTest("ClickOnSamsung");
		Thread.sleep(500);
		homePage4.clickHome();
		homePage4.Samsung();
	}
	
//Add to Cart functionality
	@Test(priority = 16)
	public void AddToCart() throws InterruptedException {
		Thread.sleep(1000);
		extentTest = extent.startTest("AddToCart");
		homePage4.clickAddToCart();
	}

//Cart Page Access
	@Test(priority = 17)
	public void CartPageAccess() {
		extentTest = extent.startTest("CartPageAccess");
		homePage4.clickCartMenu();
	}

//Place order button click
	@Test(priority = 18)
	public void PlaceOrderButtonClick() {
		extentTest = extent.startTest("PlaceOrderButtonClick");
		homePage4.PlaceOrder();
	}

//Place order details fillup
	@Test(priority = 19)
	public void PlaceOrderDetailsFillUp() {
		extentTest = extent.startTest("PlaceOrderDetailsFillUp");
		homePage4.EnterOrderName("Revathy");
		homePage4.EnterOrderCountry("India");
		homePage4.EnterOrderCity("Kochi");
		homePage4.EnterOrderCreditCard("1234567891234567");
		homePage4.EnterOrderMonth("February");
		homePage4.EnterOrderYear("2023");
		homePage4.ClickPurchaseButton();
		
	}
	
//Purchase Ok button
	@Test(priority = 20 )
	public void PlaceOkButton() {
		extentTest = extent.startTest("PlaceOkButton");
		homePage4.ClickPurchaseOkButton();
		homePage4.ClickPurchaseCloseButton();
	}	
	
@AfterMethod
       public void tearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
			String screenshotPath = objUtilities.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
			String screenshotPath = objUtilities.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(screenshotPath));
		}

		extent.endTest(extentTest);
	}

	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
		driver.quit();
	}
}
