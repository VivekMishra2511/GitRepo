package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerProfileWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Customer - Profile
 * @creation date 19/11/2018
 */
public class CustomerProfile extends Common {

	HomeWeb homePage;
	CustomerProfileWeb customerProfileWeb;
	int count = 0;
	int sortCounter=0;

	/**
	 * @author dishant.doshi For Customer - Profile - Add
	 * @creation date 19/11/2018
	 */
	@Test(dataProvider = "CustomerProfile_Add", dataProviderClass = TestDataImport.class, description = "Id: AddProfile, Author: Dishant Doshi")
	public void addProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerProfileWeb = homePage.clickOnCustomerProfile();
			count++;
		}
		customerProfileWeb.addProfile(map, getMapKeys(map));
		verifyTrue(customerProfileWeb.verifyProfileAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Customer - Profile - Edit
	 * @creation date 19/11/2018
	 */
	@Test(dataProvider = "CustomerProfile_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditProfile, Author: Dishant Doshi")
	public void editProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerProfileWeb = homePage.clickOnCustomerProfile();
			count++;
		}
		customerProfileWeb.editProfile(map, getMapKeys(map));
		verifyTrue(customerProfileWeb.verifyProfileEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Customer - Profile - Delete
	 * @creation date 19/11/2018
	 */
	@Test(dataProvider = "CustomerProfile_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteProfile, Author: Dishant Doshi")
	public void deleteProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerProfileWeb = homePage.clickOnCustomerProfile();
			count++;
		}
		if (customerProfileWeb.deleteProfile(map, getMapKeys(map)))
			verifyFalse(customerProfileWeb.verifyProfileDelete(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Customer - Profile - Edited Log
	 * @creation date 13/12/2018
	 */
	@Test(dataProvider = "CustomerProfile_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedProfileLog, Author: Kutbuddin Compounder")
	public void editedLogProfile(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			customerProfileWeb = homePage.clickOnCustomerProfile();
			count++;
		}
		verifyTrue(customerProfileWeb.verifyProfileEditLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Customer - Profile - Sort
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "CustomerProfile_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortProfile, Author: Dishant Doshi")
	public void sortProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerProfileWeb = homePage.clickOnCustomerProfile();
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
			verifyTrue(customerProfileWeb.sortProfile(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
