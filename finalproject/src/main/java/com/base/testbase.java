 package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.config.Config;

import zmq.ZError.IOException;

public class Testbase {
public static WebDriver driver;
public static Properties configprop;
//constructor to load config file
public Testbase() {
configprop =new Properties();
try {
FileInputStream readconfig=new FileInputStream
("\"C:\\Users\\sonia\\eclipse-workspace\\finalproject\\src\\main\\java\\com\\config");
try {
configprop.load(readconfig);
} catch (java.io.IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}catch (FileNotFoundException e) {
e.printStackTrace();
}
catch(IOException e) {
e.printStackTrace();{
e.printStackTrace();
}
}
}
//Functions to select,initialize and launch browser
public static void initialization() {

String browserName=configprop.getProperty("browser") ;
if(browserName.equalsIgnoreCase ("chrome")){
driver=new ChromeDriver();
}
else if (browserName.equalsIgnoreCase("firefox")) {
driver=new FirefoxDriver();
}
driver.manage().window().maximize();
driver.get(configprop.getProperty("URL"));

}

}
