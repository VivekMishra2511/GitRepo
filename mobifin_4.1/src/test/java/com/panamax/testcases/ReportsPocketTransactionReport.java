package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsPocketTransactionReportWeb;
import com.panamax.init.Common;

public class ReportsPocketTransactionReport extends Common{
	HomeWeb homePage;
	ReportsPocketTransactionReportWeb reportsPocketTransactionReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - Pocket - PocketTransactionReport - Search
	 * @TransactionReport date 28/12/2018
	 */
	@Test(description = "Id: ReportsSearchPocketTransactionReport, Author: Shivani Patel")
	public void searchPocketTransactionReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsPocketTransactionReportWeb = homePage.clickOnReportsPocketTransactionReport();
			count++;
		}
		reportsPocketTransactionReportWeb.searchPocketTransactionReport();
		verifyTrue(reportsPocketTransactionReportWeb.verifySearchPocketTransactionReport());
	}
}
