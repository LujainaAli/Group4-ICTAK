package com.ictwebsite.pageutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageUtility {
	WebDriver driver=null;
	public LoginPageUtility(WebDriver driver) {
		this.driver = driver;
	}
	public void loginAsAdmin(String username, String password) throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@name='email' and @placeholder='Enter Your Email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()=' Sign in ']")).click();
		Thread.sleep(5000);
	}
}
