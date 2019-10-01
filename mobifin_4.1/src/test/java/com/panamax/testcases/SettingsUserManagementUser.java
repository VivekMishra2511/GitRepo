package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsUserManagementUserWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - User Management - User
 * @creation date 29/10/2018
 */
public class SettingsUserManagementUser extends Common {

	HomeWeb homePage;
	SettingsUserManagementUserWeb settingsUserManagementUserWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For User Management - User - Add
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementUser_Add", dataProviderClass = TestDataImport.class, description = "Id: AddUser, Author: Dishant Doshi")
	public void addUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementUserWeb = homePage.clickOnSettingsUserManagementUser();
			count++;
		}
		settingsUserManagementUserWeb.addUser(map, getMapKeys(map));
		verifyTrue(settingsUserManagementUserWeb.verifyUserAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - User - Edit
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementUser_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditUser, Author: Dishant Doshi")
	public void editUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementUserWeb = homePage.clickOnSettingsUserManagementUser();
			count++;
		}
		settingsUserManagementUserWeb.editUser(map, getMapKeys(map));
		verifyTrue(settingsUserManagementUserWeb.verifyUserEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - User - Delete
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementUser_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteUser, Author: Dishant Doshi")
	public void deleteUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementUserWeb = homePage.clickOnSettingsUserManagementUser();
			count++;
		}
		if (settingsUserManagementUserWeb.deleteUser(map, getMapKeys(map)))
			verifyFalse(settingsUserManagementUserWeb.verifyUserDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Management - User - Log
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementUser_Log", dataProviderClass = TestDataImport.class, description = "Id: LogUser, Author:kutbuddin.compounder")
	public void verifyUserManegementLoged(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementUserWeb = homePage.clickOnSettingsUserManagementUser();
			count++;
		}
		verifyTrue(settingsUserManagementUserWeb.verifyUserManegementLoged(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - Management - Dashboard - Sort
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsUserManagementUser_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortUser, Author: Dishant Doshi")
	public void sortUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementUserWeb = homePage.clickOnSettingsUserManagementUser();
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
			verifyTrue(settingsUserManagementUserWeb.sortUser(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
