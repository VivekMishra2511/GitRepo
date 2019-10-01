package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.AgentReportTransactionDetailWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class AgentReportTransactionDetail extends Common{
	HomeWeb homePage;
	AgentReportTransactionDetailWeb agentReportTransactionDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Agent - Report - Transaction Detail -Search
	 * @creation date 19/12/2018
	 */
	@Test(description = "Id: SearchTransactionDetailReport, Author: Shivani Patel")
	public void searchTransactionDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			agentReportTransactionDetailWeb = homePage.clickOnAgentReportTransactionDetail();
			count++;
		}
		agentReportTransactionDetailWeb.searchTransactionDetail();
		verifyTrue(agentReportTransactionDetailWeb.verifysearchTransactionDetail());
	}
}
