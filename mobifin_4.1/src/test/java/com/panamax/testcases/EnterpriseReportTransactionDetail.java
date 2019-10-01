package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportTransactionDetailWeb;
import com.panamax.init.Common;

public class EnterpriseReportTransactionDetail extends Common{
	HomeWeb homePage;
	EnterpriseReportTransactionDetailWeb enterpriseReportTransactionDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Transaction Detail -Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchTransactionDetailReport, Author: Shivani Patel")
	public void searchTransactionDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportTransactionDetailWeb = homePage.clickOnEnterpriseReportTransactionDetail();
			count++;
		}
		
		enterpriseReportTransactionDetailWeb.searchTransactionDetail();
		verifyTrue(enterpriseReportTransactionDetailWeb.verifysearchTransactionDetail());
		
	}
}
