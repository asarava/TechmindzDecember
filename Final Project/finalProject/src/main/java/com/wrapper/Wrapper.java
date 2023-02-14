
package com.wrapper;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {
	
public void alert (WebDriver driver) {
				driver.switchTo().alert();
			}
			

public void waitForElement (WebDriver driver, WebElement element) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.elementToBeClickable(element));
}


public void enterText (WebDriver driver, WebElement element, String pValue) {
waitForElement (driver, element);
element.sendKeys(pValue);
}

public void waitForAlert (WebDriver driver) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.alertIsPresent());
}

public void clearText (WebDriver driver, WebElement element) {
    waitForElement (driver, element);
    element.clear();
	}


public void dismissAlert(WebDriver driver, WebElement element ) {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
}

public void dismissAlertSignUp(WebDriver driver, WebElement element ) {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
}

public void waitForElementProduct (WebDriver driver, WebElement element) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}

public void waitForElement(WebDriver driver, String pTextData) {
	waitForElement (driver,pTextData);
}

public void waitForElementFrom(WebDriver driver, WebElement pFrom) {
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(pFrom));
	
}

public void waitForElementLogIn(WebDriver driver, WebElement pClickLogIn) {
	WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(pClickLogIn));
}

public void waitForAlertSignUp (WebDriver driver) {
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
wait.until(ExpectedConditions.alertIsPresent());
}
}
