package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

/**
 * @author shivani.patel Actions of Settings - SystemPreference - OperationUser
 * @creation date 16/10/2018
 */

public class SettingsSystemPreferenceOperationUserWeb extends Common {
	By txtFirstName = By.id("FirstName");
	By txtLastName = By.id("LastName");
	By txtPhone = By.id("Phone");
	By txtEmailAddress = By.id("Email");
	By drpCountry = By.id("CountryID");
	By drpState = By.id("CountryStateID");
	By drpStatus = By.id("IsActive");
	By txtPhoneSearch = By.id("txtPhone");
	By txtEmailSearch = By.id("txtEmail");

	/**
	 * @author shivani.patel
	 * @param driver
	 *            constructor
	 * @creation date 16/10/2018
	 */
	public SettingsSystemPreferenceOperationUserWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel send text in FirstName Field
	 * @param FirstName
	 * @creation date 16/10/2018
	 */
	public void sendTextInFirstName(String FirstName) {
		clearAndSendTextInTextBox(txtFirstName, FirstName);
	}

	/**
	 * @author shivani.patel send text in LastName Field
	 * @param LastName
	 * @creation date 16/10/2018
	 */
	public void sendTextInLastName(String LastName) {
		clearAndSendTextInTextBox(txtLastName, LastName);
	}

	/**
	 * @author shivani.patel send text in Phone Field
	 * @param Phone
	 * @creation date 16/10/2018
	 */
	public void sendTextInPhone(String Phone) {
		clearAndSendTextInTextBox(txtPhone, Phone);
	}

	/**
	 * @author shivani.patel send text in EmailAddress Field
	 * @param EmailAddress
	 * @creation date 16/10/2018
	 */
	public void sendTextInEmailAddress(String EmailAddress) {
		clearAndSendTextInTextBox(txtEmailAddress, EmailAddress);
	}

	/**
	 * @author shivani.patel select Country in DropDownBox
	 * @param Country
	 * @creation date 16/10/2018
	 */
	public void selectCountry(String Country) {
		selectFromDropdown(drpCountry, Country);
	}

	/**
	 * @author shivani.patel select State in DropDownBox
	 * @param State
	 * @creation date 16/10/2018
	 */
	public void selectState(String State) {
		selectFromDropdown(drpState, State);
	}

	/**
	 * @author shivani.patel select Status in DropDownBox
	 * @param State
	 * @creation date 16/10/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author shivani.patel select Collection Wallet in radioButton
	 * @param CollectionWallet
	 * @creation date 16/10/2018
	 */
	public void selectService(By element, String service) {
		clickOnElement(element);
	}

	/**
	 * @author shivani.patel select Disbursement Wallet in radioButton
	 * @param DisbursementWallet
	 * @creation date 16/10/2018
	 */
	public void selectDisbursementWalletInRadioButton(String DisbursementWallet) {
		clickOnElement(By.xpath(".//*[@name='SysDisbursement']//following-sibling :: label[text()='"
				+ DisbursementWallet.trim() + "']"));
	}

	/**
	 * @author shivani.patel select VendorCollection Wallet in radioButton
	 * @param VendorCollectionWallet
	 * @creation date 16/10/2018
	 */
	public void selectVendorCollectionWalletInRadioButton(String VendorCollectionWallet) {
		clickOnElement(By.xpath(".//*[@name='VendorCollection']//following-sibling :: label[text()='"
				+ VendorCollectionWallet.trim() + "']"));
	}

	/**
	 * @author shivani.patel select P2PSettlement Wallet in radioButton
	 * @param P2PSettlementWallet
	 * @creation date 16/10/2018
	 */
	public void selectP2PSettlementWalletInRadioButton(String P2PSettlementWallet) {
		clickOnElement(By.xpath(".//*[@name='SysP2PSettlement']//following-sibling :: label[text()='"
				+ P2PSettlementWallet.trim() + "']"));
	}

