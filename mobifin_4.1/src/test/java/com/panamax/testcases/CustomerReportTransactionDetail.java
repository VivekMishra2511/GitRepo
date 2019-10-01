package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportTransactionDetailWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class CustomerReportTransactionDetail extends Common{
	HomeWeb homePage;
	CustomerReportTransactionDetailWeb customerReportTransactionDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Transaction Detail -Search
	 * @creation date 20/12/2018
	 */
	@Test(description = "Id: SearchTransactionDetailReport, Author: Shivani Patel")
	public void searchTransactionDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			customerReportTransactionDetailWeb = homePage.clickOnCustomerReportTransactionDetail();
			count++;
		}
		customerReportTransactionDetailWeb.searchTransactionDetail();
		verifyTrue(customerReportTransactionDetailWeb.verifysearchTransactionDetail());
	}
}
