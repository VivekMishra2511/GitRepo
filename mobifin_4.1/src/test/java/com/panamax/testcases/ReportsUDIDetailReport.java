package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsUDIDetailReportWeb;
import com.panamax.init.Common;

public class ReportsUDIDetailReport extends Common{
	HomeWeb homePage;
	ReportsUDIDetailReportWeb reportsUDIDetailReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - UDIDetailReport - Search
	 * @TransactionReport date 28/12/2018
	 */
	@Test(description = "Id: ReportsSearchUDIDetailReport, Author: Shivani Patel")
	public void searchUDIDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsUDIDetailReportWeb = homePage.clickOnReportUDIDetailReport();
			count++;
		}
		reportsUDIDetailReportWeb.searchUDIDetailReport();
		verifyTrue(reportsUDIDetailReportWeb.verifySearchUDIDetailReport());
	}
}
