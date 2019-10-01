package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsSystemPreferenceOperationUserWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsSystemPreferenceOperationUser extends Common{
	HomeWeb homePage;
	SettingsSystemPreferenceOperationUserWeb settingsSystemPreferenceOperationUserWeb;
	int count = 0;
	int sortCounter = 0;
	/**
	 * @author shivani.patel
	 * For Settings - SystemPreferance - OperationUser - Add
	 * @creation date 16/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceOperationUser_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsSystemPreferanceOperationUser, Author: Shivani Patel")
	public void addOperationUser(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceOperationUserWeb = homePage.clickOnSettingsSystemPreferencesOperationUserWeb();
			count++;
		}
		
		settingsSystemPreferenceOperationUserWeb.addOperationUser(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceOperationUserWeb.verifyaddOperationUser(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For Settings - SystemPreferance - OperationUser - Edit
	 * @creation date 16/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceOperationUser_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsSystemPreferanceOperationUser, Author: Shivani Patel")
	public void editOperationUser(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceOperationUserWeb = homePage.clickOnSettingsSystemPreferencesOperationUserWeb();
			count++;
		}
		
		settingsSystemPreferenceOperationUserWeb.editOperationUser(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceOperationUserWeb.verifyeditOperationUser(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For Settings - SystemPreferance - OperationUser - Delete
	 * @creation date 16/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceOperationUser_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsSystemPreferanceOperationUser, Author: Shivani Patel")
	public void deleteOperationUser(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceOperationUserWeb = homePage.clickOnSettingsSystemPreferencesOperationUserWeb();
			count++;
		}
		if(settingsSystemPreferenceOperationUserWeb.deleteOperationUser(map, getMapKeys(map)))
		verifyFalse(settingsSystemPreferenceOperationUserWeb.verifyDeleteOperationUser(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For  Settings - SystemPreferance - OperationUser - Log
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceOperationUser_Log", dataProviderClass = TestDataImport.class, description = "Id: LogSettingsSystemPreferanceOperationUser, Author: kutbuddin.compounder")
	public void editedLogOperationUser(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceOperationUserWeb = homePage.clickOnSettingsSystemPreferencesOperationUserWeb();
			count++;
		}
		verifyTrue(settingsSystemPreferenceOperationUserWeb.verifyEditLogOperationUser(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For System Preferences - OperationUser - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsSystemPreferencesOperationUser_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortOperationUser, Author: Dishant Doshi")
	public void sortOperationUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsSystemPreferenceOperationUserWeb = homePage.clickOnSettingsSystemPreferencesOperationUserWeb();
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
			verifyTrue(settingsSystemPreferenceOperationUserWeb.sortOperationUser(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
