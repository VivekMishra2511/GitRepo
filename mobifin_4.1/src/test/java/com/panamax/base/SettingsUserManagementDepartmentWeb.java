package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi Actions of Settings - User Management - Department
 * @creation date 23/10/2018
 */
public class SettingsUserManagementDepartmentWeb extends Common {
	By txtDepartmentName = By.id("DepartmentName");
	By txtDescription = By.id("Description");
	By drpStatus = By.id("IsActive");
	By textDepartmentNameSearch = By.id("txtDepartmentName");
	By drpStatusSearch = By.id("cmbIsActive");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 23/10/2018
	 */
	public SettingsUserManagementDepartmentWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2) {
		commonFilterSearch();
		sendTextInDepartmentInSearch(str1);
		selectTextInStatusInSearch(str2);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to send text in department
	 * @param departmentName
	 * @creation date 23/10/2018
	 */
	public void sendTextInDepartment(String departmentName) {
		clearAndSendTextInTextBox(txtDepartmentName, departmentName);
	}

	/**
	 * @author dishant.doshi to send text in description
	 * @param description
	 * @creation date 23/10/2018
	 */
	public void sendTextInDescription(String description) {
		clearAndSendTextInTextBox(txtDescription, description);
	}

	/**
	 * @author dishant.doshi to select status from status drop down
	 * @param status
	 * @creation date 23/10/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to send text in description in filter search
	 * @param department
	 * @creation date 23/10/2018
	 */
	public void sendTextInDepartmentInSearch(String department) {
		clearAndSendTextInTextBox(textDepartmentNameSearch, department);
	}

	/**
	 * @author dishant.doshi to select status from status drop down in filter
	 *         search
	 * @param status
	 * @creation date 23/10/2018
	 */
	public void selectTextInStatusInSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author dishant.doshi to add department
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 23/10/2018
	 */
	public void addDepartment(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInDepartment(map.get(mapKeys.get(0)).toString());
		sendTextInDescription(map.get(mapKeys.get(1)).toString());
		selectTextInStatus(map.get(mapKeys.get(2)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify department added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 23/10/2018
	 * @return true if department added successfully
	 */
	public boolean verifyDepartmentAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By departmentName = By
				.xpath("//label[text()[normalize-space() = 'Department']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)) + "']");
		By description = By
				.xpath("//label[text()[normalize-space() = 'Description']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)) + "']");
		By status = By
				.xpath("//label[text()[normalize-space() = 'Status']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)) + "']");
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (!verifyElement(departmentName))
				return false;
			if (!verifyElement(description))
				return false;
			if (!verifyElement(status))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to edit department
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 23/10/2018
	 */
	public void editDepartment(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnEditBtn();
			sendTextInDescription(map.get(mapKeys.get(1)).toString());
			selectTextInStatus(map.get(mapKeys.get(2)).toString());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify department edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 23/10/2018
	 * @return true if department edited successfully
	 */
	public boolean verifyDepartmentEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By description = By
				.xpath("//label[normalize-space(text()) = 'Description']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)) + "']");
		By status = By
				.xpath("//label[text()[normalize-space() = 'Status']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)) + "']");
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (!verifyElement(description))
				return false;
			if (!verifyElement(status))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to delete department
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 23/10/2018
	 */
	public boolean deleteDepartment(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Department already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyDepartmentDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify edited Log?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 27/12/2018
	 * @return true if Department Verify Log SuccesFullly
	 */
	public boolean verifyDepartmentLoged(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort department
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 31/12/2018
	 */
	public boolean sortDepartment(Map<Object, Object> map, List<Object> mapKeys) {
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
