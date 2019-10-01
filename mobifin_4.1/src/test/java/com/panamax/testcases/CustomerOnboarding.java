package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerOnboardingWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class CustomerOnboarding extends Common {
	HomeWeb homePage;
	CustomerOnboardingWeb customerOnboardingWeb;
	int count = 0;
	int sortCounter=0;

	/**
	 * @author kutbuddin.compounder For Customer - Onboarding - Add
	 * @creation date 16/11/2018
	 */
	@Test(dataProvider = "CustomerOnboarding_Add", dataProviderClass = TestDataImport.class, description = "Id: AddCustomerOnboarding, Author: Shivani Patel")
	public void addOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerOnboardingWeb = homePage.clickOnCustomerOnboarding();
			count++;
		}
		customerOnboardingWeb.addOnboarding(map, getMapKeys(map));
		verifyTrue(customerOnboardingWeb.verifyAddedOnboarding(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Customer - Onboarding - Edit
	 * @creation date 26/11/2018
	 */
	@Test(dataProvider = "CustomerOnboarding_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditAgentOnboarding, Author: Shivani Patel")
	public void editOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerOnboardingWeb = homePage.clickOnCustomerOnboarding();
			count++;
		}
		customerOnboardingWeb.editOnboarding(map, getMapKeys(map));
		verifyTrue(customerOnboardingWeb.verifyEditedOnboarding(map, getMapKeys(map)));
	}

	/**
	 * @author Shivani Patel For Customer - Onboarding - Delete
	 * @creation date 27/11/2018
	 */
	@Test(dataProvider = "CustomerOnboarding_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteOnboarding, Author: Shivani Patel")
	public void deleteOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerOnboardingWeb = homePage.clickOnCustomerOnboarding();
			count++;
		}
		if (customerOnboardingWeb.deleteOnboarding(map, getMapKeys(map)))
			verifyFalse(customerOnboardingWeb.verifyOnboardingDelete(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Customer - Onboarding - Sort
	 * @creation date 15/12/2018
	 */
	@Test(dataProvider = "CustomerOnboarding_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortOnboarding, Author: Dishant Doshi")
	public void sortOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerOnboardingWeb = homePage.clickOnCustomerOnboarding();
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
			verifyTrue(customerOnboardingWeb.sortOnboarding(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
	/**
	 * @author kutbuddin.compounder
	 * For Customer OnBoarding - Log
	 * @creation date 18/12/2018
	 */
	@Test(dataProvider = "CustomerOnBoarding_Log", dataProviderClass = TestDataImport.class, description = "Id: LogCustomerOnBoarding, Author: kutbuddin.compounder")
	public void customerOnboardingLog(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			customerOnboardingWeb = homePage.clickOnCustomerOnboarding();
			count++;
		}
		verifyTrue(customerOnboardingWeb.verifyCustomerOnboardingLog(map, getMapKeys(map)));
	}
}
