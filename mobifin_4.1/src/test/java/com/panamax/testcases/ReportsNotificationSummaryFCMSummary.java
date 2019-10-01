package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsNotificationSummaryFCMSummaryWeb;
import com.panamax.init.Common;

public class ReportsNotificationSummaryFCMSummary extends Common{
	HomeWeb homePage;
	ReportsNotificationSummaryFCMSummaryWeb reportsNotificationSummaryFCMSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - NotificationSummary - FCMSummary - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchNotificationSummaryFCMSummary, Author: Shivani Patel")
	public void searchFCMSummary()
	{
		if(count==0){
			homePage = goToHome();
			reportsNotificationSummaryFCMSummaryWeb = homePage.clickOnReportsNotificationSummaryFCMSummary();
			count++;
		}
		reportsNotificationSummaryFCMSummaryWeb.searchFCMSummary();
		verifyTrue(reportsNotificationSummaryFCMSummaryWeb.verifysearchFCMSummary());
	}
}
