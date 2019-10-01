package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantReportActivityReportWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class MerchantReportActivityReport extends Common{
	HomeWeb homePage;
	MerchantReportActivityReportWeb merchantReportActivityReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Merchant - Report - Activity Report  - Search
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "MerchantReportActivityReport_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchActivityReport, Author: Shivani Patel")
	public void searchActivityReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			merchantReportActivityReportWeb = homePage.clickOnMerchantReportActivityReport();
			count++;
		}
		merchantReportActivityReportWeb.searchActivityReport(map, getMapKeys(map));
		verifyTrue(merchantReportActivityReportWeb.verifysearchActivityReport(map, getMapKeys(map)));
	}
}
