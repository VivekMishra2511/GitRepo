package com.panamax.testcases;

import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.CustomerMatrixWeb;
import com.panamax.base.HomeWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Customer-Matrix - Edit
 * @creation date 14/11/2018
 */
public class CustomerMatrix extends Common {
	HomeWeb homePage;
	CustomerMatrixWeb customerMatrixWeb;
	int count = 0;

	/**
	 * @author kutbuddin.compounder For Customer-Matrix - Edit
	 * @creation date 14/11/2018
	 */
	@Test(dataProvider = "CustomerMatrix_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditCustomer Matrix, Author: kutbuddin.compounder")
	public void editCustomerMatrix(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerMatrixWeb = homePage.clickOnCustomerMatrix();
			count++;
		}
		customerMatrixWeb.editCustomerMatrix(map, getMapKeys(map));
		verifyTrue(customerMatrixWeb.verifyCustomerMatrixEdited(map, getMapKeys(map)));
		reloadCurrentPage();
	}

	/**
	 * @author dishant.doshi For Customer - Matrix - Sort
	 * @creation date 14/12/2018
	 */
	@Test(dataProvider = "CustomerMatrix_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortMatrix, Author: Dishant Doshi")
	public void sortMatrix(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			customerMatrixWeb = homePage.clickOnCustomerMatrix();
			count++;
		}
		verifyTrue(customerMatrixWeb.sortMatrix(map, getMapKeys(map)));
	}
}
