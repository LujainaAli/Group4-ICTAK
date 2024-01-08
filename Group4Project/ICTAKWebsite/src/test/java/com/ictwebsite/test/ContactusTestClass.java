package com.ictwebsite.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictwebsite.constants.AutomationConstants;
import com.ictwebsite.pages.ContactUsPage;

public class ContactusTestClass extends TestBase {
	ContactUsPage contactuspage = null;

	@Test
	public void sendMessageToContactUs() throws InterruptedException {
		contactuspage = new ContactUsPage(driver);
		contactuspage.clickContactUsTab();
		contactuspage.fillContactForm(AutomationConstants.FullName, AutomationConstants.Emailid,
				AutomationConstants.ImLookingFor, AutomationConstants.Message);
		contactuspage.clickSendMessage();
		String actualAlertMessage = contactuspage.formAlert();
		Assert.assertEquals(actualAlertMessage, AutomationConstants.expectedAlertMessage);
	}

	@Test
	public void sendMessageWithInvalidFieldsToContactUs() throws InterruptedException {
		contactuspage = new ContactUsPage(driver);
		contactuspage.clickContactUsTab();
		contactuspage.fillContactForm("", "", "", "");
		Boolean status = contactuspage.clickSendMessage();
		Assert.assertEquals(status, AutomationConstants.buttonStatus);
	}

}
