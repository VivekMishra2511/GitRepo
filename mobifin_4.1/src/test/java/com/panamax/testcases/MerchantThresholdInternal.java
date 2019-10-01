package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantThresholdInternalWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - Internal Products -
 *         MerchantThresholdInternal
 * @creation date 13/11/2018
 */
public class MerchantThresholdInternal extends Common {
	HomeWeb homePage;
	MerchantThresholdInternalWeb merchantThresholdInternalWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Merchant Internal Threshold - Add
	 * @creation date 13/11/2018
	 */
	@Test(dataProvider = "MerchantInternalThreshold_Add", dataProviderClass = TestDataImport.class, description = "Id: AddMerchantThresholdInternal, Author: kutbuddin.compounder")
	public void addMerchantThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantThresholdInternalWeb = homePage.clickOnMerchantThresholdInternal();
			count++;
		}
		merchantThresholdInternalWeb.addMerchantThresholdInternal(map, getMapKeys(map));
		verifyTrue(merchantThresholdInternalWeb.verifyMerchantThresholdInternalAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Merchant Internal Threshold - Edit
	 * @creation date 13/11/2018
	 */
	@Test(dataProvider = "MerchantInternalThreshold_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditMerchantThresholdInternal, Author: kutbuddin.compounder")
	public void editMerchantThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantThresholdInternalWeb = homePage.clickOnMerchantThresholdInternal();
			count++;
		}
		merchantThresholdInternalWeb.editMerchantThresholdInternal(map, getMapKeys(map));
		verifyTrue(merchantThresholdInternalWeb.verifyMerchantThresholdInternalEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Merchant Internal Threshold - Delete
	 * @creation date 13/11/2018
	 */
	@Test(dataProvider = "MerchantInternalThreshold_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteMerchantThresholdInternal, Author: kutbuddin.compounder")
	public void deleteMerchantThresholdInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantThresholdInternalWeb = homePage.clickOnMerchantThresholdInternal();
			count++;
		}
		if (merchantThresholdInternalWeb.deleteMerchantThresholdInternal(map, getMapKeys(map)))
			verifyFalse(merchantThresholdInternalWeb.verifyMerchantInternalThresholdDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Merchant Internal Threshold - Log
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "MerchantInternalThreshold_Log", dataProviderClass = TestDataImport.class, description = "Id: LogMerchantThresholdInternal, Author: kutbuddin.compounder")
	public void merchantInternalThresholdLog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantThresholdInternalWeb = homePage.clickOnMerchantThresholdInternal();
			count++;
		}
		verifyTrue(merchantThresholdInternalWeb.verifyMerchantInternalThresholdLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Merchant - InternalThreshold - Sort
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "MerchantInternalThreshold_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortInternalThreshold, Author: dishant.doshi")
	public void sortInternalThreshold(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantThresholdInternalWeb = homePage.clickOnMerchantThresholdInternal();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(merchantThresholdInternalWeb.sortInternalThreshold(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
