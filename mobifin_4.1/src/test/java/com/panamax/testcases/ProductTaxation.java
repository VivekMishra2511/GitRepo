package com.panamax.testcases;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import com.panamax.base.HomeWeb;
import com.panamax.base.ProductTaxationWeb;
import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

public class ProductTaxation extends Common {

	HomeWeb homePage;
	ProductTaxationWeb productTaxationWeb;
	int count = 0;
	int sortCounter = 0;
	int maxValue=10;
	/**
	 * @author kutbuddin.compounder For Taxation-Product- Add
	 * @creation date 04/10/2018
	 */
	@Test(dataProvider = "ProductsTaxation_Add", dataProviderClass = TestDataImport.class, description = "Id: AddTaxation, Author: Kutbuddin Compounder")
	public void addTaxation(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productTaxationWeb = homePage.clickOnProductsTaxation();
			count++;
		}
		if(productTaxationWeb.getSizeOfTaxationName()!=maxValue) {
			productTaxationWeb.addTaxation(map, getMapKeys(map));
			verifyTrue(productTaxationWeb.verifyTaxationAdded(map, getMapKeys(map)));
		}
		else{
			String string = "Taxation Limit Reached";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
	}

	/**
	 * @author kutbuddin.compounder For Taxation-Product- Edit
	 * @creation date 04/10/2018
	 */
	@Test(dataProvider = "ProductsTaxation_Edit", dataProviderClass = TestDataImport.class, description = "Id: EditCountry, Author:Kutbuddin Compounder")
	public void editTaxation(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productTaxationWeb = homePage.clickOnProductsTaxation();
			count++;
		}
		productTaxationWeb.editTaxation(map, getMapKeys(map));
		verifyTrue(productTaxationWeb.verifyTaxationEdited(map, getMapKeys(map)));
	}

	/**
	 * @author kutbuddin.compounder For Taxation-Product-Delete
	 * @creation date 04/10/2018
	 */
	@Test(dataProvider = "ProductsTaxation_Delete", dataProviderClass = TestDataImport.class, description = "Id: DeleteTaxation, Author:Kutbuddin Compounder")
	public void deleteTaxation(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productTaxationWeb = homePage.clickOnProductsTaxation();
			count++;
		}
		if (productTaxationWeb.deleteTaxation(map, getMapKeys(map)))
			verifyFalse(productTaxationWeb.verifyProductTaxationDeleted(map, getMapKeys(map)));
	}
	/**
	 * @author kutbuddin.compounder
	 * For Txation-Product-Log
	 * @creation date 21/12/2018
	 */
	@Test(dataProvider = "ProductsTaxation_Log", dataProviderClass = TestDataImport.class, description = "Id: Log Taxation, Author:Kutbuddin Compounder")
	public void logTaxation(Map<Object, Object> map){
		if(count==0){
			homePage = goToHome();
			productTaxationWeb = homePage.clickOnProductsTaxation();
			count++;
		}
		verifyTrue(productTaxationWeb.verifyProductTaxationLog(map, getMapKeys(map)));
	}

	/**
	 * @author dishant.doshi For Taxation - Product - Sort
	 * @creation date 26/12/2018
	 */
	@Test(dataProvider = "ProductsTaxation_Sort", dataProviderClass = TestDataImport.class, description = "Id: SortTaxation, Author: Dishant Doshi")
	public void sortTaxation(Map<Object, Object> map) {
		if (count == 0) {
			homePage = goToHome();
			productTaxationWeb = homePage.clickOnProductsTaxation();
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
			verifyTrue(productTaxationWeb.sortProductInternal(map, getMapKeys(map)));
		else
			verifyTrue(booleanValue);
	}
}
