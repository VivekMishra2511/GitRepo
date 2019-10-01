package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.MerchantTerminalOnboardingWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Merchant-TerminalOnboarding
 * @creation date 30/11/2018
 */
public class MerchantTerminalOnboarding extends Common {

	HomeWeb homePage;
	MerchantTerminalOnboardingWeb merchantTerminalOnboardingWeb;
	int count = 0;

	/**
	 * @author dishant.doshi ForMerchant-TerminalOnboarding - Add
	 * @creation date 30/11/2018
	 */
	@Test(dataProvider = "MerchantTerminalOnboarding_Add", dataProviderClass = TestDataImport.class, description = "Id: AddTerminalOnboarding, Author: kutbuddin Compounder")
	public void addTerminalOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantTerminalOnboardingWeb = homePage.clickOnMerchantTerminalOnboarding();
			count++;
		}
		if (merchantTerminalOnboardingWeb.addTerminalOnboarding(map, getMapKeys(map)))
			verifyTrue(merchantTerminalOnboardingWeb.verifyTerminalOnboardingAdded(map, getMapKeys(map)));
		else
			verifyFalse(true);
	}

	/**
	 * @author dishant.doshi ForMerchant-TerminalOnboarding - Edit
	 * @creation date 30/11/2018
	 */
	@Test(dataProvider = "MerchantTerminalOnboarding_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditTerminalOnboarding, Author: kutbuddin Compounder")
	public void editTerminalOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantTerminalOnboardingWeb = homePage.clickOnMerchantTerminalOnboarding();
			count++;
		}
		merchantTerminalOnboardingWeb.editTerminalOnboarding(map, getMapKeys(map));
		verifyTrue(merchantTerminalOnboardingWeb.verifyTerminalOnboardingEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi ForMerchant-TerminalOnboarding - Delete
	 * @creation date 30/11/2018
	 */
	@Test(dataProvider = "MerchantTerminalOnboarding_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteTerminalOnboarding, Author: kutbuddin Compounder")
	public void deleteTerminalOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantTerminalOnboardingWeb = homePage.clickOnMerchantTerminalOnboarding();
			count++;
		}
		if (merchantTerminalOnboardingWeb.deleteTerminalOnboarding(map, getMapKeys(map)))
			verifyFalse(merchantTerminalOnboardingWeb.verifyTerminalOnboardingDelete(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Merchant - TerminalOnboarding - Sort
	 * @creation date 20/12/2018
	 */
	@Test(dataProvider = "MerchantTerminalOnboarding_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortTerminalOnboarding, Author: Dishant Doshi")
	public void sortTerminalOnboarding(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantTerminalOnboardingWeb = homePage.clickOnMerchantTerminalOnboarding();
			count++;
		}
		verifyTrue(merchantTerminalOnboardingWeb.sortTerminalOnboarding(map, getMapKeys(map)));
	}
}
