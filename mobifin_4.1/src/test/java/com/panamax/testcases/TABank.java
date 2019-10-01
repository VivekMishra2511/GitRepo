package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.TABankWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class TABank extends Common {
	HomeWeb homePage;
	TABankWeb taBankWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author Dishant Doshi For TA - TA Bank - Add
	 * @creation date 30/10/2018
	 */
	@Test(dataProvider = "TABank_Add", dataProviderClass = TestDataImport.class, description = "Id: AddBank, Author: Dishant Doshi")
	public void addTABank(Map<Object, Object> map) {

		if (count == 0) {
			homePage = goToHome();
			taBankWeb = homePage.clickOnTrustAccountTABank();
			count++;
		}
		taBankWeb.addTABank(map, getMapKeys(map));
		verifyTrue(taBankWeb.verifyTABank(map, getMapKeys(map)));
	}

	/**
	 * @author Dishant Doshi For TA - TA Bank - Add
	 * @creation date 30/10/2018
	 */

	@Test(dataProvider = "TABank_Edit", dataProviderClass = TestDataImport.class, description = "Id: AddBank, Author: Dishant Doshi")
	public void editTABank(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taBankWeb = homePage.clickOnTrustAccountTABank();
			count++;
		}
		taBankWeb.editTABank(map, getMapKeys(map));
		verifyTrue(taBankWeb.verifyTABankEdited(map, getMapKeys(map)));
	}

	/**
	 * @author Dishant Doshi For TA - TA Bank - Add
	 * @creation date 30/10/2018
	 */

	@Test(dataProvider = "TABank_Delete", dataProviderClass = TestDataImport.class, description = "Id: AddBank, Author: Dishant Doshi")
	public void deleteTABank(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taBankWeb = homePage.clickOnTrustAccountTABank();
			count++;
		}
		if (taBankWeb.deleteTABank(map, getMapKeys(map)))
			verifyFalse(taBankWeb.verifyTABankDelete(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For TA - Bank - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "TABank_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortBank, Author: Dishant Doshi")
	public void sortBank(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taBankWeb = homePage.clickOnTrustAccountTABank();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(taBankWeb.sortBank(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}

	/**
	 * @author kutbuddin.compounder For TA - Bank - Log
	 * @creation date 21/12/2018
	 */
	@Test(dataProvider = "TABank_Log", dataProviderClass = TestDataImport.class, description = "Id: LogBank, Author: kutbuddin.compounder")
	public void taBanklog(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			taBankWeb = homePage.clickOnTrustAccountTABank();
			count++;
		}
		verifyTrue(taBankWeb.verifyTABankLog(map, getMapKeys(map)));
	}
}
