package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsNotificationDetailEmailDetailWeb;
import com.panamax.init.Common;

public class ReportsNotificationDetailEmailDetail extends Common{
	HomeWeb homePage;
	ReportsNotificationDetailEmailDetailWeb reportsNotificationDetailEmailDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - NotificationDetail - EmailDetail - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchNotificationDetailEmailDetail, Author: Shivani Patel")
	public void searchEmailDetail()
	{
		if(count==0){
			homePage = goToHome();
			reportsNotificationDetailEmailDetailWeb = homePage.clickOnReportsNotificationDetailEmailDetail();
			count++;
		}
		reportsNotificationDetailEmailDetailWeb.searchEmailDetail();
		verifyTrue(reportsNotificationDetailEmailDetailWeb.verifysearchEmailDetail());
	}
}
