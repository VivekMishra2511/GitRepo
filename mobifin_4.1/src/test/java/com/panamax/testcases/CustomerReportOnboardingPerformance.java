package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportOnboardingPerformanceWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class CustomerReportOnboardingPerformance extends Common{
	HomeWeb homePage;
	CustomerReportOnboardingPerformanceWeb customerReportOnboardingPerformanceWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Onboarding Performance  - Search
	 * @creation date 20/12/2018
	 */
	@Test(dataProvider = "CustomerReportOnboardingPerformance_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchOnboardingPerformanceReport, Author: Shivani Patel")
	public void searchOnboardingPerformanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			customerReportOnboardingPerformanceWeb = homePage.clickOnCustomerReportOnboardingPerformance();
			count++;
		}
		customerReportOnboardingPerformanceWeb.searchTransactionPerformance(map, getMapKeys(map));
		verifyTrue(customerReportOnboardingPerformanceWeb.verifysearchTransactionPerformance(map, getMapKeys(map)));
	}
}
