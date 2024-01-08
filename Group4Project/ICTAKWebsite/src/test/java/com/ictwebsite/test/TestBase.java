package com.ictwebsite.test;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;

public class TestBase 
{
 WebDriver driver;
 public static Properties prop=null;
 
 @BeforeMethod
 public void setup() throws IOException
 {
	 prop= new Properties();
	 FileInputStream ip =new FileInputStream("D:\\Users\\ACER\\Desktop\\Group4Project\\ICTAKWebsite\\src\\test\\resources\\config.properties");
	 prop.load(ip);
	 driver = new ChromeDriver();
	 driver.get(prop.getProperty("url"));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.manage().window().maximize();
	 }

}
