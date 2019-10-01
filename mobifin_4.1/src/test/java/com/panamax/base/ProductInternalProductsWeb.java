package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class ProductInternalProductsWeb extends Common {
	By drpVendorName = By.id("VendorProductID");
	By drpServiceMethodName = By.id("InternalServiceID");
	By drpServiceMethodeType = By.id("InternalServiceMethod");
	By txtProductName = By.id("ProductName");
	By txtDescription = By.id("Description");
	By drpOprtaorName = By.id("OperatorID");
	By drpStatus = By.id("IsActive");
	By txtMinAmount = By.xpath("(//input[contains(@id,'MinAmount')])[1]");
	By txtMaxAmount = By.xpath("(//input[contains(@id,'MaxAmount')])[1]");
	By txtdenominationDiscription = By.xpath("(//textarea[contains(@id,'DenominationName')])[1]");
	By addbtn = By.xpath("(//*[contains(@id,'btnDiscountAdd')])[last()]");
	By drpStatusSearch = By.id("cmbIsActive");
	By drpServiceTypeSearch = By.id("InternalServiceMethod");
	By drpServieNameSearch = By.id("cmbInternalServiceID");
	By txtSearchFromName = By.id("txtFromName");
	By txtSearchToName = By.id("txtToName");
	By drpEmailId = By.id("MailAccountID");
	By drpEmailVariableName = By.id("EmailVariableName");
	By txtEmailFromSubject = By.id("FromSubject");
	By txtEmailToSubject = By.id("ToSubject");
	By txtEmailFromBody = By.xpath("(.//*[@id='notificationSection']//*[@class='note-editable panel-body'])[1]");
	By txtEmailToBody = By.xpath("(.//*[@id='notificationSection']//*[@class='note-editable panel-body'])[2]");
	By drpSmsId = By.id("SMSAccountID");
	By drpSMSVariableName = By.id("SMSVariableName");
	By txtSmsFromBody = By.id("FromSMSBody");
	By txtSmsToBody = By.id("ToSMSBody");
	By drpFcmId = By.id("FCMAccountID");
	By drpFCMVariableName = By.id("FcmVariableName");
	By txtFcmFromBody = By.id("FromFcmBody");
	By txtFcmToBody = By.id("ToFcmBody");
	By drpRefundEmailId = By.id("Refund_MailAccountID");
	By drpRefundEmailVariableName = By.id("Refund_EmailVariableName");
	By txtRefundEmailFromSubject = By.id("Refund_FromSubject");
	By txtRefundEmailToSubject = By.id("Refund_ToSubject");
	By txtRefundEmailFromBody = By.xpath("(.//*[@id='refundSection']//*[@class='note-editable panel-body'])[1]");
	By txtRefundEmailToBody = By.xpath("(.//*[@id='refundSection']//*[@class='note-editable panel-body'])[2]");
	By drpRefundSmsId = By.id("Refund_SMSAccountID");
	By drpRefundSMSVariableName = By.id("Refund_SMSVariableName");
	By txtRefundSmsFromBody = By.id("Refund_FromSMSBody");
	By txtRefundSmsToBody = By.id("Refund_ToSMSBody");
	By drpRefundFcmId = By.id("Refund_FCMAccountID");
	By drpRefundFCMVariableName = By.id("Refund_FcmVariableName");
	By txtRefundFcmFromBody = By.id("Refund_FromFcmBody");
	By txtRefundFcmToBody = By.id("Refund_ToFcmBody");
	By btnAddKey = By.xpath("(//*[contains(@id,'btnAddNew')])[1]");
	By buttonEditProductInfo = By.id("editVendorProductInfo");
	By buttonEditProductInfoSave = By.id("editVendorProductInfoSave");
	By btnEditDenom = By.id("denomEdit");
	By btnEditDenomSave = By.id("denomSave");
	String IsYes = "Yes";
	String IsFix = "Fix";
	String IsSend = "Send";
	String IsPercentageSign = "%";
	By selectFromChargeType = By.xpath("(//*[contains(@class,'bootstrap-switch-id-FromChargeType')])[1]");
	By selectToChargeType = By.xpath("(//*[contains(@class,'bootstrap-switch-id-ToChargeType')])[1]");
	By txtFromChargeValue = By.xpath("(//*[contains(@id,'FromChargeAmount')])[1]");
	By txtToChargeValue = By.xpath("(//*[contains(@id,'ToChargeAmount')])[1]");
	By selectFromCommissionType = By.xpath("(//*[contains(@class,'bootstrap-switch-id-FromCommissionType')])[1]");
	By selectToCommissionType = By.xpath("(//*[contains(@class,'bootstrap-switch-id-ToCommissionType')])[1]");
	By txtFromCommissionValue = By.xpath("(//*[contains(@id,'FromCommissionAmount')])[1]");
	By txtToCommissionValue = By.xpath("(//*[contains(@id,'ToCommissionAmount')])[1]");
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
	By btnDenomLog = By.id("denomLog_1");
	By btnServiceLog = By.id("internserviceLog");
	By logPaginationDenom = By.id("denomLog1UL");
	By logPaginationService = By.id("servicesDivLogUL");
	By drprefundApprover = By.id("RefundApprover");
	By txtLblFullKyc = By.xpath("//*[normalize-space(text())='Full KYC']");
	By txtLblNonKyc = By.xpath("//*[normalize-space(text())='Non KYC']");
	By txtLblMediumKyc = By.xpath("//*[normalize-space(text())='Medium KYC']");
	private boolean allowRefundStatus = false;
	private boolean fromCommissionStatus = false;
	private boolean toCommissionStatus = false;
	private boolean fromSurchargeStatus = false;
	private boolean fromtaxStatus = false;
	private boolean toTaxStatus = false;

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 30/10/2018
	 */

	public ProductInternalProductsWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal
	 *         vendorName drop down
	 * @param vendorName
	 * @creation date 30/10/2018
	 */

	public void selectVendorProductName(String vendorName) {
		selectFromDropdown(drpVendorName, vendorName);
	}

	/**
	 * @author kutbuddin.compounder common actions for navigation menu
	 * @param navigationMenu
	 * @creation date 31/10/2018
	 */
	public void clickOnNavigationMenu(String navigationMenu) {
		clickOnElement(By.xpath("//*[normalize-space(text()) = '" + navigationMenu.trim() + "']"));
	}

	/**
	 * @author kutbuddin.compounder to click on edit product button info save
	 *         button
	 * @creation date 16/10/2018
	 */
	public void clickOnEditBtnProductInfoSave() {
		clickOnElement(buttonEditProductInfoSave);
		if (verifyToolTip())
			clickOnCancelBtn();
		else
			getStriptText();
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal
	 *         opratorName drop down
	 * @param opratorName
	 * @creation date 30/10/2018
	 */
	public void selectOperatorName(String opratorName) {
		selectFromDropdown(drpOprtaorName, opratorName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal
	 *         serviceMethodName drop down
	 * @param moduleName
	 * @creation date 30/10/2018
	 */

	public void selectserviceMethodName(String serviceMethodName) {
		selectFromDropdown(drpServiceMethodName, serviceMethodName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal
	 *         serviceMethodName drop down
	 * @param moduleName
	 * @creation date 30/10/2018
	 */
	public void clickOnTaxation(By webelement) {
		clickOnElement(webelement);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal
	 *         serviceMethodeType drop down
	 * @param serviceMethodeType
	 * @creation date 30/10/2018
	 */
	public void selectServiceMethodType(String serviceMethodeType) {
		selectFromDropdown(drpServiceMethodeType, serviceMethodeType);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal productName
	 *         field
	 * @param productName
	 * @creation date 30/10/2018
	 */

	public void sendTextInProductName(String productName) {
		clearAndSendTextInTextBox(txtProductName, productName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal
	 *         productType from radio button click
	 * @param productType
	 * @creation date 30/10/2018
	 */
	public void selectProductType(String productType) {
		clickOnElement(By.xpath("//label[normalize-space(text())='" + productType + "']"));
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal description
	 *         field
	 * @param description
	 * @creation date 30/10/2018
	 */

	public void sendTextInDescription(String description) {
		clearAndSendTextInTextBox(txtDescription, description);
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         allowMinorCurrency
	 * @param allowMinorCurrency
	 * @creation date 30/10/2018
	 */
	public void selectaAllowMinorCurrency(String allowMinorCurrency) {
		if (allowMinorCurrency.equalsIgnoreCase(IsYes)) {
			clickOnElement(By.xpath(
					"//label[normalize-space(text())='Allow Minor Currency']//following :: *[contains(@class,'bootstrap-switch-id-MinorCurrency')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         allowRefund
	 * @param allowRefund
	 * @creation date 30/10/2018
	 */
	public void selectAllowRefund(String allowRefund) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='Allow Refund']//following-sibling::div//div[contains(@class,'switch-on')]")))
			allowRefundStatus  = true;
		if (allowRefund.equalsIgnoreCase(IsYes)) {
			if(!allowRefundStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='Allow Refund']//following :: *[contains(@class,'bootstrap-switch-id-AllowRefund')]"));
		}else{
			if(allowRefundStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='Allow Refund']//following :: *[contains(@class,'bootstrap-switch-id-AllowRefund')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         fromCommission
	 * @param fromCommission
	 * @creation date 30/10/2018
	 */
	public void clickOnFromCommission(String fromCommission) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='From Commission']//following :: *[contains(@class,'bootstrap-switch-id-FromCommissionRef') and contains(@class,'switch-on')]"), false))
			fromCommissionStatus  = true;
		if (fromCommission.equalsIgnoreCase(IsYes)) {
			if(!fromCommissionStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='From Commission']//following :: *[contains(@class,'bootstrap-switch-id-FromCommissionRef')]"));
		}else{
			if(fromCommissionStatus)
				clickOnElement(By.xpath(
						"//label[normalize-space(text())='From Commission']//following :: *[contains(@class,'bootstrap-switch-id-FromCommissionRef')]"));

		}
	}

	/**
	 * @author kutbuddin.compounder select radio button to Product Internal
	 *         toCommission
	 * @param toCommission
	 * @creation date 21/12/2018
	 */
	public void clickOnToCommission(String toCommission) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='To Commission']//following :: *[contains(@class,'bootstrap-switch-id-ToCommissionRef') and contains(@class,'switch-on')]"), false))
			toCommissionStatus  = true;
		if (toCommission.equalsIgnoreCase(IsYes)) {
			if(!toCommissionStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='To Commission']//following :: *[contains(@class,'bootstrap-switch-id-ToCommissionRef')]"));
		}else{
			if(toCommissionStatus)
				clickOnElement(By.xpath(
						"//label[normalize-space(text())='To Commission']//following :: *[contains(@class,'bootstrap-switch-id-ToCommissionRef')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         fromSurcharge
	 * @param fromSurcharge
	 * @creation date 30/10/2018
	 */
	public void clickOnFromSurcharge(String fromSurcharge) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='From Surcharge']//following :: *[contains(@class,'bootstrap-switch-id-FromSurcharge') and contains(@class,'switch-on')]"), false))
			fromSurchargeStatus  = true;
		if (fromSurcharge.equalsIgnoreCase(IsYes)) {
			if(!fromSurchargeStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='From Surcharge']//following :: *[contains(@class,'bootstrap-switch-id-FromSurcharge')]"));
		}else{
			if(fromSurchargeStatus)
				clickOnElement(By.xpath(
						"//label[normalize-space(text())='From Surcharge']//following :: *[contains(@class,'bootstrap-switch-id-FromSurcharge')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button to Product Internal
	 *         toSurcharge
	 * @param toSurcharge
	 * @creation date 21/12/2018
	 */
	public void clickOnToSurcharge(String toSurcharge) {
		if (toSurcharge.equalsIgnoreCase(IsYes)) {
			clickOnElement(By.xpath(
					"//label[normalize-space(text())='To Surcharge']//following :: *[contains(@class,'bootstrap-switch-id-ToSurcharge')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         fromTax
	 * @param fromTax
	 * @creation date 21/12/2018
	 */
	public void clickOnFromTax(String fromTax) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='To Surcharge']//following :: *[contains(@class,'bootstrap-switch-id-ToSurcharge') and contains(@class,'switch-on')]"), false))
			fromtaxStatus  = true;
		if (fromTax.equalsIgnoreCase(IsYes)) {
			if(!fromtaxStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='From Tax']//following :: *[contains(@class,'bootstrap-switch-id-FromTax')]"));
		}else{
			if(fromtaxStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='From Tax']//following :: *[contains(@class,'bootstrap-switch-id-FromTax')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button to Product Internal
	 *         toTax
	 * @param toTax
	 * @creation date 21/12/2018
	 */
	public void clickOnToTax(String toTax) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='To Tax']//following :: *[contains(@class,'bootstrap-switch-id-ToTax') and contains(@class,'switch-on')]"), false))
			toTaxStatus  = true;
		if (toTax.equalsIgnoreCase(IsYes)) {
			if(!toTaxStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='To Tax']//following :: *[contains(@class,'bootstrap-switch-id-ToTax')]"));
		}else{
			if(toTaxStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='To Tax']//following :: *[contains(@class,'bootstrap-switch-id-ToTax')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal
	 *         refundApprover drop down
	 * @param refundApprover
	 * @creation date 30/10/2018
	 */
	public void selectrefundApprover(String refundApprover) {
		selectFromDropdown(drprefundApprover, refundApprover);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal status
	 *         drop down
	 * @param status
	 * @creation date 30/10/2018
	 */
	public void selectStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal MinAmount
	 *         field
	 * @param MinAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMinAmount(String MinAmount) {
		clearAndSendTextInTextBox(txtMinAmount, MinAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal MaxAmount
	 *         field
	 * @param MaxAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMaxAmount(String MaxAmount) {
		clearAndSendTextInTextBox(txtMaxAmount, MaxAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal MinAmount
	 *         field
	 * @param MinAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMinAmountInEdit(String MinAmount, By element) {
		clearAndSendTextInTextBox(element, MinAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal in edit field
	 * @param parameter
	 * @creation date 30/10/2018
	 */
	public void sendTextInEdit(String parameter, By element) {
		clearAndSendTextInTextBox(element, parameter);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal MaxAmount
	 *         field
	 * @param MaxAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInDenominationDiscription(String denominationDiscription) {
		clearAndSendTextInTextBox(txtdenominationDiscription, denominationDiscription);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal emailAccount
	 *         field
	 * @param emailAccount
	 * @creation date 30/10/2018
	 */
	public void selectEmailAccount(String emailAccount) {
		selectFromDropdown(drpEmailId, emailAccount);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal SmsAccount field
	 * @param SmsAccount
	 * @creation date 30/10/2018
	 */
	public void selectSmsAccount(String SmsAccount) {
		selectFromDropdown(drpSmsId, SmsAccount);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal FcmAccount field
	 * @param FcmAccount
	 * @creation date 30/10/2018
	 */
	public void selectFcmAccount(String FcmAccount) {
		selectFromDropdown(drpFcmId, FcmAccount);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal
	 *         dynamicEmailVaribles field
	 * @param dynamicEmailVaribles
	 * @creation date 30/10/2018
	 */
	public void selectEmailDynamicVaribles(String dynamicEmailVaribles) {
		selectFromDropdown(drpEmailVariableName, dynamicEmailVaribles);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal
	 *         dynamicSmsVaribles field
	 * @param dynamicSmsVaribles
	 * @creation date 30/10/2018
	 */
	public void selectSmsDynamicVaribles(String dynamicSmsVaribles) {
		selectFromDropdown(drpSMSVariableName, dynamicSmsVaribles);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal
	 *         dynamicFcmVaribles field
	 * @param dynamicFcmVaribles
	 * @creation date 30/10/2018
	 */
	public void selectFcmDynamicVaribles(String dynamicFcmVaribles) {
		selectFromDropdown(drpFCMVariableName, dynamicFcmVaribles);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal emailSubject
	 *         field
	 * @param emailSubject
	 * @creation date 30/10/2018
	 */
	public void sendTextInEmailFromSubject(String emailFromSubject) {
		clearAndSendTextInTextBox(txtEmailFromSubject, emailFromSubject);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal emailSubject
	 *         field
	 * @param emailToSubject
	 * @creation date 30/10/2018
	 */
	public void sendTextInEmailToSubject(String emailToSubject) {
		clearAndSendTextInTextBox(txtEmailToSubject, emailToSubject);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal emailFromBody
	 *         field
	 * @param emailFromBody
	 * @creation date 30/10/2018
	 */
	public void sendTextInEmailFromBody(String emailFromBody) {
		clearAndSendTextInTextBox(txtEmailFromBody, emailFromBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal emailToBody
	 *         field
	 * @param emailToBody
	 * @creation date 30/10/2018
	 */
	public void sendTextInEmailToBody(String emailToBody) {
		clearAndSendTextInTextBox(txtEmailToBody, emailToBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal smsFromBody
	 *         field
	 * @param smsFromBody
	 * @creation date 30/10/2018
	 */
	public void sendTextInSmsFromBody(String smsFromBody) {
		clearAndSendTextInTextBox(txtSmsFromBody, smsFromBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal smsToBody
	 *         field
	 * @param smsToBody
	 * @creation date 30/10/2018
	 */
	public void sendTextInSmsToBody(String smsToBody) {
		clearAndSendTextInTextBox(txtSmsToBody, smsToBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal fcmFromBody
	 *         field
	 * @param fcmFromBody
	 * @creation date 30/10/2018
	 */
	public void sendTextInFcmFromBody(String fcmFromBody) {
		clearAndSendTextInTextBox(txtFcmFromBody, fcmFromBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal fcmToBody
	 *         field
	 * @param fcmToBody
	 * @creation date 30/10/2018
	 */
	public void sendTextInFcmToBody(String fcmToBody) {
		clearAndSendTextInTextBox(txtFcmToBody, fcmToBody);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal
	 *         dynamicEmailVaribles field
	 * @param dynamicEmailVaribles
	 * @creation date 30/10/2018
	 */
	public void selectRefundEmailDynamicVaribles(String dynamicEmailVaribles) {
		selectFromDropdown(drpRefundEmailVariableName, dynamicEmailVaribles);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal
	 *         dynamicSmsVaribles field
	 * @param dynamicSmsVaribles
	 * @creation date 30/10/2018
	 */
	public void selectRefundSmsDynamicVaribles(String dynamicSmsVaribles) {
		selectFromDropdown(drpRefundSMSVariableName, dynamicSmsVaribles);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal
	 *         dynamicFcmVaribles field
	 * @param dynamicFcmVaribles
	 * @creation date 30/10/2018
	 */
	public void selectRefundFcmDynamicVaribles(String dynamicFcmVaribles) {
		selectFromDropdown(drpRefundFCMVariableName, dynamicFcmVaribles);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal emailSubject
	 *         field
	 * @param emailSubject
	 * @creation date 30/10/2018
	 */
	public void sendTextRefundInEmailFromSubject(String emailFromSubject) {
		clearAndSendTextInTextBox(txtRefundEmailFromSubject, emailFromSubject);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal emailSubject
	 *         field
	 * @param emailToSubject
	 * @creation date 30/10/2018
	 */
	public void sendTextRefundInEmailToSubject(String emailToSubject) {
		clearAndSendTextInTextBox(txtRefundEmailToSubject, emailToSubject);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal emailFromBody
	 *         field
	 * @param emailFromBody
	 * @creation date 30/10/2018
	 */
	public void sendTextRefundInEmailFromBody(String emailFromBody) {
		clearAndSendTextInTextBox(txtRefundEmailFromBody, emailFromBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal emailToBody
	 *         field
	 * @param emailToBody
	 * @creation date 30/10/2018
	 */
	public void sendTextRefundInEmailToBody(String emailToBody) {
		clearAndSendTextInTextBox(txtRefundEmailToBody, emailToBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal smsFromBody
	 *         field
	 * @param smsFromBody
	 * @creation date 30/10/2018
	 */
	public void sendTextRefundInSmsFromBody(String smsFromBody) {
		clearAndSendTextInTextBox(txtRefundSmsFromBody, smsFromBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal smsToBody
	 *         field
	 * @param smsToBody
	 * @creation date 30/10/2018
	 */
	public void sendTextRefundInSmsToBody(String smsToBody) {
		clearAndSendTextInTextBox(txtRefundSmsToBody, smsToBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal fcmFromBody
	 *         field
	 * @param fcmFromBody
	 * @creation date 30/10/2018
	 */
	public void sendTextRefundInFcmFromBody(String fcmFromBody) {
		clearAndSendTextInTextBox(txtRefundFcmFromBody, fcmFromBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal fcmToBody
	 *         field
	 * @param fcmToBody
	 * @creation date 30/10/2018
	 */
	public void sendTextRefundInFcmToBody(String fcmToBody) {
		clearAndSendTextInTextBox(txtRefundFcmToBody, fcmToBody);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Internal
	 *         emailAccount field
	 * @param emailAccount
	 * @creation date 30/10/2018
	 */
	public void selectRefundEmailAccount(String emailAccount) {
		selectFromDropdown(drpRefundEmailId, emailAccount);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Internal SmsAccount
	 *         field
	 * @param SmsAccount
	 * @creation date 30/10/2018
	 */
	public void selectRefundSmsAccount(String SmsAccount) {
		selectFromDropdown(drpRefundSmsId, SmsAccount);
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         fromChargeType
	 * @param fromChargeType
	 * @creation date 30/10/2018
	 */
	public void selectFromChargeType(String fromChargeType) {
		if (fromChargeType.equalsIgnoreCase(IsPercentageSign)) {
			clickOnElement(selectFromChargeType);
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         toChargeType
	 * @param toChargeType
	 * @creation date 30/10/2018
	 */
	public void selectToChargeType(String toChargeType) {
		if (toChargeType.equalsIgnoreCase(IsPercentageSign)) {
			clickOnElement(selectToChargeType);
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         fromCommissionType
	 * @param fromCommissionType
	 * @creation date 30/10/2018
	 */
	public void selectFromCommissionType(String fromCommissionType) {
		if (fromCommissionType.equalsIgnoreCase(IsPercentageSign)) {
			clickOnElement(selectFromCommissionType);
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Internal
	 *         toCommissionType
	 * @param toCommissionType
	 * @creation date 30/10/2018
	 */
	public void selectToCommissionType(String toCommissionType) {
		if (toCommissionType.equalsIgnoreCase(IsPercentageSign)) {
			clickOnElement(selectToCommissionType);
		}
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal toChargeValue
	 *         field
	 * @param toChargeValue
	 * @creation date 30/10/2018
	 */
	public void sendTextToChargeValue(String toChargeValue) {
		clearAndSendTextInTextBox(txtToChargeValue, toChargeValue);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         fromChargeValue field
	 * @param fromChargeValue
	 * @creation date 30/10/2018
	 */
	public void sendTextFromChargeValue(String fromChargeValue) {
		clearAndSendTextInTextBox(txtFromChargeValue, fromChargeValue);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         toCommissionValue field
	 * @param toCommissionValue
	 * @creation date 30/10/2018
	 */
	public void sendTextToCommissionValue(String toCommissionValue) {
		clearAndSendTextInTextBox(txtToCommissionValue, toCommissionValue);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         fromCommissionValue field
	 * @param fromCommissionValue
	 * @creation date 30/10/2018
	 */
	public void sendTextFromCommissionValue(String fromCommissionValue) {
		clearAndSendTextInTextBox(txtFromCommissionValue, fromCommissionValue);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Internal FcmAccount
	 *         field
	 * @param FcmAccount
	 * @creation date 30/10/2018
	 */
	public void selectRefundFcmAccount(String FcmAccount) {
		selectFromDropdown(drpRefundFcmId, FcmAccount);
	}

	/**
	 * @author kutbuddin.compounder click on add demonation button
	 * @param endDate
	 * @creation date 30/10/2018
	 */
	public void clickOnaddBtn() {
		clickOnElement(addbtn);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         nonKycDailyCount field
	 * @param nonKycDailyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycDailyCount(String nonKycDailyCount) {
		clearAndSendTextInTextBox(txtNonKycDailyCount, nonKycDailyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         nonKycDailyAmount field
	 * @param nonKycDailyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycDailyAmount(String nonKycDailyAmount) {
		clearAndSendTextInTextBox(txtNonKycDailyAmount, nonKycDailyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         mediumKycDailyCount field
	 * @param mediumKycDailyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycDailyCount(String mediumKycDailyCount) {
		clearAndSendTextInTextBox(txtMediumKycDailyCount, mediumKycDailyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         mediumKycDailyAmount field
	 * @param mediumKycDailyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycDailyAmount(String mediumKycDailyAmount) {
		clearAndSendTextInTextBox(txtMediumKycDailyAmount, mediumKycDailyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         fullKycDailyCount field
	 * @param fullKycDailyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycDailyCount(String fullKycDailyCount) {
		clearAndSendTextInTextBox(txtFullKycDailyCount, fullKycDailyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         fullKycDailyAmount field
	 * @param fullKycDailyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycDailyAmount(String fullKycDailyAmount) {
		clearAndSendTextInTextBox(txtFullKycDailyAmount, fullKycDailyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         nonKycWeeklyCount field
	 * @param nonKycWeeklyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycWeeklyCount(String nonKycWeeklyCount) {
		clearAndSendTextInTextBox(txtNonKycWeeklyCount, nonKycWeeklyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         nonKycWeeklyAmount field
	 * @param nonKycWeeklyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycWeeklyAmount(String nonKycWeeklyAmount) {
		clearAndSendTextInTextBox(txtNonKycWeeklyAmount, nonKycWeeklyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         mediumKycWeeklyCount field
	 * @param mediumKycWeeklyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycWeeklyCount(String mediumKycWeeklyCount) {
		clearAndSendTextInTextBox(txtMediumKycWeeklyCount, mediumKycWeeklyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         mediumKycWeeklyAmount field
	 * @param mediumKycWeeklyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycWeeklyAmount(String mediumKycWeeklyAmount) {
		clearAndSendTextInTextBox(txtMediumKycWeeklyAmount, mediumKycWeeklyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         fullKycWeeklyCount field
	 * @param fullKycWeeklyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycWeeklyCount(String fullKycWeeklyCount) {
		clearAndSendTextInTextBox(txtFullKycWeeklyCount, fullKycWeeklyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         fullKycWeeklyAmount field
	 * @param fullKycWeeklyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycWeeklyAmount(String fullKycWeeklyAmount) {
		clearAndSendTextInTextBox(txtFullKycWeeklyAmount, fullKycWeeklyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         nonKycMonthlyCount field
	 * @param nonKycMonthlyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycMonthlyCount(String nonKycMonthlyCount) {
		clearAndSendTextInTextBox(txtNonKycMonthlyCount, nonKycMonthlyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         nonKycMonthlyAmount field
	 * @param nonKycMonthlyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInNonKycMonthlyAmount(String nonKycMonthlyAmount) {
		clearAndSendTextInTextBox(txtNonKycMonthlyAmount, nonKycMonthlyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         mediumKycMonthlyCount field
	 * @param mediumKycMonthlyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycMonthlyCount(String mediumKycMonthlyCount) {
		clearAndSendTextInTextBox(txtMediumKycMonthlyCount, mediumKycMonthlyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         mediumKycMonthlyAmount field
	 * @param mediumKycMonthlyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInMediumKycMonthlyAmount(String mediumKycMonthlyAmount) {
		clearAndSendTextInTextBox(txtMediumKycMonthlyAmount, mediumKycMonthlyAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         fullKycMonthlyCount field
	 * @param fullKycMonthlyCount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycMonthlyCount(String fullKycMonthlyCount) {
		clearAndSendTextInTextBox(txtFullKycMonthlyCount, fullKycMonthlyCount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal
	 *         fullKycMonthlyAmount field
	 * @param fullKycMonthlyAmount
	 * @creation date 30/10/2018
	 */
	public void sendTextInFullKycMonthlyAmount(String fullKycMonthlyAmount) {
		clearAndSendTextInTextBox(txtFullKycMonthlyAmount, fullKycMonthlyAmount);
	}

	/**
	 * @author kutbuddin.compounder to click on edit product button denom info
	 * @param element
	 * @creation date 16/10/2018
	 */
	public void clickOnEditDenom() {
		clickOnElement(btnEditDenom);
	}

	/**
	 * @author kutbuddin.compounder To click on denom save button
	 * @creation date 05/11/2018
	 */
	public void clickOndenomSave() {
		clickOnElement(btnEditDenomSave);
	}

	/**
	 * @author kutbuddin.compounder select in Product Internal moduleName field
	 * @param moduleName
	 * @creation date 30/10/2018
	 */
	public void selectInServiceNameInFilterSearch(String serviceName) {
		selectFromDropdown(drpServieNameSearch, serviceName);
	}

	/**
	 * @author kutbuddin.compounder select value in Product Internal serviceName
	 *         from dropdown
	 * @param serviceName
	 * @creation date 30/10/2018
	 */
	public void selectServiceTypeInFilterSearch(String serviceType) {
		selectFromDropdown(drpServiceTypeSearch, serviceType);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal productCode
	 *         from dropdown
	 * @param productCode
	 * @creation date 30/10/2018
	 */
	public void sendFromNameTextInFilterSearch(String FromName) {
		clearAndSendTextInTextBox(txtSearchFromName, FromName);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal productCode
	 *         from dropdown
	 * @param productCode
	 * @creation date 30/10/2018
	 */
	public void sendToNameTextInFilterSearch(String toName) {
		clearAndSendTextInTextBox(txtSearchToName, toName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal status
	 *         drop down
	 * @param statusSearch
	 * @creation date 30/10/2018
	 */
	public void selectStatusInFilterSearch(String statusSearch) {
		selectFromDropdown(drpStatusSearch, statusSearch);
	}

	/**
	 * @author kutbuddin.compounder to click on edit product button info
	 * @creation date 16/10/2018
	 */
	public void clickOnEditBtnProductInfo() {
		clickOnElement(buttonEditProductInfo);
	}

	/**
	 * @author kutbuddin.compounder click on log Button icon
	 * @creation date 13/12/2018
	 */
	public void clickOnInternalLogBtn(By webelement) {
		clickOnElement(webelement);
	}

	/**
	 * @author kutbuddin.compounder @ Verify Log Denom Pagination
	 * @creation date 13/12/2018
	 */
	public boolean verifyLogInternalProductsPagination(By webelement) {
		return verifyElement(webelement, false);
	}

	/**
	 * @author kutbuddin.compounder
	 * @param str1,str2,str3,str4,str5,str6
	 * @creation date 3/12/2018
	 */
	public void filterSearch(String str1, String str2, String str3) {
		commonFilterSearch();
		selectServiceTypeInFilterSearch(str1);
		// String[] Services=str2.trim().split(" ");
		selectInServiceNameInFilterSearch(str2);
		/*
		 * sendFromNameTextInFilterSearch(Services[0]);
		 * sendToNameTextInFilterSearch(Services[2]);
		 */
		selectStatusInFilterSearch(str3);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder to add Product Internal
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public void clickOnDenomBtn(By WebElement) {
		clickOnElement(WebElement);
	}

	/*
	 * public void verifyRecordGrid(Map<Object, Object> map, List<Object>
	 * mapKeys) { pagination("100"); if
	 * (verifyElement(By.xpath("(//td[text()='"+
	 * map.get(getMapKeys(map).get(1)).toString()+"'])[1]"), false)) {
	 * filterSearch(map.get(getMapKeys(map).get(0)).toString(),
	 * map.get(getMapKeys(map).get(1)).toString(),map.get(getMapKeys(map).get(3)
	 * ). toString()); List<String> ColumnData = getColumnData("Service Name");
	 * int length=ColumnData.size(); for(int i=0;i<length;i++) { if
	 * (verifyElement(By.xpath("(//td[text()='" +
	 * map.get(getMapKeys(map).get(1)).toString() + "'])["+(i+1)+"]"), false)) {
	 * clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString()); Boolean
	 * var=verifyInternalAlreadyAdded(map, getMapKeys(map)); clickOnBackBtn();
	 * if(var==false) { addInternalProduct(map, getMapKeys(map)); } } } } else {
	 * addInternalProduct(map, getMapKeys(map)); } }
	 */
	public void addInternalProduct(Map<Object, Object> map, List<Object> mapKeys) {
		pagination(100);
		/*
		 * int serviceCount = 0; String serviceCode = ""; String service[] =
		 * map.get(getMapKeys(map).get(1)).toString().split("-"); for(int
		 * i=0;i<service.length;i++) { if(serviceCount!=service.length-1)
		 * serviceCode = serviceCode
		 * +map.get(getMapKeys(map).get(1)).toString().split("-")[i+1] + "-";
		 * serviceCount++; }
		 */
		String serviceCode = map.get(getMapKeys(map).get(46)).toString();
		if (!verifyElement(By.xpath("(//td[text()='" + serviceCode + "'])[1]"))) {
			clickOnAddBtn();
			selectServiceMethodType(map.get(mapKeys.get(0)).toString());
			commonWait();
			selectserviceMethodName(map.get(mapKeys.get(1)).toString());
			commonWait();
			if (!map.get(mapKeys.get(2)).toString().isEmpty()) {
				selectAllowRefund(map.get(mapKeys.get(2)).toString());
			}
			if (map.get(mapKeys.get(4)).toString().equalsIgnoreCase(IsYes)) {
				if (!map.get(mapKeys.get(4)).toString().isEmpty()) {
					clickOnFromCommission(map.get(mapKeys.get(4)).toString());
				}
				if (!map.get(mapKeys.get(5)).toString().isEmpty()) {
					clickOnToCommission(map.get(mapKeys.get(5)).toString());
				}
				if (!map.get(mapKeys.get(6)).toString().isEmpty()) {
					clickOnFromSurcharge(map.get(mapKeys.get(6)).toString());
				}
				if (!map.get(mapKeys.get(7)).toString().isEmpty()) {
					clickOnToSurcharge(map.get(mapKeys.get(7)).toString());
				}
			}
			if (map.get(mapKeys.get(43)).toString().equalsIgnoreCase(IsYes)) {
				if (!map.get(mapKeys.get(43)).toString().isEmpty()) {
					clickOnFromTax(map.get(mapKeys.get(43)).toString());
				}
				if (!map.get(mapKeys.get(44)).toString().isEmpty()) {
					clickOnToTax(map.get(mapKeys.get(44)).toString());
				}
				if (!map.get(mapKeys.get(8)).toString().isEmpty()) {
					selectrefundApprover(map.get(mapKeys.get(8)).toString());
				}
			}
			selectStatus(map.get(mapKeys.get(3)).toString());
			if (!map.get(mapKeys.get(45)).toString().isEmpty()) {
				String taxtion[] = map.get(mapKeys.get(45)).toString().split(",");
				for (int i = 0; i < taxtion.length; i++) {
					By clickTaxtion = By.xpath("(//label[normalize-space(text())='" + taxtion[i]
							+ "']//following :: *[contains(@class,'bootstrap-switch-id-tax')])[1]");
					clickOnTaxation(clickTaxtion);
				}
			}
			clickOnNextBtn();
			if (verifyToolTip()) {
				clickOnCancelBtn();
			} else {
				if (!map.get(mapKeys.get(12)).toString().isEmpty()) {
					String[] minAmounts = map.get(mapKeys.get(10)).toString().split(",");
					String[] maxAmounts = map.get(mapKeys.get(11)).toString().split(",");
					String[] fromchargeTypes = map.get(mapKeys.get(12)).toString().split(",");
					String[] tochargeTypes = map.get(mapKeys.get(14)).toString().split(",");
					String[] chargeFrom = map.get(mapKeys.get(13)).toString().split(",");
					String[] chargeTo = map.get(mapKeys.get(15)).toString().split(",");
					String[] fromcommisionTypes = map.get(mapKeys.get(16)).toString().split(",");
					String[] tocommisionTypes = map.get(mapKeys.get(18)).toString().split(",");
					String[] commissionFrom = map.get(mapKeys.get(17)).toString().split(",");
					String[] commissionTo = map.get(mapKeys.get(19)).toString().split(",");
					int row = minAmounts.length;
					for (int i = 0; i < minAmounts.length; i++) {
						if (i == 0) {
							sendTextInMinAmount(minAmounts[i]);
						}
						sendTextInMaxAmount(maxAmounts[i]);
						selectFromChargeType(fromchargeTypes[i]);
						sendTextFromChargeValue(chargeFrom[i]);
						selectToChargeType(tochargeTypes[i]);
						sendTextToChargeValue(chargeTo[i]);
						selectFromCommissionType(fromcommisionTypes[i]);
						sendTextFromCommissionValue(commissionFrom[i]);
						selectToCommissionType(tocommisionTypes[i]);
						sendTextToCommissionValue(commissionTo[i]);
						if (i < row - 1) {
							clickOnaddBtn();
						}
					}
					clickOnNextBtn();
					if (!map.get(mapKeys.get(24)).toString().isEmpty()) {
						String[] nonKyctransactionCount = map.get(mapKeys.get(20)).toString().split(":");
						String[] nonKyctransactionValue = map.get(mapKeys.get(21)).toString().split(":");
						String[] mediumKyctransactionCount = map.get(mapKeys.get(22)).toString().split(":");
						String[] mediumKyctransactionValue = map.get(mapKeys.get(23)).toString().split(":");
						String[] fullKyctransactionCount = map.get(mapKeys.get(24)).toString().split(":");
						String[] fullKyctransactionValue = map.get(mapKeys.get(25)).toString().split(":");
						if (verifyElement(txtLblNonKyc)) {
							sendTextInNonKycDailyCount(nonKyctransactionCount[0]);
							sendTextInNonKycDailyAmount(nonKyctransactionValue[0]);
							sendTextInNonKycWeeklyCount(nonKyctransactionCount[1]);
							sendTextInNonKycWeeklyAmount(nonKyctransactionValue[1]);
							sendTextInNonKycMonthlyCount(nonKyctransactionCount[2]);
							sendTextInNonKycMonthlyAmount(nonKyctransactionValue[2]);
						}
						if (verifyElement(txtLblMediumKyc)) {
							sendTextInMediumKycDailyCount(mediumKyctransactionCount[0]);
							sendTextInMediumKycDailyAmount(mediumKyctransactionValue[0]);
							sendTextInMediumKycWeeklyCount(mediumKyctransactionCount[1]);
							sendTextInMediumKycWeeklyAmount(mediumKyctransactionValue[1]);
							sendTextInMediumKycMonthlyCount(mediumKyctransactionCount[2]);
							sendTextInMediumKycMonthlyAmount(mediumKyctransactionValue[2]);
						}
						if (verifyElement(txtLblFullKyc)) {
							sendTextInFullKycDailyCount(fullKyctransactionCount[0]);
							sendTextInFullKycDailyAmount(fullKyctransactionValue[0]);
							sendTextInFullKycWeeklyCount(fullKyctransactionCount[1]);
							sendTextInFullKycWeeklyAmount(fullKyctransactionValue[1]);
							sendTextInFullKycMonthlyCount(fullKyctransactionCount[2]);
							sendTextInFullKycMonthlyAmount(fullKyctransactionValue[2]);
						}
						clickOnNextBtn();
					}
				} else {
					String[] minAmounts = map.get(mapKeys.get(10)).toString().split(",");
					String[] maxAmounts = map.get(mapKeys.get(11)).toString().split(",");
					int row = minAmounts.length;
					for (int i = 0; i < minAmounts.length; i++) {
						if (i == 0) {
							sendTextInMinAmount(minAmounts[i]);
						}
						sendTextInMaxAmount(maxAmounts[i]);
						if (i < row - 1) {
							clickOnaddBtn();
						}
					}
					clickOnNextBtn();
					if (!map.get(mapKeys.get(24)).toString().isEmpty()) {
						String[] nonKyctransactionCount = map.get(mapKeys.get(20)).toString().split(":");
						String[] nonKyctransactionValue = map.get(mapKeys.get(21)).toString().split(":");
						String[] mediumKyctransactionCount = map.get(mapKeys.get(22)).toString().split(":");
						String[] mediumKyctransactionValue = map.get(mapKeys.get(23)).toString().split(":");
						String[] fullKyctransactionCount = map.get(mapKeys.get(24)).toString().split(":");
						String[] fullKyctransactionValue = map.get(mapKeys.get(25)).toString().split(":");
						if (verifyElement(txtLblNonKyc)) {
							sendTextInNonKycDailyCount(nonKyctransactionCount[0]);
							sendTextInNonKycDailyAmount(nonKyctransactionValue[0]);
							sendTextInNonKycWeeklyCount(nonKyctransactionCount[1]);
							sendTextInNonKycWeeklyAmount(nonKyctransactionValue[1]);
							sendTextInNonKycMonthlyCount(nonKyctransactionCount[2]);
							sendTextInNonKycMonthlyAmount(nonKyctransactionValue[2]);
						}
						if (verifyElement(txtLblMediumKyc)) {
							sendTextInMediumKycDailyCount(mediumKyctransactionCount[0]);
							sendTextInMediumKycDailyAmount(mediumKyctransactionValue[0]);
							sendTextInMediumKycWeeklyCount(mediumKyctransactionCount[1]);
							sendTextInMediumKycWeeklyAmount(mediumKyctransactionValue[1]);
							sendTextInMediumKycMonthlyCount(mediumKyctransactionCount[2]);
							sendTextInMediumKycMonthlyAmount(mediumKyctransactionValue[2]);
						}
						if (verifyElement(txtLblFullKyc)) {
							sendTextInFullKycDailyCount(fullKyctransactionCount[0]);
							sendTextInFullKycDailyAmount(fullKyctransactionValue[0]);
							sendTextInFullKycWeeklyCount(fullKyctransactionCount[1]);
							sendTextInFullKycWeeklyAmount(fullKyctransactionValue[1]);
							sendTextInFullKycMonthlyCount(fullKyctransactionCount[2]);
							sendTextInFullKycMonthlyAmount(fullKyctransactionValue[2]);
						}
						clickOnNextBtn();
					} 
				}
				if (!map.get(mapKeys.get(26)).toString().isEmpty()) {
					selectEmailAccount(map.get(mapKeys.get(26)).toString());
					sendTextInEmailFromSubject(map.get(mapKeys.get(27)).toString());
					sendTextInEmailFromBody(map.get(mapKeys.get(30)).toString());
					sendTextInEmailToSubject(map.get(mapKeys.get(31)).toString());
					sendTextInEmailToBody(map.get(mapKeys.get(32)).toString());
					selectSmsAccount(map.get(mapKeys.get(33)).toString());
					sendTextInSmsFromBody(map.get(mapKeys.get(36)).toString());
					sendTextInSmsToBody(map.get(mapKeys.get(37)).toString());
					selectFcmAccount(map.get(mapKeys.get(38)).toString());
					sendTextInFcmFromBody(map.get(mapKeys.get(41)).toString());
					sendTextInFcmToBody(map.get(mapKeys.get(42)).toString());
				}
				if (map.get(mapKeys.get(2)).toString().equalsIgnoreCase(IsYes)) {
					clickOnNextBtn();
					if (!map.get(mapKeys.get(26)).toString().isEmpty()) {
						selectRefundEmailAccount(map.get(mapKeys.get(26)).toString());
						sendTextRefundInEmailFromSubject(map.get(mapKeys.get(27)).toString());
						sendTextRefundInEmailFromBody(map.get(mapKeys.get(30)).toString());
						sendTextRefundInEmailToSubject(map.get(mapKeys.get(31)).toString());
						sendTextRefundInEmailToBody(map.get(mapKeys.get(32)).toString());
						// selectRefundSmsAccount(map.get(mapKeys.get(33)).toString());
						// sendTextRefundInSmsFromBody(map.get(mapKeys.get(36)).toString());
						// sendTextRefundInSmsToBody(map.get(mapKeys.get(37)).toString());
						selectRefundFcmAccount(map.get(mapKeys.get(38)).toString());
						sendTextRefundInFcmFromBody(map.get(mapKeys.get(41)).toString());
						sendTextRefundInFcmToBody(map.get(mapKeys.get(42)).toString());
						clickOnSaveBtn();
					} else {
						clickOnSaveBtn();
					}
				} else {
					clickOnSaveBtn();
				}
			}
		}
	}

	/**
	 * @author kutbuddin.compounder to Edit Product Internal
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public void editProductInternal(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(3)).toString());
		String serviceCode = map.get(getMapKeys(map).get(45)).toString();
		if (verifyElement(By.xpath("(//td[text()='" + serviceCode + "'])[1]"))) {
			clickOnInfoBtn(serviceCode);
			clickOnEditBtn();
			String[] NavigationMenu = map.get(mapKeys.get(44)).toString().trim().split(",");
			clickOnNavigationMenu(NavigationMenu[0]);
			if (!map.get(mapKeys.get(2)).toString().isEmpty()) {
				selectAllowRefund(map.get(mapKeys.get(2)).toString());
			}
			selectStatus(map.get(mapKeys.get(43)).toString());
			clickOnNavigationMenu(NavigationMenu[1]);
			if (verifyToolTip()) {
				clickOnCancelBtn();
			} else {
				if (!map.get(mapKeys.get(12)).toString().isEmpty()) {
					String[] minAmounts = map.get(mapKeys.get(10)).toString().split(",");
					String[] maxAmounts = map.get(mapKeys.get(11)).toString().split(",");
					// String[] fromchargeTypes =
					// map.get(mapKeys.get(12)).toString().split(",");
					// String[] tochargeTypes =
					// map.get(mapKeys.get(14)).toString().split(",");
					String[] chargeFrom = map.get(mapKeys.get(13)).toString().split(",");
					String[] chargeTo = map.get(mapKeys.get(15)).toString().split(",");
					// String[] fromcommisionTypes =
					// map.get(mapKeys.get(16)).toString().split(",");
					// String[] tocommisionTypes =
					// map.get(mapKeys.get(18)).toString().split(",");
					String[] commissionFrom = map.get(mapKeys.get(17)).toString().split(",");
					String[] commissionTo = map.get(mapKeys.get(19)).toString().split(",");
					for (int i = 0; i < minAmounts.length; i++) {
						By minamount = By.id("MinAmount_" + (i + 1) + "");
						By maxamount = By.id("MaxAmount_" + (i + 1) + "");
						if (i <= 0) {
							sendTextInMinAmountInEdit(minAmounts[i], minamount);
						}
						sendTextInEdit(maxAmounts[i], maxamount);
						By chargeFromvalue = By.id("FromChargeAmount_" + (i + 1) + "");
						By chargeTovalue = By.id("ToChargeAmount_" + (i + 1) + "");
						By commisionFromValue = By.id("FromCommissionAmount_" + (i + 1) + "");
						By commisionToValue = By.id("ToCommissionAmount_" + (i + 1) + "");
						sendTextInEdit(chargeFrom[i], chargeFromvalue);
						sendTextInEdit(chargeTo[i], chargeTovalue);
						sendTextInEdit(commissionFrom[i], commisionFromValue);
						sendTextInEdit(commissionTo[i], commisionToValue);
					}
					clickOnNavigationMenu(NavigationMenu[2]);
					String[] nonKyctransactionCount = map.get(mapKeys.get(20)).toString().split(":");
					String[] nonKyctransactionValue = map.get(mapKeys.get(21)).toString().split(":");
					String[] mediumKyctransactionCount = map.get(mapKeys.get(22)).toString().split(":");
					String[] mediumKyctransactionValue = map.get(mapKeys.get(23)).toString().split(":");
					String[] fullKyctransactionCount = map.get(mapKeys.get(24)).toString().split(":");
					String[] fullKyctransactionValue = map.get(mapKeys.get(25)).toString().split(":");
					if (verifyElement(txtLblNonKyc)) {
						sendTextInNonKycDailyCount(nonKyctransactionCount[0]);
						sendTextInNonKycDailyAmount(nonKyctransactionValue[0]);
						sendTextInNonKycWeeklyCount(nonKyctransactionCount[1]);
						sendTextInNonKycWeeklyAmount(nonKyctransactionValue[1]);
						sendTextInNonKycMonthlyCount(nonKyctransactionCount[2]);
						sendTextInNonKycMonthlyAmount(nonKyctransactionValue[2]);
					}
					if (verifyElement(txtLblMediumKyc)) {
						sendTextInMediumKycDailyCount(mediumKyctransactionCount[0]);
						sendTextInMediumKycDailyAmount(mediumKyctransactionValue[0]);
						sendTextInMediumKycWeeklyCount(mediumKyctransactionCount[1]);
						sendTextInMediumKycWeeklyAmount(mediumKyctransactionValue[1]);
						sendTextInMediumKycMonthlyCount(mediumKyctransactionCount[2]);
						sendTextInMediumKycMonthlyAmount(mediumKyctransactionValue[2]);
					}
					if (verifyElement(txtLblFullKyc)) {
						sendTextInFullKycDailyCount(fullKyctransactionCount[0]);
						sendTextInFullKycDailyAmount(fullKyctransactionValue[0]);
						sendTextInFullKycWeeklyCount(fullKyctransactionCount[1]);
						sendTextInFullKycWeeklyAmount(fullKyctransactionValue[1]);
						sendTextInFullKycMonthlyCount(fullKyctransactionCount[2]);
						sendTextInFullKycMonthlyAmount(fullKyctransactionValue[2]);
					}
				} else {
					String[] minAmounts = map.get(mapKeys.get(10)).toString().split(",");
					String[] maxAmounts = map.get(mapKeys.get(11)).toString().split(",");
					for (int i = 0; i < minAmounts.length; i++) {
						By minamount = By.id("MinAmount_" + (i + 1) + "");
						By maxamount = By.id("MaxAmount_" + (i + 1) + "");
						if (i <= 0) {
							sendTextInMinAmountInEdit(minAmounts[i], minamount);
						}
						sendTextInMinAmountInEdit(maxAmounts[i], maxamount);

					}
				}
				clickOnNavigationMenu(NavigationMenu[3]);
				if (!map.get(mapKeys.get(26)).toString().isEmpty()) {
					selectEmailAccount(map.get(mapKeys.get(26)).toString());
					sendTextInEmailFromSubject(map.get(mapKeys.get(27)).toString());
					// sendTextInEmailFromBody(map.get(mapKeys.get(30)).toString());
					sendTextInEmailToSubject(map.get(mapKeys.get(31)).toString());
					// sendTextInEmailToBody(map.get(mapKeys.get(32)).toString());
					selectSmsAccount(map.get(mapKeys.get(33)).toString());
					sendTextInSmsFromBody(map.get(mapKeys.get(36)).toString());
					sendTextInSmsToBody(map.get(mapKeys.get(37)).toString());
					selectFcmAccount(map.get(mapKeys.get(38)).toString());
					sendTextInFcmFromBody(map.get(mapKeys.get(41)).toString());
					sendTextInFcmToBody(map.get(mapKeys.get(42)).toString());
				}
				if (map.get(mapKeys.get(2)).toString().equalsIgnoreCase(IsYes)) {
					clickOnNavigationMenu(NavigationMenu[4]);
					if (!map.get(mapKeys.get(26)).toString().isEmpty()) {
						selectRefundEmailAccount(map.get(mapKeys.get(26)).toString());
						sendTextRefundInEmailFromSubject(map.get(mapKeys.get(27)).toString());
						// sendTextRefundInEmailFromBody(map.get(mapKeys.get(30)).toString());
						sendTextRefundInEmailToSubject(map.get(mapKeys.get(31)).toString());
						// sendTextRefundInEmailToBody(map.get(mapKeys.get(32)).toString());
						// selectRefundSmsAccount(map.get(mapKeys.get(33)).toString());
						// sendTextRefundInSmsFromBody(map.get(mapKeys.get(36)).toString());
						// sendTextRefundInSmsToBody(map.get(mapKeys.get(37)).toString());
						selectRefundFcmAccount(map.get(mapKeys.get(38)).toString());
						sendTextRefundInFcmFromBody(map.get(mapKeys.get(41)).toString());
						sendTextRefundInFcmToBody(map.get(mapKeys.get(42)).toString());
						clickOnSaveBtn();
					} else {
						clickOnSaveBtn();
					}
				} else {
					clickOnSaveBtn();
				}
			}
		}
	}

	/**
	 * @author kutbuddin.compounder to verify Product Internal added?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 30/10/2018
	 * @return true if Product Internal added successfully
	 */
	public boolean verifyProductInternalAdded(Map<Object, Object> map, List<Object> keys) {
		/*
		 * int serviceCount = 0; String serviceCode = ""; String service[] =
		 * map.get(getMapKeys(map).get(1)).toString().split("-"); for(int
		 * i=0;i<service.length;i++) { if(serviceCount!=service.length-1)
		 * serviceCode = serviceCode
		 * +map.get(getMapKeys(map).get(1)).toString().split("-")[i+1] + "-";
		 * serviceCount++; }
		 */
		String service[] = map.get(getMapKeys(map).get(1)).toString().split("-");
		String serviceCode = map.get(getMapKeys(map).get(46)).toString();
		By serviceNamevalue = By.xpath("//*[normalize-space(text())='Service Name']//following :: *[contains(text(),'"
				+ service[0] + "')][1]");
		By allowRefund = By
				.xpath("//label[normalize-space(text())='Allow Refund']//following-sibling:: div[normalize-space(text()) = '"
						+ map.get(keys.get(2)).toString() + "']");
		By Status = By.xpath("//*[normalize-space(text())='Status']//following :: *[normalize-space(text()) = '"
				+ map.get(keys.get(3)).toString() + "']");

		if ((verifyElement(By.xpath("(//td[text()='" + serviceCode + "'])[1]")))) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
					map.get(getMapKeys(map).get(3)).toString());
			clickOnInfoBtn(serviceCode);
			if (!verifyElement(serviceNamevalue, false))
				return false;
			if (!verifyElement(allowRefund, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			//String[] Services = map.get(keys.get(1)).toString().trim().split(" ");
			if (!map.get(keys.get(13)).toString().isEmpty()) {
				/*String[] chargeFrom = map.get(keys.get(13)).toString().split(",");
				String[] chargeTo = map.get(keys.get(15)).toString().split(",");
				String[] commissionFrom = map.get(keys.get(17)).toString().split(",");
				String[] commissionTo = map.get(keys.get(19)).toString().split(",");
				int count = 0;

				for (int i = chargeFrom.length; i > 0; i--) {
					By charge_from = By.xpath(".//*[@id='denom_row_" + (i) + "']//*[normalize-space(text())='From "
							+ Services[0] + " Charge']//following-sibling::div[contains(text(),'"
							+ chargeFrom[count].trim() + "')]");
					By commission_from = By.xpath(".//*[@id='denom_row_" + (i) + "']//*[normalize-space(text())='From "
							+ Services[0] + " Commission']//following-sibling::div[contains(text(),'"
							+ commissionFrom[count].trim() + "')]");
					By charge_to = By.xpath(".//*[@id='denom_row_" + (i) + "']//*[normalize-space(text())='To "
							+ Services[2] + " Charge']//following-sibling::div[contains(text(),'"
							+ chargeTo[count].trim() + "')]");
					By commission_to = By.xpath(".//*[@id='denom_row_" + (i) + "']//*[normalize-space(text())='To "
							+ Services[2] + " Commission']//following-sibling::div[contains(text(),'"
							+ commissionTo[count].trim() + "')]");
					count++;
					if (!verifyElement(charge_from, false))
						return false;
					if (!verifyElement(commission_from, false))
						return false;
					if (!verifyElement(charge_to, false))
						return false;
					if (!verifyElement(commission_to, false))
						return false;
				}*/

				String[] nonKyctransactionCount = map.get(keys.get(20)).toString().split(":");
				String[] nonKyctransactionValue = map.get(keys.get(21)).toString().split(":");
				String[] mediumKyctransactionCount = map.get(keys.get(22)).toString().split(":");
				String[] mediumKyctransactionValue = map.get(keys.get(23)).toString().split(":");
				String[] fullKyctransactionCount = map.get(keys.get(24)).toString().split(":");
				String[] fullKyctransactionValue = map.get(keys.get(25)).toString().split(":");
				if (!map.get(keys.get(24)).toString().isEmpty()) {
					if (verifyElement(txtLblNonKyc)) {
						By nontc = By
								.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
										+ nonKyctransactionCount[0] + "'])[1]");
						By nonvalue = By
								.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
										+ nonKyctransactionValue[0] + "'])[1]");
						By nontcWeekly = By
								.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
										+ nonKyctransactionCount[1] + "'])[1]");
						By nonvalueWeekly = By
								.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
										+ nonKyctransactionValue[1] + "'])[1]");
						By nontcMonthly = By
								.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
										+ nonKyctransactionCount[2] + "'])[1]");
						By nonvalueMonthly = By
								.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
										+ nonKyctransactionValue[2] + "'])[1]");
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
						By medtc = By
								.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
										+ mediumKyctransactionCount[0] + "'])[1]");
						By medvalue = By
								.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
										+ mediumKyctransactionValue[0] + "'])[1]");
						By medtcWeekly = By
								.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
										+ mediumKyctransactionCount[1] + "'])[1]");
						By medvalueWeekly = By
								.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
										+ mediumKyctransactionValue[1] + "'])[1]");
						By medtcMonthly = By
								.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
										+ mediumKyctransactionCount[2] + "'])[1]");
						By medvalueMonthly = By
								.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
										+ mediumKyctransactionValue[2] + "'])[1]");
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
						By fulltc = By
								.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
										+ fullKyctransactionCount[0] + "'])[1]");
						By fullvalue = By
								.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
										+ fullKyctransactionValue[0] + "'])[1]");
						By fulltcWeekly = By
								.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
										+ fullKyctransactionCount[1] + "'])[1]");
						By fullvalueWeekly = By
								.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
										+ fullKyctransactionValue[1] + "'])[1]");
						By fulltcMonthly = By
								.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
										+ fullKyctransactionCount[2] + "'])[1]");
						By fullvalueMonthly = By
								.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
										+ fullKyctransactionValue[2] + "'])[1]");
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
				}
			}
			if (!map.get(keys.get(26)).toString().isEmpty()) {
				By EmailAccountName = By
						.xpath("(//*[normalize-space(text())='Email Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(26)).toString() + "'])[1]");
				By FcmAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(38)).toString() + "'])[1]");
				By SMSAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(33)).toString() + "'])[1]");
				By refundEmailAccountName = By
						.xpath("(//*[normalize-space(text())='Email Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(26)).toString() + "'])[2]");
				By refundFcmAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(38)).toString() + "'])[2]");
				By refundSMSAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(33)).toString() + "'])[2]");
				By EmailFromSubject = By
						.xpath("(//*[normalize-space(text())='From Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(27)).toString() + "'])[1]");
				By EmailToSubject = By
						.xpath("(//*[normalize-space(text())='To Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(31)).toString() + "'])[1]");
				By refundEmailFromSubject = By
						.xpath("(//*[normalize-space(text())='From Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(27)).toString() + "'])[2]");
				By refundEmailToSubject = By
						.xpath("(//*[normalize-space(text())='To Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(31)).toString() + "'])[2]");
				if (!verifyElement(EmailAccountName, false))
					return false;
				if (!verifyElement(EmailFromSubject, false))
					return false;
				if (!verifyElement(EmailToSubject, false))
					return false;
				if (!verifyElement(FcmAccountName, false))
					return false;
				if (!verifyElement(SMSAccountName, false))
					return false;
				if (map.get(keys.get(2)).toString().equalsIgnoreCase(IsYes)) {
					if (!verifyElement(refundEmailAccountName, false))
						return false;
					if (!verifyElement(refundEmailFromSubject, false))
						return false;
					if (!verifyElement(refundEmailToSubject, false))
						return false;
					if (!verifyElement(refundFcmAccountName, false))
						return false;
					if (!verifyElement(refundSMSAccountName, false))
						return false;
				}
			}
			return true;
		} else
			return false;
	}

	/**
	 * @author kutbuddin.compounder to verify Product Internal edited?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 30/10/2018
	 * @return true if Product Internal edited successfully
	 */
	public boolean verifyProductInternalEdited(Map<Object, Object> map, List<Object> keys) {
		String service[] = map.get(getMapKeys(map).get(1)).toString().split("-");
		String serviceCode = map.get(getMapKeys(map).get(45)).toString();
		By serviceName = By.xpath("//*[normalize-space(text())='Service Name']//following :: *[contains(text(),'"
				+ service[0] + "')][1]");
		By Status = By.xpath("//*[normalize-space(text())='Status']//following :: *[normalize-space(text()) = '"
				+ map.get(keys.get(3)).toString() + "']");
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(3)).toString());
		String[] Services = map.get(keys.get(1)).toString().trim().split(" ");
		if ((verifyElement(By.xpath("(//td[text()='" + serviceCode + "'])[1]"), false))) {
			clickOnInfoBtn(serviceCode);
			if (!verifyElement(serviceName, false))
				return false;

			if (!verifyElement(Status, false))
				return false;
			if (!map.get(keys.get(12)).toString().isEmpty()) {
				String[] chargeFrom = map.get(keys.get(13)).toString().split(",");
				String[] chargeTo = map.get(keys.get(15)).toString().split(",");
				String[] commissionFrom = map.get(keys.get(17)).toString().split(",");
				String[] commissionTo = map.get(keys.get(19)).toString().split(",");
				int count = 0;
				for (int i = chargeFrom.length; i > 0; i--) {
					By charge_from = By.xpath(".//*[@id='denom_row_" + (i) + "']//*[normalize-space(text())='From "
							+ Services[0] + " Charge']//following-sibling::div[contains(text(),'"
							+ chargeFrom[count].trim() + "')]");
					By commission_from = By.xpath(".//*[@id='denom_row_" + (i) + "']//*[normalize-space(text())='From "
							+ Services[0] + " Commission']//following-sibling::div[contains(text(),'"
							+ commissionFrom[count].trim() + "')]");
					By charge_to = By.xpath(".//*[@id='denom_row_" + (i) + "']//*[normalize-space(text())='To "
							+ Services[2] + " Charge']//following-sibling::div[contains(text(),'"
							+ chargeTo[count].trim() + "')]");
					By commission_to = By.xpath(".//*[@id='denom_row_" + (i) + "']//*[normalize-space(text())='To "
							+ Services[2] + " Commission']//following-sibling::div[contains(text(),'"
							+ commissionTo[count].trim() + "')]");
					count++;
					if (!verifyElement(charge_from, false))
						return false;
					if (!verifyElement(commission_from, false))
						return false;
					if (!verifyElement(charge_to, false))
						return false;
					if (!verifyElement(commission_to, false))
						return false;
				}
				String[] nonKyctransactionCount = map.get(keys.get(20)).toString().split(":");
				String[] nonKyctransactionValue = map.get(keys.get(21)).toString().split(":");
				String[] mediumKyctransactionCount = map.get(keys.get(22)).toString().split(":");
				String[] mediumKyctransactionValue = map.get(keys.get(23)).toString().split(":");
				String[] fullKyctransactionCount = map.get(keys.get(24)).toString().split(":");
				String[] fullKyctransactionValue = map.get(keys.get(25)).toString().split(":");
				By nontc = By
						.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
								+ nonKyctransactionCount[0] + "'])[1]");
				By nonvalue = By
						.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
								+ nonKyctransactionValue[0] + "'])[1]");
				By medtc = By
						.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
								+ mediumKyctransactionCount[0] + "'])[1]");
				By medvalue = By
						.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
								+ mediumKyctransactionValue[0] + "'])[1]");
				By fulltc = By
						.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
								+ fullKyctransactionCount[0] + "'])[1]");
				By fullvalue = By
						.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Daily']//following:: *[normalize-space(text()) = '"
								+ fullKyctransactionValue[0] + "'])[1]");
				By nontcWeekly = By
						.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
								+ nonKyctransactionCount[1] + "'])[1]");
				By nonvalueWeekly = By
						.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
								+ nonKyctransactionValue[1] + "'])[1]");
				By medtcWeekly = By
						.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
								+ mediumKyctransactionCount[1] + "'])[1]");
				By medvalueWeekly = By
						.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
								+ mediumKyctransactionValue[1] + "'])[1]");
				By fulltcWeekly = By
						.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
								+ fullKyctransactionCount[1] + "'])[1]");
				By fullvalueWeekly = By
						.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Weekly']//following:: *[normalize-space(text()) = '"
								+ fullKyctransactionValue[1] + "'])[1]");
				By nontcMonthly = By
						.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
								+ nonKyctransactionCount[2] + "'])[1]");
				By nonvalueMonthly = By
						.xpath("(.//*[@id='viewnonkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
								+ nonKyctransactionValue[2] + "'])[1]");
				By medtcMonthly = By
						.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
								+ mediumKyctransactionCount[2] + "'])[1]");
				By medvalueMonthly = By
						.xpath("(.//*[@id='viewmidkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
								+ mediumKyctransactionValue[2] + "'])[1]");
				By fulltcMonthly = By
						.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
								+ fullKyctransactionCount[2] + "'])[1]");
				By fullvalueMonthly = By
						.xpath("(.//*[@id='editfullkyc']//following:: *[normalize-space(text()) = 'Monthly']//following:: *[normalize-space(text()) = '"
								+ fullKyctransactionValue[2] + "'])[1]");
				if (verifyElement(txtLblNonKyc)) {
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
			}
			if (!map.get(keys.get(26)).toString().isEmpty()) {
				By EmailAccountName = By
						.xpath("(//*[normalize-space(text())='Email Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(26)).toString() + "'])[1]");
				By FcmAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(38)).toString() + "'])[1]");
				By SMSAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(33)).toString() + "'])[1]");
				By refundEmailAccountName = By
						.xpath("(//*[normalize-space(text())='Email Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(26)).toString() + "'])[2]");
				By refundFcmAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(38)).toString() + "'])[2]");
				By refundSMSAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(33)).toString() + "'])[2]");
				By EmailFromSubject = By
						.xpath("(//*[normalize-space(text())='From Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(27)).toString() + "'])[1]");
				By EmailToSubject = By
						.xpath("(//*[normalize-space(text())='To Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(31)).toString() + "'])[1]");
				By refundEmailFromSubject = By
						.xpath("(//*[normalize-space(text())='From Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(27)).toString() + "'])[2]");
				By refundEmailToSubject = By
						.xpath("(//*[normalize-space(text())='To Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(31)).toString() + "'])[2]");
				if (!verifyElement(EmailAccountName, false))
					return false;
				if (!verifyElement(EmailFromSubject, false))
					return false;
				if (!verifyElement(EmailToSubject, false))
					return false;
				if (!verifyElement(FcmAccountName, false))
					return false;
				if (!verifyElement(SMSAccountName, false))
					return false;
				if (map.get(keys.get(2)).toString().equalsIgnoreCase(IsYes)) {
					if (!verifyElement(refundEmailAccountName, false))
						return false;
					if (!verifyElement(refundEmailFromSubject, false))
						return false;
					if (!verifyElement(refundEmailToSubject, false))
						return false;
					if (!verifyElement(refundFcmAccountName, false))
						return false;
					if (!verifyElement(refundSMSAccountName, false))
						return false;
				}
			}
			return true;
		} else
			return false;
	}

	/**
	 * @author Kutbuddin.compounder to verify Product Internal deleted?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 30/10/2018
	 * @return true if Product Internal deleted successfully
	 */
	public boolean deleteProductInternal(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(4)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(4)).toString());
			delete();
			return true;
		} else {
			String string = "Product Internal already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyProductInternalrDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		// TODO Auto-generated method stub
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
					map.get(getMapKeys(map).get(3)).toString());
			return verifyElement(
					By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString().trim() + "'])[1]"), false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify Internal Products log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 20/12/2018
	 * @return true if Internal Products Log successfully Verified
	 */
	public boolean verifyProductInternalLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			for (int i = 1; i <= 2; i++) {
				By btnLog = By.xpath("(//li[contains(@id,'Log')])[" + i + "]");
				clickOnInternalLogBtn(btnLog);
				By paginationInternal = By.xpath("(//div[contains(@id,'Log') and contains(@id,'UL')] )[" + i + "]");
				verifyLogInternalProductsPagination(paginationInternal);
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort product product internal
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