	/**
	 * @author shivani.patel select GoodsSettlement Wallet in radioButton
	 * @param GoodsSettlementWallet
	 * @creation date 16/10/2018
	 */
	public void selectGoodsSettlementWalletInRadioButton(String GoodsSettlementWallet) {
		clickOnElement(By.xpath(".//*[@name='SysGoodsSettlement']//following-sibling :: label[text()='"
				+ GoodsSettlementWallet.trim() + "']"));
	}

	/**
	 * @author shivani.patel select TaxCollection Wallet in radioButton
	 * @param TaxCollectionWallet
	 * @creation date 16/10/2018
	 */
	public void selectTaxCollectionWalletInRadioButton(String TaxCollectionWallet) {
		clickOnElement(By.xpath(".//*[@name='TaxCollection']//following-sibling :: label[text()='"
				+ TaxCollectionWallet.trim() + "']"));
	}

	/**
	 * @author shivani.patel send text in Phone filter Field
	 * @param Phone
	 * @creation date 16/10/2018
	 */
	public void sendTextPhoneInFilterSearch(String Phone) {
		clearAndSendTextInTextBox(txtPhoneSearch, Phone);
	}

	/**
	 * @author shivani.patel send text in EmailAddress filter Field
	 * @param EmailAddress
	 * @creation date 16/10/2018
	 */
	public void sendTextEmailInFilterSearch(String EmailAddress) {
		clearAndSendTextInTextBox(txtEmailSearch, EmailAddress);
	}

	/**
	 * @author shivani.patel use for send text in filter search Field
	 * @param Phone,Email
	 * @creation date 16/10/2018
	 */
	public void filterSearch(String Phone, String Email) {
		commonFilterSearch();
		sendTextPhoneInFilterSearch(Phone);
		sendTextEmailInFilterSearch(Email);
		clickOnFilterSearchBtn();

	}

	/**
	 * @author shivani.patel to add OperationUser
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 16/10/2018
	 */
	public void addOperationUser(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		sendTextInFirstName(map.get(keys.get(0)).toString());
		sendTextInLastName(map.get(keys.get(1)).toString());
		sendTextInPhone(map.get(keys.get(2)).toString());
		sendTextInEmailAddress(map.get(keys.get(3)).toString());
		selectCountry(map.get(keys.get(4)).toString());
		selectState(map.get(keys.get(5)).toString());
		selectStatus(map.get(keys.get(6)).toString());
		String[] service = map.get(keys.get(7)).toString().trim().split(",");
		String[] serviceName = map.get(keys.get(8)).toString().trim().split(",");
		for (int i = 0; i < service.length; i++) {
			selectService(By.xpath("//label[contains(text(),'" + service[i].trim()
					+ "')]//following-sibling :: div//following-sibling::label[normalize-space(text()) = '"
					+ serviceName[i].trim() + "']"), service[i]);
		}
		clickOnSaveBtn();
	}

