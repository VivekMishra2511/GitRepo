package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.AgentReportOnboardingDrilldownWeb;
import com.panamax.init.Common;

public class AgentReportOnboardingDrilldown extends Common{
	HomeWeb homePage;
	AgentReportOnboardingDrilldownWeb agentReportOnboardingDrilldownWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Onboarding Drilldown  - Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchOnboardingDrilldownReport, Author: Shivani Patel")
	public void searchOnboardingDrilldownReport()
	{
		if(count==0){
			homePage = goToHome();
			agentReportOnboardingDrilldownWeb = homePage.clickOnAgentReportOnboardingDrilldown();
			count++;
		}
		agentReportOnboardingDrilldownWeb.searchOnboardingDrilldown();
		verifyTrue(agentReportOnboardingDrilldownWeb.verifysearchOnboardingDrilldown());
	}
}
