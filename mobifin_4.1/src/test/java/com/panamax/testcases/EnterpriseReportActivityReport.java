package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.EnterpriseReportActivityReportWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class EnterpriseReportActivityReport extends Common{
	HomeWeb homePage;
	EnterpriseReportActivityReportWeb enterpriseReportActivityReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Enterprise - Report - Activity Report  - Search
	 * @creation date 21/12/2018
	 */
	@Test(dataProvider = "EnterpriseReportActivityReport_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchActivityReport, Author: Shivani Patel")
	public void searchActivityReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			enterpriseReportActivityReportWeb = homePage.clickOnEnterpriseReportActivityReport();
			count++;
		}
		enterpriseReportActivityReportWeb.searchActivityReport(map, getMapKeys(map));
		verifyTrue(enterpriseReportActivityReportWeb.verifysearchActivityReport(map, getMapKeys(map)));
	}
}
