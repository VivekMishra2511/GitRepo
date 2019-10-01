package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportOnboardingDetailWeb;
import com.panamax.init.Common;

public class MerchantReportOnboardingDetail extends Common{
	HomeWeb homePage;
	MerchantReportOnboardingDetailWeb merchantReportOnboardingDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Onboarding Detail  -Search
	 * @creation date 18/12/2018
	 */
	@Test(description = "Id: SearchOnboardingDetailReport, Author: Shivani Patel")
	public void searchOnboardingDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			merchantReportOnboardingDetailWeb = homePage.clickOnMerchantReportOnboardingDetail();
			count++;
		}
		
		merchantReportOnboardingDetailWeb.searchOnboardingDetail();
		verifyTrue(merchantReportOnboardingDetailWeb.verifysearchOnboardingDetail());
		
	}
}
