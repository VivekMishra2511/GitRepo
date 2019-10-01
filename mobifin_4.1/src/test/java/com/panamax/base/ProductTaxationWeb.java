package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class ProductTaxationWeb extends Common {
	By txtTaxName = By.id("taxName");
	By drpTaxType = By.id("taxType");
	By txtTaxvalue = By.id("taxValue");
	By drpTaxStatus = By.id("IsActive");
	By txtTaxBankName = By.id("bankName");
	By txtTaxAddress = By.id("address");
	By txtTaxBranchCode = By.id("branchCode");
	By txtTaxPhone = By.id("phone");
	By txtTaxBranchName = By.id("branchName");
	By drpTaxCountry = By.id("CountryID");
	By txtTaxBankAcountNumber = By.id("bankAccNum");
	By drpTaxState = By.id("CountryStateID");
	By drpTaxMapcode = By.id("MapCodeID");
	By txtTaxStackHolders = By.id("stakeholders-tokenfield");
	By txtTaxNameSearch = By.id("txtTaxName");
	By drpTaxTypeSerach = By.id("cmbTaxType");
	By txtTaxVlaueSearch = By.id("txtTaxValue");
	By drpTaxStatusSearch = By.id("cmbIsActive");

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 11/10/2018
	 */

	public ProductTaxationWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder select value from tax type drop down
	 * @param taxType
	 * @creation date 11/10/2018
	 */
	public void selectTaxType(String taxType) {
		selectFromDropdown(drpTaxType, taxType);
	}

	/**
	 * @author kutbuddin.compounder send text in tax name field
	 * @param taxName
	 * @creation date 11/10/2018
	 */
	public void sendTextInTaxame(String taxName) {
		clearAndSendTextInTextBox(txtTaxName, taxName);
	}

	/**
	 * @author kutbuddin.compounder send text in tax value field
	 * @param taxValue
	 * @creation date 11/10/2018
	 */

	public void sendTextInTaxValue(String taxValue) {
		clearAndSendTextInTextBox(txtTaxvalue, taxValue);
	}

	/**
	 * @author kutbuddin.compounder select value from tax status drop down
	 * @param taxStatus
	 * @creation date 11/10/2018
	 */
	public void selectStatus(String taxStatus) {
		selectFromDropdown(drpTaxStatus, taxStatus);
	}

	/**
	 * @author kutbuddin.compounder send text in tax bankname field
	 * @param taxBankName
	 * @creation date 11/10/2018
	 */

	public void sendTextInBankName(String taxBankName) {
		clearAndSendTextInTextBox(txtTaxBankName, taxBankName);
	}

	/**
	 * @author kutbuddin.compounder send text in tax Address field
	 * @param taxAddress
	 * @creation date 11/10/2018
	 */
	public void sendTextInAddress(String taxAddress) {
		clearAndSendTextInTextBox(txtTaxAddress, taxAddress);
	}

	/**
	 * @author kutbuddin.compounder send text in tax BranchCode field
	 * @param taxBranchCode
	 * @creation date 11/10/2018
	 */
	public void sendTextInBranchCode(String taxBranchCode) {
		clearAndSendTextInTextBox(txtTaxBranchCode, taxBranchCode);
	}

	/**
	 * @author kutbuddin.compounder send text in tax Phone field
	 * @param taxPhone
	 * @creation date 11/10/2018
	 */
	public void sendTextInPhone(String taxPhone) {
		clearAndSendTextInTextBox(txtTaxPhone, taxPhone);
	}

	/**
	 * @author kutbuddin.compounder send text in tax BranchName field
	 * @param taxBranchName
	 * @creation date 11/10/2018
	 */
	public void sendTextInBranchName(String taxBranchName) {
		clearAndSendTextInTextBox(txtTaxBranchName, taxBranchName);
	}

	/**
	 * @author kutbuddin.compounder send text in tax BankAccountNo field
	 * @param taxBankAccountNo
	 * @creation date 11/10/2018
	 */
	public void sendTextInBankAccountNo(String taxBankAccountNo) {
		clearAndSendTextInTextBox(txtTaxBankAcountNumber, taxBankAccountNo);
	}

	/**
	 * @author kutbuddin.compounder send text in tax StackHolder field
	 * @param taxStackHolder
	 * @creation date 11/10/2018
	 */
	public void sendTextInStackHolderName(String taxStackHolder) {
		clearAndSendTextInTextBox(txtTaxStackHolders, taxStackHolder + Keys.ENTER);
	}

	/**
	 * @author kutbuddin.compounder select value from tax Country drop down
	 * @param taxCountry
	 * @creation date 11/10/2018
	 */
	public void selectCountry(String taxCountry) {
		selectFromDropdown(drpTaxCountry, taxCountry);
	}

	/**
	 * @author kutbuddin.compounder select value from tax State drop down
	 * @param taxState
	 * @creation date 11/10/2018
	 */
	public void selectState(String taxState) {
		selectFromDropdown(drpTaxState, taxState);
	}

	/**
	 * @author kutbuddin.compounder select value from tax Mapcode drop down
	 * @param taxMapcode
	 * @creation date 11/10/2018
	 */
	public void selectMapcode(String taxMapcode) {
		selectFromDropdown(drpTaxMapcode, taxMapcode);
	}

	/**
	 * @author kutbuddin.compounder send text in tax name field
	 * @param taxName
	 * @creation date 11/10/2018
	 */
	public void sendTextInTaxNameInFilterSearch(String taxNameSearch) {
		clearAndSendTextInTextBox(txtTaxNameSearch, taxNameSearch);
	}

	/**
	 * @author kutbuddin.compounder send text in tax value field
	 * @param taxValue
	 * @creation date 11/10/2018
	 */
	public void sendTextInTaxValueInFilterSearch(String TaxValyeSearch) {
		clearAndSendTextInTextBox(txtTaxVlaueSearch, TaxValyeSearch);
	}

	/**
	 * @author kutbuddin.compounder send text in tax name field
	 * @param taxName
	 * @creation date 11/10/2018
	 */
	public void sendTextInTaxTypeInFilterSearch(String TaxTypeSearch) {
		selectFromDropdown(drpTaxTypeSerach, TaxTypeSearch);
	}

	/**
	 * @author kutbuddin.compounder select value from tax status drop down
	 * @param taxStatus
	 * @creation date 11/10/2018
	 */
	public void sendTextInTaxStatusInFilterSearch(String taxStatusSearch) {
		selectFromDropdown(drpTaxStatusSearch, taxStatusSearch);
	}

	/**
	 * @author kutbuddin.compounder
	 * @param str1,str2
	 * @creation date 03/12/2018
	 */
	public void filterSearch(String str1, String str2, String str3, String str4) {
		commonFilterSearch();
		sendTextInTaxNameInFilterSearch(str1);
		sendTextInTaxTypeInFilterSearch(str2);
		sendTextInTaxValueInFilterSearch(str3);
		sendTextInTaxStatusInFilterSearch(str4);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author kutbuddin.compounder get size of taxaName
	 * @creation date 18/01/2019
	 */
    public int getSizeOfTaxationName() {
    	List<String> ColumnData = getColumnData("Tax Name");
		int length=ColumnData.size();
		return length;
    }
	/**
	 * @author kutbuddin.compounder to add Taxation
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 11/10/2018
	 */
	public void addTaxation(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInTaxame(map.get(mapKeys.get(0)).toString());
		selectTaxType(map.get(mapKeys.get(1)).toString());
		sendTextInTaxValue(map.get(mapKeys.get(2)).toString());
		selectStatus(map.get(mapKeys.get(3)).toString());
		clickOnNextBtn();
		if (verifyToolTip()) {
			clickOnCancelBtn();
		} else {
			selectCountry(map.get(mapKeys.get(9)).toString());
			sendTextInBankName(map.get(mapKeys.get(4)).toString());
			sendTextInAddress(map.get(mapKeys.get(5)).toString());
			sendTextInBranchCode(map.get(mapKeys.get(6)).toString());
			sendTextInPhone(map.get(mapKeys.get(7)).toString());
			sendTextInBranchName(map.get(mapKeys.get(8)).toString());
			sendTextInBankAccountNo(map.get(mapKeys.get(10)).toString());
			selectState(map.get(mapKeys.get(11)).toString());
			selectMapcode(map.get(mapKeys.get(12)).toString());
			clickOnNextBtn();
			if(verifyToolTip()){
				clickOnCancelBtn();
			}
			else{
			sendTextInStackHolderName(map.get(mapKeys.get(13)).toString());
			clickOnSaveBtn();
			}
		}
	}

	/**
	 * @author kutbuddin.compounder to Edit Taxation
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 11/10/2018
	 */
	public void editTaxation(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString());
		clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
		clickOnEditBtn();
		sendTextInTaxValue(map.get(keys.get(2)).toString());
		selectStatus(map.get(keys.get(3)).toString());
		clickOnNextBtn();
		sendTextInBankName(map.get(keys.get(4)).toString());
		sendTextInAddress(map.get(keys.get(5)).toString());
		sendTextInBranchCode(map.get(keys.get(6)).toString());
		sendTextInPhone(map.get(keys.get(7)).toString());
		sendTextInBranchName(map.get(keys.get(8)).toString());
		selectCountry(map.get(keys.get(9)).toString());
		sendTextInBankAccountNo(map.get(keys.get(10)).toString());
		selectState(map.get(keys.get(11)).toString());
		selectMapcode(map.get(keys.get(12)).toString());
		clickOnNextBtn();
		sendTextInStackHolderName(map.get(keys.get(13)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author kutbuddin.compounder to verify taxation added?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 11/10/2018
	 * @return true if taxation added successfully
	 */
	public boolean verifyTaxationAdded(Map<Object, Object> map, List<Object> keys) {
		By taxName = By.xpath("//label[text()='Tax Name']//following-sibling :: div[normalize-space(text())='"
				+ map.get(keys.get(0)).toString() + "']");
		By taxType = By.xpath("//label[text()='Tax Type']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(1)).toString() + "']");
		By taxValue = By.xpath("//label[text()='Tax Value']//following-sibling :: div[contains(text(),'"
				+ map.get(keys.get(2)).toString() + "')]");
		By Status = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(3)).toString() + "']");
		By BankName = By.xpath("//label[text()='Bank Name']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(4)).toString() + "']");
		By BranchCode = By.xpath("//label[text()='Branch Code']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(6)).toString() + "']");
		By BranchName = By.xpath("//label[text()='Branch Name']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(8)).toString() + "']");
		By BankAccountNumber = By
				.xpath("//label[text()='Bank Account Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(10)).toString() + "']");
		By Address = By.xpath("//label[text()='Address']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(5)).toString() + "']");
		By Phone = By.xpath("//label[text()='Phone']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(7)).toString() + "']");
		By Country = By.xpath("//label[text()='Country']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(9)).toString() + "']");
		By State = By.xpath("//label[text()='State']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(11)).toString() + "']");
		// By MapCode = By.xpath("//label[text()='Map Code']//following-sibling
		// :: div[normalize-space(text()) =
		// '"+map.get(keys.get(12)).toString()+"']");
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(taxName, false))
				return false;
			if (!verifyElement(taxType, false))
				return false;
			if (!verifyElement(taxName, false))
				return false;
			if (!verifyElement(taxValue, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			if (!verifyElement(taxName, false))
				return false;
			if (!verifyElement(BankName, false))
				return false;
			if (!verifyElement(BranchCode, false))
				return false;
			if (!verifyElement(BranchName, false))
				return false;
			if (!verifyElement(BankAccountNumber, false))
				return false;
			if (!verifyElement(Address, false))
				return false;
			if(maskingAllowed){
				if (!verifyElement(Phone, false))
					return false;
			}
			if (!verifyElement(Country, false))
				return false;
			if (!verifyElement(State, false))
				return false;
			return true;
		} else
			return false;
	}

	/**
	 * @author kutbuddin.compounder to verify taxation edited?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 11/10/2018
	 * @return true if taxation edited successfully
	 */
	public boolean verifyTaxationEdited(Map<Object, Object> map, List<Object> keys) {
		By taxName = By.xpath("//label[text()='Tax Name']//following-sibling :: div[normalize-space(text())='"
				+ map.get(keys.get(0)).toString() + "']");
		By taxType = By.xpath("//label[text()='Tax Type']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(1)).toString() + "']");
		By taxValue = By.xpath("//label[text()='Tax Value']//following-sibling :: div[contains(text(),'"
				+ map.get(keys.get(2)).toString() + "')]");
		By Status = By.xpath("//label[text()='Status']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(3)).toString() + "']");
		By BankName = By.xpath("//label[text()='Bank Name']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(4)).toString() + "']");
		By BranchCode = By.xpath("//label[text()='Branch Code']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(6)).toString() + "']");
		By BranchName = By.xpath("//label[text()='Branch Name']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(8)).toString() + "']");
		By BankAccountNumber = By
				.xpath("//label[text()='Bank Account Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(10)).toString() + "']");
		By Address = By.xpath("//label[text()='Address']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(5)).toString() + "']");
		By Phone = By.xpath("//label[text()='Phone']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(7)).toString() + "']");
		By Country = By.xpath("//label[text()='Country']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(9)).toString() + "']");
		By State = By.xpath("//label[text()='State']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(11)).toString() + "']");
		// By MapCode = By.xpath("//label[text()='Map Code']//following-sibling
		// :: div[normalize-space(text()) =
		// '"+map.get(keys.get(12)).toString()+"']");
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(taxName, false))
				return false;
			if (!verifyElement(taxType, false))
				return false;
			if (!verifyElement(taxName, false))
				return false;
			if (!verifyElement(taxValue, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			if (!verifyElement(taxName, false))
				return false;
			if (!verifyElement(BankName, false))
				return false;
			if (!verifyElement(BranchCode, false))
				return false;
			if (!verifyElement(BranchName, false))
				return false;
			if (!verifyElement(BankAccountNumber, false))
				return false;
			if (!verifyElement(Address, false))
				return false;
			if(maskingAllowed){
				if (!verifyElement(Phone, false))
				return false;
			}
			if (!verifyElement(Country, false))
				return false;
			if (!verifyElement(State, false))
				return false;
			return true;
		} else
			return false;
	}

	/**
	 * @author Kutbuddin.compounder to verify taxation deleted?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 11/10/2018
	 * @return true if taxation deleted successfully
	 */
	public boolean deleteTaxation(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Taxation already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyProductTaxationDeleted(Map<Object, Object> map, List<Object> mapKeys) {
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
	 * @author kutbuddin.compounder to verify Product Taxation log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 21/12/2018
	 * @return true if Product Taxation Log successfully Verified
	 */
	public boolean verifyProductTaxationLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort taxation
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortProductInternal(Map<Object, Object> map, List<Object> mapKeys) {
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
