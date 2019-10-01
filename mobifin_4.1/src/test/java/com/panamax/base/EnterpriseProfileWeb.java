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
 * @author dishant.doshi Actions of Enterprise - Profile
 * @creation date 16/11/2018
 */
public class EnterpriseProfileWeb extends Common {
	By txtProfileName = By.id("ProfileName");
	By msAllowedKYCType = By.xpath(".//*[@id='AllowedKYCType']//following-sibling::div//input");
	By drpProfileType = By.id("ProfileType");
	By drpStatus = By.id("IsActive");
	By kycDetails = By.xpath(".//*[@id='kycWizard']/li//div[@class='step-text clearfix']");
	By collectionThreshold = By.xpath("//*[@id='frm']//span[normalize-space(text())='Collection Threshold Setting']");
	By disbursementThreshold = By
			.xpath("//*[@id='frm']//span[normalize-space(text())='Disbursement Threshold Setting']");
	By nonKYCThresholdCollection = By.xpath("(//*[contains(@id,'threshold')]//*[text()='Non KYC'])[1]");
	By mediumKYCThresholdCollection = By.xpath("(//*[contains(@id,'threshold')]//*[text()='Medium KYC'])[1]");
	By fullKYCThresholdCollection = By.xpath("(//*[contains(@id,'threshold')]//*[text()='Full KYC'])[1]");
	By nonKYCThresholdDisbursement = By.xpath("(//*[contains(@id,'threshold')]//*[text()='Non KYC'])[last()]");
	By mediumKYCThresholdDisbursement = By.xpath("(//*[contains(@id,'threshold')]//*[text()='Medium KYC'])[last()]");
	By fullKYCThresholdDisbursement = By.xpath("(//*[contains(@id,'threshold')]//*[text()='Full KYC'])[last()]");
	By txtNonKYCMinCollection = By.id("ColNonKyc_Min");
	By txtNonKYCMaxCollection = By.id("ColNonKyc_Max");
	By txtNonDailyInCollection = By.id("ColNonKyc_Daily_In");
	By txtNonDailyOutCollection = By.id("ColNonKyc_Daily_Out");
	By txtNonDailyAllCollection = By.id("ColNonKyc_Daily_Overall");
	By txtNonWeeklyInCollection = By.id("ColNonKyc_Weekly_In");
	By txtNonWeeklyOutCollection = By.id("ColNonKyc_Weekly_Out");
	By txtNonWeeklyAllCollection = By.id("ColNonKyc_Weekly_Overall");
	By txtNonMonthlyInCollection = By.id("ColNonKyc_Monthly_In");
	By txtNonMonthlyOutCollection = By.id("ColNonKyc_Monthly_Out");
	By txtNonMonthlyAllCollection = By.id("ColNonKyc_Monthly_Overall");
	By txtMediumKYCMinCollection = By.id("ColMediumKyc_Min");
	By txtMediumKYCMaxCollection = By.id("ColMediumKyc_Max");
	By txtMediumDailyInCollection = By.id("ColMediumKyc_Daily_In");
	By txtMediumDailyOutCollection = By.id("ColMediumKyc_Daily_Out");
	By txtMediumDailyAllCollection = By.id("ColMediumKyc_Daily_Overall");
	By txtMediumWeeklyInCollection = By.id("ColMediumKyc_Weekly_In");
	By txtMediumWeeklyOutCollection = By.id("ColMediumKyc_Weekly_Out");
	By txtMediumWeeklyAllCollection = By.id("ColMediumKyc_Weekly_Overall");
	By txtMediumMonthlyInCollection = By.id("ColMediumKyc_Monthly_In");
	By txtMediumMonthlyOutCollection = By.id("ColMediumKyc_Monthly_Out");
	By txtMediumMonthlyAllCollection = By.id("ColMediumKyc_Monthly_Overall");
	By txtFullKYCMinCollection = By.id("ColFullKyc_Min");
	By txtFullKYCMaxCollection = By.id("ColFullKyc_Max");
	By txtFullDailyInCollection = By.id("ColFullKyc_Daily_In");
	By txtFullDailyOutCollection = By.id("ColFullKyc_Daily_Out");
	By txtFullDailyAllCollection = By.id("ColFullKyc_Daily_Overall");
	By txtFullWeeklyInCollection = By.id("ColFullKyc_Weekly_In");
	By txtFullWeeklyOutCollection = By.id("ColFullKyc_Weekly_Out");
	By txtFullWeeklyAllCollection = By.id("ColFullKyc_Weekly_Overall");
	By txtFullMonthlyInCollection = By.id("ColFullKyc_Monthly_In");
	By txtFullMonthlyOutCollection = By.id("ColFullKyc_Monthly_Out");
	By txtFullMonthlyAllCollection = By.id("ColFullKyc_Monthly_Overall");
	By txtNonKYCMinDisbursement = By.id("DisNonKyc_Min");
	By txtNonKYCMaxDisbursement = By.id("DisNonKyc_Max");
	By txtNonDailyInDisbursement = By.id("DisNonKyc_Daily_In");
	By txtNonDailyOutDisbursement = By.id("DisNonKyc_Daily_Out");
	By txtNonDailyAllDisbursement = By.id("DisNonKyc_Daily_Overall");
	By txtNonWeeklyInDisbursement = By.id("DisNonKyc_Weekly_In");
	By txtNonWeeklyOutDisbursement = By.id("DisNonKyc_Weekly_Out");
	By txtNonWeeklyAllDisbursement = By.id("DisNonKyc_Weekly_Overall");
	By txtNonMonthlyInDisbursement = By.id("DisNonKyc_Monthly_In");
	By txtNonMonthlyOutDisbursement = By.id("DisNonKyc_Monthly_Out");
	By txtNonMonthlyAllDisbursement = By.id("DisNonKyc_Monthly_Overall");
	By txtMediumKYCMinDisbursement = By.id("DisMediumKyc_Min");
	By txtMediumKYCMaxDisbursement = By.id("DisMediumKyc_Max");
	By txtMediumDailyInDisbursement = By.id("DisMediumKyc_Daily_In");
	By txtMediumDailyOutDisbursement = By.id("DisMediumKyc_Daily_Out");
	By txtMediumDailyAllDisbursement = By.id("DisMediumKyc_Daily_Overall");
	By txtMediumWeeklyInDisbursement = By.id("DisMediumKyc_Weekly_In");
	By txtMediumWeeklyOutDisbursement = By.id("DisMediumKyc_Weekly_Out");
	By txtMediumWeeklyAllDisbursement = By.id("DisMediumKyc_Weekly_Overall");
	By txtMediumMonthlyInDisbursement = By.id("DisMediumKyc_Monthly_In");
	By txtMediumMonthlyOutDisbursement = By.id("DisMediumKyc_Monthly_Out");
	By txtMediumMonthlyAllDisbursement = By.id("DisMediumKyc_Monthly_Overall");
	By txtFullKYCMinDisbursement = By.id("DisFullKyc_Min");
	By txtFullKYCMaxDisbursement = By.id("DisFullKyc_Max");
	By txtFullDailyInDisbursement = By.id("DisFullKyc_Daily_In");
	By txtFullDailyOutDisbursement = By.id("DisFullKyc_Daily_Out");
	By txtFullDailyAllDisbursement = By.id("DisFullKyc_Daily_Overall");
	By txtFullWeeklyInDisbursement = By.id("DisFullKyc_Weekly_In");
	By txtFullWeeklyOutDisbursement = By.id("DisFullKyc_Weekly_Out");
	By txtFullWeeklyAllDisbursement = By.id("DisFullKyc_Weekly_Overall");
	By txtFullMonthlyInDisbursement = By.id("DisFullKyc_Monthly_In");
	By txtFullMonthlyOutDisbursement = By.id("DisFullKyc_Monthly_Out");
	By txtFullMonthlyAllDisbursement = By.id("DisFullKyc_Monthly_Overall");
	By txtStakeHolderName = By.id("stakeholders-tokenfield");
	By txtProfileNameSearch = By.id("txtProfileName");
	By drpProfileTypeSearch = By.id("cmbProfileType");
	By drpStatusSearch = By.id("cmbIsActive");
	By openKYCDetails = By.xpath("//*[text()='KYC Details']//parent::div//i");
	By openCollectionThreshold = By.xpath("//*[text()='Collection Threshold']//parent::div//i");
	By openDisbursementThreshold = By.xpath("//*[text()='Disbursement Threshold']//parent::div//i");
	By openAccessChannel = By.xpath("//*[text()='Access Channel']//parent::div//i");
	By openServices = By.xpath("//*[text()='Services']//parent::div//i");
	By profileDetailsLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Profile Details']");
	By kycDetailsLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='KYC Details']");
	By collectionThresholdLink = By
			.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Collection Threshold Setting']");
	By disbursementThresholdLink = By
			.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Disbursement Threshold Setting']");
	By accessChannelLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Access Channel']");
	By servicesLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Services']");
	By profileSummaryLink = By.xpath(".//*[@id='parent_tabs']//span[normalize-space(text())='Profile Summary']");
	By stakeHolderRemove = By.xpath("//*[@class='token']//a");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 16/11/2018
	 */
	public EnterpriseProfileWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi filter search common method
	 * @param str1
	 * @param str2
	 * @param str3
	 * @creation date 16/11/2018
	 */
	public void filterSearch(String str1, String str2, String str3) {
		commonFilterSearch();
		sendTextInProfileNameInSearch(str1);
		selectTextInProfileTypeInSearch(str2);
		selectTextInStatusInSearch(str3);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to send text in profile name
	 * @param profileName
	 * @creation date 16/11/2018
	 */
	public void sendTextInProfileName(String profileName) {
		clearAndSendTextInTextBox(txtProfileName, profileName);
	}

	/**
	 * @author dishant.doshi to select text in allowed kyc type
	 * @param allowedKycType
	 * @creation date 16/11/2018
	 */
	public void selectTextInAllowedKYCType(String allowedKycType) {
		sendTextInTextBox(msAllowedKYCType, allowedKycType + Keys.ENTER);
	}

	/**
	 * @author dishant.doshi to select text in profile type
	 * @param profileType
	 * @creation date 16/11/2018
	 */
	public void selectTextInProfileType(String profileType) {
		selectFromDropdown(drpProfileType, profileType);
	}

	/**
	 * @author dishant.doshi to select text in status
	 * @param status
	 * @creation date 16/11/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to send text in profile name in filter search
	 * @param profileName
	 * @creation date 16/11/2018
	 */
	public void sendTextInProfileNameInSearch(String profileName) {
		clearAndSendTextInTextBox(txtProfileNameSearch, profileName);
	}

	/**
	 * @author dishant.doshi to select text in tree name in filter search
	 * @param treeName
	 * @creation date 16/11/2018
	 */
	public void selectTextInProfileTypeInSearch(String treeName) {
		selectFromDropdown(drpProfileTypeSearch, treeName);
	}

	/**
	 * @author dishant.doshi to select text in status in filter search
	 * @param status
	 * @creation date 16/11/2018
	 */
	public void selectTextInStatusInSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author dishant.doshi to select text in kyc details category
	 * @param element
	 * @param kycCategory
	 * @creation date 16/11/2018
	 */
	public void selectTextInKYCDetails(By element, String kycCategory) {
		selectFromDropdown(element, kycCategory);
	}

	/**
	 * @author dishant.doshi to click on add field button
	 * @param element
	 * @creation date 16/11/2018
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
	 * @author dishant.doshi to click on mandatoey kyc radio button
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
	public void clickOnMandatoryCheckBoxForEdit(String mandatoryField) {
		clickOnElement(By.xpath("//*[text()='" + mandatoryField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'Required')]//following-sibling :: label"));
	}

	/**
	 * @author dishant.doshi to click on mandatoey kyc radio button for edit
	 * @param element
	 * @creation date 22/11/2018
	 */
	public void clickOnShowCheckBoxForEdit(String mandatoryField) {
		clickOnElement(By.xpath("//*[text()='" + mandatoryField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'Show')]//following-sibling :: label"));
	}

	/**
	 * @author dishant.doshi to click on mandatoey kyc radio button for edit
	 * @param element
	 * @creation date 22/11/2018
	 */
	public void clickOnIsEditableCheckBoxForEdit(String mandatoryField) {
		clickOnElement(By.xpath("//*[text()='" + mandatoryField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'IsEditable')]//following-sibling :: label"));
	}

	/**
	 * @author dishant.doshi to click on mandatoey kyc radio button for edit
	 * @param element
	 * @creation date 22/11/2018
	 */
	public void clickOnIsEditableAdminCheckBoxForEdit(String mandatoryField) {
		clickOnElement(By.xpath("//*[text()='" + mandatoryField
				+ "']//following-sibling :: div//input[contains(@id,'checkbox') and contains(@name,'IsEditableAdmin')]//following-sibling :: label"));
	}

	/**
	 * @author dishant.doshi to send text in non kyc minimum amount collection
	 * @param nonMinAmtCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMinimumAmountCollection(String nonMinAmtCol) {
		clearAndSendTextInTextBox(txtNonKYCMinCollection, nonMinAmtCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc minimum amount
	 *         collection
	 * @param mediumMinAmtCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMinimumAmountCollection(String mediumMinAmtCol) {
		clearAndSendTextInTextBox(txtMediumKYCMinCollection, mediumMinAmtCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc minimum amount collection
	 * @param fullMinAmtCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCMinimumAmountCollection(String fullMinAmtCol) {
		clearAndSendTextInTextBox(txtFullKYCMinCollection, fullMinAmtCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc maximum amount collection
	 * @param nonMaxAmtCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMaximumAmountCollection(String nonMaxAmtCol) {
		clearAndSendTextInTextBox(txtNonKYCMaxCollection, nonMaxAmtCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc maximum amount
	 *         collection
	 * @param mediumMaxAmtCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMaximumAmountCollection(String mediumMaxAmtCol) {
		clearAndSendTextInTextBox(txtMediumKYCMaxCollection, mediumMaxAmtCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc maximum amount collection
	 * @param fullMaxAmtCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCMaximumAmountCollection(String fullMaxAmtCol) {
		clearAndSendTextInTextBox(txtFullKYCMaxCollection, fullMaxAmtCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily in amount collection
	 * @param nonDailyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCDailyInCollection(String nonDailyInCol) {
		clearAndSendTextInTextBox(txtNonDailyInCollection, nonDailyInCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily in amount
	 *         collection
	 * @param mediumDailyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCDailyInCollection(String mediumDailyInCol) {
		clearAndSendTextInTextBox(txtMediumDailyInCollection, mediumDailyInCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily in amount collection
	 * @param fullDailyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCDailyInCollection(String fullDailyInCol) {
		clearAndSendTextInTextBox(txtFullDailyInCollection, fullDailyInCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily out amount collection
	 * @param nonDailyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCDailyOutCollection(String nonDailyOutCol) {
		clearAndSendTextInTextBox(txtNonDailyOutCollection, nonDailyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily out amount
	 *         collection
	 * @param mediumDailyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCDailyOutCollection(String mediumDailyOutCol) {
		clearAndSendTextInTextBox(txtMediumDailyOutCollection, mediumDailyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily out amount
	 *         collection
	 * @param fullDailyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCDailyOutCollection(String fullDailyOutCol) {
		clearAndSendTextInTextBox(txtFullDailyOutCollection, fullDailyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily over all amount
	 *         collection
	 * @param nonDailyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCDailyAllCollection(String nonDailyAllCol) {
		clearAndSendTextInTextBox(txtNonDailyAllCollection, nonDailyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily over all amount
	 *         collection
	 * @param mediumDailyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCDailyAllCollection(String mediumDailyAllCol) {
		clearAndSendTextInTextBox(txtMediumDailyAllCollection, mediumDailyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily over all amount
	 *         collection
	 * @param fullDailyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCDailyAllCollection(String fullDailyAllCol) {
		clearAndSendTextInTextBox(txtFullDailyAllCollection, fullDailyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly in amount
	 *         collection
	 * @param nonMonthlyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMonthlyInCollection(String nonMonthlyInCol) {
		clearAndSendTextInTextBox(txtNonMonthlyInCollection, nonMonthlyInCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly in amount
	 *         collection
	 * @param mediumMonthlyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMonthlyInCollection(String mediumMonthlyInCol) {
		clearAndSendTextInTextBox(txtMediumMonthlyInCollection, mediumMonthlyInCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly in amount
	 *         collection
	 * @param fullMonthlyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCMonthlyInCollection(String fullMonthlyInCol) {
		clearAndSendTextInTextBox(txtFullMonthlyInCollection, fullMonthlyInCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly out amount
	 *         collection
	 * @param nonMonthlyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMonthlyOutCollection(String nonMonthlyOutCol) {
		clearAndSendTextInTextBox(txtNonMonthlyOutCollection, nonMonthlyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly out amount
	 *         collection
	 * @param mediumMonthlyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMonthlyOutCollection(String mediumMonthlyOutCol) {
		clearAndSendTextInTextBox(txtMediumMonthlyOutCollection, mediumMonthlyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly out amount
	 *         collection
	 * @param fullMonthlyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCMonthlyOutCollection(String fullMonthlyOutCol) {
		clearAndSendTextInTextBox(txtFullMonthlyOutCollection, fullMonthlyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly over all amount
	 *         collection
	 * @param nonMonthlyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMonthlyAllCollection(String nonMonthlyAllCol) {
		clearAndSendTextInTextBox(txtNonMonthlyAllCollection, nonMonthlyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly over all amount
	 *         collection
	 * @param mediumMonthlyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMonthlyAllCollection(String mediumMonthlyAllCol) {
		clearAndSendTextInTextBox(txtMediumMonthlyAllCollection, mediumMonthlyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly over all amount
	 *         collection
	 * @param fullMonthlyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCmonthlyAllCollection(String fullMonthlyAllCol) {
		clearAndSendTextInTextBox(txtFullMonthlyAllCollection, fullMonthlyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly in amount collection
	 * @param nonWeeklyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCWeeklyInCollection(String nonWeeklyInCol) {
		clearAndSendTextInTextBox(txtNonWeeklyInCollection, nonWeeklyInCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly in amount
	 *         collection
	 * @param mediumWeeklyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCWeeklyInCollection(String mediumWeeklyInCol) {
		clearAndSendTextInTextBox(txtMediumWeeklyInCollection, mediumWeeklyInCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly in amount
	 *         collection
	 * @param fullWeeklyInCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCWeeklyInCollection(String fullWeeklyInCol) {
		clearAndSendTextInTextBox(txtFullWeeklyInCollection, fullWeeklyInCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly out amount
	 *         collection
	 * @param nonWeeklyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCWeeklyOutCollection(String nonWeeklyOutCol) {
		clearAndSendTextInTextBox(txtNonWeeklyOutCollection, nonWeeklyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly out amount
	 *         collection
	 * @param mediumWeeklyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCWeeklyOutCollection(String mediumWeeklyOutCol) {
		clearAndSendTextInTextBox(txtMediumWeeklyOutCollection, mediumWeeklyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly out amount
	 *         collection
	 * @param fullWeeklyOutCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCWeeklyOutCollection(String fullWeeklyOutCol) {
		clearAndSendTextInTextBox(txtFullWeeklyOutCollection, fullWeeklyOutCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly over all amount
	 *         collection
	 * @param nonWeeklyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCWeeklyAllCollection(String nonWeeklyAllCol) {
		clearAndSendTextInTextBox(txtNonWeeklyAllCollection, nonWeeklyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly over all amount
	 *         collection
	 * @param mediumWeeklyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCWeeklyAllCollection(String mediumWeeklyAllCol) {
		clearAndSendTextInTextBox(txtMediumWeeklyAllCollection, mediumWeeklyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly over all amount
	 *         collection
	 * @param fullWeeklyAllCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCWeeklyAllCollection(String fullWeeklyAllCol) {
		clearAndSendTextInTextBox(txtFullWeeklyAllCollection, fullWeeklyAllCol);
	}

	/**
	 * @author dishant.doshi to send text in non kyc minimum amount collection
	 * @param nonMinAmtCol
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMinimumAmountDisbursement(String nonMinAmtDis) {
		clearAndSendTextInTextBox(txtNonKYCMinDisbursement, nonMinAmtDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc minimum amount
	 *         disbursement
	 * @param mediumMinAmtDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMinimumAmountDisbursement(String mediumMinAmtDis) {
		clearAndSendTextInTextBox(txtMediumKYCMinDisbursement, mediumMinAmtDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc minimum amount
	 *         disbursement
	 * @param fullMinAmtDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCMinimumAmountDisbursement(String fullMinAmtDis) {
		clearAndSendTextInTextBox(txtFullKYCMinDisbursement, fullMinAmtDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc maximum amount disbursement
	 * @param nonMaxAmtDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMaximumAmountDisbursement(String nonMaxAmtDis) {
		clearAndSendTextInTextBox(txtNonKYCMaxDisbursement, nonMaxAmtDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc maximum amount
	 *         disbursement
	 * @param mediumMaxAmtDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMaximumAmountDisbursement(String mediumMaxAmtDis) {
		clearAndSendTextInTextBox(txtMediumKYCMaxDisbursement, mediumMaxAmtDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc maximum amount
	 *         disbursement
	 * @param fullMaxAmtDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCMaximumAmountDisbursement(String fullMaxAmtDis) {
		clearAndSendTextInTextBox(txtFullKYCMaxDisbursement, fullMaxAmtDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily in amount
	 *         disbursement
	 * @param nonDailyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCDailyInDisbursement(String nonDailyInDis) {
		clearAndSendTextInTextBox(txtNonDailyInDisbursement, nonDailyInDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily in amount
	 *         Disbursement
	 * @param mediumDailyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCDailyInDisbursement(String mediumDailyInDis) {
		clearAndSendTextInTextBox(txtMediumDailyInDisbursement, mediumDailyInDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily in amount
	 *         Disbursement
	 * @param fullDailyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCDailyInDisbursement(String fullDailyInDis) {
		clearAndSendTextInTextBox(txtFullDailyInDisbursement, fullDailyInDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily out amount
	 *         Disbursement
	 * @param nonDailyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCDailyOutDisbursement(String nonDailyOutDis) {
		clearAndSendTextInTextBox(txtNonDailyOutDisbursement, nonDailyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily out amount
	 *         disbursement
	 * @param mediumDailyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCDailyOutDisbursement(String mediumDailyOutDis) {
		clearAndSendTextInTextBox(txtMediumDailyOutDisbursement, mediumDailyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily out amount
	 *         disbursement
	 * @param fullDailyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCDailyOutDisbursement(String fullDailyOutDis) {
		clearAndSendTextInTextBox(txtFullDailyOutDisbursement, fullDailyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc daily over all amount
	 *         Disbursement
	 * @param nonDailyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCDailyAllDisbursement(String nonDailyAllDis) {
		clearAndSendTextInTextBox(txtNonDailyAllDisbursement, nonDailyAllDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc daily over all amount
	 *         Disbursement
	 * @param mediumDailyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCDailyAllDisbursement(String mediumDailyAllDis) {
		clearAndSendTextInTextBox(txtMediumDailyAllDisbursement, mediumDailyAllDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc daily over all amount
	 *         Disbursement
	 * @param fullDailyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCDailyAllDisbursement(String fullDailyAllDis) {
		clearAndSendTextInTextBox(txtFullDailyAllDisbursement, fullDailyAllDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly in amount
	 *         disbursement
	 * @param nonMonthlyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMonthlyInDisbursement(String nonMonthlyInDis) {
		clearAndSendTextInTextBox(txtNonMonthlyInDisbursement, nonMonthlyInDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly in amount
	 *         Disbursement
	 * @param mediumMonthlyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMonthlyInDisbursement(String mediumMonthlyInDis) {
		clearAndSendTextInTextBox(txtMediumMonthlyInDisbursement, mediumMonthlyInDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly in amount
	 *         Disbursement
	 * @param fullMonthlyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCMonthlyInDisbursement(String fullMonthlyInDis) {
		clearAndSendTextInTextBox(txtFullMonthlyInDisbursement, fullMonthlyInDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly out amount
	 *         Disbursement
	 * @param nonMonthlyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMonthlyOutDisbursement(String nonMonthlyOutDis) {
		clearAndSendTextInTextBox(txtNonMonthlyOutDisbursement, nonMonthlyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly out amount
	 *         disbursement
	 * @param mediumMonthlyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMonthlyOutDisbursement(String mediumMonthlyOutDis) {
		clearAndSendTextInTextBox(txtMediumMonthlyOutDisbursement, mediumMonthlyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly out amount
	 *         disbursement
	 * @param fullMonthlyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCMonthlyOutDisbursement(String fullMonthlyOutDis) {
		clearAndSendTextInTextBox(txtFullMonthlyOutDisbursement, fullMonthlyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc monthly over all amount
	 *         disbursement
	 * @param nonMonthlyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCMonthlyAllDisbursement(String nonMonthlyAllDis) {
		clearAndSendTextInTextBox(txtNonMonthlyAllDisbursement, nonMonthlyAllDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc monthly over all amount
	 *         disbursement
	 * @param mediumMonthlyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCMonthlyAllDisbursement(String mediumMonthlyAllDis) {
		clearAndSendTextInTextBox(txtMediumMonthlyAllDisbursement, mediumMonthlyAllDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc monthly over all amount
	 *         disbursement
	 * @param fullMonthlyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCmonthlyAllDisbursement(String fullMonthlyAllDis) {
		clearAndSendTextInTextBox(txtFullMonthlyAllDisbursement, fullMonthlyAllDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly in amount
	 *         disbursement
	 * @param nonWeeklyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCWeeklyInDisbursement(String nonWeeklyInDis) {
		clearAndSendTextInTextBox(txtNonWeeklyInDisbursement, nonWeeklyInDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly in amount
	 *         disbursement
	 * @param mediumWeeklyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCWeeklyInDisbursement(String mediumWeeklyInDis) {
		clearAndSendTextInTextBox(txtMediumWeeklyInDisbursement, mediumWeeklyInDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly in amount
	 *         disbursement
	 * @param fullWeeklyInDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCWeeklyInDisbursement(String fullWeeklyInDis) {
		clearAndSendTextInTextBox(txtFullWeeklyInDisbursement, fullWeeklyInDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly out amount
	 *         disbursement
	 * @param nonWeeklyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCWeeklyOutDisbursement(String nonWeeklyOutDis) {
		clearAndSendTextInTextBox(txtNonWeeklyOutDisbursement, nonWeeklyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly out amount
	 *         disbursement
	 * @param mediumWeeklyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCWeeklyOutDisbursement(String mediumWeeklyOutDis) {
		clearAndSendTextInTextBox(txtMediumWeeklyOutDisbursement, mediumWeeklyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly out amount
	 *         disbursement
	 * @param fullWeeklyOutDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCWeeklyOutDisbursement(String fullWeeklyOutDis) {
		clearAndSendTextInTextBox(txtFullWeeklyOutDisbursement, fullWeeklyOutDis);
	}

	/**
	 * @author dishant.doshi to send text in non kyc weekly over all amount
	 *         disbursement
	 * @param nonWeeklyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInNonKYCWeeklyAllDisbursement(String nonWeeklyAllDis) {
		clearAndSendTextInTextBox(txtNonWeeklyAllDisbursement, nonWeeklyAllDis);
	}

	/**
	 * @author dishant.doshi to send text in medium kyc weekly over all amount
	 *         disbursement
	 * @param mediumWeeklyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInMediumKYCWeeklyAllDisbursement(String mediumWeeklyAllDis) {
		clearAndSendTextInTextBox(txtMediumWeeklyAllDisbursement, mediumWeeklyAllDis);
	}

	/**
	 * @author dishant.doshi to send text in full kyc weekly over all amount
	 *         disbursement
	 * @param fullWeeklyAllDis
	 * @creation date 16/11/2018
	 */
	public void sendTextInFullKYCWeeklyAllDisbursement(String fullWeeklyAllDis) {
		clearAndSendTextInTextBox(txtFullWeeklyAllDisbursement, fullWeeklyAllDis);
	}

	/**
	 * @author dishant.doshi to clike on access channel
	 * @param accessChannelName
	 * @creation date 16/11/2018
	 */
	public void clickOnAccessChannel(String accessChannelName) {
		clickOnElement(
				By.xpath("//*[contains(@id,'access')]//span[normalize-space(text())='" + accessChannelName + "']"));
	}

	/**
	 * @author dishant.doshi to click on service link
	 * @param ServicesName
	 * @creation date 16/11/2018
	 */
	public void clickOnServiceText(String ServicesName) {
		clickOnElement(By.xpath("//a[contains(text(),'" + ServicesName + "')]"));
	}

	/**
	 * @author dishant.doshi to click on service
	 * @creation date 16/11/2018
	 */
	public void clickOnService(String interoperability_Service) {
		if(interoperability_Service.equalsIgnoreCase(ConstantsFile.DIGITAL_TV))
			interoperability_Service = ConstantsFile.DIGITAL_TV;
		if(interoperability_Service.equalsIgnoreCase(ConstantsFile.PAY_TV_SERVICES))
			interoperability_Service = ConstantsFile.PAY_TV_SERVICES;
		clickOnElement(By.xpath("//*[normalize-space(text()) = '" + interoperability_Service.trim() + "']"));
	}

	/**
	 * @author dishant.doshi to send text in stake holder
	 * @param stakeHolderName
	 * @creation date 16/11/2018
	 */
	public void sendTextInStakeHolderName(String stakeHolderName) {
		removeStakeHolder();
		sendTextInTextBox(txtStakeHolderName, stakeHolderName + Keys.ENTER);
	}

	public void removeStakeHolder() {
		if (verifyElement(stakeHolderRemove, false))
			clickOnElement(stakeHolderRemove);
	}

	/**
	 * @author dishant.doshi to click on icon of kyc detail
	 * @creation date 19/11/2018
	 */
	public void clickOnKYCDetailsPlusIcon() {
		clickOnElement(openKYCDetails);
	}

	/**
	 * @author dishant.doshi to click on icon of collection threshold
	 * @creation date 19/11/2018
	 */
	public void clickOnCollectionThresholdPlusIcon() {
		clickOnElement(openCollectionThreshold);
	}

	/**
	 * @author dishant.doshi to click on icon of disbursement threshold
	 * @creation date 19/11/2018
	 */
	public void clickOnDisbursementThresholdPlusIcon() {
		clickOnElement(openDisbursementThreshold);
	}

	/**
	 * @author dishant.doshi to click on icon of services
	 * @creation date 19/11/2018
	 */
	public void clickOnServicesPlusIcon() {
		clickOnElement(openServices);
	}

	/**
	 * @author dishant.doshi to click on icon of access channel
	 * @creation date 19/11/2018
	 */
	public void clickOnAccessChannelPlusIcon() {
		clickOnElement(openAccessChannel);
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
	 * @author dishant.doshi to click on profile collection threshold link while
	 *         edit profile
	 * @creation date 19/11/2018
	 */
	public void clickOnCollectionThresholdLink() {
		clickOnElement(collectionThresholdLink);
	}

	/**
	 * @author dishant.doshi to click on profile disbursement threshold link
	 *         while edit profile
	 * @creation date 19/11/2018
	 */
	public void clickOnDisbursementThresholdLink() {
		clickOnElement(disbursementThresholdLink);
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
	 * @creation date 16/11/2018
	 */
	public void addProfile(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInProfileName(map.get(mapKeys.get(0)).toString());
		String[] kycType = map.get(mapKeys.get(1)).toString().split(",");
		for (int i = 0; i < kycType.length; i++) {
			selectTextInAllowedKYCType(kycType[i].trim());
		}
		selectTextInProfileType(map.get(mapKeys.get(2)).toString());
		selectTextInStatus(map.get(mapKeys.get(3)).toString());
		clickOnNextBtn();
		if (verifyToolTip()) {
			clickOnCancelBtn();
		} else {
			List<WebElement> navigationInKYCDetails = getElementList(kycDetails);
			for (int i = 0; i < navigationInKYCDetails.size(); i++) {
				if ((!map.get(mapKeys.get(4)).toString().equals(""))
						|| (!map.get(mapKeys.get(4)).toString().isEmpty())) {
					String[] kycCategories = map.get(mapKeys.get(4)).toString().split("/");
					for (int k = 0; k < kycCategories.length; k++) {
						String[] kycCategory = kycCategories[k].trim().split(":");
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

				String[] nonKYCFields = map.get(mapKeys.get(5)).toString().split("/");
				String[] mediumKYCFields = map.get(mapKeys.get(6)).toString().split("/");
				String[] fullKYCFields = map.get(mapKeys.get(7)).toString().split("/");
				String[] mandatoryFields = map.get(mapKeys.get(8)).toString().split("/");
				String[] showFields = map.get(mapKeys.get(9)).toString().split("/");
				String[] isEditableFields = map.get(mapKeys.get(10)).toString().split("/");
				String[] isEditableAdminFields = map.get(mapKeys.get(11)).toString().split("/");

				for (int n = 0; n < nonKYCFields.length; n++) {
					String[] nonKYCField = nonKYCFields[n].split(":");
					if (!map.get(mapKeys.get(5)).toString().equals("")) {
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
					if (!map.get(mapKeys.get(6)).toString().equals("")) {
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
					if (!map.get(mapKeys.get(7)).toString().equals("")) {
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
					if (!map.get(mapKeys.get(8)).toString().equals("")) {
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
					if (!map.get(mapKeys.get(9)).toString().equals("")) {
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
					if (!map.get(mapKeys.get(10)).toString().equals("")) {
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
					if (!map.get(mapKeys.get(11)).toString().equals("")) {
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
				if (verifyElement(collectionThreshold, false)) {
					String nonDailyAmountCollection[] = map.get(mapKeys.get(14)).toString().split(",");
					String nonWeeklyAmountCollection[] = map.get(mapKeys.get(15)).toString().split(",");
					String nonMonthlyAmountCollection[] = map.get(mapKeys.get(16)).toString().split(",");
					String mediumDailyAmountCollection[] = map.get(mapKeys.get(19)).toString().split(",");
					String mediumWeeklyAmountCollection[] = map.get(mapKeys.get(20)).toString().split(",");
					String mediumMonthlyAmountCollection[] = map.get(mapKeys.get(21)).toString().split(",");
					String fullDailyAmountCollection[] = map.get(mapKeys.get(24)).toString().split(",");
					String fullWeeklyAmountCollection[] = map.get(mapKeys.get(25)).toString().split(",");
					String fullMonthlyAmountCollection[] = map.get(mapKeys.get(26)).toString().split(",");

					if (verifyElement(nonKYCThresholdCollection, false)) {
						sendTextInNonKYCMinimumAmountCollection(map.get(mapKeys.get(12)).toString());
						sendTextInNonKYCMaximumAmountCollection(map.get(mapKeys.get(13)).toString());
						sendTextInNonKYCDailyInCollection(nonDailyAmountCollection[0].trim());
						sendTextInNonKYCDailyOutCollection(nonDailyAmountCollection[1].trim());
						sendTextInNonKYCDailyAllCollection(nonDailyAmountCollection[2].trim());
						sendTextInNonKYCWeeklyInCollection(nonWeeklyAmountCollection[0].trim());
						sendTextInNonKYCWeeklyOutCollection(nonWeeklyAmountCollection[1].trim());
						sendTextInNonKYCWeeklyAllCollection(nonWeeklyAmountCollection[2].trim());
						sendTextInNonKYCMonthlyInCollection(nonMonthlyAmountCollection[0].trim());
						sendTextInNonKYCMonthlyOutCollection(nonMonthlyAmountCollection[1].trim());
						sendTextInNonKYCMonthlyAllCollection(nonMonthlyAmountCollection[2].trim());
					}
					if (verifyElement(mediumKYCThresholdCollection, false)) {
						sendTextInMediumKYCMinimumAmountCollection(map.get(mapKeys.get(17)).toString());
						sendTextInMediumKYCMaximumAmountCollection(map.get(mapKeys.get(18)).toString());
						sendTextInMediumKYCDailyInCollection(mediumDailyAmountCollection[0].trim());
						sendTextInMediumKYCDailyOutCollection(mediumDailyAmountCollection[1].trim());
						sendTextInMediumKYCDailyAllCollection(mediumDailyAmountCollection[2].trim());
						sendTextInMediumKYCWeeklyInCollection(mediumWeeklyAmountCollection[0].trim());
						sendTextInMediumKYCWeeklyOutCollection(mediumWeeklyAmountCollection[1].trim());
						sendTextInMediumKYCWeeklyAllCollection(mediumWeeklyAmountCollection[2].trim());
						sendTextInMediumKYCMonthlyInCollection(mediumMonthlyAmountCollection[0].trim());
						sendTextInMediumKYCMonthlyOutCollection(mediumMonthlyAmountCollection[1].trim());
						sendTextInMediumKYCMonthlyAllCollection(mediumMonthlyAmountCollection[2].trim());
					}
					if (verifyElement(fullKYCThresholdCollection, false)) {
						sendTextInFullKYCMinimumAmountCollection(map.get(mapKeys.get(22)).toString());
						sendTextInFullKYCMaximumAmountCollection(map.get(mapKeys.get(23)).toString());
						sendTextInFullKYCDailyInCollection(fullDailyAmountCollection[0].trim());
						sendTextInFullKYCDailyOutCollection(fullDailyAmountCollection[1].trim());
						sendTextInFullKYCDailyAllCollection(fullDailyAmountCollection[2].trim());
						sendTextInFullKYCWeeklyInCollection(fullWeeklyAmountCollection[0].trim());
						sendTextInFullKYCWeeklyOutCollection(fullWeeklyAmountCollection[1].trim());
						sendTextInFullKYCWeeklyAllCollection(fullWeeklyAmountCollection[2].trim());
						sendTextInFullKYCMonthlyInCollection(fullMonthlyAmountCollection[0].trim());
						sendTextInFullKYCMonthlyOutCollection(fullMonthlyAmountCollection[1].trim());
						sendTextInFullKYCmonthlyAllCollection(fullMonthlyAmountCollection[2].trim());
					}
					clickOnNextBtn();
				}
				if (verifyToolTip()) {
					clickOnCancelBtn();
					getStriptText();
				} else {
					if (verifyElement(disbursementThreshold, false)) {
						String nonDailyAmountDisbursement[] = map.get(mapKeys.get(29)).toString().split(",");
						String nonWeeklyAmountDisbursement[] = map.get(mapKeys.get(30)).toString().split(",");
						String nonMonthlyAmountDisbursement[] = map.get(mapKeys.get(31)).toString().split(",");
						String mediumDailyAmountDisbursement[] = map.get(mapKeys.get(34)).toString().split(",");
						String mediumWeeklyAmountDisbursement[] = map.get(mapKeys.get(35)).toString().split(",");
						String mediumMonthlyAmountDisbursement[] = map.get(mapKeys.get(36)).toString().split(",");
						String fullDailyAmountDisbursement[] = map.get(mapKeys.get(39)).toString().split(",");
						String fullWeeklyAmountDisbursement[] = map.get(mapKeys.get(40)).toString().split(",");
						String fullMonthlyAmountDisbursement[] = map.get(mapKeys.get(41)).toString().split(",");

						if (verifyElement(nonKYCThresholdDisbursement, false)) {
							sendTextInNonKYCMinimumAmountDisbursement(map.get(mapKeys.get(27)).toString());
							sendTextInNonKYCMaximumAmountDisbursement(map.get(mapKeys.get(28)).toString());
							sendTextInNonKYCDailyInDisbursement(nonDailyAmountDisbursement[0].trim());
							sendTextInNonKYCDailyOutDisbursement(nonDailyAmountDisbursement[1].trim());
							sendTextInNonKYCDailyAllDisbursement(nonDailyAmountDisbursement[2].trim());
							sendTextInNonKYCWeeklyInDisbursement(nonWeeklyAmountDisbursement[0].trim());
							sendTextInNonKYCWeeklyOutDisbursement(nonWeeklyAmountDisbursement[1].trim());
							sendTextInNonKYCWeeklyAllDisbursement(nonWeeklyAmountDisbursement[2].trim());
							sendTextInNonKYCMonthlyInDisbursement(nonMonthlyAmountDisbursement[0].trim());
							sendTextInNonKYCMonthlyOutDisbursement(nonMonthlyAmountDisbursement[1].trim());
							sendTextInNonKYCMonthlyAllDisbursement(nonMonthlyAmountDisbursement[2].trim());
						}
						if (verifyElement(mediumKYCThresholdDisbursement, false)) {
							sendTextInMediumKYCMinimumAmountDisbursement(map.get(mapKeys.get(32)).toString());
							sendTextInMediumKYCMaximumAmountDisbursement(map.get(mapKeys.get(33)).toString());
							sendTextInMediumKYCDailyInDisbursement(mediumDailyAmountDisbursement[0].trim());
							sendTextInMediumKYCDailyOutDisbursement(mediumDailyAmountDisbursement[1].trim());
							sendTextInMediumKYCDailyAllDisbursement(mediumDailyAmountDisbursement[2].trim());
							sendTextInMediumKYCWeeklyInDisbursement(mediumWeeklyAmountDisbursement[0].trim());
							sendTextInMediumKYCWeeklyOutDisbursement(mediumWeeklyAmountDisbursement[1].trim());
							sendTextInMediumKYCWeeklyAllDisbursement(mediumWeeklyAmountDisbursement[2].trim());
							sendTextInMediumKYCMonthlyInDisbursement(mediumMonthlyAmountDisbursement[0].trim());
							sendTextInMediumKYCMonthlyOutDisbursement(mediumMonthlyAmountDisbursement[1].trim());
							sendTextInMediumKYCMonthlyAllDisbursement(mediumMonthlyAmountDisbursement[2].trim());
						}
						if (verifyElement(fullKYCThresholdDisbursement, false)) {
							sendTextInFullKYCMinimumAmountDisbursement(map.get(mapKeys.get(37)).toString());
							sendTextInFullKYCMaximumAmountDisbursement(map.get(mapKeys.get(38)).toString());
							sendTextInFullKYCDailyInDisbursement(fullDailyAmountDisbursement[0].trim());
							sendTextInFullKYCDailyOutDisbursement(fullDailyAmountDisbursement[1].trim());
							sendTextInFullKYCDailyAllDisbursement(fullDailyAmountDisbursement[2].trim());
							sendTextInFullKYCWeeklyInDisbursement(fullWeeklyAmountDisbursement[0].trim());
							sendTextInFullKYCWeeklyOutDisbursement(fullWeeklyAmountDisbursement[1].trim());
							sendTextInFullKYCWeeklyAllDisbursement(fullWeeklyAmountDisbursement[2].trim());
							sendTextInFullKYCMonthlyInDisbursement(fullMonthlyAmountDisbursement[0].trim());
							sendTextInFullKYCMonthlyOutDisbursement(fullMonthlyAmountDisbursement[1].trim());
							sendTextInFullKYCmonthlyAllDisbursement(fullMonthlyAmountDisbursement[2].trim());
						}
						clickOnNextBtn();
					}
					if (verifyToolTip()) {
						clickOnCancelBtn();
						getStriptText();
					} else {
						String[] accessChannel = map.get(mapKeys.get(42)).toString().split(",");
						for (int i = 0; i < accessChannel.length; i++) {
							clickOnAccessChannel(accessChannel[i]);
						}
						clickOnNextBtn();
						String[] serviceName = map.get(mapKeys.get(43)).toString().split("/");
						for (int i = 0; i < serviceName.length; i++) {
							String[] services = serviceName[i].split(":");
							clickOnServiceText(services[0]);
							String[] name = services[1].split(",");
							for (int j = 0; j < name.length; j++) {
								clickOnService(setFirstCharInCaps(name[j].trim(), true));
							}
						}
						clickOnNextBtn();
						sendTextInStakeHolderName(map.get(mapKeys.get(44)).toString());
						clickOnSaveBtn();
					}
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
	 * @creation date 16/11/2018
	 * @return true if Profile added successfully
	 */
	public boolean verifyProfileAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By profileName = By
				.xpath("//label[text()[normalize-space() = 'Profile Name']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By profileType = By
				.xpath("//label[text()[normalize-space() = 'Profile Type']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By status = By
				.xpath("//label[text()[normalize-space() = 'Status']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By stakeHolder = By
				.xpath("//label[text()[normalize-space() = 'Stakeholder List']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(44)).toString() + "']");

		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (!verifyElement(profileName, false))
				return false;
			if (!verifyElement(profileType, false))
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
			if (!map.get(mapKeys.get(4)).toString().equals("")) {
				clickOnKYCDetailsPlusIcon();
				String[] kycCategories = map.get(mapKeys.get(4)).toString().split("/");
				for (int k = 0; k < kycCategories.length; k++) {
					String[] kycCategory = kycCategories[k].trim().split(":");
					String[] kycFields = kycCategory[1].trim().split(",");
					for (int f = 0; f < kycFields.length; f++) {
						By kycFiels = By.xpath("//*[normalize-space(text())='" + kycCategory[0]
								+ "']//preceding-sibling::td[normalize-space(text())='" + kycFields[f].trim() + "']");
						if (!verifyElement(kycFiels, false))
							return false;
					}
				}
				String[] nonKYCFields = map.get(mapKeys.get(5)).toString().split("/");
				String[] mediumKYCFields = map.get(mapKeys.get(6)).toString().split("/");
				String[] fullKYCFields = map.get(mapKeys.get(7)).toString().split("/");
				String[] mandatoryFields = map.get(mapKeys.get(8)).toString().split("/");
				String[] showFields = map.get(mapKeys.get(9)).toString().split("/");
				String[] isEditableFields = map.get(mapKeys.get(10)).toString().split("/");
				String[] isEditableAdminFields = map.get(mapKeys.get(11)).toString().split("/");

				for (int n = 0; n < nonKYCFields.length; n++) {
					String[] nonKYCField = nonKYCFields[n].trim().split(":");
					if (!map.get(mapKeys.get(5)).toString().equals("")) {
						String[] nonField = nonKYCField[1].trim().split(",");
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
					String[] mediumKYCField = mediumKYCFields[m].trim().split(":");
					if (!map.get(mapKeys.get(6)).toString().equals("")) {
						String[] mediumField = mediumKYCField[1].trim().split(",");
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
					String[] fullKYCField = fullKYCFields[f].trim().split(":");
					if (!map.get(mapKeys.get(7)).toString().equals("")) {
						String[] fullField = fullKYCField[1].trim().split(",");
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
					String[] mandatoryField = mandatoryFields[m].trim().split(":");
					if (!map.get(mapKeys.get(8)).toString().equals("")) {
						String[] mandatory = mandatoryField[1].trim().split(",");
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
					String[] showField = showFields[m].trim().split(":");
					if (!map.get(mapKeys.get(9)).toString().equals("")) {
						String[] show = showField[1].trim().split(",");
						for (int a = 0; a < show.length; a++) {
							By mandatoryCheckBox = By.xpath("(//*[normalize-space(text())='" + showField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + show[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[2]");
							if (!verifyElement(mandatoryCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < isEditableFields.length; m++) {
					String[] isEditableField = isEditableFields[m].trim().split(":");
					if (!map.get(mapKeys.get(10)).toString().equals("")) {
						String[] isEditable = isEditableField[1].trim().split(",");
						for (int a = 0; a < isEditable.length; a++) {
							By mandatoryCheckBox = By.xpath("(//*[normalize-space(text())='" + isEditableField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + isEditable[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[3]");
							if (!verifyElement(mandatoryCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < isEditableAdminFields.length; m++) {
					String[] isEditableAdminField = isEditableAdminFields[m].trim().split(":");
					if (!map.get(mapKeys.get(11)).toString().equals("")) {
						String[] isEditableAdmin = isEditableAdminField[1].trim().split(",");
						for (int a = 0; a < isEditableAdmin.length; a++) {
							By mandatoryCheckBox = By.xpath("(//*[normalize-space(text())='"
									+ isEditableAdminField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + isEditableAdmin[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[4]");
							if (!verifyElement(mandatoryCheckBox, false))
								return false;
						}
					}
				}

			}
			if (verifyElement(openCollectionThreshold, false)) {
				clickOnCollectionThresholdPlusIcon();
				String nonDailyAmountCollection[] = map.get(mapKeys.get(14)).toString().split(",");
				String nonWeeklyAmountCollection[] = map.get(mapKeys.get(15)).toString().split(",");
				String nonMonthlyAmountCollection[] = map.get(mapKeys.get(16)).toString().split(",");
				String mediumDailyAmountCollection[] = map.get(mapKeys.get(19)).toString().split(",");
				String mediumWeeklyAmountCollection[] = map.get(mapKeys.get(20)).toString().split(",");
				String mediumMonthlyAmountCollection[] = map.get(mapKeys.get(21)).toString().split(",");
				String fullDailyAmountCollection[] = map.get(mapKeys.get(24)).toString().split(",");
				String fullWeeklyAmountCollection[] = map.get(mapKeys.get(25)).toString().split(",");
				String fullMonthlyAmountCollection[] = map.get(mapKeys.get(26)).toString().split(",");
				int kycTypeCol = 0;
				if (map.get(mapKeys.get(1)).toString().contains("Non")) {
					kycTypeCol++;
					By nonMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					if (!getUIText(nonMin).split(" ")[1].equals(map.get(mapKeys.get(12)).toString()))
						return false;
					if (!getUIText(nonMax).split(" ")[1].equals(map.get(mapKeys.get(13)).toString()))
						return false;
					if (!getUIText(nonDailyIn).split(" ")[1].equals(nonDailyAmountCollection[0].trim()))
						return false;
					if (!getUIText(nonDailyOut).split(" ")[1].equals(nonDailyAmountCollection[1].trim()))
						return false;
					if (!getUIText(nonDailyAll).split(" ")[1].equals(nonDailyAmountCollection[2].trim()))
						return false;
					if (!getUIText(nonWeeklyIn).split(" ")[1].equals(nonWeeklyAmountCollection[0].trim()))
						return false;
					if (!getUIText(nonWeeklyOut).split(" ")[1].equals(nonWeeklyAmountCollection[1].trim()))
						return false;
					if (!getUIText(nonWeeklyAll).split(" ")[1].equals(nonWeeklyAmountCollection[2].trim()))
						return false;
					if (!getUIText(nonMonthlyIn).split(" ")[1].equals(nonMonthlyAmountCollection[0].trim()))
						return false;
					if (!getUIText(nonMonthlyOut).split(" ")[1].equals(nonMonthlyAmountCollection[1].trim()))
						return false;
					if (!getUIText(nonMonthlyAll).split(" ")[1].equals(nonMonthlyAmountCollection[2].trim()))
						return false;
				}
				if (map.get(mapKeys.get(1)).toString().contains("Medium")) {
					kycTypeCol++;
					By mediumMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					if (!getUIText(mediumMin).split(" ")[1].equals(map.get(mapKeys.get(17)).toString()))
						return false;
					if (!getUIText(mediumMax).split(" ")[1].equals(map.get(mapKeys.get(18)).toString()))
						return false;
					if (!getUIText(mediumDailyIn).split(" ")[1].equals(mediumDailyAmountCollection[0].trim()))
						return false;
					if (!getUIText(mediumDailyOut).split(" ")[1].equals(mediumDailyAmountCollection[1].trim()))
						return false;
					if (!getUIText(mediumDailyAll).split(" ")[1].equals(mediumDailyAmountCollection[2].trim()))
						return false;
					if (!getUIText(mediumWeeklyIn).split(" ")[1].equals(mediumWeeklyAmountCollection[0].trim()))
						return false;
					if (!getUIText(mediumWeeklyOut).split(" ")[1].equals(mediumWeeklyAmountCollection[1].trim()))
						return false;
					if (!getUIText(mediumWeeklyAll).split(" ")[1].equals(mediumWeeklyAmountCollection[2].trim()))
						return false;
					if (!getUIText(mediumMonthlyIn).split(" ")[1].equals(mediumMonthlyAmountCollection[0].trim()))
						return false;
					if (!getUIText(mediumMonthlyOut).split(" ")[1].equals(mediumMonthlyAmountCollection[1].trim()))
						return false;
					if (!getUIText(mediumMonthlyAll).split(" ")[1].equals(mediumMonthlyAmountCollection[2].trim()))
						return false;
				}
				if (map.get(mapKeys.get(1)).toString().contains("Full")) {
					kycTypeCol++;
					By fullMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					if (!getUIText(fullMin).split(" ")[1].equals(map.get(mapKeys.get(22)).toString()))
						return false;
					if (!getUIText(fullMax).split(" ")[1].equals(map.get(mapKeys.get(23)).toString()))
						return false;
					if (!getUIText(fullDailyIn).split(" ")[1].equals(fullDailyAmountCollection[0].trim()))
						return false;
					if (!getUIText(fullDailyOut).split(" ")[1].equals(fullDailyAmountCollection[1].trim()))
						return false;
					if (!getUIText(fullDailyAll).split(" ")[1].equals(fullDailyAmountCollection[2].trim()))
						return false;
					if (!getUIText(fullWeeklyIn).split(" ")[1].equals(fullWeeklyAmountCollection[0].trim()))
						return false;
					if (!getUIText(fullWeeklyOut).split(" ")[1].equals(fullWeeklyAmountCollection[1].trim()))
						return false;
					if (!getUIText(fullWeeklyAll).split(" ")[1].equals(fullWeeklyAmountCollection[2].trim()))
						return false;
					if (!getUIText(fullMonthlyIn).split(" ")[1].equals(fullMonthlyAmountCollection[0].trim()))
						return false;
					if (!getUIText(fullMonthlyOut).split(" ")[1].equals(fullMonthlyAmountCollection[1].trim()))
						return false;
					if (!getUIText(fullMonthlyAll).split(" ")[1].equals(fullMonthlyAmountCollection[2].trim()))
						return false;
				}
			}
			if (verifyElement(openDisbursementThreshold, false)) {
				clickOnDisbursementThresholdPlusIcon();
				String nonDailyAmountDisbursement[] = map.get(mapKeys.get(29)).toString().split(",");
				String nonWeeklyAmountDisbursement[] = map.get(mapKeys.get(30)).toString().split(",");
				String nonMonthlyAmountDisbursement[] = map.get(mapKeys.get(31)).toString().split(",");
				String mediumDailyAmountDisbursement[] = map.get(mapKeys.get(34)).toString().split(",");
				String mediumWeeklyAmountDisbursement[] = map.get(mapKeys.get(35)).toString().split(",");
				String mediumMonthlyAmountDisbursement[] = map.get(mapKeys.get(36)).toString().split(",");
				String fullDailyAmountDisbursement[] = map.get(mapKeys.get(39)).toString().split(",");
				String fullWeeklyAmountDisbursement[] = map.get(mapKeys.get(40)).toString().split(",");
				String fullMonthlyAmountDisbursement[] = map.get(mapKeys.get(41)).toString().split(",");
				int kycTypeDis = 0;
				if (map.get(mapKeys.get(1)).toString().contains("Non")) {
					kycTypeDis++;
					By nonMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					if (!getUIText(nonMin).split(" ")[1].equals(map.get(mapKeys.get(27)).toString()))
						return false;
					if (!getUIText(nonMax).split(" ")[1].equals(map.get(mapKeys.get(28)).toString()))
						return false;
					if (!getUIText(nonDailyIn).split(" ")[1].equals(nonDailyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(nonDailyOut).split(" ")[1].equals(nonDailyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(nonDailyAll).split(" ")[1].equals(nonDailyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(nonWeeklyIn).split(" ")[1].equals(nonWeeklyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(nonWeeklyOut).split(" ")[1].equals(nonWeeklyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(nonWeeklyAll).split(" ")[1].equals(nonWeeklyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(nonMonthlyIn).split(" ")[1].equals(nonMonthlyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(nonMonthlyOut).split(" ")[1].equals(nonMonthlyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(nonMonthlyAll).split(" ")[1].equals(nonMonthlyAmountDisbursement[2].trim()))
						return false;
				}
				if (map.get(mapKeys.get(1)).toString().contains("Medium")) {
					kycTypeDis++;
					By mediumMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					if (!getUIText(mediumMin).split(" ")[1].equals(map.get(mapKeys.get(32)).toString()))
						return false;
					if (!getUIText(mediumMax).split(" ")[1].equals(map.get(mapKeys.get(33)).toString()))
						return false;
					if (!getUIText(mediumDailyIn).split(" ")[1].equals(mediumDailyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(mediumDailyOut).split(" ")[1].equals(mediumDailyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(mediumDailyAll).split(" ")[1].equals(mediumDailyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(mediumWeeklyIn).split(" ")[1].equals(mediumWeeklyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(mediumWeeklyOut).split(" ")[1].equals(mediumWeeklyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(mediumWeeklyAll).split(" ")[1].equals(mediumWeeklyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(mediumMonthlyIn).split(" ")[1].equals(mediumMonthlyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(mediumMonthlyOut).split(" ")[1].equals(mediumMonthlyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(mediumMonthlyAll).split(" ")[1].equals(mediumMonthlyAmountDisbursement[2].trim()))
						return false;
				}
				if (map.get(mapKeys.get(1)).toString().contains("Full")) {
					kycTypeDis++;
					By fullMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					if (!getUIText(fullMin).split(" ")[1].equals(map.get(mapKeys.get(37)).toString()))
						return false;
					if (!getUIText(fullMax).split(" ")[1].equals(map.get(mapKeys.get(38)).toString()))
						return false;
					if (!getUIText(fullDailyIn).split(" ")[1].equals(fullDailyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(fullDailyOut).split(" ")[1].equals(fullDailyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(fullDailyAll).split(" ")[1].equals(fullDailyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(fullWeeklyIn).split(" ")[1].equals(fullWeeklyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(fullWeeklyOut).split(" ")[1].equals(fullWeeklyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(fullWeeklyAll).split(" ")[1].equals(fullWeeklyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(fullMonthlyIn).split(" ")[1].equals(fullMonthlyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(fullMonthlyOut).split(" ")[1].equals(fullMonthlyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(fullMonthlyAll).split(" ")[1].equals(fullMonthlyAmountDisbursement[2].trim()))
						return false;
				}
			}
			clickOnAccessChannelPlusIcon();
			String[] accessChannel = map.get(mapKeys.get(42)).toString().split(",");
			for (int i = 0; i < accessChannel.length; i++) {
				By access = By.xpath("//*[normalize-space(text())='" + accessChannel[i].trim() + "']");
				if (!verifyElement(access, false))
					return false;
			}

			clickOnServicesPlusIcon();
			String[] serviceName = map.get(mapKeys.get(43)).toString().split("/");
			for (int i = 0; i < serviceName.length; i++) {
				String[] services = serviceName[i].split(":");
				String[] name = services[1].trim().split(",");
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
	 * @creation date 16/11/2018
	 */
	public void editProfile(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnEditBtn();
			clickOnProfileDetailsLink();
			selectTextInStatus(map.get(mapKeys.get(3)).toString());
			clickOnKYCDetailsLink();
			List<WebElement> navigationInKYCDetails = getElementList(kycDetails);
			for (int i = 0; i < navigationInKYCDetails.size(); i++) {
				if (!map.get(mapKeys.get(4)).toString().equals("")) {
					String[] kycCategories = map.get(mapKeys.get(4)).toString().split("/");
					for (int k = 0; k < kycCategories.length; k++) {
						String[] kycCategory = kycCategories[k].trim().split(":");
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
					String[] nonKYCFields = map.get(mapKeys.get(5)).toString().split("/");
					String[] mediumKYCFields = map.get(mapKeys.get(6)).toString().split("/");
					String[] fullKYCFields = map.get(mapKeys.get(7)).toString().split("/");
					String[] mandatoryFields = map.get(mapKeys.get(8)).toString().split("/");
					String[] showFields = map.get(mapKeys.get(9)).toString().split("/");
					String[] isEditableFields = map.get(mapKeys.get(10)).toString().split("/");
					String[] isEditableAdminFields = map.get(mapKeys.get(11)).toString().split("/");

					for (int n = 0; n < nonKYCFields.length; n++) {
						String[] nonKYCField = nonKYCFields[n].trim().split(":");
						if (!map.get(mapKeys.get(5)).toString().equals("")) {
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
						String[] mediumKYCField = mediumKYCFields[m].trim().split(":");
						if (!map.get(mapKeys.get(6)).toString().equals("")) {
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
						String[] fullKYCField = fullKYCFields[f].trim().split(":");
						if (!map.get(mapKeys.get(7)).toString().equals("")) {
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
						String[] mandatoryField = mandatoryFields[m].trim().split(":");
						if (!map.get(mapKeys.get(8)).toString().equals("")) {
							String[] mandatory = mandatoryField[1].trim().split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + mandatoryField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < mandatory.length; a++) {
									clickOnMandatoryCheckBoxForEdit(mandatory[a].trim());
								}
							}
						}
					}
					for (int m = 0; m < showFields.length; m++) {
						String[] showField = showFields[m].trim().split(":");
						if (!map.get(mapKeys.get(9)).toString().equals("")) {
							String[] show = showField[1].trim().split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + showField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < show.length; a++) {
									clickOnShowCheckBoxForEdit(show[a].trim());
								}
							}
						}
					}
					for (int m = 0; m < isEditableFields.length; m++) {
						String[] isEditableField = isEditableFields[m].trim().split(":");
						if (!map.get(mapKeys.get(10)).toString().equals("")) {
							String[] isEditable = isEditableField[1].trim().split(",");
							if (verifyElement(
									By.xpath("//label[normalize-space(text())='" + isEditableField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < isEditable.length; a++) {
									clickOnIsEditableCheckBoxForEdit(isEditable[a].trim());
								}
							}
						}
					}
					for (int m = 0; m < isEditableAdminFields.length; m++) {
						String[] isEditableAdminField = isEditableAdminFields[m].trim().split(":");
						if (!map.get(mapKeys.get(11)).toString().equals("")) {
							String[] isEditableAdmin = isEditableAdminField[1].trim().split(",");
							if (verifyElement(By
									.xpath("//label[normalize-space(text())='" + isEditableAdminField[0].trim() + "']"),
									false)) {
								for (int a = 0; a < isEditableAdmin.length; a++) {
									clickOnIsEditableAdminCheckBoxForEdit(isEditableAdmin[a].trim());
								}
							}
						}
					}
				}
				if (i != navigationInKYCDetails.size() - 1)
					clickOnNavigationLink(navigationInKYCDetails.get(i + 1));
			}

			if (verifyElement(collectionThresholdLink, false)) {
				clickOnCollectionThresholdLink();
				String nonDailyAmountCollection[] = map.get(mapKeys.get(14)).toString().split(",");
				String nonWeeklyAmountCollection[] = map.get(mapKeys.get(15)).toString().split(",");
				String nonMonthlyAmountCollection[] = map.get(mapKeys.get(16)).toString().split(",");
				String mediumDailyAmountCollection[] = map.get(mapKeys.get(19)).toString().split(",");
				String mediumWeeklyAmountCollection[] = map.get(mapKeys.get(20)).toString().split(",");
				String mediumMonthlyAmountCollection[] = map.get(mapKeys.get(21)).toString().split(",");
				String fullDailyAmountCollection[] = map.get(mapKeys.get(24)).toString().split(",");
				String fullWeeklyAmountCollection[] = map.get(mapKeys.get(25)).toString().split(",");
				String fullMonthlyAmountCollection[] = map.get(mapKeys.get(26)).toString().split(",");

				if (verifyElement(nonKYCThresholdCollection, false)) {
					sendTextInNonKYCMinimumAmountCollection(map.get(mapKeys.get(12)).toString());
					sendTextInNonKYCMaximumAmountCollection(map.get(mapKeys.get(13)).toString());
					sendTextInNonKYCDailyInCollection(nonDailyAmountCollection[0].trim());
					sendTextInNonKYCDailyOutCollection(nonDailyAmountCollection[1].trim());
					sendTextInNonKYCDailyAllCollection(nonDailyAmountCollection[2].trim());
					sendTextInNonKYCWeeklyInCollection(nonWeeklyAmountCollection[0].trim());
					sendTextInNonKYCWeeklyOutCollection(nonWeeklyAmountCollection[1].trim());
					sendTextInNonKYCWeeklyAllCollection(nonWeeklyAmountCollection[2].trim());
					sendTextInNonKYCMonthlyInCollection(nonMonthlyAmountCollection[0].trim());
					sendTextInNonKYCMonthlyOutCollection(nonMonthlyAmountCollection[1].trim());
					sendTextInNonKYCMonthlyAllCollection(nonMonthlyAmountCollection[2].trim());
				}
				if (verifyElement(mediumKYCThresholdCollection, false)) {
					sendTextInMediumKYCMinimumAmountCollection(map.get(mapKeys.get(17)).toString());
					sendTextInMediumKYCMaximumAmountCollection(map.get(mapKeys.get(18)).toString());
					sendTextInMediumKYCDailyInCollection(mediumDailyAmountCollection[0].trim());
					sendTextInMediumKYCDailyOutCollection(mediumDailyAmountCollection[1].trim());
					sendTextInMediumKYCDailyAllCollection(mediumDailyAmountCollection[2].trim());
					sendTextInMediumKYCWeeklyInCollection(mediumWeeklyAmountCollection[0].trim());
					sendTextInMediumKYCWeeklyOutCollection(mediumWeeklyAmountCollection[1].trim());
					sendTextInMediumKYCWeeklyAllCollection(mediumWeeklyAmountCollection[2].trim());
					sendTextInMediumKYCMonthlyInCollection(mediumMonthlyAmountCollection[0].trim());
					sendTextInMediumKYCMonthlyOutCollection(mediumMonthlyAmountCollection[1].trim());
					sendTextInMediumKYCMonthlyAllCollection(mediumMonthlyAmountCollection[2].trim());
				}
				if (verifyElement(fullKYCThresholdCollection, false)) {
					sendTextInFullKYCMinimumAmountCollection(map.get(mapKeys.get(22)).toString());
					sendTextInFullKYCMaximumAmountCollection(map.get(mapKeys.get(23)).toString());
					sendTextInFullKYCDailyInCollection(fullDailyAmountCollection[0].trim());
					sendTextInFullKYCDailyOutCollection(fullDailyAmountCollection[1].trim());
					sendTextInFullKYCDailyAllCollection(fullDailyAmountCollection[2].trim());
					sendTextInFullKYCWeeklyInCollection(fullWeeklyAmountCollection[0].trim());
					sendTextInFullKYCWeeklyOutCollection(fullWeeklyAmountCollection[1].trim());
					sendTextInFullKYCWeeklyAllCollection(fullWeeklyAmountCollection[2].trim());
					sendTextInFullKYCMonthlyInCollection(fullMonthlyAmountCollection[0].trim());
					sendTextInFullKYCMonthlyOutCollection(fullMonthlyAmountCollection[1].trim());
					sendTextInFullKYCmonthlyAllCollection(fullMonthlyAmountCollection[2].trim());
				}
			}

			if (verifyElement(disbursementThresholdLink, false)) {
				clickOnDisbursementThresholdLink();
				String nonDailyAmountDisbursement[] = map.get(mapKeys.get(29)).toString().split(",");
				String nonWeeklyAmountDisbursement[] = map.get(mapKeys.get(30)).toString().split(",");
				String nonMonthlyAmountDisbursement[] = map.get(mapKeys.get(31)).toString().split(",");
				String mediumDailyAmountDisbursement[] = map.get(mapKeys.get(34)).toString().split(",");
				String mediumWeeklyAmountDisbursement[] = map.get(mapKeys.get(35)).toString().split(",");
				String mediumMonthlyAmountDisbursement[] = map.get(mapKeys.get(36)).toString().split(",");
				String fullDailyAmountDisbursement[] = map.get(mapKeys.get(39)).toString().split(",");
				String fullWeeklyAmountDisbursement[] = map.get(mapKeys.get(40)).toString().split(",");
				String fullMonthlyAmountDisbursement[] = map.get(mapKeys.get(41)).toString().split(",");

				if (verifyElement(nonKYCThresholdDisbursement, false)) {
					sendTextInNonKYCMinimumAmountDisbursement(map.get(mapKeys.get(27)).toString());
					sendTextInNonKYCMaximumAmountDisbursement(map.get(mapKeys.get(28)).toString());
					sendTextInNonKYCDailyInDisbursement(nonDailyAmountDisbursement[0].trim());
					sendTextInNonKYCDailyOutDisbursement(nonDailyAmountDisbursement[1].trim());
					sendTextInNonKYCDailyAllDisbursement(nonDailyAmountDisbursement[2].trim());
					sendTextInNonKYCWeeklyInDisbursement(nonWeeklyAmountDisbursement[0].trim());
					sendTextInNonKYCWeeklyOutDisbursement(nonWeeklyAmountDisbursement[1].trim());
					sendTextInNonKYCWeeklyAllDisbursement(nonWeeklyAmountDisbursement[2].trim());
					sendTextInNonKYCMonthlyInDisbursement(nonMonthlyAmountDisbursement[0].trim());
					sendTextInNonKYCMonthlyOutDisbursement(nonMonthlyAmountDisbursement[1].trim());
					sendTextInNonKYCMonthlyAllDisbursement(nonMonthlyAmountDisbursement[2].trim());
				}
				if (verifyElement(mediumKYCThresholdDisbursement, false)) {
					sendTextInMediumKYCMinimumAmountDisbursement(map.get(mapKeys.get(32)).toString());
					sendTextInMediumKYCMaximumAmountDisbursement(map.get(mapKeys.get(33)).toString());
					sendTextInMediumKYCDailyInDisbursement(mediumDailyAmountDisbursement[0].trim());
					sendTextInMediumKYCDailyOutDisbursement(mediumDailyAmountDisbursement[1].trim());
					sendTextInMediumKYCDailyAllDisbursement(mediumDailyAmountDisbursement[2].trim());
					sendTextInMediumKYCWeeklyInDisbursement(mediumWeeklyAmountDisbursement[0].trim());
					sendTextInMediumKYCWeeklyOutDisbursement(mediumWeeklyAmountDisbursement[1].trim());
					sendTextInMediumKYCWeeklyAllDisbursement(mediumWeeklyAmountDisbursement[2].trim());
					sendTextInMediumKYCMonthlyInDisbursement(mediumMonthlyAmountDisbursement[0].trim());
					sendTextInMediumKYCMonthlyOutDisbursement(mediumMonthlyAmountDisbursement[1].trim());
					sendTextInMediumKYCMonthlyAllDisbursement(mediumMonthlyAmountDisbursement[2].trim());
				}
				if (verifyElement(fullKYCThresholdDisbursement, false)) {
					sendTextInFullKYCMinimumAmountDisbursement(map.get(mapKeys.get(37)).toString());
					sendTextInFullKYCMaximumAmountDisbursement(map.get(mapKeys.get(38)).toString());
					sendTextInFullKYCDailyInDisbursement(fullDailyAmountDisbursement[0].trim());
					sendTextInFullKYCDailyOutDisbursement(fullDailyAmountDisbursement[1].trim());
					sendTextInFullKYCDailyAllDisbursement(fullDailyAmountDisbursement[2].trim());
					sendTextInFullKYCWeeklyInDisbursement(fullWeeklyAmountDisbursement[0].trim());
					sendTextInFullKYCWeeklyOutDisbursement(fullWeeklyAmountDisbursement[1].trim());
					sendTextInFullKYCWeeklyAllDisbursement(fullWeeklyAmountDisbursement[2].trim());
					sendTextInFullKYCMonthlyInDisbursement(fullMonthlyAmountDisbursement[0].trim());
					sendTextInFullKYCMonthlyOutDisbursement(fullMonthlyAmountDisbursement[1].trim());
					sendTextInFullKYCmonthlyAllDisbursement(fullMonthlyAmountDisbursement[2].trim());
				}
			}

			if (!map.get(mapKeys.get(42)).toString().equals("")) {
				clickOnAccessChannelLink();
				String[] accessChannel = map.get(mapKeys.get(42)).toString().split(",");
				if (!map.get(mapKeys.get(42)).toString().equals("")) {
					for (int i = 0; i < accessChannel.length; i++) {
						clickOnAccessChannel(accessChannel[i].trim());
					}
				}
			}

			if (!map.get(mapKeys.get(43)).toString().equals("")) {
				clickOnServicesLink();
				String[] serviceName = map.get(mapKeys.get(43)).toString().split("/");
				for (int i = 0; i < serviceName.length; i++) {
					String[] services = serviceName[i].trim().split(":");
					clickOnServiceText(services[0].trim());
					String[] name = services[1].trim().split(",");
					for (int j = 0; j < name.length; j++) {
						clickOnService(setFirstCharInCaps(name[j].trim().toLowerCase(), true));
					}
				}
			}

			clickOnProfileSummaryLink();
			sendTextInStakeHolderName(map.get(mapKeys.get(44)).toString());
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
	 * @creation date 16/11/2018
	 * @return true if Profile edited successfully
	 */
	public boolean verifyProfileEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By profileName = By
				.xpath("//label[text()[normalize-space() = 'Profile Name']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By profileType = By
				.xpath("//label[text()[normalize-space() = 'Profile Type']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By status = By
				.xpath("//label[text()[normalize-space() = 'Status']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By stakeHolder = By
				.xpath("//label[text()[normalize-space() = 'Stakeholder List']]//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(44)).toString() + "']");

		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (!verifyElement(profileName, false))
				return false;
			if (!verifyElement(profileType, false))
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
			if (!map.get(mapKeys.get(4)).toString().equals("")) {
				clickOnKYCDetailsPlusIcon();
				String[] kycCategories = map.get(mapKeys.get(4)).toString().split("/");
				for (int k = 0; k < kycCategories.length; k++) {
					String[] kycCategory = kycCategories[k].trim().split(":");
					String[] kycFields = kycCategory[1].trim().split(",");
					for (int f = 0; f < kycFields.length; f++) {
						By kycFiels = By.xpath("//*[normalize-space(text())='" + kycCategory[0].trim()
								+ "']//preceding-sibling::td[normalize-space(text())='" + kycFields[f].trim() + "']");
						if (!verifyElement(kycFiels, false))
							return false;
					}
				}
				String[] nonKYCFields = map.get(mapKeys.get(5)).toString().split("/");
				String[] mediumKYCFields = map.get(mapKeys.get(6)).toString().split("/");
				String[] fullKYCFields = map.get(mapKeys.get(7)).toString().split("/");
				String[] mandatoryFields = map.get(mapKeys.get(8)).toString().split("/");
				String[] showFields = map.get(mapKeys.get(9)).toString().split("/");
				String[] isEditableFields = map.get(mapKeys.get(10)).toString().split("/");
				String[] isEditableAdminFields = map.get(mapKeys.get(11)).toString().split("/");

				for (int n = 0; n < nonKYCFields.length; n++) {
					String[] nonKYCField = nonKYCFields[n].split(":");
					if (!map.get(mapKeys.get(5)).toString().equals("")) {
						String[] nonField = nonKYCField[1].trim().split(",");
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
					String[] mediumKYCField = mediumKYCFields[m].trim().split(":");
					if (!map.get(mapKeys.get(6)).toString().equals("")) {
						String[] mediumField = mediumKYCField[1].trim().split(",");
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
					String[] fullKYCField = fullKYCFields[f].trim().split(":");
					if (!map.get(mapKeys.get(7)).toString().equals("")) {
						String[] fullField = fullKYCField[1].trim().split(",");
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
					String[] mandatoryField = mandatoryFields[m].trim().split(":");
					if (!map.get(mapKeys.get(8)).toString().equals("")) {
						String[] mandatory = mandatoryField[1].trim().split(",");
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
					String[] showField = showFields[m].trim().split(":");
					if (!map.get(mapKeys.get(9)).toString().equals("")) {
						String[] show = showField[1].trim().split(",");
						for (int a = 0; a < show.length; a++) {
							By mandatoryCheckBox = By.xpath("(//*[normalize-space(text())='" + showField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + show[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[2]");
							if (!verifyElement(mandatoryCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < isEditableFields.length; m++) {
					String[] isEditableField = isEditableFields[m].trim().split(":");
					if (!map.get(mapKeys.get(10)).toString().equals("")) {
						String[] isEditable = isEditableField[1].split(",");
						for (int a = 0; a < isEditable.length; a++) {
							By mandatoryCheckBox = By.xpath("(//*[normalize-space(text())='" + isEditableField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + isEditable[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[3]");
							if (!verifyElement(mandatoryCheckBox, false))
								return false;
						}
					}
				}
				for (int m = 0; m < isEditableAdminFields.length; m++) {
					String[] isEditableAdminField = isEditableAdminFields[m].split(":");
					if (!map.get(mapKeys.get(11)).toString().equals("")) {
						String[] isEditableAdmin = isEditableAdminField[1].split(",");
						for (int a = 0; a < isEditableAdmin.length; a++) {
							By mandatoryCheckBox = By.xpath("(//*[normalize-space(text())='"
									+ isEditableAdminField[0].trim()
									+ "']//preceding-sibling::td[normalize-space(text())='" + isEditableAdmin[a].trim()
									+ "']//following-sibling::td[normalize-space(text())='Yes'])[4]");
							if (!verifyElement(mandatoryCheckBox, false))
								return false;
						}
					}
				}

			}
			if (verifyElement(openCollectionThreshold, false)) {
				clickOnCollectionThresholdPlusIcon();
				String nonDailyAmountCollection[] = map.get(mapKeys.get(14)).toString().split(",");
				String nonWeeklyAmountCollection[] = map.get(mapKeys.get(15)).toString().split(",");
				String nonMonthlyAmountCollection[] = map.get(mapKeys.get(16)).toString().split(",");
				String mediumDailyAmountCollection[] = map.get(mapKeys.get(19)).toString().split(",");
				String mediumWeeklyAmountCollection[] = map.get(mapKeys.get(20)).toString().split(",");
				String mediumMonthlyAmountCollection[] = map.get(mapKeys.get(21)).toString().split(",");
				String fullDailyAmountCollection[] = map.get(mapKeys.get(24)).toString().split(",");
				String fullWeeklyAmountCollection[] = map.get(mapKeys.get(25)).toString().split(",");
				String fullMonthlyAmountCollection[] = map.get(mapKeys.get(26)).toString().split(",");
				int kycTypeCol = 0;
				if (map.get(mapKeys.get(1)).toString().contains("Non")) {
					kycTypeCol++;
					By nonMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By nonMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					if (!getUIText(nonMin).split(" ")[1].equals(map.get(mapKeys.get(12)).toString()))
						return false;
					if (!getUIText(nonMax).split(" ")[1].equals(map.get(mapKeys.get(13)).toString()))
						return false;
					if (!getUIText(nonDailyIn).split(" ")[1].equals(nonDailyAmountCollection[0].trim()))
						return false;
					if (!getUIText(nonDailyOut).split(" ")[1].equals(nonDailyAmountCollection[1].trim()))
						return false;
					if (!getUIText(nonDailyAll).split(" ")[1].equals(nonDailyAmountCollection[2].trim()))
						return false;
					if (!getUIText(nonWeeklyIn).split(" ")[1].equals(nonWeeklyAmountCollection[0].trim()))
						return false;
					if (!getUIText(nonWeeklyOut).split(" ")[1].equals(nonWeeklyAmountCollection[1].trim()))
						return false;
					if (!getUIText(nonWeeklyAll).split(" ")[1].equals(nonWeeklyAmountCollection[2].trim()))
						return false;
					if (!getUIText(nonMonthlyIn).split(" ")[1].equals(nonMonthlyAmountCollection[0].trim()))
						return false;
					if (!getUIText(nonMonthlyOut).split(" ")[1].equals(nonMonthlyAmountCollection[1].trim()))
						return false;
					if (!getUIText(nonMonthlyAll).split(" ")[1].equals(nonMonthlyAmountCollection[2].trim()))
						return false;
				}
				if (map.get(mapKeys.get(1)).toString().contains("Medium")) {
					kycTypeCol++;
					By mediumMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By mediumMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					if (!getUIText(mediumMin).split(" ")[1].equals(map.get(mapKeys.get(17)).toString()))
						return false;
					if (!getUIText(mediumMax).split(" ")[1].equals(map.get(mapKeys.get(18)).toString()))
						return false;
					if (!getUIText(mediumDailyIn).split(" ")[1].equals(mediumDailyAmountCollection[0].trim()))
						return false;
					if (!getUIText(mediumDailyOut).split(" ")[1].equals(mediumDailyAmountCollection[1].trim()))
						return false;
					if (!getUIText(mediumDailyAll).split(" ")[1].equals(mediumDailyAmountCollection[2].trim()))
						return false;
					if (!getUIText(mediumWeeklyIn).split(" ")[1].equals(mediumWeeklyAmountCollection[0].trim()))
						return false;
					if (!getUIText(mediumWeeklyOut).split(" ")[1].equals(mediumWeeklyAmountCollection[1].trim()))
						return false;
					if (!getUIText(mediumWeeklyAll).split(" ")[1].equals(mediumWeeklyAmountCollection[2].trim()))
						return false;
					if (!getUIText(mediumMonthlyIn).split(" ")[1].equals(mediumMonthlyAmountCollection[0].trim()))
						return false;
					if (!getUIText(mediumMonthlyOut).split(" ")[1].equals(mediumMonthlyAmountCollection[1].trim()))
						return false;
					if (!getUIText(mediumMonthlyAll).split(" ")[1].equals(mediumMonthlyAmountCollection[2].trim()))
						return false;
				}
				if (map.get(mapKeys.get(1)).toString().contains("Full")) {
					kycTypeCol++;
					By fullMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					By fullMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeCol + "]");
					if (!getUIText(fullMin).split(" ")[1].equals(map.get(mapKeys.get(22)).toString()))
						return false;
					if (!getUIText(fullMax).split(" ")[1].equals(map.get(mapKeys.get(23)).toString()))
						return false;
					if (!getUIText(fullDailyIn).split(" ")[1].equals(fullDailyAmountCollection[0].trim()))
						return false;
					if (!getUIText(fullDailyOut).split(" ")[1].equals(fullDailyAmountCollection[1].trim()))
						return false;
					if (!getUIText(fullDailyAll).split(" ")[1].equals(fullDailyAmountCollection[2].trim()))
						return false;
					if (!getUIText(fullWeeklyIn).split(" ")[1].equals(fullWeeklyAmountCollection[0].trim()))
						return false;
					if (!getUIText(fullWeeklyOut).split(" ")[1].equals(fullWeeklyAmountCollection[1].trim()))
						return false;
					if (!getUIText(fullWeeklyAll).split(" ")[1].equals(fullWeeklyAmountCollection[2].trim()))
						return false;
					if (!getUIText(fullMonthlyIn).split(" ")[1].equals(fullMonthlyAmountCollection[0].trim()))
						return false;
					if (!getUIText(fullMonthlyOut).split(" ")[1].equals(fullMonthlyAmountCollection[1].trim()))
						return false;
					if (!getUIText(fullMonthlyAll).split(" ")[1].equals(fullMonthlyAmountCollection[2].trim()))
						return false;
				}
			}
			if (verifyElement(openDisbursementThreshold, false)) {
				clickOnDisbursementThresholdPlusIcon();
				String nonDailyAmountDisbursement[] = map.get(mapKeys.get(29)).toString().split(",");
				String nonWeeklyAmountDisbursement[] = map.get(mapKeys.get(30)).toString().split(",");
				String nonMonthlyAmountDisbursement[] = map.get(mapKeys.get(31)).toString().split(",");
				String mediumDailyAmountDisbursement[] = map.get(mapKeys.get(34)).toString().split(",");
				String mediumWeeklyAmountDisbursement[] = map.get(mapKeys.get(35)).toString().split(",");
				String mediumMonthlyAmountDisbursement[] = map.get(mapKeys.get(36)).toString().split(",");
				String fullDailyAmountDisbursement[] = map.get(mapKeys.get(39)).toString().split(",");
				String fullWeeklyAmountDisbursement[] = map.get(mapKeys.get(40)).toString().split(",");
				String fullMonthlyAmountDisbursement[] = map.get(mapKeys.get(41)).toString().split(",");
				int kycTypeDis = 0;
				if (map.get(mapKeys.get(1)).toString().contains("Non")) {
					kycTypeDis++;
					By nonMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By nonMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					if (!getUIText(nonMin).split(" ")[1].equals(map.get(mapKeys.get(27)).toString()))
						return false;
					if (!getUIText(nonMax).split(" ")[1].equals(map.get(mapKeys.get(28)).toString()))
						return false;
					if (!getUIText(nonDailyIn).split(" ")[1].equals(nonDailyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(nonDailyOut).split(" ")[1].equals(nonDailyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(nonDailyAll).split(" ")[1].equals(nonDailyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(nonWeeklyIn).split(" ")[1].equals(nonWeeklyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(nonWeeklyOut).split(" ")[1].equals(nonWeeklyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(nonWeeklyAll).split(" ")[1].equals(nonWeeklyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(nonMonthlyIn).split(" ")[1].equals(nonMonthlyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(nonMonthlyOut).split(" ")[1].equals(nonMonthlyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(nonMonthlyAll).split(" ")[1].equals(nonMonthlyAmountDisbursement[2].trim()))
						return false;
				}
				if (map.get(mapKeys.get(1)).toString().contains("Medium")) {
					kycTypeDis++;
					By mediumMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By mediumMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					if (!getUIText(mediumMin).split(" ")[1].equals(map.get(mapKeys.get(32)).toString()))
						return false;
					if (!getUIText(mediumMax).split(" ")[1].equals(map.get(mapKeys.get(33)).toString()))
						return false;
					if (!getUIText(mediumDailyIn).split(" ")[1].equals(mediumDailyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(mediumDailyOut).split(" ")[1].equals(mediumDailyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(mediumDailyAll).split(" ")[1].equals(mediumDailyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(mediumWeeklyIn).split(" ")[1].equals(mediumWeeklyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(mediumWeeklyOut).split(" ")[1].equals(mediumWeeklyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(mediumWeeklyAll).split(" ")[1].equals(mediumWeeklyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(mediumMonthlyIn).split(" ")[1].equals(mediumMonthlyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(mediumMonthlyOut).split(" ")[1].equals(mediumMonthlyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(mediumMonthlyAll).split(" ")[1].equals(mediumMonthlyAmountDisbursement[2].trim()))
						return false;
				}
				if (map.get(mapKeys.get(1)).toString().contains("Full")) {
					kycTypeDis++;
					By fullMin = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MIN_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullMax = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MAX_AMOUNT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullDailyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullDailyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullDailyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.DAILY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullWeeklyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullWeeklyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullWeeklyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.WEEKLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullMonthlyIn = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_IN_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullMonthlyOut = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OUT_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					By fullMonthlyAll = By.xpath("//*[normalize-space(text())='" + ConstantsFile.MONTHLY_OVERALL_LIMIT
							+ "']//following-sibling::td[" + kycTypeDis + "]");
					if (!getUIText(fullMin).split(" ")[1].equals(map.get(mapKeys.get(37)).toString()))
						return false;
					if (!getUIText(fullMax).split(" ")[1].equals(map.get(mapKeys.get(38)).toString()))
						return false;
					if (!getUIText(fullDailyIn).split(" ")[1].equals(fullDailyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(fullDailyOut).split(" ")[1].equals(fullDailyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(fullDailyAll).split(" ")[1].equals(fullDailyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(fullWeeklyIn).split(" ")[1].equals(fullWeeklyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(fullWeeklyOut).split(" ")[1].equals(fullWeeklyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(fullWeeklyAll).split(" ")[1].equals(fullWeeklyAmountDisbursement[2].trim()))
						return false;
					if (!getUIText(fullMonthlyIn).split(" ")[1].equals(fullMonthlyAmountDisbursement[0].trim()))
						return false;
					if (!getUIText(fullMonthlyOut).split(" ")[1].equals(fullMonthlyAmountDisbursement[1].trim()))
						return false;
					if (!getUIText(fullMonthlyAll).split(" ")[1].equals(fullMonthlyAmountDisbursement[2].trim()))
						return false;
				}
			}
			clickOnAccessChannelPlusIcon();
			String[] accessChannel = map.get(mapKeys.get(42)).toString().split(",");
			for (int i = 0; i < accessChannel.length; i++) {
				By access = By.xpath("//*[normalize-space(text())='" + accessChannel[i].trim() + "']");
				if (!verifyElement(access, false))
					return false;
			}

			clickOnServicesPlusIcon();
			String[] serviceName = map.get(mapKeys.get(43)).toString().split("/");
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
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
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

	public boolean verifyProfileDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
					map.get(mapKeys.get(2)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify enterprise Profile edited Log.
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 13/12/2018
	 * @return true if Profile Verify Log SuccesFullly
	 */
	public boolean verifyProfileEditLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort enterprise profile
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
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
