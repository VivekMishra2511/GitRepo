package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsSystemPreferenceNonRegisterWalletThresholdWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsSystemPreferenceNonRegisterWalletThreshold extends Common{
	HomeWeb homePage;
	SettingsSystemPreferenceNonRegisterWalletThresholdWeb settingsSystemPreferenceNonRegisterWalletThresholdWeb;
	int count = 0;
	
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - NonRegisterWalletThreshold - Edit
	 * @creation date 22/10/2018
	 */
	@Test(dataProvider = "SettingSystempreferenceNonRegisterWalletThreshold_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingSystempreferenceNonRegisterWalletThreshold, Author: Shivani Patel")
	public void editNonRegisterWalletThreshold(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceNonRegisterWalletThresholdWeb = homePage.clickOnSettingsSystemPreferencesNonRegisterWalletThresholdWeb();
			count++;
		}
		
		settingsSystemPreferenceNonRegisterWalletThresholdWeb.editNonRegisterWalletThresholdSenderAndReceiver(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceNonRegisterWalletThresholdWeb.verifyeditNonRegisterWalletThresholdSenderAndReceiver(map, getMapKeys(map)),false);
	}
	/**
	 * @author shivani.patel
	 * For  Settings - SystemPreferance - NonRegisterWalletThreshold - Delete
	 * @creation date 23/10/2018
	 */
	@Test(dataProvider = "SettingsSystemPreferanceNonRegisterWalletThreshold_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteSettingsSystemPreferanceNonRegisterWalletThreshold, Author: Shivani Patel")
	public void deleteNonRegisterWalletThreshold(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsSystemPreferenceNonRegisterWalletThresholdWeb = homePage.clickOnSettingsSystemPreferencesNonRegisterWalletThresholdWeb();
			count++;
		}
		settingsSystemPreferenceNonRegisterWalletThresholdWeb.deleteNonRegisterWalletThresholdSenderAndReceiver(map, getMapKeys(map));
		verifyTrue(settingsSystemPreferenceNonRegisterWalletThresholdWeb.verifyDeleteNonRegisterWalletThresholdSenderAndReceiver(map, getMapKeys(map)),false);
	}
}
