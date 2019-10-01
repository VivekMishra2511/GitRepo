package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsTransactionDetailExternalServiceDetailReportWeb;
import com.panamax.init.Common;

public class ReportsTransactionDetailExternalServiceDetailReport extends Common{
	HomeWeb homePage;
	ReportsTransactionDetailExternalServiceDetailReportWeb reportsTransactionDetailExternalServiceDetailReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - TransactionDetail - ExternalServiceDetailReport - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: ReportSearchTansactionDetailExternalServiceDetailReport, Author: Shivani Patel")
	public void searchExternalServiceDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsTransactionDetailExternalServiceDetailReportWeb = homePage.clickOnReportsTransactionDetailExternalServiceDetailReport();
			count++;
		}
		reportsTransactionDetailExternalServiceDetailReportWeb.searchExternalServiceDetailReport();
		verifyTrue(reportsTransactionDetailExternalServiceDetailReportWeb.verifysearchExternalServiceDetailReport());
	}
}
