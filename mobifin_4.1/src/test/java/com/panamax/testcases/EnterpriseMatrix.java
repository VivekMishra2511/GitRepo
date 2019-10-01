package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.EnterpriseMatrixWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Enterprise-Matrix-Edit
 * @creation date 14/11/2018
 */
public class EnterpriseMatrix extends Common {
	HomeWeb homePage;
	EnterpriseMatrixWeb enterpriseMatrixWeb;
	int count = 0;

	/**
	 * @author kutbuddin.compounder For EnterPrise-Matrix - Edit
	 * @creation date 14/11/2018
	 */
	@Test(dataProvider = "EnterpriseMatrix_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditEnterprise Matrix, Author: kutbuddin.compounder")
	public void editEnterpriseMatrix(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseMatrixWeb = homePage.clickOnEnterpriseMatrix();
			count++;
		}
		enterpriseMatrixWeb.editEnterpriseMatrix(map, getMapKeys(map));
		verifyTrue(enterpriseMatrixWeb.verifyEnterpriseMatrixEdited(map, getMapKeys(map)));
		reloadCurrentPage();
	}

	/**
	 * @author dishant.doshi For Enterprise - Matrix - Sort
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "EnterpriseMatrix_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortMatrix, Author: Dishant Doshi")
	public void sortMatrix(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			enterpriseMatrixWeb = homePage.clickOnEnterpriseMatrix();
			count++;
		}
		verifyTrue(enterpriseMatrixWeb.sortMatrix(map, getMapKeys(map)));
	}
}
