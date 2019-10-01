package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ProductExternalVendorIntegrationWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder
 * Product - External Products - Vendor
 * @creation date 01/10/2018 
 */
public class ProductExternalVendorIntegration extends Common{

	HomeWeb homePage;
	ProductExternalVendorIntegrationWeb productExternalVendorIntegrationWeb;
	int count = 0;
	int sortCounter = 0;
	/**
	 * @author kutbuddin.compounder
	 * For External Products - Vendor Integration - Add
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorIntegration_Add", dataProviderClass = TestDataImport.class, description = "Id: AddVendorIntegration, Author: kutbuddin.compounder")
	public void addVendorIntegration(Map<Object, Object> map){
		if(count==0)
		{
			homePage = goToHome();
			productExternalVendorIntegrationWeb = homePage.clickOnProductsExternalVendorIntegration();
			count++;
		}
		productExternalVendorIntegrationWeb.addVendorIntegration(map, getMapKeys(map));
		verifyTrue(productExternalVendorIntegrationWeb.verifyVendorIntegrationAdded(map, getMapKeys(map)));

	}

	/**
	 * @author kutbuddin.compounder
	 * For External Products - Vendor Integration - Edit
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorIntegration_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditVendorIntegration, Author: kutbuddin.compounder")
	public void editVendorIntegration(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			productExternalVendorIntegrationWeb = homePage.clickOnProductsExternalVendorIntegration();
			count++;
		}
		productExternalVendorIntegrationWeb.editVendorIntegration(map, getMapKeys(map));
		verifyTrue(productExternalVendorIntegrationWeb.verifyVendorIntegrationEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder
	 * For External Products - Vendor Integration - Delete
	 * @creation date 12/10/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorIntegration_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteVendorIntegration, Author: kutbuddin.compounder")
	public void deleteVendorIntegration(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			productExternalVendorIntegrationWeb = homePage.clickOnProductsExternalVendorIntegration();
			count++;
		}
		if(productExternalVendorIntegrationWeb.deleteVendorIntegration(map, getMapKeys(map)))
			verifyFalse(productExternalVendorIntegrationWeb.verifyVendorIntegrationDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For External Products - Vendor Integration - Log
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorIntegration_Log", dataProviderClass = TestDataImport.class, description = "Id: LogVendorIntegration, Author: kutbuddin.compounder")
	public void logVendorIntegration(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			productExternalVendorIntegrationWeb = homePage.clickOnProductsExternalVendorIntegration();
			count++;
		}
		verifyTrue(productExternalVendorIntegrationWeb.verifyVendorIntegrationLog(map, getMapKeys(map)));
	}
	
	/**
	 * @author dishant.doshi For TA - user - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "ProductsExternalVendorIntegration_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortVendorIntegration, Author: Dishant Doshi")
	public void sortVendorIntegration(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productExternalVendorIntegrationWeb = homePage.clickOnProductsExternalVendorIntegration();
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
			verifyTrue(productExternalVendorIntegrationWeb.sortVendorIntegration(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
