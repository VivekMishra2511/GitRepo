package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

public class CustomerThresholdExternalWeb extends Common {
	By txtThresholdName = By.id("ThresholdName");
	By drpProductName = By.id("ProductID");
	By drpModuleName = By.id("SystemModuleID");
	By drpProfileName = By.id("ProfileID");
	By drpServicename = By.id("SystemServiceID");
	By depStatus = By.id("IsActive");
	By drpOperatorName = By.id("OperatorID");
	By txtNonKycDailyCount = By.id("NonKyc_DailyTrnCount");
	By txtMediumKycDailyCount = By.id("MediumKyc_DailyTrnCount");
	By txtFullKycDailyCount = By.id("FullKyc_DailyTrnCount");
	By txtNonKycDailyAmount = By.id("NonKyc_DailyTrnAmount");
	By txtMediumKycDailyAmount = By.id("MediumKyc_DailyTrnAmount");
	By txtFullKycDailyAmount = By.id("FullKyc_DailyTrnAmount");
	By txtNonKycWeeklyCount = By.id("NonKyc_WeeklyTrnCount");
	By txtMediumKycWeeklyCount = By.id("MediumKyc_WeeklyTrnCount");
	By txtFullKycWeeklyCount = By.id("FullKyc_WeeklyTrnCount");
	By txtNonKycWeeklyAmount = By.id("NonKyc_WeeklyTrnAmount");
	By txtMediumKycWeeklyAmount = By.id("MediumKyc_WeeklyTrnAmount");
	By txtFullKycWeeklyAmount = By.id("FullKyc_WeeklyTrnAmount");
	By txtNonKycMonthlyCount = By.id("NonKyc_MonthlyTrnCount");
	By txtMediumKycMonthlyCount = By.id("MediumKyc_MonthlyTrnCount");
	By txtFullKycMonthlyCount = By.id("FullKyc_MonthlyTrnCount");
	By txtNonKycMonthlyAmount = By.id("NonKyc_MonthlyTrnAmount");
	By txtMediumKycMonthlyAmount = By.id("MediumKyc_MonthlyTrnAmount");
	By txtFullKycMonthlyAmount = By.id("FullKyc_MonthlyTrnAmount");
	By txtSearchThresholdName = By.id("txtThresholdName");
	By drpSearchProductName = By.id("cmbProductID");
	By drpSearchModuleName = By.id("cmbSystemModuleID");
	By drpSearchProfileName = By.id("cmbProfileID");
	By drpSearchServicename = By.id("cmbSystemServiceID");
	By drpSerachStatus = By.id("cmbIsActive");
	By drpSearchOperatorName = By.id("cmbOperatorID");
	By txtLblFullKyc = By.xpath("//*[normalize-space(text())='Full KYC']");
	By txtLblNonKyc = By.xpath("//*[normalize-space(text())='Non KYC']");
	By txtLblMediumKyc = By.xpath("//*[normalize-space(text())='Medium KYC']");

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 06/11/2018
	 */

	public CustomerThresholdExternalWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager productName
	 *         field
	 * @param productName
	 * @creation date 24/10/2018
	 */

