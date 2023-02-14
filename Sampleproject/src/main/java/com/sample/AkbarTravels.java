package com.sample;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class AkbarTravels {
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.akbartravels.com/in/flight?lan=en");
		driver.manage().window().maximize();
		WebDriverWait waitList=new WebDriverWait(driver,Duration.ofSeconds(10));
		waitList.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='mat-radio-outer-circle'])[2]")));
		WebElement OneWayRadiobox =driver.findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[2]"));
		OneWayRadiobox.click();
	}

}
