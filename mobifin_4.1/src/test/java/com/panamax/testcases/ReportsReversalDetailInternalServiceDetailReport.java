package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsReversalDetailInternalServiceDetailReportWeb;
import com.panamax.init.Common;

public class ReportsReversalDetailInternalServiceDetailReport extends Common{
	HomeWeb homePage;
	ReportsReversalDetailInternalServiceDetailReportWeb reportsReversalDetailInternalServiceDetailReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - ReversalDetail - InternalServiceDetailReport - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: ReportSearchReversalDetailInternalServiceDetailReport, Author: Shivani Patel")
	public void searchInternalServiceDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsReversalDetailInternalServiceDetailReportWeb = homePage.clickOnReportsReversalDetailInternalServiceDetailReport();
			count++;
		}
		reportsReversalDetailInternalServiceDetailReportWeb.searchInternalServiceDetailReport();
		verifyTrue(reportsReversalDetailInternalServiceDetailReportWeb.verifysearchInternalServiceDetailReport());
	}
}
