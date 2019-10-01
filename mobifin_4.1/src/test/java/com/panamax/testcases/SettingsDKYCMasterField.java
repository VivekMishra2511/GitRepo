package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsDKYCMasterFieldWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - DKYC Master - Field
 * @creation date 12/10/2018
 */
public class SettingsDKYCMasterField extends Common {

	HomeWeb homePage;
	SettingsDKYCMasterFieldWeb settingsDKYCMasterDKYCFieldWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For DKYCMaster - DKYC Field - Add
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterField_Add", dataProviderClass = TestDataImport.class, description = "Id: AddField, Author: Dishant Doshi")
	public void addField(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsDKYCMasterDKYCFieldWeb = homePage.clickOnSettingsDKYCMasterDKYCFields();
			count++;
		}
		settingsDKYCMasterDKYCFieldWeb.addField(map, getMapKeys(map));
		verifyTrue(settingsDKYCMasterDKYCFieldWeb.verifyFieldAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - DKYC Field - Edit
	 * @creation date 22/10/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterField_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditField, Author: Dishant Doshi")
	public void editField(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsDKYCMasterDKYCFieldWeb = homePage.clickOnSettingsDKYCMasterDKYCFields();
			count++;
		}
		settingsDKYCMasterDKYCFieldWeb.editField(map, getMapKeys(map));
		verifyTrue(settingsDKYCMasterDKYCFieldWeb.verifyFieldEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - DKYC Field - Delete
	 * @creation date 23/10/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterField_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteField, Author: Dishant Doshi")
	public void deleteField(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsDKYCMasterDKYCFieldWeb = homePage.clickOnSettingsDKYCMasterDKYCFields();
			count++;
		}
		if (settingsDKYCMasterDKYCFieldWeb.deleteField(map, getMapKeys(map)))
			verifyFalse(settingsDKYCMasterDKYCFieldWeb.verifyFieldDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For DKYCMaster - DKYC Field - Log
	 * @creation date 27/12/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterField_Log", dataProviderClass = TestDataImport.class, description = "Id: LogField, Author:kutbuddin.compounder")
	public void editFieldLog(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsDKYCMasterDKYCFieldWeb = homePage.clickOnSettingsDKYCMasterDKYCFields();
			count++;
		}
		verifyTrue(settingsDKYCMasterDKYCFieldWeb.verifyFeildEditLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - DKYCField - Sort
	 * @creation date 27/12/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterDKYCField_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortDKYCField, Author: Dishant Doshi")
	public void sortDKYCField(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsDKYCMasterDKYCFieldWeb = homePage.clickOnSettingsDKYCMasterDKYCFields();
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
			verifyTrue(settingsDKYCMasterDKYCFieldWeb.sortDKYCFields(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
