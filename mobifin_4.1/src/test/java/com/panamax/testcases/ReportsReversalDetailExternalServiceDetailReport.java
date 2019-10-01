package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsReversalDetailExternalServiceDetailReportWeb;
import com.panamax.init.Common;

public class ReportsReversalDetailExternalServiceDetailReport extends Common{
	HomeWeb homePage;
	ReportsReversalDetailExternalServiceDetailReportWeb reportsReversalDetailExternalServiceDetailReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - ReversalDetail - ExternalServiceDetailReport - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: ReportSearchReversalDetailExternalServiceDetailReport, Author: Shivani Patel")
	public void searchExternalServiceDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsReversalDetailExternalServiceDetailReportWeb = homePage.clickOnReportsReversalDetailExternalServiceDetailReport();
			count++;
		}
		reportsReversalDetailExternalServiceDetailReportWeb.searchExternalServiceDetailReport();
		verifyTrue(reportsReversalDetailExternalServiceDetailReportWeb.verifysearchExternalServiceDetailReport());
	}
}
