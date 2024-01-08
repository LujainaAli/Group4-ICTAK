package com.ictwebsite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver = null;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getDashboard() throws InterruptedException {
		Thread.sleep(5000);
		return driver.findElement(By.tagName("h4")).getText();
	}

	public String getInvalidAlert() {
		return driver.findElement(By.xpath("//div[text()='Invalid!']")).getText();
	}

}
