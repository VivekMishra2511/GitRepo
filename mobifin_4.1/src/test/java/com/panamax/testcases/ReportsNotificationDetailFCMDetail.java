package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsNotificationDetailFCMDetailWeb;
import com.panamax.init.Common;

public class ReportsNotificationDetailFCMDetail extends Common{
	HomeWeb homePage;
	ReportsNotificationDetailFCMDetailWeb reportsNotificationDetailFCMDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - NotificationDetail - FCMDetail - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchNotificationDetailFCMDetail, Author: Shivani Patel")
	public void searchFCMDetail()
	{
		if(count==0){
			homePage = goToHome();
			reportsNotificationDetailFCMDetailWeb = homePage.clickOnReportsNotificationDetailFCMDetail();
			count++;
		}
		reportsNotificationDetailFCMDetailWeb.searchFCMDetail();
		verifyTrue(reportsNotificationDetailFCMDetailWeb.verifysearchFCMDetail());
	}
}
