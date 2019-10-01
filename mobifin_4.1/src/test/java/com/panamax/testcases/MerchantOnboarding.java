package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantOnboardingWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class MerchantOnboarding extends Common {
	HomeWeb homePage;
	MerchantOnboardingWeb merchantOnboardingWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author shivani.patel For Merchant - Onboarding - Add
	 * @creation date 12/11/2018
	 */
	@Test(dataProvider = "MerchantOnboarding_Add", dataProviderClass = TestDataImport.class, description = "Id: AddMerchantOnboarding, Author: Shivani Patel")
	public void addOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantOnboardingWeb = homePage.clickOnMerchantOnboarding();
			count++;
		}
		merchantOnboardingWeb.addOnboarding(map, getMapKeys(map));
		verifyTrue(merchantOnboardingWeb.verifyAddedOnboarding(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin compounder For Merchant - Onboarding - Edit
	 * @creation date 30/11/2018
	 */
	@Test(dataProvider = "MerchantOnboarding_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditMerchantOnboarding, Author: kutbuddin compounder")
	public void editOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantOnboardingWeb = homePage.clickOnMerchantOnboarding();
			count++;
		}
		merchantOnboardingWeb.editOnboarding(map, getMapKeys(map));
		verifyTrue(merchantOnboardingWeb.verifyEditedOnboarding(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Merchant - Onboarding - Delete
	 * @creation date 30/11/2018
	 */
	@Test(dataProvider = "MerchantOnboarding_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteOnboarding, Author: kutbuddin.compounder")
	public void deleteOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantOnboardingWeb = homePage.clickOnMerchantOnboarding();
			count++;
		}
		if (merchantOnboardingWeb.deleteOnboarding(map, getMapKeys(map)))
			verifyFalse(merchantOnboardingWeb.verifyOnboardingDelete(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Merchant - Onboarding - Sort
	 * @creation date 20/12/2018
	 */
	@Test(dataProvider = "MerchantOnboarding_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortOnboarding, Author: Dishant Doshi")
	public void sortOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantOnboardingWeb = homePage.clickOnMerchantOnboarding();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(merchantOnboardingWeb.sortOnboarding(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}

	/**
	 * @author kutbuddin.compounder For Merchant OnBoarding - Log
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "MerchantOnBoarding_Log", dataProviderClass = TestDataImport.class, description = "Id: LogMerchantOnBoarding, Author: kutbuddin.compounder")
	public void merchantOnboardingLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantOnboardingWeb = homePage.clickOnMerchantOnboarding();
			count++;
		}
		verifyTrue(merchantOnboardingWeb.verifyMerchantOnboardingLog(map, getMapKeys(map)));
	}
}
