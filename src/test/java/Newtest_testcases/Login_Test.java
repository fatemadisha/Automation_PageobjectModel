package Newtest_testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Newtest_driver.BaseDriver;
import Newtest_driver.PageDriver;
import Newtest_pages.Loginpage;
import Newtest_utilities.ExtentFactory;

public class Login_Test extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	
	@BeforeClass
	public void openUrl() {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>ORANGE HRM</b></p>").assignAuthor("QA TEAM").assignDevice("Windows");
	}
	
	@Test(priority=0)
	public void loginTest() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style=\"color:#3E96E7; font-size:20px\"><b>LOGIN TEST</b></p>");
		Loginpage loginpage = new Loginpage(childTest);
		loginpage.login();
	}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}

}
