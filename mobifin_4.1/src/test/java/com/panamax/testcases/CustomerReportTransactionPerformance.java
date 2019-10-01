package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportTransactionPerformanceWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class CustomerReportTransactionPerformance extends Common{
	HomeWeb homePage;
	CustomerReportTransactionPerformanceWeb customerReportTransactionPerformanceWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Transaction Performance  - Search
	 * @creation date 18/12/2018
	 */
	@Test(dataProvider = "CustomerReportTransactionPerformance_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchTransactionPerformanceReport, Author: Shivani Patel")
	public void searchTransactionPerformanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			customerReportTransactionPerformanceWeb = homePage.clickOnCustomerReportTransactionPerformance();
			count++;
		}
		customerReportTransactionPerformanceWeb.searchTransactionPerformance(map, getMapKeys(map));
		verifyTrue(customerReportTransactionPerformanceWeb.verifysearchTransactionPerformance(map, getMapKeys(map)));
	}
}
