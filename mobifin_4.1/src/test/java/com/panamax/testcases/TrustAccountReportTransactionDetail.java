package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.TrustAccountReportTransactionDetailWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class TrustAccountReportTransactionDetail extends Common{
	HomeWeb homePage;
	TrustAccountReportTransactionDetailWeb trustAccountReportTransactionDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For TrustAccount - Report - Transaction Detail -Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchTransactionDetailReport, Author: Shivani Patel")
	public void searchTransactionDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			trustAccountReportTransactionDetailWeb = homePage.clickOnTrustAccountReportTransactionDetail();
			count++;
		}
		
		trustAccountReportTransactionDetailWeb.searchTransactionDetail();
		verifyTrue(trustAccountReportTransactionDetailWeb.verifysearchTransactionDetail());
		
	}

}
