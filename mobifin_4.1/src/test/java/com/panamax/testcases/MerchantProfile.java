package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantProfileWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Merchant - Profile
 * @creation date 15/11/2018
 */
public class MerchantProfile extends Common {

	HomeWeb homePage;
	MerchantProfileWeb merchantProfileWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For Merchant - Profile - Add
	 * @creation date 15/11/2018
	 */
	@Test(dataProvider = "MerchantProfile_Add", dataProviderClass = TestDataImport.class, description = "Id: AddProfile, Author: Dishant Doshi")
	public void addProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantProfileWeb = homePage.clickOnMerchantProfile();
			count++;
		}
		merchantProfileWeb.addProfile(map, getMapKeys(map));
		verifyTrue(merchantProfileWeb.verifyProfileAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Merchant - Profile - Edit
	 * @creation date 15/11/2018
	 */
	@Test(dataProvider = "MerchantProfile_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditProfile, Author: Dishant Doshi")
	public void editProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantProfileWeb = homePage.clickOnMerchantProfile();
			count++;
		}
		merchantProfileWeb.editProfile(map, getMapKeys(map));
		verifyTrue(merchantProfileWeb.verifyProfileEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Merchant - Profile - Delete
	 * @creation date 15/11/2018
	 */
	@Test(dataProvider = "MerchantProfile_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteProfile, Author: Dishant Doshi")
	public void deleteProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantProfileWeb = homePage.clickOnMerchantProfile();
			count++;
		}
		if (merchantProfileWeb.deleteProfile(map, getMapKeys(map)))
			verifyFalse(merchantProfileWeb.verifyProfileDelete(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Merchnat - Profile - Edited Log
	 * @creation date 13/12/2018
	 */
	@Test(dataProvider = "MerchantProfile_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedProfileLog, Author: Kutbuddin Compounder")
	public void editedLogProfile(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			merchantProfileWeb = homePage.clickOnMerchantProfile();
			count++;
		}
		verifyTrue(merchantProfileWeb.verifyProfileEditLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Merchant - Profile - Sort
	 * @creation date 20/12/2018
	 */
	@Test(dataProvider = "MerchantProfile_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortProfile, Author: Dishant Doshi")
	public void sortProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantProfileWeb = homePage.clickOnMerchantProfile();
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
			verifyTrue(merchantProfileWeb.sortProfile(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
