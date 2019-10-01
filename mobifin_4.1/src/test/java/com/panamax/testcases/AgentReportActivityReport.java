package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.AgentReportActivityReportWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class AgentReportActivityReport extends Common{
	HomeWeb homePage;
	AgentReportActivityReportWeb agentReportActivityReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Activity Report  - Search
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "AgentReportActivityReport_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchActivityReport, Author: Shivani Patel")
	public void searchActivityReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			agentReportActivityReportWeb = homePage.clickOnAgentReportActivityReport();
			count++;
		}
		agentReportActivityReportWeb.searchActivityReport(map, getMapKeys(map));
		verifyTrue(agentReportActivityReportWeb.verifysearchActivityReport(map, getMapKeys(map)));
	}
}
