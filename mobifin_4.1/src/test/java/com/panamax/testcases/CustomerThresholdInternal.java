package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerThresholdInternalWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - Internal Products -
 *         CustomerThresholdInternal
 * @creation date 24/10/2018
 */
public class CustomerThresholdInternal extends Common {
	HomeWeb homePage;
	CustomerThresholdInternalWeb customerThresholdInternalWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Customer Internal Threshold - Add
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "CustomerInternalThreshold_Add", dataProviderClass = TestDataImport.class, description = "Id: AddCustomerThresholdInternal, Author: kutbuddin.compounder")
	public void addCustomerThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdInternalWeb = homePage.clickOnCustomerThresholdInternal();
			count++;
		}
		customerThresholdInternalWeb.addCustomerThresholdInternal(map, getMapKeys(map));
		verifyTrue(customerThresholdInternalWeb.verifyCustomerThresholdInternalAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Customer Internal Threshold - Edit
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "CustomerInternalThreshold_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditCustomerThresholdInternal, Author: kutbuddin.compounder")
	public void editCustomerThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdInternalWeb = homePage.clickOnCustomerThresholdInternal();
			count++;
		}
		customerThresholdInternalWeb.editCustomerThresholdInternal(map, getMapKeys(map));
		verifyTrue(customerThresholdInternalWeb.verifyCustomerThresholdInternalEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Customer Internal Threshold - Delete
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "CustomerInternalThreshold_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteCustomerThresholdInternal, Author: kutbuddin.compounder")
	public void deleteCustomerThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdInternalWeb = homePage.clickOnCustomerThresholdInternal();
			count++;
		}
		if (customerThresholdInternalWeb.deleteCustomerThresholdInternal(map, getMapKeys(map)))
			verifyFalse(customerThresholdInternalWeb.verifyCustomerInternalThresholdDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Customer Internal Threshold - Log
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "CustomerInternalThreshold_Log", dataProviderClass = TestDataImport.class, description = "Id: LogCustomerThresholdInternal, Author: kutbuddin.compounder")
	public void customerInternalThresholdLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdInternalWeb = homePage.clickOnCustomerThresholdInternal();
			count++;
		}
		verifyTrue(customerThresholdInternalWeb.verifyCustomerInternalThresholdLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Customer - InternalThreshold - Sort
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "CustomerInternalThreshold_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortInternalThreshold, Author: dishant.doshi")
	public void sortInternalThreshold(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerThresholdInternalWeb = homePage.clickOnCustomerThresholdInternal();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(customerThresholdInternalWeb.sortInternalThreshold(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
