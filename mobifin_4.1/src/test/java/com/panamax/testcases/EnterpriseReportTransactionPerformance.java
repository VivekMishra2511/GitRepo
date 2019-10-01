package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportTransactionPerformanceWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class EnterpriseReportTransactionPerformance extends Common{
	HomeWeb homePage;
	EnterpriseReportTransactionPerformanceWeb enterpriseReportTransactionPerformanceWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Transaction Performance  - Search
	 * @creation date 21/12/2018
	 */
	@Test(dataProvider = "EnterpriseReportTransactionPerformance_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchTransactionPerformanceReport, Author: Shivani Patel")
	public void searchTransactionPerformanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportTransactionPerformanceWeb = homePage.clickOnEnterpriseReportTransactionPerformance();
			count++;
		}
		enterpriseReportTransactionPerformanceWeb.searchTransactionPerformance(map, getMapKeys(map));
		verifyTrue(enterpriseReportTransactionPerformanceWeb.verifysearchTransactionPerformance(map, getMapKeys(map)));
	}
}
