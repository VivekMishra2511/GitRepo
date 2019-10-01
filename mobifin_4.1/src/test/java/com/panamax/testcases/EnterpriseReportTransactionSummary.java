package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportTransactionSummaryWeb;
import com.panamax.init.Common;

public class EnterpriseReportTransactionSummary extends Common{
	HomeWeb homePage;
	EnterpriseReportTransactionSummaryWeb enterpriseReportTransactionSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Transaction Summary -Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchTransactionSummaryReport, Author: Shivani Patel")
	public void searchTransactionSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportTransactionSummaryWeb = homePage.clickOnEnterpriseReportTransactionSummary();
			count++;
		}
		
		enterpriseReportTransactionSummaryWeb.searchTransactionSummary();
		verifyTrue(enterpriseReportTransactionSummaryWeb.verifysearchTransactionSummary());
		
	}
}
