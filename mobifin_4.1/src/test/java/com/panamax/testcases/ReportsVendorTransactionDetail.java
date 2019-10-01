package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ReportsVendorTransactionDetailWeb;
import com.panamax.init.Common;

public class ReportsVendorTransactionDetail extends Common{
	HomeWeb homePage;
	ReportsVendorTransactionDetailWeb reportsVendorTransactionDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For Report - VendortransactionDetail - Search
	 * @creation date 27/12/2018
	 */
	@Test(description = "Id: ReportsSearchVendorTransactionDetail, Author: Shivani Patel")
	public void searchVendorTransactionDetail()
	{
		if(count==0){
			homePage = goToHome();
			reportsVendorTransactionDetailWeb = homePage.clickOnVendorTransactionDetailReport();
			count++;
		}
		reportsVendorTransactionDetailWeb.searchVendorTransactionDetail();
		verifyTrue(reportsVendorTransactionDetailWeb.verifySearchVendorTransactionDetail());
	}
}
