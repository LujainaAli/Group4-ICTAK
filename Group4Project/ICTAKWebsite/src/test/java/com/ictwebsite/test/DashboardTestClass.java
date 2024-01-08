package com.ictwebsite.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictwebsite.constants.AutomationConstants;
import com.ictwebsite.pages.DashboardPage;
import com.ictwebsite.pageutility.LoginPageUtility;

public class DashboardTestClass extends TestBase {

	DashboardPage dashboardpage = null;
	LoginPageUtility loginpageutility =null;

	@Test
	public void userRegistrationDetails() throws InterruptedException {
		dashboardpage = new DashboardPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		dashboardpage.userRegistration();
		String heading = dashboardpage.checkUserRegistrationHeading();
		Assert.assertEquals(heading, AutomationConstants.userregistration_heading);
	}

	@Test
	public void partnershipDetails() throws InterruptedException {
		dashboardpage = new DashboardPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		dashboardpage.partnership();
		String heading = dashboardpage.checkPartnershipHeading();
		Assert.assertEquals(heading, AutomationConstants.partnership_heading);
	}

	@Test
	public void academicMembershipDetails() throws InterruptedException {
		dashboardpage = new DashboardPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		dashboardpage.academicMembership();
		String heading = dashboardpage.checkAcademicMembershipHeading();
		Assert.assertEquals(heading, AutomationConstants.academicmembership_heading);
	}

	@Test
	public void corporateMembershipDetails() throws InterruptedException {
		dashboardpage = new DashboardPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		dashboardpage.corporateMembership();
		String heading = dashboardpage.checkCorporateMembershipHeading();
		Assert.assertEquals(heading, AutomationConstants.corporatemembership_heading);
	}
}
