package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author shivani.patel Actions of Settings - SystemPreference - RetailSegment
 * @creation date 17/10/2018
 */

public class SettingsSystemPreferenceRetailSegmentWeb extends Common {
	By txtRetailSegmentCode = By.id("CategoryCode");
	By txtRetailSegment = By.id("CategoryName");
	By drpUserType = By.id("UserTypeID");
	By txtDescription = By.id("Description");
	By drpStatus = By.id("IsActive");
	By txtRetailSegmentCodeInSearch = By.id("txtsysCategoryCode");
	By txtRetailSegmentInSearch = By.id("txtsysCategoryName");
	By drpStatusInSearch = By.id("cmbIsActive");

	/**
	 * @author shivani.patel
	 * @param driver
	 *            constructor
	 * @creation date 17/10/2018
	 */
	public SettingsSystemPreferenceRetailSegmentWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel send text in RetailSegmentCode Field
	 * @param RetailSegmenetCode
	 * @creation date 17/10/2018
	 */
	public void sendTextInRetailSegmenetCode(String RetailSegmentCode) {
		sendTextInTextBox(txtRetailSegmentCode, RetailSegmentCode);
	}

	/**
	 * @author shivani.patel send text in RetailSegment Field
	 * @param RetailSegmenet
	 * @creation date 17/10/2018
	 */
	public void sendTextInRetailSegmenet(String RetailSegment) {
		sendTextInTextBox(txtRetailSegment, RetailSegment);
	}

	/**
	 * @author shivani.patel select UserType In DropDownBox
	 * @param UserType
	 * @creation date 17/10/2018
	 */
	public void selectUserTypeInDropdownbox(String UserType) {
		selectFromDropdown(drpUserType, UserType);
	}

	/**
	 * @author shivani.patel send text in Description Field
	 * @param Description
	 * @creation date 17/10/2018
	 */
	public void sendTextInDescription(String Description) {
		clearAndSendTextInTextBox(txtDescription, Description);
	}

	/**
	 * @author shivani.patel select Status In DropDownBox
	 * @param Status
	 * @creation date 17/10/2018
	 */
	public void selectStatusInDropdownbox(String Status) {
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author shivani.patel send RetailSegmentCode In Filter Search
	 * @param Status
	 * @creation date 17/10/2018
	 */
	public void sendTextInRetailSegmentCodeInFilterSearch(String RetailSegementCode) {
		clearAndSendTextInTextBox(txtRetailSegmentCodeInSearch, RetailSegementCode);
	}

	/**
	 * @author shivani.patel send RetailSegment In Filter Search
	 * @param RetailSegement
	 * @creation date 17/10/2018
	 */
	public void sendTextInRetailSegmentInFilterSearch(String RetailSegement) {
		clearAndSendTextInTextBox(txtRetailSegmentInSearch, RetailSegement);
	}

	/**
	 * @author shivani.patel select Status In Filter Search DropdownBox
	 * @param Status
	 * @creation date 17/10/2018
	 */
	public void selectStatusInFilterSearch(String Status) {
		selectFromDropdown(drpStatusInSearch, Status);
	}

	/**
	 * @author shivani.patel use for send text of filter search field
	 * @creation date 17/10/2018
	 */
	public void filterSearch(String RetailSegmentCode, String RetailSegment, String Status) {
		commonFilterSearch();
		sendTextInRetailSegmentCodeInFilterSearch(RetailSegmentCode);
		sendTextInRetailSegmentInFilterSearch(RetailSegment);
		selectStatusInFilterSearch(Status);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author shivani.patel to add RetailSegment
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 17/10/2018
	 */
	public void addRetailSegement(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		sendTextInRetailSegmenetCode(map.get(keys.get(0)).toString());
		sendTextInRetailSegmenet(map.get(keys.get(1)).toString());
		selectUserTypeInDropdownbox(map.get(keys.get(2)).toString());
		sendTextInDescription(map.get(keys.get(3)).toString());
		selectStatusInDropdownbox(map.get(keys.get(4)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author shivani.patel to verify AddRetailSegment
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 17/10/2018
	 * @return true if RetailSegment add successfully Verified
	 */
	public boolean verifyaddRetailSegement(Map<Object, Object> map, List<Object> keys) {
		By RetailSegmentCode = By
				.xpath("//label[normalize-space(text())='Retail Segment Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(0)).toString() + "']");
		By RetailSegment = By
				.xpath("//label[normalize-space(text())='Retail Segment']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(1)).toString() + "']");
		By UserType = By
				.xpath("//label[normalize-space(text())='User Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(2)).toString() + "']");
		By Description = By
				.xpath("//label[normalize-space(text())='Description']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(3)).toString() + "']");
		By Status = By
				.xpath("//label[normalize-space(text())='Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(4)).toString() + "']");

		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(RetailSegmentCode, false))
				return false;
			if (!verifyElement(RetailSegment, false))
				return false;
			if (!verifyElement(UserType, false))
				return false;
			if (!verifyElement(Description, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to Edit RetailSegment
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 17/10/2018
	 */
	public void editRetailSegment(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			clickOnEditBtn();
			sendTextInDescription(map.get(keys.get(2)).toString());
			selectStatusInDropdownbox(map.get(keys.get(4)).toString());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel to verify edit RetailSegment
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 17/10/2018
	 * @return true if RetailSegment edit successfully Verified
	 */
	public boolean verifyeditRetailSegment(Map<Object, Object> map, List<Object> keys) {
		By Description = By
				.xpath("//label[normalize-space(text())='Description']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(2)).toString() + "']");
		By Status = By
				.xpath("//label[normalize-space(text())='Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(4)).toString() + "']");

		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(Description, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			return true;
		}
		return false;
	}

	/**
	 * @author shivani.patel to delete RetailSegment
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 17/10/2018
	 */
	public boolean deleteRetailSegment(Map<Object, Object> map, List<Object> mapKeys) {

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Retail Segement already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	/**
	 * @author shivani.patel to verify delete RetailSegment
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 17/10/2018
	 * @return true if RetailSegment delete successfully Verified
	 */
	public boolean verifyDeleteRetailSegment(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
					map.get(getMapKeys(map).get(2)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify edit RetailSegment log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 31/12/2018
	 * @return true if RetailSegment Log successfully Verified
	 */
	public boolean verifyEditLogRetailSegment(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort RetailSegment
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortRetailSegment(Map<Object, Object> map, List<Object> mapKeys) {
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
