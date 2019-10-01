package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsAlertSMSAccountWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi
 * Settings - User Management - SMSAccount
 * @creation date 29/10/2018  
 */
public class SettingsAlertSMSAccount extends Common{

	HomeWeb homePage;
	SettingsAlertSMSAccountWeb settingsAlertSMSAccountWeb;
	int count = 0;
	int sortCounter = 0;
	
	/**
	 * @author dishant.doshi
	 * For User Management - SMSAccount - Add
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSAccount_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSMSAccount, Author: Dishant Doshi")
	public void addSMSAccount(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSAccountWeb = homePage.clickOnSettingsAlertSMSAccount();
			count++;
		}
		settingsAlertSMSAccountWeb.addSMSAccount(map, getMapKeys(map));
		verifyTrue(settingsAlertSMSAccountWeb.verifySMSAccountAdded(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi
	 * For Management - SMSAccount - Edit
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSAccount_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSMSAccount, Author: Dishant Doshi")
	public void editSMSAccount(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSAccountWeb = homePage.clickOnSettingsAlertSMSAccount();
			count++;
		}
		settingsAlertSMSAccountWeb.editSMSAccount(map, getMapKeys(map));
		verifyTrue(settingsAlertSMSAccountWeb.verifySMSAccountEdited(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi
	 * For Management - SMSAccount - Delete
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSAccount_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSMSAccount, Author: Dishant Doshi")
	public void deleteSMSAccount(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSAccountWeb = homePage.clickOnSettingsAlertSMSAccount();
			count++;
		}
		if(settingsAlertSMSAccountWeb.deleteSMSAccount(map, getMapKeys(map)))
			verifyFalse(settingsAlertSMSAccountWeb.verifySMSAccountDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author Kutbuddin.compiunder
	 * For Management - SMSAccount - EditedLog
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSAccount_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedLogSMSAccount, Author:Kutbuddin Compounder")
	public void editedLogSMSAccount(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSAccountWeb = homePage.clickOnSettingsAlertSMSAccount();
			count++;
		}
			verifyTrue(settingsAlertSMSAccountWeb.verifySMSAccountEditedLogd(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For Alert - SMS Account - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsAlertSMSAccount_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortSMSAccount, Author: Dishant Doshi")
	public void sortSMSAccount(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsAlertSMSAccountWeb = homePage.clickOnSettingsAlertSMSAccount();
			count++;
		}
		if(sortCounter==0)
		{
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(settingsAlertSMSAccountWeb.sortSMSAccount(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
