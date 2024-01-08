package com.ictwebsite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
	WebDriver driver = null;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public void userRegistration() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Course Registration']//parent::a")).click();
	}

	public String checkUserRegistrationHeading() {
		return driver.findElement(By.tagName("h3")).getText();
	}

	public void partnership() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Partnership']//parent::a")).click();
	}

	public String checkPartnershipHeading() throws InterruptedException {
		return driver.findElement(By.xpath("//h5[text()='Partnership Application']")).getText();
	}

	public void academicMembership() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Academic Membership']//parent::a")).click();
	}

	public String checkAcademicMembershipHeading() throws InterruptedException {
		return driver.findElement(By.xpath("//h3[text()='Academic Membership']")).getText();
	}

	public void corporateMembership() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Corporate Membership']//parent::a")).click();
	}

	public String checkCorporateMembershipHeading() throws InterruptedException {
		return driver.findElement(By.xpath("//h5[text()='Corporate Membership']")).getText();
	}

	public void clickDownloadButton() {
		driver.findElement(By.xpath("//i[text()='arrow_downward']//parent::button")).click();
	}
}
