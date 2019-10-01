package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.AgentReportTransactionPerformanceWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class AgentReportTransactionPerformance extends Common{
	HomeWeb homePage;
	AgentReportTransactionPerformanceWeb agentReportTransactionPerformanceWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Transaction Performance  - Search
	 * @creation date 18/12/2018
	 */
	@Test(dataProvider = "AgentReportTransactionPerformance_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchTransactionPerformanceReport, Author: Shivani Patel")
	public void searchTransactionPerformanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			agentReportTransactionPerformanceWeb = homePage.clickOnAgentReportTransactionPerformance();
			count++;
		}
		agentReportTransactionPerformanceWeb.searchTransactionPerformance(map, getMapKeys(map));
		verifyTrue(agentReportTransactionPerformanceWeb.verifysearchTransactionPerformance(map, getMapKeys(map)));
	}
}
