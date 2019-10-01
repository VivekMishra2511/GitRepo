package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportOnboardingSummaryWeb;
import com.panamax.init.Common;

public class EnterpriseReportOnboardingSummary extends Common{
	HomeWeb homePage;
	EnterpriseReportOnboardingSummaryWeb enterpriseReportOnboardingSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Onboarding Summary  - Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchOnboardingSummaryReport, Author: Shivani Patel")
	public void searchOnboardingSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportOnboardingSummaryWeb = homePage.clickOnEnterpriseReportOnboardingSummary();
			count++;
		}
		enterpriseReportOnboardingSummaryWeb.searchOnboardingSummary();
		verifyTrue(enterpriseReportOnboardingSummaryWeb.verifysearchOnboardingSummary());
	}
}
