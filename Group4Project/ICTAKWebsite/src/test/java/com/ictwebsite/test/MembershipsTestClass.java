package com.ictwebsite.test;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;


import com.ictwebsite.constants.AutomationConstants;
import com.ictwebsite.pages.AcademicMembership;
import com.ictwebsite.pages.CorporateMembership;
import com.ictwebsite.pages.MembershipsPage;
import com.ictwebsite.pages.Partnership;

public class MembershipsTestClass extends TestBase{

	
	MembershipsPage mbp = null;
	AcademicMembership amb = null;
	CorporateMembership cmb = null;
	Partnership ptp = null;
	
	
	@Test
	
	public void testcase1() {
		mbp = new MembershipsPage(driver);
		mbp.testHoverMemberships();
		
			}
	
	
	@Test
	public void testcase2() {
		mbp = new MembershipsPage(driver);
		mbp.testHoverMemberships();
		
		amb = new AcademicMembership(driver);
		amb.academicpage();
		
	       // Verify if the Academic Membership page is displayed
		String actualResult = amb.AcademicHeading();
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedText);
     
	}
	
	
	@Test
	public void testcase3() {
		mbp = new MembershipsPage(driver);
		mbp.testHoverMemberships();
		
		try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		amb = new AcademicMembership(driver);
		amb.academicpage();
		amb.scrollpage();
		amb.viewmb();
	}
		
	@Test
	public void testcase4() throws InterruptedException {
		mbp = new MembershipsPage(driver);
		mbp.testHoverMemberships();
		
		cmb = new CorporateMembership(driver);
		cmb.corporatepage();
		
		// Verify if the Corporate Membership page is displayed
		String actResult = cmb.CorporateHeading();
		Assert.assertEquals(actResult, AutomationConstants.ExpdText);
	}
	
	@Test
	public void testcase5() throws InterruptedException {
		mbp = new MembershipsPage(driver);
		mbp.testHoverMemberships();
		
		cmb = new CorporateMembership(driver);
		cmb.corporatepage();
		cmb.register();
		cmb.scrollpage();
		cmb.name();
		cmb.address();
		cmb.head();
		cmb.nature();
		cmb.website();
		cmb.typeofcompany();
		cmb.corpidno();
		cmb.gstno();
		Thread.sleep(1000);
		cmb.nameofcontact();
		cmb.mobileno();
		cmb.technical();
		cmb.email();
		cmb.empcount();
		cmb.collaborate();
		cmb.noofpatents();
		cmb.averageyearly();
		cmb.corporateinterface();
		cmb.submit();
	
		}
	
	@Test
	public void testcase6() throws InterruptedException {
		mbp = new MembershipsPage(driver);
		mbp.testHoverMemberships();
		
		ptp = new Partnership(driver);
		ptp.partnershippage();
		
		// Verify if the Partnership page is displayed
		String actualResult = ptp.PartnershipHeading();
		Assert.assertEquals(actualResult, AutomationConstants.ExpectedTxt);
	}
	

	@Test
	
	public void testcase7() throws InterruptedException {
	mbp = new MembershipsPage(driver);
	mbp.testHoverMemberships();
	
		ptp = new Partnership(driver);
		ptp.partnershippage();
		ptp.registerh();
		ptp.scrollpage();
		ptp.fullname();
		ptp.email();
		ptp.phoneno();
		ptp.firm();
		ptp.addressdetails();
		ptp.district();
		ptp.officespace();
		ptp.numofemp();
		ptp.brief();
		ptp.expects();
		ptp.promoters();
		ptp.sendmsg();
		
	
	}
	
	
	
}
