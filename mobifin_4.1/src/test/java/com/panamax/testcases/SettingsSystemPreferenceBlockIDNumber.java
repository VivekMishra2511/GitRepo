package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsSystemPreferenceBlockIDNumberWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsSystemPreferenceBlockIDNumber extends Common{
	HomeWeb homePage;
	SettingsSystemPreferenceBlockIDNumberWeb settingsSystemPreferenceBlockIDNumberWeb;
	int count = 0;
	int sortCounter = 0;
	/**
	 * @author shivani.patel
	 * For Settings - SystemPreferance - BlockIDNumber - Add
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceBlockIDNumber_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsSystemPreferanceBlockIDNumber, Author: Shivani Patel")
	public void addBlockIDNumber(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceBlockIDNumberWeb = homePage.clickOnSettingsSystemPreferencesBlockIDNumberWeb();
			count++;
		}

		settingsSystemPreferenceBlockIDNumberWeb.addBlockIDNumber(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceBlockIDNumberWeb.verifyaddBlockIDNumber(map, getMapKeys(map)));
	}

	/**
	 * @author shivani.patel
	 * For Settings - SystemPreferance - BlockIDNumber - Edit
	 * @creation date 16/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceBlockIDNumber_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsSystemPreferanceBlockIDNumber, Author: Shivani Patel")
	public void editBlockIDNumber(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceBlockIDNumberWeb = homePage.clickOnSettingsSystemPreferencesBlockIDNumberWeb();
			count++;
		}

		settingsSystemPreferenceBlockIDNumberWeb.editBlockIDNumber(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceBlockIDNumberWeb.verifyEditBlockIDNumber(map, getMapKeys(map)));
	}
	/**
	 * @author shivani.patel
	 * For Settings - SystemPreferance - BlockIDNumber - Delete
	 * @creation date 16/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceBlockIDNumber_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsSystemPreferanceBlockIDNumber, Author: Shivani Patel")
	public void deleteBlockIDNumber(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceBlockIDNumberWeb = homePage.clickOnSettingsSystemPreferencesBlockIDNumberWeb();
			count++;
		}
		if(settingsSystemPreferenceBlockIDNumberWeb.deleteBlockIDNumber(map, getMapKeys(map)))
			verifyFalse(settingsSystemPreferenceBlockIDNumberWeb.verifyDeleteBlockIDNumber(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For  Settings - SystemPreferance - BlockIDNumber - Log
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceBlockIDNumber_Log", dataProviderClass = TestDataImport.class, description = "Id: LogSettingsSystemPreferanceBlockIDNumber, Author: kutbuddin.compounder")
	public void editedLogBlockIDNumber(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceBlockIDNumberWeb = homePage.clickOnSettingsSystemPreferencesBlockIDNumberWeb();
			count++;
		}
		verifyTrue(settingsSystemPreferenceBlockIDNumberWeb.verifyEditLogBlockIDNumber(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For System Preferences - BlockIDNumber - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsSystemPreferencesBlockIDNumber_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortBlockIDNumber, Author: Dishant Doshi")
	public void sortBlockIDNumber(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsSystemPreferenceBlockIDNumberWeb = homePage.clickOnSettingsSystemPreferencesBlockIDNumberWeb();
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
			verifyTrue(settingsSystemPreferenceBlockIDNumberWeb.sortBlockIDNumber(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
