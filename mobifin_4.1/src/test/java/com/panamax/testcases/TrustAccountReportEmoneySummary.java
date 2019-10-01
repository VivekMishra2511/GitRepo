package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.TrustAccountReportEmoneySummaryWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class TrustAccountReportEmoneySummary extends Common{
	HomeWeb homePage;
	TrustAccountReportEmoneySummaryWeb TrustAccountReportEmoneySummaryWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For TrustAccount - Report - Emoney Summary  - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: SearchEmoneySummaryReport, Author: Shivani Patel")
	public void searchEmoneySummaryReport()
	{
		if(count==0){
			homePage = goToHome();
			TrustAccountReportEmoneySummaryWeb = homePage.clickOnTrustAccountReportEmoneySummary();
			count++;
		}
		TrustAccountReportEmoneySummaryWeb.searchEmoneySummary();
		verifyTrue(TrustAccountReportEmoneySummaryWeb.verifysearchEmoneySummary());
	}
}
