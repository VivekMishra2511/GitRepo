package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportOnboardingDrilldownWeb;
import com.panamax.init.Common;

public class EnterpriseReportOnboardingDrilldown extends Common{
	HomeWeb homePage;
	EnterpriseReportOnboardingDrilldownWeb enterpriseReportOnboardingDrilldownWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Onboarding Drilldown  - Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchOnboardingDrilldownReport, Author: Shivani Patel")
	public void searchOnboardingDrilldownReport()
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportOnboardingDrilldownWeb = homePage.clickOnEnterpriseReportOnboardingDrilldown();
			count++;
		}
		enterpriseReportOnboardingDrilldownWeb.searchOnboardingDrilldown();
		verifyTrue(enterpriseReportOnboardingDrilldownWeb.verifysearchOnboardingDrilldown());
	}
}
