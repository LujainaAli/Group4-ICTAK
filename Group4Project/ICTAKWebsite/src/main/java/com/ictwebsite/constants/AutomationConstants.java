package com.ictwebsite.constants;
import java.io.File;


public class AutomationConstants {
	
	public static String ExpectedText="ACADEMIC MEMBERSHIP";
	public static String ExpdText="CORPORATE MEMBERSHIP";
	public static String ExpectedTxt = "PARTNERSHIP";

	
	//Corporate Membership
	public static String fullname = "Anie";
    public static String addr ="ABC Street, Kammanahalli, Bangalore";
    public static String headorg = "USA";
    public static String natorg = "IT Services";
    public static String web = "www.test.com";
    public static String crpid = "AB123";
    public static String gstnum = "GST12345ACD";
    public static String noc = "Ben";
    public static String mob = "123456789";
    public static String skill = "Java";
    public static String emailad = "anie@gmail.com";
    public static String ect = "50";
	
    //Partnership
    public static String fname = "Anie Subin";
    public static String emailaddr = "anie123@gmail.com";
    public static String Phnumber = "0123456789";
    public static String pubdate = "01 Jan 2023";
    public static String Address = "Green Valley, Kowdiar, Tvm";
    public static String District = "Trivandrum";
    public static String Squarefeet = "5000 sq.ft";
    public static String empcount = "50";
    public static String briefreport = "Sample text1";
    public static String Expect = "Sample text2";
    public static String promot = "Sample text3";
    public static String sendmsg = "Success Message";

	public static String FullName = "Rani S";
	public static String Emailid = "ranis@gmail.com";
	public static String ImLookingFor = "Software Testing";
	public static String Message = "I want to do a course in software testing.";
	public static String expectedAlertMessage = "Message Send! Our Expert Team will Contact you Soon!";
	public static Boolean buttonStatus = false;

	public static String admin_username = "superadmin";
	public static String admin_password = "12345";
	public static String dashboard = "Dashboard";
	public static String user_username = "useradmin";
	public static String user_password = "12345";
	public static String invalid_username = "admin";
	public static String invalid_password = "password";
	public static String invalid_alert = "Invalid!";

	public static String userregistration_heading = "User Registration List";
	public static String partnership_heading = "Partnership Application";
	public static String academicmembership_heading = "Academic Membership";
	public static String corporatemembership_heading = "Corporate Membership";

	public static String expectedFileName = "ExcelSheet.xlsx";
	public static String downloadLocation = System.getProperty("user.dir") + File.separator + "externalFiles" + File.separator
			+ "downloadFiles";
}
