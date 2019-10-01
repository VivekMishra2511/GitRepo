package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsGISMasterCountryWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - GIS Master - Country
 * @creation date 28/09/2018
 */
public class SettingsGISMasterCountry extends Common {

	HomeWeb homePage;
	SettingsGISMasterCountryWeb settingsGISMasterCountryWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For GISMaster - Country - Add
	 * @creation date 28/09/2018
	 */
	@Test(dataProvider = "SettingsGISMasterCountry_Add", dataProviderClass = TestDataImport.class, description = "Id: AddCountry, Author: Dishant Doshi",groups= {"Add"},priority=0)
	public void addCountry(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterCountryWeb = homePage.clickOnSettingsGISMasterCountry();
			count++;
		}
		settingsGISMasterCountryWeb.addCountry(map, getMapKeys(map));
		verifyTrue(settingsGISMasterCountryWeb.verifyCountryAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - Country - Edit
	 * @creation date 28/09/2018
	 */
	@Test(dataProvider = "SettingsGISMasterCountry_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditCountry, Author: Dishant Doshi",groups= {"Edit"},priority=1)
	public void editCountry(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterCountryWeb = homePage.clickOnSettingsGISMasterCountry();
			count++;
		}

		settingsGISMasterCountryWeb.editCountry(map, getMapKeys(map));
		verifyTrue(settingsGISMasterCountryWeb.verifyCountryEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - Country - Delete
	 * @creation date 28/09/2018
	 */
	@Test(dataProvider = "SettingsGISMasterCountry_Delete", dataProviderClass = TestDataImport.class, description = "Id: EditCountry, Author: Dishant Doshi",groups= {"Delete"},priority=2)
	public void deleteCountry(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterCountryWeb = homePage.clickOnSettingsGISMasterCountry();
			count++;
		}
		if (settingsGISMasterCountryWeb.deleteCountry(map, getMapKeys(map)))
			verifyFalse(settingsGISMasterCountryWeb.verifyCountryDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - Country - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "SettingsGISMasterCountry_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortCountry, Author: Dishant Doshi",groups={"Sort"},priority=3)
	public void sortCountry(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterCountryWeb = homePage.clickOnSettingsGISMasterCountry();
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
			verifyTrue(settingsGISMasterCountryWeb.sortCountry(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
