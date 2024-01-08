package com.ictwebsite.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.ictwebsite.pages.EventsPage;

public class TestBase  {
	
	WebDriver driver;
	public static	Properties prop = new Properties();
		
		@BeforeMethod
		
		public void setup() throws IOException   {
			
			
			
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
			prop.load(ip);
			if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
				driver = new ChromeDriver();
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
				driver=new FirefoxDriver();
			else if(prop.getProperty("browser").equalsIgnoreCase("edge"))
				driver=new EdgeDriver();	
			
			
			driver.get("http://64.227.132.109/LandingPage");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			}
		
		@AfterMethod
		
		public void driverclose() {
			
			driver.quit();
		}
}
