
package com.ictwebsite.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.ictwebsite.constants.AutomationConstants;

public class CorporateMembership {
	
	WebDriver driver;
	public CorporateMembership(WebDriver driver) {
		this.driver = driver;
	}
	
    public void corporatepage() {
    	// Click on the Corporate Membership option
    	
    	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("h6[contains(text(),' Corporate Membership ')]")));
    	
        WebElement corporateMembershipOption = driver.findElement(By.xpath("//h6[text()=' Corporate Membership ']"));
        corporateMembershipOption.click();
        //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        }
    
    public String CorporateHeading() {
		return driver.findElement(By.tagName("h1")).getText();
	}
    
    
        public void register() throws InterruptedException  {
        //Click on Register here button
    	
        WebElement registerhere = driver.findElement(By.xpath("//button[text()='Register Here']"));
         registerhere.click(); 
         Thread.sleep(1000);
    }
    
    public void scrollpage() {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
   	  js.executeScript("window.scrollBy(40, 400)");
    }
     
    
     public void name() throws InterruptedException   {
    	 
         WebElement name1 = driver.findElement(By.xpath("//input[@name='name']"));
         name1.sendKeys(AutomationConstants.fullname);
         Thread.sleep(1000);
        
         }
    
    public void address() throws InterruptedException {
    	WebElement address1 = driver.findElement(By.xpath("//input[@name='address']"));
    	address1.sendKeys(AutomationConstants.addr);
    	Thread.sleep(1000);
    }
    
    public void head() throws InterruptedException {
    	WebElement head1 = driver.findElement(By.xpath("//input[@name='head']"));
    	head1.sendKeys(AutomationConstants.headorg);
    	Thread.sleep(1000);
    }
    
    public void nature() throws InterruptedException {
    	WebElement nature1 = driver.findElement(By.xpath("//input[@name='nature']"));
    	nature1.sendKeys(AutomationConstants.natorg);
    	Thread.sleep(1000);
    }
	
    public void website() throws InterruptedException {
    	WebElement website1 = driver.findElement(By.xpath("//input[@name='website']"));
    	website1.sendKeys(AutomationConstants.web);
    	Thread.sleep(1000);
    }
 
public void typeofcompany() throws InterruptedException  {
    	
    	WebElement toc = driver.findElement(By.xpath("//select[@formcontrolname='typeof']"));
    	toc.click();
    	Thread.sleep(1000);
    	WebElement alloptions = driver.findElement(By.xpath("//select[@formcontrolname='typeof']"));
    	Select option = new Select(alloptions);
    	List<WebElement> list = option.getOptions();
    	
    	for(WebElement elem :list) {
    		option.selectByVisibleText(elem.getAccessibleName());
    	}
    	}


    public void corpidno() throws InterruptedException {
    	WebElement corpid = driver.findElement(By.xpath("//input[@type='text' and@name='identityNo']"));
    	corpid.sendKeys(AutomationConstants.crpid);
    	Thread.sleep(1000);
    }
   
    public void gstno() throws InterruptedException {
    	WebElement gst = driver.findElement(By.xpath("//input[@name='GST']"));
    	gst.sendKeys(AutomationConstants.gstnum);
    	Thread.sleep(1000);
    }
   
    /////// Point of Contact /////////
    
    public void nameofcontact() throws InterruptedException {
    	WebElement name1 = driver.findElement(By.xpath("//input[@name='nameofContact']"));
    	name1.sendKeys(AutomationConstants.noc);
    	Thread.sleep(1000);
    }
    
   public void mobileno() throws InterruptedException {
	   WebElement mobile = driver.findElement(By.xpath("//label[contains(text(), 'Mobile Number')]//parent::Div//following-sibling::Div//child::input"));
	   mobile.sendKeys(AutomationConstants.mob);
	   Thread.sleep(1000);
   }
 
   public void technical() throws InterruptedException {
	   WebElement tech = driver.findElement(By.xpath("//input[@name='TechnicalSkill']"));
	   tech.sendKeys(AutomationConstants.skill);
	   Thread.sleep(1000);
   }
   
   public void email() throws InterruptedException {
	   WebElement emailaddr = driver.findElement(By.xpath("//input[@name='email' and @formcontrolname='email']"));
	   emailaddr.sendKeys(AutomationConstants.emailad);
	   Thread.sleep(1000);
   }
    
   public void empcount() throws InterruptedException {
	   WebElement ecount = driver.findElement(By.xpath("//input[@name='employeeCount']"));
	   ecount.sendKeys(AutomationConstants.ect);
	   Thread.sleep(1000);
   }
   
   public void collaborate() throws InterruptedException {
      
       WebElement collab = driver.findElement(By.xpath("//ng-select[@formcontrolname='collaborate']")); 
   	   Thread.sleep(1000);
       collab.click();
       Thread.sleep(1000);
       WebElement dropdowncollab = driver.findElement(By.xpath("//span[@class='ng-arrow-wrapper']"));
       //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       Select dropdown = new Select(dropdowncollab);
       dropdown.selectByVisibleText("Fresher hiring");
   }

   public void noofpatents() throws InterruptedException  {
   	
   	WebElement nop = driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
	Thread.sleep(1000);
   	nop.click();
   	Thread.sleep(1000);
   	WebElement allselens = driver.findElement(By.xpath("//select[@class='form-control ng-pristine ng-valid ng-touched']"));
   	Select option = new Select(allselens);
   	List<WebElement> list = option.getOptions();
   	
   	for(WebElement eleme :list) {
   		option.selectByVisibleText(eleme.getAccessibleName());
   	}
   	}
   
   public void averageyearly() throws InterruptedException  {
	   	
	   	WebElement ayc = driver.findElement(By.xpath("//select[@formcontrolname='hire']"));
		Thread.sleep(1000);
	   	ayc.click();
	    WebElement avgop = driver.findElement(By.xpath("//select[@formcontrolname='hire']"));
	   	Select option = new Select(avgop);
	   	List<WebElement> list = option.getOptions();
	   	
	   	for(WebElement elemen :list) {
	   		option.selectByVisibleText(elemen.getAccessibleName());
	   	}
	   	}
   
   public void corporateinterface() throws InterruptedException  {
	   	
	   	WebElement cip = driver.findElement(By.xpath("//input[@name='details']"));
		Thread.sleep(1000);
	   	cip.click();
	   	
   }
   
   public void submit() throws InterruptedException  {
	   	
	   	WebElement reg = driver.findElement(By.xpath("//input[@type='submit']"));
		Thread.sleep(1000);
	   	reg.click();
	   	
  }
   
}