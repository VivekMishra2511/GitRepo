package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsPocketBalanceReportWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class ReportsPocketBalanceReport extends Common{
	HomeWeb homePage;
	ReportsPocketBalanceReportWeb reportsPocketBalanceReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - PocketBalanceReport - Search
	 * @BalanceReport date 28/12/2018
	 */
	@Test(dataProvider = "ReportsPocketBalanceReport_Search", dataProviderClass = TestDataImport.class,description = "Id: ReportsSearchPocketBalanceReport, Author: Shivani Patel")
	public void searchPocketBalanceReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			reportsPocketBalanceReportWeb = homePage.clickOnReportsPocketBalanceReport();
			count++;
		}
		reportsPocketBalanceReportWeb.searchPocketBalanceReport(map, getMapKeys(map));
		verifyTrue(reportsPocketBalanceReportWeb.verifySearchPocketBalanceReport(map, getMapKeys(map)));
	}
}
