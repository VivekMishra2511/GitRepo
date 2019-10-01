package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerThresholdExternalWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - External Products -
 *         CustomerThresholdExternal
 * @creation date 24/10/2018
 */
public class CustomerThresholdExternal extends Common {
	HomeWeb homePage;
	CustomerThresholdExternalWeb customerThresholdExternalWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Customer External Threshold - Add
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "CustomerExternalThreshold_Add", dataProviderClass = TestDataImport.class, description = "Id: AddCustomerThresholdExternal, Author: kutbuddin.compounder")
	public void addCustomerThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdExternalWeb = homePage.clickOnCustomerThresholdExternal();
			count++;
		}
		customerThresholdExternalWeb.addCustomerThresholdExternal(map, getMapKeys(map));
		verifyTrue(customerThresholdExternalWeb.verifyCustomerThresholdExternalAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Customer External Threshold - Edit
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "CustomerExternalThreshold_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditCustomerThresholdExternal, Author: kutbuddin.compounder")
	public void editCustomerThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdExternalWeb = homePage.clickOnCustomerThresholdExternal();
			count++;
		}
		customerThresholdExternalWeb.editCustomerThresholdExternal(map, getMapKeys(map));
		verifyTrue(customerThresholdExternalWeb.verifyCustomerThresholdExternalEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Customer External Threshold - Delete
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "CustomerExternalThreshold_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteCustomerThresholdExternal, Author: kutbuddin.compounder")
	public void deleteCustomerThresholdExternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdExternalWeb = homePage.clickOnCustomerThresholdExternal();
			count++;
		}
		if (customerThresholdExternalWeb.deleteCustomerThresholdExternal(map, getMapKeys(map)))
			verifyFalse(customerThresholdExternalWeb.verifyCustomerExternalThresholdDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Customer External Threshold - Log
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "CustomerExternalThreshold_Log", dataProviderClass = TestDataImport.class, description = "Id: LogCustomerThresholdExternal, Author: kutbuddin.compounder")
	public void customerExternalThresholdLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdExternalWeb = homePage.clickOnCustomerThresholdExternal();
			count++;
		}
		verifyTrue(customerThresholdExternalWeb.verifyCustomerExternalThresholdLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Customer - ExternalThreshold - Sort
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "CustomerExternalThreshold_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortExternalThreshold, Author: dishant.doshi")
	public void sortExternalThreshold(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdExternalWeb = homePage.clickOnCustomerThresholdExternal();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(customerThresholdExternalWeb.sortExternalThreshold(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
