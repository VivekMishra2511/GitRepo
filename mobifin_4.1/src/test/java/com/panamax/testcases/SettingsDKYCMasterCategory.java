package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsDKYCMasterCategoryWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - DKYC Master - Category
 * @creation date 31/10/2018
 */
public class SettingsDKYCMasterCategory extends Common {

	HomeWeb homePage;
	SettingsDKYCMasterCategoryWeb settingsDKYCMasterDKYCCategoryWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For DKYCMaster - DKYC Category - Add
	 * @creation date 31/10/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterCategory_Add", dataProviderClass = TestDataImport.class, description = "Id: AddCategory, Author: Dishant Doshi")
	public void addCategory(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsDKYCMasterDKYCCategoryWeb = homePage.clickOnSettingsDKYCMasterDKYCCategory();
			count++;
		}
		settingsDKYCMasterDKYCCategoryWeb.addCategory(map, getMapKeys(map));
		verifyTrue(settingsDKYCMasterDKYCCategoryWeb.verifyCategoryAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - DKYC Category - Edit
	 * @creation date 22/10/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterCategory_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditCategory, Author: Dishant Doshi")
	public void editCategory(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsDKYCMasterDKYCCategoryWeb = homePage.clickOnSettingsDKYCMasterDKYCCategory();
			count++;
		}
		settingsDKYCMasterDKYCCategoryWeb.editCategory(map, getMapKeys(map));
		verifyTrue(settingsDKYCMasterDKYCCategoryWeb.verifyCategoryEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - DKYC Category - Delete
	 * @creation date 23/10/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterCategory_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteCategory, Author: Dishant Doshi")
	public void deleteCategory(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsDKYCMasterDKYCCategoryWeb = homePage.clickOnSettingsDKYCMasterDKYCCategory();
			count++;
		}
		settingsDKYCMasterDKYCCategoryWeb.deleteCategory(map, getMapKeys(map));
		verifyFalse(settingsDKYCMasterDKYCCategoryWeb.verifyCategoryDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For DKYCMaster - DKYC Category - Log
	 * @creation date 27/12/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterCategory_Log", dataProviderClass = TestDataImport.class, description = "Id: LogCategory, Author:kutbuddin.compounder")
	public void editCategoryLog(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			settingsDKYCMasterDKYCCategoryWeb = homePage.clickOnSettingsDKYCMasterDKYCCategory();
			count++;
		}
		verifyTrue(settingsDKYCMasterDKYCCategoryWeb.verifyCategoryEditLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - DKYCCategory - Sort
	 * @creation date 27/12/2018
	 */
	@Test(dataProvider = "SettingsDKYCMasterDKYCCategory_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortDKYCCategory, Author: Dishant Doshi")
	public void sortDKYCCategory(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsDKYCMasterDKYCCategoryWeb = homePage.clickOnSettingsDKYCMasterDKYCCategory();
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
			verifyTrue(settingsDKYCMasterDKYCCategoryWeb.sortDKYCCategory(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
