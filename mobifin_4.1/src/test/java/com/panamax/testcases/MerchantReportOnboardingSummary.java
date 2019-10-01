package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportOnboardingSummaryWeb;
import com.panamax.init.Common;

public class MerchantReportOnboardingSummary extends Common{
	HomeWeb homePage;
	MerchantReportOnboardingSummaryWeb merchantReportOnboardingSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Onboarding Summary  - Search
	 * @creation date 18/12/2018
	 */
	@Test(description = "Id: SearchOnboardingSummaryReport, Author: Shivani Patel")
	public void searchOnboardingSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			merchantReportOnboardingSummaryWeb = homePage.clickOnMerchantReportOnboardingSummary();
			count++;
		}
		merchantReportOnboardingSummaryWeb.searchOnboardingSummary();
		verifyTrue(merchantReportOnboardingSummaryWeb.verifysearchOnboardingSummary());
	}
}
