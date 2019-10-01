package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportTransactionDrilldownWeb;
import com.panamax.init.Common;

public class MerchantReportTransactionDrilldown extends Common{
	HomeWeb homePage;
	MerchantReportTransactionDrilldownWeb merchantReportTransactionDrilldownWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Transaction Drilldown -Search
	 * @creation date 18/12/2018
	 */
	@Test(description = "Id: SearchTransactionDrilldownReport, Author: Shivani Patel")
	public void searchTransactionDrilldownReport()
	{
		if(count==0){
			homePage = goToHome();
			merchantReportTransactionDrilldownWeb = homePage.clickOnMerchantReportTransactionDrilldown();
			count++;
		}
		
		merchantReportTransactionDrilldownWeb.searchTransactionDrilldown();
		verifyTrue(merchantReportTransactionDrilldownWeb.verifysearchTransactionDrilldown());
		
	}
}
