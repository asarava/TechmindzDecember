package com.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
import com.wrapper.Wrapper;

public class AboutUs extends TestBase {
Wrapper objWrapper = new Wrapper();

public AboutUs() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy (xpath = "(//a[@class='nav-link'])[3]")
	WebElement pAboutUsButton;
	
	@FindBy (xpath = "(//span[@class='vjs-control-text'])[2]")
	WebElement pPlayButton;
	
	@FindBy (xpath = "(//button[@type='button'])[25]")
	WebElement pAboutUsCloseButton;

	public void clickAboutUsButton() throws InterruptedException {
		Thread.sleep(1000);
		objWrapper.waitForElement(driver, pAboutUsButton);
		pAboutUsButton.click();
	}
	
	public void clickPlayButton() {
		objWrapper.waitForElement(driver, pPlayButton);
		pPlayButton.click();
	}

	public void clickAboutUsCloseButton() {
		objWrapper.waitForElement(driver, pAboutUsCloseButton);
		pAboutUsCloseButton.click();
	}

}
