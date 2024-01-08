package com.ictwebsite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage {
	WebDriver driver = null;

	public ContactUsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickContactUsTab() {
		driver.findElement(By.xpath("//a[text()=' Contact Us ']")).click();
	}

	public void fillContactForm(String fullname, String emailid, String imlookingfor, String message) {
		driver.findElement(By.name("name")).sendKeys(fullname);
		driver.findElement(By.xpath("//input[@name='email' and @placeholder='Email id']")).sendKeys(emailid);
		driver.findElement(By.name("coursename")).sendKeys(imlookingfor);
		driver.findElement(By.name("subject")).sendKeys(message);

	}

	public Boolean clickSendMessage() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//button[text()='Send Message']"));
		Boolean buttonStatus = element.isEnabled();
		if (buttonStatus)
			driver.findElement(By.xpath("//button[text()='Send Message']")).click();
		return buttonStatus;
	}

	public String formAlert() {
		return driver.switchTo().alert().getText();
	}

}
