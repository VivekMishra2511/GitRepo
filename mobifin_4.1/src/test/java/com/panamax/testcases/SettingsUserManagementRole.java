package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsUserManagementRoleWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - User Management - Role
 * @creation date 24/10/2018
 */
public class SettingsUserManagementRole extends Common {

	HomeWeb homePage;
	SettingsUserManagementRoleWeb settingsUserManagementRoleWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For User Management - Role - Add
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementRole_Add", dataProviderClass = TestDataImport.class, description = "Id: AddRole, Author: Dishant Doshi")
	public void addRole(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementRoleWeb = homePage.clickOnSettingsUserManagementRole();
			count++;
		}
		if (settingsUserManagementRoleWeb.addRole(map, getMapKeys(map)))
			verifyTrue(settingsUserManagementRoleWeb.verifyRoleAdded(map, getMapKeys(map)));
		else
			verifyTrue(false);
	}

	/**
	 * @author dishant.doshi For Management - Role - Edit
	 * @creation date 25/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementRole_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditRole, Author: Dishant Doshi")
	public void editRole(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementRoleWeb = homePage.clickOnSettingsUserManagementRole();
			count++;
		}
		settingsUserManagementRoleWeb.editRole(map, getMapKeys(map));
		verifyTrue(settingsUserManagementRoleWeb.verifyRoleEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - Role - Delete
	 * @creation date 25/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementRole_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteRole, Author: Dishant Doshi")
	public void deleteRole(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementRoleWeb = homePage.clickOnSettingsUserManagementRole();
			count++;
		}
		if (settingsUserManagementRoleWeb.deleteRole(map, getMapKeys(map)))
			verifyFalse(settingsUserManagementRoleWeb.verifyRoleDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Management - Role - Log
	 * @creation date 27/12/2018
	 */
	@Test(dataProvider = "SettingsUserManagementRole_Log", dataProviderClass = TestDataImport.class, description = "Id: LogRole, Author: kutbuddin.compounder")
	public void editRoleLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementRoleWeb = homePage.clickOnSettingsUserManagementRole();
			count++;
		}
		verifyTrue(settingsUserManagementRoleWeb.verifyRoleLoged(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - Management - Role - Sort
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsUserManagementRole_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortRole, Author: Dishant Doshi")
	public void sortRole(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementRoleWeb = homePage.clickOnSettingsUserManagementRole();
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
			verifyTrue(settingsUserManagementRoleWeb.sortRole(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
