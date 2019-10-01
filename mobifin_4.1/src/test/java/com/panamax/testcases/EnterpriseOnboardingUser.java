package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.EnterpriseOnboardingUserWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class EnterpriseOnboardingUser extends Common {
	HomeWeb homePage;
	EnterpriseOnboardingUserWeb enterpriseOnboardingUserWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Enterprise - OnboardingUser - Add
	 * @creation date 28/11/2018
	 */
	@Test(dataProvider = "EnterpriseOnboardingUser_Add", dataProviderClass = TestDataImport.class, description = "Id: AddEnterpriseOnboardingUser, Author: Shivani Patel")
	public void addOnboardingUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingUserWeb = homePage.clickOnEnterpriseOnboardingUser();
			count++;
		}
		enterpriseOnboardingUserWeb.addOnboardingUser(map, getMapKeys(map));
		verifyTrue(enterpriseOnboardingUserWeb.verifyAddedOnboardingUser(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise - OnboardingUser - Edit
	 * @creation date 28/11/2018
	 */
	@Test(dataProvider = "EnterpriseOnboardingUser_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditEnterpriseOnboardingUser, Author: Shivani Patel")
	public void editOnboardingUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingUserWeb = homePage.clickOnEnterpriseOnboardingUser();
			count++;
		}
		enterpriseOnboardingUserWeb.editOnboardingUser(map, getMapKeys(map));
		verifyTrue(enterpriseOnboardingUserWeb.verifyEditedOnboardingUser(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise - OnboardingUser - Delete
	 * @creation date 28/11/2018
	 */
	@Test(dataProvider = "EnterpriseOnboardingUser_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteEnterpriseOnboardingUser, Author: Shivani Patel")
	public void deleteOnboardingUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingUserWeb = homePage.clickOnEnterpriseOnboardingUser();
			count++;
		}
		if (enterpriseOnboardingUserWeb.deleteOnboardingUser(map, getMapKeys(map)))
			verifyFalse(enterpriseOnboardingUserWeb.verifydeletedOnboardingUser(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Enterprise OnBoardingUser - Log
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "EnterpriseOnBoardingUser_Log", dataProviderClass = TestDataImport.class, description = "Id: LogEnterpriseOnBoardingUser, Author: kutbuddin.compounder")
	public void enterpriseOnboardingUserLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingUserWeb = homePage.clickOnEnterpriseOnboardingUser();
			count++;
		}
		verifyTrue(enterpriseOnboardingUserWeb.verifyEnterpriseOnBoardingUserLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Enterprise - Onboarding User - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "EnterpriseOnboardingUser_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortOnboardingUser, Author: Dishant Doshi")
	public void sortOnboardingUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseOnboardingUserWeb = homePage.clickOnEnterpriseOnboardingUser();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(enterpriseOnboardingUserWeb.sortOnboardingUser(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
