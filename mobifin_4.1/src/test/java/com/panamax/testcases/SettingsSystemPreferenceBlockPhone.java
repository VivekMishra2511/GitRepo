package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsSystemPreferenceBlockPhoneWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsSystemPreferenceBlockPhone extends Common{
	HomeWeb homePage;
	SettingsSystemPreferenceBlockPhoneWeb settingsSystemPreferenceBlockPhoneWeb;
	int count = 0;
	int sortCounter = 0;
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - BlockPhone - Add
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceBlockPhone_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsSystemPreferanceBlockPhone, Author: Shivani Patel")
	public void addBlockPhone(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceBlockPhoneWeb = homePage.clickOnSettingsSystemPreferencesBlockPhone();
			count++;
		}
		
		settingsSystemPreferenceBlockPhoneWeb.addBlockPhone(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceBlockPhoneWeb.verifyaddBlockPhone(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - BlockPhone - Edit
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceBlockPhone_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsSystemPreferanceBlockPhone, Author: Shivani Patel")
	public void editBlockPhone(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceBlockPhoneWeb = homePage.clickOnSettingsSystemPreferencesBlockPhone();
			count++;
		}
		
		settingsSystemPreferenceBlockPhoneWeb.EditBlockPhone(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceBlockPhoneWeb.verifyEditBlockPhone(map, getMapKeys(map)));
	}
	/**
	 * @author shivani.patel
	 * For Settings - SystemPreferance - BlockPhone - Delete
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceBlockPhone_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsSystemPreferanceBlockPhone, Author: Shivani Patel")
	public void deleteBlockPhone(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceBlockPhoneWeb = homePage.clickOnSettingsSystemPreferencesBlockPhone();
			count++;
		}
		if(settingsSystemPreferenceBlockPhoneWeb.DeleteBlockPhone(map, getMapKeys(map)))
		verifyFalse(settingsSystemPreferenceBlockPhoneWeb.verifyDeleteBlockPhone(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For  Settings - SystemPreferance - BlockPhone - Log
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceBlockPhone_Log", dataProviderClass = TestDataImport.class, description = "Id: LogSettingsSystemPreferanceBlockPhone, Author: kutbuddin.compounder")
	public void editedLogBlockPhone(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceBlockPhoneWeb = homePage.clickOnSettingsSystemPreferencesBlockPhone();
			count++;
		}
		verifyTrue(settingsSystemPreferenceBlockPhoneWeb.verifyEditLogBlockPhone(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For System Preferences - BlockPhone - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsSystemPreferencesBlockPhone_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortBlockPhone, Author: Dishant Doshi")
	public void sortBlockPhone(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsSystemPreferenceBlockPhoneWeb = homePage.clickOnSettingsSystemPreferencesBlockPhone();
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
			verifyTrue(settingsSystemPreferenceBlockPhoneWeb.sortBlockPhone(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
