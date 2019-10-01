package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class ProductExternalVendorIntegrationWeb extends Common {
	By drpBankName = By.id("BankID");
	By txtVendorName = By.id("VendorName");
	By txtEmail = By.id("Email");
	By txtPhone = By.id("Phone");
	By txtAddress1 = By.id("Address1");
	By txtAddress2 = By.id("Address2");
	By txtCity = By.id("City");
	By drpCountry = By.id("CountryID");
	By drpState = By.id("CountryStateID");
	By drpMapcode = By.id("MapCodeID");
	By drpTimeZone = By.id("TimeZoneID");
	By drpCurrencyCode = By.id("CurrencyCodeID");
	By drpExgRateAccount = By.id("ExgRateAccountID");
	By drpDecimalPrecision = By.id("DecimalPrecision");
	By drpStatus = By.id("IsActive");
	By txtLiberyCode = By.id("Context");
	By txtVendorLoginID = By.id("VendorLoginID");
	By txtPassword = By.id("VendorKey");
	By txtConformPassword = By.id("VendorKeyConfirm");
	By txtVendorNameSearch = By.id("txtVendorName");
	By txtEmailSearch = By.id("txtEmail");
	By drpStateSearch = By.id("cmbCountryStateID");
	By drpStatusSearch = By.id("cmbIsActive");

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 15/10/2018
	 */

	public ProductExternalVendorIntegrationWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration
	 *         bankName drop down
	 * @param bankName
	 * @creation date 15/10/2018
	 */
	public void selectBankName(String bankName) {
		selectFromDropdown(drpBankName, bankName);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration vendorName
	 *         field
	 * @param vendorName
	 * @creation date 15/10/2018
	 */
	public void sendTextInVendorName(String vendorName) {
		clearAndSendTextInTextBox(txtVendorName, vendorName);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration Email field
	 * @param Email
	 * @creation date 15/10/2018
	 */

	public void sendTextInEmailAddress(String Email) {
		clearAndSendTextInTextBox(txtEmail, Email);
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration status
	 *         drop down
	 * @param Status
	 * @creation date 15/10/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);

	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration Phone field
	 * @param Phone
	 * @creation date 15/10/2018
	 */

	public void sendTextInPhoneNo(String Phone) {
		clearAndSendTextInTextBox(txtPhone, Phone);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration Address1
	 *         field
	 * @param address1
	 * @creation date 15/10/2018
	 */
	public void sendTextInAddress1(String address1) {
		clearAndSendTextInTextBox(txtAddress1, address1);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration Address2
	 *         field
	 * @param address2
	 * @creation date 15/10/2018
	 */
	public void sendTextInAddress2(String address2) {
		clearAndSendTextInTextBox(txtAddress2, address2);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration city field
	 * @param city
	 * @creation date 15/10/2018
	 */
	public void sendTextInCity(String city) {
		clearAndSendTextInTextBox(txtCity, city);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integrationPhone field
	 * @param liberyCode
	 * @creation date 15/10/2018
	 */
	public void sendTextInLiberyCode(String liberyCode) {
		clearAndSendTextInTextBox(txtLiberyCode, liberyCode);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration LoginId
	 *         field
	 * @param LoginId
	 * @creation date 15/10/2018
	 */
	public void sendTextInLogin(String LoginId) {
		findVisibleElement(txtVendorLoginID).click();
		clearAndSendTextInTextBox(txtVendorLoginID, LoginId);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration Password
	 *         field
	 * @param Password
	 * @creation date 15/10/2018
	 */
	public void sendTextInPassword(String Password) {
		findVisibleElement(txtPassword).click();
		clearAndSendTextInTextBox(txtPassword, Password);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration
	 *         conformPassword field
	 * @param conformPassword
	 * @creation date 15/10/2018
	 */
	public void sendTextInConformPassword(String conformPassword) {
		findVisibleElement(txtConformPassword).click();
		clearAndSendTextInTextBox(txtConformPassword, conformPassword);
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration country
	 *         drop down
	 * @param country
	 * @creation date 15/10/2018
	 */
	public void selectCountry(String country) {
		selectFromDropdown(drpCountry, country);
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration state
	 *         drop down
	 * @param state
	 * @creation date 15/10/2018
	 */
	public void selectState(String state) {
		selectFromDropdown(drpState, state);
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration Mapcode
	 *         drop down
	 * @param mapCode
	 * @creation date 15/10/2018
	 */
	public void selectMapcode(String mapCode) {
		selectFromDropdown(drpMapcode, mapCode);
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration
	 *         timeZone drop down
	 * @param timeZone
	 * @creation date 15/10/2018
	 */
	public void selectTimeZone(String timeZone) {
		selectFromDropdown(drpTimeZone, timeZone);

	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration
	 *         exchangeAccountNumber drop down
	 * @param exchangeAccountNumber
	 * @creation date 15/10/2018
	 */
	public void selectExchangeRateAccount(String exchangeAccountNumber) {
		selectFromDropdown(drpExgRateAccount, exchangeAccountNumber);
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration
	 *         currencyCode drop down
	 * @param currencyCode
	 * @creation date 15/10/2018
	 */
	public void selectCurrrencyCode(String currencyCode) {
		selectFromDropdown(drpCurrencyCode, currencyCode);
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration
	 *         decimalPrecision drop down
	 * @param decimalPrecision
	 * @creation date 15/10/2018
	 */
	public void selectDecimalPrecision(String decimalPrecision) {
		selectFromDropdown(drpDecimalPrecision, decimalPrecision);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration name field
	 * @param VendorNameSearch
	 * @creation date 15/10/2018
	 */
	public void sendTextInVendorNameInFilterSearch(String VendorNameSearch) {
		clearAndSendTextInTextBox(txtVendorNameSearch, VendorNameSearch);
	}

	/**
	 * @author kutbuddin.compounder send text in vendor integration emailSearch
	 *         field
	 * @param emailSearch
	 * @creation date 15/10/2018
	 */
	public void sendTextInEmailInFilterSearch(String emailSearch) {
		clearAndSendTextInTextBox(txtEmailSearch, emailSearch);
	}

	/**
	 * @author kutbuddin.compounder select value in vendor integration
	 *         stateSearch from dropdown
	 * @param stateSearch
	 * @creation date 15/10/2018
	 */
	public void selectStateInFilterSearch(String stateSearch) {
		selectFromDropdown(drpStateSearch, stateSearch);
	}

	/**
	 * @author kutbuddin.compounder select value from vendor integration status
	 *         drop down
	 * @param statusSearch
	 * @creation date 15/10/2018
	 */
	public void selectStatusInFilterSearch(String statusSearch) {
		selectFromDropdown(drpStatusSearch, statusSearch);
	}

	/**
	 * @author kutbuddin.compounder
	 * @param str1,str2,str3,str4,str5,str6
	 * @creation date 3/12/2018
	 */
	public void filterSearch(String str1, String str2, String str3, String str4) {
		commonFilterSearch();
		sendTextInVendorNameInFilterSearch(str1);
		sendTextInEmailInFilterSearch(str2);
		selectStateInFilterSearch(str3);
		selectStatusInFilterSearch(str4);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder to add Vendor Integration
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 15/10/2018
	 */
	public void addVendorIntegration(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectBankName(map.get(mapKeys.get(0)).toString());
		sendTextInVendorName(map.get(mapKeys.get(1)).toString());
		selectCountry(map.get(mapKeys.get(7)).toString());
		sendTextInEmailAddress(map.get(mapKeys.get(2)).toString());
		sendTextInPhoneNo(map.get(mapKeys.get(3)).toString());
		selectState(map.get(mapKeys.get(8)).toString());
		sendTextInAddress1(map.get(mapKeys.get(4)).toString());
		selectMapcode(map.get(mapKeys.get(9)).toString());
		sendTextInAddress2(map.get(mapKeys.get(5)).toString());
		sendTextInCity(map.get(mapKeys.get(6)).toString());
		selectTimeZone(map.get(mapKeys.get(10)).toString());
		selectCurrrencyCode(map.get(mapKeys.get(12)).toString());
		selectExchangeRateAccount(map.get(mapKeys.get(11)).toString());
		selectDecimalPrecision(map.get(mapKeys.get(13)).toString());
		selectStatus(map.get(mapKeys.get(14)).toString());
		sendTextInLiberyCode(map.get(mapKeys.get(15)).toString());
		sendTextInLogin(map.get(mapKeys.get(16)).toString());
		sendTextInPassword(map.get(mapKeys.get(17)).toString());
		sendTextInConformPassword(map.get(mapKeys.get(17)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author kutbuddin.compounder to Edit Vendor Integration
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 15/10/2018
	 */
	public void editVendorIntegration(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString(),
				map.get(getMapKeys(map).get(10)).toString(), map.get(getMapKeys(map).get(17)).toString());
		clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString());
		clickOnEditBtn();
		selectBankName(map.get(keys.get(1)).toString());
		sendTextInEmailAddress(map.get(keys.get(4)).toString());
		sendTextInAddress1(map.get(keys.get(6)).toString());
		sendTextInAddress2(map.get(keys.get(7)).toString());
		sendTextInCity(map.get(keys.get(8)).toString());
		selectCountry(map.get(keys.get(9)).toString());
		selectState(map.get(keys.get(11)).toString());
		selectMapcode(map.get(keys.get(12)).toString());
		selectTimeZone(map.get(keys.get(13)).toString());
		selectExchangeRateAccount(map.get(keys.get(14)).toString());
		selectDecimalPrecision(map.get(keys.get(16)).toString());
		selectStatus(map.get(keys.get(18)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author kutbuddin.compounder to verify vendor integration added?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 15/10/2018
	 * @return true if vendor integration added successfully
	 */
	public boolean verifyVendorIntegrationAdded(Map<Object, Object> map, List<Object> keys) {
		By bankName = By.xpath("//label[text()='Bank']//following-sibling :: div[normalize-space(text())='"
				+ map.get(keys.get(0)).toString() + "']");
		By vendorName = By.xpath("//label[text()='Vendor Name']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(1)).toString() + "']");
		By emailAddress = By.xpath("//label[text()='Email Address']//following-sibling :: div[contains(text(),'"
				+ map.get(keys.get(2)).toString() + "')]");
		By phoneNo = By.xpath("//label[text()='Phone']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(3)).toString() + "']");
		By address1 = By.xpath("//label[text()='Address1']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(4)).toString() + "']");
		By address2 = By.xpath("//label[text()='Address2']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(5)).toString() + "']");
		By city = By.xpath("//label[text()='City']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(6)).toString() + "']");
		By state = By.xpath("//label[text()='State']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(8)).toString() + "']");
		By country = By.xpath("//label[text()='Country']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(7)).toString() + "']");
		By mapCode = By.xpath("//label[text()='Map Code']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(9)).toString() + "']");
		By timeZone = By.xpath("//label[text()='Time Zone']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(10)).toString() + "']");
		By currency = By.xpath("//label[text()='Currency']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(12)).toString() + "']");
		By exchangeRateAccount = By
				.xpath("//label[text()='Exchange Rate Account']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(11)).toString() + "']");
		By decimalPrecision = By
				.xpath("//label[text()='Decimal Precision']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(13)).toString() + "']");
		By status = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(14)).toString() + "']");
		By libraryCode = By.xpath("//label[text()='Library Code']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(15)).toString() + "']");
		By loginId = By.xpath("//label[text()='Login']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(16)).toString() + "']");
		filterSearch(map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(2)).toString(),
				map.get(getMapKeys(map).get(8)).toString(), map.get(getMapKeys(map).get(14)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			if (!verifyElement(bankName, false))
				return false;
			if (!verifyElement(vendorName, false))
				return false;
			if(maskingAllowed){
				if (!verifyElement(emailAddress, false))
				return false;
				if (!verifyElement(phoneNo, false))
				return false;
			}
			if (!verifyElement(address1, false))
				return false;
			if (!verifyElement(address2, false))
				return false;
			if (!verifyElement(city, false))
				return false;
			if (!verifyElement(state, false))
				return false;
			if (!verifyElement(country, false))
				return false;
			if (!verifyElement(mapCode, false))
				return false;
			if (!verifyElement(timeZone, false))
				return false;
			if (!verifyElement(currency, false))
				return false;
			if (!verifyElement(exchangeRateAccount, false))
				return false;
			if (!verifyElement(decimalPrecision, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			if (!verifyElement(libraryCode, false))
				return false;
			if (!verifyElement(loginId, false))
				return false;
			return true;
		} else
			return false;
	}

	/**
	 * @author kutbuddin.compounder to verify vendor integration edited?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 15/10/2018
	 * @return true if vendor integration edited successfully
	 */
	public boolean verifyVendorIntegrationEdited(Map<Object, Object> map, List<Object> keys) {
		By bankName = By.xpath("//label[text()='Bank']//following-sibling :: div[normalize-space(text())='"
				+ map.get(keys.get(1)).toString() + "']");
		By vendorName = By.xpath("//label[text()='Vendor Name']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(2)).toString() + "']");
		By emailAddress = By.xpath("//label[text()='Email Address']//following-sibling :: div[contains(text(),'"
				+ map.get(keys.get(4)).toString() + "')]");
		By phoneNo = By.xpath("//label[text()='Phone']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(5)).toString() + "']");
		By address1 = By.xpath("//label[text()='Address1']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(6)).toString() + "']");
		By address2 = By.xpath("//label[text()='Address2']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(7)).toString() + "']");
		By city = By.xpath("//label[text()='City']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(8)).toString() + "']");
		By state = By.xpath("//label[text()='State']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(11)).toString() + "']");
		By country = By.xpath("//label[text()='Country']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(9)).toString() + "']");
		By mapCode = By.xpath("//label[text()='Map Code']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(12)).toString() + "']");
		By timeZone = By.xpath("//label[text()='Time Zone']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(13)).toString() + "']");
		By currency = By.xpath("//label[text()='Currency']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(15)).toString() + "']");
		By exchangeRateAccount = By
				.xpath("//label[text()='Exchange Rate Account']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(14)).toString() + "']");
		By decimalPrecision = By
				.xpath("//label[text()='Decimal Precision']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(16)).toString() + "']");
		By status = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(18)).toString() + "']");
		By libraryCode = By.xpath("//label[text()='Library Code']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(19)).toString() + "']");
		By loginId = By.xpath("//label[text()='Login']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(20)).toString() + "']");
		filterSearch(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(4)).toString(),
				map.get(getMapKeys(map).get(11)).toString(), map.get(getMapKeys(map).get(18)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString());
			if (!verifyElement(bankName, false))
				return false;
			if (!verifyElement(vendorName, false))
				return false;
			if(maskingAllowed){
				if (!verifyElement(emailAddress, false))
				return false;
				if (!verifyElement(phoneNo, false))
				return false;
			}
			if (!verifyElement(address1, false))
				return false;
			if (!verifyElement(address2, false))
				return false;
			if (!verifyElement(city, false))
				return false;
			if (!verifyElement(state, false))
				return false;
			if (!verifyElement(country, false))
				return false;
			if (!verifyElement(mapCode, false))
				return false;
			if (!verifyElement(timeZone, false))
				return false;
			if (!verifyElement(currency, false))
				return false;
			if (!verifyElement(decimalPrecision, false))
				return false;
			if (!verifyElement(exchangeRateAccount, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			if (!verifyElement(libraryCode, false))
				return false;
			if (!verifyElement(loginId, false))
				return false;
			return true;
		} else
			return false;
	}

	/**
	 * @author Kutbuddin.compounder to verify vendor integration deleted?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 15/10/2018
	 * @return true if vendor integration deleted successfully
	 */
	public boolean deleteVendorIntegration(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "vendor integration already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyVendorIntegrationDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
					map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString());
			return verifyElement(
					By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString().trim() + "'])[1]"), false);
		} else {
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify vendor integration log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 18/12/2018
	 * @return true if vendor integration  Log successfully Verified
	 */
	public boolean verifyVendorIntegrationLog(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(getMapKeys(map).get(2)).toString(),map.get(getMapKeys(map).get(4)).toString(),map.get(getMapKeys(map).get(11)).toString(),map.get(getMapKeys(map).get(18)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(2)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}
	/**
	 * @author dishant.doshi to sort product vendor integration
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortVendorIntegration(Map<Object, Object> map, List<Object> mapKeys) {
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
