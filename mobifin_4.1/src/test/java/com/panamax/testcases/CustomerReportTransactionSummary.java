package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportTransactionSummaryWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class CustomerReportTransactionSummary extends Common{
	HomeWeb homePage;
	CustomerReportTransactionSummaryWeb customerReportTransactionSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Transaction Summary -Search
	 * @creation date 20/12/2018
	 */
	@Test(description = "Id: SearchTransactionSummaryReport, Author: Shivani Patel")
	public void searchTransactionSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			customerReportTransactionSummaryWeb = homePage.clickOnCustomerReportTransactionSummary();
			count++;
		}
		customerReportTransactionSummaryWeb.searchTransactionSummary();
		verifyTrue(customerReportTransactionSummaryWeb.verifysearchTransactionSummary());
	}
}
