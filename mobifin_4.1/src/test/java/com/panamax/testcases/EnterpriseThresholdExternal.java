package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.EnterpriseThresholdExternalWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - External Products -
 *         EnterpriseThresholdExternal
 * @creation date 12/11/2018
 */
public class EnterpriseThresholdExternal extends Common {
	HomeWeb homePage;
	EnterpriseThresholdExternalWeb enterpriseThresholdExternalWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Enterprise External Threshold - Add
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "EnterpriseExternalThreshold_Add", dataProviderClass = TestDataImport.class, description = "Id: AddEnterpriseThresholdExternal, Author: kutbuddin.compounder")
	public void addEnterpriseThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdExternalWeb = homePage.clickOnEnterpriseThresholdExternal();
			count++;
		}
		enterpriseThresholdExternalWeb.addEnterpriseThresholdExternal(map, getMapKeys(map));
		verifyTrue(enterpriseThresholdExternalWeb.verifyEnterpriseThresholdExternalAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise External Threshold - Edit
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "EnterpriseExternalThreshold_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditEnterpriseThresholdExternal, Author: kutbuddin.compounder")
	public void editEnterpriseThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdExternalWeb = homePage.clickOnEnterpriseThresholdExternal();
			count++;
		}
		enterpriseThresholdExternalWeb.editEnterpriseThresholdExternal(map, getMapKeys(map));
		verifyTrue(enterpriseThresholdExternalWeb.verifyEnterpriseThresholdExternalEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise External Threshold - Delete
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "EnterpriseExternalThreshold_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteEnterpriseThresholdExternal, Author: kutbuddin.compounder")
	public void deleteEnterpriseThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdExternalWeb = homePage.clickOnEnterpriseThresholdExternal();
			count++;
		}
		if (enterpriseThresholdExternalWeb.deleteEnterpriseThresholdExternal(map, getMapKeys(map)))
			verifyFalse(enterpriseThresholdExternalWeb.verifyEnterpriseExternalThresholdDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise External Threshold - Log
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "EnterpriseExternalThreshold_Log", dataProviderClass = TestDataImport.class, description = "Id: LogEnterpriseThresholdExternal, Author: kutbuddin.compounder")
	public void enterpriseExternalThresholdLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdExternalWeb = homePage.clickOnEnterpriseThresholdExternal();
			count++;
		}
		verifyTrue(enterpriseThresholdExternalWeb.verifyEnterpriseExternalThresholdLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Enterprise - ExternalThreshold - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "EnterpriseExternalThreshold_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortExternalThreshold, Author: dishant.doshi")
	public void sortExternalThreshold(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdExternalWeb = homePage.clickOnEnterpriseThresholdExternal();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(enterpriseThresholdExternalWeb.sortExternalThreshold(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
