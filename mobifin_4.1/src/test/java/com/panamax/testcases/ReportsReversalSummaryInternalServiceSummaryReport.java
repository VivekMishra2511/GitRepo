package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsReversalSummaryInternalServiceSummaryReportWeb;
import com.panamax.init.Common;

public class ReportsReversalSummaryInternalServiceSummaryReport extends Common{
	HomeWeb homePage;
	ReportsReversalSummaryInternalServiceSummaryReportWeb reportsReversalSummaryInternalServiceSummaryReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - ReversalSummary - InternalServiceSummaryReport - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: ReportSearchReversalSummaryInternalServiceSummaryReport, Author: Shivani Patel")
	public void searchInternalServiceSummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsReversalSummaryInternalServiceSummaryReportWeb = homePage.clickOnReportsReversalSummaryInternalServiceSummaryReport();
			count++;
		}
		reportsReversalSummaryInternalServiceSummaryReportWeb.searchInternalServiceSummaryReport();
		verifyTrue(reportsReversalSummaryInternalServiceSummaryReportWeb.verifysearchInternalServiceSummaryReport());
	}
}
