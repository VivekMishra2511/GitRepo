package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsReversalSummaryExternalServiceSummaryReportWeb;
import com.panamax.init.Common;

public class ReportsReversalSummaryExternalServiceSummaryReport extends Common{
	HomeWeb homePage;
	ReportsReversalSummaryExternalServiceSummaryReportWeb reportsReversalSummaryExternalServiceSummaryReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - ReversalSummary - ExternalServiceSummaryReport - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: ReportSearchReversalSummaryExternalServiceSummaryReport, Author: Shivani Patel")
	public void searchExternalServiceSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsReversalSummaryExternalServiceSummaryReportWeb = homePage.clickOnReportsReversalSummaryExternalServiceSummaryReport();
			count++;
		}
		reportsReversalSummaryExternalServiceSummaryReportWeb.searchExternalServiceSummaryReport();
		verifyTrue(reportsReversalSummaryExternalServiceSummaryReportWeb.verifysearchExternalServiceSummaryReport());
	}
}
