package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsAlertFCMAccountWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsAlertFCMAccount extends Common{
	HomeWeb homePage;
	SettingsAlertFCMAccountWeb settingsAlertFCMAccountWeb;
	int count = 0;
	
	/**
	 * @author shivani.patel
	 * For  Settings - Alert - FCMAccount - Edit
	 * @creation date 01/11/2018
	 */
	@Test(dataProvider = "SettingsAlertFCMAccount_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsAlertFCMAccount, Author: Shivani Patel")
	public void editAlertFCMAccount(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsAlertFCMAccountWeb = homePage.clickOnSettingsAlertsFCMAccount();
			count++;
		}
		
		settingsAlertFCMAccountWeb.EditAlertFCMAccount(map, getMapKeys(map));
		verifyTrue(settingsAlertFCMAccountWeb.verifyEditAlertFCMAccount(map, getMapKeys(map)),false);
	}
	/**
	 * @author Kutbuddin.compiunder
	 * For Management - FCMAccount - EditedLog
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsAlertFCMAccount_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedLogFCMAccount, Author:Kutbuddin Compounder")
	public void editedLogAlertFCMAccount(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertFCMAccountWeb = homePage.clickOnSettingsAlertsFCMAccount();
			count++;
		}
			verifyTrue(settingsAlertFCMAccountWeb.verifyFCMAccountEditedLogd(map, getMapKeys(map)));
	}
}
