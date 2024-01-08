
package com.ictwebsite.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AcademicMembership {

	WebDriver driver;
	public AcademicMembership(WebDriver driver) {
		this.driver = driver;
	}
	
	public void academicpage() {
        // Click on the Academic Membership option
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[text()=' Academic Membership ']")));
        WebElement academicMembershipOption = driver.findElement(By.xpath("//h6[text()=' Academic Membership ']"));
        academicMembershipOption.click();
        
        }
	
	public String AcademicHeading() {
		return driver.findElement(By.tagName("h1")).getText();
	}
	
	public void scrollpage() {
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(40, 400)");
        
	}
	
	public void viewmb() { 
		JavascriptExecutor jis = (JavascriptExecutor) driver;
        WebElement elementname = driver.findElement(By.xpath("//a[text()='View Members']"));
       // jis.executeScript("arguments[0].scrollIntoView();", elementname);
        
        jis.executeScript("arguments[0].click()",elementname);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[text()=' Academic Membership ']")));
         elementname.click();
        
        }
	
	
	
	
	
}
