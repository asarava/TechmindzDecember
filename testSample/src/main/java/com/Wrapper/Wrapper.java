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
	public void selectByValue(WebDriver driver,WebElement element, String pValue) {
	     Select selector = new Select(element);
	     selector.selectByValue(pValue);
		}
	    public void selectByVisibleText(WebDriver driver,WebElement element,String pValue) {
	    	Select selector = new Select(element);
	        selector.selectByVisibleText(pValue); 
	    }
	    public void selectByIndex(WebDriver driver,WebElement element,int pValue) {
	    	Select selector = new Select(element);
	        selector.selectByIndex(pValue);
	    }
	    public void moveToElement(WebDriver driver,WebElement element) {
	    	Actions builder= new Actions(driver);
	    	 Action mveToEle=builder.moveToElement(element).build();
	    	 mveToEle.perform();
	    }
	    public void contextClick(WebDriver driver,WebElement element) {
	    	Actions builder=new Actions(driver);
	    	Action contextClickElement=builder.moveToElement(element).contextClick().build();
	    	contextClickElement.perform();
	    }
	    
	    public void windowHandle(WebDriver driver) throws InterruptedException{
	    	String currentWindow = driver.getWindowHandle();
	    	Set<String> allWindows = driver.getWindowHandles();
	    	for (String temp:allWindows) {
	    		driver.switchTo().window(temp);
	    		Thread.sleep(5000);
	    	}
	    	driver.switchTo().window(currentWindow);
	    	}
	    public void alert(WebDriver driver) {
	    	Alert alert=driver.switchTo().alert();
	    	alert.dismiss();
	    }
	    
	    public void scroll(WebDriver driver,WebElement element) {
	    	Actions builder=new Actions(driver);
	    	Action scrollToElement=builder.scrollToElement(element).build();
	    	scrollToElement.perform();
	    }
	    public void scrollJava(WebDriver driver,WebElement element) {
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].scrollIntoView()", element);
	    }
	    public void dragAndDrop(WebDriver driver,WebElement elementFrom,WebElement elementTo) {
	    	Actions builder=new Actions(driver);
	    	Action dragAndDrop=builder.dragAndDrop(elementFrom,elementTo).build();
	    	dragAndDrop.perform();
	    }
	    public void dragAndDropOffset(WebDriver driver,WebElement element,int drag,int drop) {
	    	Actions builder=new Actions(driver);
	    	Action dragAndDropOffset=builder.dragAndDropBy(element,drag,drop).build();
	    	dragAndDropOffset.perform();
	    }
	    public void waitForElement(WebDriver driver,WebElement element) {
	    	WebDriverWait wait = new WebDriverWait(driver,Duration .ofSeconds(10));
	    	wait.until(ExpectedConditions.elementToBeClickable(element));
	    	element.click();
	}
	    public void enterText(String pValue,WebElement element,WebDriver driver) {
             waitForElement(driver,element);
             element.sendKeys(pValue);
	    }
	    public void dissmissAlert(WebDriver driver) {
	    	Alert alert=driver.switchTo().alert();
	    	alert.accept();
	    }
	    public void clearText(WebElement element,WebDriver driver) {
	    	waitForElement(driver,element);
	    	element.clear();
	    }
}
