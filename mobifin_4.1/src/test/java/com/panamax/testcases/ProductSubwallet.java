package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ProductSubwalletWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author kutbuddin.compounder Product - Subwallet Products - ProductSubwallet
 * @creation date 24/10/2018
 */
public class ProductSubwallet extends Common {

	HomeWeb homePage;
	ProductSubwalletWeb productSubwalletWeb;
	int count = 0;
	int sortCounter = 0;
	int maxValue=50;
	/**
	 * @author kutbuddin.compounder For Subwallet Products - Add
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "ProductSubwallet_Add", dataProviderClass = TestDataImport.class, description = "Id: AddProductSubwallet, Author: kutbuddin.compounder")
	public void addProductSubwallet(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productSubwalletWeb = homePage.clickOnProductSubwalletProducts();
			count++;
		}
		if(productSubwalletWeb.getSizeOfSubWalletName()!=maxValue) {
			productSubwalletWeb.addProductSubwallet(map, getMapKeys(map));
			verifyTrue(productSubwalletWeb.verifyProductSubwalletAdded(map, getMapKeys(map)));
		}
		else{
			String string = "Subwallet Limit Reached";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}

	}

	/**
	 * @author kutbuddin.compounder For Subwallet Products - Edit
	 * @creation date 24/10/2018
	 */
	@Test(dataProvider = "ProductSubwallet_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditProductSubwallet, Author: kutbuddin.compounder")
	public void editProductSubwallet(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productSubwalletWeb = homePage.clickOnProductSubwalletProducts();
			count++;
		}
		productSubwalletWeb.editProductSubwallet(map, getMapKeys(map));
		verifyTrue(productSubwalletWeb.verifyProductSubwalletEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Subwallet Products - Delete
	 * @creation date 24/10/2018
	 *//*
		 * @Test(dataProvider = "ProductSubwallet_Delete", dataProviderClass =
		 * TestDataImport.class, description =
		 * "Id: DeleteProductSubwallet, Author: kutbuddin.compounder") public
		 * void DeleteProductSubwallet(Map<Object, Object> map){ if(count==0){
		 * homePage = goToHome(); ProductSubwalletWeb =
		 * homePage.clickOnProductSubwalletProducts(); count++; }
		 * ProductSubwalletWeb.deleteProductSubwallet(map, getMapKeys(map));
		 * ProductSubwalletWeb.verifyProductSubwalletrDeleted(map,
		 * getMapKeys(map)); }
		 */

	/**
	 * @author dishant.doshi For product sub wallet
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "ProductSubWallet_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortSubWallet, Author: Dishant Doshi")
	public void sortProductSubwallet(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productSubwalletWeb = homePage.clickOnProductSubwalletProducts();
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
			verifyTrue(productSubwalletWeb.sortProductSubWallet(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
	/**
	 * @author kutbuddin.compounder
	 * For Subwallet Products  -Log
	 * @creation date 19/12/2018
	 */
	@Test(dataProvider = "ProductSubwallet_Log", dataProviderClass = TestDataImport.class, description = "Id: LogProductSubwallet, Author: kutbuddin.compounder")
	public void logProductSubwallet(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			productSubwalletWeb = homePage.clickOnProductSubwalletProducts();
			count++;
		}
		verifyTrue(productSubwalletWeb.verifySubwalletLog(map, getMapKeys(map)));
	}
}
