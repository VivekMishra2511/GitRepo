package com.panamax.testcases;

import org.testng.annotations.Test;

import com.panamax.base.TrustAccountReportEmoneyDetailWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;

public class TrustAccountReportEmoneyDetail extends Common{
	HomeWeb homePage;
	TrustAccountReportEmoneyDetailWeb trustAccountReportEmoneyDetailWeb;
	int count = 0;
	/**
	 * @author shivani.patel
	 * For TrustAccount - Report - Emoney Detail  -Search
	 * @creation date 21/12/2018
	 */
	@Test(description = "Id: SearchEmoneyDetailReport, Author: Shivani Patel")
	public void searchEmoneyDetailReport()
	{
		if(count==0){
			homePage = goToHome();
			trustAccountReportEmoneyDetailWeb = homePage.clickOnTrustAccountReportEmoneyDetail();
			count++;
		}
		
		trustAccountReportEmoneyDetailWeb.searchEmoneyDetail();
		verifyTrue(trustAccountReportEmoneyDetailWeb.verifysearchEmoneyDetail());
		
	}
}
