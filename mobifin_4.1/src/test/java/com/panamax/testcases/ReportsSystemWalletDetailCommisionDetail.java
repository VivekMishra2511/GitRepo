package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsSystemWalletDetailCommisionDetailWeb;
import com.panamax.init.Common;

public class ReportsSystemWalletDetailCommisionDetail extends Common{
	HomeWeb homePage;
	ReportsSystemWalletDetailCommisionDetailWeb reportsSystemWalletDetailCommisionDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - SystemWalletDetail - CommisionDetail - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchSystemWalletDetailCommisionDetail, Author: Shivani Patel")
	public void searchCommisionDetail()
	{
		if(count==0){
			homePage = goToHome();
			reportsSystemWalletDetailCommisionDetailWeb = homePage.clickOnReportsSystemWalletDetailCommisionDetail();
			count++;
		}
		reportsSystemWalletDetailCommisionDetailWeb.searchCommisionDetail();
		verifyTrue(reportsSystemWalletDetailCommisionDetailWeb.verifysearchCommisionDetail());
	}
}
