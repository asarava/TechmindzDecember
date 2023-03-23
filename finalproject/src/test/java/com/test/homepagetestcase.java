package com.Test; 
	import java.io.IOException;

import javax.naming.ldap.ExtendedRequest;

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
import com.relevantcodes.extentreports.IExtentTestClass;
import com.relevantcodes.extentreports.LogStatus;
import com.utilities.Utilities; 
	public class HomePageTestCases extends Testbase {
		HomePage homepage;
		Utilities objutilities;
		public ExtentReports extentTest;
		public ExtentTest extent;


		public HomePageTestCases() { 
			super();


			@BeforeTest
			public void setExtent() {

				extentTest = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.html", true);
				((ExtentReports) extentTest).addSystemInfo("Host Name", "Saravanan A"); 
				extentTest.addSystemInfo("User Name", "Saravanan A"); 
				extentTest.addSystemInfo("Environment", "Learning"); 
				}



			} 
		private void setExtent() {
			// TODO Auto-generated method stub

		}
		@BeforeClass
		public void setUp() {
				initialization(); 
				homepage =new HomePage();

		}
			 {

			// TODO Auto-generated method stub

		}
			@Test
			public void clickOnsignUpButton() throws InterruptedException { 
				homepage.clickSignUpButton(); 
				homepage.clickSignUpCloseButton(); }




				public void clickOnLoginButton() throws InterruptedException {
					homepage.clickLoginButton();
					homepage.clickLoginUsername("test@1234@"); 
					homepage.clickLoginPassword("Password");
					homepage.clickLoginCreateButton();

					//homePage.clearUsername(); 
					//homePage.clearPassword(); s
					//homePage.clickLoginCloseButton(); 
					}
				public void AboutUsButton() {
					homepage.clickAboutUsButton();
					//homepage.clickAboutUsCloseButton();
					}
				public void clickOnContact() throws InterruptedException { 
					homepage.clickContactButton(); 
					homepage.contactEmailEnterText("Test email");
					homepage.contactNameEnterText("jidhu");
					homepage.contactMessageEnterText("Hi"); 
					homepage.clickSendMessage();
					}
				public void clickSignButton() { 
						homepage.clickSignUpButton(); 
						homepage.signUpUserNameEnterText("nithin"); 
						homepage.clicksignupPasswordEnterText("nithin12345");
					}


							public void clickcategories () throws InterruptedException {
								homepage.clickphone();
								homepage.Laptops();
								homepage.clickMonitors();
							}
							public void clickMonitors() {
								homepage.clickApplemonitors();
								homepage.clickAsusFullhd();
							}

								public void clickLaptops () {
								homepage.clickvaioi5 ();
								homepage.clickvaioi7();
								homepage.clickMacBookair();
								homepage.clickDelli78gb();
								}
								public void clickphones() throws InterruptedException {
									homepage.clickNokia();

								}













					@AfterMethod
					public void tearDown (ITestResult result) throws IOException {
						if (result.getStatus() == ITestResult.FAILURE) {
							extentTest).log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getName());
							extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
							String screenshotPath = objutilities.getScreenshot1(driver, result.getName());
							extentTest.log(LogStatus.FAIL, ((IExtentTestClass) extentTest).addScreenCapture(screenshotPath));
							} 
						else if (result.getStatus() == ITestResult.SKIP) { 
							extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName()); 
							} 
						else if (result.getStatus() == ITestResult.SUCCESS) {
							extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());
							String screenshotPath = objutilities.getScreenshot1(driver, result.getName());
							extentTest.log(LogStatus.PASS,extentTest).addScreenCapture(screenshotPath));
							}
						extentTest.endTest(extentTest);

						@AfterTest
	                      public void endReport() {
	                      ExtentReports extent;
						extent.flush();
	                      extent.close();
	                      driver.quit();
	                      }


						}
					private void endReport() {
						// TODO Auto-generated method stub

					}


			}
