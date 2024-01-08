
package com.ictwebsite.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;




public class MembershipsPage {

     WebDriver driver;
	
	public MembershipsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void testHoverMemberships() {
        
		//Hover over Memberships option
        WebElement membershipsMenu = driver.findElement(By.id("dropdownMenuDocs"));
        Actions actions = new Actions(driver);
        actions.moveToElement(membershipsMenu).perform();
        
	}
	
	
   }
	
	

	
	