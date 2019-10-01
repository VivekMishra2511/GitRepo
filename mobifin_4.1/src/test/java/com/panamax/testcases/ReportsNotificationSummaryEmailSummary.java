package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsNotificationSummaryEmailSummaryWeb;
import com.panamax.init.Common;

public class ReportsNotificationSummaryEmailSummary extends Common{
	HomeWeb homePage;
	ReportsNotificationSummaryEmailSummaryWeb reportsNotificationSummaryEmailSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - NotificationSummary - EmailSummary - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchNotificationSummaryEmailSummary, Author: Shivani Patel")
	public void searchEmailSummary()
	{
		if(count==0){
			homePage = goToHome();
			reportsNotificationSummaryEmailSummaryWeb = homePage.clickOnReportsNotificationSummaryEmailSummary();
			count++;
		}
		reportsNotificationSummaryEmailSummaryWeb.searchEmailSummary();
		verifyTrue(reportsNotificationSummaryEmailSummaryWeb.verifysearchEmailSummary());
	}
}
