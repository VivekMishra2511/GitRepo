package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.TrustAccountReportActivityReportWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class TrustAccountReportActivityReport extends Common{
	HomeWeb homePage;
	TrustAccountReportActivityReportWeb trustAccountReportActivityReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For TrustAccount - Report - Activity Report  - Search
	 * @creation date 24/12/2018
	 */
	@Test(dataProvider = "TrustAccountReportActivityReport_Search", dataProviderClass = TestDataImport.class, description = "Id: SearchActivityReport, Author: Shivani Patel")
	public void searchActivityReport(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			trustAccountReportActivityReportWeb = homePage.clickOnTrustAccountReportActivityReport();
			count++;
		}
		trustAccountReportActivityReportWeb.searchActivityReport(map, getMapKeys(map));
		verifyTrue(trustAccountReportActivityReportWeb.verifysearchActivityReport(map, getMapKeys(map)));
	}
}
