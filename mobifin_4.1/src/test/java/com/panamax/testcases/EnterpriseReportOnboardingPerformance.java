package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportOnboardingPerformanceWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class EnterpriseReportOnboardingPerformance extends Common{
	HomeWeb homePage;
	EnterpriseReportOnboardingPerformanceWeb enterpriseReportOnboardingPerformanceWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Onboarding Performance  - Search
	 * @creation date 21/12/2018
	 */
	@Test(dataProvider = "EnterpriseReportOnboardingPerformance_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchOnboardingPerformanceReport, Author: Shivani Patel")
	public void searchOnboardingPerformanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportOnboardingPerformanceWeb = homePage.clickOnEnterpriseReportOnboardingPerformance();
			count++;
		}
		enterpriseReportOnboardingPerformanceWeb.searchTransactionPerformance(map, getMapKeys(map));
		verifyTrue(enterpriseReportOnboardingPerformanceWeb.verifysearchTransactionPerformance(map, getMapKeys(map)));
	}
}
