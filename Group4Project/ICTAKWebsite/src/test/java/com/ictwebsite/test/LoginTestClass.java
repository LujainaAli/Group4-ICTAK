package com.ictwebsite.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictwebsite.constants.AutomationConstants;
import com.ictwebsite.pages.LoginPage;
import com.ictwebsite.pageutility.LoginPageUtility;

public class LoginTestClass extends TestBase {
	LoginPage loginpage = null;
	LoginPageUtility loginpageutility =null;

	@Test
	public void loginAsAdmin() throws InterruptedException {
		loginpage = new LoginPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		String dashboardtext = loginpage.getDashboard();
		Assert.assertEquals(dashboardtext, AutomationConstants.dashboard);
	}

	@Test
	public void loginAsUser() throws InterruptedException {
		loginpage = new LoginPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		loginpageutility.loginAsAdmin(AutomationConstants.user_username, AutomationConstants.user_password);
		String dashboardtext = loginpage.getDashboard();
		Assert.assertEquals(dashboardtext, AutomationConstants.dashboard);
	}

	@Test
	public void loginWithInvalidAdminPassword() throws InterruptedException {
		loginpage = new LoginPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.invalid_password);
		String dashboardtext = loginpage.getInvalidAlert();
		Assert.assertEquals(dashboardtext, AutomationConstants.invalid_alert);
	}

	@Test
	public void loginWithInvalidCredentials() throws InterruptedException {
		loginpage = new LoginPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		loginpageutility.loginAsAdmin(AutomationConstants.invalid_username, AutomationConstants.invalid_password);
		String dashboardtext = loginpage.getInvalidAlert();
		Assert.assertEquals(dashboardtext, AutomationConstants.invalid_alert);
	}

}
