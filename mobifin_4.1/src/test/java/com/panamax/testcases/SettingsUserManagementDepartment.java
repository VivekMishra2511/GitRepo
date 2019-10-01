package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsUserManagementDepartmentWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - User Management - Department
 * @creation date 23/10/2018
 */
public class SettingsUserManagementDepartment extends Common {

	HomeWeb homePage;
	SettingsUserManagementDepartmentWeb settingsUserManagementDepartmentWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For User Management - Department - Add
	 * @creation date 23/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDepartment_Add", dataProviderClass = TestDataImport.class, description = "Id: AddDepartment, Author: Dishant Doshi")
	public void addDepartment(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDepartmentWeb = homePage.clickOnSettingsUserManagementDepartment();
			count++;
		}
		settingsUserManagementDepartmentWeb.addDepartment(map, getMapKeys(map));
		verifyTrue(settingsUserManagementDepartmentWeb.verifyDepartmentAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - Department - Edit
	 * @creation date 23/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDepartment_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditDepartment, Author: Dishant Doshi")
	public void editDepartment(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDepartmentWeb = homePage.clickOnSettingsUserManagementDepartment();
			count++;
		}
		settingsUserManagementDepartmentWeb.editDepartment(map, getMapKeys(map));
		verifyTrue(settingsUserManagementDepartmentWeb.verifyDepartmentEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - Department - Delete
	 * @creation date 23/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDepartment_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteDepartment, Author: Dishant Doshi")
	public void deleteDepartment(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDepartmentWeb = homePage.clickOnSettingsUserManagementDepartment();
			count++;
		}
		if (settingsUserManagementDepartmentWeb.deleteDepartment(map, getMapKeys(map)))
			verifyFalse(settingsUserManagementDepartmentWeb.verifyDepartmentDelete(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Management - Department - Log
	 * @creation date 27/12/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDepartment_Log", dataProviderClass = TestDataImport.class, description = "Id: LogDepartment, Author: kutbuddin.compounder")
	public void departmentEditedLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDepartmentWeb = homePage.clickOnSettingsUserManagementDepartment();
			count++;
		}
		verifyTrue(settingsUserManagementDepartmentWeb.verifyDepartmentLoged(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - Department - Sort
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDepartment_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortDepartment, Author: Dishant Doshi")
	public void sortDepartment(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDepartmentWeb = homePage.clickOnSettingsUserManagementDepartment();
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
			verifyTrue(settingsUserManagementDepartmentWeb.sortDepartment(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
