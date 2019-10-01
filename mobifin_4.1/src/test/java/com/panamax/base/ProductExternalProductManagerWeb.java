package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

public class ProductExternalProductManagerWeb extends Common {
	By drpVendorName = By.id("VendorProductID");
	By drpModuleName = By.id("SystemModuleID");
	By drpSystemName = By.id("SystemServiceID");
	By txtProductName = By.id("ProductName");
	By txtDescription = By.id("Description");
	By drpOprtaorName = By.id("OperatorID");
	By drpStatus = By.id("IsActive");
	By txtMinAmount = By.xpath("(//input[contains(@id,'MinAmount')])[1]");
	By txtMaxAmount = By.xpath("(//input[contains(@id,'MaxAmount')])[1]");
	By txtdenominationDiscription = By.xpath("(//textarea[contains(@id,'DenominationName')])[1]");
	By addbtn = By.xpath("(//*[contains(@id,'btnDiscountAdd')])[last()]");
	By drpStatusSearch = By.id("cmbIsActive");
	By drpModuleSerach = By.id("cmbSystemModuleID");
	By drpServiceSearch = By.id("cmbSystemServiceID");
	By drpVendorSerach = By.id("cmbVendorProductID");
	By drpoperatorSearch = By.id("cmbOperatorID");
	By txtSearchProductName = By.id("txtProductName");
	By btnProduPanel = By.id("btnCProdPanel");
	By txtRefMinLength = By.id("RefNoMinLength");
	By txtRefMaxLength = By.id("RefNoMaxLength");
	By txtrefTitleEn = By.xpath("//input[contains(@name,'RefNoTitle') and contains(@name,'[en]')]");
	By txtrefTitleEs = By.xpath("//input[contains(@name,'RefNoTitle') and contains(@name,'[es]')]");
	By txtrefTitleFr = By.xpath("//input[contains(@name,'RefNoTitle') and contains(@name,'[fr]')]");
	By txtrefTitleregExp = By.id("RefNoPattern");
	By txtrefTitleResponseDiscrptionfr = By
			.xpath("//input[contains(@name,'FieldInfoResponseDesc') and contains(@name,'[fr]')]");
	By txtrefTitleResponseDiscrptiones = By
			.xpath("//input[contains(@name,'FieldInfoResponseDesc') and contains(@name,'[es]')]");
	By txtrefTitleResponseDiscrptionen = By
			.xpath("//input[contains(@name,'FieldInfoResponseDesc') and contains(@name,'[en]')]");
	By txtPhoneMinLength = By.id("PhoneMinLength");
	By txtPhoneMaxLength = By.id("PhoneMaxLength");
	By txtPhoneTitleEn = By.xpath("//input[contains(@name,'PhoneTitle') and contains(@name,'[en]')]");
	By txtPhoneTitleEs = By.xpath("//input[contains(@name,'PhoneTitle') and contains(@name,'[es]')]");
	By txtPhoneTitleFr = By.xpath("//input[contains(@name,'PhoneTitle') and contains(@name,'[fr]')]");
	By txtPhoneTitleregExp = By.id("PhonePattern");
	By txtPhoneTitleResponseDiscrptionfr = By
			.xpath("//input[contains(@name,'PhoneResponseDesc') and contains(@name,'[fr]')]");
	By txtPhoneTitleResponseDiscrptiones = By
			.xpath("//input[contains(@name,'PhoneResponseDesc') and contains(@name,'[es]')]");
	By txtPhoneTitleResponseDiscrptionen = By
			.xpath("//input[contains(@name,'PhoneResponseDesc') and contains(@name,'[en]')]");
	By drpPhonerequired = By.id("PhoneRequired");
	By txtEmailTitleEn = By.xpath("//input[contains(@name,'EmailTitle') and contains(@name,'[en]')]");
	By txtEmailTitleEs = By.xpath("//input[contains(@name,'EmailTitle') and contains(@name,'[es]')]");
	By txtEmailTitleFr = By.xpath("//input[contains(@name,'EmailTitle') and contains(@name,'[fr]')]");
	By txtEmailTitleResponseDiscrptionfr = By
			.xpath("//input[contains(@name,'EmailResponseDesc') and contains(@name,'[fr]')]");
	By txtEmailTitleResponseDiscrptiones = By
			.xpath("//input[contains(@name,'EmailResponseDesc') and contains(@name,'[es]')]");
	By txtEmailTitleResponseDiscrptionen = By
			.xpath("//input[contains(@name,'EmailResponseDesc') and contains(@name,'[en]')]");
	By drpEmailrequired = By.id("EmailRequired");
	By drpEmailId = By.id("MailAccountID");
	By drpEmailVariableName = By.id("EmailVariableName");
	By txtEmailSubject = By.id("Subject");
	By txtEmailBody = By.xpath("(//*[@class='note-editable panel-body'])[1]");
	By drpSmsId = By.id("SMSAccountID");
	By drpSMSVariableName = By.id("SMSVariableName");
	By txtSmsBody = By.id("SMSBody");
	By drpFcmId = By.id("FCMAccountID");
	By drpFCMVariableName = By.id("FcmVariableName");
	By txtFcmBody = By.id("FcmBody");
	By drpRefundEmailId = By.id("Refund_MailAccountID");
	By drpRefundEmailVariableName = By.id("Refund_EmailVariableName");
	By txtRefundEmailSubject = By.id("Refund_Subject");
	By txtRefundEmailBody = By.xpath("(//*[@class='note-editable panel-body'])[2]");
	By drpRefundSmsId = By.id("Refund_SMSAccountID");
	By drpRefundSMSVariableName = By.id("Refund_SMSVariableName");
	By txtRefundSmsBody = By.id("Refund_SMSBody");
	By drpRefundFcmId = By.id("Refund_FCMAccountID");
	By drpRefundFCMVariableName = By.id("Refund_FcmVariableName");
	By txtRefundFcmBody = By.id("Refund_FcmBody");
	By txtFeildMinLength = By.id("minimum_1");
	By txtFeildMaxLength = By.id("maximum_1");
	By txtFieldKey = By.id("FieldInfoKey_1");
	By txtFieldTitleEn = By.xpath("//input[contains(@name,'FieldInfoName') and contains(@name,'[en]')]");
	By txtFieldTitleEs = By.xpath("//input[contains(@name,'FieldInfoName') and contains(@name,'[es]')]");
	By txtFieldTitleFr = By.xpath("//input[contains(@name,'FieldInfoName') and contains(@name,'[fr]')]");
	By txtFieldTitleResponseDiscrptionfr = By
			.xpath("//input[contains(@name,'FieldInfoResponseDesc') and contains(@name,'[fr]')]");
	By txtFieldTitleResponseDiscrptiones = By
			.xpath("//input[contains(@name,'FieldInfoResponseDesc') and contains(@name,'[es]')]");
	By txtFieldTitleResponseDiscrptionen = By
			.xpath("//input[contains(@name,'FieldInfoResponseDesc') and contains(@name,'[en]')]");
	By drpFeildrequired = By.id("FieldInfoRequired_1");
	By drpFieldType = By.id("FieldInfoType_1");
	By txtKey = By.xpath("(//input[contains(@id,'key')])[1]");
	By txtValue = By.xpath("(//input[contains(@id,'value')])[1]");
	By btnAddKey = By.xpath("(//*[contains(@id,'btnAddNew')])[1]");
	By buttonEditProductInfo = By.id("editVendorProductInfo");
	By buttonEditProductInfoSave = By.id("editVendorProductInfoSave");
	By btnEditDenom = By.id("denomEdit");
	By btnEditDenomSave = By.id("denomSave");
	By btnFeildClick = By.xpath("//a[contains(@class,'field_add')]");
	String IsYes = "Yes";
	String IsFix = "Fix";
	private boolean minorCurrencyStatus = false;
	private boolean allowRefundStatus = false;
	private boolean txRefStatus = false;
	private boolean phoneTxRefStatus = false;
	private boolean emailTxRefStatus = false;

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 24/10/2018
	 */

	public ProductExternalProductManagerWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder select value from Product Manager vendorName
	 *         drop down
	 * @param vendorName
	 * @creation date 24/10/2018
	 */

