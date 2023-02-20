package com.Base;

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
		
		//Constructor to load Config file
		public TestBase()  {
			try {
				configProp = new Properties();
				FileInputStream readConfig = new FileInputStream
						("C:\\Users\\HP\\OneDrive\\Desktop\\Final Project\\DemoBlaze\\src\\main\\java\\com\\config\\config");
				configProp.load(readConfig);
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		}

public static void initialization() {
	String URL = configProp.getProperty("URL");
	 String browser = configProp.getProperty("browser");
	    
	   if (browser.equalsIgnoreCase("chrome"));{
	       driver = new ChromeDriver();
	       }  if(browser.equalsIgnoreCase("firefox")) {
	    	   driver = new FirefoxDriver();
	       
 }
	       driver.get(URL);
	       driver.manage().window().maximize();
		   
	       
		   

}
}



