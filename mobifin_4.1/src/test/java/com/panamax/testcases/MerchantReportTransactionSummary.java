package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportTransactionSummaryWeb;
import com.panamax.init.Common;

public class MerchantReportTransactionSummary extends Common{
	HomeWeb homePage;
	MerchantReportTransactionSummaryWeb merchantReportTransactionSummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Transaction Summary -Search
	 * @creation date 18/12/2018
	 */
	@Test(description = "Id: SearchTransactionSummaryReport, Author: Shivani Patel")
	public void searchTransactionSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			merchantReportTransactionSummaryWeb = homePage.clickOnMerchantReportTransactionSummary();
			count++;
		}
		
		merchantReportTransactionSummaryWeb.searchTransactionSummary();
		verifyTrue(merchantReportTransactionSummaryWeb.verifysearchTransactionSummary());
		
	}

}
