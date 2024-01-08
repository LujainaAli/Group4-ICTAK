package com.ictwebsite.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ictwebsite.constants.AutomationConstants;
import com.ictwebsite.pages.EventsPage;
import com.ictwebsite.pages.TechathlonPAGE;

public class EventsTestClass extends TestBase {

	EventsPage event = null;
	TechathlonPAGE tech = null;

	@BeforeMethod

	public void bef() {
		event = new EventsPage(driver);
		event.eventsFunc();
	}

	@Test

	public void testcase1() {

		event.icsetPage();
		String actualICSETpg = driver.getCurrentUrl();
		AssertJUnit.assertEquals(actualICSETpg, AutomationConstants.ICSETloading);

	}

	@Test

	public void testcase2() {

		event.icsetPage();
		event.agenda();
		String agendaActual = event.agendaContent();
		AssertJUnit.assertEquals(agendaActual, AutomationConstants.agendaExpected);
	}

	@Test

	public void testcase3() {

		event.icsetPage();
		event.applynow();
		event.name();
		event.email();
		event.phonenumb();
		event.register();
		AssertJUnit.assertEquals(event.successmsg(), AutomationConstants.regSuccessMsg);

	}

	@Test

	public void testcase4() throws InterruptedException {

		tech = new TechathlonPAGE(driver);
		tech.techath();
		tech.apply2();
		tech.name2();
		tech.email2();
		tech.mobNum2();
		tech.register2();
		AssertJUnit.assertEquals(event.successmsg(), AutomationConstants.regSuccessMsg);

	}

	@Test

	public void testcase5() throws InterruptedException {

		tech = new TechathlonPAGE(driver);
		tech.techath();
		tech.apply2();
		tech.name3();
		tech.email3();
		tech.mobNum3();
		tech.register2();
		AssertJUnit.assertEquals(event.successmsg(), AutomationConstants.regUnsuccess);
	}

	@Test

	public void testcase6() throws InterruptedException {

		tech = new TechathlonPAGE(driver);
		tech.techath();
		tech.apply2();
		tech.blankvalues();
		boolean regisStatus = tech.registrationDisabled();
		AssertJUnit.assertFalse(regisStatus);
	}

	@Test
	public void testcase7() {

		event.icsetPage();
		event.applynow();
		event.name4();
		event.email4();
		event.phonenumb4();
		event.register();
		AssertJUnit.assertEquals(event.successmsg(), AutomationConstants.regUnsuccess);
	}

	@Test
	public void testcase8() {

		event.icsetPage();
		event.membershipDetails();
		String joinMembershipform = event.join();
		AssertJUnit.assertEquals(joinMembershipform, AutomationConstants.getAcess);
	}

	@Test

	public void testcase9() throws InterruptedException {
		event.eventsFunc();
		tech = new TechathlonPAGE(driver);
		tech.techath();
		tech.objectives();
		boolean idenKey = tech.identifyKeywords();
		AssertJUnit.assertTrue(idenKey);
	}

	@Test
	public void testcase10() throws InterruptedException {

		event.icsetPage();
		event.training();
		String trainVal = event.trainingValue();
		AssertJUnit.assertEquals(trainVal, AutomationConstants.trainingval);

	}

	@Test
	public void testcase11() throws InterruptedException {
		tech = new TechathlonPAGE(driver);
		tech.techath();
		String techpg = driver.getCurrentUrl();
		AssertJUnit.assertEquals(techpg, AutomationConstants.techURL);
	}

	@Test

	public void testcase12() {
		event.icsetPage();
		event.applynow();
		tech = new TechathlonPAGE(driver);
		tech.blankvalues();
		boolean regisStr = event.registDisabled();
		AssertJUnit.assertFalse(regisStr);
	}

}
