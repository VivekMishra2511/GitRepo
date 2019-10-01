package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.AgentReportAssistantOnboardingDetailWeb;
import com.panamax.init.Common;

public class AgentReportAssistantOnboardingDetail extends Common{
	HomeWeb homePage;
	AgentReportAssistantOnboardingDetailWeb agentReportAssistantOnboardingDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Assistant Onboarding Detail  - Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchAssistantOnboardingDetailReport, Author: Shivani Patel")
	public void searchAssistantOnboardingDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			agentReportAssistantOnboardingDetailWeb = homePage.clickOnAgentReportAssistantOnboardingDetail();
			count++;
		}
		agentReportAssistantOnboardingDetailWeb.searchAssistantOnboardingDetail();
		verifyTrue(agentReportAssistantOnboardingDetailWeb.verifysearchAssistantOnboardingDetail());
	}
}