	public void selectVendorProductName(String vendorName) {
		selectFromDropdown(drpVendorName, vendorName);
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
	 * @author kutbuddin.compounder select value from Product Manager
	 *         opratorName drop down
	 * @param opratorName
	 * @creation date 24/10/2018
	 */
	public void selectOperatorName(String opratorName) {
		selectFromDropdown(drpOprtaorName, opratorName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Manager moduleName
	 *         drop down
	 * @param moduleName
	 * @creation date 24/10/2018
	 */
	public void selectModuleName(String moduleName) {
		selectFromDropdown(drpModuleName, moduleName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Manager
	 *         serviceName drop down
	 * @param serviceName
	 * @creation date 24/10/2018
	 */
	public void selectServiceName(String serviceName) {
		selectFromDropdown(drpSystemName, serviceName);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager productName
	 *         field
	 * @param productName
	 * @creation date 24/10/2018
	 */

	public void sendTextInProductName(String productName) {
		clearAndSendTextInTextBox(txtProductName, productName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Manager
	 *         productType from radio button click
	 * @param productType
	 * @creation date 24/10/2018
	 */
	public void selectProductType(String productType) {
		clickOnElement(By.xpath("//label[normalize-space(text())='" + productType + "']"));
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager description
	 *         field
	 * @param description
	 * @creation date 24/10/2018
	 */

	public void sendTextInDescription(String description) {
		clearAndSendTextInTextBox(txtDescription, description);
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Manager
	 *         allowMinorCurrency
	 * @param allowMinorCurrency
	 * @creation date 24/10/2018
	 */
	public void selectaAllowMinorCurrency(String allowMinorCurrency) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='Allow Minor Currency']//following-sibling::div//div[contains(@class,'switch-on')]")))
			minorCurrencyStatus = true;
		if (allowMinorCurrency.equalsIgnoreCase(IsYes)) {
			if(!minorCurrencyStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='Allow Minor Currency']//following :: *[contains(@class,'bootstrap-switch-id-MinorCurrency')]"));
		}else{
			if(minorCurrencyStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='Allow Minor Currency']//following :: *[contains(@class,'bootstrap-switch-id-MinorCurrency')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Manager
	 *         allowRefund
	 * @param allowRefund
	 * @creation date 24/10/2018
	 */
	public void selectAllowRefund(String allowRefund) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='Allow Refund']//following-sibling::div//div[contains(@class,'switch-on')]")))
			allowRefundStatus = true;
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
	 * @author kutbuddin.compounder select value from Product Manager status
	 *         drop down
	 * @param status
	 * @creation date 24/10/2018
	 */
	public void selectStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager MinAmount field
	 * @param MinAmount
	 * @creation date 24/10/2018
	 */
	public void sendTextInMinAmount(String MinAmount) {
		clearAndSendTextInTextBox(txtMinAmount, MinAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager MaxAmount field
	 * @param MaxAmount
	 * @creation date 24/10/2018
	 */
	public void sendTextInMaxAmount(String MaxAmount) {
		clearAndSendTextInTextBox(txtMaxAmount, MaxAmount);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager MaxAmount field
	 * @param MaxAmount
	 * @creation date 24/10/2018
	 */
	public void sendTextInDenominationDiscription(String denominationDiscription) {
		clearAndSendTextInTextBox(txtdenominationDiscription, denominationDiscription);
	}

	/**
	 * @author kutbuddin.compounder click value from Product Manager
	 *         AccesInformation
	 * @param webElement
	 * @creation date 24/10/2018
	 */
	public void clickAccesInfo(By webElement) {
		clickOnElement(webElement);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager refMinLength
	 *         field
	 * @param refMinLength
	 * @creation date 24/10/2018
	 */
	public void sendTextInRefMinLength(String refMinLength) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('type','number')",
				findVisibleElement(txtRefMinLength));
		clearAndSendTextInTextBox(txtRefMinLength, refMinLength);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager refMaxLength
	 *         field
	 * @param refMaxLength
	 * @creation date 24/10/2018
	 */
	public void sendTextInRefMaxLength(String refMaxLength) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('type','number')",
				findVisibleElement(txtRefMaxLength));
		clearAndSendTextInTextBox(txtRefMaxLength, refMaxLength);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager refTitleInEn
	 *         field
	 * @param refTitleInEn
	 * @creation date 24/10/2018
	 */

	public void sendTextInRefTitleInEn(String refTitleInEn) {
		clearAndSendTextInTextBox(txtrefTitleEn, refTitleInEn);
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Manager Tx
	 *         Refrence
	 * @param txRefrenceRef
	 * @creation date 24/10/2018
	 */
	public void selectRefTxRefrence(String txRefrenceRef) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,' bootstrap-switch-id-RefNoTxReference') and contains(@class,'switch-on')]"), false))
			txRefStatus = true;
		if (txRefrenceRef.equalsIgnoreCase(IsYes)) {
			if(!txRefStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,' bootstrap-switch-id-RefNoTxReference')]"));
		}else{
			if(txRefStatus)
				clickOnElement(By.xpath(
						"//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,' bootstrap-switch-id-RefNoTxReference')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Manager Us
	 *         as Phone
	 * @param RefUseAsPhone
	 * @creation date 24/10/2018
	 */
	public void selectRefUseAsPhone(String RefUseAsPhone) {
		if (RefUseAsPhone.equalsIgnoreCase(IsYes)) {
			clickOnElement(By.xpath(
					"//label[normalize-space(text())='Use As Phone']//following :: *[contains(@class,'bootstrap-switch-id-FieldInfoAsPhone')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager refTitleInEs
	 *         field
	 * @param refTitleInEs
	 * @creation date 24/10/2018
	 */
	public void sendTextInRefTitleInEs(String refTitleInEs) {
		clearAndSendTextInTextBox(txtrefTitleEs, refTitleInEs);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager refTitleInfr
	 *         field
	 * @param refTitleInfr
	 * @creation date 24/10/2018
	 */
	public void sendTextInRefTitleInFr(String refTitleInfr) {
		clearAndSendTextInTextBox(txtrefTitleFr, refTitleInfr);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager refRegularExp
	 *         field
	 * @param refRegularExp
	 * @creation date 24/10/2018
	 */
	public void sendTextInRefRegularExp(String refRegularExp) {
		clearAndSendTextInTextBox(txtrefTitleregExp, refRegularExp);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         refTitleResponseDiscrptionfr field
	 * @param refTitleResponseDiscrptionfr
	 * @creation date 24/10/2018
	 */
	public void sendTextInRefResponseDiscrptionFr(String refTitleResponseDiscrptionfr) {
		clearAndSendTextInTextBox(txtrefTitleResponseDiscrptionfr, refTitleResponseDiscrptionfr);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         refTitleResponseDiscrptiones field
	 * @param refTitleResponseDiscrptiones
	 * @creation date 24/10/2018
	 */
	public void sendTextInRefResponseDiscrptionEs(String refTitleResponseDiscrptiones) {
		clearAndSendTextInTextBox(txtrefTitleResponseDiscrptiones, refTitleResponseDiscrptiones);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         refTitleResponseDiscrptionen field
	 * @param refTitleResponseDiscrptionen
	 * @creation date 24/10/2018
	 */
	public void sendTextInRefResponseDiscrptionEn(String refTitleResponseDiscrptionen) {
		clearAndSendTextInTextBox(txtrefTitleResponseDiscrptionen, refTitleResponseDiscrptionen);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager phoneMinLength
	 *         field
	 * @param phoneMinLength
	 * @creation date 24/10/2018
	 */
	public void sendTextInPhoneMinLength(String phoneMinLength) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('type','number')",
				findVisibleElement(txtPhoneMinLength));
		clearAndSendTextInTextBox(txtPhoneMinLength, phoneMinLength);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager phoneMaxLength
	 *         field
	 * @param phoneMaxLength
	 * @creation date 24/10/2018
	 */
	public void sendTextInPhoneMaxLength(String phoneMaxLength) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('type','number')",
				findVisibleElement(txtPhoneMaxLength));
		clearAndSendTextInTextBox(txtPhoneMaxLength, phoneMaxLength);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager phoneTitleInEn
	 *         field
	 * @param phoneTitleInEn
	 * @creation date 24/10/2018
	 */

	public void sendTextInPhoneTitleInEn(String phoneTitleInEn) {
		clearAndSendTextInTextBox(txtPhoneTitleEn, phoneTitleInEn);
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Manager Tx
	 *         phonerence
	 * @param txphonerencephone
	 * @creation date 24/10/2018
	 */
	public void selectPhoneTxRefrence(String phoneRefrence) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,'switch-on') and contains(@class,'bootstrap-switch-id-Phone')]")))
			phoneTxRefStatus = true;
		if (phoneRefrence.equalsIgnoreCase(IsYes)) {
			if(!phoneTxRefStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,' bootstrap-switch-id-Phone')]"));
		}else{
			if(phoneTxRefStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,' bootstrap-switch-id-Phone')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager phoneTitleInEs
	 *         field
	 * @param phoneTitleInEs
	 * @creation date 24/10/2018
	 */
	public void sendTextInPhoneTitleInEs(String phoneTitleInEs) {
		clearAndSendTextInTextBox(txtPhoneTitleEs, phoneTitleInEs);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager phoneTitleInfr
	 *         field
	 * @param phoneTitleInfr
	 * @creation date 24/10/2018
	 */
	public void sendTextInPhoneTitleInFr(String phoneTitleInfr) {
		clearAndSendTextInTextBox(txtPhoneTitleFr, phoneTitleInfr);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager phoneRegularExp
	 *         field
	 * @param phoneRegularExp
	 * @creation date 24/10/2018
	 */
	public void sendTextInPhoneRegularExp(String phoneRegularExp) {
		clearAndSendTextInTextBox(txtPhoneTitleregExp, phoneRegularExp);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         phoneTitleResponseDiscrptionfr field
	 * @param phoneTitleResponseDiscrptionfr
	 * @creation date 24/10/2018
	 */
	public void sendTextInPhoneResponseDiscrptionFr(String phoneTitleResponseDiscrptionfr) {
		clearAndSendTextInTextBox(txtPhoneTitleResponseDiscrptionfr, phoneTitleResponseDiscrptionfr);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         phoneTitleResponseDiscrptiones field
	 * @param phoneTitleResponseDiscrptiones
	 * @creation date 24/10/2018
	 */
	public void sendTextInPhoneResponseDiscrptionEs(String phoneTitleResponseDiscrptiones) {
		clearAndSendTextInTextBox(txtPhoneTitleResponseDiscrptiones, phoneTitleResponseDiscrptiones);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         phoneTitleResponseDiscrptionen field
	 * @param phoneTitleResponseDiscrptionen
	 * @creation date 24/10/2018
	 */
	public void sendTextInPhoneResponseDiscrptionEn(String phoneTitleResponseDiscrptionen) {
		clearAndSendTextInTextBox(txtPhoneTitleResponseDiscrptionen, phoneTitleResponseDiscrptionen);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager requiredPhoneFeild
	 *         field
	 * @param requiredPhoneFeild
	 * @creation date 24/10/2018
	 */
	public void selectRequiredInPhone(String requiredPhoneFeild) {
		selectFromDropdown(drpPhonerequired, requiredPhoneFeild);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager emailTitleInEn
	 *         field
	 * @param emailTitleInEn
	 * @creation date 24/10/2018
	 */

	public void sendTextInEmailTitleInEn(String emailTitleInEn) {
		clearAndSendTextInTextBox(txtEmailTitleEn, emailTitleInEn);
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Manager Tx
	 *         emailrence
	 * @param txemailrenceemail
	 * @creation date 24/10/2018
	 */
	public void selectEmailtxRefrence(String emailRefrence) {
		if(verifyElement(By.xpath("//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,'switch-on') and contains(@class,'bootstrap-switch-id-Email')]"),false))
			emailTxRefStatus = true;
		if (emailRefrence.equalsIgnoreCase("Yes")) {
			if(!emailTxRefStatus)
				clickOnElement(By.xpath(
					"//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,' bootstrap-switch-id-Email')]"));
		}else{
			if(emailTxRefStatus)
				clickOnElement(By.xpath(
						"//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,' bootstrap-switch-id-Email')]"));
		}
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager emailTitleInEs
	 *         field
	 * @param emailTitleInEs
	 * @creation date 24/10/2018
	 */
	public void sendTextInEmailTitleInEs(String emailTitleInEs) {
		clearAndSendTextInTextBox(txtEmailTitleEs, emailTitleInEs);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager emailTitleInfr
	 *         field
	 * @param emailTitleInfr
	 * @creation date 24/10/2018
	 */
	public void sendTextInEmailTitleInFr(String emailTitleInfr) {
		clearAndSendTextInTextBox(txtEmailTitleFr, emailTitleInfr);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         emailTitleResponseDiscrptionfr field
	 * @param emailTitleResponseDiscrptionfr
	 * @creation date 24/10/2018
	 */
	public void sendTextInEmailResponseDiscrptionFr(String emailTitleResponseDiscrptionfr) {
		clearAndSendTextInTextBox(txtEmailTitleResponseDiscrptionfr, emailTitleResponseDiscrptionfr);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         emailTitleResponseDiscrptiones field
	 * @param emailTitleResponseDiscrptiones
	 * @creation date 24/10/2018
	 */
	public void sendTextInEmailResponseDiscrptionEs(String emailTitleResponseDiscrptiones) {
		clearAndSendTextInTextBox(txtEmailTitleResponseDiscrptiones, emailTitleResponseDiscrptiones);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         emailTitleResponseDiscrptionen field
	 * @param emailTitleResponseDiscrptionen
	 * @creation date 24/10/2018
	 */
	public void sendTextInEmailResponseDiscrptionEn(String emailTitleResponseDiscrptionen) {
		clearAndSendTextInTextBox(txtEmailTitleResponseDiscrptionen, emailTitleResponseDiscrptionen);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager emailAccount field
	 * @param emailAccount
	 * @creation date 24/10/2018
	 */
	public void selectEmailAccount(String emailAccount) {
		selectFromDropdown(drpEmailId, emailAccount);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager SmsAccount field
	 * @param SmsAccount
	 * @creation date 24/10/2018
	 */
	public void selectSmsAccount(String SmsAccount) {
		selectFromDropdown(drpSmsId, SmsAccount);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager FcmAccount field
	 * @param FcmAccount
	 * @creation date 24/10/2018
	 */
	public void selectFcmAccount(String FcmAccount) {
		selectFromDropdown(drpFcmId, FcmAccount);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager
	 *         dynamicEmailVaribles field
	 * @param dynamicEmailVaribles
	 * @creation date 24/10/2018
	 */
	public void selectEmailDynamicVaribles(String dynamicEmailVaribles) {
		selectFromDropdown(drpEmailVariableName, dynamicEmailVaribles);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager dynamicSmsVaribles
	 *         field
	 * @param dynamicSmsVaribles
	 * @creation date 24/10/2018
	 */
	public void selectSmsDynamicVaribles(String dynamicSmsVaribles) {
		selectFromDropdown(drpSMSVariableName, dynamicSmsVaribles);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager dynamicFcmVaribles
	 *         field
	 * @param dynamicFcmVaribles
	 * @creation date 24/10/2018
	 */
	public void selectFcmDynamicVaribles(String dynamicFcmVaribles) {
		selectFromDropdown(drpFCMVariableName, dynamicFcmVaribles);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager emailSubject
	 *         field
	 * @param emailSubject
	 * @creation date 24/10/2018
	 */
	public void sendTextInEmailSubject(String emailSubject) {
		clearAndSendTextInTextBox(txtEmailSubject, emailSubject);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager emailBody field
	 * @param emailBody
	 * @creation date 24/10/2018
	 */
	public void sendTextInEmailBody(String emailBody) {
		clearAndSendTextInTextBox(txtEmailBody, emailBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager smsBody field
	 * @param smsBody
	 * @creation date 24/10/2018
	 */
	public void sendTextInSmsBody(String smsBody) {
		clearAndSendTextInTextBox(txtSmsBody, smsBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager fcmBody field
	 * @param fcmBody
	 * @creation date 24/10/2018
	 */
	public void sendTextInFcmBody(String fcmBody) {
		clearAndSendTextInTextBox(txtFcmBody, fcmBody);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Manager emailAccount
	 *         field
	 * @param emailAccount
	 * @creation date 24/10/2018
	 */
	public void selectRefundEmailAccount(String emailAccount) {
		selectFromDropdown(drpRefundEmailId, emailAccount);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Manager SmsAccount
	 *         field
	 * @param SmsAccount
	 * @creation date 24/10/2018
	 */
	public void selectRefundSmsAccount(String SmsAccount) {
		selectFromDropdown(drpRefundSmsId, SmsAccount);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Manager FcmAccount
	 *         field
	 * @param FcmAccount
	 * @creation date 24/10/2018
	 */
	public void selectRefundFcmAccount(String FcmAccount) {
		selectFromDropdown(drpRefundFcmId, FcmAccount);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Manager
	 *         dynamicEmailVaribles field
	 * @param dynamicEmailVaribles
	 * @creation date 24/10/2018
	 */
	public void selectRefundEmailDynamicVaribles(String dynamicEmailVaribles) {
		selectFromDropdown(drpRefundEmailVariableName, dynamicEmailVaribles);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Manager
	 *         dynamicSmsVaribles field
	 * @param dynamicSmsVaribles
	 * @creation date 24/10/2018
	 */
	public void selectRefundSmsDynamicVaribles(String dynamicSmsVaribles) {
		selectFromDropdown(drpRefundSMSVariableName, dynamicSmsVaribles);
	}

	/**
	 * @author kutbuddin.compounder selectRefund in Product Manager
	 *         dynamicFcmVaribles field
	 * @param dynamicFcmVaribles
	 * @creation date 24/10/2018
	 */
	public void selectRefundFcmDynamicVaribles(String dynamicFcmVaribles) {
		selectFromDropdown(drpRefundFCMVariableName, dynamicFcmVaribles);
	}

	/**
	 * @author kutbuddin.compounder sendRefund text in Product Manager
	 *         emailSubject field
	 * @param emailSubject
	 * @creation date 24/10/2018
	 */
	public void sendRefundTextInEmailSubject(String emailSubject) {
		clearAndSendTextInTextBox(txtRefundEmailSubject, emailSubject);
	}

	/**
	 * @author kutbuddin.compounder sendRefund text in Product Manager emailBody
	 *         field
	 * @param emailBody
	 * @creation date 24/10/2018
	 */
	public void sendRefundTextInEmailBody(String emailBody) {
		clearAndSendTextInTextBox(txtRefundEmailBody, emailBody);
	}

	/**
	 * @author kutbuddin.compounder sendRefund text in Product Manager smsBody
	 *         field
	 * @param smsBody
	 * @creation date 24/10/2018
	 */
	public void sendRefundTextInSmsBody(String smsBody) {
		clearAndSendTextInTextBox(txtRefundSmsBody, smsBody);
	}

	/**
	 * @author kutbuddin.compounder sendRefund text in Product Manager fcmBody
	 *         field
	 * @param fcmBody
	 * @creation date 24/10/2018
	 */
	public void sendRefundTextInFcmBody(String fcmBody) {
		clearAndSendTextInTextBox(txtRefundFcmBody, fcmBody);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager feildMinLength
	 *         field
	 * @param feildMinLength
	 * @creation date 24/10/2018
	 */
	public void sendTextInFeildMinLength(String feildMinLength) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('type','number')",
				findVisibleElement(txtFeildMinLength));
		clearAndSendTextInTextBox(txtFeildMinLength, feildMinLength);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager feildMaxLength
	 *         field
	 * @param feildMaxLength
	 * @creation date 24/10/2018
	 */
	public void sendTextInFeildMaxLength(String feildMaxLength) {
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('type','number')",
				findVisibleElement(txtFeildMaxLength));
		clearAndSendTextInTextBox(txtFeildMaxLength, feildMaxLength);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager feildTitleInEn
	 *         field
	 * @param feildTitleInEn
	 * @creation date 24/10/2018
	 */

	public void sendTextInFeildTitleInEn(String feildTitleInEn) {
		clearAndSendTextInTextBox(txtFieldTitleEn, feildTitleInEn);
	}

	/**
	 * @author kutbuddin.compounder click clickAddNewKey
	 * @creation date 24/10/2018
	 */

	public void clickAddNewKey() {
		clickOnElement(btnAddKey);
	}

	/**
	 * @author kutbuddin.compounder select radio button from Product Manager Tx
	 *         Feildrence
	 * @param txFeildrenceFeild
	 * @creation date 24/10/2018
	 */
	public void selectFeildTxRefrence(String txFeildrenceFeild) {
		if (txFeildrenceFeild.equalsIgnoreCase(IsYes)) {
			clickOnElement(By.xpath(
					"//label[normalize-space(text())='Tx Reference']//following :: *[contains(@class,' bootstrap-switch-id-FieldInfoTxReference')]"));
		}
	}

	public void selectRequiredInFeild(String RequiredInFeild) {
		selectFromDropdown(drpFeildrequired, RequiredInFeild);
	}

	public void selectFieldType(String feildType) {
		selectFromDropdown(drpFieldType, feildType);
	}

	public void sendTextInFeildKey(String feildKey) {
		clearAndSendTextInTextBox(txtFieldKey, feildKey);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager key field
	 * @param key
	 * @creation date 24/10/2018
	 */
	public void sendTextInKey(String key) {
		clearAndSendTextInTextBox(txtKey, key);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager value field
	 * @param key
	 * @creation date 24/10/2018
	 */
	public void sendTextInValue(String value) {
		clearAndSendTextInTextBox(txtValue, value);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager feildTitleInEs
	 *         field
	 * @param feildTitleInEs
	 * @creation date 24/10/2018
	 */
	public void sendTextInFeildTitleInEs(String feildTitleInEs) {
		clearAndSendTextInTextBox(txtFieldTitleEs, feildTitleInEs);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager feildTitleInfr
	 *         field
	 * @param feildTitleInfr
	 * @creation date 24/10/2018
	 */
	public void sendTextInFeildTitleInFr(String feildTitleInfr) {
		clearAndSendTextInTextBox(txtFieldTitleFr, feildTitleInfr);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         feildTitleResponseDiscrptionfr field
	 * @param feildTitleResponseDiscrptionfr
	 * @creation date 24/10/2018
	 */
	public void sendTextInFeildResponseDiscrptionFr(String feildTitleResponseDiscrptionfr) {
		clearAndSendTextInTextBox(txtFieldTitleResponseDiscrptionfr, feildTitleResponseDiscrptionfr);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         feildTitleResponseDiscrptiones field
	 * @param feildTitleResponseDiscrptiones
	 * @creation date 24/10/2018
	 */
	public void sendTextInFeildResponseDiscrptionEs(String feildTitleResponseDiscrptiones) {
		clearAndSendTextInTextBox(txtFieldTitleResponseDiscrptiones, feildTitleResponseDiscrptiones);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager
	 *         feildTitleResponseDiscrptionen field
	 * @param feildTitleResponseDiscrptionen
	 * @creation date 24/10/2018
	 */
	public void sendTextInFeildResponseDiscrptionEn(String feildTitleResponseDiscrptionen) {
		clearAndSendTextInTextBox(txtFieldTitleResponseDiscrptionen, feildTitleResponseDiscrptionen);
	}

	/**
	 * @author kutbuddin.compounder click on add demonation button
	 * @param endDate
	 * @creation date 24/10/2018
	 */
	public void clickOnaddBtn() {
		clickOnElement(addbtn);
	}

	/**
	 * @author kutbuddin.compounder to click on edit product button denom info
	 * @param element
	 * @creation date 16/10/2018
	 */
	public void clickOnEditDenom() {
		clickOnElement(btnEditDenom);
	}

	public void clickOndenomSave() {
		clickOnElement(btnEditDenomSave);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager requiredEmailFeild
	 *         field
	 * @param requiredEmailFeild
	 * @creation date 24/10/2018
	 */
	public void selectRequiredInEmail(String requiredEmailFeild) {
		selectFromDropdown(drpEmailrequired, requiredEmailFeild);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager name field
	 * @param VendorNameSearch
	 * @creation date 24/10/2018
	 */
	public void selectInVendorNameInFilterSearch(String VendorNameSearch) {
		selectFromDropdown(drpVendorSerach, VendorNameSearch);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager moduleName field
	 * @param webelement
	 * @creation date 26/12/2018
	 */
	public void clickOnTaxation(By webelement) {
		clickOnElement(webelement);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager moduleName field
	 * @param moduleName
	 * @creation date 24/10/2018
	 */
	public void selectModuleInFilterSearch(String moduleName) {
		selectFromDropdown(drpModuleSerach, moduleName);
	}

	/**
	 * @author kutbuddin.compounder select in Product Manager moduleName field
	 * @param moduleName
	 * @creation date 24/10/2018
	 */
	public void selectOpertaorInFilterSearch(String Operator) {
		selectFromDropdown(drpoperatorSearch, Operator);
	}

	/**
	 * @author kutbuddin.compounder select value in Product Manager serviceName
	 *         from dropdown
	 * @param serviceName
	 * @creation date 24/10/2018
	 */
	public void selectServiceInFilterSearch(String serviceName) {
		selectFromDropdown(drpServiceSearch, serviceName);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Manager productCode
	 *         from dropdown
	 * @param productCode
	 * @creation date 24/10/2018
	 */
	public void sendProductNameTextInFilterSearch(String productName) {
		clearAndSendTextInTextBox(txtSearchProductName, productName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Manager status
	 *         drop down
	 * @param statusSearch
	 * @creation date 24/10/2018
	 */
	public void selectStatusInFilterSearch(String statusSearch) {
		selectFromDropdown(drpStatusSearch, statusSearch);
	}

	/**
	 * @author kutbuddin.compounder click on productpanel button
	 * @param statusSearch
	 * @creation date 23/10/2018
	 */
	public void clickOnProductPanel() {
		clickOnElement(btnProduPanel);
	}

	/**
	 * @author kutbuddin.compounder to click on edit product button info
	 * @creation date 16/10/2018
	 */
	public void clickOnEditBtnProductInfo() {
		clickOnElement(buttonEditProductInfo);
	}

	/**
	 * @author kutbuddin.compounder
	 * @param str1,str2,str3,str4,str5,str6
	 * @creation date 3/12/2018
	 */
	public void filterSearch(String str1, String str2, String str3, String str4, String str5, String str6) {
		commonFilterSearch();
		selectOpertaorInFilterSearch(str1);
		selectModuleInFilterSearch(str2);
		selectServiceInFilterSearch(str3);
		selectInVendorNameInFilterSearch(str4);
		sendProductNameTextInFilterSearch(str5);
		selectStatusInFilterSearch(str6);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder to click on denomBtn
	 * @creation date 03/12/2018
	 */
	public void clickOnDenomBtn(By WebElement) {
		clickOnElement(WebElement);
	}

	/**
	 * @author kutbuddin.compounder to click on feildClickAddbtn
	 * @creation date 21/01/2019
	 */
	public void feildClickAdd() {
		clickOnElement(btnFeildClick);
	}

	/**
	 * @author kutbuddin.compounder to add Product Manager
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 24/10/2018
	 */
	public void addProductManager(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectModuleName(map.get(mapKeys.get(0)).toString());
		selectServiceName(map.get(mapKeys.get(1)).toString());
		commonWait();
		selectOperatorName(map.get(mapKeys.get(2)).toString());
		sendTextInProductName(map.get(mapKeys.get(3)).toString());
		selectProductType(map.get(mapKeys.get(4)).toString());
		sendTextInDescription(map.get(mapKeys.get(5)).toString());
		selectVendorProductName(map.get(mapKeys.get(6)).toString());
		selectaAllowMinorCurrency(map.get(mapKeys.get(7)).toString());
		selectAllowRefund(map.get(mapKeys.get(8)).toString());
		selectStatus(map.get(mapKeys.get(9)).toString());
		if (!map.get(mapKeys.get(54)).toString().isEmpty()) {
			String taxtion[] = map.get(mapKeys.get(54)).toString().split(",");
			for (int i = 0; i < taxtion.length; i++) {
				By clickTaxtion = By.xpath("(//label[normalize-space(text())='" + taxtion[i].trim()
						+ "']//following :: *[contains(@class,'bootstrap-switch-id-tax')])[1]");
				clickOnTaxation(clickTaxtion);
			}
		}
		clickOnNextBtn();
		if (verifyToolTip()) {
			clickOnCancelBtn();
		} else {
			int rows = Integer.parseInt(map.get(mapKeys.get(10)).toString());
			if (map.get(mapKeys.get(4)).toString().equalsIgnoreCase(IsFix)) {
				String[] min = map.get(mapKeys.get(12)).toString().split(",");
				String[] denominationDiscription = map.get(mapKeys.get(11)).toString().split(",");
				for (int m = 0; m < rows; m++) {
					sendTextInDenominationDiscription(denominationDiscription[m].trim());
					sendTextInMinAmount(min[m].trim());
					if (m < rows - 1) {
						clickOnAddBtn();
					}
				}
				clickOnNextBtn();
			} else {
				String[] min = map.get(mapKeys.get(12)).toString().split(",");
				String[] max = map.get(mapKeys.get(13)).toString().split(",");
				for (int m = 0; m < rows; m++) {
					if (m == 0) {
						sendTextInMinAmount(min[m].trim());
					}
					sendTextInMaxAmount(max[m].trim());
					if (m < rows - 1) {
						clickOnAddBtn();
					}
				}
				clickOnNextBtn();
			}
			String[] accessInfoChannel = map.get(mapKeys.get(14)).toString().split(",");
			for (int i = 0; i < accessInfoChannel.length; i++) {
				By accesInfo = By.xpath("//div[text()[normalize-space() = '" + accessInfoChannel[i].trim() + "']]");
				clickAccesInfo(accesInfo);
			}
			if (map.get(mapKeys.get(0)).toString().equalsIgnoreCase(ConstantsFile.BILL_PAY)
					|| map.get(mapKeys.get(0)).toString().equalsIgnoreCase(ConstantsFile.PIN)
					|| map.get(mapKeys.get(0)).toString().equalsIgnoreCase(ConstantsFile.ENTRETENIMINETO)
					|| map.get(mapKeys.get(0)).toString().equalsIgnoreCase(ConstantsFile.INTEROPERABILIDAD)) {
				if (verifyElement(txtFieldTitleEn, false)) {
					sendTextInFeildTitleInEn(map.get(mapKeys.get(44)).toString());
					sendTextInFeildTitleInEs(map.get(mapKeys.get(44)).toString());
					// sendTextInFeildTitleInFr(map.get(mapKeys.get(15)).toString());
					sendTextInFeildKey(map.get(mapKeys.get(45)).toString());
					selectRequiredInFeild(map.get(mapKeys.get(46)).toString());
					selectFieldType(map.get(mapKeys.get(47)).toString());
					// selectFeildTxRefrence(map.get(mapKeys.get(48)).toString());
					sendTextInFeildResponseDiscrptionEs(map.get(mapKeys.get(49)).toString());
					sendTextInFeildResponseDiscrptionEn(map.get(mapKeys.get(49)).toString());
					if (map.get(mapKeys.get(47)).toString().equalsIgnoreCase("Number")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("String")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("Decimal")) {
						sendTextInFeildMinLength(map.get(mapKeys.get(50)).toString());
						sendTextInFeildMaxLength(map.get(mapKeys.get(51)).toString());
					} else if (map.get(mapKeys.get(47)).toString().equalsIgnoreCase("Dropdown")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("Radio")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("MultiSelect")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("CheckBox")) {
						String[] Keys = map.get(mapKeys.get(52)).toString().split(",");
						String[] Values = map.get(mapKeys.get(53)).toString().split(",");
						int length = Keys.length;
						for (int i = 0; i < Keys.length; i++) {
							sendTextInKey(Keys[i].trim());
							sendTextInValue(Values[i].trim());
							if (i < length - 1) {
								clickAddNewKey();
							}
						}
					}
				} else {
					feildClickAdd();
					sendTextInFeildTitleInEn(map.get(mapKeys.get(44)).toString());
					sendTextInFeildTitleInEs(map.get(mapKeys.get(44)).toString());
					// sendTextInFeildTitleInFr(map.get(mapKeys.get(15)).toString());
					sendTextInFeildKey(map.get(mapKeys.get(45)).toString());
					selectRequiredInFeild(map.get(mapKeys.get(46)).toString());
					selectFieldType(map.get(mapKeys.get(47)).toString());
					// selectFeildTxRefrence(map.get(mapKeys.get(48)).toString());
					sendTextInFeildResponseDiscrptionEs(map.get(mapKeys.get(49)).toString());
					sendTextInFeildResponseDiscrptionEn(map.get(mapKeys.get(49)).toString());
					if (map.get(mapKeys.get(47)).toString().equalsIgnoreCase("Number")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("String")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("Decimal")) {
						sendTextInFeildMinLength(map.get(mapKeys.get(50)).toString());
						sendTextInFeildMaxLength(map.get(mapKeys.get(51)).toString());
					} else if (map.get(mapKeys.get(47)).toString().equalsIgnoreCase("Dropdown")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("Radio")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("MultiSelect")
							|| map.get(mapKeys.get(47)).toString().equalsIgnoreCase("CheckBox")) {
						String[] Keys = map.get(mapKeys.get(52)).toString().split(",");
						String[] Values = map.get(mapKeys.get(53)).toString().split(",");
						int length = Keys.length;
						for (int i = 0; i < Keys.length; i++) {
							sendTextInKey(Keys[i].trim());
							sendTextInValue(Values[i].trim());
							if (i < length - 1) {
								clickAddNewKey();
							}
						}
					}
				}
				// sendTextInRefResponseDiscrptionFr(map.get(mapKeys.get(21)).toString());
				sendTextInPhoneTitleInEn(map.get(mapKeys.get(22)).toString());
				sendTextInPhoneTitleInEs(map.get(mapKeys.get(22)).toString());
				// sendTextInPhoneTitleInFr(map.get(mapKeys.get(22)).toString());
				if (!map.get(mapKeys.get(23)).toString().isEmpty()) {
					sendTextInPhoneRegularExp(map.get(mapKeys.get(23)).toString());
				}
				selectRequiredInPhone(map.get(mapKeys.get(24)).toString());
				sendTextInPhoneMinLength(map.get(mapKeys.get(25)).toString());
				sendTextInPhoneMaxLength(map.get(mapKeys.get(26)).toString());
				selectPhoneTxRefrence(map.get(mapKeys.get(27)).toString());
				sendTextInPhoneResponseDiscrptionEs(map.get(mapKeys.get(28)).toString());
				sendTextInPhoneResponseDiscrptionEn(map.get(mapKeys.get(28)).toString());
				// sendTextInPhoneResponseDiscrptionFr(map.get(mapKeys.get(28)).toString());
				sendTextInEmailTitleInEn(map.get(mapKeys.get(29)).toString());
				sendTextInEmailTitleInEs(map.get(mapKeys.get(29)).toString());
				// sendTextInEmailTitleInFr(map.get(mapKeys.get(29)).toString());
				selectRequiredInEmail(map.get(mapKeys.get(31)).toString());
				selectEmailtxRefrence(map.get(mapKeys.get(32)).toString());
				sendTextInEmailResponseDiscrptionEs(map.get(mapKeys.get(33)).toString());
				sendTextInEmailResponseDiscrptionEn(map.get(mapKeys.get(33)).toString());
			} else {
				sendTextInRefTitleInEn(map.get(mapKeys.get(15)).toString());
				sendTextInRefTitleInEs(map.get(mapKeys.get(15)).toString());
				// sendTextInRefTitleInFr(map.get(mapKeys.get(15)).toString());
				if (!map.get(mapKeys.get(16)).toString().isEmpty()) {
					sendTextInRefRegularExp(map.get(mapKeys.get(16)).toString());
				}
				selectRefTxRefrence(map.get(mapKeys.get(17)).toString());
				selectRefUseAsPhone(map.get(mapKeys.get(18)).toString());
				sendTextInRefMinLength(map.get(mapKeys.get(19)).toString());
				sendTextInRefMaxLength(map.get(mapKeys.get(20)).toString());
				sendTextInRefResponseDiscrptionEs(map.get(mapKeys.get(21)).toString());
				sendTextInRefResponseDiscrptionEn(map.get(mapKeys.get(21)).toString());
				// sendTextInRefResponseDiscrptionFr(map.get(mapKeys.get(21)).toString());
				sendTextInPhoneTitleInEn(map.get(mapKeys.get(22)).toString());
				sendTextInPhoneTitleInEs(map.get(mapKeys.get(22)).toString());
				// sendTextInPhoneTitleInFr(map.get(mapKeys.get(22)).toString());
				if (!map.get(mapKeys.get(23)).toString().isEmpty()) {
					sendTextInPhoneRegularExp(map.get(mapKeys.get(23)).toString());
				}
				selectRequiredInPhone(map.get(mapKeys.get(24)).toString());
				sendTextInPhoneMinLength(map.get(mapKeys.get(25)).toString());
				sendTextInPhoneMaxLength(map.get(mapKeys.get(26)).toString());
				selectPhoneTxRefrence(map.get(mapKeys.get(27)).toString());
				sendTextInPhoneResponseDiscrptionEs(map.get(mapKeys.get(28)).toString());
				sendTextInPhoneResponseDiscrptionEn(map.get(mapKeys.get(28)).toString());
				// sendTextInPhoneResponseDiscrptionFr(map.get(mapKeys.get(28)).toString());
				sendTextInEmailTitleInEn(map.get(mapKeys.get(29)).toString());
				sendTextInEmailTitleInEs(map.get(mapKeys.get(29)).toString());
				// sendTextInEmailTitleInFr(map.get(mapKeys.get(29)).toString());
				selectRequiredInEmail(map.get(mapKeys.get(31)).toString());
				selectEmailtxRefrence(map.get(mapKeys.get(32)).toString());
				sendTextInEmailResponseDiscrptionEs(map.get(mapKeys.get(33)).toString());
				sendTextInEmailResponseDiscrptionEn(map.get(mapKeys.get(33)).toString());
				// sendTextInEmailResponseDiscrptionFr(map.get(mapKeys.get(33)).toString());
			}
			clickOnNextBtn();
			if (verifyToolTip()) {
				clickOnCancelBtn();
			} else {
				if (!map.get(mapKeys.get(34)).toString().isEmpty()) {
					selectEmailAccount(map.get(mapKeys.get(34)).toString());
					sendTextInEmailSubject(map.get(mapKeys.get(36)).toString());
					sendTextInEmailBody(map.get(mapKeys.get(37)).toString().replaceAll("::", "="));
					selectSmsAccount(map.get(mapKeys.get(38)).toString());
					sendTextInSmsBody(map.get(mapKeys.get(40)).toString().replaceAll("::", "="));
					selectFcmAccount(map.get(mapKeys.get(41)).toString());
					sendTextInFcmBody(map.get(mapKeys.get(43)).toString().replaceAll("::", "="));
				}
			}
			if (map.get(mapKeys.get(8)).toString().equalsIgnoreCase(IsYes)) {
				clickOnNextBtn();
				if (!map.get(mapKeys.get(34)).toString().isEmpty()) {
					selectRefundEmailAccount(map.get(mapKeys.get(34)).toString());
					sendRefundTextInEmailSubject(map.get(mapKeys.get(36)).toString());
					sendRefundTextInEmailBody(map.get(mapKeys.get(37)).toString().replaceAll("::", "="));
					selectRefundSmsAccount(map.get(mapKeys.get(38)).toString());
					sendRefundTextInSmsBody(map.get(mapKeys.get(40)).toString().replaceAll("::", "="));
					selectRefundFcmAccount(map.get(mapKeys.get(41)).toString());
					sendRefundTextInFcmBody(map.get(mapKeys.get(43)).toString().replaceAll("::", "="));
					clickOnSaveBtn();
				} else {
					clickOnSaveBtn();
				}
			} else {
				clickOnSaveBtn();
			}
		}
	}

	/**
	 * @author kutbuddin.compounder to Edit Product Manager
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 24/10/2018
	 */
	public void editProductManager(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(10)).toString());
		clickOnInfoBtn(map.get(mapKeys.get(3)).toString());
		clickOnEditBtnProductInfo();
		sendTextInDescription(map.get(mapKeys.get(5)).toString());
		selectVendorProductName(map.get(mapKeys.get(7)).toString());
		selectaAllowMinorCurrency(map.get(mapKeys.get(8)).toString());
		selectAllowRefund(map.get(mapKeys.get(9)).toString());
		selectStatus(map.get(mapKeys.get(11)).toString());
		String[] accessInfoChannel = map.get(mapKeys.get(16)).toString().split(",");
		for (int i = 0; i < accessInfoChannel.length; i++) {
			By accesInfo = By.xpath("//div[text()[normalize-space() = '" + accessInfoChannel[i].trim() + "']]");
			clickAccesInfo(accesInfo);
		}
		if (map.get(mapKeys.get(0)).toString().equalsIgnoreCase(ConstantsFile.BILL_PAY)
				|| map.get(mapKeys.get(0)).toString().equalsIgnoreCase(ConstantsFile.PIN)) {
			if (!map.get(mapKeys.get(46)).toString().trim().isEmpty()) {
				sendTextInFeildTitleInEn(map.get(mapKeys.get(46)).toString());
				sendTextInFeildTitleInEs(map.get(mapKeys.get(46)).toString());
			}
			// sendTextInFeildTitleInFr(map.get(mapKeys.get(15)).toString());
			selectRequiredInFeild(map.get(mapKeys.get(48)).toString());
			// selectFeildTxRefrence(map.get(mapKeys.get(48)).toString());
			sendTextInFeildResponseDiscrptionEs(map.get(mapKeys.get(51)).toString());
			sendTextInFeildResponseDiscrptionEn(map.get(mapKeys.get(51)).toString());
			if (map.get(mapKeys.get(49)).toString().equalsIgnoreCase("Number")
					|| map.get(mapKeys.get(49)).toString().equalsIgnoreCase("String")
					|| map.get(mapKeys.get(49)).toString().equalsIgnoreCase("Decimal")) {
				sendTextInFeildMinLength(map.get(mapKeys.get(52)).toString());
				sendTextInFeildMaxLength(map.get(mapKeys.get(53)).toString());
			} else if (map.get(mapKeys.get(49)).toString().equalsIgnoreCase("Dropdown")
					|| map.get(mapKeys.get(49)).toString().equalsIgnoreCase("Radio")
					|| map.get(mapKeys.get(49)).toString().equalsIgnoreCase("MultiSelect")
					|| map.get(mapKeys.get(49)).toString().equalsIgnoreCase("CheckBox")) {
				String[] Keys = map.get(mapKeys.get(54)).toString().split(",");
				String[] Values = map.get(mapKeys.get(55)).toString().split(",");
				int length = Keys.length;
				for (int i = 0; i < Keys.length; i++) {
					sendTextInKey(Keys[i].trim());
					sendTextInValue(Values[i].trim());
					if (i < length - 1) {
						clickAddNewKey();
					}
				}
			}
			// sendTextInRefResponseDiscrptionFr(map.get(mapKeys.get(21)).toString());
			sendTextInPhoneTitleInEn(map.get(mapKeys.get(24)).toString());
			sendTextInPhoneTitleInEs(map.get(mapKeys.get(24)).toString());
			// sendTextInPhoneTitleInFr(map.get(mapKeys.get(24)).toString());
			if (!map.get(mapKeys.get(25)).toString().isEmpty()) {
				sendTextInPhoneRegularExp(map.get(mapKeys.get(25)).toString());
			}
			selectRequiredInPhone(map.get(mapKeys.get(26)).toString());
			sendTextInPhoneMinLength(map.get(mapKeys.get(27)).toString());
			sendTextInPhoneMaxLength(map.get(mapKeys.get(28)).toString());
			selectPhoneTxRefrence(map.get(mapKeys.get(29)).toString());
			sendTextInPhoneResponseDiscrptionEs(map.get(mapKeys.get(30)).toString());
			sendTextInPhoneResponseDiscrptionEn(map.get(mapKeys.get(30)).toString());
			// sendTextInPhoneResponseDiscrptionFr(map.get(mapKeys.get(28)).toString());
			sendTextInEmailTitleInEn(map.get(mapKeys.get(31)).toString());
			sendTextInEmailTitleInEs(map.get(mapKeys.get(31)).toString());
			// sendTextInEmailTitleInFr(map.get(mapKeys.get(29)).toString());
			selectRequiredInEmail(map.get(mapKeys.get(33)).toString());
			selectEmailtxRefrence(map.get(mapKeys.get(34)).toString());
			sendTextInEmailResponseDiscrptionEs(map.get(mapKeys.get(35)).toString());
			sendTextInEmailResponseDiscrptionEn(map.get(mapKeys.get(35)).toString());
		} else {
			/*
			 * if (!map.get(mapKeys.get(17)).toString().trim().isEmpty()) {
			 * sendTextInRefTitleInEn(map.get(mapKeys.get(17)).toString());
			 * sendTextInRefTitleInEs(map.get(mapKeys.get(17)).toString()); }
			 */
			// sendTextInRefTitleInFr(map.get(mapKeys.get(15)).toString());
			if (!map.get(mapKeys.get(18)).toString().isEmpty()) {
				sendTextInRefRegularExp(map.get(mapKeys.get(18)).toString());
			}
			selectRefTxRefrence(map.get(mapKeys.get(19)).toString());
			selectRefUseAsPhone(map.get(mapKeys.get(20)).toString());
			sendTextInRefMinLength(map.get(mapKeys.get(21)).toString());
			sendTextInRefMaxLength(map.get(mapKeys.get(22)).toString());
			sendTextInRefResponseDiscrptionEs(map.get(mapKeys.get(23)).toString());
			sendTextInRefResponseDiscrptionEn(map.get(mapKeys.get(23)).toString());
			// sendTextInRefResponseDiscrptionFr(map.get(mapKeys.get(21)).toString());
			// sendTextInRefResponseDiscrptionFr(map.get(mapKeys.get(21)).toString());
			sendTextInPhoneTitleInEn(map.get(mapKeys.get(24)).toString());
			sendTextInPhoneTitleInEs(map.get(mapKeys.get(24)).toString());
			// sendTextInPhoneTitleInFr(map.get(mapKeys.get(24)).toString());
			if (!map.get(mapKeys.get(25)).toString().isEmpty()) {
				sendTextInPhoneRegularExp(map.get(mapKeys.get(25)).toString());
			}
			selectRequiredInPhone(map.get(mapKeys.get(26)).toString());
			sendTextInPhoneMinLength(map.get(mapKeys.get(27)).toString());
			sendTextInPhoneMaxLength(map.get(mapKeys.get(28)).toString());
			selectPhoneTxRefrence(map.get(mapKeys.get(29)).toString());
			sendTextInPhoneResponseDiscrptionEs(map.get(mapKeys.get(30)).toString());
			sendTextInPhoneResponseDiscrptionEn(map.get(mapKeys.get(30)).toString());
			// sendTextInPhoneResponseDiscrptionFr(map.get(mapKeys.get(28)).toString());
			sendTextInEmailTitleInEn(map.get(mapKeys.get(31)).toString());
			sendTextInEmailTitleInEs(map.get(mapKeys.get(31)).toString());
			// sendTextInEmailTitleInFr(map.get(mapKeys.get(29)).toString());
			selectRequiredInEmail(map.get(mapKeys.get(33)).toString());
			selectEmailtxRefrence(map.get(mapKeys.get(34)).toString());
			sendTextInEmailResponseDiscrptionEs(map.get(mapKeys.get(35)).toString());
			sendTextInEmailResponseDiscrptionEn(map.get(mapKeys.get(35)).toString());

		}
		if (!map.get(mapKeys.get(36)).toString().isEmpty()) {
			selectEmailAccount(map.get(mapKeys.get(36)).toString());
			sendTextInEmailSubject(map.get(mapKeys.get(38)).toString());
			sendTextInEmailBody(map.get(mapKeys.get(39)).toString().toString().replaceAll("::", "="));
			selectSmsAccount(map.get(mapKeys.get(40)).toString());
			sendTextInSmsBody(map.get(mapKeys.get(42)).toString().toString().replaceAll("::", "="));
			selectFcmAccount(map.get(mapKeys.get(43)).toString());
			sendTextInFcmBody(map.get(mapKeys.get(45)).toString().toString().replaceAll("::", "="));
		}
		if (map.get(mapKeys.get(9)).toString().equalsIgnoreCase(IsYes)) {
			if (!map.get(mapKeys.get(36)).toString().isEmpty()) {
				selectRefundEmailAccount(map.get(mapKeys.get(36)).toString());
				sendRefundTextInEmailSubject(map.get(mapKeys.get(38)).toString());
				sendRefundTextInEmailBody(map.get(mapKeys.get(37)).toString().toString().replaceAll("::", "="));
				selectRefundSmsAccount(map.get(mapKeys.get(40)).toString());
				sendRefundTextInSmsBody(map.get(mapKeys.get(42)).toString().toString().replaceAll("::", "="));
				selectRefundFcmAccount(map.get(mapKeys.get(43)).toString());
				sendRefundTextInFcmBody(map.get(mapKeys.get(45)).toString().toString().replaceAll("::", "="));
				clickOnEditBtnProductInfoSave();
			}
		} else {
			clickOnEditBtnProductInfoSave();
		}
		clickOnEditDenom();
		int rows = Integer.parseInt(map.get(mapKeys.get(12)).toString());
		if (map.get(mapKeys.get(4)).toString().equalsIgnoreCase(IsFix)) {
			String[] min = map.get(mapKeys.get(14)).toString().split(",");
			String[] denominationDiscription = map.get(mapKeys.get(13)).toString().split(",");
			for (int m = 0; m < rows; m++) {
				sendTextWithRemoveReadOnlyProperty(denominationDiscription[m], txtdenominationDiscription);
				sendTextWithRemoveReadOnlyProperty(min[m].trim(), txtMinAmount);
				if (m < rows - 1) {
					clickOnAddBtn();
				}
			}
			clickOndenomSave();
		} else {
			String[] min = map.get(mapKeys.get(14)).toString().split(",");
			String[] max = map.get(mapKeys.get(15)).toString().split(",");
			for (int m = 0; m < rows; m++) {
				if (m == 0) {
					sendTextWithRemoveReadOnlyProperty(min[m].trim(), txtMinAmount);
				}
				sendTextWithRemoveReadOnlyProperty(max[m].trim(), txtMinAmount);
				if (m < rows - 1) {
					clickOnAddBtn();
				}
			}
			clickOndenomSave();
		}
		clickOnBackBtn();
	}

	/**
	 * @author kutbuddin.compounder to verify Product Manager added?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 24/10/2018
	 * @return true if Product Manager added successfully
	 */
	public boolean verifyProductManagerAdded(Map<Object, Object> map, List<Object> keys) {
		By productName = By
				.xpath("//label[normalize-space(text())='Product Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(3)).toString() + "']");
		By operatorName = By
				.xpath("//label[normalize-space(text())='Operator']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(2)).toString() + "']");
		By productType = By
				.xpath("//label[normalize-space(text())='Product Type']//following-sibling :: div[contains(text(),'"
						+ map.get(keys.get(4)).toString() + "')]");
		By moduleName = By
				.xpath("//label[normalize-space(text())='Module Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(0)).toString() + "']");
		By serviceName = By
				.xpath("//label[normalize-space(text())='Service Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(1)).toString() + "']");
		By vendorProduct = By
				.xpath("//label[normalize-space(text())='Vendor Product']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(6)).toString() + "'and @class='vendorNonEdit']");
		By allowMinorCurrency = By
				.xpath("//label[normalize-space(text())='Allow Minor Currency']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(7)).toString() + "' and @class='vendorNonEdit']");
		By allowRefund = By
				.xpath("//label[normalize-space(text())='Allow Refund']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(8)).toString() + "' and @class='vendorNonEdit']");
		By Status = By
				.xpath("//label[normalize-space(text())='Status']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(9)).toString() + "' and @class='vendorNonEdit']");
		filterSearch(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(0)).toString(),
				map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(6)).toString(),
				map.get(getMapKeys(map).get(3)).toString(), map.get(getMapKeys(map).get(9)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString());
			if (!verifyElement(productName, false))
				return false;
			if (!verifyElement(operatorName, false))
				return false;
			if (!verifyElement(productType, false))
				return false;
			if (!verifyElement(moduleName, false))
				return false;
			if (!verifyElement(serviceName, false))
				return false;
			if (!verifyElement(vendorProduct, false))
				return false;
			if (!verifyElement(allowMinorCurrency, false))
				return false;
			if (!verifyElement(allowRefund, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			String[] accessInfoChannel = map.get(keys.get(14)).toString().split(",");
			for (int i = 0; i < accessInfoChannel.length; i++) {
				By accesInfo = By
						.xpath("//*[normalize-space(text())='Access Type']//following :: *[normalize-space(text()) = '"
								+ accessInfoChannel[i].trim() + "'][1]");
				if (!verifyElement(accesInfo, false))
					return false;
			}
			if (!map.get(keys.get(34)).toString().isEmpty()) {
				/*By EmailAccountName = By
						.xpath("(//*[normalize-space(text())='Email Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(34)).toString() + "'])[1]");
				By FcmAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(41)).toString() + "'])[1]");
				By SMSAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(38)).toString() + "'])[1]");
				By refundEmailAccountName = By
						.xpath("(//*[normalize-space(text())='Refund Template']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(34)).toString() + "'])[1]");
				By refundFcmAccountName = By
						.xpath("(//*[normalize-space(text())='Refund Template']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(41)).toString() + "'])[1]");
				By refundSMSAccountName = By
						.xpath("(//*[normalize-space(text())='Refund Template']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(38)).toString() + "'])[1]");
				By EmailFromSubject = By
						.xpath("(//*[normalize-space(text())='Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(36)).toString() + "'])[1]");
				By refundEmailFromSubject = By
						.xpath("(//*[normalize-space(text())='Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(36)).toString() + "'])[2]");*/
				/*
				 * if (!verifyElement(EmailAccountName, false)) return false; if
				 * (!verifyElement(EmailFromSubject, false)) return false; if
				 * (!verifyElement(FcmAccountName, false)) return false; if
				 * (!verifyElement(SMSAccountName, false)) return false; if
				 * (map.get(keys.get(8)).toString().equalsIgnoreCase(IsYes)) {
				 * if (!verifyElement(refundEmailAccountName, false)) return
				 * false; if (!verifyElement(refundEmailFromSubject, false))
				 * return false; if (!verifyElement(refundFcmAccountName,
				 * false)) return false; if
				 * (!verifyElement(refundSMSAccountName, false)) return false; }
				 */
			}
			return true;
		} else
			return false;
	}

	/**
	 * @author kutbuddin.compounder to verify Product Manager edited?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 24/10/2018
	 * @return true if Product Manager edited successfully
	 */
	public boolean verifyProductManagerEdited(Map<Object, Object> map, List<Object> keys) {
		By productName = By
				.xpath("//label[normalize-space(text())='Product Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(3)).toString() + "']");
		By operatorName = By
				.xpath("//label[normalize-space(text())='Operator']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(2)).toString() + "']");
		By productType = By
				.xpath("//label[normalize-space(text())='Product Type']//following-sibling :: div[contains(text(),'"
						+ map.get(keys.get(4)).toString() + "')]");
		By moduleName = By
				.xpath("//label[normalize-space(text())='Module Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(0)).toString() + "']");
		By serviceName = By
				.xpath("//label[normalize-space(text())='Service Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(1)).toString() + "']");
		By vendorProduct = By
				.xpath("//label[normalize-space(text())='Vendor Product']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(7)).toString() + "'and @class='vendorNonEdit']");
		By allowMinorCurrency = By
				.xpath("//label[normalize-space(text())='Allow Minor Currency']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(8)).toString() + "' and @class='vendorNonEdit']");
		By allowRefund = By
				.xpath("//label[normalize-space(text())='Allow Refund']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(9)).toString() + "' and @class='vendorNonEdit']");
		By Status = By
				.xpath("//label[normalize-space(text())='Status']//following-sibling :: div//span[normalize-space(text()) = '"
						+ map.get(keys.get(11)).toString() + "' and @class='vendorNonEdit']");
		filterSearch(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(0)).toString(),
				map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(7)).toString(),
				map.get(getMapKeys(map).get(3)).toString(), map.get(getMapKeys(map).get(11)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString());
			if (!verifyElement(productName, false))
				return false;
			if (!verifyElement(operatorName, false))
				return false;
			if (!verifyElement(productType, false))
				return false;
			if (!verifyElement(moduleName, false))
				return false;
			if (!verifyElement(serviceName, false))
				return false;
			if (!verifyElement(vendorProduct, false))
				return false;
			if (!verifyElement(allowMinorCurrency, false))
				return false;
			if (!verifyElement(allowRefund, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			String[] accessInfoChannel = map.get(keys.get(16)).toString().split(",");
			for (int i = 0; i < accessInfoChannel.length; i++) {
				By accesInfo = By
						.xpath("//*[normalize-space(text())='Access Type']//following :: *[normalize-space(text()) = '"
								+ accessInfoChannel[i].trim() + "'][1]");
				if (!verifyElement(accesInfo, false))
					return false;
			}
			if (!map.get(keys.get(36)).toString().isEmpty()) {
				By EmailAccountName = By
						.xpath("(//*[normalize-space(text())='Email Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(36)).toString() + "'])[1]");
				By FcmAccountName = By
						.xpath("(//*[normalize-space(text())='FCM Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(43)).toString() + "'])[1]");
				By SMSAccountName = By
						.xpath("(//*[normalize-space(text())='SMS Account']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(40)).toString() + "'])[1]");
				By refundEmailAccountName = By
						.xpath("(//*[normalize-space(text())='Refund Template']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(36)).toString() + "'])[1]");
				By refundFcmAccountName = By
						.xpath("(//*[normalize-space(text())='Refund Template']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(43)).toString() + "'])[1]");
				By refundSMSAccountName = By
						.xpath("(//*[normalize-space(text())='Refund Template']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(40)).toString() + "'])[1]");
				By EmailFromSubject = By
						.xpath("(//*[normalize-space(text())='Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(38)).toString() + "'])[1]");
				By refundEmailFromSubject = By
						.xpath("(//*[normalize-space(text())='Subject']//following :: *[normalize-space(text()) = '"
								+ map.get(keys.get(38)).toString() + "'])[2]");

				if (!verifyElement(EmailAccountName, false))
					return false;
				if (!verifyElement(EmailFromSubject, false))
					return false;
				if (!verifyElement(FcmAccountName, false))
					return false;
				if (!verifyElement(SMSAccountName, false))
					return false;
				if (map.get(keys.get(9)).toString().equalsIgnoreCase(IsYes)) {
					if (!verifyElement(refundEmailAccountName, false))
						return false;
					if (!verifyElement(refundEmailFromSubject, false))
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
	 * @author Kutbuddin.compounder to verify Product Manager deleted?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 24/10/2018
	 * @return true if Product Manager deleted successfully
	 */
	public boolean deleteProductManager(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(0)).toString(),
				map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(6)).toString(),
				map.get(getMapKeys(map).get(3)).toString(), map.get(getMapKeys(map).get(9)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString());
			delete();
			return true;
		} else {
			String string = "Product Manager already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyProductExternalManagerDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(0)).toString(),
					map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(6)).toString(),
					map.get(getMapKeys(map).get(3)).toString(), map.get(getMapKeys(map).get(9)).toString());
			return verifyElement(
					By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString().trim() + "'])[1]"), false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify vendor integration log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 18/12/2018
	 * @return true if vendor integration Log successfully Verified
	 */
	public boolean verifyProductExternalManagerLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(0)).toString(),
				map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(7)).toString(),
				map.get(getMapKeys(map).get(3)).toString(), map.get(getMapKeys(map).get(11)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(3)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(3)).toString());
			clickOnLogIconBtn();
			return verifyLogPaginationIcon();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort product product manager
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortProductManager(Map<Object, Object> map, List<Object> mapKeys) {
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
