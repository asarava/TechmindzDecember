package com.wrapper;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {

	public void selectByValue(WebDriver driver, WebElement element, String pValue) {
		// <--------Select by Value----
		Select selector = new Select(element);
		selector.selectByValue(pValue);

	}

	public void selectByVisibleText(WebDriver driver, WebElement element, String pValue) {
		// <--------Select by Visible Text----
		Select selector = new Select(element);
		selector.selectByVisibleText(pValue);
	}

	public void selectByIndex(WebDriver driver, WebElement element, int pValue) {
		// <--------Select by Index----
		Select selector = new Select(element);
		selector.selectByIndex(pValue);
	}

	// <--------Move to an element----
	public void moveToElement(WebDriver driver, WebElement element) {
		Actions builder = new Actions(driver);
		Action contextClickElement = builder.moveToElement(element).contextClick(element).build();
		contextClickElement.perform(); // contextClick() is for Right click
	}

	// <---------Handling Window or Tabs----->
	public void windowHandle(WebDriver driver) throws InterruptedException {
		String currentWindow = driver.getWindowHandle(); // Gets current window
		// To get all windows
		Set<String> allWindows = driver.getWindowHandles();
		for (String temp : allWindows) {
			driver.switchTo().window(temp);
			Thread.sleep(5000);
		}
		driver.switchTo().window(currentWindow);
	}

	// <----iFrames------>
	public void iFrameHandling(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	// <----Alert Message (PopUp)------>
	public void alertMessage(WebDriver driver) {
		waitForAlert(driver);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	// <------Scroll----->
	public void scrollToElement(WebDriver driver, WebElement pIneraction) {
		Actions builder = new Actions(driver);
		Action toElement = builder.scrollToElement(pIneraction).build();
		toElement.perform();
	}

	// <------Drag and drop----->
	public void droppable(WebDriver driver, WebElement pDragBoxFrom, WebElement pDragBoxTo, int a, int b) {
		Actions builder = new Actions(driver);
		// Action dragAndDrop = builder.dragAndDrop(pDragBoxFrom, pDragBoxTo).build();
		Action dragAndDrop = builder.dragAndDropBy(pDragBoxFrom, 1000, 1000).build();
		dragAndDrop.perform();
	}

	// -----Clear Text In The Field----
	public void clearText(WebElement pElement) {
		pElement.clear();
	}

	// <-----------Wait-------->
	public void waitForElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		// element.click();
	}

	// <-----------Wait for alert-------->
	public void waitForAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		// element.click();
	}

	// ----To Enter Text-----------
	public void enterText(String pValue, WebElement element, WebDriver driver) {
		waitForElement(driver, element); // calling wait inside wrapper "Encapsulation"
		element.sendKeys(pValue);
	}

	// -----To get Text from HTML----
	public String retrieveText(String pValue, WebElement element, WebDriver driver) {
		waitForElement(driver, element);
		pValue = element.getText();
		return (pValue);
	}
	
	//---------category select--------
	public static void clickOn(WebDriver driver, WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

}
