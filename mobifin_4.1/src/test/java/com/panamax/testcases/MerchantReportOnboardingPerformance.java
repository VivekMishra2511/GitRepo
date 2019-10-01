package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportOnboardingPerformanceWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class MerchantReportOnboardingPerformance extends Common{
	HomeWeb homePage;
	MerchantReportOnboardingPerformanceWeb merchantReportOnboardingPerformanceWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Onboarding Performance  - Search
	 * @creation date 18/12/2018
	 */
	@Test(dataProvider = "MerchantReportOnboardingPerformance_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchOnboardingPerformanceReport, Author: Shivani Patel")
	public void searchOnboardingPerformanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			merchantReportOnboardingPerformanceWeb = homePage.clickOnMerchantReportOnboardingPerformance();
			count++;
		}
		merchantReportOnboardingPerformanceWeb.searchTransactionPerformance(map, getMapKeys(map));
		verifyTrue(merchantReportOnboardingPerformanceWeb.verifysearchTransactionPerformance(map, getMapKeys(map)));
	}
}
