package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportOnboardingDetailWeb;
import com.panamax.init.Common;

public class EnterpriseReportOnboardingDetail extends Common{
	HomeWeb homePage;
	EnterpriseReportOnboardingDetailWeb enterpriseReportOnboardingDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Onboarding Detail  -Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchOnboardingDetailReport, Author: Shivani Patel")
	public void searchOnboardingDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportOnboardingDetailWeb = homePage.clickOnEnterpriseReportOnboardingDetail();
			count++;
		}
		
		enterpriseReportOnboardingDetailWeb.searchOnboardingDetail();
		verifyTrue(enterpriseReportOnboardingDetailWeb.verifysearchOnboardingDetail());
		
	}
}
