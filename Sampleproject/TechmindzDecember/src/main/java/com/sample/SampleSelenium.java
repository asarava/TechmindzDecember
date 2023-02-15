package com.sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.wrapper.wrapper;


public class SampleSelenium {
	public static void main(String[] args) throws InterruptedException {
		wrapper wrppObj = new wrapper();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		//driver.manage().window().maximize();
		//WebElement pSelect=driver.findElement(By.xpath("//p//select"));
		//wrppObj.selectByValue(driver, pSelect, "BLR");
		//wrppObj.selectByVisibleText(driver,pSelect,"India");
		//wrppObj.selectByIndex(driver,pSelect,1);
		//WebElement pmoveToElement =driver.findElement(By.xpath("//<li>[@id='menu-item-7128']"));
		//wrppObj.moveToElement(driver,pmoveToElement);
		//wrppObj.contextClick(driver, pmoveToElement);
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.manage().window().maximize();
		WebElement pOpenNew=driver.findElement(By.xpath("(//*[text()='Click Here'])[1]"));
		pOpenNew.click();
		pOpenNew.click();
		pOpenNew.click();
		pOpenNew.click();
		pOpenNew.click();
		wrppObj.windowHandle(driver);

		}

		}


