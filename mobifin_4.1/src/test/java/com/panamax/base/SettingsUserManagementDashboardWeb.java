package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi Actions of Settings - User Management - Dashboard
 * @creation date 26/10/2018
 */
public class SettingsUserManagementDashboardWeb extends Common {
	By txtDashboardName = By.id("DashboardName");
	By msRole = By.xpath("//*[@id='role']//following-sibling::div//input");
	By drpStatus = By.id("IsActive");
	By txtViewParam = By.id("ViewParams");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 26/10/2018
	 */
	public SettingsUserManagementDashboardWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2) {
		commonFilterSearch();
		sendTextInDashboardName(str1);
		selectTextInStatus(str2);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to send text in dashboard name
	 * @param dashBoard
	 * @creation date 26/10/2018
	 */
	public void sendTextInDashboardName(String dashBoard) {
		clearAndSendTextInTextBox(txtDashboardName, dashBoard);
	}

	/**
	 * @author dishant.doshi to select text in role
	 * @param role
	 * @creation date 26/10/2018
	 */
	public void selectTextInRole(String role) {
		clearAndSendTextInTextBox(msRole, role);
	}

	/**
	 * @author dishant.doshi to select text in status
	 * @param status
	 * @creation date 26/10/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to send text in view params
	 * @param viewParams
	 * @creation date 26/10/2018
	 */
	public void sendTextInViewParams(String viewParams) {
		clearAndSendTextInTextBox(txtViewParam, viewParams);
	}

	/**
	 * @author dishant.doshi to add dashboard
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/10/2018
	 */
	public void addDashboard(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInDashboardName(map.get(mapKeys.get(0)).toString().trim());
		String[] role = map.get(mapKeys.get(1)).toString().trim().split(",");
		for (int i = 0; i < role.length; i++) {
			selectTextInRole(role[i] + Keys.ENTER);
		}
		selectTextInStatus(map.get(mapKeys.get(2)).toString().trim());
		sendTextInViewParams(map.get(mapKeys.get(3)).toString().trim());
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify dashboard added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/10/2018
	 * @return true if dashboard added successfully
	 */
	public boolean verifyDashboardAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By dashBoardName = By
				.xpath("//label[normalize-space(text()) = 'Dashboard Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By status = By
				.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By viewParams = By
				.xpath("//label[normalize-space(text()) = 'View Params']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(2)).toString());
		String[] role = map.get(mapKeys.get(1)).toString().trim().split(",");
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(dashBoardName, false))
				return false;
			for (int i = 0; i < role.length; i++) {
				if (!verifyElement(By
						.xpath("//label[normalize-space(text()) = 'Role']//following-sibling :: div[normalize-space(text()) = '"
								+ role[i] + "']"),
						false))
					return false;
			}
			if (!verifyElement(viewParams, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @author dishant.doshi to edit dashboard
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 29/10/2018
	 */
	public void editDashboard(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnEditBtn();
			String[] role = map.get(mapKeys.get(1)).toString().trim().split(",");
			for (int i = 0; i < role.length; i++) {
				selectTextInRole(role[i] + Keys.ENTER);
			}
			selectTextInStatus(map.get(mapKeys.get(2)).toString().trim());
			sendTextInViewParams(map.get(mapKeys.get(3)).toString().trim());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify dashboard edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 29/10/2018
	 * @return true if dashboard edited successfully
	 */
	public boolean verifyDashboardEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By dashBoardName = By
				.xpath("//label[normalize-space(text()) = 'Dashboard Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By status = By
				.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By viewParams = By
				.xpath("//label[normalize-space(text()) = 'View Params']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(2)).toString());
		String[] role = map.get(mapKeys.get(1)).toString().trim().split(",");
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(dashBoardName, false))
				return false;
			for (int i = 0; i < role.length; i++) {
				if (!verifyElement(
						By.xpath("//label[normalize-space(text()) = 'Role']//following-sibling :: div[contains(text(),'"
								+ role[i] + "')]"),
						false))
					return false;
			}
			if (!verifyElement(viewParams, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to delete dashboard
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 29/10/2018
	 */
	public boolean deleteDashboard(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Dashboard already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyDashboardDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
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
	 * @return true if Dashboard Verify Log SuccesFullly
	 */
	public boolean verifyDashboardLoged(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort dashboard
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 31/12/2018
	 */
	public boolean sortDashboard(Map<Object, Object> map, List<Object> mapKeys) {
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
