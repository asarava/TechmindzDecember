package com.wrapper;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class wrapper {
	public void selectByValue(WebDriver driver, WebElement element, String pValue) {
		Select selector = new Select(element);
		selector.selectByValue(pValue);
		}
	public void selecByVisibleText(WebDriver driver, WebElement element, String pValue) {
		Select selector = new Select(element);
		selector.selectByVisibleText(pValue);
		
	}
	public void selectByIndex(WebDriver driver, WebElement element, int pValue) {
		Select selector = new Select(element);
		selector.selectByIndex(pValue);
	}
	public void moveToElement(WebDriver driver, WebElement element) {
		Actions builder = new Actions(driver);
		Action mveToEle=builder.moveToElement(element).build();
		mveToEle.perform();
	}
	public void contextClick(WebDriver driver, WebElement element) {
		Actions builder = new Actions(driver);
		Action contextClickElement=builder.moveToElement(element).contextClick().build();
		contextClickElement.perform();
	}
	public void windowHandle(WebDriver driver) throws InterruptedException {
		String currentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String temp : allWindows) {
			driver.switchTo().window(temp);
			Thread.sleep(5000);
		}
		driver.switchTo().window(currentWindow);
	}
     public void iFrameHandler(WebDriver driver, WebElement element) {
    	 driver.switchTo().frame(element);
     }
     public void waitForElement(WebDriver driver, WebElement element) {
    	 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    	 wait.until(ExpectedConditions.elementToBeClickable(element));
     }
}
