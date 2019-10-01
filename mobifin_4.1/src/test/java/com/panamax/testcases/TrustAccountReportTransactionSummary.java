package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.TrustAccountReportTransactionSummaryWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class TrustAccountReportTransactionSummary extends Common{
	HomeWeb homePage;
	TrustAccountReportTransactionSummaryWeb trustAccountReportTransactionSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For TrustAccount - Report - Transaction Summary -Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchTransactionSummaryReport, Author: Shivani Patel")
	public void searchTransactionSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			trustAccountReportTransactionSummaryWeb = homePage.clickOnTrustAccountReportTransactionSummary();
			count++;
		}
		
		trustAccountReportTransactionSummaryWeb.searchTransactionSummary();
		verifyTrue(trustAccountReportTransactionSummaryWeb.verifysearchTransactionSummary());
		
	}
}
