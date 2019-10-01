package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsSupportPhoneNumberEditReportWeb;
import com.panamax.init.Common;

public class ReportsSupportPhoneNumberEditReport extends Common{
	HomeWeb homePage;
	ReportsSupportPhoneNumberEditReportWeb reportsSupportPhoneNumberEditReportWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - Support - SupportPhoneNumberEditReport - Search
	 * @creation date 28/12/2018
	 */
	@Test(description = "Id: ReportsSearchSupportPhoneNumberEditReport, Author: Shivani Patel")
	public void searchSupportPhoneNumberEditReport()
	{
		if(count==0){
			homePage = goToHome();
			reportsSupportPhoneNumberEditReportWeb = homePage.clickOnReportsSupportPhoneNumberEditReport();
			count++;
		}
		reportsSupportPhoneNumberEditReportWeb.searchSupportPhoneNumberEditReport();
		verifyTrue(reportsSupportPhoneNumberEditReportWeb.verifySearchSupportPhoneNumberEditReport());
	}
}
