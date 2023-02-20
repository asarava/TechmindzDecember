package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Base.TestBase;
import com.pages.HomePage;
import com.utilities.Utilities;

public class HomePageTestCases extends TestBase {
	HomePage homepage;
	Utilities util=new Utilities();

	
	public HomePageTestCases() {
		super();
	}
	@BeforeClass
	 public void setUp() {
		 initialization();
		 homepage = new HomePage();
	 }
	
	@DataProvider(name="signUpDataProvider")
	public Object[][] signUpPassword(){
		Object[][]  testData=Utilities.getTestData("signup");
		return testData;
	}
	@DataProvider(name="loginDataProvider")
	public Object[][] loginPassword(){
		Object[][]  testData=Utilities.getTestData("signup");
		return testData;
	}
	@DataProvider(name="loginDataProvider1")
	public Object[][] loginwithinvalidPassword(){
		Object[][]  testData=Utilities.getTestData("invalidpassword");
		return testData;																				
	}
	@DataProvider(name="loginDataProvider2")
	public Object[][] loginwithinvalidUserName(){
		Object[][]  testData=Utilities.getTestData("invalidusername");
		return testData;
	}
	@DataProvider(name="loginDataProvider3")
	public Object[][] loginWithInvalidUserNameandInvalidPassword(){
		Object[][]  testData=Utilities.getTestData("invaliddatas");
		return testData;
		
		
	}
	@DataProvider(name="contactDataProvider")
	public Object[][] contactValidData(){
		Object[][]  testData=Utilities.getTestData("contactvaliddata");
		return testData;	
	}
	@DataProvider(name="contactDataProvider1")
	public Object[][] lenthOfMessage(){
		Object[][]  testData=Utilities.getTestData("messagebox");
		return testData;
	}
	
	@DataProvider(name="placeOrderDataProvider")
	public Object[][] cart2(){
		Object[][]  testData=Utilities.getTestData("placeorder");
		return testData;	
	}
	@DataProvider(name="placeOrderDataProvider1")
	public Object[][] cart3(){
		Object[][]  testData=Utilities.getTestData("invalidplaceorder");
		return testData;	
	}
	
	@Test(priority=1)
	public void URL() {
		homepage.URL("PRODUCT STORE", "Weblink not available");
		}
	@Test(priority=2,dataProvider="signUpDataProvider")
	public void signUp(String UserName,String Passwrod) {
		homepage.singUp( UserName,Passwrod);
	}
	@Test(priority=3,dataProvider="loginDataProvider")
	
	public void login(String UserName,String Password) {
		homepage.login(UserName, Password);
	}
	@Test(priority=4,dataProvider="loginDataProvider1")
	
	public void loginWithInvalidPassword(String UserName,String Passwrod) {
		homepage.loginWithInvalidPassword(UserName, Passwrod);
		
	}
	
	@Test(priority=5,dataProvider="loginDataProvider2")
	public void loginWithInvalidUserName(String UserName,String Passwrod) {
		homepage.loginWithInvalidUserName(UserName, Passwrod);
	}
	
	@Test(priority=6,dataProvider="loginDataProvider3")
	public void loginWithInvalidUserNameandInvalidPassword(String UserName,String Passwrod) {
		homepage.loginWithInvalidUserNameandInvalidPassword(UserName, Passwrod);
		
	}
	
	@Test(priority=7)
	public void contact() {
		homepage.contact();
	
	}
	
	@Test(priority=8, dataProvider="contactDataProvider")
	public void contactValidData(String ContactEmail,String ContactName,String Message) {
        homepage.contactValidData(ContactEmail, ContactName, Message);
	
	}
	@Test(priority=9, dataProvider="contactDataProvider1")
	public void lenthOfMessage(String ContactEmail,String ContactName,String Message) {
        homepage.lenthOfMessage(ContactEmail, ContactName, Message);
	}
	
	@Test(priority=10)
	public void home() {
		homepage.home();
	}
	@Test(priority=11)
	public void cart() {
		homepage.cart();
		
	}
	@Test(priority=12)
	public void delectButton() {
        homepage.delectButton();
	}
	@Test(priority=13)
	public void home2() {
		homepage.home2();
		
	}
	@Test(priority=14, dataProvider="placeOrderDataProvider")
	public void cart2(String Name,String Country,String City,String CreditCard,String Month,String Year) {
		homepage.cart2(Name, Country, City, CreditCard, Month, Year);
		
	}
	@Test(priority=15, dataProvider="placeOrderDataProvider1")
	public void cart3(String Name,String Country,String City,String CreditCard,String Month,String Year) {
		homepage.cart3(Name, Country, City, CreditCard, Month, Year);
	}
		
	
	@Test(priority=16)
	public void aboutAs() {
		homepage.aboutAs();
	}
	@Test(priority=17)
	public void aboutAs1() {
		homepage.aboutAs1();
	}
	
	@Test(priority=18)
	public void fullScreenVideo() {
		homepage.fullScreenVideo();
	}
	@Test(priority=19)
	public void playButton() {
		homepage.playButton();
	}
	@Test(priority=20)
	public void aboutUsCloseButton() {
		homepage.aboutUsCloseButton();
	}
	
}
