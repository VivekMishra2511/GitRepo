package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsSystemPreferenceRetailSegmentWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsSystemPreferenceRetailSegment extends Common{
	HomeWeb homePage;
	SettingsSystemPreferenceRetailSegmentWeb settingsSystemPreferenceRetailSegmentWeb;
	int count = 0;
	int sortCounter = 0;
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - RetailSegment - Add
	 * @creation date 17/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceRetailSegment_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsSystemPreferanceRetailSegment, Author: Shivani Patel")
	public void addRetailSegment(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceRetailSegmentWeb = homePage.clickOnSettingsSystemPreferencesRetailSegmentWeb();
			count++;
		}
		
		settingsSystemPreferenceRetailSegmentWeb.addRetailSegement(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceRetailSegmentWeb.verifyaddRetailSegement(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - RetailSegment - Edit
	 * @creation date 17/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceRetailSegment_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsSystemPreferanceRetailSegment, Author: Shivani Patel")
	public void editRetailSegment(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceRetailSegmentWeb = homePage.clickOnSettingsSystemPreferencesRetailSegmentWeb();
			count++;
		}
		settingsSystemPreferenceRetailSegmentWeb.editRetailSegment(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceRetailSegmentWeb.verifyeditRetailSegment(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - RetailSegment - Delete
	 * @creation date 17/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceRetailSegment_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsSystemPreferanceRetailSegment, Author: Shivani Patel")
	public void deleteRetailSegment(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceRetailSegmentWeb = homePage.clickOnSettingsSystemPreferencesRetailSegmentWeb();
			count++;
		}
		if(settingsSystemPreferenceRetailSegmentWeb.deleteRetailSegment(map, getMapKeys(map)))
		verifyFalse(settingsSystemPreferenceRetailSegmentWeb.verifyDeleteRetailSegment(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For  Settings - SystemPreferance - RetailSegment - Log
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceRetailSegment_Log", dataProviderClass = TestDataImport.class, description = "Id: LogSettingsSystemPreferanceRetailSegment, Author: kutbuddin.compounder")
	public void editedLogRetailSegment(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceRetailSegmentWeb = homePage.clickOnSettingsSystemPreferencesRetailSegmentWeb();
			count++;
		}
		verifyTrue(settingsSystemPreferenceRetailSegmentWeb.verifyEditLogRetailSegment(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For System Preferences - RetailSegment - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsSystemPreferencesRetailSegment_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortRetailSegment, Author: Dishant Doshi")
	public void sortRetailSegment(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsSystemPreferenceRetailSegmentWeb = homePage.clickOnSettingsSystemPreferencesRetailSegmentWeb();
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
			verifyTrue(settingsSystemPreferenceRetailSegmentWeb.sortRetailSegment(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
