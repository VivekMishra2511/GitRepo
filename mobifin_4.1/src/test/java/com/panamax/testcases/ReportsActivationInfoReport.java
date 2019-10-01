package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsActivationInfoReportWeb;
import com.panamax.init.Common;

public class ReportsActivationInfoReport extends Common{
	HomeWeb homePage;
	ReportsActivationInfoReportWeb reportsActivationInfoReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - ActivationInfoReport - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportsSearchActivationInfoReport, Author: Shivani Patel")
	public void searchActivationInfoReport()
	{
		if(count==0){
			homePage = goToHome();
			//reportsActivationInfoReportWeb = homePage.clickOnActivationInfoReport();
			count++;
		}
		reportsActivationInfoReportWeb.searchActivationInfoReport();
		verifyTrue(reportsActivationInfoReportWeb.verifySearchActivationInfoReport());
	}
}
