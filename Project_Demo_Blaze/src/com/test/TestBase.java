package com.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
public static WebDriver driver;
public static Properties configProp;
public TestBase() {
	try {
		FileInputStream readConfigFile=new FileInputStream("E:\\Eclipse\\ProjectDemoBlaze\\Project_Demo_Blaze\\src\\com\\config\\config");
		configProp=new Properties();
		try {
			configProp.load(readConfigFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
public void initilization() {
	String URL=configProp.getProperty("URL");
	String browser=configProp.getProperty("browser");
	if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}else if(browser.equalsIgnoreCase("firefoxdriver")) {
		driver=new FirefoxDriver();
	}
	driver.get(URL);
	driver.manage().window().maximize();
}
}
