package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsPocketCreationWeb;
import com.panamax.init.Common;

public class ReportsPocketCreation extends Common{
	HomeWeb homePage;
	ReportsPocketCreationWeb reportsPocketCreationWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - Pocket - PocketCreation - Search
	 * @creation date 28/12/2018
	 */
	@Test(description = "Id: ReportsSearchPocketCreation, Author: Shivani Patel")
	public void searchPocketCreation()
	{
		if(count==0){
			homePage = goToHome();
			reportsPocketCreationWeb = homePage.clickOnReportsPocketCreationReport();
			count++;
		}
		reportsPocketCreationWeb.searchPocketCreation();
		verifyTrue(reportsPocketCreationWeb.verifySearchPocketCreation());
	}
}
