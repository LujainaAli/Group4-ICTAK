package com.ictwebsite.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ictwebsite.constants.AutomationConstants;
import com.ictwebsite.pages.DashboardDownloadPage;
import com.ictwebsite.pages.DashboardPage;
import com.ictwebsite.pageutility.LoginPageUtility;

public class DashboardDownloadTestClass {
	WebDriver driver = null;
	public static Properties prop = null;
	DashboardPage dashboardpage = null;
	DashboardDownloadPage dashboarddownloadpage = null;
	LoginPageUtility loginpageutility =null;

	FileInputStream ip = null;
	File file = null;

	@BeforeMethod
	public void setup() throws IOException {
		prop = new Properties();
		ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties");
		prop.load(ip);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", AutomationConstants.downloadLocation);
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(options);
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			FirefoxOptions profile = new FirefoxOptions();
			profile.addPreference("browser.download.folderList", 2);
			profile.addPreference("browser.download.dir", AutomationConstants.downloadLocation);
			profile.addPreference("browser.helperApps.neverAsk.openFile",
					"text/csv,application/x-msexcel,application/excel,"
							+ "application/x-excel,application/vnd.ms-excel,"
							+ "image/png,image/jpeg,text/html,text/plain," + "application/msword,application/xml");
			profile.addPreference("browser.helperApps.neverAsk.saveToDisk",
					"text/csv,application/x-msexcel," + "application/excel," + "application/x-excel,"
							+ "application/vnd.ms- excel,image/png,image/jpeg,text/html,"
							+ "text/plain,application/msword,application/xml");
			profile.addPreference("browser.helperApps.alwaysAsk.force", false);
			profile.addPreference("browser.download.manager.alertOnEXEOpen", false);
			profile.addPreference("browser.download.manager.focusWhenStarting", false);
			profile.addPreference("browser.download.manager.useWindow", false);
			profile.addPreference("browser.download.manager.showAlertOnComplete", false);
			profile.addPreference("browser.download.manager.closeWhenDone", false);
			driver = new FirefoxDriver(profile);
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test
	public void userRegistrationDetailsDownload() throws Exception {
		dashboardpage = new DashboardPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		dashboarddownloadpage = new DashboardDownloadPage(driver, AutomationConstants.downloadLocation);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		dashboardpage.userRegistration();
		dashboarddownloadpage.clickDownloadButton();
		Thread.sleep(5000);
		String fileName=dashboarddownloadpage.checkFileExist();
		Assert.assertEquals(AutomationConstants.expectedFileName, fileName);
	}

	@Test
	public void PartnershipDetailsDownload() throws Exception {
		dashboardpage = new DashboardPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		dashboarddownloadpage = new DashboardDownloadPage(driver, AutomationConstants.downloadLocation);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		dashboardpage.partnership();
		dashboarddownloadpage.clickDownloadButton();
		Thread.sleep(5000);
		String fileName=dashboarddownloadpage.checkFileExist();
		Assert.assertEquals(AutomationConstants.expectedFileName, fileName);
	}

	@Test
	public void AcademicMembershipDetailsDownload() throws Exception {
		dashboardpage = new DashboardPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		dashboarddownloadpage = new DashboardDownloadPage(driver, AutomationConstants.downloadLocation);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		dashboardpage.academicMembership();
		dashboarddownloadpage.clickDownloadButton();
		Thread.sleep(5000);
		String fileName=dashboarddownloadpage.checkFileExist();
		Assert.assertEquals(AutomationConstants.expectedFileName, fileName);
	}

	@Test
	public void CorporateMembershipDetailsDownload() throws Exception {
		dashboardpage = new DashboardPage(driver);
		loginpageutility= new LoginPageUtility(driver);
		dashboarddownloadpage = new DashboardDownloadPage(driver, AutomationConstants.downloadLocation);
		loginpageutility.loginAsAdmin(AutomationConstants.admin_username, AutomationConstants.admin_password);
		dashboardpage.corporateMembership();
		dashboarddownloadpage.clickDownloadButton();
		Thread.sleep(5000);
		String fileName=dashboarddownloadpage.checkFileExist();
		Assert.assertEquals(AutomationConstants.expectedFileName, fileName);
	}
	@AfterMethod
	public void finish() {
		driver.quit();
	}

}
