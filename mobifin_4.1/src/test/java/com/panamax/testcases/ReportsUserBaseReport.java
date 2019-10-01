package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsUserBaseReportWeb;
import com.panamax.init.Common;

public class ReportsUserBaseReport extends Common{
	HomeWeb homePage;
	ReportsUserBaseReportWeb reportsUserBaseReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - UserBaseReport - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportsSearchUserBaseReport, Author: Shivani Patel")
	public void searchUserBaseReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsUserBaseReportWeb = homePage.clickOnUserBaseReport();
			count++;
		}
		reportsUserBaseReportWeb.searchUserBaseReport();
		verifyTrue(reportsUserBaseReportWeb.verifySearchUserBaseReport());
	}
}
