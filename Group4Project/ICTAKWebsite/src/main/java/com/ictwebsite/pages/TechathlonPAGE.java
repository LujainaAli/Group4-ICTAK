package com.ictwebsite.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ictwebsite.constants.AutomationConstants;

public class TechathlonPAGE {

	WebDriver driver;

	public TechathlonPAGE(WebDriver driver) {
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void techath() throws InterruptedException {
		WebElement tech = driver.findElement(By.xpath("//h6[text()=' Techathlon ']"));
		tech.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	


	public void apply2() {
		WebElement apply2 = driver.findElement(By.xpath("//button[text()=' Apply Now ']"));
		apply2.click();
	}

	public void name2() {

		WebElement name2 = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Name']"));
		name2.sendKeys(AutomationConstants.username1);

	}

	public void email2() {

		WebElement email2 = driver.findElement(By.xpath("//input[@type='email' and @placeholder='Email']"));
		email2.sendKeys(AutomationConstants.email1);

	}

	public void mobNum2() {

		WebElement mobnum = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Number']"));
		mobnum.sendKeys(AutomationConstants.mobilenum1);

	}

	public void register2() {

		WebElement reg2 = driver.findElement(By.xpath("//button[text()='Register' and @type='submit']"));
		reg2.click();
	}

	public void name3() {

		WebElement name3 = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Name']"));
		name3.sendKeys(AutomationConstants.username1);

	}

	public void email3() {

		WebElement email3 = driver.findElement(By.xpath("//input[@type='email' and @placeholder='Email']"));
		email3.sendKeys(AutomationConstants.email2);

	}

	public void mobNum3() {

		WebElement mobnum3 = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Number']"));
		mobnum3.sendKeys(AutomationConstants.mobilenum2);

	}

	public void blankvalues() {

		WebElement name3 = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Name']"));
		name3.sendKeys(AutomationConstants.username3);

		WebElement email3 = driver.findElement(By.xpath("//input[@type='email' and @placeholder='Email']"));
		email3.sendKeys(AutomationConstants.email3);

		WebElement mobnum3 = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Number']"));
		mobnum3.sendKeys(AutomationConstants.mobilenum3);
	}

	public boolean registrationDisabled() {

		boolean regs = driver.findElement(By.xpath("//button[text()='Register' and @type='submit']")).isEnabled();

		return regs;



	}
		public void objectives() {
		WebElement objec = driver.findElement(By.xpath("//a[text()=' Objectives']"));
		objec.click();

	}
	
	public boolean identifyKeywords() {
		
		boolean glob = driver.getPageSource().contains("Global Organizations");
		return glob;
	}
	
	
	
		
		
	
	}

