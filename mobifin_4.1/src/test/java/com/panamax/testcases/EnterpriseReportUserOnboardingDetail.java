package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportUserOnboardingDetailWeb;
import com.panamax.init.Common;

public class EnterpriseReportUserOnboardingDetail extends Common{
	HomeWeb homePage;
	EnterpriseReportUserOnboardingDetailWeb enterpriseReportUserOnboardingDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - User Onboarding Detail  - Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchUserOnboardingDetailReport, Author: Shivani Patel")
	public void searchUserOnboardingDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportUserOnboardingDetailWeb = homePage.clickOnEnterpriseReportUserOnboardingDetail();
			count++;
		}
		enterpriseReportUserOnboardingDetailWeb.searchUserOnboardingDetail();
		verifyTrue(enterpriseReportUserOnboardingDetailWeb.verifysearchUserOnboardingDetail());
	}
}
