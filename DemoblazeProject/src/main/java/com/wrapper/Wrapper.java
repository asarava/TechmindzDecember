package com.wrapper;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {
	
	
	public void waitForElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public void acceptAlert(WebDriver driver) {
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	public void waitForAlert(WebDriver driver) {
		
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	public void clickElement(WebElement element,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
	
	public void enterText(String pValue, WebElement element , WebDriver driver) {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		waitForElement(driver, element);
		element.sendKeys(pValue);
	}

}
