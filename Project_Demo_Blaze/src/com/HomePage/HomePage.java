package com.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.TestBase;
import com.wrapper.Wrapper;

public class HomePage extends TestBase{
	Wrapper wrapper=new Wrapper();
@FindBy(xpath="//a[@class=\"navbar-brand\"]") WebElement pHomePageHeading;
@FindBy(id="signin2") WebElement pHomePageSignInButton;
@FindBy(id="sign-username") WebElement pUserName;
@FindBy(id="sign-password") WebElement pPassword;
@FindBy(xpath="(//button[@class=\"btn btn-primary\"])[2]") WebElement pSignIn;
@FindBy(xpath="(//button[@class=\"btn btn-secondary\"])[2]") WebElement pSignInCancel;
@FindBy(id="login2") WebElement pHomePageLoginButton;
@FindBy(id="loginusername") WebElement pLoginUserName;
@FindBy(id="loginpassword") WebElement pLoginPassword;
@FindBy(xpath="(//button[@class=\"btn btn-primary\"])[3]") WebElement pLoginWindowLoginButton;
@FindBy(xpath="(//button[@class=\"btn btn-secondary\"])[3]") WebElement pLoginWindowCloseButton;
@FindBy(id="logout2") WebElement pLogOutButton;
@FindBy(id="nameofuser") WebElement pNameOfUser;
@FindBy(xpath="//a[@onclick=\"byCat('phone')\"]") WebElement pCatagoryPhone;
@FindBy(xpath="//a[text()=\"Sony xperia z5\"]") WebElement pPhoneFromList;
@FindBy(xpath="//a[@onclick=\"byCat('notebook')\"]") WebElement pCatagoryLaptop;
@FindBy(xpath="//a[text()=\"MacBook Pro\"]") WebElement pLapTopFromList;
@FindBy(xpath="//a[@onclick=\"byCat('monitor')\"]") WebElement pCatagoryMonitor;
@FindBy(xpath="//a[text()=\"ASUS Full HD\"]") WebElement pMonitorFromList;
@FindBy(xpath="(//a[@class=\"nav-link\"])[1]") WebElement pHomePageHomeButton;
@FindBy(xpath="(//a[@class=\"nav-link\"])[2]") WebElement pHomePageContactButton;
@FindBy(id="recipient-email") WebElement pContactEmail;
@FindBy(id="recipient-name") WebElement pContactName;
@FindBy(id="message-text") WebElement pContactMessage;
@FindBy(xpath="(//button[@class=\"btn btn-primary\"])[1]") WebElement pContactWindowSendMessageButton;
public HomePage() {
	PageFactory.initElements(driver, this);
}
public void URL(String expectedData,String data,String message) {
wrapper.assRT(pHomePageHeading, expectedData, message, 0);
}
public void signUp(String userName,String password) {
wrapper.waitForElement(pHomePageSignInButton);
pHomePageSignInButton.click();
wrapper.waitForElement(pUserName);
wrapper.enterData(pUserName, userName);
wrapper.enterData(pPassword, password);
pSignIn.click();
wrapper.assRTAlert("This user already exist.", "Error: ");
wrapper.handleAlert(driver);
wrapper.elementClick(pSignInCancel);
}
//signUp with username only
public void signUpWithoutPassword(String username) {
	wrapper.waitForElement(pHomePageSignInButton);
	pHomePageSignInButton.click();
	wrapper.waitForElement(pUserName);
	wrapper.enterData(pUserName,username );
	pPassword.clear();
	pSignIn.click();
	wrapper.assRTAlert("Please fill out Username and Password.", "Error: ");
	wrapper.handleAlert(driver);
	wrapper.elementClick(pSignInCancel);
}
//signUp with password only
public void signUpWithoutUserName(String password) {
	wrapper.waitForElement(pHomePageSignInButton);
	pHomePageSignInButton.click();
	wrapper.waitForElement(pUserName);
	pUserName.clear();
	wrapper.enterData(pPassword, password);
	pSignIn.click();
	wrapper.assRTAlert("Please fill out Username and Password.", "Error: ");
	wrapper.handleAlert(driver);
	wrapper.elementClick(pSignInCancel);
}
public void loginWithDiffUserNameAndPassword(String username,String password,String expectedData,String message) {
	wrapper.waitForElement(pHomePageLoginButton);
	pHomePageLoginButton.click();
	wrapper.waitForElement(pLoginUserName);
	wrapper.enterData(pLoginUserName, username);
	wrapper.enterData(pLoginPassword, password);
	pLoginWindowLoginButton.click();
	wrapper.waitForElement(pNameOfUser);
	wrapper.waitForElement(pNameOfUser);s
	wrapper.assRT(pNameOfUser, username, message, 8);
	pLogOutButton.click();
}
public void loginWithValidUserNameInvalidPassword(String username,String password) {
	wrapper.waitForElement(pHomePageLoginButton);
	pHomePageLoginButton.click();
	wrapper.waitForElement(pLoginUserName);
	wrapper.enterData(pLoginUserName, username);
	wrapper.enterData(pLoginPassword, password);
	pLoginWindowLoginButton.click();
	wrapper.assRTAlert("Wrong password.", "Error: Expected result not match with actual result");
	wrapper.handleAlert(driver);
	pLoginWindowCloseButton.click();
}
public void loginWithInvldUserNameAndValidPassword(String username,String password) {
	wrapper.waitForElement(pHomePageLoginButton);
	pHomePageLoginButton.click();
	wrapper.waitForElement(pLoginUserName);
	wrapper.enterData(pLoginUserName, username);
	wrapper.enterData(pLoginPassword, password);
	pLoginWindowLoginButton.click();
	wrapper.assRTAlert("User does not exist.", "Error: Expected result not match with actual result");
	wrapper.handleAlert(driver);
	pLoginWindowCloseButton.click();
}
public void loginWithInvldUserNameAndInvalidPassword(String username,String password) {
	wrapper.waitForElement(pHomePageLoginButton);
	pHomePageLoginButton.click();
	wrapper.waitForElement(pLoginUserName);
	wrapper.enterData(pLoginUserName, username);
	wrapper.enterData(pLoginPassword, password);
	pLoginWindowLoginButton.click();
	wrapper.assRTAlert("User does not exist.", "Error: Expected result not match with actual result");
	wrapper.handleAlert(driver);
	pLoginWindowCloseButton.click();
}
public void selectingTheCatagories(String username,String password) {
	pHomePageLoginButton.click();
	wrapper.waitForElement(pLoginUserName);
	wrapper.enterData(pLoginUserName, username);
	wrapper.enterData(pLoginPassword, password);
	wrapper.loopElementClick(pLoginWindowLoginButton);
	wrapper.loopElementClick(pCatagoryPhone);
	wrapper.moveToElement(pPhoneFromList);
	wrapper.assRT(pPhoneFromList, "Sony xperia z5", "Product from catagory not match with list", 0);
	wrapper.moveToElement(pCatagoryLaptop);
	wrapper.loopElementClick(pCatagoryLaptop);
	wrapper.moveToElement(pLapTopFromList);
	wrapper.assRT(pLapTopFromList, "MacBook Pro", "Product from catagory not match with list", 0);
	wrapper.moveToElement(pCatagoryMonitor);
	wrapper.loopElementClick(pCatagoryMonitor);
	wrapper.moveToElement(pMonitorFromList);
	wrapper.assRT(pMonitorFromList, "ASUS Full HD", "Product from catagory not match with list", 0);
	
}
public void sendMessageWithAllDetails(String email,String name,String message) {
	wrapper.moveToElement(pHomePageHomeButton);
	pHomePageContactButton.click();
	wrapper.waitForElement(pContactEmail);
	wrapper.enterData(pContactEmail, email);
	wrapper.enterData(pContactName, name);
	wrapper.enterData(pContactMessage, message);
	pContactWindowSendMessageButton.click();
	wrapper.assRTAlert("Thanks for the message!!", "Message function not working");
	wrapper.handleAlert(driver);
}
}
