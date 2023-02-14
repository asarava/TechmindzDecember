package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties configProp;
	
	public TestBase() {
		configProp = new Properties();
		try {
			FileInputStream readConfig = new FileInputStream(
					"C:\\Users\\arunk\\OneDrive\\Desktop\\Selenium Project\\TestSelenium\\src\\main\\java\\com\\config\\config");
			configProp.load(readConfig);
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	//function to select initialize browser.
	public static void initialization() {
		String browserName = configProp.getProperty("browser");
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(configProp.getProperty("URL"));
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}
	

}
