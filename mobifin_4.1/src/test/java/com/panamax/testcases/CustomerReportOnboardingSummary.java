package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportOnboardingSummaryWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class CustomerReportOnboardingSummary extends Common{
	HomeWeb homePage;
	CustomerReportOnboardingSummaryWeb customerReportOnboardingSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Onboarding Summary  - Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchOnboardingSummaryReport, Author: Shivani Patel")
	public void searchOnboardingSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			customerReportOnboardingSummaryWeb = homePage.clickOnCustomerReportOnboardingSummary();
			count++;
		}
		customerReportOnboardingSummaryWeb.searchOnboardingSummary();
		verifyTrue(customerReportOnboardingSummaryWeb.verifysearchOnboardingSummary());
	}
}
