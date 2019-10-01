package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerProfileUpdateWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Customer - ProfileUpdate
 * @creation date 19/11/2018
 */
public class CustomerProfileUpdate extends Common {

	HomeWeb homePage;
	CustomerProfileUpdateWeb customerProfileUpdateWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For Customer - ProfileUpdate - Add
	 * @creation date 23/11/2018
	 */
	@Test(dataProvider = "CustomerProfileUpdate", dataProviderClass = TestDataImport.class, description = "Id: ProfileUpdate, Author: Dishant Doshi")
	public void profileUpdate(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerProfileUpdateWeb = homePage.clickOnCustomerProfileUpdate();
			count++;
		}
		if (customerProfileUpdateWeb.profileUpdate(map, getMapKeys(map)))
			verifyTrue(customerProfileUpdateWeb.verifyProfileUpdated(map, getMapKeys(map)));
		else
			verifyFalse(true);
	}
	
	/**
	 * @author dishant.doshi For Customer - Profile Update - Sort
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "CustomerProfileUpdate_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortProfileUpdate, Author: Dishant Doshi")
	public void sortProfileUpdate(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerProfileUpdateWeb = homePage.clickOnCustomerProfileUpdate();
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
			verifyTrue(customerProfileUpdateWeb.sortProfileUpdate(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
