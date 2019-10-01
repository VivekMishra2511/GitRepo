package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportTerminalOnboardingDetailWeb;
import com.panamax.init.Common;

public class MerchantReportTerminalOnboardingDetail extends Common{
	HomeWeb homePage;
	MerchantReportTerminalOnboardingDetailWeb merchantReportTerminalOnboardingDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Terminal Onboarding Detail  - Search
	 * @creation date 18/12/2018
	 */
	@Test(description = "Id: SearchTerminalOnboardingDetailReport, Author: Shivani Patel")
	public void searchTerminalOnboardingDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			merchantReportTerminalOnboardingDetailWeb = homePage.clickOnMerchantReportTerminalOnboardingDetail();
			count++;
		}
		merchantReportTerminalOnboardingDetailWeb.searchTerminalOnboardingDetail();
		verifyTrue(merchantReportTerminalOnboardingDetailWeb.verifysearchTerminalOnboardingDetail());
	}
}
