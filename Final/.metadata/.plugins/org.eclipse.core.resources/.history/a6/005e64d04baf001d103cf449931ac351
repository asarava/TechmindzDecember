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
	//select by value
		public void selectByValue(WebDriver driver,WebElement element,String pValue) {
			Select selector=new Select(element);
			selector.selectByValue(pValue);
		}
	//select by visible text
		public void selectByVisibleText(WebDriver driver,WebElement element,String pValue) {
				Select selector=new Select(element);
			selector.selectByVisibleText(pValue);
		}
	//move to an element
	public void moveToElement(WebDriver driver,WebElement element) {
			Actions builder=new Actions(driver);
	//		Action mveToEle=builder.moveToElement(element).build();
	//		mveToEle.perform();
			Action contextCickElement=builder.moveToElement(element).contextClick(element).build();
			contextCickElement.perform();
		}
	public void windowHandle(WebDriver driver) {
		//To Get Current Window
		String CurrentWindow=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		for(String temp:allWindows)
		{
			driver.switchTo().window(temp);
		}
		driver.switchTo().window(CurrentWindow);
	}
	public void iframe(WebDriver driver,WebElement element) {
		  driver.switchTo().frame(element);
	}
	public void DismissAlert(WebDriver driver,WebElement element) {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	public void wait(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));	
	}
	public void entertext(String value,WebElement element,WebDriver driver) {
		wait(driver, element);
		element.sendKeys(value);
	}
	public void waitforalert(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	public void cleartext(WebElement element) {
		element.clear();
	}
}
