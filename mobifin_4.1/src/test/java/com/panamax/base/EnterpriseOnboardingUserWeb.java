package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

public class EnterpriseOnboardingUserWeb extends Common {
	By txtPhoneNumber = By.id("Phone");
	By txtEmail = By.id("Email");
	By txtFirstName = By.id("FirstName");
	By txtLastName = By.id("LastName");
	By drpAccountName = By.id("AccountID");
	By drpAccountNameInSearch = By.id("cmbAccountID");
	By txtPhoneInSearch = By.id("txtPhone");
	By drpUserTypeInSearch = By.id("cmbUserType");
	By txtFirstNameInSearch = By.id("txtFirstName");
	By txtLastNameInSearch = By.id("txtLastName");
	By txtPhoneNumberInSearch = By.id("txtPhone");
	By txtEmailInSearch = By.id("txtEmail");
	By drpStatus = By.id("IsActive");
	By drpUserAccess = By.id("UserAccess");
	By drpUserAccessInSearch = By.id("cmbUserAccess");

	public EnterpriseOnboardingUserWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder Send Text In PhoneNumber Field
	 * @param PhoneNumber
	 * @creation date 28/11/2018
	 */
	public void sendTextInPhoneNumber(String PhoneNumber) {
		sendTextInTextBox(txtPhoneNumber, PhoneNumber);
	}

