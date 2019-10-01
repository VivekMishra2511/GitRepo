package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsSystemWalletDetailSuspenseAccountDetailWeb;
import com.panamax.init.Common;

public class ReportsSystemWalletDetailSuspenseAccountDetail extends Common{
	HomeWeb homePage;
	ReportsSystemWalletDetailSuspenseAccountDetailWeb reportsSystemWalletDetailSuspenseAccountDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - SystemWalletDetail - SuspenseAccountDetail - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchSystemWalletDetailSuspenseAccountDetail, Author: Shivani Patel")
	public void searchSuspenseAccountDetail()
	{
		if(count==0){
			homePage = goToHome();
			reportsSystemWalletDetailSuspenseAccountDetailWeb = homePage.clickOnReportsSystemWalletDetailSuspenseAccountDetail();
																			
			count++;
		}
		reportsSystemWalletDetailSuspenseAccountDetailWeb.searchSuspenseAccountDetail();
		verifyTrue(reportsSystemWalletDetailSuspenseAccountDetailWeb.verifysearchSuspenseAccountDetail());
	}
}