	/**
	 * @author shivani.patel to verify add OperationUser
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 16/10/2018
	 * @return true if OperationUser add successfully Verified
	 */
	public boolean verifyaddOperationUser(Map<Object, Object> map, List<Object> keys) {
		By FirstName = By.xpath("//label[text()='" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(0)).toString() + "']");
		By LastName = By.xpath("//label[text()='" + ConstantsFile.LAST_NAME_TA
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(1)).toString() + "']");
		By Phone = By.xpath("//label[text()='" + ConstantsFile.PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(2)).toString() + "']");
		By EmailAddress = By.xpath("//label[text()='" + ConstantsFile.EMAIL
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(3)).toString() + "']");
		By Country = By.xpath("//label[text()='" + ConstantsFile.COUNTRY
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(4)).toString() + "']");
		By State = By.xpath("//label[text()='" + ConstantsFile.STATE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(5)).toString() + "']");
		By Status = By.xpath("//label[text()='" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(6)).toString() + "']");

		filterSearch(map.get(keys.get(2)).toString(), map.get(keys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(FirstName, false))
				return false;
			if (!verifyElement(LastName, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(Phone, false))
					return false;
				if (!verifyElement(EmailAddress, false))
					return false;
			}
			if (!verifyElement(Country, false))
				return false;
			if (!verifyElement(State, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			String[] service = map.get(keys.get(7)).toString().trim().split(",");
			String[] serviceName = map.get(keys.get(8)).toString().trim().split(",");
			for (int i = 0; i < service.length; i++) {
				if (!verifyElement(By.xpath("//label[text()='" + service[i].trim()
						+ "']//following-sibling :: div[normalize-space(text()) = '" + serviceName[i].trim() + "']"),
						false))
					return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to Edit OperationUser
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 16/10/2018
	 */
	public void editOperationUser(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(2)).toString(), map.get(keys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			sendTextInFirstName(map.get(keys.get(0)).toString());
			sendTextInLastName(map.get(keys.get(1)).toString());
			sendTextInPhone(map.get(keys.get(2)).toString());
			sendTextInEmailAddress(map.get(keys.get(4)).toString());
			selectCountry(map.get(keys.get(5)).toString());
			selectState(map.get(keys.get(6)).toString());
			selectStatus(map.get(keys.get(7)).toString());
			String[] service = map.get(keys.get(8)).toString().trim().split(",");
			String[] serviceName = map.get(keys.get(9)).toString().trim().split(",");
			for (int i = 0; i < service.length; i++) {
				selectService(By.xpath("//label[contains(text(),'" + service[i].trim()
						+ "')]//following-sibling :: div//following-sibling::label[normalize-space(text()) = '"
						+ serviceName[i].trim() + "']"), service[i]);
			}
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel to verify edit OperationUser
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 16/10/2018
	 * @return true if OperationUser edit successfully Verified
	 */
	public boolean verifyeditOperationUser(Map<Object, Object> map, List<Object> keys) {
		By FirstName = By.xpath("//label[text()='" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(0)).toString() + "']");
		By LastName = By.xpath("//label[text()='" + ConstantsFile.LAST_NAME_TA
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(1)).toString() + "']");
		By Phone = By.xpath("//label[text()='" + ConstantsFile.PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(2)).toString() + "']");
		By EmailAddress = By.xpath("//label[text()='" + ConstantsFile.EMAIL
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(4)).toString() + "']");
		By Country = By.xpath("//label[text()='" + ConstantsFile.COUNTRY
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(5)).toString() + "']");
		By State = By.xpath("//label[text()='" + ConstantsFile.STATE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(6)).toString() + "']");
		By Status = By.xpath("//label[text()='" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(7)).toString() + "']");

		filterSearch(map.get(keys.get(2)).toString(), map.get(keys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(FirstName, false))
				return false;
			if (!verifyElement(LastName, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(Phone, false))
					return false;
				if (!verifyElement(EmailAddress, false))
					return false;
			}
			if (!verifyElement(Country, false))
				return false;
			if (!verifyElement(State, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			String[] service = map.get(keys.get(8)).toString().trim().split(",");
			String[] serviceName = map.get(keys.get(9)).toString().trim().split(",");
			for (int i = 0; i < service.length; i++) {
				if (!verifyElement(By.xpath("//label[text()='" + service[i].trim()
						+ "']//following-sibling :: div[normalize-space(text()) = '" + serviceName[i].trim() + "']"),
						false))
					return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to delete OperationUser
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 16/10/2018
	 */
	public boolean deleteOperationUser(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString());
			delete();
			return true;
		} else {
			String string = "Operation User already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	/**
	 * @author shivani.patel to verify delete OperationUser
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 16/10/2018
	 * @return true if OperationUser delete successfully Verified
	 */
	public boolean verifyDeleteOperationUser(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify edit OperationUser log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 31/12/2018
	 * @return true if OperationUser Log successfully Verified
	 */
	public boolean verifyEditLogOperationUser(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort OperationalUser
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortOperationUser(Map<Object, Object> map, List<Object> mapKeys) {
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
