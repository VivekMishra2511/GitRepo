package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsTransactionSummaryInternalServiceSummaryReportWeb;
import com.panamax.init.Common;

public class ReportsTransactionSummaryInternalServiceSummaryReport extends Common{
	HomeWeb homePage;
	ReportsTransactionSummaryInternalServiceSummaryReportWeb reportsTransactionSummaryInternalServiceSummaryReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - TransactionSummary - InternalServiceSummaryReport - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: ReportSearchTansactionSummaryInternalServiceSummaryReport, Author: Shivani Patel")
	public void searchInternalServiceSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsTransactionSummaryInternalServiceSummaryReportWeb = homePage
					.clickOnReportsTransactionSummaryInternalServiceSummaryReport();
			count++;
		}
		reportsTransactionSummaryInternalServiceSummaryReportWeb.searchInternalServiceSummaryReport();
		verifyTrue(reportsTransactionSummaryInternalServiceSummaryReportWeb.verifysearchInternalServiceSummaryReport());
	}
}
