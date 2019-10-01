package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.SettingsUserManagementDashboardWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Settings - User Management - Dashboard
 * @creation date 26/10/2018
 */
public class SettingsUserManagementDashboard extends Common {

	HomeWeb homePage;
	SettingsUserManagementDashboardWeb settingsUserManagementDashboardWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For User Management - Dashboard - Add
	 * @creation date 26/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDashboard_Add", dataProviderClass = TestDataImport.class, description = "Id: AddDashboard, Author: Dishant Doshi")
	public void addDashboard(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDashboardWeb = homePage.clickOnSettingsUserManagementDashboard();
			count++;
		}
		settingsUserManagementDashboardWeb.addDashboard(map, getMapKeys(map));
		verifyTrue(settingsUserManagementDashboardWeb.verifyDashboardAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - Dashboard - Edit
	 * @creation date 29/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDashboard_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditDashboard, Author: Dishant Doshi")
	public void editDashboard(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDashboardWeb = homePage.clickOnSettingsUserManagementDashboard();
			count++;
		}
		settingsUserManagementDashboardWeb.editDashboard(map, getMapKeys(map));
		verifyTrue(settingsUserManagementDashboardWeb.verifyDashboardEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Management - Dashboard - Delete
	 * @creation date 26/10/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDashboard_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteDashboard, Author: Dishant Doshi")
	public void deleteDashboard(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDashboardWeb = homePage.clickOnSettingsUserManagementDashboard();
			count++;
		}
		if (settingsUserManagementDashboardWeb.deleteDashboard(map, getMapKeys(map)))
			verifyFalse(settingsUserManagementDashboardWeb.verifyDashboardDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Management - Dashboard - Log
	 * @creation date 27/12/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDashboard_Log", dataProviderClass = TestDataImport.class, description = "Id: LogDashboard, Author: kutbuddin.compounder")
	public void editLogDashboard(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDashboardWeb = homePage.clickOnSettingsUserManagementDashboard();
			count++;
		}
		verifyTrue(settingsUserManagementDashboardWeb.verifyDashboardLoged(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For DKYCMaster - Management - Dashboard - Sort
	 * @creation date 31/12/2018
	 */
	@Test(dataProvider = "SettingsUserManagementDashboard_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortDashboard, Author: Dishant Doshi")
	public void sortDashboard(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			settingsUserManagementDashboardWeb = homePage.clickOnSettingsUserManagementDashboard();
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
			verifyTrue(settingsUserManagementDashboardWeb.sortDashboard(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}

}
