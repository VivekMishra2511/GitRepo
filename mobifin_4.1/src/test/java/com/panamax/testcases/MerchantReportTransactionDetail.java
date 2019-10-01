package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportTransactionDetailWeb;
import com.panamax.init.Common;

public class MerchantReportTransactionDetail extends Common{
	HomeWeb homePage;
	MerchantReportTransactionDetailWeb merchantReportTransactionDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Transaction Detail -Search
	 * @creation date 13/12/2018
	 */
	@Test(description = "Id: SearchTransactionDetailReport, Author: Shivani Patel")
	public void searchTransactionDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			merchantReportTransactionDetailWeb = homePage.clickOnMerchantReportTransactionDetail();
			count++;
		}
		
		merchantReportTransactionDetailWeb.searchTransactionDetail();
		verifyTrue(merchantReportTransactionDetailWeb.verifysearchTransactionDetail());
		
	}
}
