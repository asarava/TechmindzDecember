package com.base;



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
			configProp=new Properties();
			try {
				FileInputStream readconfig=new FileInputStream
						("C:\\Users\\User\\Desktop\\Final\\TechmindzDecember\\src\\main\\java\\com\\config\\config");
				configProp.load(readconfig);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		

}
		public static void initialization() {
			String browserName=configProp.getProperty("browser");
			if(browserName.equalsIgnoreCase("chrome")) {
				driver=new ChromeDriver();
			}
			else if(browserName.equalsIgnoreCase("firefox")) {
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(configProp.getProperty("URL"));
		}

	}

