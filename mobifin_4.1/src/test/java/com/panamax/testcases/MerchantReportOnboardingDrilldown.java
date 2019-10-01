package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportOnboardingDrilldownWeb;
import com.panamax.init.Common;

public class MerchantReportOnboardingDrilldown extends Common{
	HomeWeb homePage;
	MerchantReportOnboardingDrilldownWeb merchantReportOnboardingDrilldownWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Onboarding Drilldown  - Search
	 * @creation date 18/12/2018
	 */
	@Test(description = "Id: SearchOnboardingDrilldownReport, Author: Shivani Patel")
	public void searchOnboardingDrilldownReport()
	{
		if(count==0){
			homePage = goToHome();
			merchantReportOnboardingDrilldownWeb = homePage.clickOnMerchantReportOnboardingDrilldown();
			count++;
		}
		merchantReportOnboardingDrilldownWeb.searchOnboardingDrilldown();
		verifyTrue(merchantReportOnboardingDrilldownWeb.verifysearchOnboardingDrilldown());
	}
}
