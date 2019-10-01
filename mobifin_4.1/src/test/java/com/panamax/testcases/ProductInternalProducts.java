package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ProductInternalProductsWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - Internal Products - ProductInternal
 * @creation date 24/10/2018
 */
public class ProductInternalProducts extends Common {

	HomeWeb homePage;
	ProductInternalProductsWeb productInternalProductsWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For Internal Products - Add
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "ProductInternal_Add", dataProviderClass = TestDataImport.class, description = "Id: AddProductInternal, Author: kutbuddin.compounder")
	public void addInternalProduct(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productInternalProductsWeb = homePage.clickOnProductInternalProducts();
			count++;
		}
		productInternalProductsWeb.addInternalProduct(map, getMapKeys(map));
		verifyTrue(productInternalProductsWeb.verifyProductInternalAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Internal Products - Edit
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "ProductInternal_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditProductInternal, Author: kutbuddin.compounder")
	public void editProductInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productInternalProductsWeb = homePage.clickOnProductInternalProducts();
			count++;
		}
		productInternalProductsWeb.editProductInternal(map, getMapKeys(map));
		verifyTrue(productInternalProductsWeb.verifyProductInternalEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Internal Products - Delete
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "ProductInternal_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteProductInternal, Author: kutbuddin.compounder")
	public void deleteProductInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productInternalProductsWeb = homePage.clickOnProductInternalProducts();
			count++;
		}
		if (productInternalProductsWeb.deleteProductInternal(map, getMapKeys(map)))
			verifyFalse(productInternalProductsWeb.verifyProductInternalrDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For ProductInternal -Log
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "ProductInternal_Log", dataProviderClass = TestDataImport.class, description = "Id: LogProductInternal, Author: kutbuddin.compounder")
	public void logProductInternal(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			productInternalProductsWeb = homePage.clickOnProductInternalProducts();
			count++;
		}
		verifyTrue(productInternalProductsWeb.verifyProductInternalLog(map, getMapKeys(map)));
	}
	

	/**
	 * @author dishant.doshi For product product internal
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "ProductInternal_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortProductInternal, Author: Dishant Doshi")
	public void sortProductInternal(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productInternalProductsWeb = homePage.clickOnProductInternalProducts();
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
			verifyTrue(productInternalProductsWeb.sortProductInternal(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
