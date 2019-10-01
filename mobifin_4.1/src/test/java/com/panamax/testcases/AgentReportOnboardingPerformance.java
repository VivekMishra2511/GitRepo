package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.AgentReportOnboardingPerformanceWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class AgentReportOnboardingPerformance extends Common{
	HomeWeb homePage;
	AgentReportOnboardingPerformanceWeb agentReportOnboardingPerformanceWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Onboarding Performance  - Search
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "AgentReportOnboardingPerformance_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchOnboardingPerformanceReport, Author: Shivani Patel")
	public void searchOnboardingPerformanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			agentReportOnboardingPerformanceWeb = homePage.clickOnAgentReportOnboardingPerformance();
			count++;
		}
		agentReportOnboardingPerformanceWeb.searchTransactionPerformance(map, getMapKeys(map));
		verifyTrue(agentReportOnboardingPerformanceWeb.verifysearchTransactionPerformance(map, getMapKeys(map)));
	}
}
