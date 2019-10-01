package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ProductExternalProductsOperatorWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Product - External Products - Vendor
 * @creation date 01/10/2018
 */
public class ProductExternalProductsOperator extends Common {

	HomeWeb homePage;
	ProductExternalProductsOperatorWeb productExternalProductsOperatorWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For External Products - Operator - Add
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "ProductsExternalProductsOperator_Add", dataProviderClass = TestDataImport.class, description = "Id: AddOperator, Author: kutbuddin.compounder")
	public void addOperator(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalProductsOperatorWeb = homePage.clickOnProductsExternalProductsOperator();
			count++;
		}

		productExternalProductsOperatorWeb.addOperator(map, getMapKeys(map));
		verifyTrue(productExternalProductsOperatorWeb.verifyOperatorAdded(map, getMapKeys(map)));

	}

	/**
	 * @author kutbuddin.compounder For External Products - Operator - Edit
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "ProductsExternalProductsOperator_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditOperator, Author: kutbuddin.compounder")
	public void editOperator(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalProductsOperatorWeb = homePage.clickOnProductsExternalProductsOperator();
			count++;
		}

		productExternalProductsOperatorWeb.editOperator(map, getMapKeys(map));
		verifyTrue(productExternalProductsOperatorWeb.verifyOperatorEdited(map, getMapKeys(map)));

	}

	/**
	 * @author kutbuddin.compounder For External Products - Operator - Delete
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "ProductsExternalProductsOperator_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteOperator, Author: kutbuddin.compounder")
	public void deleteOperator(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalProductsOperatorWeb = homePage.clickOnProductsExternalProductsOperator();
			count++;
		}
		if (productExternalProductsOperatorWeb.deleteOperator(map, getMapKeys(map)))
			verifyFalse(productExternalProductsOperatorWeb.verifyProductExternalOperatorDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For External Products - Vendor Operator - Log
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "ProductsExternalProductsOperator_Log", dataProviderClass = TestDataImport.class, description = "Id: LogVendorOperator, Author: kutbuddin.compounder")
	public void logOperator(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			productExternalProductsOperatorWeb = homePage.clickOnProductsExternalProductsOperator();
			count++;
		}
		verifyTrue(productExternalProductsOperatorWeb.verifyVendorOperatorLog(map, getMapKeys(map)));
	}
	

	/**
	 * @author dishant.doshi For External Products - Operator - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "ProductsExternalProductsOperator_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortOperator, Author: Dishant Doshi")
	public void sortOperator(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalProductsOperatorWeb = homePage.clickOnProductsExternalProductsOperator();
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
			verifyTrue(productExternalProductsOperatorWeb.sortProductInternal(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
