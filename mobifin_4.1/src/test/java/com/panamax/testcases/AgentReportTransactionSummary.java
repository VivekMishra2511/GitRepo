package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.AgentReportTransactionSummaryWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class AgentReportTransactionSummary extends Common{
	HomeWeb homePage;
	AgentReportTransactionSummaryWeb agentReportTransactionSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Transaction Summary -Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchTransactionSummaryReport, Author: Shivani Patel")
	public void searchTransactionSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			agentReportTransactionSummaryWeb = homePage.clickOnAgentReportTransactionSummary();
			count++;
		}
		agentReportTransactionSummaryWeb.searchTransactionSummary();
		verifyTrue(agentReportTransactionSummaryWeb.verifysearchTransactionSummary());
	}
}
