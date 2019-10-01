package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportOnboardingDrilldownWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class CustomerReportOnboardingDrilldown extends Common{
	HomeWeb homePage;
	CustomerReportOnboardingDrilldownWeb customerReportOnboardingDrilldownWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Onboarding Drilldown  - Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchOnboardingDrilldownReport, Author: Shivani Patel")
	public void searchOnboardingDrilldownReport()
	{
		if(count==0){
			homePage = goToHome();
			customerReportOnboardingDrilldownWeb = homePage.clickOnCustomerReportOnboardingDrilldown();
			count++;
		}
		customerReportOnboardingDrilldownWeb.searchOnboardingDrilldown();
		verifyTrue(customerReportOnboardingDrilldownWeb.verifysearchOnboardingDrilldown());
	}
}
