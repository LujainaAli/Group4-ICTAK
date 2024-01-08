package com.ictwebsite.pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardDownloadPage {
	WebDriver driver = null;
	String downloadLocation = null;

	public DashboardDownloadPage(WebDriver driver, String downloadLocation) {
		this.driver = driver;
		this.downloadLocation = downloadLocation;
	}

	public void clickDownloadButton() throws Exception {
		File files = new File(downloadLocation);
		for (File file : files.listFiles())
			if (!file.isDirectory())
				file.delete();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//i[text()='arrow_downward']//parent::button")).click();
	}

	public String checkFileExist() {
		File folder = new File(downloadLocation);
		File[] listOfFiles = folder.listFiles();
		String fileName = null;
		for (File listOfFile : listOfFiles)
			if (listOfFile.isFile())
				fileName = listOfFile.getName();
		return fileName;
	}
}
