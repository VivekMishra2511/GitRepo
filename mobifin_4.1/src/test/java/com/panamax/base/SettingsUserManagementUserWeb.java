package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi Actions of Settings - User Management - User
 * @creation date 26/10/2018
 */
public class SettingsUserManagementUserWeb extends Common {
	By drpDepartment = By.id("DepartmentID");
	By drpRole = By.id("RoleID");
	By txtLoginID = By.id("UserName");
	By drpDateFormat = By.id("DateFormatID");
	By drpTimeZone = By.id("TimeZoneID");
	By txtEmail = By.id("Email");
	By txtPhone = By.id("Phone");
	By txtSessionTimeOut = By.id("SessionTimeOut");
	By drpPrecision = By.id("DecimalPrecision");
	By txtFirstName = By.id("FirstName");
	By txtLastName = By.id("LastName");
	By drpCountry = By.id("CountryID");
	By drpState = By.id("CountryStateID");
	By drpMapCode = By.id("MapCodeID");
	By drpStatus = By.id("IsActive");
	By drpDepartmentSearch = By.id("cmbDepartmentID");
	By drpRoleSearch = By.id("cmbRoleID");
	By txtUserNameSearch = By.id("txtUserName");
	By txtEmailSearch = By.id("txtEmail");
	By drpCountrySearch = By.id("cmbCountryID");
	By drpStateSearch = By.id("cmbCountryStateID");
	By drpStatusSearch = By.id("cmbIsActive");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 29/10/2018
	 */
	public SettingsUserManagementUserWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2, String str3, String str4, String str5, String str6,
			String str7) {
		commonFilterSearch();
		selectTextInDepartmentInSearch(str1);
		selectTextInRoleInSearch(str2);
		sendTextInUserNameInSearch(str3);
		sendTextInEmailInSearch(str4);
		selectTextInCountryInSearch(str5);
		selectTextInStateInSearch(str6);
		selectTextInStatusInSearch(str7);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to select text in department
	 * @param department
	 * @creation date 29/10/2018
	 */
	public void selectTextInDepartment(String department) {
		selectFromDropdown(drpDepartment, department);
	}

	/**
	 * @author dishant.doshi to select text in role
	 * @param role
	 * @creation date 29/10/2018
	 */
	public void selectTextInRole(String role) {
		selectFromDropdown(drpRole, role);
	}

	/**
	 * @author dishant.doshi to send text in login id
	 * @param user
	 * @creation date 29/10/2018
	 */
	public void sendTextInLoginID(String user) {
		sendTextWithRemoveReadOnlyProperty(user, txtLoginID);
	}

	/**
	 * @author dishant.doshi to select text in date format
	 * @param dateFormat
	 * @creation date 29/10/2018
	 */
	public void selectTextInDateFormat(String dateFormat) {
		selectFromDropdown(drpDateFormat, dateFormat);
	}

	/**
	 * @author dishant.doshi to select text in time zone
	 * @param timeZone
	 * @creation date 29/10/2018
	 */
	public void selectTextInTimeZone(String timeZone) {
		selectFromDropdown(drpTimeZone, timeZone);
	}

	/**
	 * @author dishant.doshi to send text in email
	 * @param email
	 * @creation date 29/10/2018
	 */
	public void sendTextInEmail(String email) {
		clearAndSendTextInTextBox(txtEmail, email);
	}

	/**
	 * @author dishant.doshi to send text in phone
	 * @param phone
	 * @creation date 29/10/2018
	 */
	public void sendTextInPhone(String phone) {
		clearAndSendTextInTextBox(txtPhone, phone);
	}

	/**
	 * @author dishant.doshi to send text in session time in min
	 * @param sessionTime
	 * @creation date 29/10/2018
	 */
	public void sendTextInSessionTime(String sessionTime) {
		clearAndSendTextInTextBox(txtSessionTimeOut, sessionTime);
	}

	/**
	 * @author dishant.doshi to select text in precision
	 * @param precision
	 * @creation date 29/10/2018
	 */
	public void selectTextInPrecision(String precision) {
		selectFromDropdown(drpPrecision, precision);
	}

	/**
	 * @author dishant.doshi to send text in first name
	 * @param firstName
	 * @creation date 29/10/2018
	 */
	public void sendTextInFirstName(String firstName) {
		clearAndSendTextInTextBox(txtFirstName, firstName);
	}

	/**
	 * @author dishant.doshi to send text in session last name
	 * @param lastName
	 * @creation date 29/10/2018
	 */
	public void sendTextInLastName(String lastName) {
		clearAndSendTextInTextBox(txtLastName, lastName);
	}

	/**
	 * @author dishant.doshi to select text in country
	 * @param country
	 * @creation date 29/10/2018
	 */
	public void selectTextInCountry(String country) {
		selectFromDropdown(drpCountry, country);
	}

	/**
	 * @author dishant.doshi to select text in state
	 * @param state
	 * @creation date 29/10/2018
	 */
	public void selectTextInState(String state) {
		selectFromDropdown(drpState, state);
	}

	/**
	 * @author dishant.doshi to select text in map code
	 * @param mapCode
	 * @creation date 29/10/2018
	 */
	public void selectTextInMapCode(String mapCode) {
		selectFromDropdown(drpMapCode, mapCode);
	}

	/**
	 * @author dishant.doshi to select text in status
	 * @param status
	 * @creation date 30/10/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to select text in department in filter search
	 * @param department
	 * @creation date 29/10/2018
	 */
	public void selectTextInDepartmentInSearch(String department) {
		selectFromDropdown(drpDepartmentSearch, department);
	}

	/**
	 * @author dishant.doshi to select text in role in filter search
	 * @param role
	 * @creation date 29/10/2018
	 */
	public void selectTextInRoleInSearch(String role) {
		selectFromDropdown(drpRoleSearch, role);
	}

	/**
	 * @author dishant.doshi to send text in user name in filter search
	 * @param user
	 * @creation date 29/10/2018
	 */
	public void sendTextInUserNameInSearch(String user) {
		sendTextWithRemoveReadOnlyProperty(user, txtUserNameSearch);
	}

	/**
	 * @author dishant.doshi to send text in email in filter search
	 * @param email
	 * @creation date 29/10/2018
	 */
	public void sendTextInEmailInSearch(String email) {
		clearAndSendTextInTextBox(txtEmailSearch, email);
	}

	/**
	 * @author dishant.doshi to select text in country in filter search
	 * @param country
	 * @creation date 29/10/2018
	 */
	public void selectTextInCountryInSearch(String country) {
		selectFromDropdown(drpCountrySearch, country);
	}

	/**
	 * @author dishant.doshi to select text in state in filter search
	 * @param state
	 * @creation date 29/10/2018
	 */
	public void selectTextInStateInSearch(String state) {
		selectFromDropdown(drpStateSearch, state);
	}

	/**
	 * @author dishant.doshi to select text in status in filter search
	 * @param status
	 * @creation date 29/10/2018
	 */
	public void selectTextInStatusInSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author dishant.doshi to add User
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/10/2018
	 */
	public void addUser(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectTextInDepartment(map.get(mapKeys.get(0)).toString());
		selectTextInRole(map.get(mapKeys.get(1)).toString());
		sendTextInLoginID(map.get(mapKeys.get(2)).toString());
		if (!map.get(mapKeys.get(3)).toString().equals(""))
			selectTextInDateFormat(map.get(mapKeys.get(3)).toString());
		selectTextInTimeZone(map.get(mapKeys.get(4)).toString());
		sendTextInEmail(map.get(mapKeys.get(5)).toString());
		sendTextInPhone(map.get(mapKeys.get(6)).toString());
		sendTextInSessionTime(map.get(mapKeys.get(7)).toString());
		selectTextInPrecision(map.get(mapKeys.get(8)).toString());
		sendTextInFirstName(map.get(mapKeys.get(9)).toString());
		sendTextInLastName(map.get(mapKeys.get(10)).toString());
		selectTextInCountry(map.get(mapKeys.get(11)).toString());
		selectTextInState(map.get(mapKeys.get(12)).toString());
		selectTextInMapCode(map.get(mapKeys.get(13)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify User added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/10/2018
	 * @return true if User added successfully
	 */
	public boolean verifyUserAdded(Map<Object, Object> map, List<Object> mapKeys) {

		By department = By
				.xpath("//label[normalize-space(text()) = 'Department']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By role = By
				.xpath("//label[normalize-space(text()) = 'Role']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By loginID = By
				.xpath("//label[normalize-space(text()) = 'Login ID']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By dateFormat = By
				.xpath("//label[normalize-space(text()) = 'Date Format']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By timeZone = By
				.xpath("//label[normalize-space(text()) = 'Time Zone']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By email = By
				.xpath("//label[normalize-space(text()) = 'Email Address']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By phone = By
				.xpath("//label[normalize-space(text()) = 'Phone']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By sessionTime = By
				.xpath("//label[normalize-space(text()) = 'Session Time (Min.)']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "']");
		By precision = By
				.xpath("//label[normalize-space(text()) = 'Precision']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By firstName = By
				.xpath("//label[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(9)).toString() + "']");
		By lastName = By
				.xpath("//label[normalize-space(text()) = 'LastName']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "']");
		By country = By
				.xpath("//label[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "']");
		By state = By
				.xpath("//label[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(12)).toString() + "']");
		By mapCode = By
				.xpath("//label[normalize-space(text()) = 'Map Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString() + "']");

		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(11)).toString(), map.get(mapKeys.get(12)).toString(),
				map.get(mapKeys.get(14)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(2)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString());
			if (!verifyElement(department, false))
				return false;
			if (!verifyElement(role, false))
				return false;
			if (!verifyElement(loginID, false))
				return false;
			if (!verifyElement(dateFormat, false) && !map.get(mapKeys.get(3)).toString().equals(""))
				return false;
			if (!verifyElement(timeZone, false))
				return false;
			if(maskingAllowed){
				if (!verifyElement(email, false))
					return false;
				if (!verifyElement(phone, false))
					return false;
			}
			if (!verifyElement(sessionTime, false))
				return false;
			if (!verifyElement(precision, false))
				return false;
			if (!verifyElement(firstName, false))
				return false;
			if (!verifyElement(lastName, false))
				return false;
			if (!verifyElement(country, false))
				return false;
			if (!verifyElement(state, false))
				return false;
			if (!verifyElement(mapCode, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to edit User
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 29/10/2018
	 */
	public void editUser(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(7)).toString(),
				map.get(mapKeys.get(14)).toString(), map.get(mapKeys.get(16)).toString(),
				map.get(mapKeys.get(19)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(4)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(4)).toString());
			clickOnEditBtn();
			selectTextInDepartment(map.get(mapKeys.get(1)).toString());
			selectTextInRole(map.get(mapKeys.get(3)).toString());
			if (!map.get(mapKeys.get(5)).toString().equals(""))
				selectTextInDateFormat(map.get(mapKeys.get(5)).toString());
			selectTextInTimeZone(map.get(mapKeys.get(6)).toString());
			sendTextInEmail(map.get(mapKeys.get(8)).toString());
			sendTextInPhone(map.get(mapKeys.get(9)).toString());
			sendTextInSessionTime(map.get(mapKeys.get(10)).toString());
			selectTextInPrecision(map.get(mapKeys.get(11)).toString());
			sendTextInFirstName(map.get(mapKeys.get(12)).toString());
			sendTextInLastName(map.get(mapKeys.get(13)).toString());
			selectTextInCountry(map.get(mapKeys.get(15)).toString());
			selectTextInState(map.get(mapKeys.get(17)).toString());
			selectTextInMapCode(map.get(mapKeys.get(18)).toString());
			selectTextInStatus(map.get(mapKeys.get(19)).toString());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify User edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 29/10/2018
	 * @return true if User edited successfully
	 */
	public boolean verifyUserEdited(Map<Object, Object> map, List<Object> mapKeys) {

		By department = By
				.xpath("//label[normalize-space(text()) = 'Department']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By role = By
				.xpath("//label[normalize-space(text()) = 'Role']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By loginID = By
				.xpath("//label[normalize-space(text()) = 'Login ID']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By dateFormat = By
				.xpath("//label[normalize-space(text()) = 'Date Format']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By timeZone = By
				.xpath("//label[normalize-space(text()) = 'Time Zone']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By email = By
				.xpath("//label[normalize-space(text()) = 'Email Address']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By phone = By
				.xpath("//label[normalize-space(text()) = 'Phone']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(9)).toString() + "']");
		By sessionTime = By
				.xpath("//label[normalize-space(text()) = 'Session Time (Min.)']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "']");
		By precision = By
				.xpath("//label[normalize-space(text()) = 'Precision']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "']");
		By firstName = By
				.xpath("//label[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(12)).toString() + "']");
		By lastName = By
				.xpath("//label[normalize-space(text()) = 'LastName']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString() + "']");
		By country = By
				.xpath("//label[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(15)).toString() + "']");
		By state = By
				.xpath("//label[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(17)).toString() + "']");
		By mapCode = By
				.xpath("//label[normalize-space(text()) = 'Map Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(18)).toString() + "']");

		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(3)).toString(),
				map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(8)).toString(),
				map.get(mapKeys.get(15)).toString(), map.get(mapKeys.get(17)).toString(),
				map.get(mapKeys.get(19)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(4)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(4)).toString());
			if (!verifyElement(department, false))
				return false;
			if (!verifyElement(role, false))
				return false;
			if (!verifyElement(loginID, false))
				return false;
			if (!verifyElement(dateFormat, false) && !map.get(mapKeys.get(5)).toString().equals(""))
				return false;
			if (!verifyElement(timeZone, false))
				return false;
			if(maskingAllowed){
				if (!verifyElement(email, false))
					return false;
				if (!verifyElement(phone, false))
					return false;
			}
			if (!verifyElement(sessionTime, false))
				return false;
			if (!verifyElement(precision, false))
				return false;
			if (!verifyElement(firstName, false))
				return false;
			if (!verifyElement(lastName, false))
				return false;
			if (!verifyElement(country, false))
				return false;
			if (!verifyElement(state, false))
				return false;
			if (!verifyElement(mapCode, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to delete User
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 29/10/2018
	 */
	public boolean deleteUser(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(3)).toString(),
				map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(6)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(2)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString());
			delete();
			return true;
		} else {
			String string = "User already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyUserDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
					map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(3)).toString(),
					map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(5)).toString(),
					map.get(mapKeys.get(6)).toString());
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
	 * @return true if user management Verify Log SuccesFullly
	 */
	public boolean verifyUserManegementLoged(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(3)).toString(),
				map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(8)).toString(),
				map.get(mapKeys.get(15)).toString(), map.get(mapKeys.get(17)).toString(),
				map.get(mapKeys.get(19)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(4)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(4)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort user
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 31/12/2018
	 */
	public boolean sortUser(Map<Object, Object> map, List<Object> mapKeys) {
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
