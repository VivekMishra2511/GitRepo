package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.EnterpriseOnboardingWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class EnterpriseOnboarding extends Common {
	HomeWeb homePage;
	EnterpriseOnboardingWeb enterpriseOnboardingWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author shivani.patel For Enterprise - Onboarding - Add
	 * @creation date 20/11/2018
	 */
	@Test(dataProvider = "EnterpriseOnboarding_Add", dataProviderClass = TestDataImport.class, description = "Id: AddEnterpriseOnboarding, Author: Shivani Patel")
	public void addOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingWeb = homePage.clickOnEnterpriseOnboarding();
			count++;
		}

		enterpriseOnboardingWeb.addOnboarding(map, getMapKeys(map));
		verifyTrue(enterpriseOnboardingWeb.verifyAddedOnboarding(map, getMapKeys(map)));

	}

	/**
	 * @author shivani.patel For Enterprise - Onboarding - Edit
	 * @creation date 20/11/2018
	 */
	@Test(dataProvider = "EnterpriseOnboarding_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditEnterpriseOnboarding, Author: Shivani Patel")
	public void editOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingWeb = homePage.clickOnEnterpriseOnboarding();
			count++;
		}

		enterpriseOnboardingWeb.editOnboarding(map, getMapKeys(map));
		verifyTrue(enterpriseOnboardingWeb.verifyEditedOnboarding(map, getMapKeys(map)));

	}

	/**
	 * @author shivani.patel For Enterprise - Onboarding - Delete
	 * @creation date 20/11/2018
	 */
	@Test(dataProvider = "EnterpriseOnboarding_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteEnterpriseOnboarding, Author: Shivani Patel")
	public void deleteOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingWeb = homePage.clickOnEnterpriseOnboarding();
			count++;
		}
		if(enterpriseOnboardingWeb.deleteOnboarding(map, getMapKeys(map)))
		   verifyFalse(enterpriseOnboardingWeb.verifydeletedOnboarding(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Enterprise OnBoarding - Log
	 * @creation date 18/12/2018
	 */
	@Test(dataProvider = "EnterpriseOnBoarding_Log", dataProviderClass = TestDataImport.class, description = "Id: LogEnterpriseOnBoarding, Author: kutbuddin.compounder")
	public void enterpriseOnboardingLog(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			enterpriseOnboardingWeb = homePage.clickOnEnterpriseOnboarding();
			count++;
		}
		verifyTrue(enterpriseOnboardingWeb.verifyEnterpriseOnboardingLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Enterprise - Onboarding - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "EnterpriseOnboarding_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortOnboarding, Author: Dishant Doshi")
	public void sortOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingWeb = homePage.clickOnEnterpriseOnboarding();
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
			verifyTrue(enterpriseOnboardingWeb.sortOnboarding(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
