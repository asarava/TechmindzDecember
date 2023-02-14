package com.page;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.TestBase;

public class HomePage {
	@FindBy(xpath = "(//*[text()='close'])[3]")
    WebElement pCloseButton;
	private WebElement pSignUpButton;
	private WebElement pLoginButton;
	private Object objwrapper;
	private SearchContext driver;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
		
	}
	public void clickSignUpButton() {
		pSignUpButton.click();
	}
	public void clickLoginButton() {
		pLoginButton.click();
		
	}
	public void clickCloseButton() throws InterruptedException {
		objwrapper.waitForElement(driver, pCloseButton);
		pCloseButton.click();
	}

}
