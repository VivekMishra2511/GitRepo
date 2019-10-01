package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsNotificationSummarySMSSummaryWeb;
import com.panamax.init.Common;

public class ReportsNotificationSummarySMSSummary extends Common{
	HomeWeb homePage;
	ReportsNotificationSummarySMSSummaryWeb reportsNotificationSummarySMSSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - NotificationSummary - SMSSummary - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchNotificationSummarySMSSummary, Author: Shivani Patel")
	public void searchSMSSummary()
	{
		if(count==0){
			homePage = goToHome();
			reportsNotificationSummarySMSSummaryWeb = homePage.clickOnReportsNotificationSummarySMSSummary();
			count++;
		}
		reportsNotificationSummarySMSSummaryWeb.searchSMSSummary();
		verifyTrue(reportsNotificationSummarySMSSummaryWeb.verifysearchSMSSummary());
	}
}
