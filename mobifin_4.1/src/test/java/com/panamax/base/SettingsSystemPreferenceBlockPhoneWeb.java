package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author shivani.patel Actions of Settings - SystemPreference - BlockPhone
 * @creation date 12/10/2018
 */
public class SettingsSystemPreferenceBlockPhoneWeb extends Common {
	By txtPhone = By.id("Phone");
	By drpStatus = By.id("IsActive");
	By txtPhoneInSearch = By.id("txtPhone");
	By drpStatusInSearch = By.id("cmbIsActive");

	/**
	 * @author shivani.doshi
	 * @param driver
	 *            constructor
	 * @creation date 12/10/2018
	 */
	public SettingsSystemPreferenceBlockPhoneWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel send text in phone field
	 * @param Phone
	 * @creation date 12/10/2018
	 */
	public void sendTextInPhone(String Phone) {
		clearAndSendTextInTextBox(txtPhone, Phone);
	}

	/**
	 * @author shivani.patel select Status in DropdownBox
	 * @param Status
	 * @creation date 12/10/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author shivani.patel send text in Filter Search phone Field
	 * @param Phone
	 * @creation date 12/10/2018
	 */
	public void sendTextInPhoneInFilterSearch(String Phone) {
		clearAndSendTextInTextBox(txtPhoneInSearch, Phone);
	}

	/**
	 * @author shivani.patel select Status in Filter Search DropdownBox
	 * @param Status
	 * @creation date 12/10/2018
	 */
	public void selectStatusInFilterSearch(String Status) {
		selectFromDropdown(drpStatusInSearch, Status);
	}

	/**
	 * @author shivani.patel use for send text of filter search field
	 * @param Phone,
	 *            Status
	 * @creation date 12/10/2018
	 */
	public void filterSearch(String Phone, String Status) {
		commonFilterSearch();
		sendTextInPhoneInFilterSearch(Phone);
		selectStatusInFilterSearch(Status);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author shivani.patel to add Block Phone
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 12/10/2018
	 */
	public void addBlockPhone(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		sendTextInPhone(map.get(keys.get(0)).toString());
		selectStatus(map.get(keys.get(1)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author shivani.patel to verify add Block Phone
	 * @param map
	 *            - excel values used for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 12/10/2018
	 * @return true if BlockPhone add successfully Verified
	 */
	public boolean verifyaddBlockPhone(Map<Object, Object> map, List<Object> keys) {
		By Phone = By.xpath("//label[text()='Phone']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(0)).toString() + "']");
		By Status = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(1)).toString() + "']");

		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (maskingAllowed) {
				if (!verifyElement(Phone, false))
					return false;
			}
			if (!verifyElement(Status, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to Edit Block Phone
	 * @param map
	 *            - excel values used for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 12/10/2018
	 */
	public void EditBlockPhone(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			selectStatus(map.get(keys.get(2)).toString());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel to verify add Block Phone
	 * @param map
	 *            - excel values used for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 12/10/2018
	 * @return true if BlockIDPhone edit successfully Verified
	 */
	public boolean verifyEditBlockPhone(Map<Object, Object> map, List<Object> keys) {
		By Status = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(2)).toString() + "']");

		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(Status, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to delete Block Phone
	 * @param map
	 *            - excel values used for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 12/10/2018
	 */
	public boolean DeleteBlockPhone(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Block Phone already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;

	}

	/**
	 * @author shivani.patel to verify delete Block Phone
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 12/10/2018
	 * @return true if BlockIDPhone delete successfully Verified
	 */
	public boolean verifyDeleteBlockPhone(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify edit BlockPhone log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 31/12/2018
	 * @return true if BlockPhone Log successfully Verified
	 */
	public boolean verifyEditLogBlockPhone(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort BlockPhone
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortBlockPhone(Map<Object, Object> map, List<Object> mapKeys) {
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
