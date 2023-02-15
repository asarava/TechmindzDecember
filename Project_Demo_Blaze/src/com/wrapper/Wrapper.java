package com.wrapper;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.testng.Assert.assertEquals;

import com.test.TestBase;

public class Wrapper extends TestBase {
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void assRT(WebElement element, String expectedData, String message, int startingindex) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		String actualData = element.getText();
		int endingIndex = actualData.length();
		String actualData1 = actualData.substring(startingindex, endingIndex);
		assertEquals(actualData1, expectedData, message);
	}

	public void assRTAlert(String expectedData, String message) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		String actualData = alt.getText();
		assertEquals(actualData, expectedData, message + actualData);
	}

	public void enterData(WebElement element, String inputData) {
		element.clear();
		element.sendKeys(inputData);
	}

	public void handleAlert(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	public void elementClick(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		if (element.isDisplayed()) {
			element.click();
		}
	}
	public void moveToElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(element));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	}
	public void loopElementClick(WebElement element) {
	 for(int i=1;i<=2;i++) {
		 try {
			 element.click();
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
		
	}
	public void refresshPage() {
	driver.navigate().refresh();
	}
	public void waitForElementVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  wait.until(ExpectedConditions.visibilityOf(element));
	}
}

