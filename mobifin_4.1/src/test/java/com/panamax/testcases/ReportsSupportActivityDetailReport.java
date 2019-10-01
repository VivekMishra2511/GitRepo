package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsSupportActivityDetailReportWeb;
import com.panamax.init.Common;

public class ReportsSupportActivityDetailReport extends Common{
	HomeWeb homePage;
	ReportsSupportActivityDetailReportWeb reportsSupportActivityDetailReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - Support - SupportActivityDetailReport - Search
	 * @creation date 28/12/2018
	 */
	@Test(description = "Id: ReportsSearchSupportActivityDetailReport, Author: Shivani Patel")
	public void searchSupportActivityDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsSupportActivityDetailReportWeb = homePage.clickOnReportsSupportActivityDetailReport();
			count++;
		}
		reportsSupportActivityDetailReportWeb.searchSupportActivityDetailReport();
		verifyTrue(reportsSupportActivityDetailReportWeb.verifySearchSupportActivityDetailReport());
	}
}
