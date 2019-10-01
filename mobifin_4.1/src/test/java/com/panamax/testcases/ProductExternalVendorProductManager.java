package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ProductExternalVendorProductManagerWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - External Products - Vendor
 * @creation date 01/10/2018
 */
public class ProductExternalVendorProductManager extends Common {
	By date = By.xpath("(//li[contains(@class,'date_footer')])");
	By time = By.xpath("(//li[contains(@class,'timer-footer')])");
	HomeWeb homePage;
	ProductExternalVendorProductManagerWeb productExternalVendorProductManagerWeb;
	int count = 0;
	int sortCounter = 0;

	/**
	 * @author kutbuddin.compounder For External Products - Vendor Product
	 *         Manager - Add
	 * @creation date 16/10/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorProductManager_Add", dataProviderClass = TestDataImport.class, description = "Id: AddVendorProductManager, Author: kutbuddin.compounder")
	public void addVendorProductManager(Map<Object, Object> map) {
		homePage = goToHome();
		String startDate = getUIText(date);
		String startTime = getUIText(time);
		productExternalVendorProductManagerWeb = homePage.clickOnProductsExternalVendorProductManager();
		productExternalVendorProductManagerWeb.addVendorProductManager(map, getMapKeys(map), startDate, startTime);
		verifyTrue(productExternalVendorProductManagerWeb.verifyVendorProductManagerAdded(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For External Products - Vendor Product
	 *         Manager - Edit
	 * @creation date 16/10/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorProductManager_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditVendorProductManager, Author: kutbuddin.compounder")
	public void editVendorProductManager(Map<Object, Object> map) {
		homePage = goToHome();
		String startDate = getUIText(date);
		String startTime = getUIText(time);
		productExternalVendorProductManagerWeb = homePage.clickOnProductsExternalVendorProductManager();
		productExternalVendorProductManagerWeb.editVendorProductManager(map, getMapKeys(map), startDate, startTime);
		verifyTrue(productExternalVendorProductManagerWeb.verifyVendorProductManagerEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For External Products - Vendor Product
	 *         Manager - Delete
	 * @creation date 16/10/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorProductManager_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteVendorProductManager, Author: kutbuddin.compounder")
	public void deleteVendorProductManager(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalVendorProductManagerWeb = homePage.clickOnProductsExternalVendorProductManager();
			count++;
		}
		if (productExternalVendorProductManagerWeb.deleteVendorProductManager(map, getMapKeys(map)))
			verifyFalse(productExternalVendorProductManagerWeb.verifyVendorProductManagerDeleted(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For External Products - Vendor
	 *         ProductManager - Log
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorProductManager_Log", dataProviderClass = TestDataImport.class, description = "Id: LogVendorProductManager, Author: kutbuddin.compounder")
	public void logVendorProductManager(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalVendorProductManagerWeb = homePage.clickOnProductsExternalVendorProductManager();
			count++;
		}
		verifyTrue(productExternalVendorProductManagerWeb.verifyVendorProductManagerLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For product vendor product manager
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "VendorProductManager_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortVendorProductManager, Author: Dishant Doshi")
	public void sortVendorProductManager(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalVendorProductManagerWeb = homePage.clickOnProductsExternalVendorProductManager();
			count++;
		}
		if (sortCounter == 0) {
			sortCounter++;
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list))
				booleanValue = true;
		}
		if (booleanValue)
			verifyTrue(productExternalVendorProductManagerWeb.sortVendorProductManager(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
