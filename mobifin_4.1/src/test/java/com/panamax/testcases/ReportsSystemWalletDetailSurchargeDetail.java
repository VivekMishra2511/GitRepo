package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsSystemWalletDetailSurchargeDetailWeb;
import com.panamax.init.Common;

public class ReportsSystemWalletDetailSurchargeDetail extends Common{
	HomeWeb homePage;
	ReportsSystemWalletDetailSurchargeDetailWeb reportsSystemWalletDetailSurchargeDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - SystemWalletDetail - SurchargeDetail - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchSystemWalletDetailSurchargeDetail, Author: Shivani Patel")
	public void searchSurchargeDetail()
	{
		if(count==0){
			homePage = goToHome();
			reportsSystemWalletDetailSurchargeDetailWeb = homePage.clickOnReportsSystemWalletDetailSurchargeDetail();
			count++;
		}
		reportsSystemWalletDetailSurchargeDetailWeb.searchSurchargeDetail();
		verifyTrue(reportsSystemWalletDetailSurchargeDetailWeb.verifysearchSurchargeDetail());
	}
}
