package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerReportActivityReportWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class CustomerReportActivityReport extends Common{
	HomeWeb homePage;
	CustomerReportActivityReportWeb customerReportActivityReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Customer - Report - Activity Report  - Search
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "CustomerReportActivityReport_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchActivityReport, Author: Shivani Patel")
	public void searchActivityReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			customerReportActivityReportWeb = homePage.clickOnCustomerReportActivityReport();
			count++;
		}
		customerReportActivityReportWeb.searchActivityReport(map, getMapKeys(map));
		verifyTrue(customerReportActivityReportWeb.verifysearchActivityReport(map, getMapKeys(map)));
	}
}
