package com.ictwebsite.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


import com.ictwebsite.pages.Homepage;

import ictwebsite.constants.AutomationConstants;

public class TestClass extends TestBase 
{
	Homepage obj=null;
	@Test(priority=1)

	public void home()
	{
		obj= new Homepage(driver);
		obj.assertHome();
		String hm= AutomationConstants.name;
		Assert.assertEquals(hm,driver.findElement(By.xpath("//h1[normalize-space()='ICT Academy of Kerala']")).getText());
//		Assert.assertEquals(actual_url, AutomationConstants.VALID_NAME);
		
	}
    @Test(priority=2)
    
	public void gstart()
	{
    	obj= new Homepage(driver);
		obj.Gstarted();
		String gs= AutomationConstants.CO_NAME;
		Assert.assertEquals(gs,driver.findElement(By.xpath("//h2[normalize-space()='Our Courses']")).getText());
		
//		Assert.assertEquals(actual_url, AutomationConstants.VALID_NAME);
//    	obj=new Homepage(driver);
//    	String actual_url= obj.Gstarted();
//		Assert.assertEquals(actual_url, AutomationConstants.CO_NAME);
    }
    @Test(priority=3)
    public void abtus()
	{
    	obj= new Homepage(driver);
		obj.aboutUs();
		
		Assert.assertEquals(AutomationConstants.test,driver.findElement(By.xpath("//h1[text()='ABOUT US']")).getText());
	}
    
    @Test(priority=4)
    public void courses() throws InterruptedException
	{		
		obj=new Homepage(driver);
		obj.courseList("anu","anu@gmail.com",1234567890);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
  
//    @Test(priority=5)
//    public void aply()
//    {
//    	
//		String au=AutomationConstants.soft;
//		Assert.assertEquals(au,driver.findElement(By.xpath("//button[normalize-space()='Apply Now']")).getText());
//	}
   }
    

  
   
    
    
    
    

