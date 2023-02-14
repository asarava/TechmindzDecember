package com.test;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.Testbase;
import com.page.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.Utilities;

import zmq.ZError.IOException;

	public class HomePageTestCases extends Testbase {
		HomePage homepage;
		Utilities objUtilities;
		public ExtentReports extent;
		public ExtentTest extentTest;

		
		
		public HomePageTestCases() {
			super();
		}
			
			@BeforeTest
			public void setExtent1() {
			
				
		
		
			
			extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.html", true);
			extent.addSystemInfo("Host Name", "Saravanan A");
			extent.addSystemInfo("User Name", "Saravanan A");
			extent.addSystemInfo("Environment", "Learning");
			}

			
			
			
			
			
			
		
		private void setExtent() {
			// TODO Auto-generated method stub
			
		}




		public void voidsetExtent() {
			// TODO Auto-generated method stub
			
		}
		@BeforeClass 
		public void setUp() {
			initialization();
			homepage =new HomePage();
		}
	
		 @Test
		public void clickOnsignUpButton() throws InterruptedException {
			homepage.clickSignUpButton();
			homepage.clickSignUpCloseButton();
			
			
			
		}
		 @Test
		 
			
			
			 public void  clickLoginButton () throws  InterruptedException {

				 homepage.clickLoginButton();

				 homepage.clickLoginUsername("test@12345678@");

				 homepage.clickLoginPassword("Password");

				 homepage.clickLoginCreateButton();

				 //homePage.clearUsername();

				 //homePage.clearPassword();

				 //homePage.clickLoginCloseButton();

				 }
		 
			 
			 
			 public void AboutUsButton() {
				 homepage.clickAboutUsButton();
				
			 }
			 
			 
				 
				 public void clickOnContact() throws InterruptedException  {
					 homepage.clickContactButton();
					 homepage.contactEmailEnterText("Test email");
					 homepage.contactNameEnterText("manju");
					 homepage.contactMessageEnterText("Hi");
					 homepage.clickSendMessage();
					 
					 
				 }
				 
				 
				 public void clickSignButton() {
					 homepage.clickSignUpButton();
					 homepage.clicksignupNameEnterText("sree");
					 homepage.clicksignupPasswordEnterText("sree123");
					 homepage.clickSignUpButton();
				 }
				 
				 
				 
				 public void  clickcart() throws InterruptedException {
					 homepage.clickcart();
				 }
				 
				 
				 
				 public void clickplaceorder () throws InterruptedException {
					 homepage.clickname();
					 homepage.clicknameEnterText("saju");
					 homepage.clickcountry();
					 homepage.clickcountryEnterText("india");
					 homepage.clickcity();
					 homepage.clickcityEnterText("kochi");
					 homepage.clickcreditcard();
					 homepage.clickcreditcardEnterText("12345");
					 homepage.clickmonth();
					 homepage.clickmonthEnterText("jan");
					 homepage.clickyear();
					 homepage.clickyearEnterText("2023");
				 }
				 
				 
				 
				 public void clickcategories () throws InterruptedException {
					 homepage.clickphone();
					 homepage.Laptops();
					 homepage.clickMonitors();
					 homepage.clickApplemonitors();
					 homepage.clickAsusFullhd();
					 
				 }
				 
				 
				 
				 
				 public void clickLaptops () {
				 homepage.clickvaioi5 ();
					 homepage.clickvaioi7();
					 homepage.clickMacBookair();
					 homepage.clickDelli78gb();
				 }
					 
					 
					 
					 
					 
					 
				 
				 
				 
				 
				 
				 @AfterMethod
				 public void tearDown (ITestResult result) throws IOException {

					 if (result.getStatus() == ITestResult.FAILURE) {
						 extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
						 extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
						 String screenshotPath = objUtilities.getScreenshot(driver, result.getName());
						 extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));
						 } else if (result.getStatus() == ITestResult.SKIP) 
						 {
						 extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
						 } 
						 else if (result.getStatus() == ITestResult.SUCCESS)
						 {
						 extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
						 String screenshotPath = objUtilities.getScreenshot(driver, result.getName());
						 extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(screenshotPath));
						 }
					       extentTest. endTest (extentTest);
				 }
						 
	
				 
	
	                      @AfterTest
	                       public void endReport() {
	                       extent.flush();
	                       extent.close();
	                       driver.quit();
	                       }
	                       }

				 
	
	
	
						 
				 
				 
				 
				 
				 
					 
					 
					 
					 
						 
						
				 
				 
				 
					 
					 
					 
					 
					 
					 
					 
				 
			 
			 
			
		 
		
