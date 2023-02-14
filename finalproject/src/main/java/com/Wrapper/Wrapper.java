package com.Wrapper;

import java.time.Duration;
import java.util.Set;



import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wrapper {

	public void wrappercontextClickElement()
	{
		
	}

	public void selectbyvalue(WebDriver driver, WebElement element, String pvalue) {
		Select selector = new Select(element);
		selector.selectByValue(pvalue);
	}

	public void selectbyVisualText(WebDriver driver, WebElement element, String pvalue) {
		Select selector = new Select(element);
		selector.selectByVisibleText(pvalue);
	}

	public void selectByIndex(WebDriver driver, WebElement element, int pvalue) {
		Select selector = new Select(element);
		selector.selectByIndex(pvalue);
	}

	public void moveElement(WebDriver driver, WebElement element) {
		Actions builder = new Actions(driver);
		Action mveToEle = builder.moveToElement(element).build();
		mveToEle.perform();

	}

	public void contextClick(WebDriver driver, WebElement element) {
		Actions builder = new Actions(driver);
		Action contextClickElement = builder.moveToElement(element).contextClick().build();
		contextClickElement.perform();
	}

	public void windowHandle(WebDriver driver) {
		String currentWindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		for (String temp : allwindows) {
			driver.switchTo().window(temp);

		}
		driver.switchTo().window(currentWindow);

	}

	public void iframes(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
		Actions builder = new Actions(driver);
		Action scrollToElement = builder.scrollToElement(element).build();
		scrollToElement.perform();
	}

	public void scrolljava(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoview()", element);
	}

	// drag and drop
	public void dragAndDrop(WebDriver driver, WebElement elementFrom, WebElement elementTo) {
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.dragAndDrop(elementFrom, elementTo).build();
		dragAndDrop.perform();
	}

	public void dragAndDropOffset(WebDriver driver, WebElement element, int drag, int drop) {
		Actions builder = new Actions(driver);
		Action dragAndDropOffset = builder.dragAndDropBy(element, drag, drop).build();
		dragAndDropOffset.perform();

	}

	public void waitforElement(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	public void enterText(String pValue,WebElement element, WebDriver driver ) {
		waitforElement(driver,element);
		element.sendKeys(pValue);
	}
	public void dismissAlert(WebDriver driver,WebElement element) {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		
	}
public void clearText(WebElement element,  WebDriver driver) {
	waitforElement(driver,element);
	element.clear();
	
	
}

	public void alert(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
}
