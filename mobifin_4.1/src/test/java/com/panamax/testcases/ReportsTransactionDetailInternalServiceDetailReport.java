package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsTransactionDetailInternalServiceDetailReportWeb;
import com.panamax.init.Common;

public class ReportsTransactionDetailInternalServiceDetailReport extends Common {
	HomeWeb homePage;
	ReportsTransactionDetailInternalServiceDetailReportWeb reportsTransactionDetailInternalServiceDetailReportWeb;
	int count = 0;

	/**
	 * @author shivani.patel For Report - TransactionDetail -
	 *         InternalServiceDetailReport - Search
	 * @creation date 24/12/2018
	 */
	@Test(description = "Id: ReportSearchTansactionDetailInternalServiceDetailReport, Author: Shivani Patel")
	public void searchInternalServiceDetailReport() {
		if (count == 0) {
			homePage = goToHome();
			reportsTransactionDetailInternalServiceDetailReportWeb = homePage
					.clickOnReportsTransactionDetailInternalServiceDetailReport();
			count++;
		}
		reportsTransactionDetailInternalServiceDetailReportWeb.searchInternalServiceDetailReport();
		verifyTrue(reportsTransactionDetailInternalServiceDetailReportWeb.verifysearchInternalServiceDetailReport());
	}
}
