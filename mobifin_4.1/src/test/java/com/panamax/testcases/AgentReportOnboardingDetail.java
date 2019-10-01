package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.AgentReportOnboardingDetailWeb;
import com.panamax.init.Common;

public class AgentReportOnboardingDetail extends Common{
	HomeWeb homePage;
	AgentReportOnboardingDetailWeb agentReportOnboardingDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Onboarding Detail  -Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchOnboardingDetailReport, Author: Shivani Patel")
	public void searchOnboardingDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			agentReportOnboardingDetailWeb = homePage.clickOnAgentReportOnboardingDetail();
			count++;
		}
		
		agentReportOnboardingDetailWeb.searchOnboardingDetail();
		verifyTrue(agentReportOnboardingDetailWeb.verifysearchOnboardingDetail());
		
	}
}
