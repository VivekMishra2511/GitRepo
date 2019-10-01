package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportTransactionDrilldownWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class CustomerReportTransactionDrilldown extends Common{
	HomeWeb homePage;
	CustomerReportTransactionDrilldownWeb customerReportTransactionDrilldownWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Transaction Drilldown - Search
	 * @creation date 20/12/2018
	 */
	@Test(description = "Id: SearchTransactionDrilldownReport, Author: Shivani Patel")
	public void searchTransactionDrilldownReport()
	{
		if(count==0){
			homePage = goToHome();
			customerReportTransactionDrilldownWeb = homePage.clickOnCustomerReportTransactionDrilldown();
			count++;
		}
		
		customerReportTransactionDrilldownWeb.searchTransactionDrilldown();
		verifyTrue(customerReportTransactionDrilldownWeb.verifysearchTransactionDrilldown());
		
	}	
}
