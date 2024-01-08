
package com.ictwebsite.pages;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import com.ictwebsite.constants.AutomationConstants;

public class Partnership {

	WebDriver driver;
	public Partnership(WebDriver driver) {
		this.driver = driver;
	}
	
	public void partnershippage() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      //  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h6[text()=' Partnership ']")));
		WebElement partnershipOption = driver.findElement(By.xpath("//h6[text()=' Partnership ']"));
        partnershipOption.click();
        
        
	}
	
	public String PartnershipHeading() {
		return driver.findElement(By.tagName("h1")).getText();
	}
    
	
	public void registerh() {
        //Click on Register here button
    	WebElement reghere = driver.findElement(By.xpath("//button[text()='Register Here']"));
    	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
        reghere.click();
    }
	
	public void scrollpage() {
    	JavascriptExecutor js = (JavascriptExecutor)driver;
   	  js.executeScript("window.scrollBy(40, 400)");
    }
	
	public void fullname() throws InterruptedException   {
   	 
        WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        name.sendKeys(AutomationConstants.fname);
        Thread.sleep(1000);
       
        }
	
	public void email() throws InterruptedException {
    	WebElement email1 = driver.findElement(By.xpath("//input[@placeholder=' Email']"));
    	email1.sendKeys(AutomationConstants.emailaddr);
    	Thread.sleep(1000);
    }
	
	public void phoneno() throws InterruptedException {
    	WebElement phno = driver.findElement(By.xpath("//input[@placeholder=' Contact Number']"));
    	phno.sendKeys(AutomationConstants.Phnumber);
    	Thread.sleep(1000);
    }
	
	public void firm() throws InterruptedException {
    	WebElement firm1 = driver.findElement(By.xpath("//input[@placeholder='Published Date']"));
    	firm1.sendKeys(AutomationConstants.pubdate);
    	Thread.sleep(1000);
    }
	
	public void addressdetails() throws InterruptedException {
    	WebElement addr1 = driver.findElement(By.xpath("//input[@placeholder='Address']"));
    	addr1.sendKeys(AutomationConstants.Address);
    	Thread.sleep(1000);
    }
	
	public void district() throws InterruptedException {
    	WebElement dis = driver.findElement(By.xpath("//input[@placeholder='Distict']"));
    	dis.sendKeys(AutomationConstants.District);
    	Thread.sleep(1000);
    }
	
	public void officespace() throws InterruptedException {
    	WebElement sqft = driver.findElement(By.xpath("//input[@placeholder=' Office Space in Square Feet']"));
    	sqft.sendKeys(AutomationConstants.Squarefeet);
    	Thread.sleep(1000);
    }
	
	public void numofemp() throws InterruptedException {
    	WebElement empc = driver.findElement(By.xpath("//input[@placeholder='Number of Employees']"));
    	empc.sendKeys(AutomationConstants.empcount);
    	Thread.sleep(1000);
    }
	
	public void brief() throws InterruptedException {
    	WebElement bre = driver.findElement(By.xpath("//textarea[@name='report']"));
    	bre.sendKeys(AutomationConstants.briefreport);
    	Thread.sleep(1000);
    }
	
	public void expects() throws InterruptedException {
    	WebElement exp = driver.findElement(By.xpath("//textarea[@name='expect']"));
    	exp.sendKeys(AutomationConstants.Expect);
    	Thread.sleep(1000);
    }
	
	public void promoters() throws InterruptedException {
    	WebElement promo = driver.findElement(By.xpath("//textarea[@placeholder='Brief Profile of the promoters']"));
    	promo.sendKeys(AutomationConstants.promot);
    	Thread.sleep(1000);
    }
	
	public void sendmsg() throws InterruptedException {
    	WebElement msg = driver.findElement(By.xpath("//button[text()='Send Message']"));
    	Thread.sleep(1000);
    	msg.click();
    	
    }
	
}
