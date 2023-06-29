package Newtest_testcases;

import org.testng.annotations.Test;
import Newtest_driver.BaseDriver;
import Newtest_pages.DashboardPage;


public class DashBoardTest extends BaseDriver {
		
		@Test(priority = 0)
		public void dashBoardTest() throws InterruptedException {
			DashboardPage dashboardPage = new DashboardPage();
			dashboardPage.checkDashboard();
     		dashboardPage.clickAdmin();
		}
		
		
}
