package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsGISMasterMapcodeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - GIS Master - Map Code
 * @creation date 12/10/2018
 */
public class SettingsGISMasterMapcode extends Common {

	HomeWeb homePage;
	SettingsGISMasterMapcodeWeb settingsGISMasterMapcodeWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For GISMaster - Map Code - Add
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "SettingsGISMasterMapcode_Add", dataProviderClass = TestDataImport.class, description = "Id: AddMapcode, Author: Dishant Doshi")
	public void addMapcode(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterMapcodeWeb = homePage.clickOnSettingsGISMasterMapcode();
			count++;
		}
		settingsGISMasterMapcodeWeb.addMapcode(map, getMapKeys(map));
		verifyTrue(settingsGISMasterMapcodeWeb.verifyMapcodeAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - Map Code - Edit
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "SettingsGISMasterMapcode_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditMapcode, Author: Dishant Doshi")
	public void editMapcode(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterMapcodeWeb = homePage.clickOnSettingsGISMasterMapcode();
			count++;
		}

		settingsGISMasterMapcodeWeb.editMapcode(map, getMapKeys(map));
		verifyTrue(settingsGISMasterMapcodeWeb.verifyMapcodeEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - Map Code - Delete
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "SettingsGISMasterMapcode_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteMapcode, Author: Dishant Doshi")
	public void deleteMapcode(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterMapcodeWeb = homePage.clickOnSettingsGISMasterMapcode();
			count++;
		}
		if (settingsGISMasterMapcodeWeb.deleteMapcode(map, getMapKeys(map)))
			verifyFalse(settingsGISMasterMapcodeWeb.verifyMapCodeDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For GISMaster - Map Code - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "SettingsGISMasterMapCode_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortMapCode, Author: Dishant Doshi")
	public void sortMapcode(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsGISMasterMapcodeWeb = homePage.clickOnSettingsGISMasterMapcode();
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
			verifyTrue(settingsGISMasterMapcodeWeb.sortMapCode(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
