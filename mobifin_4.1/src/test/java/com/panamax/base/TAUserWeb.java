package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.panamax.init.ConstantsFile;

public class TAUserWeb extends BaseWeb {

	By firstName = By.id("FirstName");
	By lastName = By.id("LastName");
	By bankName = By.id("BankID");
	By bankempID = By.id("BankEmpID");
	By userType = By.xpath("//*[@id='UserType']//following-sibling::div//input");
	By userAccess = By.id("UserAccess");
	By dateofJoining = By.id("DOJ");
	By status = By.id("IsActive");
	By idproofType = By.id("IDProofType");
	By idproofNo = By.id("IDProofNo");
	By email = By.id("Email");
	By phoneNo = By.id("Phone");
	By address1 = By.id("Address1");
	By address2 = By.id("Address2");
	By uploadPhoto = By.id("PhotoID");

	By firstNameSearch = By.id("txtFname");
	By lastNameSearch = By.id("txtLname");
	By bankNameSearch = By.id("cmbBankID");
	By bankEmpIDSearch = By.id("txtBankEmpID");
	By userAccessSearch = By.id("cmbUserAccess");
	By statusSearch = By.id("cmbIsActive");

	public TAUserWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2, String str3, String str4, String str5, String str6,
			boolean isStatusSelect) {
		commonFilterSearch();
		sendTextInFirstNameInSearch(str1);
		sendTextInLastNameInSearch(str2);
		selectTextInBankNameInSearch(str3);
		sendTextInBankEmpIDInSearch(str4);
		sendTextInUserAccessInSearch(str5);
		if (isStatusSelect)
			selectTextInStatusInSearch(str6);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            First name into the field
	 * @creation date 01/11/2018
	 */

	public void sendTextInFirstName(String FirstNametext) {
		clearAndSendTextInTextBox(firstName, FirstNametext);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            Last name into the field
	 * @creation date 01/11/2018
	 */

	public void sendTextInLastName(String LastNametext) {
		clearAndSendTextInTextBox(lastName, LastNametext);
	}

	/**
	 * @author gopal.gupta
	 * @param Bank
	 *            Name to be selected
	 * @creation date 22/10/2018
	 */

	public void selectTextInBank(String BankName) {
		selectFromDropdown(bankName, BankName);
	}

	/**
	 * @author gopal.gupta
	 * @param Usetype
	 *            to be selected
	 * @creation date 22/10/2018
	 */

	public void selectuserTypeField(String UserType) {
		selectFromDropdown(userType, UserType);
	}

	/**
	 * @author gopal.gupta
	 * @param User
	 *            Access to be selected
	 * @creation date 22/10/2018
	 */

	public void selectTextInUserAccess(String UserAccess) {
		selectFromDropdown(userAccess, UserAccess);
	}

	/**
	 * @author gopal.gupta
	 * @param ID
	 *            Proof Type to be selected
	 * @creation date 22/10/2018
	 */

	public void selectTextInIDType(String IdproofType) {
		selectFromDropdown(idproofType, IdproofType);
	}

	/**
	 * @author gopal.gupta
	 * @param Status
	 *            to be selected
	 * @creation date 22/10/2018
	 */
	public void selectTextInStatus(String Status) {
		selectFromDropdown(status, Status);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            Bank Emp ID into the field
	 * @creation date 01/11/2018
	 */
	public void sendTextInBankEmpId(String BankempIDtext) {
		clearAndSendTextInTextBox(bankempID, BankempIDtext);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            Date of Joining into the field
	 * @creation date 01/11/2018
	 */

	public void setTextInDateofjoining(By dateofJoining, String DateofJoining) {
		setDate(dateofJoining, DateofJoining);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            ID Proof No into the field
	 * @creation date 01/11/2018
	 */

	public void sendTextInIDNo(String IDproofNOtext) {
		clearAndSendTextInTextBox(idproofNo, IDproofNOtext);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            Email into the field
	 * @creation date 01/11/2018
	 */

	public void sendTextInEmail(String Emailtext) {
		clearAndSendTextInTextBox(email, Emailtext);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            Phone No into the field
	 * @creation date 01/11/2018
	 */

	public void sendTextInPhone(String Phonetext) {
		clearAndSendTextInTextBox(phoneNo, Phonetext);
	}

	/**
	 * @author gopal.gupta
	 * @param Address1
	 *            to be send
	 * @creation date 22/10/2018
	 */
	public void sendTextInAddress1(String Address1txt) {
		clearAndSendTextInTextBox(address1, Address1txt);
	}

	/**
	 * @author gopal.gupta
	 * @param Address2
	 *            to be send
	 * @creation date 30/10/2018
	 */
	public void sendTextInAddress2(String Address2txt) {
		clearAndSendTextInTextBox(address2, Address2txt);
	}

	/**
	 * @author gopal.gupta
	 * @param Upload
	 *            Image in to the field.
	 * @creation date 30/10/2018
	 */

	public void sendTextInUploadPhoto(String UploadPhotoimage) {
		sendTextInTextBox(uploadPhoto, resources_folder_path + UploadPhotoimage);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            First name into the field
	 * @creation date 12/11/2018
	 */

	public void sendTextInFirstNameInSearch(String FirstNamesearch) {
		clearAndSendTextInTextBox(firstNameSearch, FirstNamesearch);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            Last name into the field
	 * @creation date 12/11/2018
	 */

	public void sendTextInLastNameInSearch(String LastNamesearch) {
		clearAndSendTextInTextBox(lastNameSearch, LastNamesearch);
	}

	/**
	 * @author gopal.gupta
	 * @param Send
	 *            Bank employ ID into the field
	 * @creation date 12/11/2018
	 */

	public void sendTextInBankEmpIDInSearch(String BankempIDsearch) {
		clearAndSendTextInTextBox(bankEmpIDSearch, BankempIDsearch);
	}

	/**
	 * @author gopal.gupta
	 * @param Bank
	 *            Name to be selected
	 * @creation date 12/11/2018
	 */

	public void selectTextInBankNameInSearch(String Banknamesearch) {
		selectFromDropdown(bankNameSearch, Banknamesearch);
	}

	/**
	 * @author gopal.gupta
	 * @param Usetype
	 *            to be selected
	 * @creation date 12/11/2018
	 */

	public void sendTextInUserAccessInSearch(String UserAccesssearch) {
		selectFromDropdown(userAccessSearch, UserAccesssearch);
	}

	/**
	 * @author gopal.gupta
	 * @param Status
	 *            to be selected
	 * @creation date 12/11/2018
	 */

	public void selectTextInStatusInSearch(String StatusSearch) {
		selectFromDropdown(statusSearch, StatusSearch);
	}

	public void selectTextInUserType(String UserType) {
		sendTextInTextBox(userType, UserType + Keys.ENTER);
	}

	public void addTAUser(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		sendTextInFirstName(map.get(keys.get(0)).toString());
		sendTextInLastName(map.get(keys.get(1)).toString());
		selectTextInBank(map.get(keys.get(2)).toString());
		sendTextInBankEmpId(map.get(keys.get(3)).toString());

		String[] userTypes = map.get(keys.get(4)).toString().split(",");
		for (int i = 0; i < userTypes.length; i++) {
			selectTextInUserType(userTypes[i]);
		}
		selectTextInUserAccess(map.get(keys.get(5)).toString());
		if (!map.get(keys.get(6)).toString().equals("")) {
			if (map.get(keys.get(6)).toString().contains("/"))
				setTextInDateofjoining(dateofJoining, map.get(keys.get(6)).toString().replaceAll("/", "-"));
		}

		if (!map.get(keys.get(7)).toString().equals(""))
			selectTextInStatus(map.get(keys.get(7)).toString());
		if (!map.get(keys.get(8)).toString().equals(""))
			selectTextInIDType(map.get(keys.get(8)).toString());
		if (!map.get(keys.get(9)).toString().equals(""))
			sendTextInIDNo(map.get(keys.get(9)).toString());
		if (!map.get(keys.get(10)).toString().equals(""))
			sendTextInEmail(map.get(keys.get(10)).toString());
		sendTextInPhone(map.get(keys.get(11)).toString());
		if (!map.get(keys.get(12)).toString().equals(""))
			sendTextInAddress1(map.get(keys.get(12)).toString());
		if (!map.get(keys.get(13)).toString().equals(""))
			sendTextInAddress2(map.get(keys.get(13)).toString());
		if (!map.get(keys.get(14)).toString().equals(""))
			sendTextInUploadPhoto(map.get(keys.get(14)).toString());
		clickOnSaveBtn();
	}

	public boolean verifyTAUser(Map<Object, Object> map, List<Object> keys) {

		By firstName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(0)).toString() + "']");
		By lastName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.LAST_NAME_TA
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(1)).toString() + "']");
		By bankName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.BANK_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(2)).toString() + "']");
		By bankEmpID = By.xpath("//label[normalize-space(text())='" + ConstantsFile.BANK_EMP_ID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(3)).toString() + "']");
		By userAccess = By.xpath("//label[normalize-space(text())='" + ConstantsFile.USER_ACCESS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(5)).toString() + "']");
		By DOJ = By.xpath("//label[normalize-space(text())='" + ConstantsFile.DATE_OF_JOINING
				+ "']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(6)).toString().replaceAll("/", "-") + "']");
		By status = By.xpath("//label[normalize-space(text())='" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(7)).toString() + "']");
		By idproofType = By.xpath("//label[normalize-space(text())='" + ConstantsFile.ID_PROOF_TYPE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(8)).toString() + "']");
		By idProofNo = By.xpath("//label[normalize-space(text())='" + ConstantsFile.ID_PROOF_NUMBER
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(9)).toString() + "']");
		By email = By.xpath("//label[normalize-space(text())='" + ConstantsFile.EMAIL
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(10)).toString() + "']");
		By phoneNo = By.xpath("//label[normalize-space(text())='" + ConstantsFile.PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(11)).toString() + "']");
		By address1 = By.xpath("//label[normalize-space(text())='" + ConstantsFile.ADDRESS1
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(12)).toString() + "']");
		By address2 = By.xpath("//label[normalize-space(text())='" + ConstantsFile.ADDRESS2
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(13)).toString() + "']");
		By uploadPhoto = By.xpath("//label[normalize-space(text())='Photo']//following-sibling :: div//img");

		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(2)).toString(),
				map.get(keys.get(3)).toString(), map.get(keys.get(5)).toString(), map.get(keys.get(7)).toString(),
				false);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString());
			if (!verifyElement(firstName, false))
				return false;
			if (!verifyElement(lastName, false))
				return false;
			if (!verifyElement(bankName, false))
				return false;
			if (!verifyElement(bankEmpID, false))
				return false;
			String[] userTypes = map.get(keys.get(4)).toString().split(",");
			for (int i = 0; i < userTypes.length; i++) {
				By userType = By.xpath("//label[normalize-space(text())='" + ConstantsFile.USER_TYPE
						+ "']//following-sibling :: div[contains(text(),'" + userTypes[i] + "')]");
				if (!verifyElement(userType, false))
					return false;
			}
			if (!verifyElement(userAccess, false))
				return false;
			if (!verifyElement(DOJ, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			if (!verifyElement(idproofType, false))
				return false;
			if (!verifyElement(idProofNo, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(email, false))
					return false;
				if (!verifyElement(phoneNo, false))
					return false;
			}
			if (!verifyElement(address1, false))
				return false;
			if (!verifyElement(address2, false))
				return false;
			if (getAttributeValue(uploadPhoto, "src").equals(""))
				return false;

			return true;
		} else {
			return false;
		}
	}

	public void editTAUser(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString(), map.get(keys.get(4)).toString(),
				map.get(keys.get(5)).toString(), map.get(keys.get(6)).toString(), map.get(keys.get(7)).toString(),
				true);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(5)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(5)).toString());
			clickOnEditBtn();
			sendTextInFirstName(map.get(keys.get(1)).toString());
			sendTextInLastName(map.get(keys.get(3)).toString());
			selectTextInStatus(map.get(keys.get(8)).toString());
			selectTextInIDType(map.get(keys.get(9)).toString());
			sendTextInIDNo(map.get(keys.get(10)).toString());
			sendTextInEmail(map.get(keys.get(11)).toString());
			sendTextInAddress1(map.get(keys.get(13)).toString());
			sendTextInAddress2(map.get(keys.get(14)).toString());
			sendTextInUploadPhoto(map.get(keys.get(15)).toString());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	public boolean verifyEditTAUser(Map<Object, Object> map, List<Object> keys) {

		By firstName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(1)).toString() + "']");
		By lastName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.LAST_NAME_TA
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(3)).toString() + "']");
		By bankName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.BANK_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(4)).toString() + "']");
		By bankEmpID = By.xpath("//label[normalize-space(text())='" + ConstantsFile.BANK_EMP_ID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(5)).toString() + "']");
		By userAccess = By.xpath("//label[normalize-space(text())='" + ConstantsFile.USER_ACCESS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(6)).toString() + "']");
		By status = By.xpath("//label[normalize-space(text())='" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(8)).toString() + "']");
		By idproofType = By.xpath("//label[normalize-space(text())='" + ConstantsFile.ID_PROOF_TYPE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(9)).toString() + "']");
		By idProofNo = By.xpath("//label[normalize-space(text())='" + ConstantsFile.ID_PROOF_NUMBER
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(10)).toString() + "']");
		By email = By.xpath("//label[normalize-space(text())='" + ConstantsFile.EMAIL
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(11)).toString() + "']");
		By phoneNo = By.xpath("//label[normalize-space(text())='" + ConstantsFile.PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(12)).toString() + "']");
		By address1 = By.xpath("//label[normalize-space(text())='" + ConstantsFile.ADDRESS1
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(13)).toString() + "']");
		By address2 = By.xpath("//label[normalize-space(text())='" + ConstantsFile.ADDRESS2
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(14)).toString() + "']");
		By uploadPhoto = By.xpath("//label[normalize-space(text())='Photo']//following-sibling :: div//img");
		filterSearch(map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString(), map.get(keys.get(4)).toString(),
				map.get(keys.get(5)).toString(), map.get(keys.get(6)).toString(), map.get(keys.get(8)).toString(),
				true);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(5)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(5)).toString());
			if (!verifyElement(firstName, false))
				return false;
			if (!verifyElement(lastName, false))
				return false;
			if (!verifyElement(bankName, false))
				return false;
			if (!verifyElement(bankEmpID, false))
				return false;
			if (!verifyElement(userAccess, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			if (!verifyElement(idproofType, false))
				return false;
			if (!verifyElement(idProofNo, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(email, false))
					return false;
				if (!verifyElement(phoneNo, false))
					return false;
			}
			if (!verifyElement(address1, false))
				return false;
			if (!verifyElement(address2, false))
				return false;
			if (getAttributeValue(uploadPhoto, "src").equals(""))
				return false;

			return true;
		} else {
			return false;
		}
	}

	public boolean deleteTAUser(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(2)).toString(),
				map.get(keys.get(3)).toString(), map.get(keys.get(4)).toString(), map.get(keys.get(5)).toString(),
				true);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString());
			if (verifyDeleteBtn())
				delete();
			else
				clickOnBackBtn();
			return true;
		} else {
			String string = "TA User already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
			verifyFalse(false);
		}
		return false;
	}

	public boolean verifyDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
					map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(3)).toString(),
					map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(5)).toString(), false);
			return !verifyElement(
					By.xpath("(//td[normalize-space(text())='" + map.get(getMapKeys(map).get(0)).toString()
							+ "']//following-sibling::td[@data-title='Status']//div[normalize-space(text())='Delete'])[last()]"),
					false);
		} else {
			return false;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify edited Log?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 13/12/2018
	 * @return true if Ta User Verify Log SuccesFullly
	 */
	public boolean verifyTAUserLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(3)).toString(),
				map.get(getMapKeys(map).get(4)).toString(), map.get(getMapKeys(map).get(5)).toString(),
				map.get(getMapKeys(map).get(6)).toString(), map.get(getMapKeys(map).get(8)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(12)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(12)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort ta user
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
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