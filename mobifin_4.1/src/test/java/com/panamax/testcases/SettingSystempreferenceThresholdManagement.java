package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingSystempreferenceThresholdManagementWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingSystempreferenceThresholdManagement extends Common{
	HomeWeb homePage;
	SettingSystempreferenceThresholdManagementWeb settingSystempreferenceThresholdManagementWeb;
	int count = 0;
	int sortCounter = 0;
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - ThresholdManagement - Add
	 * @creation date 22/10/2018
	 */
	@Test(dataProvider = "SettingSystempreferenceThresholdManagement_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingSystempreferenceThresholdManagement, Author: Shivani Patel")
	public void addThresholdManagement(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingSystempreferenceThresholdManagementWeb = homePage.clickOnSettingsSystemPreferencesThresholdManagementWeb();
			count++;
		}
		
		settingSystempreferenceThresholdManagementWeb.addThresholdManagement(map, getMapKeys(map));
		verifyTrue(settingSystempreferenceThresholdManagementWeb.verifyaddThresholdManagement(map, getMapKeys(map)));
	}
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - ThresholdManagement - Edit
	 * @creation date 22/10/2018
	 */
	@Test(dataProvider = "SettingSystempreferenceThresholdManagement_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingSystempreferenceThresholdManagement, Author: Shivani Patel")
	public void editThresholdManagement(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingSystempreferenceThresholdManagementWeb = homePage.clickOnSettingsSystemPreferencesThresholdManagementWeb();
			count++;
		}
		
		settingSystempreferenceThresholdManagementWeb.editThresholdManagement(map, getMapKeys(map));
		verifyTrue(settingSystempreferenceThresholdManagementWeb.verifyeditThresholdManagement(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - ThresholdManagement - Delete
	 * @creation date 22/10/2018
	 */
	@Test(dataProvider = "SettingSystempreferenceThresholdManagement_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsSystempreferenceThresholdManagement, Author: Shivani Patel")
	public void deleteThresholdManagement(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingSystempreferenceThresholdManagementWeb = homePage.clickOnSettingsSystemPreferencesThresholdManagementWeb();
			count++;
		}
		if(settingSystempreferenceThresholdManagementWeb.deleteThresholdManagement(map, getMapKeys(map)));
		verifyFalse(settingSystempreferenceThresholdManagementWeb.verifyDleteThresholdManagement(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For  Settings - SystemPreferance - ThresholdManagement - Log
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingSystempreferenceThresholdManagement_Log", dataProviderClass = TestDataImport.class, description = "Id: LogSettingsSystemPreferanceThresholdManagement, Author: kutbuddin.compounder")
	public void editedLogThresholdManagement(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingSystempreferenceThresholdManagementWeb = homePage.clickOnSettingsSystemPreferencesThresholdManagementWeb();
			count++;
		}
		verifyTrue(settingSystempreferenceThresholdManagementWeb.verifyEditLogThresholdManagement(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For System Preferences - ThresholdManagement - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsSystemPreferencesThresholdManagement_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortThresholdManagement, Author: Dishant Doshi")
	public void sortThresholdManagement(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingSystempreferenceThresholdManagementWeb = homePage.clickOnSettingsSystemPreferencesThresholdManagementWeb();
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
			verifyTrue(settingSystempreferenceThresholdManagementWeb.sortThresholdManagement(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
