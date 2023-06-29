package Newtest_testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Newtest_driver.BaseDriver;
import Newtest_driver.PageDriver;
import Newtest_pages.Loginpage;

public class Login_Test extends BaseDriver{
	
	@BeforeClass
	public void openUrl() {
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
	}
	
	@Test(priority=0)
	public void loginTest() throws InterruptedException {
		Loginpage loginpage = new Loginpage();
		loginpage.login();
	}

}
