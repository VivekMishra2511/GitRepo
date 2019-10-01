package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
//import com.panamax.base.TABankWeb;
import com.panamax.base.TAUserWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class TAUser extends Common {
	HomeWeb homePage;
	TAUserWeb taUserWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author Dishant Doshi For TA - TA Bank - Add
	 * @creation date 01/11/2018
	 */
	@Test(dataProvider = "TAUser_Add", dataProviderClass = TestDataImport.class, description = "Id: AddUser, Author: Dishant Doshi")
	public void addTAUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taUserWeb = homePage.clickOnTrustAccountTAUser();
			count++;
		}
		taUserWeb.addTAUser(map, getMapKeys(map));
		verifyTrue(taUserWeb.verifyTAUser(map, getMapKeys(map)));
	}

	/**
	 * @author Dishant Doshi For TA - TA Bank - Edit
	 * @creation date 01/11/2018
	 */
	@Test(dataProvider = "TAUser_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditUser, Author: Dishant Doshi")
	public void editTAUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taUserWeb = homePage.clickOnTrustAccountTAUser();
			count++;
		}
		taUserWeb.editTAUser(map, getMapKeys(map));
		verifyTrue(taUserWeb.verifyEditTAUser(map, getMapKeys(map)));
	}

	/**
	 * @author Dishant Doshi For TA - TA Bank - Delete
	 * @creation date 30/10/2018
	 */

	@Test(dataProvider = "TAUser_Delete", dataProviderClass = TestDataImport.class, description = "Id: Delete User, Author: Dishant Doshi")
	public void deleteTAUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taUserWeb = homePage.clickOnTrustAccountTAUser();
			count++;
		}

		if (taUserWeb.deleteTAUser(map, getMapKeys(map)))
			verifyFalse(taUserWeb.verifyDelete(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For TA - User - Log
	 * @creation date 21/12/2018
	 */
	@Test(dataProvider = "TAUser_Log", dataProviderClass = TestDataImport.class, description = "Id: LogUser, Author: kutbuddin.compounder")
	public void logTAUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taUserWeb = homePage.clickOnTrustAccountTAUser();
			count++;
		}
		verifyTrue(taUserWeb.verifyTAUserLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For TA - user - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "TAUser_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortUser, Author: Dishant Doshi")
	public void sortTAUser(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taUserWeb = homePage.clickOnTrustAccountTAUser();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(taUserWeb.sortUser(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
