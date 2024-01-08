package com.ictwebsite.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ictwebsite.constants.AutomationConstants;

public class EventsPage {

	public WebDriver driver;

	public EventsPage(WebDriver driver) {
		this.driver = driver;
	}

	public void eventsFunc() {
		WebElement eventHover = driver.findElement(By.xpath("//a[text()=' Events ']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(eventHover);
		actions.click().build().perform();
	}

	public void icsetPage() {
		WebElement icsetpg = driver.findElement(By.xpath("//span[text()='Academic and industrial conclave']"));

		icsetpg.click();

	}

	public void agenda() {

		WebElement ag = driver.findElement(By.xpath("//a[text()='Agenda']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ag);

	}

	public String agendaContent() {

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement agenContent = driver.findElement(By.xpath("//h3[text()='Agenda']"));
		String ageC = wait1.until(ExpectedConditions.visibilityOf(agenContent)).getText();
		return ageC;

	}

	public void overView() {

		WebElement ovrview = driver.findElement(By.id("//a[@id='v-pills-messages-tab']"));
		ovrview.click();

	}

	public void training() {

		WebElement training1 = driver.findElement(By.xpath("//a[text()='Training']"));
		JavascriptExecutor jise = (JavascriptExecutor) driver;
		jise.executeScript("arguments[0].click()", training1);
	}

	public String trainingValue() {

		WebElement tr = driver.findElement(By.xpath("//h1[text()='Training']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		String tra = wait.until(ExpectedConditions.visibilityOf(tr)).getText();
		return tra;
	}

	public void applynow() {

		WebElement applynow = driver.findElement(By.xpath("//button[text()=' Apply Now ']"));
		applynow.click();
	}

	public void name() {

		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys(AutomationConstants.username1);

	}

	public void email() {
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(AutomationConstants.email1);
	}

	public void phonenumb() {

		WebElement numb = driver.findElement(By.xpath("//input[@name='phoneno']"));
		numb.sendKeys(AutomationConstants.mobilenum1);
	}

	public void register() {

		WebElement registr = driver.findElement(By.xpath("//button[text()='Register']"));
		registr.click();
	}

	public void name4() {

		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		name.sendKeys(AutomationConstants.username4);

	}

	public void email4() {
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys(AutomationConstants.email4);
	}

	public void phonenumb4() {

		WebElement numb = driver.findElement(By.xpath("//input[@name='phoneno']"));
		numb.sendKeys(AutomationConstants.mobilenum4);
	}

	public String successmsg() {
		String msg = driver.switchTo().alert().getText();
		return msg;
	}

	public void membershipDetails() {

		WebElement membDet = driver.findElement(By.xpath("//button[text()=' Get Access ']"));
		JavascriptExecutor jis = (JavascriptExecutor) driver;
		jis.executeScript("arguments[0].click()", membDet);

	}

	public String join() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement joinButton = driver.findElement(By.xpath("//h4[text()=' Join us today ']"));
		String joinButton1 = wait.until(ExpectedConditions.visibilityOf(joinButton)).getText();
		return joinButton1;
	}

	public boolean registDisabled() {

		boolean reg = driver.findElement(By.xpath("//button[text()='Register' and @type='submit']")).isEnabled();

		return reg;

	}
}
