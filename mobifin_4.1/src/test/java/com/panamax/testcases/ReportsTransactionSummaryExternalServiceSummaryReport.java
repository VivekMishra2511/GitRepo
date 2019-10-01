package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsTransactionSummaryExternalServiceSummaryReportWeb;
import com.panamax.init.Common;

public class ReportsTransactionSummaryExternalServiceSummaryReport extends Common{
	HomeWeb homePage;
	ReportsTransactionSummaryExternalServiceSummaryReportWeb reportsTransactionSummaryExternalServiceSummaryReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - TransactionSummary - ExternalServiceSummaryReport - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: ReportSearchTansactionSummaryExternalServiceSummaryReport, Author: Shivani Patel")
	public void searchExternalServiceSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsTransactionSummaryExternalServiceSummaryReportWeb = homePage.clickOnReportsTransactionSummaryExternalServiceSummaryReport();
			count++;
		}
		reportsTransactionSummaryExternalServiceSummaryReportWeb.searchExternalServiceSummaryReport();
		verifyTrue(reportsTransactionSummaryExternalServiceSummaryReportWeb.verifysearchExternalServiceSummaryReport());
	}
}
