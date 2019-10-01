package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsEmoneySummaryReportWeb;
import com.panamax.init.Common;

public class ReportsEmoneySummaryReport extends Common{
	HomeWeb homePage;
	ReportsEmoneySummaryReportWeb reportsEmoneySummaryReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - EmoneySummaryReport - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportsSearchEmoneySummaryReport, Author: Shivani Patel")
	public void searchEmoneySummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsEmoneySummaryReportWeb = homePage.clickOnEmoneySummaryReport();
			count++;
		}
		reportsEmoneySummaryReportWeb.searchEmoneySummaryReport();
		verifyTrue(reportsEmoneySummaryReportWeb.verifySearchEmoneySummaryReport());
	}
}
