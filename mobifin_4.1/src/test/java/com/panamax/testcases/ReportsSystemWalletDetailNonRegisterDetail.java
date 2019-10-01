package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsSystemWalletDetailNonRegisterDetailWeb;
import com.panamax.init.Common;

public class ReportsSystemWalletDetailNonRegisterDetail extends Common{
	HomeWeb homePage;
	ReportsSystemWalletDetailNonRegisterDetailWeb reportsSystemWalletDetailNonRegisterDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - SystemWalletDetail - NonRegisterDetail - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportSearchSystemWalletDetailNonRegisterDetail, Author: Shivani Patel")
	public void searchNonRegisterDetail()
	{
		if(count==0){
			homePage = goToHome();
			reportsSystemWalletDetailNonRegisterDetailWeb = homePage.clickOnReportsSystemWalletDetailNonRegisterDetail();
			count++;
		}
		reportsSystemWalletDetailNonRegisterDetailWeb.searchNonRegisterDetail();
		verifyTrue(reportsSystemWalletDetailNonRegisterDetailWeb.verifysearchNonRegisterDetail());
	}
}
