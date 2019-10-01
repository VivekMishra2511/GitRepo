package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportTransactionDrilldownWeb;
import com.panamax.init.Common;

public class EnterpriseReportTransactionDrilldown extends Common{
	HomeWeb homePage;
	EnterpriseReportTransactionDrilldownWeb enterpriseReportTransactionDrilldownWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Transaction Drilldown - Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchTransactionDrilldownReport, Author: Shivani Patel")
	public void searchTransactionDrilldownReport()
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportTransactionDrilldownWeb = homePage.clickOnEnterpriseReportTransactionDrilldown();
			count++;
		}
		
		enterpriseReportTransactionDrilldownWeb.searchTransactionDrilldown();
		verifyTrue(enterpriseReportTransactionDrilldownWeb.verifysearchTransactionDrilldown());
		
	}
}
