package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportTransactionPerformanceWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class MerchantReportTransactionPerformance extends Common{
	HomeWeb homePage;
	MerchantReportTransactionPerformanceWeb merchantReportTransactionPerformanceWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Transaction Performance  - Search
	 * @creation date 18/12/2018
	 */
	@Test(dataProvider = "MerchantReportTransactionPerformance_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchTransactionPerformanceReport, Author: Shivani Patel")
	public void searchTransactionPerformanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			merchantReportTransactionPerformanceWeb = homePage.clickOnMerchantReportTransactionPerformance();
			count++;
		}
		merchantReportTransactionPerformanceWeb.searchTransactionPerformance(map, getMapKeys(map));
		verifyTrue(merchantReportTransactionPerformanceWeb.verifysearchTransactionPerformance(map, getMapKeys(map)));
	}
}
