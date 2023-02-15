package com.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.HomePage.AboutAs;
import com.HomePage.Cart;
import com.HomePage.HomePage;
import com.utilities.Utilities;

public class HomePageTestCases extends TestBase {
Utilities utilities=new Utilities();
HomePage homepage;
AboutAs aboutas;
Cart cart;
public HomePageTestCases() {
	super();
}
@BeforeClass
public void setUp() {
	initilization();
	homepage=new HomePage();
	aboutas=new AboutAs();
	cart=new Cart();
}
@DataProvider(name="dataprovider1")
public Object[][] checkURL(){
	Object[][] newtestData=Utilities.getTestData("Sheet1");
	return newtestData;
}
@DataProvider(name="dataprovider2")
public Object[][] signUPData(){
	Object[][] newtestData1=Utilities.getTestData("SignUp");
	return newtestData1;
}
@DataProvider(name="dataprovider3")
public Object[][] signUPData1(){
	Object[][] newtestData1=Utilities.getTestData("SignUp1");
	return newtestData1;
}
@DataProvider(name="dataprovider4")
public Object[][] signUPData2(){
	Object[][] newtestData1=Utilities.getTestData("SignUp1");
	return newtestData1;
}
@DataProvider(name="dataprovider5")
public Object[][] loginData1(){
	Object[][] newtestData1=Utilities.getTestData("SignUp");
	return newtestData1;
}
@DataProvider(name="dataprovider6")
public Object[][] loginWithInvalidPassword(){
	Object[][] newtestData1=Utilities.getTestData("login1");
	return newtestData1;
}
@DataProvider(name="dataprovider7")
public Object[][] loginWithInvalidUserName(){
	Object[][] newtestData1=Utilities.getTestData("login2");
	return newtestData1;
}
@DataProvider(name="dataprovider8")
public Object[][] loginWithInvalidUserNameAndPassword(){
	Object[][] newtestData1=Utilities.getTestData("login3");
	return newtestData1;
}
@DataProvider(name="dataprovider9")
public Object[][] validLogin(){
	Object[][] newtestData1=Utilities.getTestData("ValidLogin");
	return newtestData1;
}
@DataProvider(name="dataprovider10")
public Object[][] contactMessage(){
	Object[][] newtestData1=Utilities.getTestData("contactMessage");
	return newtestData1;
}
@DataProvider(name="dataprovider11")
public Object[][] validLogin1(){
	Object[][] newtestData1=Utilities.getTestData("ValidLogin");
	return newtestData1;
}
@DataProvider(name="dataprovider12")
public Object[][] fillPurchaseInformation(){
	Object[][] newtestData1=Utilities.getTestData("purchaseData");
	return newtestData1;
}
@Test(priority=1,dataProvider="dataprovider1")
public void URL(String a,String b) {
	System.out.println(b);
	homepage.URL(a, b, "Unable to load URL");
}
@Test(priority=2,dataProvider="dataprovider2")
public void signUp(String username,String password) {
	homepage.signUp(username, password);
}
@Test(priority=3,dataProvider="dataprovider3")
public void signUpWithoutPassword(String username,String password) {
	homepage.signUpWithoutPassword(username);
}
@Test(priority=3,dataProvider="dataprovider4")
public void signUpWithoutUserName(String username,String password) {
	homepage.signUpWithoutUserName(password);
}
@Test(priority=4,dataProvider="dataprovider5")
public void loginWithDiffUserNameAndPassword(String username,String password) {
	homepage.loginWithDiffUserNameAndPassword(username, password, password, "User name no matching");
}
@Test(priority=5,dataProvider="dataprovider6")
public void loginWithValidUserNameInvalidPassword(String username,String password) {
	homepage.loginWithValidUserNameInvalidPassword(username, password);
}
@Test(priority=6,dataProvider="dataprovider7")
public void loginWithInvldUserNameAndValidPassword(String username,String password) {
	homepage.loginWithInvldUserNameAndValidPassword(username, password);
}
@Test(priority=7,dataProvider="dataprovider8")
public void loginWithInvldUserNameAndInvalidPassword(String username,String password) {
	homepage.loginWithInvldUserNameAndInvalidPassword(username, password);
}
@Test(priority=8,dataProvider="dataprovider9")
public void selectingTheCatagories(String username,String password) {
	homepage.selectingTheCatagories(username, password);
}
@Test(priority=9,dataProvider="dataprovider10")
public void sendMessageWithAllDetails(String email,String name,String message) {
	homepage.sendMessageWithAllDetails(email, name, message);
}
@Test(priority=14,dataProvider="dataprovider11")
public void sampleLogin(String username,String password) {
	aboutas.sampleLogin(username, password);
}
@Test(priority=10)
public void aboutPageAccess() {
	aboutas.aboutPageAccess();
}
@Test(priority=11)
public void aboutAsVideoPlayButton() {
	aboutas.aboutAsVideoPlayButton();
}
@Test(priority=12)
public void aboutAsVideoPouseButton() {
	aboutas.aboutAsVideoPouseButton();
}
@Test(priority=13)
public void aboutAsVideoFullScreen() {
	aboutas.aboutAsVideoFullScreen();
}
@Test(priority=15)
public void cartFunctionality() {
	cart.cartFunctionality();
}
@Test(priority=16)
public void addToCartFuntionlity() {
	cart.addToCartFuntionlity();
}
@Test(priority=17)
public void deleteProductFromCart() {
	cart.deleteProductFromCart();
}
@Test(priority=18)
public void placeTheOrderFunctionality() {
	cart.placeTheOrderFunctionality();
}
@Test(priority=19)
public void purchaseTheOrderWhitoutFillingPlaceTheOrderForm() {
	cart.purchaseTheOrderWhitoutFillingPlaceTheOrderForm();
}
@Test(priority=19,dataProvider="dataprovider12")
public void purchaseTheProductWithUserDetails(String name,String cuntry,String city,String creditcard,String motnth,String year) {
	cart.purchaseTheProductWithUserDetails(name, cuntry, city, creditcard, motnth, year);
}
}
