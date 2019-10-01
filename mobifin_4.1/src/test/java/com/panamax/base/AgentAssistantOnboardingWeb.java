package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

/**
 * @author dishant.doshi Actions of Agent - AssistantOnboarding
 * @creation date 30/11/2018
 */
public class AgentAssistantOnboardingWeb extends Common {
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
	By btnLog = By.xpath("(//button//*[normalize-space(text())='Log'])[last()]");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 30/11/2018
	 */
	public AgentAssistantOnboardingWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi common filter search method
	 * @param str1
	 * @param str2
	 * @param str3
	 * @param str4
	 * @param str5
	 * @param isStatusSelect
	 * @creation date 30/11/2018
	 */
	public void filterSearch(String str1, String str2, String str3, String str4, String str5, boolean isStatusSelect) {
		commonFilterSearch();
		sendTextInPhoneInSearch(str1);
		sendTextInEmailInSearch(str2);
		selectTextInTreeNameInSearch(str3);
		selectTextInProfileNameInSearch(str4);
		if (isStatusSelect)
			selectTextInStatusInSearch(str5);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to send text in phone
	 * @param phone
	 * @creation date 30/11/2018
	 */
	public void sendTextInPhone(String phone) {
		clearAndSendTextInTextBox(txtPhone, phone);
	}

	/**
	 * @author dishant.doshi to send text in email
	 * @param email
	 * @creation date 30/11/2018
	 */
	public void sendTextInEmail(String email) {
		clearAndSendTextInTextBox(txtEmail, email);
	}

	/**
	 * @author dishant.doshi to send text in first name
	 * @param firstName
	 * @creation date 30/11/2018
	 */
	public void sendTextInFirstName(String firstName) {
		clearAndSendTextInTextBox(txtFirstName, firstName);
	}

	/**
	 * @author dishant.doshi to send text in last name
	 * @param lastName
	 * @creation date 30/11/2018
	 */
	public void sendTextInLastName(String lastName) {
		clearAndSendTextInTextBox(txtLastName, lastName);
	}

	/**
	 * @author dishant.doshi to send text in date of birth
	 * @param dob
	 * @creation date 30/11/2018
	 */
	public void sendTextInDOB(String dob) {
		sendTextWithRemoveReadOnlyProperty(dob, txtDOB);
	}

	/**
	 * @author dishant.doshi to navigate to profile
	 * @param parentProfileName
	 * @creation date 30/11/2018
	 */
	public void clickOnParentProfile(By parentProfileName) {
		clickOnElement(parentProfileName);
	}

	/**
	 * @author dishant.doshi to select text in assistant role
	 * @param profile
	 * @creation date 30/11/2018
	 */
	public void selectTextInAssistantRole(String assistantRole) {
		selectFromDropdown(drpAssistantRole, assistantRole);
	}

	/**
	 * @author dishant.doshi to select text in tree name in filter search
	 * @param treeName
	 * @creation date 30/11/2018
	 */
	public void selectTextInTreeNameInSearch(String treeName) {
		selectFromDropdown(drpTreeNameSearch, treeName);
	}

	/**
	 * @author dishant.doshi to select text in profile name in filter search
	 * @param profileName
	 * @creation date 30/11/2018
	 */
	public void selectTextInProfileNameInSearch(String profileName) {
		selectFromDropdown(drpProfileNameSearch, profileName);
	}

	/**
	 * @author dishant.doshi to select text in status in filter search
	 * @param status
	 * @creation date 30/11/2018
	 */
	public void selectTextInStatusInSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author dishant.doshi to select text in status
	 * @param status
	 * @creation date 30/11/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to send text in phone in filter search
	 * @param phone
	 * @creation date 30/11/2018
	 */
	public void sendTextInPhoneInSearch(String phone) {
		clearAndSendTextInTextBox(txtPhoneSearch, phone);
	}

	/**
	 * @author dishant.doshi to send text in email in filter search
	 * @param email
	 * @creation date 30/11/2018
	 */
	public void sendTextInEmailInSearch(String email) {
		clearAndSendTextInTextBox(txtEmailSearch, email);
	}

	/**
	 * @author dishant.doshi to add AssistantOnboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @return
	 * @creation date 30/11/2018
	 */
	public boolean addAssistantOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By
				.xpath("(//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "'])[last()]");
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
				selectTextInAssistantRole(map.get(mapKeys.get(8)).toString());
				clickOnSaveBtn();
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to verify AssistantOnboarding added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/11/2018
	 * @return true if AssistantOnboarding added successfully
	 */
	public boolean verifyAssistantOnboardingAdded(Map<Object, Object> map, List<Object> mapKeys) {
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
		By dob = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.DATE_OF_BIRTH
				+ "']//following-sibling :: div[contains(text(),'"
				+ map.get(mapKeys.get(7)).toString().replaceAll("/", "-") + "')]");
		By assistnatRole = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.ASSISTANT_ROLE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(8)).toString()
				+ "']");
		By parentProfile = By
				.xpath("(//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "'])[last()]");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(6)).toString(),
					map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
					map.get(mapKeys.get(9)).toString(), true);
			if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(3)).toString()
					+ map.get(mapKeys.get(4)).toString() + "'])[1]"), false)) {
				clickOnInfoBtn(map.get(mapKeys.get(3)).toString() + map.get(mapKeys.get(4)).toString());
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
				if (!verifyElement(assistnatRole, false))
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
	 * @author dishant.doshi to edit AssistantOnboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/11/2018
	 */
	public void editAssistantOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(6)).toString(),
					map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
					map.get(mapKeys.get(10)).toString(), true);
			if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(3)).toString()
					+ map.get(mapKeys.get(4)).toString() + "'])[1]"), false)) {
				clickOnInfoBtn(map.get(mapKeys.get(3)).toString() + map.get(mapKeys.get(4)).toString());
				clickOnEditBtn();
				sendTextInFirstName(map.get(mapKeys.get(3)).toString());
				sendTextInLastName(map.get(mapKeys.get(4)).toString());
				sendTextInEmail(map.get(mapKeys.get(7)).toString());
				sendTextInDOB(map.get(mapKeys.get(8)).toString());
				selectTextInAssistantRole(map.get(mapKeys.get(9)).toString());
				selectTextInStatus(map.get(mapKeys.get(11)).toString());
				clickOnSaveBtn();
			} else {
				verifyFalse(true);
			}
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify AssistantOnboarding edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 20/11/2018
	 * @return true if AssistantOnboarding edited successfully
	 */
	public boolean verifyAssistantOnboardingEdited(Map<Object, Object> map, List<Object> mapKeys) {
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
		By dob = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.DATE_OF_BIRTH
				+ "']//following-sibling :: div[contains(text(),'" + map.get(mapKeys.get(8)).toString() + "')]");
		By assistnatRole = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.ASSISTANT_ROLE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(9)).toString()
				+ "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(10)).toString()
				+ "']");
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(7)).toString(),
					map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
					map.get(mapKeys.get(11)).toString(), true);
			if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(3)).toString()
					+ map.get(mapKeys.get(4)).toString() + "'])[1]"), false)) {
				clickOnInfoBtn(map.get(mapKeys.get(3)).toString() + map.get(mapKeys.get(4)).toString());
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
				if (!verifyElement(assistnatRole, false))
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
	 * @author dishant.doshi to verify AssistantOnboarding deleted?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 20/11/2018
	 * @return true if AssistantOnboarding deleted successfully
	 */
	public boolean deleteAssistantOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			filterSearch(map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(4)).toString(),
					map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
					map.get(mapKeys.get(5)).toString(), true);
			if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(6)).toString()
					+ map.get(getMapKeys(map).get(7)).toString() + "'])[1]"), false)) {
				clickOnInfoBtn(map.get(getMapKeys(map).get(6)).toString() + map.get(getMapKeys(map).get(7)).toString());
				delete();
				return true;
			} else {
				String string = "Assistant already deleted";
				log("</br><b style='color:#02563d'>" + string + "</b>");
			}
			return false;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to delete AssistantOnboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 22/11/2018
	 */
	public boolean verifyAssistantOnboardingDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
			if (verifyElement(parentProfile, false)) {
				clickOnParentProfile(parentProfile);
				filterSearch(map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(4)).toString(),
						map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
						map.get(mapKeys.get(5)).toString(), false);
				return !verifyElement(
						By.xpath("(//td[normalize-space(text())='" + map.get(getMapKeys(map).get(6)).toString()
								+ map.get(getMapKeys(map).get(7)).toString()
								+ "']//following-sibling::td[@data-title='Status' and text()='Delete'])[last()]"),
						false);
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify customer AssistantOnboarding log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/12/2018
	 * @return true if AgentAssistantOnboarding Log successfully Verified
	 */
	public boolean verifyAgentAssistantOnboardingLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(10)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(5)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(5)).toString());
			if (verifyElement(btnLog, false))
				return verifyLogPagination();
			return false;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort agent assistant onboarding
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 14/12/2018
	 */
	public boolean sortAssistantOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
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
