package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.EnterpriseProfileWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Enterprise - Profile
 * @creation date 16/11/2018
 */
public class EnterpriseProfile extends Common {

	HomeWeb homePage;
	EnterpriseProfileWeb enterpriseProfileWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author dishant.doshi For Enterprise - Profile - Add
	 * @creation date 16/11/2018
	 */
	@Test(dataProvider = "EnterpriseProfile_Add", dataProviderClass = TestDataImport.class, description = "Id: AddProfile, Author: Dishant Doshi")
	public void addProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseProfileWeb = homePage.clickOnEnterpriseProfile();
			count++;
		}
		enterpriseProfileWeb.addProfile(map, getMapKeys(map));
		verifyTrue(enterpriseProfileWeb.verifyProfileAdded(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Enterprise - Profile - Edit
	 * @creation date 16/11/2018
	 */
	@Test(dataProvider = "EnterpriseProfile_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditProfile, Author: Dishant Doshi")
	public void editProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseProfileWeb = homePage.clickOnEnterpriseProfile();
			count++;
		}
		enterpriseProfileWeb.editProfile(map, getMapKeys(map));
		verifyTrue(enterpriseProfileWeb.verifyProfileEdited(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Enterprise - Profile - Delete
	 * @creation date 16/11/2018
	 */
	@Test(dataProvider = "EnterpriseProfile_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteProfile, Author: Dishant Doshi")
	public void deleteProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseProfileWeb = homePage.clickOnEnterpriseProfile();
			count++;
		}
		if (enterpriseProfileWeb.deleteProfile(map, getMapKeys(map)))
			verifyFalse(enterpriseProfileWeb.verifyProfileDelete(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Enterprise - Profile - Edited Log
	 * @creation date 13/12/2018
	 */
	@Test(dataProvider = "EnterpriseProfile_Log", dataProviderClass = TestDataImport.class, description = "Id: EditedProfileLog, Author: Kutbuddin Compounder")
	public void editedLogProfile(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			enterpriseProfileWeb = homePage.clickOnEnterpriseProfile();
			count++;
		}
		verifyTrue(enterpriseProfileWeb.verifyProfileEditLog(map, getMapKeys(map)));
	}
	

	/**
	 * @author dishant.doshi For Enterprise - Profile - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "EnterpriseProfile_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortProfile, Author: Dishant Doshi")
	public void sortProfile(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseProfileWeb = homePage.clickOnEnterpriseProfile();
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
			verifyTrue(enterpriseProfileWeb.sortProfile(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
