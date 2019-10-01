package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ProductExternalProductManagerWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - External Products - ProductManager
 * @creation date 24/10/2018
 */
public class ProductExternalProductManager extends Common {
	HomeWeb homePage;
	ProductExternalProductManagerWeb productExternalProductManagerWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For External Products - Product Manager -
	 *         Add
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "ProductsExternalProductManager_Add", dataProviderClass = TestDataImport.class, description = "Id: AddProductManager, Author: kutbuddin.compounder")
	public void addProductManager(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalProductManagerWeb = homePage.clickOnProductsExternalProductManager();
			count++;
		}

		productExternalProductManagerWeb.addProductManager(map, getMapKeys(map));
		verifyTrue(productExternalProductManagerWeb.verifyProductManagerAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For External Products - Product Manager -
	 *         Edit
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "ProductsExternalProductManager_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditProductManager, Author: kutbuddin.compounder")
	public void editProductManager(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalProductManagerWeb = homePage.clickOnProductsExternalProductManager();
			count++;

		}

		productExternalProductManagerWeb.editProductManager(map, getMapKeys(map));
		verifyTrue(productExternalProductManagerWeb.verifyProductManagerEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For External Products - Product Manager -
	 *         Delete
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "ProductsExternalProductManager_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteProductManager, Author: kutbuddin.compounder")
	public void deleteProductManager(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalProductManagerWeb = homePage.clickOnProductsExternalProductManager();
			count++;
		}
		if (productExternalProductManagerWeb.deleteProductManager(map, getMapKeys(map)))
			verifyFalse(productExternalProductManagerWeb.verifyProductExternalManagerDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For External Products - Product Manager -Log
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "ProductsExternalProductManager_Log", dataProviderClass = TestDataImport.class, description = "Id: LogProductManager, Author: kutbuddin.compounder")
	public void logproductManager(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			productExternalProductManagerWeb = homePage.clickOnProductsExternalProductManager();
			count++;
		}
		verifyTrue(productExternalProductManagerWeb.verifyProductExternalManagerLog(map, getMapKeys(map)));
	}
	

	/**
	 * @author dishant.doshi For product product manager
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "ProductManager_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortProductManager, Author: Dishant Doshi")
	public void sortProductManager(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalProductManagerWeb = homePage.clickOnProductsExternalProductManager();
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
			verifyTrue(productExternalProductManagerWeb.sortProductManager(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
