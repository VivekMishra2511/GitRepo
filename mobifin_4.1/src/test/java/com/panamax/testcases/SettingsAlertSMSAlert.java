package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsAlertSMSAlertWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsAlertSMSAlert extends Common{
	HomeWeb homePage;
	SettingsAlertSMSAlertWeb settingsAlertSMSAlertWeb;
	int count = 0;
	int sortCounter = 0;
	
	/**
	 * @author shivani.patel
	 * For  Settings - Alert - SMSAlert - Add
	 * @creation date 31/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSAlert_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsAlertSMSAlert, Author: Shivani Patel")
	public void addAlertSMSAlert(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSAlertWeb = homePage.clickOnSettingsAlertsSMSAlert();
			count++;
		}
		
		settingsAlertSMSAlertWeb.addAlertSMSAlert(map, getMapKeys(map));
		verifyTrue(settingsAlertSMSAlertWeb.verifyAddAlertSMSAlert(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - Alert - SMSAlert - Edit
	 * @creation date 31/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSAlert_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsAlertSMSAlert, Author: Shivani Patel")
	public void editAlertSMSAlert(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSAlertWeb = homePage.clickOnSettingsAlertsSMSAlert();
			count++;
		}
		
		settingsAlertSMSAlertWeb.editAlertSMSAlert(map, getMapKeys(map));
		verifyTrue(settingsAlertSMSAlertWeb.verifyEditAlertSMSAlert(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - Alert - SMSAlert - Delete
	 * @creation date 31/10/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSAlert_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsAlertSMSAlert, Author: Shivani Patel")
	public void deleteAlertSMSAlert(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSAlertWeb = homePage.clickOnSettingsAlertsSMSAlert();
			count++;
		}
		if(settingsAlertSMSAlertWeb.DeleteAlertSMSAlert(map, getMapKeys(map)))
		verifyFalse(settingsAlertSMSAlertWeb.verifyDeleteAlertSMSAlert(map, getMapKeys(map)));

	}
	/**
	 * @author kutbuddin.compounder
	 * For  Settings - Alert - SMSAlert - Log
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsAlertSMSAlert_Log", dataProviderClass = TestDataImport.class, description = "Id: LogSettingsAlertSMSAlert, Author: kutbuddin.compounder")
	public void editedLogAlertSMSAlert(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsAlertSMSAlertWeb = homePage.clickOnSettingsAlertsSMSAlert();
			count++;
		}
		verifyTrue(settingsAlertSMSAlertWeb.verifyEditLogAlertSMSAlert(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For Alert - SMSAlert Account - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsAlertSMSAlert_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortSMSAlert, Author: Dishant Doshi")
	public void sortAlertSMSAlert(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsAlertSMSAlertWeb = homePage.clickOnSettingsAlertsSMSAlert();
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
			verifyTrue(settingsAlertSMSAlertWeb.sortSMSAlert(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
