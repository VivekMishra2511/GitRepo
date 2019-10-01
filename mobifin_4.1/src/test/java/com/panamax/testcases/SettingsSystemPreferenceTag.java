package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsSystemPreferenceTagWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsSystemPreferenceTag extends Common{
	HomeWeb homePage;
	SettingsSystemPreferenceTagWeb settingsSystemPreferenceTagWeb;
	int count = 0;
	int sortCounter = 0;
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - Tag - Add
	 * @creation date 18/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceTag_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsSystemPreferanceTag, Author: Shivani Patel")
	public void addTag(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceTagWeb = homePage.clickOnSettingsSystemPreferencesTagWeb();
			count++;
		}
		
		settingsSystemPreferenceTagWeb.addTag(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceTagWeb.verifyaddTag(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - Tag - Edit
	 * @creation date 18/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceTag_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsSystemPreferanceTag, Author: Shivani Patel")
	public void editTag(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceTagWeb = homePage.clickOnSettingsSystemPreferencesTagWeb();
			count++;
		}
		
		settingsSystemPreferenceTagWeb.editTag(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceTagWeb.verifyEditedTag(map, getMapKeys(map)));
	}
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - Tag - UserAdd
	 * @creation date 18/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceTag_Delete", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsSystemPreferanceTag, Author: Shivani Patel")
	public void addUser(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceTagWeb = homePage.clickOnSettingsSystemPreferencesTagWeb();
			count++;
		}
		settingsSystemPreferenceTagWeb.addUser(map, getMapKeys(map));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - Tag - Delete
	 * @creation date 18/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceTag_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsSystemPreferanceTag, Author: Shivani Patel")
	public void deleteUser(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceTagWeb = homePage.clickOnSettingsSystemPreferencesTagWeb();
			count++;
		}
		if(settingsSystemPreferenceTagWeb.deleteUser(map, getMapKeys(map)));
		clickOnBackBtn();
	}
	/**
	 * @author kutbuddin.compounder
	 * For  Settings - SystemPreferance - Tag - Log
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceTag_Log", dataProviderClass = TestDataImport.class, description = "Id: LogSettingsSystemPreferanceTag, Author: kutbuddin.compounder")
	public void editedLogTag(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceTagWeb = homePage.clickOnSettingsSystemPreferencesTagWeb();
			count++;
		}
		verifyTrue(settingsSystemPreferenceTagWeb.verifyEditLogTag(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For System Preferences - Tag - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsSystemPreferencesTag_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortTag, Author: Dishant Doshi")
	public void sortTag(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsSystemPreferenceTagWeb = homePage.clickOnSettingsSystemPreferencesTagWeb();
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
			verifyTrue(settingsSystemPreferenceTagWeb.sortTag(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
