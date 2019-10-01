package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsAlertEmailAccountWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsAlertEmailAccount extends Common{
	HomeWeb homePage;
	SettingsAlertEmailAccountWeb settingsAlertEmailAccountWeb;
	int count = 0;
	int sortCounter = 0;
	
	/**
	 * @author shivani.patel
	 * For  Settings - Alert - EmailAccount - Add
	 * @creation date 30/10/2018
	 */
	@Test(dataProvider = "SettingsAlertEmailAccount_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsAlertEmailAccount, Author: Shivani Patel")
	public void addEmailAccount(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsAlertEmailAccountWeb = homePage.clickOnSettingsAlertEmailAccount();
			count++;
		}
		
		settingsAlertEmailAccountWeb.AddAlertEmailAccount(map, getMapKeys(map));
		verifyTrue(settingsAlertEmailAccountWeb.verifyAddAlertEmailAccount(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - Alert - EmailAccount - Edit
	 * @creation date 30/10/2018
	 */
	@Test(dataProvider = "SettingsAlertEmailAccount_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsAlertEmailAccount, Author: Shivani Patel")
	public void editEmailAccount(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsAlertEmailAccountWeb = homePage.clickOnSettingsAlertEmailAccount();
			count++;
		}
		
		settingsAlertEmailAccountWeb.EditAlertEmailAccount(map, getMapKeys(map));
		verifyTrue(settingsAlertEmailAccountWeb.verifyEditAlertEmailAccount(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - Alert - EmailAccount - Delete
	 * @creation date 30/10/2018
	 */
	@Test(dataProvider = "SettingsAlertEmailAccount_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsAlertEmailAccount, Author: Shivani Patel")
	public void deleteEmailAccount(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsAlertEmailAccountWeb = homePage.clickOnSettingsAlertEmailAccount();
			count++;
		}
		if(settingsAlertEmailAccountWeb.DeleteAlertEmailAccount(map, getMapKeys(map)))
		verifyFalse(settingsAlertEmailAccountWeb.verifyDeleteAlertEmailAccount(map, getMapKeys(map)));
	}
	/**
	 * @author Kutbuddin.compiunder
	 * For Management - EmailAccount - EditedLog
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsAlertEmailAccount_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedLogEmailAccount, Author:Kutbuddin Compounder")
	public void editedLogAlertEmailAccount(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsAlertEmailAccountWeb = homePage.clickOnSettingsAlertEmailAccount();
			count++;
		}
			verifyTrue(settingsAlertEmailAccountWeb.verifyEmailAccountEditedLogd(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For Alert - Email Account - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsAlertEmailAccount_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortEmailAccount, Author: Dishant Doshi")
	public void sortEmailAccount(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsAlertEmailAccountWeb = homePage.clickOnSettingsAlertEmailAccount();
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
			verifyTrue(settingsAlertEmailAccountWeb.sortEmailAccount(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