	public void sendTextInThresholdName(String thresholdName) {
		clearAndSendTextInTextBox(txtThresholdName, thresholdName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External productName drop down
	 * @param vendorName
	 * @creation date 06/11/2018
	 */
	public void selectProductName(String productName) {
		selectFromDropdown(drpProductName, productName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External moduleName drop down
	 * @param moduleName
	 * @creation date 06/11/2018
	 */
	public void selectModuleName(String moduleName) {
		selectFromDropdown(drpModuleName, moduleName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External profileName drop down
	 * @param profileName
	 * @creation date 06/11/2018
	 */
	public void selectProfileName(String profileName) {
		selectFromDropdown(drpProfileName, profileName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External serviceName drop down
	 * @param serviceName
	 * @creation date 06/11/2018
	 */
	public void selectServiceName(String serviceName) {
		selectFromDropdown(drpServicename, serviceName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External status drop down
	 * @param status
	 * @creation date 06/11/2018
	 */
	public void selectStatus(String status) {
		selectFromDropdown(depStatus, status);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External operatorName drop down
	 * @param operatorName
	 * @creation date 06/11/2018
	 */
	public void selectOperatorName(String operatorName) {
		selectFromDropdown(drpOperatorName, operatorName);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         nonKycDailyCount field
	 * @param nonKycDailyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycDailyCount(String nonKycDailyCount) {
		clearAndSendTextInTextBox(txtNonKycDailyCount, nonKycDailyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         nonKycDailyAmount field
	 * @param nonKycDailyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycDailyAmount(String nonKycDailyAmount) {
		clearAndSendTextInTextBox(txtNonKycDailyAmount, nonKycDailyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         mediumKycDailyCount field
	 * @param mediumKycDailyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycDailyCount(String mediumKycDailyCount) {
		clearAndSendTextInTextBox(txtMediumKycDailyCount, mediumKycDailyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         mediumKycDailyAmount field
	 * @param mediumKycDailyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycDailyAmount(String mediumKycDailyAmount) {
		clearAndSendTextInTextBox(txtMediumKycDailyAmount, mediumKycDailyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         fullKycDailyCount field
	 * @param fullKycDailyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycDailyCount(String fullKycDailyCount) {
		clearAndSendTextInTextBox(txtFullKycDailyCount, fullKycDailyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         fullKycDailyAmount field
	 * @param fullKycDailyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycDailyAmount(String fullKycDailyAmount) {
		clearAndSendTextInTextBox(txtFullKycDailyAmount, fullKycDailyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         nonKycWeeklyCount field
	 * @param nonKycWeeklyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycWeeklyCount(String nonKycWeeklyCount) {
		clearAndSendTextInTextBox(txtNonKycWeeklyCount, nonKycWeeklyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         nonKycWeeklyAmount field
	 * @param nonKycWeeklyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycWeeklyAmount(String nonKycWeeklyAmount) {
		clearAndSendTextInTextBox(txtNonKycWeeklyAmount, nonKycWeeklyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         mediumKycWeeklyCount field
	 * @param mediumKycWeeklyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycWeeklyCount(String mediumKycWeeklyCount) {
		clearAndSendTextInTextBox(txtMediumKycWeeklyCount, mediumKycWeeklyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         mediumKycWeeklyAmount field
	 * @param mediumKycWeeklyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycWeeklyAmount(String mediumKycWeeklyAmount) {
		clearAndSendTextInTextBox(txtMediumKycWeeklyAmount, mediumKycWeeklyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         fullKycWeeklyCount field
	 * @param fullKycWeeklyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycWeeklyCount(String fullKycWeeklyCount) {
		clearAndSendTextInTextBox(txtFullKycWeeklyCount, fullKycWeeklyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         fullKycWeeklyAmount field
	 * @param fullKycWeeklyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycWeeklyAmount(String fullKycWeeklyAmount) {
		clearAndSendTextInTextBox(txtFullKycWeeklyAmount, fullKycWeeklyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         nonKycMonthlyCount field
	 * @param nonKycMonthlyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycMonthlyCount(String nonKycMonthlyCount) {
		clearAndSendTextInTextBox(txtNonKycMonthlyCount, nonKycMonthlyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         nonKycMonthlyAmount field
	 * @param nonKycMonthlyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycMonthlyAmount(String nonKycMonthlyAmount) {
		clearAndSendTextInTextBox(txtNonKycMonthlyAmount, nonKycMonthlyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         mediumKycMonthlyCount field
	 * @param mediumKycMonthlyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycMonthlyCount(String mediumKycMonthlyCount) {
		clearAndSendTextInTextBox(txtMediumKycMonthlyCount, mediumKycMonthlyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         mediumKycMonthlyAmount field
	 * @param mediumKycMonthlyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycMonthlyAmount(String mediumKycMonthlyAmount) {
		clearAndSendTextInTextBox(txtMediumKycMonthlyAmount, mediumKycMonthlyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         fullKycMonthlyCount field
	 * @param fullKycMonthlyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycMonthlyCount(String fullKycMonthlyCount) {
		clearAndSendTextInTextBox(txtFullKycMonthlyCount, fullKycMonthlyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Threshold External
	 *         fullKycMonthlyAmount field
	 * @param fullKycMonthlyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycMonthlyAmount(String fullKycMonthlyAmount) {
		clearAndSendTextInTextBox(txtFullKycMonthlyAmount, fullKycMonthlyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager productName
	 *         field
	 * @param productName
	 * @creation date 24/10/2018
	 */
	public void sendTextInSerachThresholdName(String thresholdName) {
		clearAndSendTextInTextBox(txtSearchThresholdName, thresholdName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External productName drop down
	 * @param vendorName
	 * @creation date 06/11/2018
	 */
	public void selectSearchProductName(String productName) {
		selectFromDropdown(drpSearchProductName, productName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External moduleName drop down
	 * @param moduleName
	 * @creation date 06/11/2018
	 */
	public void selectSearchModuleName(String moduleName) {
		selectFromDropdown(drpSearchModuleName, moduleName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External profileName drop down
	 * @param profileName
	 * @creation date 06/11/2018
	 */
	public void selectSearchProfileName(String profileName) {
		selectFromDropdown(drpSearchProfileName, profileName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External serviceName drop down
	 * @param serviceName
	 * @creation date 06/11/2018
	 */
	public void selectSearchServiceName(String serviceName) {
		selectFromDropdown(drpSearchServicename, serviceName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External status drop down
	 * @param status
	 * @creation date 06/11/2018
	 */
	public void selectSearchStatus(String status) {
		selectFromDropdown(drpSerachStatus, status);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Threshold
	 *         External operatorName drop down
	 * @param operatorName
	 * @creation date 06/11/2018
	 */
	public void selectSearchOperatorName(String operatorName) {
		selectFromDropdown(drpSearchOperatorName, operatorName);
	}

	/**
	 * @author kutbuddin.compounder
	 * @param str1,str2,str3,str4,str5,str6,str7
	 * @creation date 03/12/2018
	 */
	public void filterSearch(String str1, String str2, String str3, String str4, String str5, String str6,
			String str7) {
		commonFilterSearch();
		sendTextInSerachThresholdName(str1);
		selectSearchModuleName(str2);
		selectSearchServiceName(str3);
		selectSearchOperatorName(str4);
		selectSearchProductName(str5);
		selectSearchProfileName(str6);
		selectSearchStatus(str7);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder to add Customer-Threshold External
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 06/11/2018
	 */
	public void addCustomerThresholdExternal(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString(), map.get(keys.get(4)).toString(),
				map.get(keys.get(6)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString(),
				map.get(keys.get(5)).toString());
		if (!verifyElement(By.xpath("(//td[text()='" + map.get(keys.get(0)).toString() + "'])[1]"), false)) {
			clickOnAddBtn();
			sendTextInThresholdName(map.get(keys.get(0)).toString());
			selectModuleName(map.get(keys.get(2)).toString());
			selectServiceName(map.get(keys.get(4)).toString());
			selectOperatorName(map.get(keys.get(6)).toString());
			selectProductName(map.get(keys.get(1)).toString());
			selectProfileName(map.get(keys.get(3)).toString());
			selectStatus(map.get(keys.get(5)).toString());
			String[] nonKyctransactionCount = map.get(keys.get(7)).toString().split(":");
			String[] nonKyctransactionValue = map.get(keys.get(8)).toString().split(":");
			String[] mediumKyctransactionCount = map.get(keys.get(9)).toString().split(":");
			String[] mediumKyctransactionValue = map.get(keys.get(10)).toString().split(":");
			String[] fullKyctransactionCount = map.get(keys.get(11)).toString().split(":");
			String[] fullKyctransactionValue = map.get(keys.get(12)).toString().split(":");
			if (verifyElement(txtLblNonKyc)) {
				sendTextInNonKycDailyCount(nonKyctransactionCount[0].trim());
				sendTextInNonKycDailyAmount(nonKyctransactionValue[0].trim());
				sendTextInNonKycWeeklyCount(nonKyctransactionCount[1].trim());
				sendTextInNonKycWeeklyAmount(nonKyctransactionValue[1].trim());
				sendTextInNonKycMonthlyCount(nonKyctransactionCount[2].trim());
				sendTextInNonKycMonthlyAmount(nonKyctransactionValue[2].trim());
			}
			if (verifyElement(txtLblMediumKyc)) {
				sendTextInMediumKycDailyCount(mediumKyctransactionCount[0].trim());
				sendTextInMediumKycDailyAmount(mediumKyctransactionValue[0].trim());
				sendTextInMediumKycWeeklyCount(mediumKyctransactionCount[1].trim());
				sendTextInMediumKycWeeklyAmount(mediumKyctransactionValue[1].trim());
				sendTextInMediumKycMonthlyCount(mediumKyctransactionCount[2].trim());
				sendTextInMediumKycMonthlyAmount(mediumKyctransactionValue[2].trim());
			}
			if (verifyElement(txtLblFullKyc)) {
				sendTextInFullKycDailyCount(fullKyctransactionCount[0].trim());
				sendTextInFullKycDailyAmount(fullKyctransactionValue[0].trim());
				sendTextInFullKycWeeklyCount(fullKyctransactionCount[1].trim());
				sendTextInFullKycWeeklyAmount(fullKyctransactionValue[1].trim());
				sendTextInFullKycMonthlyCount(fullKyctransactionCount[2].trim());
				sendTextInFullKycMonthlyAmount(fullKyctransactionValue[2].trim());
			}
			clickOnSaveBtn();
		}
	}

	/**
	 * @author kutbuddin.compounder to Edit Customer-Threshold External
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 06/11/2018
	 */
	public void editCustomerThresholdExternal(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString(), map.get(keys.get(4)).toString(),
				map.get(keys.get(6)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString(),
				map.get(keys.get(5)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(keys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(keys.get(0)).toString());
			clickOnEditBtn();
			selectStatus(map.get(keys.get(13)).toString());
			String[] nonKyctransactionCount = map.get(keys.get(7)).toString().split(":");
			String[] nonKyctransactionValue = map.get(keys.get(8)).toString().split(":");
			String[] mediumKyctransactionCount = map.get(keys.get(9)).toString().split(":");
			String[] mediumKyctransactionValue = map.get(keys.get(10)).toString().split(":");
			String[] fullKyctransactionCount = map.get(keys.get(11)).toString().split(":");
			String[] fullKyctransactionValue = map.get(keys.get(12)).toString().split(":");
			if (verifyElement(txtLblNonKyc)) {
				sendTextInNonKycDailyCount(nonKyctransactionCount[0].trim());
				sendTextInNonKycDailyAmount(nonKyctransactionValue[0].trim());
				sendTextInNonKycWeeklyCount(nonKyctransactionCount[1].trim());
				sendTextInNonKycWeeklyAmount(nonKyctransactionValue[1].trim());
				sendTextInNonKycMonthlyCount(nonKyctransactionCount[2].trim());
				sendTextInNonKycMonthlyAmount(nonKyctransactionValue[2].trim());
			}
			if (verifyElement(txtLblMediumKyc)) {
				sendTextInMediumKycDailyCount(mediumKyctransactionCount[0].trim());
				sendTextInMediumKycDailyAmount(mediumKyctransactionValue[0].trim());
				sendTextInMediumKycWeeklyCount(mediumKyctransactionCount[1].trim());
				sendTextInMediumKycWeeklyAmount(mediumKyctransactionValue[1].trim());
				sendTextInMediumKycMonthlyCount(mediumKyctransactionCount[2].trim());
				sendTextInMediumKycMonthlyAmount(mediumKyctransactionValue[2].trim());
			}
			if (verifyElement(txtLblFullKyc)) {
				sendTextInFullKycDailyCount(fullKyctransactionCount[0].trim());
				sendTextInFullKycDailyAmount(fullKyctransactionValue[0].trim());
				sendTextInFullKycWeeklyCount(fullKyctransactionCount[1].trim());
				sendTextInFullKycWeeklyAmount(fullKyctransactionValue[1].trim());
				sendTextInFullKycMonthlyCount(fullKyctransactionCount[2].trim());
				sendTextInFullKycMonthlyAmount(fullKyctransactionValue[2].trim());
			}
			clickOnSaveBtn();
		} else {
			verifyTrue(false);
		}
	}

	/**
	 * @author kutbuddin.compounder to verify customer threshold added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 24/10/2018
	 * @return true if Product Manager added successfully
	 */
	public boolean verifyCustomerThresholdExternalAdded(Map<Object, Object> map, List<Object> keys) {
		By productName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.PRODUCT_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(1)).toString() + "']");
		By operatorName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.OPERATOR_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(6)).toString() + "']");
		By moduleName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.MODULE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(2)).toString() + "']");
		By serviceName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.SERVICE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(4)).toString() + "']");
		By thresholdName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.THRESHOLD_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(0)).toString() + "']");
		By profileName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.PROFILE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(3)).toString() + "']");
		By Status = By.xpath("//label[normalize-space(text())='" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(5)).toString() + "']");
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString(), map.get(keys.get(4)).toString(),
				map.get(keys.get(6)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString(),
				map.get(keys.get(5)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(keys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(keys.get(0)).toString());
			if (!verifyElement(productName, false))
				return false;
			if (!verifyElement(operatorName, false))
				return false;
			if (!verifyElement(thresholdName, false))
				return false;
			if (!verifyElement(moduleName, false))
				return false;
			if (!verifyElement(serviceName, false))
				return false;
			if (!verifyElement(profileName, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			String[] nonKyctransactionCount = map.get(keys.get(7)).toString().split(":");
			String[] nonKyctransactionValue = map.get(keys.get(8)).toString().split(":");
			String[] mediumKyctransactionCount = map.get(keys.get(9)).toString().split(":");
			String[] mediumKyctransactionValue = map.get(keys.get(10)).toString().split(":");
			String[] fullKyctransactionCount = map.get(keys.get(11)).toString().split(":");
			String[] fullKyctransactionValue = map.get(keys.get(12)).toString().split(":");

			if (verifyElement(txtLblNonKyc)) {
				By nontc = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionCount[0].trim() + "']");
				By nonvalue = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionValue[0].trim() + "']");
				By nontcWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionCount[1].trim() + "']");
				By nonvalueWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionValue[1].trim() + "']");
				By nontcMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionCount[2].trim() + "']");
				By nonvalueMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionValue[2].trim() + "']");
				if (!verifyElement(nontc, false))
					return false;
				if (!verifyElement(nonvalue, false))
					return false;
				if (!verifyElement(nontcWeekly, false))
					return false;
				if (!verifyElement(nonvalueWeekly, false))
					return false;
				if (!verifyElement(nontcMonthly, false))
					return false;
				if (!verifyElement(nonvalueMonthly, false))
					return false;
			}
			if (verifyElement(txtLblMediumKyc)) {
				By medtc = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionCount[0].trim() + "']");
				By medvalue = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionValue[0].trim() + "']");
				By medtcWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionCount[1].trim() + "']");
				By medvalueWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionValue[1].trim() + "']");
				By medtcMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionCount[2].trim() + "']");
				By medvalueMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionValue[2].trim() + "']");
				if (!verifyElement(medtc, false))
					return false;
				if (!verifyElement(medvalue, false))
					return false;
				if (!verifyElement(medtcWeekly, false))
					return false;
				if (!verifyElement(medvalueWeekly, false))
					return false;
				if (!verifyElement(medtcMonthly, false))
					return false;
				if (!verifyElement(medvalueMonthly, false))
					return false;
			}
			if (verifyElement(txtLblFullKyc)) {
				By fulltc = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionCount[0].trim() + "']");
				By fullvalue = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionValue[0].trim() + "']");
				By fulltcWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionCount[1].trim() + "']");
				By fullvalueWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionValue[1].trim() + "']");
				By fulltcMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionCount[2].trim() + "']");
				By fullvalueMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionValue[2].trim() + "']");
				if (!verifyElement(fulltc, false))
					return false;
				if (!verifyElement(fullvalue, false))
					return false;
				if (!verifyElement(fulltcWeekly, false))
					return false;
				if (!verifyElement(fullvalueWeekly, false))
					return false;
				if (!verifyElement(fulltcMonthly, false))
					return false;
				if (!verifyElement(fullvalueMonthly, false))
					return false;
			}
			return true;
		} else
			return false;
	}

	/**
	 * @author kutbuddin.compounder to verify customer threshold edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 24/10/2018
	 * @return true if Product Manager edited successfully
	 */
	public boolean verifyCustomerThresholdExternalEdited(Map<Object, Object> map, List<Object> keys) {
		By productName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.PRODUCT_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(1)).toString() + "']");
		By operatorName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.OPERATOR_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(6)).toString() + "']");
		By moduleName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.MODULE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(2)).toString() + "']");
		By serviceName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.SERVICE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(4)).toString() + "']");
		By thresholdName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.THRESHOLD_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(0)).toString() + "']");
		By profileName = By.xpath("//label[normalize-space(text())='" + ConstantsFile.PROFILE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(3)).toString() + "']");
		By Status = By.xpath("//label[normalize-space(text())='" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(13)).toString() + "']");
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString(), map.get(keys.get(4)).toString(),
				map.get(keys.get(6)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString(),
				map.get(keys.get(13)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(keys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(keys.get(0)).toString());
			if (!verifyElement(productName, false))
				return false;
			if (!verifyElement(operatorName, false))
				return false;
			if (!verifyElement(thresholdName, false))
				return false;
			if (!verifyElement(moduleName, false))
				return false;
			if (!verifyElement(serviceName, false))
				return false;
			if (!verifyElement(profileName, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			String[] nonKyctransactionCount = map.get(keys.get(7)).toString().split(":");
			String[] nonKyctransactionValue = map.get(keys.get(8)).toString().split(":");
			String[] mediumKyctransactionCount = map.get(keys.get(9)).toString().split(":");
			String[] mediumKyctransactionValue = map.get(keys.get(10)).toString().split(":");
			String[] fullKyctransactionCount = map.get(keys.get(11)).toString().split(":");
			String[] fullKyctransactionValue = map.get(keys.get(12)).toString().split(":");

			if (verifyElement(txtLblNonKyc)) {
				By nontc = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionCount[0].trim() + "']");
				By nonvalue = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionValue[0].trim() + "']");
				By nontcWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionCount[1].trim() + "']");
				By nonvalueWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionValue[1].trim() + "']");
				By nontcMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionCount[2].trim() + "']");
				By nonvalueMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.NON_KYC
						+ "']//ancestor::div[@id='viewnonkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ nonKyctransactionValue[2].trim() + "']");
				if (!verifyElement(nontc, false))
					return false;
				if (!verifyElement(nonvalue, false))
					return false;
				if (!verifyElement(nontcWeekly, false))
					return false;
				if (!verifyElement(nonvalueWeekly, false))
					return false;
				if (!verifyElement(nontcMonthly, false))
					return false;
				if (!verifyElement(nonvalueMonthly, false))
					return false;
			}
			if (verifyElement(txtLblMediumKyc)) {
				By medtc = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionCount[0].trim() + "']");
				By medvalue = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionValue[0].trim() + "']");
				By medtcWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionCount[1].trim() + "']");
				By medvalueWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionValue[1].trim() + "']");
				By medtcMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionCount[2].trim() + "']");
				By medvalueMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MEDIUM_KYC
						+ "']//ancestor::div[@id='viewmidkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ mediumKyctransactionValue[2].trim() + "']");
				if (!verifyElement(medtc, false))
					return false;
				if (!verifyElement(medvalue, false))
					return false;
				if (!verifyElement(medtcWeekly, false))
					return false;
				if (!verifyElement(medvalueWeekly, false))
					return false;
				if (!verifyElement(medtcMonthly, false))
					return false;
				if (!verifyElement(medvalueMonthly, false))
					return false;
			}
			if (verifyElement(txtLblFullKyc)) {
				By fulltc = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionCount[0].trim() + "']");
				By fullvalue = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.DAILY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionValue[0].trim() + "']");
				By fulltcWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionCount[1].trim() + "']");
				By fullvalueWeekly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.WEEKLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionValue[1].trim() + "']");
				By fulltcMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_COUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionCount[2].trim() + "']");
				By fullvalueMonthly = By.xpath("//*[normalize-space(text())='" + ConstantsFile.FULL_KYC
						+ "']//ancestor::div[@id='editfullkyc']//*[normalize-space(text())='" + ConstantsFile.MONTHLY
						+ "']//ancestor::tr//*[normalize-space(text())='" + ConstantsFile.TRANSACTION_AMOUNT
						+ "']//ancestor::td//div[@class='full' and normalize-space(text())='"
						+ fullKyctransactionValue[2].trim() + "']");
				if (!verifyElement(fulltc, false))
					return false;
				if (!verifyElement(fullvalue, false))
					return false;
				if (!verifyElement(fulltcWeekly, false))
					return false;
				if (!verifyElement(fullvalueWeekly, false))
					return false;
				if (!verifyElement(fulltcMonthly, false))
					return false;
				if (!verifyElement(fullvalueMonthly, false))
					return false;
			}
			return true;
		} else
			return false;
	}

	/**
	 * @author Kutbuddin.compounder to verify CustomerExternalThreshold deleted?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 24/10/2018
	 * @return true if CustomerExternalThreshold deleted successfully
	 */
	public boolean deleteCustomerThresholdExternal(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString(), map.get(keys.get(4)).toString(),
				map.get(keys.get(6)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString(),
				map.get(keys.get(5)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(keys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(keys.get(0)).toString());
			delete();
			return true;
		} else {
			String string = "CustomerExternalThreshold already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyCustomerExternalThresholdDeleted(Map<Object, Object> map, List<Object> keys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString(),
					map.get(keys.get(4)).toString(), map.get(keys.get(6)).toString(), map.get(keys.get(1)).toString(),
					map.get(keys.get(3)).toString(), map.get(keys.get(5)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(keys.get(0)).toString() + "'])[1]"), false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify enterprise threshold log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 17/12/2018
	 * @return true if CustomerExternalThreshold Log successfully Verified
	 */
	public boolean verifyCustomerExternalThresholdLog(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(2)).toString(), map.get(keys.get(4)).toString(),
				map.get(keys.get(6)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString(),
				map.get(keys.get(13)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(keys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(keys.get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort customer external threshold
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @creation date 13/12/2018
	 */
	public boolean sortExternalThreshold(Map<Object, Object> map, List<Object> mapKeys) {
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
