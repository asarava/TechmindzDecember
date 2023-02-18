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
	public static Properties ConfigProp;
	
	public TestBase(){
		//Reading Config file
		try {
			ConfigProp=new Properties();
			FileInputStream readConfigLoc=new FileInputStream("C:\\Users\\dell\\Desktop\\Final\\Final\\src\\main\\java\\com\\config\\config");
			ConfigProp.load(readConfigLoc);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	//Initializing WebDriver
	@SuppressWarnings("deprecation")
	public static void initialization() {
		String browserName=ConfigProp.getProperty("browser");
		if (browserName.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}else if (browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(ConfigProp.getProperty("URL"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	}
}