	/**
	 * @author kutbuddin.compounder Send Text In Email Field
	 * @param Email
	 * @creation date 28/11/2018
	 */
	public void sendTextInEmail(String Email) {
		clearAndSendTextInTextBox(txtEmail, Email);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FirstName Field
	 * @param FirstName
	 * @creation date 28/11/2018
	 */
	public void sendTextInFirstName(String FirstName) {
		clearAndSendTextInTextBox(txtFirstName, FirstName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In LastName Field
	 * @param LastName
	 * @creation date 28/11/2018
	 */
	public void sendTextInLastName(String LastName) {
		clearAndSendTextInTextBox(txtLastName, LastName);
	}

	/**
	 * @author kutbuddin.compounder select AccountName Field
	 * @param AccountName
	 * @creation date 28/11/2018
	 */
	public void selectAccountName(String AccountName) {
		selectFromDropdown(drpAccountName, AccountName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FilterSearch AccountName Field
	 * @param AccountName
	 * @creation date 28/11/2018
	 */
	public void selectTextInAccountNameInSearch(String AccountName) {
		selectFromDropdown(drpAccountNameInSearch, AccountName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FilterSearch AccountName Field
	 * @param AccountName
	 * @creation date 28/11/2018
	 */
	public void selectuserTypeInSearch(String userType) {
		selectFromDropdown(drpUserTypeInSearch, userType);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FilterSearch Phone Field
	 * @param Phone
	 * @creation date 28/11/2018
	 */
	public void sendTextInPhoneInSearch(String Phone) {
		clearAndSendTextInTextBox(txtPhoneInSearch, Phone);
	}

	/**
	 * @author kutbuddin.compounder Send TextInSearchPhoneNumber Field
	 * @param PhoneNumber
	 * @creation date 28/11/2018
	 */
	public void sendTextInPhoneNumberInSearch(String PhoneNumber) {
		sendTextInTextBox(txtPhoneInSearch, PhoneNumber);
	}

	/**
	 * @author kutbuddin.compounder Send TextInSearchEmail Field
	 * @param Email
	 * @creation date 28/11/2018
	 */
	public void sendTextInEmailInSearch(String Email) {
		clearAndSendTextInTextBox(txtEmailInSearch, Email);
	}

	/**
	 * @author kutbuddin.compounder Send TextInSearchFirstName Field
	 * @param FirstName
	 * @creation date 28/11/2018
	 */
	public void sendTextInFirstNameInSearch(String FirstName) {
		clearAndSendTextInTextBox(txtFirstNameInSearch, FirstName);
	}

	/**
	 * @author kutbuddin.compounder Send TextInSearch lastName Field
	 * @param lastName
	 * @creation date 28/11/2018
	 */
	public void sendTextInLastNameInSearch(String lastName) {
		clearAndSendTextInTextBox(txtLastNameInSearch, lastName);
	}

	/**
	 * @author kutbuddin.compounder Select Status
	 * @param Status
	 * @creation date 28/11/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author kutbuddin.compounder click on CheckBOx Feild
	 * @param value
	 * @creation date 28/11/2018
	 */
	public void clickOnUserType(By element) {
		clickOnElement(element);
	}

	/**
	 * @author kutbuddin.compounder select useraccess in dropdown
	 * @param UserAccess
	 * @creation date 28/11/2018
	 */
	public void selectUserAccess(String UserAccess) {
		selectFromDropdown(drpUserAccess, UserAccess);
	}

	/**
	 * @author kutbuddin.compounder select useraccess in filter search dropdown
	 * @param UserAccess
	 * @creation date 28/11/2018
	 */
	public void selectuserAccessInFilterSearch(String UserAccess) {
		selectFromDropdown(drpUserAccessInSearch, UserAccess);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FilterSearch Field
	 * @creation date 28/11/2018
	 */
	public void filterSearch(String firstName, String lastName, String phoneNumber, String email, String accountName,
			String userType, String userAccess) {
		filterSearch();
		sendTextInFirstNameInSearch(firstName);
		sendTextInLastNameInSearch(lastName);
		sendTextInPhoneInSearch(phoneNumber);
		sendTextInEmailInSearch(email);
		selectTextInAccountNameInSearch(accountName);
		if (!userType.toString().equals("")) {
			selectuserTypeInSearch(userType);
		}
		selectuserAccessInFilterSearch(userAccess);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder to add OnboardingUser
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/11/2018
	 */
	public void addOnboardingUser(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectAccountName(map.get(mapKeys.get(0)).toString());
		if (!map.get(mapKeys.get(1)).toString().equals("")) {
			clickOnUserType(By
					.xpath("//*[normalize-space(text()) = 'User Type']//following-sibling :: div//label[contains(text() ,'"
							+ map.get(mapKeys.get(1)).toString() + "')]"));
		}
		selectUserAccess(map.get(mapKeys.get(7)).toString());
		sendTextInFirstName(map.get(mapKeys.get(2)).toString());
		sendTextInLastName(map.get(mapKeys.get(3)).toString());
		sendTextInEmail(map.get(mapKeys.get(4)).toString());
		sendTextInPhoneNumber(map.get(mapKeys.get(5)).toString());
		selectStatus(map.get(mapKeys.get(6)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author kutbuddin.compounder to verify add OnboardingUser
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/11/2018
	 */
	public boolean verifyAddedOnboardingUser(Map<Object, Object> map, List<Object> mapKeys) {
		By phone = By.xpath("//*[normalize-space(text()) = '" + ConstantsFile.PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(5)).toString()
				+ "']");
		By email = By.xpath("//*[normalize-space(text()) = '" + ConstantsFile.EMAIL
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(4)).toString()
				+ "']");
		By firstName = By.xpath("//*[normalize-space(text()) = '" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(2)).toString()
				+ "']");
		By lastName = By.xpath("//*[normalize-space(text()) = '" + ConstantsFile.LAST_NAME_TA
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(3)).toString()
				+ "']");
		By accountName = By.xpath("//*[normalize-space(text()) = '" + ConstantsFile.ACCOUNT
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(0)).toString()
				+ "']");
		By userType = By.xpath("//*[normalize-space(text()) = '" + ConstantsFile.USER_TYPE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(1)).toString()
				+ "']");
		By userAccess = By.xpath("//*[normalize-space(text()) = '" + ConstantsFile.USER_ACCESS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(7)).toString()
				+ "']");
		By status = By.xpath("//*[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(6)).toString()
				+ "']");
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(3)).toString(),
				map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(4)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(7)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (maskingAllowed) {
				if (!verifyElement(phone, false))
					return false;
				if (!verifyElement(email, false))
					return false;
			}
			if (!map.get(mapKeys.get(1)).toString().equals("")) {
				if (!verifyElement(userType, false))
					return false;
			}
			if (!verifyElement(userAccess, false))
				return false;
			if (!verifyElement(firstName, false))
				return false;
			if (!verifyElement(lastName, false))
				return false;
			if (!verifyElement(accountName, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author kutbuddin.compounder to edit OnboardingUser
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/11/2018
	 */
	public void editOnboardingUser(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(4)).toString(),
				map.get(mapKeys.get(8)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(10)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnEditBtn();
			sendTextInFirstName(map.get(mapKeys.get(3)).toString());
			sendTextInLastName(map.get(mapKeys.get(5)).toString());
			sendTextInEmail(map.get(mapKeys.get(7)).toString());
			selectStatus(map.get(mapKeys.get(9)).toString());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author kutbuddin.compounder to verify edit OnboardingUser
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/11/2018
	 */
	public boolean verifyEditedOnboardingUser(Map<Object, Object> map, List<Object> mapKeys) {
		By phone = By
				.xpath("//*[normalize-space(text()) = '"+ConstantsFile.PHONE+"']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By email = By
				.xpath("//*[normalize-space(text()) = '"+ConstantsFile.EMAIL+"']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "']");
		By firstName = By
				.xpath("//*[normalize-space(text()) = '"+ConstantsFile.FIRST_NAME+"']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By lastName = By
				.xpath("//*[normalize-space(text()) = '"+ConstantsFile.LAST_NAME_TA+"']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By accountName = By
				.xpath("//*[normalize-space(text()) = '"+ConstantsFile.ACCOUNT+"']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By userType = By
				.xpath("//*[normalize-space(text()) = '"+ConstantsFile.USER_TYPE+"']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By status = By
				.xpath("//*[normalize-space(text()) = '"+ConstantsFile.STATUS+"']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(9)).toString() + "']");
		filterSearch(map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(8)).toString(), map.get(mapKeys.get(7)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(10)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (maskingAllowed) {
				if (!verifyElement(phone, false))
					return false;
				if (!verifyElement(email, false))
					return false;
			}
			if (!map.get(mapKeys.get(1)).toString().equals("")) {
				if (!verifyElement(userType, false))
					return false;
			}
			if (!verifyElement(firstName, false))
				return false;
			if (!verifyElement(lastName, false))
				return false;
			if (!verifyElement(accountName, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author kutbuddin.compounder to delete OnboardingUser
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/11/2018
	 */
	public boolean deleteOnboardingUser(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(3)).toString(),
				map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(4)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(7)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (verifyDeleteBtn())
				delete();
			else
				clickOnBackBtn();
			return true;
		} else {
			String string = "Enterprise OnboardingUser already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifydeletedOnboardingUser(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(3)).toString(),
					map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(4)).toString(),
					map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
					map.get(mapKeys.get(7)).toString());
			return !verifyElement(
					By.xpath("(//td[normalize-space(text())='" + map.get(mapKeys.get(0)).toString().trim()
							+ "']//following-sibling::td[@data-title='Status' and normalize-space(text())='Delete'])[last()]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify enterprise OnBoardingUser log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 18/12/2018
	 * @return true if EnterpriseOnBoardingUser Log successfully Verified
	 */
	public boolean verifyEnterpriseOnBoardingUserLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(8)).toString(), map.get(mapKeys.get(7)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(7)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(8)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(8)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort enterprise onboardingUser
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortOnboardingUser(Map<Object, Object> map, List<Object> mapKeys) {
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
