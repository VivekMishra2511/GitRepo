package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsGISMasterStateWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - GIS Master - State
 * @creation date 11/10/2018
 */
public class SettingsGISMasterState extends Common {

	HomeWeb homePage;
	SettingsGISMasterStateWeb settingsGISMasterStateWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For GISMaster - State - Add
	 * @creation date 11/10/2018
	 */
	@Test(dataProvider = "SettingsGISMasterState_Add", dataProviderClass = TestDataImport.class, description = "Id: AddState, Author: Dishant Doshi")
	public void addState(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterStateWeb = homePage.clickOnSettingsGISMasterState();
			count++;
		}
		settingsGISMasterStateWeb.addState(map, getMapKeys(map));
		verifyTrue(settingsGISMasterStateWeb.verifyStateAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - State - Edit
	 * @creation date 11/10/2018
	 */
	@Test(dataProvider = "SettingsGISMasterState_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditState, Author: Dishant Doshi")
	public void editState(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterStateWeb = homePage.clickOnSettingsGISMasterState();
			count++;
		}

		settingsGISMasterStateWeb.editState(map, getMapKeys(map));
		verifyTrue(settingsGISMasterStateWeb.verifyStateEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - State - Delete
	 * @creation date 11/10/2018
	 */
	@Test(dataProvider = "SettingsGISMasterState_Delete", dataProviderClass = TestDataImport.class, description = "Id: EditState, Author: Dishant Doshi")
	public void deleteState(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterStateWeb = homePage.clickOnSettingsGISMasterState();
			count++;
		}
		if (settingsGISMasterStateWeb.deleteState(map, getMapKeys(map)))
			verifyFalse(settingsGISMasterStateWeb.verifyStateDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - State - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "SettingsGISMasterState_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortState, Author: Dishant Doshi")
	public void sortState(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterStateWeb = homePage.clickOnSettingsGISMasterState();
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
			verifyTrue(settingsGISMasterStateWeb.sortState(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
