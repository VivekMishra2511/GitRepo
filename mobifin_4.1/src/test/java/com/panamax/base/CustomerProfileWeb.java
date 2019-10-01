package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

/**
 * @author dishant.doshi Actions of Customer - Profile
 * @creation date 19/11/2018
 */
public class CustomerProfileWeb extends Common {
	By txtProfileName = By.id("ProfileName");
	By msAllowedKYCType = By.xpath(".//*[@id='AllowedKYCType']//following-sibling::div//input");
	By drpTree = By.id("TreeID");
	By drpParentProfile = By.id("ParentProfileID");
	By drpStatus = By.id("IsActive");
	By kycDetails = By.xpath(".//*[@id='kycWizard']/li//div[@class='step-text clearfix']");
	By nonKYCThreshold = By.xpath("//*[contains(@id,'threshold')]//*[text()='Non KYC']");
	By mediumKYCThreshold = By.xpath("//*[contains(@id,'threshold')]//*[text()='Medium KYC']");
	By fullKYCThreshold = By.xpath("//*[contains(@id,'threshold')]//*[text()='Full KYC']");
	By txtNonKYCMin = By.id("NonKyc_Min");
	By txtNonKYCMax = By.id("NonKyc_Max");
	By txtNonDailyIn = By.id("NonKyc_Daily_In");
	By txtNonDailyOut = By.id("NonKyc_Daily_Out");
	By txtNonDailyAll = By.id("NonKyc_Daily_Overall");
	By txtNonWeeklyIn = By.id("NonKyc_Weekly_In");
	By txtNonWeeklyOut = By.id("NonKyc_Weekly_Out");
	By txtNonWeeklyAll = By.id("NonKyc_Weekly_Overall");
	By txtNonMonthlyIn = By.id("NonKyc_Monthly_In");
	By txtNonMonthlyOut = By.id("NonKyc_Monthly_Out");
	By txtNonMonthlyAll = By.id("NonKyc_Monthly_Overall");
	By txtMediumKYCMin = By.id("MediumKyc_Min");
	By txtMediumKYCMax = By.id("MediumKyc_Max");
	By txtMediumDailyIn = By.id("MediumKyc_Daily_In");
	By txtMediumDailyOut = By.id("MediumKyc_Daily_Out");
	By txtMediumDailyAll = By.id("MediumKyc_Daily_Overall");
	By txtMediumWeeklyIn = By.id("MediumKyc_Weekly_In");
	By txtMediumWeeklyOut = By.id("MediumKyc_Weekly_Out");
	By txtMediumWeeklyAll = By.id("MediumKyc_Weekly_Overall");
	By txtMediumMonthlyIn = By.id("MediumKyc_Monthly_In");
	By txtMediumMonthlyOut = By.id("MediumKyc_Monthly_Out");
	By txtMediumMonthlyAll = By.id("MediumKyc_Monthly_Overall");
	By txtFullKYCMin = By.id("FullKyc_Min");
	By txtFullKYCMax = By.id("FullKyc_Max");
	By txtFullDailyIn = By.id("FullKyc_Daily_In");
	By txtFullDailyOut = By.id("FullKyc_Daily_Out");
	By txtFullDailyAll = By.id("FullKyc_Daily_Overall");
	By txtFullWeeklyIn = By.id("FullKyc_Weekly_In");
	By txtFullWeeklyOut = By.id("FullKyc_Weekly_Out");
	By txtFullWeeklyAll = By.id("FullKyc_Weekly_Overall");
	By txtFullMonthlyIn = By.id("FullKyc_Monthly_In");
	By txtFullMonthlyOut = By.id("FullKyc_Monthly_Out");
	By txtFullMonthlyAll = By.id("FullKyc_Monthly_Overall");
	By txtStakeHolderName = By.id("stakeholders-tokenfield");
	By txtProfileNameSearch = By.id("txtProfileName");
	By drpTreeSearch = By.id("cmbTreeID");
	By drpStatusSearch = By.id("cmbIsActive");
	By openKYCDetails = By.xpath("//*[text()='KYC Details']//parent::div//i");
	By openThresholdSettings = By.xpath("//*[text()='Threshold Setting']//parent::div//i");
	By openAccessChannel = By.xpath("//*[text()='Access Channel']//parent::div//i");
	By openServices = By.xpath("//*[text()='Services']//parent::div//i");
	By profileDetailsLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Profile Details']");
	By kycDetailsLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='KYC Details']");
	By thresholdSettingLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Threshold Setting']");
	By accessChannelLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Access Channel']");
	By servicesLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Services']");
	By profileSummaryLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Profile Summary']");
	By stakeHolderRemove = By.xpath("//*[@class='token']//a");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 19/11/2018
	 */
	public CustomerProfileWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi filter search common method
	 * @param str1
	 * @param str2
	 * @creation date 19/11/2018
	 */
	public void filterSearch(String str1, String str2) {
		commonFilterSearch();
		sendTextInProfileNameInSearch(str1);
		selectTextInStatusInSearch(str2);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to send text in profile name
	 * @param profileName
	 * @creation date 19/11/2018
	 */
	public void sendTextInProfileName(String profileName) {
		clearAndSendTextInTextBox(txtProfileName, profileName);
	}

	/**
	 * @author dishant.doshi to select text in allowed kyc type
	 * @param allowedKycType
	 * @creation date 19/11/2018
	 */
	public void selectTextInAllowedKYCType(String allowedKycType) {
		sendTextInTextBox(msAllowedKYCType, allowedKycType + Keys.ENTER);
	}

	/**
	 * @author dishant.doshi to select text in status
	 * @param status
	 * @creation date 19/11/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to send text in profile name in filter search
	 * @param profileName
	 * @creation date 19/11/2018
	 */
	public void sendTextInProfileNameInSearch(String profileName) {
		clearAndSendTextInTextBox(txtProfileNameSearch, profileName);
	}

	/**
	 * @author dishant.doshi to select text in tree name in filter search
	 * @param treeName
	 * @creation date 19/11/2018
	 */
	public void selectTextInTreeInSearch(String treeName) {
		selectFromDropdown(drpTreeSearch, treeName);
	}

	/**
	 * @author dishant.doshi to select text in status in filter search
	 * @param status
	 * @creation date 19/11/2018
	 */
	public void selectTextInStatusInSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author dishant.doshi to select text in kyc details category
	 * @param element
	 * @param kycCategory
	 * @creation date 19/11/2018
	 */
	public void selectTextInKYCDetails(By element, String kycCategory) {
		selectFromDropdown(element, kycCategory);
	}

	/**
	 * @author dishant.doshi to click on add field button
	 * @param element
	 * @creation date 19/11/2018
	 */
	public void clickOnAddField(By element) {
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to click on non kyc radio button
	 * @param nonKYCField
	 * @creation date 13/11/2018
	 */
	public void clickOnNonKYCRadio(String nonKYCField) {
		By element = By.xpath("//*[text()='" + nonKYCField + "']//following-sibling::div[contains(@class,'nonkyc')]");
		getCenter(element);
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to click on medium kyc radio button
	 * @param mediumKYCField
	 * @creation date 13/11/2018
	 */
	public void clickOnMediumKYCRadio(String mediumKYCField) {
		By element = By
				.xpath("//*[text()='" + mediumKYCField + "']//following-sibling::div[contains(@class,'mediumkyc')]");
		getCenter(element);
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to click on full kyc radio button
	 * @param fullKYCField
	 * @creation date 13/11/2018
	 */
	public void clickOnFullKYCRadio(String fullKYCField) {
		By element = By.xpath("//*[text()='" + fullKYCField + "']//following-sibling::div[contains(@class,'fullkyc')]");
		getCenter(element);
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to click on mandatoey kyc radio button
	 * @param element
	 * @creation date 13/11/2018
	 */
	public void clickOnMandatoryCheckBox(String mandatoryField) {
		clickOnElement(By.xpath("//*[text()='" + mandatoryField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'Required')]//following-sibling :: label"));
	}

	/**
	 * @author dishant.doshi to click on mandatoey kyc radio button
	 * @param element
	 * @creation date 21/12/2018
	 */
	public void clickOnShowCheckBox(String showField) {
		clickOnElement(By.xpath("(//*[text()='" + showField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'Show')]//following-sibling :: label)[1]"));
	}

	/**
	 * @author dishant.doshi to click on mandatoey kyc radio button
	 * @param element
	 * @creation date 21/12/2018
	 */
	public void clickOnIsEditableCheckBox(String isEditableField) {
		clickOnElement(By.xpath("//*[text()='" + isEditableField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'IsEditable')]//following-sibling :: label"));
	}

	/**
	 * @author dishant.doshi to click on mandatory KYC radio button
	 * @param element
	 * @creation date 21/12/2018
	 */
	public void clickOnIsEditableAdminCheckBox(String isEditableAdminField) {
		clickOnElement(By.xpath("//*[text()='" + isEditableAdminField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'IsEditableAdmin')]//following-sibling :: label"));
	}

	/**
	 * @author dishant.doshi to click on non kyc radio button for edit
	 * @param nonKYCField
	 * @creation date 22/11/2018
	 */
	public void clickOnNonKYCRadioForEdit(String nonKYCField) {
		By element = By.xpath("//div[normalize-space(text())='" + nonKYCField
				+ "']//following-sibling::div//input[contains(@id,'NonKyc')]/..");
		getCenter(element);
		clickOnElement(element);

	}

	/**
	 * @author dishant.doshi to click on medium kyc radio button for edit
	 * @param mediumKYCField
	 * @creation date 22/11/2018
	 */
	public void clickOnMediumKYCRadioForEdit(String mediumKYCField) {
		By element = By.xpath("//div[normalize-space(text())='" + mediumKYCField
				+ "']//following-sibling::div//input[contains(@id,'MediumKyc')]/..");
		getCenter(element);
		clickOnElement(element);

	}

	/**
	 * @author dishant.doshi to click on full kyc radio button for edit
	 * @param fullKYCField
	 * @creation date 22/11/2018
	 */
	public void clickOnFullKYCRadioForEdit(String fullKYCField) {
		By element = By.xpath("//div[normalize-space(text())='" + fullKYCField
				+ "']//following-sibling::div//input[contains(@id,'FullKyc')]/..");
		getCenter(element);
		clickOnElement(element);

	}

	/**
	 * @author dishant.doshi to click on mandatoey kyc radio button for edit
	 * @param element
	 * @creation date 22/11/2018
	 */
	public void clickOnMandatoeyCheckBoxForEdit(String mandatoryField) {
		clickOnElement(By.xpath("//*[text()='" + mandatoryField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'Required')]//following-sibling :: label"));
	}

	/**
	 * @author dishant.doshi to send text in non kyc minimum amount
	 * @param nonMinAmt
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCMinimumAmount(String nonMinAmt) {
		clearAndSendTextInTextBox(txtNonKYCMin, nonMinAmt);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc minimum amount
	 * @param mediumMinAmt
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCMinimumAmount(String mediumMinAmt) {
		clearAndSendTextInTextBox(txtMediumKYCMin, mediumMinAmt);
	}

	/**
	 * @author dishant.doshi to send text in full kyc minimum amount
	 * @param fullMinAmt
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCMinimumAmount(String fullMinAmt) {
		clearAndSendTextInTextBox(txtFullKYCMin, fullMinAmt);
	}

	/**
	 * @author dishant.doshi to send text in non kyc maximum amount
	 * @param nonMaxAmt
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCMaximumAmount(String nonMaxAmt) {
		clearAndSendTextInTextBox(txtNonKYCMax, nonMaxAmt);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc maximum amount
	 * @param mediumMaxAmt
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCMaximumAmount(String mediumMaxAmt) {
		clearAndSendTextInTextBox(txtMediumKYCMax, mediumMaxAmt);
	}

	/**
	 * @author dishant.doshi to send text in full kyc maximum amount
	 * @param fullMaxAmt
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCMaximumAmount(String fullMaxAmt) {
		clearAndSendTextInTextBox(txtFullKYCMax, fullMaxAmt);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily in amount
	 * @param nonDailyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCDailyIn(String nonDailyIn) {
		clearAndSendTextInTextBox(txtNonDailyIn, nonDailyIn);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily in amount
	 * @param mediumDailyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCDailyIn(String mediumDailyIn) {
		clearAndSendTextInTextBox(txtMediumDailyIn, mediumDailyIn);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily in amount
	 * @param fullDailyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCDailyIn(String fullDailyIn) {
		clearAndSendTextInTextBox(txtFullDailyIn, fullDailyIn);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily out amount
	 * @param nonDailyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCDailyOut(String nonDailyOut) {
		clearAndSendTextInTextBox(txtNonDailyOut, nonDailyOut);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily out amount
	 * @param mediumDailyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCDailyOut(String mediumDailyOut) {
		clearAndSendTextInTextBox(txtMediumDailyOut, mediumDailyOut);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily out amount
	 * @param fullDailyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCDailyOut(String fullDailyOut) {
		clearAndSendTextInTextBox(txtFullDailyOut, fullDailyOut);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily over all amount
	 * @param nonDailyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCDailyAll(String nonDailyAll) {
		clearAndSendTextInTextBox(txtNonDailyAll, nonDailyAll);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily over all amount
	 * @param mediumDailyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCDailyAll(String mediumDailyAll) {
		clearAndSendTextInTextBox(txtMediumDailyAll, mediumDailyAll);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily over all amount
	 * @param fullDailyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCDailyAll(String fullDailyAll) {
		clearAndSendTextInTextBox(txtFullDailyAll, fullDailyAll);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly in amount
	 * @param nonMonthlyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCMonthlyIn(String nonMonthlyIn) {
		clearAndSendTextInTextBox(txtNonMonthlyIn, nonMonthlyIn);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly in amount
	 * @param mediumMonthlyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCMonthlyIn(String mediumMonthlyIn) {
		clearAndSendTextInTextBox(txtMediumMonthlyIn, mediumMonthlyIn);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly in amount
	 * @param fullMonthlyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCMonthlyIn(String fullMonthlyIn) {
		clearAndSendTextInTextBox(txtFullMonthlyIn, fullMonthlyIn);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly out amount
	 * @param nonMonthlyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCMonthlyOut(String nonMonthlyOut) {
		clearAndSendTextInTextBox(txtNonMonthlyOut, nonMonthlyOut);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly out amount
	 * @param mediumMonthlyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCMonthlyOut(String mediumMonthlyOut) {
		clearAndSendTextInTextBox(txtMediumMonthlyOut, mediumMonthlyOut);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly out amount
	 * @param fullMonthlyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCMonthlyOut(String fullMonthlyOut) {
		clearAndSendTextInTextBox(txtFullMonthlyOut, fullMonthlyOut);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly over all amount
	 * @param nonMonthlyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCMonthlyAll(String nonMonthlyAll) {
		clearAndSendTextInTextBox(txtNonMonthlyAll, nonMonthlyAll);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly over all amount
	 * @param mediumMonthlyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCMonthlyAll(String mediumMonthlyAll) {
		clearAndSendTextInTextBox(txtMediumMonthlyAll, mediumMonthlyAll);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly over all amount
	 * @param fullMonthlyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCmonthlyAll(String fullMonthlyAll) {
		clearAndSendTextInTextBox(txtFullMonthlyAll, fullMonthlyAll);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly in amount
	 * @param nonWeeklyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCWeeklyIn(String nonWeeklyIn) {
		clearAndSendTextInTextBox(txtNonWeeklyIn, nonWeeklyIn);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly in amount
	 * @param mediumWeeklyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCWeeklyIn(String mediumWeeklyIn) {
		clearAndSendTextInTextBox(txtMediumWeeklyIn, mediumWeeklyIn);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly in amount
	 * @param fullWeeklyIn
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCWeeklyIn(String fullWeeklyIn) {
		clearAndSendTextInTextBox(txtFullWeeklyIn, fullWeeklyIn);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly out amount
	 * @param nonWeeklyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCWeeklyOut(String nonWeeklyOut) {
		clearAndSendTextInTextBox(txtNonWeeklyOut, nonWeeklyOut);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly out amount
	 * @param mediumWeeklyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCWeeklyOut(String mediumWeeklyOut) {
		clearAndSendTextInTextBox(txtMediumWeeklyOut, mediumWeeklyOut);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly out amount
	 * @param fullWeeklyOut
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCWeeklyOut(String fullWeeklyOut) {
		clearAndSendTextInTextBox(txtFullWeeklyOut, fullWeeklyOut);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly over all amount
	 * @param nonWeeklyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInNonKYCWeeklyAll(String nonWeeklyAll) {
		clearAndSendTextInTextBox(txtNonWeeklyAll, nonWeeklyAll);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly over all amount
	 * @param mediumWeeklyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInMediumKYCWeeklyAll(String mediumWeeklyAll) {
		clearAndSendTextInTextBox(txtMediumWeeklyAll, mediumWeeklyAll);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly over all amount
	 * @param fullWeeklyAll
	 * @creation date 14/11/2018
	 */
	public void sendTextInFullKYCWeeklyAll(String fullWeeklyAll) {
		clearAndSendTextInTextBox(txtFullWeeklyAll, fullWeeklyAll);
	}

	/**
	 * @author dishant.doshi to clike on access channel
	 * @param accessChannelName
	 * @creation date 14/11/2018
	 */
	public void clickOnAccessChannel(String accessChannelName) {
		clickOnElement(
				By.xpath("//*[contains(@id,'access')]//span[normalize-space(text())='" + accessChannelName + "']"));
	}

	public void sendTextInStakeHolderName(String stakeHolderName) {
		removeStakeHolder();
		sendTextInTextBox(txtStakeHolderName, stakeHolderName + Keys.ENTER);
	}

	public void removeStakeHolder() {
		if (verifyElement(stakeHolderRemove, false))
			clickOnElement(stakeHolderRemove);
	}

	/**
	 * @author dishant.doshi to click on service link
	 * @param ServicesName
	 * @creation date 19/11/2018
	 */
	public void clickOnServiceText(String ServicesName) {
		clickOnElement(By.xpath("//a[contains(text(),'" + ServicesName + "')]"));
	}

	/**
	 * @author dishant.doshi to click on service
	 * @creation date 19/11/2018
	 */
	public void clickOnService(String interoperability_Service) {
		if(interoperability_Service.equalsIgnoreCase(ConstantsFile.DIGITAL_TV))
			interoperability_Service = ConstantsFile.DIGITAL_TV;
		if(interoperability_Service.equalsIgnoreCase(ConstantsFile.PAY_TV_SERVICES))
			interoperability_Service = ConstantsFile.PAY_TV_SERVICES;
		clickOnElement(By.xpath("//*[normalize-space(text()) = '" + interoperability_Service.trim() + "']"));
	}

	/**
	 * @author dishant.doshi to click on icon of kyc detail
	 * @creation date 19/11/2018
	 */
	public void clickOnKYCDetailsPlusIcon() {
		clickOnElement(openKYCDetails);
	}

	/**
	 * @author dishant.doshi to click on icon of threshold setting
	 * @creation date 19/11/2018
	 */
	public void clickOnThresholdSettingPlusIcon() {
		clickOnElement(openThresholdSettings);
	}

	/**
	 * @author dishant.doshi to click on icon of access channel
	 * @creation date 19/11/2018
	 */
	public void clickOnAccessChannelPlusIcon() {
		clickOnElement(openAccessChannel);
	}

	/**
	 * @author dishant.doshi to click on icon of services
	 * @creation date 19/11/2018
	 */
	public void clickOnServicesPlusIcon() {
		clickOnElement(openServices);
	}

	/**
	 * @author dishant.doshi to click on profile details link while edit profile
	 * @creation date 19/11/2018
	 */
	public void clickOnProfileDetailsLink() {
		clickOnElement(profileDetailsLink);
	}

	/**
	 * @author dishant.doshi to click on kyc details link while edit profile
	 * @creation date 19/11/2018
	 */
	public void clickOnKYCDetailsLink() {
		clickOnElement(kycDetailsLink);
	}

	/**
	 * @author dishant.doshi to click on profile threshold setting link while
	 *         edit profile
	 * @creation date 19/11/2018
	 */
	public void clickOnThresholdSettingLink() {
		clickOnElement(thresholdSettingLink);
	}

	/**
	 * @author dishant.doshi to click on access channel link while edit profile
	 * @creation date 19/11/2018
	 */
	public void clickOnAccessChannelLink() {
		clickOnElement(accessChannelLink);
	}

	/**
	 * @author dishant.doshi to click on services link while edit profile
	 * @creation date 19/11/2018
	 */
	public void clickOnServicesLink() {
		clickOnElement(servicesLink);
	}

	/**
	 * @author dishant.doshi to click on profile summary link while edit profile
	 * @creation date 19/11/2018
	 */
	public void clickOnProfileSummaryLink() {
		clickOnElement(profileSummaryLink);
	}

	public void clickOnNavigationLink(WebElement webElement) {
		webElement.click();
	}

	/**
	 * @author dishant.doshi to add Profile
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 19/11/2018
	 */
	public void addProfile(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInProfileName(map.get(mapKeys.get(0)).toString());
		String[] kycType = map.get(mapKeys.get(1)).toString().split(",");
		for (int i = 0; i < kycType.length; i++) {
			selectTextInAllowedKYCType(kycType[i].trim());
		}
		selectTextInStatus(map.get(mapKeys.get(2)).toString());
		clickOnNextBtn();
		if (verifyToolTip()) {
			clickOnCancelBtn();
		} else {
			List<WebElement> navigationInKYCDetails = getElementList(kycDetails);
			for (int i = 0; i < navigationInKYCDetails.size(); i++) {
				if ((!map.get(mapKeys.get(3)).toString().equals(""))
						|| (!map.get(mapKeys.get(3)).toString().isEmpty())) {
					String[] kycCategories = map.get(mapKeys.get(3)).toString().split("/");
					for (int k = 0; k < kycCategories.length; k++) {
						String[] kycCategory = kycCategories[k].split(":");
						String[] kycFields = kycCategory[1].split(",");
						List<WebElement> kycCategoryexistingvalues = getElementList(
								By.xpath("//*[normalize-space(text())='" + kycCategory[0].trim()
										+ "']//ancestor::li[@class='active']//ancestor::div[@id='kyc-content-sec']//div[contains(@class,'kyc-wizard-data active')]//li"));
						ArrayList<String> existingStrings = new ArrayList<String>();
						for (WebElement ele : kycCategoryexistingvalues) {
							existingStrings.add(ele.getText());
						}

						for (int f = 0; f < kycFields.length; f++) {
							if (!(existingStrings.contains(kycFields[f]))
									&& verifyElement(By.xpath("//*[normalize-space(text())='" + kycCategory[0].trim()
											+ "']//ancestor::li[@class='active']"), false)) {
								selectTextInKYCDetails(
										By.xpath("//*[normalize-space(text())='" + kycCategory[0].trim()
												+ "']//ancestor::li[@class='active']//ancestor::div[@id='kyc-content-sec']//ancestor::div[@id='kyc-content-sec']//div[contains(@class,'kyc-wizard-data active')]//select"),
										kycFields[f]);
								clickOnAddField(By.xpath("//*[normalize-space(text())='" + kycCategory[0].trim()
										+ "']//ancestor::li[@class='active']//ancestor::div[@id='kyc-content-sec']//ancestor::div[@id='kyc-content-sec']//div[contains(@class,'kyc-wizard-data active')]//span[text()='Add Field']"));
							}
						}
					}
				}

				String[] nonKYCFields = map.get(mapKeys.get(4)).toString().split("/");
				String[] mediumKYCFields = map.get(mapKeys.get(5)).toString().split("/");
				String[] fullKYCFields = map.get(mapKeys.get(6)).toString().split("/");
				String[] mandatoryFields = map.get(mapKeys.get(7)).toString().split("/");
				String[] showFields = map.get(mapKeys.get(8)).toString().split("/");
				String[] isEditableFields = map.get(mapKeys.get(9)).toString().split("/");
				String[] isEditableAdminFields = map.get(mapKeys.get(10)).toString().split("/");

				for (int n = 0; n < nonKYCFields.length; n++) {
					String[] nonKYCField = nonKYCFields[n].split(":");
					if (!map.get(mapKeys.get(4)).toString().equals("")) {
						String[] nonField = nonKYCField[1].split(",");
						if (verifyElement(By.xpath("//label[normalize-space(text())='" + nonKYCField[0].trim() + "']"),
								false)) {
							for (int a = 0; a < nonField.length; a++) {
								clickOnNonKYCRadio(nonField[a].trim());
							}
						}
					}
				}
				for (int m = 0; m < mediumKYCFields.length; m++) {
					String[] mediumKYCField = mediumKYCFields[m].split(":");
					if (!map.get(mapKeys.get(5)).toString().equals("")) {
						String[] mediumField = mediumKYCField[1].split(",");
						if (verifyElement(By.xpath("//*[normalize-space(text())='" + mediumKYCField[0].trim()
								+ "']//ancestor::li[@class='active']"), false)) {
							for (int a = 0; a < mediumField.length; a++) {
								clickOnMediumKYCRadio(mediumField[a].trim());
							}
						}
					}
				}
				for (int f = 0; f < fullKYCFields.length; f++) {
					String[] fullKYCField = fullKYCFields[f].split(":");
					if (!map.get(mapKeys.get(6)).toString().equals("")) {
						String[] fullField = fullKYCField[1].split(",");
						if (verifyElement(By.xpath("//*[normalize-space(text())='" + fullKYCField[0].trim()
								+ "']//ancestor::li[@class='active']"), false)) {
							for (int a = 0; a < fullField.length; a++) {
								clickOnFullKYCRadio(fullField[a].trim());
							}
						}
					}
				}
				for (int m = 0; m < mandatoryFields.length; m++) {
					String[] mandatoryField = mandatoryFields[m].split(":");
					if (!map.get(mapKeys.get(7)).toString().equals("")) {
						String[] mandatory = mandatoryField[1].split(",");
						if (verifyElement(By.xpath("//*[normalize-space(text())='" + mandatoryField[0].trim()
								+ "']//ancestor::li[@class='active']"), false)) {
							for (int a = 0; a < mandatory.length; a++) {
								clickOnMandatoryCheckBox(mandatory[a].trim());
							}
						}
					}
				}
				for (int m = 0; m < showFields.length; m++) {
					String[] showField = showFields[m].split(":");
					if (!map.get(mapKeys.get(8)).toString().equals("")) {
						String[] show = showField[1].split(",");
						if (verifyElement(By.xpath("//*[normalize-space(text())='" + showField[0].trim()
								+ "']//ancestor::li[@class='active']"), false)) {
							for (int a = 0; a < show.length; a++) {
								clickOnShowCheckBox(show[a].trim());
							}
						}
					}
				}
				for (int m = 0; m < isEditableFields.length; m++) {
					String[] isEditableField = isEditableFields[m].split(":");
					if (!map.get(mapKeys.get(9)).toString().equals("")) {
						String[] isEditable = isEditableField[1].split(",");
						if (verifyElement(By.xpath("//*[normalize-space(text())='" + isEditableField[0].trim()
								+ "']//ancestor::li[@class='active']"), false)) {
							for (int a = 0; a < isEditable.length; a++) {
								clickOnIsEditableCheckBox(isEditable[a].trim());
							}
						}
					}
				}
				for (int m = 0; m < isEditableAdminFields.length; m++) {
					String[] isEditableAdminField = isEditableAdminFields[m].split(":");
					if (!map.get(mapKeys.get(10)).toString().equals("")) {
						String[] isEditableAdmin = isEditableAdminField[1].split(",");
						if (verifyElement(By.xpath("//*[normalize-space(text())='" + isEditableAdminField[0].trim()
								+ "']//ancestor::li[@class='active']"), false)) {
							for (int a = 0; a < isEditableAdmin.length; a++) {
								clickOnIsEditableAdminCheckBox(isEditableAdmin[a].trim());
							}
						}
					}
				}
				clickOnNextBtn();
			}
			if (verifyToolTip()) {
				clickOnCancelBtn();
				getStriptText();
			} else {
				String nonDailyAmount[] = map.get(mapKeys.get(13)).toString().split(",");
				String nonWeeklyAmount[] = map.get(mapKeys.get(14)).toString().split(",");
				String nonMonthlyAmount[] = map.get(mapKeys.get(15)).toString().split(",");
				String mediumDailyAmount[] = map.get(mapKeys.get(18)).toString().split(",");
				String mediumWeeklyAmount[] = map.get(mapKeys.get(19)).toString().split(",");
				String mediumMonthlyAmount[] = map.get(mapKeys.get(20)).toString().split(",");
				String fullDailyAmount[] = map.get(mapKeys.get(23)).toString().split(",");
				String fullWeeklyAmount[] = map.get(mapKeys.get(24)).toString().split(",");
				String fullMonthlyAmount[] = map.get(mapKeys.get(25)).toString().split(",");

				if (verifyElement(nonKYCThreshold, false)) {
					sendTextInNonKYCMinimumAmount(map.get(mapKeys.get(11)).toString());
					sendTextInNonKYCMaximumAmount(map.get(mapKeys.get(12)).toString());
					sendTextInNonKYCDailyIn(nonDailyAmount[0].trim());
					sendTextInNonKYCDailyOut(nonDailyAmount[1].trim());
					sendTextInNonKYCDailyAll(nonDailyAmount[2].trim());
					sendTextInNonKYCWeeklyIn(nonWeeklyAmount[0].trim());
					sendTextInNonKYCWeeklyOut(nonWeeklyAmount[1].trim());
					sendTextInNonKYCWeeklyAll(nonWeeklyAmount[2].trim());
					sendTextInNonKYCMonthlyIn(nonMonthlyAmount[0].trim());
					sendTextInNonKYCMonthlyOut(nonMonthlyAmount[1].trim());
					sendTextInNonKYCMonthlyAll(nonMonthlyAmount[2].trim());
				}
				if (verifyElement(mediumKYCThreshold, false)) {
					sendTextInMediumKYCMinimumAmount(map.get(mapKeys.get(16)).toString());
					sendTextInMediumKYCMaximumAmount(map.get(mapKeys.get(17)).toString());
					sendTextInMediumKYCDailyIn(mediumDailyAmount[0].trim());
					sendTextInMediumKYCDailyOut(mediumDailyAmount[1].trim());
					sendTextInMediumKYCDailyAll(mediumDailyAmount[2].trim());
					sendTextInMediumKYCWeeklyIn(mediumWeeklyAmount[0].trim());
					sendTextInMediumKYCWeeklyOut(mediumWeeklyAmount[1].trim());
					sendTextInMediumKYCWeeklyAll(mediumWeeklyAmount[2].trim());
					sendTextInMediumKYCMonthlyIn(mediumMonthlyAmount[0].trim());
					sendTextInMediumKYCMonthlyOut(mediumMonthlyAmount[1].trim());
					sendTextInMediumKYCMonthlyAll(mediumMonthlyAmount[2].trim());
				}
				if (verifyElement(fullKYCThreshold, false)) {
					sendTextInFullKYCMinimumAmount(map.get(mapKeys.get(21)).toString());
					sendTextInFullKYCMaximumAmount(map.get(mapKeys.get(22)).toString());
					sendTextInFullKYCDailyIn(fullDailyAmount[0].trim());
					sendTextInFullKYCDailyOut(fullDailyAmount[1].trim());
					sendTextInFullKYCDailyAll(fullDailyAmount[2].trim());
					sendTextInFullKYCWeeklyIn(fullWeeklyAmount[0].trim());
					sendTextInFullKYCWeeklyOut(fullWeeklyAmount[1].trim());
					sendTextInFullKYCWeeklyAll(fullWeeklyAmount[2].trim());
					sendTextInFullKYCMonthlyIn(fullMonthlyAmount[0].trim());
					sendTextInFullKYCMonthlyOut(fullMonthlyAmount[1].trim());
					sendTextInFullKYCmonthlyAll(fullMonthlyAmount[2].trim());
				}
				clickOnNextBtn();
				if (verifyToolTip()) {
					clickOnCancelBtn();
					getStriptText();
				} else {
					String[] accessChannel = map.get(mapKeys.get(26)).toString().split(",");
					for (int i = 0; i < accessChannel.length; i++) {
						clickOnAccessChannel(accessChannel[i].trim());
					}
					clickOnNextBtn();
					String[] serviceName = map.get(mapKeys.get(27)).toString().split("/");
					for (int i = 0; i < serviceName.length; i++) {
						String[] services = serviceName[i].split(":");
						clickOnServiceText(services[0].trim());
						String[] name = services[1].split(",");
						for (int j = 0; j < name.length; j++) {
							clickOnService(setFirstCharInCaps(name[j].trim(), true));
						}
					}
					clickOnNextBtn();
					sendTextInStakeHolderName(map.get(mapKeys.get(28)).toString());
					clickOnSaveBtn();
				}
			}
		}
	}

	/**
	 * @author dishant.doshi to verify Profile added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 19/11/2018
	 * @return true if Profile added successfully
	 */
	public boolean verifyProfileAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By profileName = By
				.xpath("//label[text()[normalize-space() = 'Profile Name']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By status = By
				.xpath("//label[text()[normalize-space() = 'Status']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By stakeHolder = By
				.xpath("//label[text()[normalize-space() = 'Stakeholder List']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(28)).toString() + "']");

		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (!verifyElement(profileName, false))
				return false;
			String[] allowedKYCType = map.get(mapKeys.get(1)).toString().split(",");
			for (int i = 0; i < allowedKYCType.length; i++) {
				By AllowedKYCType = By
						.xpath("//label[text()[normalize-space() = 'Allowed KYC Type']]//following-sibling :: div[contains(text(),'"
								+ allowedKYCType[i].trim() + "')]");
				if (!verifyElement(AllowedKYCType))
					return false;
			}
			if (!verifyElement(status, false))
				return false;
			if (!verifyElement(stakeHolder, false))
				return false;
			if (!map.get(mapKeys.get(3)).toString().equals("")) {
				clickOnKYCDetailsPlusIcon();
				String[] kycCategories = map.get(mapKeys.get(3)).toString().split("/");
				for (int k = 0; k < kycCategories.length; k++) {
					String[] kycCategory = kycCategories[k].split(":");
					String[] kycFields = kycCategory[1].split(",");
					for (int f = 0; f < kycFields.length; f++) {
						By kycFiels = By.xpath("//*[normalize-space(text())='" + kycCategory[0].trim()
								+ "']//preceding-sibling::td[normalize-space(text())='" + kycFields[f].trim() + "']");
						if (!verifyElement(kycFiels, false))
							return false;
					}
				}
				String[] nonKYCFields = map.get(mapKeys.get(4)).toString().split("/");
				String[] mediumKYCFields = map.get(mapKeys.get(5)).toString().split("/");
				String[] fullKYCFields = map.get(mapKeys.get(6)).toString().split("/");
				String[] mandatoryFields = map.get(mapKeys.get(7)).toString().split("/");
				String[] showFields = map.get(mapKeys.get(8)).toString().split("/");
				String[] isEditableFields = map.get(mapKeys.get(9)).toString().split("/");
				String[] isEditableAdminFields = map.get(mapKeys.get(10)).toString().split("/");

				for (int n = 0; n < nonKYCFields.length; n++) {
					String[] nonKYCField = nonKYCFields[n].split(":");
					if (!map.get(mapKeys.get(4)).toString().equals("")) {
						String[] nonField = nonKYCField[1].split(",");
						for (int a = 0; a < nonField.length; a++) {
							By nonKYC = By.xpath("//*[normalize-space(text())='" + nonKYCField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + nonField[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Non KYC']");
							if (!verifyElement(nonKYC, false))
								return false;
						}
					}
				}
				for (int m = 0; m < mediumKYCFields.length; m++) {
					String[] mediumKYCField = mediumKYCFields[m].split(":");
					if (!map.get(mapKeys.get(5)).toString().equals("")) {
						String[] mediumField = mediumKYCField[1].split(",");
						for (int a = 0; a < mediumField.length; a++) {
							By mediumKYC = By.xpath("//*[normalize-space(text())='" + mediumKYCField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + mediumField[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Medium KYC']");
							if (!verifyElement(mediumKYC, false))
								return false;
						}
					}
				}
				for (int f = 0; f < fullKYCFields.length; f++) {
					String[] fullKYCField = fullKYCFields[f].split(":");
					if (!map.get(mapKeys.get(6)).toString().equals("")) {
						String[] fullField = fullKYCField[1].split(",");
						for (int a = 0; a < fullField.length; a++) {
							By fullKYC = By.xpath("//*[normalize-space(text())='" + fullKYCField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + fullField[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Full KYC']");
							if (!verifyElement(fullKYC, false))
								return false;
						}
					}
				}
				for (int m = 0; m < mandatoryFields.length; m++) {
					String[] mandatoryField = mandatoryFields[m].split(":");
					if (!map.get(mapKeys.get(7)).toString().equals("")) {
						String[] mandatory = mandatoryField[1].split(",");
						for (int a = 0; a < mandatory.length; a++) {
							By mandatoryCheckBox = By.xpath("(//*[normalize-space(text())='" + mandatoryField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + mandatory[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[1]");
							if (!verifyElement(mandatoryCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < showFields.length; m++) {
					String[] showField = showFields[m].split(":");
					if (!map.get(mapKeys.get(8)).toString().equals("")) {
						String[] show = showField[1].split(",");
						for (int a = 0; a < show.length; a++) {
							By showCheckBox = By.xpath("(//*[normalize-space(text())='" + showField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + show[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[2]");
							if (!verifyElement(showCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < isEditableFields.length; m++) {
					String[] isEditableField = isEditableFields[m].split(":");
					if (!map.get(mapKeys.get(9)).toString().equals("")) {
						String[] isEditable = isEditableField[1].split(",");
						for (int a = 0; a < isEditable.length; a++) {
							By isEditableCheckBox = By.xpath("(//*[normalize-space(text())='"
									+ isEditableField[0].trim() + "']//preceding-sibling::td[normalize-space(text())='"
									+ isEditable[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[3]");
							if (!verifyElement(isEditableCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < isEditableAdminFields.length; m++) {
					String[] isEditableAdminField = isEditableAdminFields[m].split(":");
					if (!map.get(mapKeys.get(10)).toString().equals("")) {
						String[] isEditableAdmin = isEditableAdminField[1].split(",");
						for (int a = 0; a < isEditableAdmin.length; a++) {
							By isEditableAdminCheckBox = By.xpath("(//*[normalize-space(text())='"
									+ isEditableAdminField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + isEditableAdmin[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[4]");
							if (!verifyElement(isEditableAdminCheckBox, false))
								return false;
						}
					}
				}
			}

			clickOnThresholdSettingPlusIcon();
			String nonDailyAmount[] = map.get(mapKeys.get(13)).toString().split(",");
			String nonWeeklyAmount[] = map.get(mapKeys.get(14)).toString().split(",");
			String nonMonthlyAmount[] = map.get(mapKeys.get(15)).toString().split(",");
			String mediumDailyAmount[] = map.get(mapKeys.get(18)).toString().split(",");
			String mediumWeeklyAmount[] = map.get(mapKeys.get(19)).toString().split(",");
			String mediumMonthlyAmount[] = map.get(mapKeys.get(20)).toString().split(",");
			String fullDailyAmount[] = map.get(mapKeys.get(23)).toString().split(",");
			String fullWeeklyAmount[] = map.get(mapKeys.get(24)).toString().split(",");
			String fullMonthlyAmount[] = map.get(mapKeys.get(25)).toString().split(",");
			int kycType = 0;
			if (map.get(mapKeys.get(1)).toString().contains("Non")) {
				kycType++;
				By nonMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				if (!getUIText(nonMin).split(" ")[1].equals(map.get(mapKeys.get(11)).toString()))
					return false;
				if (!getUIText(nonMax).split(" ")[1].equals(map.get(mapKeys.get(12)).toString()))
					return false;
				if (!getUIText(nonDailyIn).split(" ")[1].equals(nonDailyAmount[0].trim()))
					return false;
				if (!getUIText(nonDailyOut).split(" ")[1].equals(nonDailyAmount[1].trim()))
					return false;
				if (!getUIText(nonDailyAll).split(" ")[1].equals(nonDailyAmount[2].trim()))
					return false;
				if (!getUIText(nonWeeklyIn).split(" ")[1].equals(nonWeeklyAmount[0].trim()))
					return false;
				if (!getUIText(nonWeeklyOut).split(" ")[1].equals(nonWeeklyAmount[1].trim()))
					return false;
				if (!getUIText(nonWeeklyAll).split(" ")[1].equals(nonWeeklyAmount[2].trim()))
					return false;
				if (!getUIText(nonMonthlyIn).split(" ")[1].equals(nonMonthlyAmount[0].trim()))
					return false;
				if (!getUIText(nonMonthlyOut).split(" ")[1].equals(nonMonthlyAmount[1].trim()))
					return false;
				if (!getUIText(nonMonthlyAll).split(" ")[1].equals(nonMonthlyAmount[2].trim()))
					return false;
			}
			if (map.get(mapKeys.get(1)).toString().contains("Medium")) {
				kycType++;
				By mediumMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				if (!getUIText(mediumMin).split(" ")[1].equals(map.get(mapKeys.get(16)).toString()))
					return false;
				if (!getUIText(mediumMax).split(" ")[1].equals(map.get(mapKeys.get(17)).toString()))
					return false;
				if (!getUIText(mediumDailyIn).split(" ")[1].equals(mediumDailyAmount[0].trim()))
					return false;
				if (!getUIText(mediumDailyOut).split(" ")[1].equals(mediumDailyAmount[1].trim()))
					return false;
				if (!getUIText(mediumDailyAll).split(" ")[1].equals(mediumDailyAmount[2].trim()))
					return false;
				if (!getUIText(mediumWeeklyIn).split(" ")[1].equals(mediumWeeklyAmount[0].trim()))
					return false;
				if (!getUIText(mediumWeeklyOut).split(" ")[1].equals(mediumWeeklyAmount[1].trim()))
					return false;
				if (!getUIText(mediumWeeklyAll).split(" ")[1].equals(mediumWeeklyAmount[2].trim()))
					return false;
				if (!getUIText(mediumMonthlyIn).split(" ")[1].equals(mediumMonthlyAmount[0].trim()))
					return false;
				if (!getUIText(mediumMonthlyOut).split(" ")[1].equals(mediumMonthlyAmount[1].trim()))
					return false;
				if (!getUIText(mediumMonthlyAll).split(" ")[1].equals(mediumMonthlyAmount[2].trim()))
					return false;
			}
			if (map.get(mapKeys.get(1)).toString().contains("Full")) {
				kycType++;
				By fullMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				if (!getUIText(fullMin).split(" ")[1].equals(map.get(mapKeys.get(21)).toString()))
					return false;
				if (!getUIText(fullMax).split(" ")[1].equals(map.get(mapKeys.get(22)).toString()))
					return false;
				if (!getUIText(fullDailyIn).split(" ")[1].equals(fullDailyAmount[0].trim()))
					return false;
				if (!getUIText(fullDailyOut).split(" ")[1].equals(fullDailyAmount[1].trim()))
					return false;
				if (!getUIText(fullDailyAll).split(" ")[1].equals(fullDailyAmount[2].trim()))
					return false;
				if (!getUIText(fullWeeklyIn).split(" ")[1].equals(fullWeeklyAmount[0].trim()))
					return false;
				if (!getUIText(fullWeeklyOut).split(" ")[1].equals(fullWeeklyAmount[1].trim()))
					return false;
				if (!getUIText(fullWeeklyAll).split(" ")[1].equals(fullWeeklyAmount[2].trim()))
					return false;
				if (!getUIText(fullMonthlyIn).split(" ")[1].equals(fullMonthlyAmount[0].trim()))
					return false;
				if (!getUIText(fullMonthlyOut).split(" ")[1].equals(fullMonthlyAmount[1].trim()))
					return false;
				if (!getUIText(fullMonthlyAll).split(" ")[1].equals(fullMonthlyAmount[2].trim()))
					return false;
			}
			clickOnAccessChannelPlusIcon();
			String[] accessChannel = map.get(mapKeys.get(26)).toString().split(",");
			for (int i = 0; i < accessChannel.length; i++) {
				By access = By.xpath("//*[normalize-space(text())='" + accessChannel[i].trim() + "']");
				if (!verifyElement(access, false))
					return false;
			}

			clickOnServicesPlusIcon();
			String[] serviceName = map.get(mapKeys.get(27)).toString().split("/");
			for (int i = 0; i < serviceName.length; i++) {
				String[] services = serviceName[i].split(":");
				String[] name = services[1].split(",");
				for (int j = 0; j < name.length; j++) {
					String servicename = setFirstCharInCaps(name[j].trim(), true);
					if(servicename.equalsIgnoreCase(ConstantsFile.DIGITAL_TV))
						servicename = ConstantsFile.DIGITAL_TV;
					if(servicename.equalsIgnoreCase(ConstantsFile.PAY_TV_SERVICES))
						servicename = ConstantsFile.PAY_TV_SERVICES;
					By service = By.xpath("//*[normalize-space(text())='" + services[0].trim()
							+ "']//preceding-sibling::td[normalize-space(text())='" + servicename + "']");
					if (!verifyElement(service, false))
						return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to edit Profile
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 19/11/2018
	 */
	public void editProfile(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnEditBtn();
			clickOnProfileDetailsLink();
			selectTextInStatus(map.get(mapKeys.get(2)).toString());
			clickOnKYCDetailsLink();
			List<WebElement> navigationInKYCDetails = getElementList(kycDetails);
			for (int i = 0; i < navigationInKYCDetails.size(); i++) {
				if (!map.get(mapKeys.get(3)).toString().equals("")) {
					String[] kycCategories = map.get(mapKeys.get(3)).toString().split("/");
					for (int k = 0; k < kycCategories.length; k++) {
						String[] kycCategory = kycCategories[k].split(":");
						String[] kycFields = kycCategory[1].split(",");
						List<WebElement> kycCategoryexistingvalues = getElementList(
								By.xpath("//label[normalize-space(text())='" + kycCategory[0].trim()
										+ "']//ancestor::div[contains(@class,'kyc-wizard')]//following-sibling::div[contains(@class,'category_section')]//li//div[@class='item-header']"));
						ArrayList<String> existingStrings = new ArrayList<String>();
						for (WebElement ele : kycCategoryexistingvalues) {
							existingStrings.add(ele.getText());
						}

						for (int f = 0; f < kycFields.length; f++) {
							if (!(existingStrings.contains(kycFields[f])) && verifyElement(
									By.xpath("//label[normalize-space(text())='" + kycCategory[0].trim() + "']"),
									false)) {
								selectTextInKYCDetails(
										By.xpath("//label[normalize-space(text())='" + kycCategory[0].trim()
												+ "']/../..//following-sibling::div//select[contains(@id,'SelectFieldsec')]"),
										kycFields[f]);
								clickOnAddField(By.xpath("//label[normalize-space(text())='" + kycCategory[0].trim()
										+ "']/../..//following-sibling::div//*[normalize-space(text())='Add Field']"));
							}
						}

					}
					String[] nonKYCFields = map.get(mapKeys.get(4)).toString().split("/");
					String[] mediumKYCFields = map.get(mapKeys.get(5)).toString().split("/");
					String[] fullKYCFields = map.get(mapKeys.get(6)).toString().split("/");
					String[] mandatoryFields = map.get(mapKeys.get(7)).toString().split("/");
					String[] showFields = map.get(mapKeys.get(8)).toString().split("/");
					String[] isEditableFields = map.get(mapKeys.get(9)).toString().split("/");
					String[] isEditableAdminFields = map.get(mapKeys.get(10)).toString().split("/");
					for (int n = 0; n < nonKYCFields.length; n++) {
						String[] nonKYCField = nonKYCFields[n].split(":");
						if (!map.get(mapKeys.get(4)).toString().equals("")) {
							String[] nonField = nonKYCField[1].split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + nonKYCField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < nonField.length; a++) {
									clickOnNonKYCRadioForEdit(nonField[a].trim());
								}
							}
						}
					}
					for (int m = 0; m < mediumKYCFields.length; m++) {
						String[] mediumKYCField = mediumKYCFields[m].split(":");
						if (!map.get(mapKeys.get(5)).toString().equals("")) {
							String[] mediumField = mediumKYCField[1].split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + mediumKYCField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < mediumField.length; a++) {
									clickOnMediumKYCRadioForEdit(mediumField[a].trim());
								}
							}
						}
					}
					for (int f = 0; f < fullKYCFields.length; f++) {
						String[] fullKYCField = fullKYCFields[f].split(":");
						if (!map.get(mapKeys.get(6)).toString().equals("")) {
							String[] fullField = fullKYCField[1].split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + fullKYCField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < fullField.length; a++) {
									clickOnFullKYCRadioForEdit(fullField[a].trim());
								}
							}
						}
					}
					for (int m = 0; m < mandatoryFields.length; m++) {
						String[] mandatoryField = mandatoryFields[m].split(":");
						if (!map.get(mapKeys.get(7)).toString().equals("")) {
							String[] mandatory = mandatoryField[1].split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + mandatoryField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < mandatory.length; a++) {
									clickOnMandatoeyCheckBoxForEdit(mandatory[a].trim());
								}
							}
						}
					}
					for (int m = 0; m < showFields.length; m++) {
						String[] showField = showFields[m].split(":");
						if (!map.get(mapKeys.get(8)).toString().equals("")) {
							String[] show = showField[1].split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + showField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < show.length; a++) {
									clickOnShowCheckBox(show[a].trim());
								}
							}
						}
					}
					for (int m = 0; m < isEditableFields.length; m++) {
						String[] isEditableField = isEditableFields[m].split(":");
						if (!map.get(mapKeys.get(9)).toString().equals("")) {
							String[] isEditable = isEditableField[1].split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + isEditableField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < isEditable.length; a++) {
									clickOnIsEditableCheckBox(isEditable[a].trim());
								}
							}
						}
					}
					for (int m = 0; m < isEditableAdminFields.length; m++) {
						String[] isEditableAdminField = isEditableAdminFields[m].split(":");
						if (!map.get(mapKeys.get(10)).toString().equals("")) {
							String[] isEditableAdmin = isEditableAdminField[1].split(",");
							if (verifyElement(By
									.xpath("//label[normalize-space(text())='" + isEditableAdminField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < isEditableAdmin.length; a++) {
									clickOnIsEditableAdminCheckBox(isEditableAdmin[a].trim());
								}
							}
						}
					}
				}
				if (i != navigationInKYCDetails.size() - 1)
					clickOnNavigationLink(navigationInKYCDetails.get(i + 1));
			}
			clickOnThresholdSettingLink();
			String nonDailyAmount[] = map.get(mapKeys.get(13)).toString().split(",");
			String nonWeeklyAmount[] = map.get(mapKeys.get(14)).toString().split(",");
			String nonMonthlyAmount[] = map.get(mapKeys.get(15)).toString().split(",");
			String mediumDailyAmount[] = map.get(mapKeys.get(18)).toString().split(",");
			String mediumWeeklyAmount[] = map.get(mapKeys.get(19)).toString().split(",");
			String mediumMonthlyAmount[] = map.get(mapKeys.get(20)).toString().split(",");
			String fullDailyAmount[] = map.get(mapKeys.get(23)).toString().split(",");
			String fullWeeklyAmount[] = map.get(mapKeys.get(24)).toString().split(",");
			String fullMonthlyAmount[] = map.get(mapKeys.get(25)).toString().split(",");

			if (verifyElement(nonKYCThreshold, false)) {
				sendTextInNonKYCMinimumAmount(map.get(mapKeys.get(11)).toString());
				sendTextInNonKYCMaximumAmount(map.get(mapKeys.get(12)).toString());
				sendTextInNonKYCDailyIn(nonDailyAmount[0].trim());
				sendTextInNonKYCDailyOut(nonDailyAmount[1].trim());
				sendTextInNonKYCDailyAll(nonDailyAmount[2].trim());
				sendTextInNonKYCWeeklyIn(nonWeeklyAmount[0].trim());
				sendTextInNonKYCWeeklyOut(nonWeeklyAmount[1].trim());
				sendTextInNonKYCWeeklyAll(nonWeeklyAmount[2].trim());
				sendTextInNonKYCMonthlyIn(nonMonthlyAmount[0].trim());
				sendTextInNonKYCMonthlyOut(nonMonthlyAmount[1].trim());
				sendTextInNonKYCMonthlyAll(nonMonthlyAmount[2].trim());
			}
			if (verifyElement(mediumKYCThreshold, false)) {
				sendTextInMediumKYCMinimumAmount(map.get(mapKeys.get(16)).toString());
				sendTextInMediumKYCMaximumAmount(map.get(mapKeys.get(17)).toString());
				sendTextInMediumKYCDailyIn(mediumDailyAmount[0].trim());
				sendTextInMediumKYCDailyOut(mediumDailyAmount[1].trim());
				sendTextInMediumKYCDailyAll(mediumDailyAmount[2].trim());
				sendTextInMediumKYCWeeklyIn(mediumWeeklyAmount[0].trim());
				sendTextInMediumKYCWeeklyOut(mediumWeeklyAmount[1].trim());
				sendTextInMediumKYCWeeklyAll(mediumWeeklyAmount[2].trim());
				sendTextInMediumKYCMonthlyIn(mediumMonthlyAmount[0].trim());
				sendTextInMediumKYCMonthlyOut(mediumMonthlyAmount[1].trim());
				sendTextInMediumKYCMonthlyAll(mediumMonthlyAmount[2].trim());
			}
			if (verifyElement(fullKYCThreshold, false)) {
				sendTextInFullKYCMinimumAmount(map.get(mapKeys.get(21)).toString());
				sendTextInFullKYCMaximumAmount(map.get(mapKeys.get(22)).toString());
				sendTextInFullKYCDailyIn(fullDailyAmount[0].trim());
				sendTextInFullKYCDailyOut(fullDailyAmount[1].trim());
				sendTextInFullKYCDailyAll(fullDailyAmount[2].trim());
				sendTextInFullKYCWeeklyIn(fullWeeklyAmount[0].trim());
				sendTextInFullKYCWeeklyOut(fullWeeklyAmount[1].trim());
				sendTextInFullKYCWeeklyAll(fullWeeklyAmount[2].trim());
				sendTextInFullKYCMonthlyIn(fullMonthlyAmount[0].trim());
				sendTextInFullKYCMonthlyOut(fullMonthlyAmount[1].trim());
				sendTextInFullKYCmonthlyAll(fullMonthlyAmount[2].trim());
			}

			if (!map.get(mapKeys.get(26)).toString().equals("")) {
				clickOnAccessChannelLink();
				String[] accessChannel = map.get(mapKeys.get(26)).toString().split(",");
				if (!map.get(mapKeys.get(26)).toString().equals("")) {
					for (int i = 0; i < accessChannel.length; i++) {
						clickOnAccessChannel(accessChannel[i].trim());
					}
				}
			}

			if (!map.get(mapKeys.get(27)).toString().equals("")) {
				clickOnServicesLink();
				String[] serviceName = map.get(mapKeys.get(27)).toString().split("/");
				for (int i = 0; i < serviceName.length; i++) {
					String[] services = serviceName[i].split(":");
					clickOnServiceText(services[0].trim());
					String[] name = services[1].split(",");
					for (int j = 0; j < name.length; j++) {
						clickOnService(name[j].trim());
					}
				}
			}

			clickOnProfileSummaryLink();
			if (!map.get(mapKeys.get(28)).toString().equals("")) {
				sendTextInStakeHolderName(map.get(mapKeys.get(28)).toString());
			}
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify Profile edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 19/11/2018
	 * @return true if Profile edited successfully
	 */
	public boolean verifyProfileEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By profileName = By
				.xpath("//label[text()[normalize-space() = 'Profile Name']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By status = By
				.xpath("//label[text()[normalize-space() = 'Status']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By stakeHolder = By
				.xpath("//label[text()[normalize-space() = 'Stakeholder List']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(28)).toString() + "']");

		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (!verifyElement(profileName, false))
				return false;
			String[] allowedKYCType = map.get(mapKeys.get(1)).toString().split(",");
			for (int i = 0; i < allowedKYCType.length; i++) {
				By AllowedKYCType = By
						.xpath("//label[text()[normalize-space() = 'Allowed KYC Type']]//following-sibling :: div[contains(text(),'"
								+ allowedKYCType[i].trim() + "')]");
				if (!verifyElement(AllowedKYCType))
					return false;
			}
			if (!verifyElement(status, false))
				return false;
			if (!verifyElement(stakeHolder, false))
				return false;
			if (!map.get(mapKeys.get(3)).toString().equals("")) {
				clickOnKYCDetailsPlusIcon();
				String[] kycCategories = map.get(mapKeys.get(3)).toString().split("/");
				for (int k = 0; k < kycCategories.length; k++) {
					String[] kycCategory = kycCategories[k].split(":");
					String[] kycFields = kycCategory[1].split(",");
					for (int f = 0; f < kycFields.length; f++) {
						By kycFiels = By.xpath("//*[normalize-space(text())='" + kycCategory[0].trim()
								+ "']//preceding-sibling::td[normalize-space(text())='" + kycFields[f].trim() + "']");
						if (!verifyElement(kycFiels, false))
							return false;
					}
				}
				String[] nonKYCFields = map.get(mapKeys.get(4)).toString().split("/");
				String[] mediumKYCFields = map.get(mapKeys.get(5)).toString().split("/");
				String[] fullKYCFields = map.get(mapKeys.get(6)).toString().split("/");
				String[] mandatoryFields = map.get(mapKeys.get(7)).toString().split("/");
				String[] showFields = map.get(mapKeys.get(8)).toString().split("/");
				String[] isEditableFields = map.get(mapKeys.get(9)).toString().split("/");
				String[] isEditableAdminFields = map.get(mapKeys.get(10)).toString().split("/");
				for (int n = 0; n < nonKYCFields.length; n++) {
					String[] nonKYCField = nonKYCFields[n].split(":");
					if (!map.get(mapKeys.get(4)).toString().equals("")) {
						String[] nonField = nonKYCField[1].split(",");
						for (int a = 0; a < nonField.length; a++) {
							By nonKYC = By.xpath("//*[normalize-space(text())='" + nonKYCField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + nonField[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Non KYC']");
							if (!verifyElement(nonKYC, false))
								return false;
						}
					}
				}
				for (int m = 0; m < mediumKYCFields.length; m++) {
					String[] mediumKYCField = mediumKYCFields[m].split(":");
					if (!map.get(mapKeys.get(5)).toString().equals("")) {
						String[] mediumField = mediumKYCField[1].split(",");
						for (int a = 0; a < mediumField.length; a++) {
							By mediumKYC = By.xpath("//*[normalize-space(text())='" + mediumKYCField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + mediumField[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Medium KYC']");
							if (!verifyElement(mediumKYC, false))
								return false;
						}
					}
				}
				for (int f = 0; f < fullKYCFields.length; f++) {
					String[] fullKYCField = fullKYCFields[f].split(":");
					if (!map.get(mapKeys.get(6)).toString().equals("")) {
						String[] fullField = fullKYCField[1].split(",");
						for (int a = 0; a < fullField.length; a++) {
							By fullKYC = By.xpath("//*[normalize-space(text())='" + fullKYCField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + fullField[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Full KYC']");
							if (!verifyElement(fullKYC, false))
								return false;
						}
					}
				}
				for (int m = 0; m < mandatoryFields.length; m++) {
					String[] mandatoryField = mandatoryFields[m].split(":");
					if (!map.get(mapKeys.get(7)).toString().equals("")) {
						String[] mandatory = mandatoryField[1].split(",");
						for (int a = 0; a < mandatory.length; a++) {
							By mandatoryCheckBox = By.xpath("(//*[normalize-space(text())='" + mandatoryField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + mandatory[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[1]");
							if (!verifyElement(mandatoryCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < showFields.length; m++) {
					String[] showField = showFields[m].split(":");
					if (!map.get(mapKeys.get(8)).toString().equals("")) {
						String[] show = showField[1].split(",");
						for (int a = 0; a < show.length; a++) {
							By showCheckBox = By.xpath("(//*[normalize-space(text())='" + showField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + show[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[2]");
							if (!verifyElement(showCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < isEditableFields.length; m++) {
					String[] isEditableField = isEditableFields[m].split(":");
					if (!map.get(mapKeys.get(9)).toString().equals("")) {
						String[] isEditable = isEditableField[1].split(",");
						for (int a = 0; a < isEditable.length; a++) {
							By isEditableCheckBox = By.xpath("(//*[normalize-space(text())='"
									+ isEditableField[0].trim() + "']//preceding-sibling::td[normalize-space(text())='"
									+ isEditable[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[3]");
							if (!verifyElement(isEditableCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < isEditableAdminFields.length; m++) {
					String[] isEditableAdminField = isEditableAdminFields[m].split(":");
					if (!map.get(mapKeys.get(10)).toString().equals("")) {
						String[] isEditableAdmin = isEditableAdminField[1].split(",");
						for (int a = 0; a < isEditableAdmin.length; a++) {
							By isEditableAdminCheckBox = By.xpath("(//*[normalize-space(text())='"
									+ isEditableAdminField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + isEditableAdmin[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[4]");
							if (!verifyElement(isEditableAdminCheckBox, false))
								return false;
						}
					}
				}
			}

			clickOnThresholdSettingPlusIcon();
			String nonDailyAmount[] = map.get(mapKeys.get(13)).toString().split(",");
			String nonWeeklyAmount[] = map.get(mapKeys.get(14)).toString().split(",");
			String nonMonthlyAmount[] = map.get(mapKeys.get(15)).toString().split(",");
			String mediumDailyAmount[] = map.get(mapKeys.get(18)).toString().split(",");
			String mediumWeeklyAmount[] = map.get(mapKeys.get(19)).toString().split(",");
			String mediumMonthlyAmount[] = map.get(mapKeys.get(20)).toString().split(",");
			String fullDailyAmount[] = map.get(mapKeys.get(23)).toString().split(",");
			String fullWeeklyAmount[] = map.get(mapKeys.get(24)).toString().split(",");
			String fullMonthlyAmount[] = map.get(mapKeys.get(25)).toString().split(",");
			int kycType = 0;
			if (map.get(mapKeys.get(1)).toString().contains("Non")) {
				kycType++;
				By nonMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By nonMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				if (!getUIText(nonMin).split(" ")[1].equals(map.get(mapKeys.get(11)).toString()))
					return false;
				if (!getUIText(nonMax).split(" ")[1].equals(map.get(mapKeys.get(12)).toString()))
					return false;
				if (!getUIText(nonDailyIn).split(" ")[1].equals(nonDailyAmount[0].trim()))
					return false;
				if (!getUIText(nonDailyOut).split(" ")[1].equals(nonDailyAmount[1].trim()))
					return false;
				if (!getUIText(nonDailyAll).split(" ")[1].equals(nonDailyAmount[2].trim()))
					return false;
				if (!getUIText(nonWeeklyIn).split(" ")[1].equals(nonWeeklyAmount[0].trim()))
					return false;
				if (!getUIText(nonWeeklyOut).split(" ")[1].equals(nonWeeklyAmount[1].trim()))
					return false;
				if (!getUIText(nonWeeklyAll).split(" ")[1].equals(nonWeeklyAmount[2].trim()))
					return false;
				if (!getUIText(nonMonthlyIn).split(" ")[1].equals(nonMonthlyAmount[0].trim()))
					return false;
				if (!getUIText(nonMonthlyOut).split(" ")[1].equals(nonMonthlyAmount[1].trim()))
					return false;
				if (!getUIText(nonMonthlyAll).split(" ")[1].equals(nonMonthlyAmount[2].trim()))
					return false;
			}
			if (map.get(mapKeys.get(1)).toString().contains("Medium")) {
				kycType++;
				By mediumMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By mediumMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				if (!getUIText(mediumMin).split(" ")[1].equals(map.get(mapKeys.get(16)).toString()))
					return false;
				if (!getUIText(mediumMax).split(" ")[1].equals(map.get(mapKeys.get(17)).toString()))
					return false;
				if (!getUIText(mediumDailyIn).split(" ")[1].equals(mediumDailyAmount[0].trim()))
					return false;
				if (!getUIText(mediumDailyOut).split(" ")[1].equals(mediumDailyAmount[1].trim()))
					return false;
				if (!getUIText(mediumDailyAll).split(" ")[1].equals(mediumDailyAmount[2].trim()))
					return false;
				if (!getUIText(mediumWeeklyIn).split(" ")[1].equals(mediumWeeklyAmount[0].trim()))
					return false;
				if (!getUIText(mediumWeeklyOut).split(" ")[1].equals(mediumWeeklyAmount[1].trim()))
					return false;
				if (!getUIText(mediumWeeklyAll).split(" ")[1].equals(mediumWeeklyAmount[2].trim()))
					return false;
				if (!getUIText(mediumMonthlyIn).split(" ")[1].equals(mediumMonthlyAmount[0].trim()))
					return false;
				if (!getUIText(mediumMonthlyOut).split(" ")[1].equals(mediumMonthlyAmount[1].trim()))
					return false;
				if (!getUIText(mediumMonthlyAll).split(" ")[1].equals(mediumMonthlyAmount[2].trim()))
					return false;
			}
			if (map.get(mapKeys.get(1)).toString().contains("Full")) {
				kycType++;
				By fullMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				By fullMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
						+ "']//following-sibling::td[" + kycType + "]");
				if (!getUIText(fullMin).split(" ")[1].equals(map.get(mapKeys.get(21)).toString()))
					return false;
				if (!getUIText(fullMax).split(" ")[1].equals(map.get(mapKeys.get(22)).toString()))
					return false;
				if (!getUIText(fullDailyIn).split(" ")[1].equals(fullDailyAmount[0].trim()))
					return false;
				if (!getUIText(fullDailyOut).split(" ")[1].equals(fullDailyAmount[1].trim()))
					return false;
				if (!getUIText(fullDailyAll).split(" ")[1].equals(fullDailyAmount[2].trim()))
					return false;
				if (!getUIText(fullWeeklyIn).split(" ")[1].equals(fullWeeklyAmount[0].trim()))
					return false;
				if (!getUIText(fullWeeklyOut).split(" ")[1].equals(fullWeeklyAmount[1].trim()))
					return false;
				if (!getUIText(fullWeeklyAll).split(" ")[1].equals(fullWeeklyAmount[2].trim()))
					return false;
				if (!getUIText(fullMonthlyIn).split(" ")[1].equals(fullMonthlyAmount[0].trim()))
					return false;
				if (!getUIText(fullMonthlyOut).split(" ")[1].equals(fullMonthlyAmount[1].trim()))
					return false;
				if (!getUIText(fullMonthlyAll).split(" ")[1].equals(fullMonthlyAmount[2].trim()))
					return false;
			}
			clickOnAccessChannelPlusIcon();
			String[] accessChannel = map.get(mapKeys.get(26)).toString().split(",");
			for (int i = 0; i < accessChannel.length; i++) {
				By access = By.xpath("//*[normalize-space(text())='" + accessChannel[i].trim() + "']");
				if (!verifyElement(access, false))
					return false;
			}

			clickOnServicesPlusIcon();
			String[] serviceName = map.get(mapKeys.get(27)).toString().split("/");
			for (int i = 0; i < serviceName.length; i++) {
				String[] services = serviceName[i].split(":");
				String[] name = services[1].split(",");
				for (int j = 0; j < name.length; j++) {
					String servicename = setFirstCharInCaps(name[j].trim(), true);
					if(servicename.equalsIgnoreCase(ConstantsFile.DIGITAL_TV))
						servicename = ConstantsFile.DIGITAL_TV;
					if(servicename.equalsIgnoreCase(ConstantsFile.PAY_TV_SERVICES))
						servicename = ConstantsFile.PAY_TV_SERVICES;
					By service = By.xpath("//*[normalize-space(text())='" + services[0].trim()
							+ "']//preceding-sibling::td[normalize-space(text())='" + servicename + "']");
					if (!verifyElement(service, false))
						return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to delete Profile
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 22/11/2018
	 */
	public boolean deleteProfile(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Profile already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	/**
	 * @author dishant.doshi to verify Profile deleted?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 22/11/2018
	 * @return true if Profile deleted successfully
	 */
	public boolean verifyProfileDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString());
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
	 * @creation date 13/12/2018
	 * @return true if Profile Verify Log SuccesFullly
	 */
	public boolean verifyProfileEditLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(26)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort customer profile
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 14/12/2018
	 */
	public boolean sortProfile(Map<Object, Object> map, List<Object> mapKeys) {
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
