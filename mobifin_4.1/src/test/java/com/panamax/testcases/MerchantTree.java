package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantTreeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class MerchantTree extends Common {
	HomeWeb homePage;
	MerchantTreeWeb merchantTreeWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author shivani.patel For Merchant - Tree - Add
	 * @creation date 03/10/2018
	 */
	@Test(dataProvider = "MerchantTree_Add", dataProviderClass = TestDataImport.class, description = "Id: AddTree, Author: Shivani Patel")
	public void addTree(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantTreeWeb = homePage.clickOnMerchantTree();
			count++;
		}
		merchantTreeWeb.addTree(map, getMapKeys(map));
		verifyTrue(merchantTreeWeb.verifyTreeAdded(map, getMapKeys(map)));
	}

	/**
	 * @author shivani.patel For Merchant - Tree - Edit
	 * @creation date 04/10/2018
	 */
	@Test(dataProvider = "MerchantTree_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditTree, Author: shivani patel")
	public void editTree(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantTreeWeb = homePage.clickOnMerchantTree();
			count++;
		}
		merchantTreeWeb.editTree(map, getMapKeys(map));
		verifyTrue(merchantTreeWeb.verifyTreeEdited(map, getMapKeys(map)));
	}

	/**
	 * @author shivani.patel For Merchant - Tree - Delete
	 * @creation date 04/10/2018
	 */
	@Test(dataProvider = "MerchantTree_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteTree, Author: Shivani Patel")
	public void deleteTree(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantTreeWeb = homePage.clickOnMerchantTree();
			count++;
		}
		if (merchantTreeWeb.deleteTree(map, getMapKeys(map)))
			verifyFalse(merchantTreeWeb.verifyTreeDelete(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Merchnat - Tree - Log
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "MerchantTree_Log", dataProviderClass = TestDataImport.class, description = "Id: LogTree, Author: Shivani Patel")
	public void merchantTreeLog(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			merchantTreeWeb = homePage.clickOnMerchantTree();
			count++;
		}
		verifyTrue(merchantTreeWeb.verifyMerchnatTreeLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Merchant - Tree - Sort
	 * @creation date 20/12/2018
	 */
	@Test(dataProvider = "MerchantTree_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortTree, Author: Dishant Doshi")
	public void sortTree(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantTreeWeb = homePage.clickOnMerchantTree();
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
			verifyTrue(merchantTreeWeb.sortTree(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
