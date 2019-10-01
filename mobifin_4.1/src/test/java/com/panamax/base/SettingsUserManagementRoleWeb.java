package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi Actions of Settings - User Management - Role
 * @creation date 24/10/2018
 */
public class SettingsUserManagementRoleWeb extends Common {
	boolean result = true;
	By txtRoleName = By.id("RoleName");
	By drpDepartment = By.id("DepartmentID");
	By txtDescription = By.id("Description");
	By drpStatus = By.id("IsActive");
	By drpDepartmentSearch = By.id("cmbDepartmentID");
	By txtRoleNameSearch = By.id("txtRoleName");
	By drpStatusSearch = By.id("cmbIsActive");
	By btnAddModule = By.xpath("//button[contains(text(),'Add Module')]");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 24/10/2018
	 */
	public SettingsUserManagementRoleWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi to send text in role
	 * @param role
	 * @creation date 24/10/2018
	 */
	public void sendTextInRole(String role) {
		clearAndSendTextInTextBox(txtRoleName, role);
	}

	public void filterSearch(String str1, String str2, String str3) {
		commonFilterSearch();
		selectTextInDepartmentSearch(str1);
		sendTextInRoleInSearch(str2);
		selectTextInStatusSearch(str3);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to select text in department drop down
	 * @param department
	 * @creation date 24/10/2018
	 */
	public void selectTextInDepartment(String department) {
		selectFromDropdown(drpDepartment, department);
	}

	/**
	 * @author dishant.doshi to send text in description
	 * @param description
	 * @creation date 24/10/2018
	 */
	public void sendTextInDescription(String description) {
		clearAndSendTextInTextBox(txtDescription, description);
	}

	/**
	 * @author dishant.doshi to select text in status drop down
	 * @param status
	 * @creation date 24/10/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to send text in role in filter search
	 * @param role
	 * @creation date 24/10/2018
	 */
	public void sendTextInRoleInSearch(String role) {
		clearAndSendTextInTextBox(txtRoleNameSearch, role);
	}

	/**
	 * @author dishant.doshi to select text in department drop down in filter
	 *         search
	 * @param department
	 * @creation date 24/10/2018
	 */
	public void selectTextInDepartmentSearch(String department) {
		selectFromDropdown(drpDepartmentSearch, department);
	}

	/**
	 * @author dishant.doshi to select text in status drop down in filter search
	 * @param status
	 * @creation date 24/10/2018
	 */
	public void selectTextInStatusSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author dishant.doshi to click on add module button
	 * @creation date 24/10/2018
	 */
	public void clickOnAddModuleBtn() {
		clickOnElement(btnAddModule);
	}

	/**
	 * @author dishant.doshi to click on add module
	 * @param moduleName
	 * @creation date 24/10/2018
	 */
	public void clickOnAddModule(By moduleName) {
		clickOnElement(moduleName);
	}

	/**
	 * @author dishant.doshi to click on module access
	 * @param access
	 * @creation date 24/10/2018
	 */
	public void clickOnModuleAccess(By access) {
		getCenter(access);
		clickOnElement(access);
	}

	/**
	 * @author dishant.doshi to click on module link
	 * @param moduleName
	 * @creation date 24/10/2018
	 */
	public void clickOnModuleName(By moduleName) {
		clickOnElement(moduleName);
	}

	/**
	 * @author dishant.doshi to click on module edit button
	 * @param moduleName
	 * @creation date 25/10/2018
	 */
	public void clickOnModuleAccessEdit(By moduleName) {
		clickOnElement(moduleName);
	}

	/**
	 * @author dishant.doshi to click on module delete button
	 * @param moduleName
	 * @creation date 25/10/2018
	 */
	public void clickOnModuleAccessDelete(By moduleName) {
		clickOnElement(moduleName);
	}

	/**
	 * @author dishant.doshi to add role
	 * @param map
	 *            - excel data
	 * @param mapKeys
	 *            - excel headers
	 * @return
	 * @creation date 24/10/2018
	 */
	public boolean addRole(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInRole(map.get(mapKeys.get(0)).toString());
		selectTextInDepartment(map.get(mapKeys.get(1)).toString());
		sendTextInDescription(map.get(mapKeys.get(2)).toString());
		selectTextInStatus(map.get(mapKeys.get(3)).toString());
		clickOnSaveBtn();
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			String[] modules = map.get(mapKeys.get(4)).toString().split(",");
			for (int i = 0; i < modules.length; i++) {
				String[] moduleAccess = map.get(modules[i].trim()).toString().split(",");
				if (verifyElement(btnAddModule, false)) {
					clickOnAddModuleBtn();
					if (verifyElement(By.xpath("//*[@id='navwrap']//li/a[contains(text(),'" + modules[i].trim() + "')]"),false)) {
						clickOnAddModule(By.xpath("//*[@id='navwrap']//li/a[contains(text(),'" + modules[i].trim() + "')]"));
						for (int j = 0; j < moduleAccess.length; j++) {
							String[] subModuleAccess = moduleAccess[j].split(":");
							int accessCode = 0;
							if (subModuleAccess[1].trim().equalsIgnoreCase("None"))
								accessCode = 1;
							else if (subModuleAccess[1].trim().equalsIgnoreCase("Readonly"))
								accessCode = 2;
							else if (subModuleAccess[1].trim().equalsIgnoreCase("Maker")){
								if(modules[i].trim().equalsIgnoreCase("Support"))
									accessCode = 2;
								else
									accessCode = 3;
							}
							clickOnModuleAccess(By.xpath("(//div[text()='" + subModuleAccess[0].trim()
									+ "']/..//following-sibling::td//label[contains(@id,'radio')]//parent::div)["
									+ accessCode + "]"));
						}
						clickOnSaveBtn();
						result = true;
					} else {
						if (!verifyElement(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='" + modules[i].trim() + "']"),false)) {
							reloadCurrentPage();
							result = false;
						}else{
							clickOnModuleAccessEdit(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='"
									+ modules[i].trim() + "']//preceding-sibling::ul//i[contains(@class,'edit')]"));
							for (int j = 0; j < moduleAccess.length; j++) {
								String[] subModuleAccess = moduleAccess[j].split(":");
								int accessCode = 0;
								if (subModuleAccess[1].trim().equalsIgnoreCase("None"))
									accessCode = 1;
								else if (subModuleAccess[1].trim().equalsIgnoreCase("Readonly"))
									accessCode = 2;
								else if (subModuleAccess[1].trim().equalsIgnoreCase("Maker")){
									if(modules[i].trim().equalsIgnoreCase("Support"))
										accessCode = 2;
									else
										accessCode = 3;
								}
								clickOnModuleAccess(By.xpath("(//div[text()='" + subModuleAccess[0].trim()
										+ "']/..//following-sibling::td//label[contains(@id,'radio')]//parent::div)["
										+ accessCode + "]"));
							}
							clickOnSaveBtn();
							result = true;
						}
					}
				} else {
					if (!verifyElement(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='" + modules[i].trim() + "']"),false)){
						reloadCurrentPage();
						result = false;
					}else{
						clickOnModuleAccessEdit(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='"
								+ modules[i].trim() + "']//preceding-sibling::ul//i[contains(@class,'edit')]"));
						for (int j = 0; j < moduleAccess.length; j++) {
							String[] subModuleAccess = moduleAccess[j].split(":");
							int accessCode = 0;
							if (subModuleAccess[1].trim().equalsIgnoreCase("None"))
								accessCode = 1;
							else if (subModuleAccess[1].trim().equalsIgnoreCase("Readonly"))
								accessCode = 2;
							else if (subModuleAccess[1].trim().equalsIgnoreCase("Maker")){
								if(modules[i].trim().equalsIgnoreCase("Support"))
									accessCode = 2;
								else
									accessCode = 3;
							}
							clickOnModuleAccess(By.xpath("(//div[text()='" + subModuleAccess[0].trim()
									+ "']/..//following-sibling::td//label[contains(@id,'radio')]//parent::div)["
									+ accessCode + "]"));
						}
						clickOnSaveBtn();
						result = true;
					}
				}
			}
		}
		return result;
	}

	/**
	 * @author dishant.doshi to verify role added?
	 * @param map
	 * @param mapKeys
	 * @return true if role added
	 * @creation date 24/10/2018
	 */
	public boolean verifyRoleAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By roleName = By
				.xpath("//label[text()[normalize-space() = 'Role']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(0)).toString() + "']]");
		By department = By
				.xpath("//label[text()[normalize-space() = 'Department']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(1)).toString() + "']]");
		By description = By
				.xpath("//label[text()[normalize-space() = 'Description']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(2)).toString() + "']]");
		By status = By
				.xpath("//label[text()[normalize-space() = 'Status']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(3)).toString() + "']]");
		if (!verifyElement(roleName, false))
			return false;
		if (!verifyElement(department, false))
			return false;
		if (!verifyElement(description, false))
			return false;
		if (!verifyElement(status, false))
			return false;
		String[] modules = map.get(mapKeys.get(4)).toString().split(",");
		for (int i = 0; i < modules.length; i++) {
			clickOnModuleName(
					By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='" + modules[i].trim() + "']"));
			String[] moduleAccess = map.get(modules[i].trim()).toString().split(",");
			for (int j = 0; j < moduleAccess.length; j++) {
				String[] subModuleAccess = moduleAccess[j].split(":");
				if (!verifyElement(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='"+modules[i].trim()+"']//ancestor::div[@id='headingOnes']//following-sibling::div//*[normalize-space(text())='"+subModuleAccess[0].trim()+"']/..//following-sibling::td//div[normalize-space(text())='"+subModuleAccess[1].trim()+"']"), false))
					return false;
			}
		}
		return true;
	}

	/**
	 * @author dishant.doshi to edit role
	 * @param map
	 *            - excel data
	 * @param mapKeys
	 *            - excel headers
	 * @creation date 25/10/2018
	 */
	public void editRole(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnEditBtn();
			selectTextInDepartment(map.get(mapKeys.get(2)).toString());
			sendTextInDescription(map.get(mapKeys.get(3)).toString());
			selectTextInStatus(map.get(mapKeys.get(4)).toString());
			clickOnSaveBtn();
			filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString(),
					map.get(mapKeys.get(4)).toString());
			if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
				clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
				String[] modules = map.get(mapKeys.get(5)).toString().split(",");
				for (int i = 0; i < modules.length; i++) {
					String[] moduleAccess = map.get(modules[i].trim()).toString().split(",");
					if (verifyElement(
							By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='" + modules[i].trim() + "']"),
							false)) {
						clickOnModuleAccessEdit(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='"
								+ modules[i].trim() + "']//preceding-sibling::ul//i[contains(@class,'edit')]"));
					} else {
						clickOnAddModuleBtn();
						clickOnAddModule(
								By.xpath("//*[@id='navwrap']//li/a[contains(text(),'" + modules[i].trim() + "')]"));
					}
					for (int j = 0; j < moduleAccess.length; j++) {
						String[] subModuleAccess = moduleAccess[j].split(":");
						int accessCode = 0;
						if (subModuleAccess[1].trim().equalsIgnoreCase("None"))
							accessCode = 1;
						else if (subModuleAccess[1].trim().equalsIgnoreCase("Readonly"))
							accessCode = 2;
						else if (subModuleAccess[1].trim().equalsIgnoreCase("Maker"))
							accessCode = 3;
						clickOnModuleAccess(By.xpath("(//div[text()='" + subModuleAccess[0].trim()
								+ "']/..//following-sibling::td//label[contains(@id,'radio')]//parent::div)["
								+ accessCode + "]"));
					}
					clickOnSaveBtn();
				}
			} else {
				verifyFalse(true);
			}
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify role edited?
	 * @param map
	 * @param mapKeys
	 * @return true if role edited
	 * @creation date 25/10/2018
	 */
	public boolean verifyRoleEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By roleName = By
				.xpath("//label[text()[normalize-space() = 'Role']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(0)).toString() + "']]");
		By department = By
				.xpath("//label[text()[normalize-space() = 'Department']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(2)).toString() + "']]");
		By description = By
				.xpath("//label[text()[normalize-space() = 'Description']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(3)).toString() + "']]");
		By status = By
				.xpath("//label[text()[normalize-space() = 'Status']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(4)).toString() + "']]");
		if (!verifyElement(roleName, false))
			return false;
		if (!verifyElement(department, false))
			return false;
		if (!verifyElement(description, false))
			return false;
		if (!verifyElement(status, false))
			return false;
		String[] modules = map.get(mapKeys.get(5)).toString().split(",");
		for (int i = 0; i < modules.length; i++) {
			clickOnModuleName(
					By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='" + modules[i].trim() + "']"));
			String[] moduleAccess = map.get(modules[i].trim()).toString().split(",");
			for (int j = 0; j < moduleAccess.length; j++) {
				String[] subModuleAccess = moduleAccess[j].split(":");
				if (!verifyElement(By.xpath("//div[text()='" + subModuleAccess[0].trim()
						+ "']/..//following-sibling::td//div[normalize-space(text())='" + subModuleAccess[1].trim()
						+ "']"), false))
					return false;
			}
		}
		return true;
	}

	/**
	 * @author dishant.doshi to delete role
	 * @param map
	 *            - excel data
	 * @param mapKeys
	 *            - excel headers
	 * @creation date 25/10/2018
	 */
	@SuppressWarnings("unused")
	public boolean deleteRole(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (map.get(getMapKeys(map).get(3)).toString().equals("Yes")) {
				delete();
				return true;
			} else {
				String[] modules = map.get(mapKeys.get(4)).toString().split(",");
				for (int i = 0; i < modules.length; i++) {
					if (verifyElement(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='" + modules[i].trim()
							+ "']//preceding-sibling::ul//i[contains(@class,'delete')]"), false)) {
						clickOnModuleAccessDelete(By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='"
								+ modules[i].trim() + "']//preceding-sibling::ul//i[contains(@class,'delete')]"));
						clickOnDeleteConfirm();
						return true;
					} else {
						clickOnBackBtn();
						return false;
					}
				}
				clickOnBackBtn();
			}
		} else {
			String string = "Role already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	/**
	 * @author dishant.doshi to verify role deleted?
	 * @param map
	 * @param mapKeys
	 * @return true if role deleted
	 * @creation date 25/10/2018
	 */
	public boolean verifyRoleDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (map.get(getMapKeys(map).get(3)).toString().equals("Yes")) {
			if (verifyFilterBtn()) {
				filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString(),
						map.get(mapKeys.get(2)).toString());
				return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString() + "'])[1]"),
						false);
			} else {
				return true;
			}
		} else {
			String[] modules = map.get(mapKeys.get(4)).toString().split(",");
			for (int i = 0; i < modules.length; i++) {
				if (verifyElement(
						By.xpath("//*[@id='headingOnes']//a[normalize-space(text())='" + modules[i].trim() + "']"),
						false))
					return true;
			}
		}
		return false;
	}

	/**
	 * @author kutbuddin.compounder to verify edited Log?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 27/12/2018
	 * @return true if Management - Role Verify Log SuccesFullly
	 */
	public boolean verifyRoleLoged(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnLogIconBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort role
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 31/12/2018
	 */
	public boolean sortRole(Map<Object, Object> map, List<Object> mapKeys) {
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
