package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

/**
 * @author kutbuddin.compounder Actions of Agent - TerminalOnboarding
 * @creation date 06/12/2018
 */
public class MerchantTerminalOnboardingWeb extends Common {
	By txtPhone = By.id("Phone");
	By txtFirstName = By.id("FirstName");
	By txtLastName = By.id("LastName");
	By txtDOB = By.id("DOB");
	By txtEmail = By.id("Email");
	By drpAssistantRole = By.id("AssistantRole");
	By txtPhoneSearch = By.id("txtPhone");
	By txtEmailSearch = By.id("txtEmail");
	By drpTreeNameSearch = By.id("cmbTreeID");
	By drpProfileNameSearch = By.id("cmbTreeProfileID");
	By drpStatusSearch = By.id("cmbIsActive");
	By drpStatus = By.id("IsActive");

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 06/12/2018
	 */
	public MerchantTerminalOnboardingWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder common filter search method
	 * @param str1
	 * @param str2
	 * @param str3
	 * @param str4
	 * @param str5
	 * @creation date 06/12/2018
	 */
	public void filterSearch(String str1, String str2, String str3, String str4, String str5, boolean isStatusSelect) {
		commonFilterSearch();
		sendTextInPhoneInSearch(str1);
		sendTextInEmailInSearch(str2);
		selectTextInTreeNameInSearch(str3);
		selectTextInProfileNameInSearch(str4);
		if(isStatusSelect)
			selectTextInStatusInSearch(str5);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder to send text in phone
	 * @param phone
	 * @creation date 06/12/2018
	 */
	public void sendTextInPhone(String phone) {
		clearAndSendTextInTextBox(txtPhone, phone);
	}

	/**
	 * @author kutbuddin.compounder to send text in email
	 * @param email
	 * @creation date 06/12/2018
	 */
	public void sendTextInEmail(String email) {
		clearAndSendTextInTextBox(txtEmail, email);
	}

	/**
	 * @author kutbuddin.compounder to send text in first name
	 * @param firstName
	 * @creation date 06/12/2018
	 */
	public void sendTextInFirstName(String firstName) {
		clearAndSendTextInTextBox(txtFirstName, firstName);
	}

	/**
	 * @author kutbuddin.compounder to send text in last name
	 * @param lastName
	 * @creation date 06/12/2018
	 */
	public void sendTextInLastName(String lastName) {
		clearAndSendTextInTextBox(txtLastName, lastName);
	}

	/**
	 * @author kutbuddin.compounder to send text in date of birth
	 * @param dob
	 * @creation date 06/12/2018
	 */
	public void sendTextInDOB(String dob) {
		sendTextWithRemoveReadOnlyProperty(dob, txtDOB);
	}

	/**
	 * @author kutbuddin.compounder to navigate to profile
	 * @param parentProfileName
	 * @creation date 06/12/2018
	 */
	public void clickOnParentProfile(By parentProfileName) {
		clickOnElement(parentProfileName);
	}

	/**
	 * @author kutbuddin.compounder to select text in assistant role
	 * @param profile
	 * @creation date 06/12/2018
	 */
	public void selectTextInAssistantRole(String assistantRole) {
		selectFromDropdown(drpAssistantRole, assistantRole);
	}

	/**
	 * @author kutbuddin.compounder to select text in tree name in filter search
	 * @param treeName
	 * @creation date 06/12/2018
	 */
	public void selectTextInTreeNameInSearch(String treeName) {
		selectFromDropdown(drpTreeNameSearch, treeName);
	}

	/**
	 * @author kutbuddin.compounder to select text in profile name in filter
	 *         search
	 * @param profileName
	 * @creation date 06/12/2018
	 */
	public void selectTextInProfileNameInSearch(String profileName) {
		selectFromDropdown(drpProfileNameSearch, profileName);
	}

	/**
	 * @author kutbuddin.compounder to select text in status in filter search
	 * @param status
	 * @creation date 06/12/2018
	 */
	public void selectTextInStatusInSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author kutbuddin.compounder to select text in status
	 * @param status
	 * @creation date 06/12/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author kutbuddin.compounder to send text in phone in filter search
	 * @param phone
	 * @creation date 06/12/2018
	 */
	public void sendTextInPhoneInSearch(String phone) {
		clearAndSendTextInTextBox(txtPhoneSearch, phone);
	}

	/**
	 * @author kutbuddin.compounder to send text in email in filter search
	 * @param email
	 * @creation date 06/12/2018
	 */
	public void sendTextInEmailInSearch(String email) {
		clearAndSendTextInTextBox(txtEmailSearch, email);
	}

	/**
	 * @author kutbuddin.compounder to add TerminalOnboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @return
	 * @creation date 06/12/2018
	 */
	public boolean addTerminalOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By
				.xpath("(//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			clickOnAddBtn();
			if (getStriptText())
				return false;
			else {
				sendTextInFirstName(map.get(mapKeys.get(3)).toString());
				sendTextInLastName(map.get(mapKeys.get(4)).toString());
				sendTextInPhone(map.get(mapKeys.get(5)).toString());
				sendTextInEmail(map.get(mapKeys.get(6)).toString());
				sendTextInDOB(map.get(mapKeys.get(7)).toString());
				clickOnSaveBtn();
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify TerminalOnboarding added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 06/12/2018
	 * @return true if TerminalOnboarding added successfully
	 */
	public boolean verifyTerminalOnboardingAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By treeName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.TREE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(1)).toString()
				+ "']");
		By profileName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.TREE_PROFILE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(2)).toString()
				+ "']");
		By firstName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(3)).toString()
				+ "']");
		By lastName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.LAST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(4)).toString()
				+ "']");
		By phone = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(5)).toString()
				+ "']");
		By email = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.EMAIL_ADDRESS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(6)).toString()
				+ "']");
		By dob = By.xpath("//label[normalize-space(text()) = 'Date Of Birth']//following-sibling :: div[contains(text(),'" + map.get(mapKeys.get(7)).toString().replaceAll("/", "-") + "')]");
		By parentProfile = By
				.xpath("(//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(6)).toString(),
					map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
					map.get(mapKeys.get(8)).toString(), true);
			if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(5)).toString() + "'])[1]"), false)) {
				clickOnInfoBtn(map.get(mapKeys.get(5)).toString());
				if (!verifyElement(treeName, false))
					return false;
				if (!verifyElement(profileName, false))
					return false;
				if (!verifyElement(firstName, false))
					return false;
				if (!verifyElement(lastName, false))
					return false;
				if (maskingAllowed) {
					if (!verifyElement(phone, false))
						return false;
					if (!verifyElement(email, false))
						return false;
				}
				if (!verifyElement(dob, false))
					return false;
				if (!verifyElement(dob, false))
					return false;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * @author kutbuddin.compounder to edit TerminalOnboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 06/12/2018
	 */
	public void editTerminalOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By.xpath("(//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(6)).toString(),
					map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
					map.get(mapKeys.get(9)).toString(), true);
			if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(5)).toString() + "'])[1]"), false)) {
				clickOnInfoBtn(map.get(mapKeys.get(5)).toString());
				clickOnEditBtn();
				sendTextInFirstName(map.get(mapKeys.get(3)).toString());
				sendTextInLastName(map.get(mapKeys.get(4)).toString());
				sendTextInEmail(map.get(mapKeys.get(7)).toString());
				sendTextInDOB(map.get(mapKeys.get(8)).toString());
				selectTextInStatus(map.get(mapKeys.get(10)).toString());
				clickOnSaveBtn();
			} else {
				verifyFalse(true);
			}
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author kutbuddin.compounder to verify TerminalOnboarding edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 20/11/2018
	 * @return true if TerminalOnboarding edited successfully
	 */
	public boolean verifyTerminalOnboardingEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By treeName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.TREE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(1)).toString()
				+ "']");
		By profileName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.TREE_PROFILE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(2)).toString()
				+ "']");
		By firstName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(3)).toString()
				+ "']");
		By lastName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.LAST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(4)).toString()
				+ "']");
		By phone = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(5)).toString()
				+ "']");
		By email = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.EMAIL_ADDRESS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(7)).toString()
				+ "']");
		By dob = By.xpath("//label[normalize-space(text()) = 'Date Of Birth']//following-sibling :: div[contains(text(),'" + map.get(mapKeys.get(8)).toString() + "')]");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(10)).toString()
				+ "']");
		By parentProfile = By.xpath("(//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(7)).toString(),
					map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
					map.get(mapKeys.get(10)).toString(), true);
			if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(5)).toString() + "'])[1]"), false)) {
				clickOnInfoBtn(map.get(mapKeys.get(5)).toString());
				if (!verifyElement(treeName, false))
					return false;
				if (!verifyElement(profileName, false))
					return false;
				if (!verifyElement(firstName, false))
					return false;
				if (!verifyElement(lastName, false))
					return false;
				if (maskingAllowed) {
					if (!verifyElement(phone, false))
						return false;
					if (!verifyElement(email, false))
						return false;
				}
				if (!verifyElement(dob, false))
					return false;
				if (!verifyElement(dob, false))
					return false;
				if (!verifyElement(status, false))
					return false;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * @author kutbuddin.compounder to delete TerminalOnboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 22/11/2018
	 */
	public boolean deleteTerminalOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
		if (verifyElement(parentProfile, true)) {
			clickOnParentProfile(parentProfile);
			filterSearch(map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(4)).toString(),
					map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
					map.get(mapKeys.get(5)).toString(), false);
			if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString() + "'])[1]"),
					false)) {
				clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString());
				delete();
				return true;
			} else {
				String string = "Terminal is already deleted";
				log("</br><b style='color:#02563d'>" + string + "</b>");
			}
			return false;
		} else {
			return false;
		}

	}

	public boolean verifyTerminalOnboardingDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
			if (verifyElement(parentProfile, false)) {
				clickOnParentProfile(parentProfile);
				filterSearch(map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(4)).toString(),
						map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
						map.get(mapKeys.get(5)).toString(), false);
				return !verifyElement(
						By.xpath("//td[normalize-space(text())='" + map.get(getMapKeys(map).get(3)).toString()
								+ "']//following-sibling::td[@data-title='Status' and normalize-space(text())='Delete']"),
						false);
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	/**
	 * @author dishant.doshi to sort merchant terminal onboarding
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 20/12/2018
	 */
	public boolean sortTerminalOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			List<String> list = addColumnInGrid();
			if (verifyColumnInGrid(list)) {
				pagination();
				Map<String, List<String>> getBeforeSortTableData = getTableData(
						map.get(getMapKeys(map).get(3)).toString());
				clickOnSortBtn(map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(2)).toString());
				List<String> sortedUIColumnData = getColumnData(map.get(getMapKeys(map).get(1)).toString());
				List<String> sortedUIColumnDataCopy = new ArrayList<>(sortedUIColumnData);
				sortColumn(sortedUIColumnData, map.get(getMapKeys(map).get(2)).toString());
				if (!compareTwoLists(sortedUIColumnData, sortedUIColumnDataCopy))
					return false;
				Map<String, List<String>> getAfterSortTableData = getTableData(
						map.get(getMapKeys(map).get(3)).toString());
				if (!getBeforeSortTableData.equals(getAfterSortTableData))
					return false;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
