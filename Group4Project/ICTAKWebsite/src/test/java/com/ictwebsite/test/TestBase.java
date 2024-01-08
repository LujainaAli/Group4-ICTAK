package com.ictwebsite.test;

import java.io.FileInputStream;
import java.io.FileInputStre;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	WebDriver driver = null;
	public static Properties prop = null;

	@BeforeMethod
	public void setup() throws IOException {
		prop = new Properties();
//		FileInputStream ip = new FileInputStream(
//				"E:\Group4Project\ICTAKWebsite\src\test\resources\config.properties");
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		prop.load(ip);
		if (prop.getProperty("browser").equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterMethod
	public void finish() {
		driver.quit();
	}
}
