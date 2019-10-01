package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.AgentReportTransactionDrilldownWeb;
import com.panamax.init.Common;

public class AgentReportTransactionDrilldown extends Common{
	HomeWeb homePage;
	AgentReportTransactionDrilldownWeb agentReportTransactionDrilldownWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Transaction Drilldown -Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchTransactionDrilldownReport, Author: Shivani Patel")
	public void searchTransactionDrilldownReport()
	{
		if(count==0){
			homePage = goToHome();
			agentReportTransactionDrilldownWeb = homePage.clickOnAgentReportTransactionDrilldown();
			count++;
		}
		
		agentReportTransactionDrilldownWeb.searchTransactionDrilldown();
		verifyTrue(agentReportTransactionDrilldownWeb.verifysearchTransactionDrilldown());
		
	}
}
