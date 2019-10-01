package com.panamax.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi Actions of Customer - ProfileUpdate
 * @creation date 19/11/2018
 */
public class CustomerProfileUpdateWeb extends Common {
	By drpStatusSearch = By.id("Status");
	By drpFromProfileName = By.id("FromProfileID");
	By drpFromKYCStatus = By.id("FromKycStatus");
	By drpToProfileName = By.id("ToProfileID");
	By drpToKYCStatus = By.id("ToKycStatus");
	By btnDownloadCustomerList = By.id("downloadsubscriber");
	By importFile = By.id("WalletFile");
	By txtCustomerPhone = By.id("CustomerPhone");
	By btnSearchCustomer = By.id("searchcustomer");
	By btnInitiateRequest = By.xpath("//*[@class='cludebutton']//button");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 19/11/2018
	 */
	public CustomerProfileUpdateWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi filter search common method
	 * @param str1
	 * @param str2
	 * @creation date 19/11/2018
	 */
	public void filterSearch(String str1) {
		commonFilterSearch();
		selectTextInStatusInSearch(str1);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to select status in status in filter search
	 * @param status
	 * @creation date 23/11/2018
	 */
	public void selectTextInStatusInSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author dishant.doshi to select text in to profile
	 * @param fromProfileName
	 * @creation date 23/11/2018
	 */
	public void selectTextInFromProfileName(String fromProfileName) {
		selectFromDropdown(drpFromProfileName, fromProfileName);
	}

	/**
	 * @author dishant.doshi to select text in to kyc status
	 * @param fromKYCStatus
	 * @creation date 23/11/2018
	 */
	public void selectTextInFromKYCStatus(String fromKYCStatus) {
		selectFromDropdown(drpFromKYCStatus, fromKYCStatus);
	}

	/**
	 * @author dishant.doshi to select text in to profile
	 * @param toProfileName
	 * @creation date 23/11/2018
	 */
	public void selectTextInToProfileName(String toProfileName) {
		selectFromDropdown(drpToProfileName, toProfileName);
	}

	/**
	 * @author dishant.doshi to select text in to kyc status
	 * @param toKYCStatus
	 * @creation date 23/11/2018
	 */
	public void selectTextInToKYCStatus(String toKYCStatus) {
		selectFromDropdown(drpToKYCStatus, toKYCStatus);
	}

	/**
	 * @author dishant.doshi to select selection type
	 * @param selectionType
	 * @creation date 23/11/2018
	 */
	public void clickOnSelection(String selectionType) {
		clickOnElement(By.xpath("//a[normalize-space(text()) = '" + selectionType + "']"));
	}

	/**
	 * @author dishant.doshi to click on download customer list
	 * @creation date 23/11/2018
	 */
	public void clickOnDownloadCustomerList() {
		clickOnElement(btnDownloadCustomerList);
	}

	/**
	 * @author dishant.doshi to download customer list
	 * @creation date 23/11/2018
	 */
	public void downLoadCustomerList() {
		Robot robot;
		try {
			robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @author dishant.doshi to upload file
	 * @param filePath
	 * @creation date 23/11/2018
	 */
	public void browseFile(String filePath) {
		sendTextInTextBox(importFile, filePath);
	}

	/**
	 * @author dishant.doshi to send text in customer phone
	 * @param customerPhone
	 * @creation date 23/11/2018
	 */
	public void sendTextInCustomerPhone(String customerPhone) {
		clearAndSendTextInTextBox(txtCustomerPhone, customerPhone);
	}

	/**
	 * @author dishant.doshi to click on search customer
	 * @creation date 23/11/2018
	 */
	public void clickOnSearchCustomer() {
		clickOnElement(btnSearchCustomer);
	}

	public void clickOnInitiateRequest() {
		clickOnElement(btnInitiateRequest);
	}

	/**
	 * @author dishant.doshi to profile update
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 23/11/2018
	 */
	public boolean profileUpdate(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectTextInFromProfileName(map.get(mapKeys.get(0)).toString());
		selectTextInFromKYCStatus(map.get(mapKeys.get(1)).toString());
		clickOnSelection(map.get(mapKeys.get(2)).toString());
		if (map.get(mapKeys.get(2)).toString().equals("Import List")) {
			clickOnDownloadCustomerList();
			String downloadFileName = getFileName(DOWNLOADS_FOLDER);
			commonWait();
			browseFile(downloadFileName);
		} else if (map.get(mapKeys.get(2)).toString().equals("Multiple Select")) {
			String[] searchCust = map.get(mapKeys.get(3)).toString().split("-");
			for (int c = 0; c < searchCust.length; c++) {
				sendTextInCustomerPhone(searchCust[c].trim());
				clickOnSearchCustomer();
			}
		}
		selectTextInToProfileName(map.get(mapKeys.get(4)).toString());
		selectTextInToKYCStatus(map.get(mapKeys.get(5)).toString());
		commonWait();
		clickOnInitiateRequest();
		getStriptText();
		if (verifyToolTip()) {
			clickOnCancelBtn();
			return false;
		}
		return true;
	}
	
	/**
	 * @author dishant.doshi to verify profile update
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 23/11/2018
	 */
	public boolean verifyProfileUpdated(Map<Object, Object> map, List<Object> mapKeys) {
		By fromProfile = By.xpath("//tr[1]//td[normalize-space(text())='" + map.get(mapKeys.get(0)).toString()
				+ "' and @data-title='lbl_from_profile']");
		By fromKYC = By.xpath("//tr[1]//td[normalize-space(text())='" + map.get(mapKeys.get(1)).toString()
				+ "' and @data-title='lbl_from_kyc']");
		By toProfile = By.xpath("//tr[1]//td[normalize-space(text())='" + map.get(mapKeys.get(4)).toString()
				+ "' and @data-title='lbl_to_profile']");
		By toKYC = By.xpath("//tr[1]//td[normalize-space(text())='" + map.get(mapKeys.get(5)).toString()
				+ "' and @data-title='lbl_to_kyc']");
		By executionStatus = By.xpath("//tr[1]//td[normalize-space(text())='" + map.get(mapKeys.get(0)).toString()
				+ "' and @data-title='lbl_from_profile']//following-sibling::td[normalize-space(text())='Done' and @data-title='lbl_execution_status']");
		try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		reloadCurrentPage();
		if (!verifyElement(fromProfile, false))
			return false;
		if (!verifyElement(fromKYC, false))
			return false;
		if (!verifyElement(toProfile, false))
			return false;
		if (!verifyElement(toKYC, false))
			return false;
		if (!verifyElement(executionStatus, false))
			return false;
		return true;
	}

	/**
	 * @author dishant.doshi to sort customer profileUpdate
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 14/12/2018
	 */
	public boolean sortProfileUpdate(Map<Object, Object> map, List<Object> mapKeys) {
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
