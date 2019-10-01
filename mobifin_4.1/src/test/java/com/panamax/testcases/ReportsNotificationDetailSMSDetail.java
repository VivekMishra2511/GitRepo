package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsNotificationDetailSMSDetailWeb;
import com.panamax.init.Common;

public class ReportsNotificationDetailSMSDetail extends Common{
	HomeWeb homePage;
	ReportsNotificationDetailSMSDetailWeb reportsNotificationDetailSMSDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - NotificationDetail - SMSDetail - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchNotificationDetailSMSDetail, Author: Shivani Patel")
	public void searchSMSDetail()
	{
		if(count==0){
			homePage = goToHome();
			reportsNotificationDetailSMSDetailWeb = homePage.clickOnReportsNotificationDetailSMSDetail();
			count++;
		}
		reportsNotificationDetailSMSDetailWeb.searchSMSDetail();
		verifyTrue(reportsNotificationDetailSMSDetailWeb.verifysearchSMSDetail());
	}
}
