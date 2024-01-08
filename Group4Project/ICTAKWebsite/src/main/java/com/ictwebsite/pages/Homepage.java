
package com.ictwebsite.pages;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Homepage 
 {
	WebDriver driver;

public Homepage(WebDriver driver)
	{
	this.driver=driver;
	}
 
public void assertHome()
{
    WebElement home=driver.findElement(By.xpath("//a[@id=\"dropdownMenuPages\" and contains(@class, \"nav-link\") and contains(@class, \"ps-2\") and contains(@class, \"d-flex\") and contains(@class, \"cursor-pointer\") and contains(@class, \"align-items-center\") and @href=\"/\"]"));
    home.click();
     
}

public void Gstarted()
{
	WebElement gstart = driver.findElement(By.xpath("//button[normalize-space()='Get Started']"));
	 gstart.click();
//	 return driver.getCurrentUrl();
 }	 
public void aboutUs()
 {
	WebElement abtus = driver.findElement(By.xpath("//a[@id=\"dropdownMenuPages\" and contains(@class, \"nav-link\") and contains(@class, \"ps-2\") and contains(@class, \"d-flex\") and contains(@class, \"cursor-pointer\") and contains(@class, \"align-items-center\") and @href=\"/LandingPage/about\"]"));
	abtus.click();
	
	}
//public void courses() 
//{
//	WebElement Course=driver.findElement(By.xpath("//a[@id='dropdownMenuBlocks']"));
//	Course.click();
	
	public void courseList(String nam,String mail,int num) throws InterruptedException
	{
		 WebElement drdown = driver.findElement(By.xpath("//a[@id='dropdownMenuBlocks']"));
		 drdown.click();
		 WebElement crs = driver.findElement(By.xpath("//li[1]//a[1]//div[1]//div[1]"));
		 crs.click();
        
		 WebElement aply = driver.findElement(By.xpath("//button[normalize-space()='Apply Now']"));
		 aply.click();
		 
		 String stringValue = String.valueOf(num);
		 WebElement uname= driver.findElement(By.xpath("//input[@placeholder='Name']"));
			uname.sendKeys(nam);
			WebElement umail= driver.findElement(By.xpath("//input[@placeholder='Email']"));
			umail.sendKeys(mail);
			WebElement unum= driver.findElement(By.xpath("//input[@placeholder='Number']"));
		    unum.sendKeys(stringValue);
			WebElement reg = driver.findElement(By.xpath("//button[normalize-space()='Register']"));
			 reg.click();
	
}


//public String about()
//{
//	WebElement Abt = driver.findElement(By.xpath("//span[@class='mask bg-gradient-info opacity-8']"));
//	Abt.click();
//	return driver.getCurrentUrl();
//	}

}


