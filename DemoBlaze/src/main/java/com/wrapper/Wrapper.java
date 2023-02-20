package com.wrapper;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.TestBase;
import static org.testng.Assert.assertEquals;
public class Wrapper extends TestBase {
	 //Select By Value 
		public void selectByValue(WebDriver driver, WebElement element, String pValue ) {
		
		//Select selector = new Select(element);
		//selector.selectByValue(pValue); 

		}
		
		//Move to an Element
		
		public void moveToElement(WebDriver driver, WebElement element) {
		//	Actions builder = new Actions(driver);
			//Action movToEle = builder.moveToElement(element).build();
			//movToEle.perform();
			//Action contextclickElements = builder.moveToElement(element).contextClick(element).build();
			//contextclickElements.perform();

	}
		public void windowHandle(WebDriver driver) {
			// currentWindow = driver.getWindowHandle();
			//Set<String> allWindows = driver.getWindowHandles();

			//for(String temp : allWindows) {
			//	driver .switchTo().window(temp);
	}
		
		public void waitForElement(WebElement element,WebDriver driver) {
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//wait.until(ExpectedConditions.elementToBeClickable(element));
			
		}
		public void enterText(String pValue,WebElement element, WebDriver driver) {
			//waitForElement(element, driver);
			//element.sendKeys(pValue);
		}
		public void asseRT(WebElement element,String expectedData,String message,int startingindex) {
			WebDriverWait time= new WebDriverWait(driver,Duration.ofSeconds(10));
			time.until(ExpectedConditions.elementToBeClickable(element));
			String data=element.getText();
			int endingindx=data.length();
			String actualDta=data.substring(startingindex, endingindx);
			assertEquals(actualDta,expectedData,message);
			
			
		}
		public void waitForElement(WebElement element) {
			WebDriverWait time= new WebDriverWait(driver,Duration.ofSeconds(30));
			time.until(ExpectedConditions.elementToBeClickable(element));
			}
		public void enterData(WebElement element,String inputText) {
			element.clear();
			element.sendKeys(inputText);
		}
		public void handleAlert() {
			WebDriverWait time= new WebDriverWait(driver,Duration.ofSeconds(10));
			time.until(ExpectedConditions.alertIsPresent());
			Alert allrt=driver.switchTo().alert();
			allrt.dismiss();
		}
		public void assertAlrt(String expectedData,String message) {
			WebDriverWait time= new WebDriverWait(driver,Duration.ofSeconds(10));
			time.until(ExpectedConditions.alertIsPresent());
			Alert allrt=driver.switchTo().alert();
			String actualData=allrt.getText();
			assertEquals(actualData, expectedData, message);
			
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
}
