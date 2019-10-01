package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi Actions of Product - External Product - Operator
 * @creation date 01/10/2018
 */
public class ProductExternalProductsOperatorWeb extends Common {
	By txtOperatorName = By.id("OperatorName");
	By drpOperatorImage = By.id("ImageID");
	By txtOperatorDescription = By.id("Description");
	By drpOperatorStatus = By.id("IsActive");
	By txtOperatorNameSearch = By.id("txtOperatorName");
	By drpOperatorStatusSearch = By.id("cmbIsActive");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation 01/10/2018
	 */
	public ProductExternalProductsOperatorWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi send text in operator name field
	 * @param operatorName
	 * @creation date 01/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification parameter name change
	 * @modification date 12/10/2018
	 */
	public void sendTextInOperatorName(String operatorName) {
		clearAndSendTextInTextBox(txtOperatorName, operatorName);
	}

	/**
	 * @author dishant.doshi select operator image from drop down
	 * @param operatorImage
	 * @creation date 01/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification parameter name change
	 * @modification date 12/10/2018
	 */
	public void selectOperatorImage(String operatorImage) {
		selectFromDropdown(drpOperatorImage, operatorImage);
	}

	/**
	 * @author dishant.doshi send text in operator description field
	 * @param operatorDesc
	 * @creation date 01/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification parameter name change
	 * @modification date 12/10/2018
	 */
	public void sendTextInOperatorDescription(String operatorDesc) {
		clearAndSendTextInTextBox(txtOperatorDescription, operatorDesc);
	}

	/**
	 * @author dishant.doshi select operator status from drop down
	 * @param status
	 * @creation date 01/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification parameter name change
	 * @modification date 12/10/2018
	 */
	public void selectOperatorStatus(String status) {
		selectFromDropdown(drpOperatorStatus, status);
	}

	/**
	 * @author dishant.doshi send text in operator name field in filter search
	 * @param operatorName
	 * @creation date 01/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification parameter name change
	 * @modification date 12/10/2018
	 */
	public void sendTextInOperatorNameInFilterSearch(String operatorNameSearch) {
		clearAndSendTextInTextBox(txtOperatorNameSearch, operatorNameSearch);
	}

	/**
	 * @author dishant.doshi select operator status from drop down in filter
	 *         search
	 * @param status
	 * @creation date 01/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification parameter name change
	 * @modification date 12/10/2018
	 */
	public void selectStatusInSearch(String operatorStatusSearch) {
		selectFromDropdown(drpOperatorStatusSearch, operatorStatusSearch);
	}

	/**
	 * @author kutbuddin.compounder
	 * @param str1,str2
	 * @creation date 03/12/2018
	 */
	public void filterSearch(String str1, String str2) {
		commonFilterSearch();
		sendTextInOperatorNameInFilterSearch(str1);
		selectStatusInSearch(str2);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to add operator
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 01/10/2018
	 */
	public void addOperator(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInOperatorName(map.get(mapKeys.get(0)).toString());
		selectOperatorImage(map.get(mapKeys.get(1)).toString());
		sendTextInOperatorDescription(map.get(mapKeys.get(2)).toString());
		selectOperatorStatus(map.get(mapKeys.get(3)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify operator added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 02/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification add search and info button method
	 * @modification date 12/10/2018
	 * @return true if operator added successfully
	 */
	public boolean verifyOperatorAdded(Map<Object, Object> map, List<Object> mapKeys) {

		By operatorName = By
				.xpath("//label[text()='Operator Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By operatorImage = By
				.xpath("//label[text()='Operator Image']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By description = By.xpath("//label[text()='Description']//following-sibling :: div[contains(text(),'"
				+ map.get(mapKeys.get(2)).toString() + "')]");
		By status = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(3)).toString() + "']");
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(operatorName, false))
				return false;
			if (!verifyElement(operatorImage, false))
				return false;
			if (!verifyElement(description, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			return true;
		} else
			return false;
	}

	/**
	 * @author dishant.doshi to edit operator
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 01/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification add search and info button method
	 * @modification date 12/10/2018
	 */
	public void editOperator(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(3)).toString());
		clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
		clickOnEditBtn();
		sendTextInOperatorDescription(map.get(mapKeys.get(2)).toString());
		selectOperatorImage(map.get(mapKeys.get(1)).toString());
		selectOperatorStatus(map.get(mapKeys.get(3)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify operator edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 02/10/2018
	 * @modification by kutbuddin.compounder
	 * @modification add search and info button method
	 * @modification date 12/10/2018
	 * @return true if operator edited successfully
	 */
	public boolean verifyOperatorEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By operatorName = By
				.xpath("//label[text()='Operator Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By operatorImage = By
				.xpath("//label[text()='Operator Image']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By description = By.xpath("//label[text()='Description']//following-sibling :: div[contains(text(),'"
				+ map.get(mapKeys.get(2)).toString() + "')]");
		By status = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(3)).toString() + "']");
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(operatorName, false))
				return false;
			if (!verifyElement(operatorImage, false))
				return false;
			if (!verifyElement(description, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			return true;
		} else
			return false;
	}

	/**
	 * @author Kutbuddin.compounder to verify Operator deleted?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 11/10/2018
	 * @return true if operator deleted successfully
	 */
	public boolean deleteOperator(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Taxation already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
			verifyFalse(false);
		}
		return false;
	}

	public boolean verifyProductExternalOperatorDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString());
			return verifyElement(
					By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString().trim() + "'])[1]"), false);
		} else {
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify vendor operator log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 18/12/2018
	 * @return true if vendor operator  Log successfully Verified
	 */
	public boolean verifyVendorOperatorLog(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(mapKeys.get(0)).toString(),map.get(mapKeys.get(3)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}
	/**
	 * @author dishant.doshi to sort sort operator
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortProductInternal(Map<Object, Object> map, List<Object> mapKeys) {
		pagination();
		Map<String, List<String>> getBeforeSortTableData = getTableData(map.get(getMapKeys(map).get(2)).toString());
		clickOnSortBtn(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
		List<String> sortedUIColumnData = getColumnData(map.get(getMapKeys(map).get(0)).toString());
		List<String> sortedUIColumnDataCopy = new ArrayList<>(sortedUIColumnData);
		sortColumn(sortedUIColumnData, map.get(getMapKeys(map).get(1)).toString());
		if (!compareTwoLists(sortedUIColumnData, sortedUIColumnDataCopy))
			return false;
		Map<String, List<String>> getAfterSortTableData = getTableData(map.get(getMapKeys(map).get(2)).toString());
		if (!getBeforeSortTableData.equals(getAfterSortTableData))
			return false;
		return true;
	}
}
