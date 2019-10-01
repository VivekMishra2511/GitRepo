package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsSupportActivitySummaryReportWeb;
import com.panamax.init.Common;

public class ReportsSupportActivitySummaryReport extends Common{
	HomeWeb homePage;
	ReportsSupportActivitySummaryReportWeb reportsSupportActivitySummaryReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - Support - SupportActivitySummaryReport - Search
	 * @creation date 28/12/2018
	 */
	@Test(description = "Id: ReportsSearchSupportActivitySummaryReport, Author: Shivani Patel")
	public void searchSupportActivitySummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsSupportActivitySummaryReportWeb = homePage.clickOnReportsSupportActivitySummaryReport();
			count++;
		}
		reportsSupportActivitySummaryReportWeb.searchSupportActivitySummaryReport();
		verifyTrue(reportsSupportActivitySummaryReportWeb.verifySearchSupportActivitySummaryReport());
	}
}
