package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.EnterpriseThresholdInternalWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - Internal Products -
 *         EnterpriseThresholdInternal
 * @creation date 12/11/2018
 */
public class EnterpriseThresholdInternal extends Common {
	HomeWeb homePage;
	EnterpriseThresholdInternalWeb enterpriseThresholdInternalWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Enterprise Internal Threshold - Add
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "EnterpriseInternalThreshold_Add", dataProviderClass = TestDataImport.class, description = "Id: AddEnterpriseThresholdInternal, Author: kutbuddin.compounder")
	public void addEnterpriseThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdInternalWeb = homePage.clickOnEnterpriseThresholdInternal();
			count++;
		}
		enterpriseThresholdInternalWeb.addEnterpriseThresholdInternal(map, getMapKeys(map));
		verifyTrue(enterpriseThresholdInternalWeb.verifyEnterpriseThresholdInternalAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise Internal Threshold - Edit
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "EnterpriseInternalThreshold_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditEnterpriseThresholdInternal, Author: kutbuddin.compounder")
	public void editEnterpriseThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdInternalWeb = homePage.clickOnEnterpriseThresholdInternal();
			count++;
		}
		enterpriseThresholdInternalWeb.editEnterpriseThresholdInternal(map, getMapKeys(map));
		verifyTrue(enterpriseThresholdInternalWeb.verifyEnterpriseThresholdInternalEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise Internal Threshold - Delete
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "EnterpriseInternalThreshold_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteEnterpriseThresholdInternal, Author: kutbuddin.compounder")
	public void deleteEnterpriseThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdInternalWeb = homePage.clickOnEnterpriseThresholdInternal();
			count++;
		}
		if (enterpriseThresholdInternalWeb.deleteEnterpriseThresholdInternal(map, getMapKeys(map)))
			verifyFalse(enterpriseThresholdInternalWeb.verifyEnterpriseInternalThresholdDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise Internal Threshold - Log
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "EnterpriseInternalThreshold_Log", dataProviderClass = TestDataImport.class, description = "Id: LogEnterpriseThresholdInternal, Author: kutbuddin.compounder")
	public void enterpriseInternalThresholdLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdInternalWeb = homePage.clickOnEnterpriseThresholdInternal();
			count++;
		}
		verifyTrue(enterpriseThresholdInternalWeb.verifyEnterpriseInternalThresholdLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Enterprise - InternalThreshold - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "EnterpriseInternalThreshold_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortInternalThreshold, Author: dishant.doshi")
	public void sortInternalThreshold(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseThresholdInternalWeb = homePage.clickOnEnterpriseThresholdInternal();
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(enterpriseThresholdInternalWeb.sortInternalThreshold(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
