package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportOnboardingDetailWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class CustomerReportOnboardingDetail extends Common{
	HomeWeb homePage;
	CustomerReportOnboardingDetailWeb customerReportOnboardingDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Onboarding Detail  -Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchOnboardingDetailReport, Author: Shivani Patel")
	public void searchOnboardingDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			customerReportOnboardingDetailWeb = homePage.clickOnCustomerReportOnboardingDetail();
			count++;
		}
		
		customerReportOnboardingDetailWeb.searchOnboardingDetail();
		verifyTrue(customerReportOnboardingDetailWeb.verifysearchOnboardingDetail());
		
	}
}
