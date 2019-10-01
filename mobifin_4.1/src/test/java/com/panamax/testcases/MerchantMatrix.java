package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.MerchantMatrixWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Merchant-Matrix - Edit
 * @creation date 21/11/2018
 */
public class MerchantMatrix extends Common {
	HomeWeb homePage;
	MerchantMatrixWeb merchantMatrixWeb;
	int count = 0;

	/**
	 * @author kutbuddin.compounder For Merchant-Matrix - Edit
	 * @creation date 21/11/2018
	 */
	@Test(dataProvider = "MerchantMatrix_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditMerchant Matrix, Author: kutbuddin.compounder")
	public void editMerchantMatrix(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantMatrixWeb = homePage.clickOnMerchantMatrix();
			count++;
		}
		merchantMatrixWeb.editMerchantMatrix(map, getMapKeys(map));
		verifyTrue(merchantMatrixWeb.verifyMerchantMatrixEdited(map, getMapKeys(map)));
		reloadCurrentPage();
	}

	/**
	 * @author dishant.doshi For Merchant - Matrix - Sort
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "MerchantMatrix_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortMatrix, Author: Dishant Doshi")
	public void sortMatrix(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			merchantMatrixWeb = homePage.clickOnMerchantMatrix();
			count++;
		}
		verifyTrue(merchantMatrixWeb.sortMatrix(map, getMapKeys(map)));
	}
}
