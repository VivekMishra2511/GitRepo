package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsToolsExchangeRateWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class SettingsToolsExchangeRate extends Common{
	HomeWeb homePage;
	SettingsToolsExchangeRateWeb settingsToolsExchangeRateWeb;
	int count = 0;
	int sortCounter = 0;
	/**
	 * @author shivani.patel
	 * For  Settings - Tools - ExchangeRate - Add
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsToolsExchangeRate_Add", dataProviderClass = TestDataImport.class, description = "Id: AddSettingsToolsExchangeRate, Author: Shivani Patel")
	public void addExchangeRate(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsToolsExchangeRateWeb = homePage.clickOnSettingsToolsExchangeRates();
			count++;
		}
		settingsToolsExchangeRateWeb.addExchangeRate(map, getMapKeys(map));
		verifyTrue(settingsToolsExchangeRateWeb.verifyaddExchangeRate(map, getMapKeys(map)));
	}
	
	/**
	 * @author shivani.patel
	 * For  Settings - Tools - ExchangeRate - Edit
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsToolsExchangeRate_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditSettingsToolsExchangeRate, Author: Shivani Patel")
	public void editExchangeRate(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsToolsExchangeRateWeb = homePage.clickOnSettingsToolsExchangeRates();
			count++;
		}
		settingsToolsExchangeRateWeb.editExchangeRate(map, getMapKeys(map));
		verifyTrue(settingsToolsExchangeRateWeb.verifyeditExchangeRate(map, getMapKeys(map)));
	}
	
	/**
	 * @author kutbuddin.compounder
	 * For  Settings - Tools - ExchangeRate - Log
	 * @creation date 28/12/2018
	 */
	@Test(dataProvider = "SettingsToolsExchangeRate_Log", dataProviderClass = TestDataImport.class, description = "Id: LogSettingsToolsExchangeRate, Author: Shivani Patel")
	public void editLogExchangeRate(Map<Object, Object> map)
	{
		if(count==0){
			homePage = goToHome();
			settingsToolsExchangeRateWeb = homePage.clickOnSettingsToolsExchangeRates();
			count++;
		}
		verifyTrue(settingsToolsExchangeRateWeb.verifyEditLogExchangeRate(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For Tools - exchangeRate - Sort
	 * @creation date 07/01/2019
	 */
	@Test(dataProvider = "SettingsToolsExchangeRate_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortexchangeRate, Author: Dishant Doshi")
	public void sortExchangeRate(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsToolsExchangeRateWeb = homePage.clickOnSettingsToolsExchangeRates();
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
			verifyTrue(settingsToolsExchangeRateWeb.sortExchangeRate(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
