package com.HomePage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.TestBase;
import com.wrapper.Wrapper;

public class AboutAs extends TestBase {
Wrapper wrapper=new Wrapper();
@FindBy(id="login2") WebElement pHomePageLoginButton;
@FindBy(id="loginusername") WebElement pLoginUserName;
@FindBy(id="loginpassword") WebElement pLoginPassword;
@FindBy(xpath="(//button[@class=\"btn btn-primary\"])[3]") WebElement pLoginWindowLoginButton;
@FindBy(xpath="(//a[@class=\"nav-link\"])[3]") WebElement pHomePageAboutAs;
@FindBy(id="logInModalLabel") WebElement pAboutAsHeading;
@FindBy(xpath="//button[@class=\"vjs-big-play-button\"]") WebElement pAboutAsPlayButton;
@FindBy(xpath="//button[@title=\"Pause\"]") WebElement pAboutAsPouseButton;
@FindBy(xpath="//button[@title=\"Fullscreen\"]") WebElement pAboutAsVideoFullScreenButton;
@FindBy(xpath="//button[@title=\"Non-Fullscreen\"]") WebElement pNonFullScreenButton;
@FindBy(xpath="(//button[@class=\"btn btn-secondary\"])[4]") WebElement pAboutAsCloseButton;
public AboutAs() {
	PageFactory.initElements(driver, this);
}
public void sampleLogin(String username,String password) {
	pHomePageLoginButton.click();
	wrapper.waitForElement(pLoginUserName);
	wrapper.enterData(pLoginUserName, username);
	wrapper.enterData(pLoginPassword, password);
	pLoginWindowLoginButton.click();
}
public void aboutPageAccess() {
	wrapper.waitForElement(pHomePageAboutAs);
	wrapper.loopElementClick(pHomePageAboutAs);
	
}
public void aboutAsVideoPlayButton() {
	wrapper.waitForElement(pAboutAsPlayButton);
	pAboutAsPlayButton.click();
}
public void aboutAsVideoPouseButton() {
	wrapper.waitForElement(pAboutAsPouseButton);
	wrapper.moveToElement(pAboutAsPouseButton);
	pAboutAsPouseButton.click();
}
public void aboutAsVideoFullScreen() {
	wrapper.waitForElement(pAboutAsVideoFullScreenButton);
	wrapper.loopElementClick(pAboutAsVideoFullScreenButton);
	wrapper.waitForElement(pNonFullScreenButton);
	wrapper.loopElementClick(pNonFullScreenButton);
	pAboutAsCloseButton.click();
}
}
