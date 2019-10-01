package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.AgentReportOnboardingSummaryWeb;
import com.panamax.init.Common;

public class AgentReportOnboardingSummary extends Common{
	HomeWeb homePage;
	AgentReportOnboardingSummaryWeb agentReportOnboardingSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Onboarding Summary  - Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchOnboardingSummaryReport, Author: Shivani Patel")
	public void searchOnboardingSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			agentReportOnboardingSummaryWeb = homePage.clickOnAgentReportOnboardingSummary();
			count++;
		}
		agentReportOnboardingSummaryWeb.searchOnboardingSummary();
		verifyTrue(agentReportOnboardingSummaryWeb.verifysearchOnboardingSummary());
	}
}
