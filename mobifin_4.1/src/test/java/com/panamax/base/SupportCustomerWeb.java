package com.panamax.base;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

public class SupportCustomerWeb extends Common {
	By eKYCUpdateLink = By.xpath(".//*[@class='kyc_update_link']");
	By txtEmail = By.id("Email");
	By txtFirstName = By.id("FirstName");
	By txtMiddleName = By.id("MiddleName");
	By txtLastName = By.id("LastName");
	By selectRadio = By.xpath(".//*[contains(@id,'lblGender')]");
	By drpIDProofType = By.id("IDProofTypeID");
	By txtIDNumber = By.id("IDNumber");
	By drpCountry = By.id("CountryID");
	By drpState = By.id("CountryStateID");
	By drpMapCode = By.id("MapCodeID");
	By txtAddress1 = By.id("Address1");
	By txtAddress2 = By.id("Address2");
	By btnAddNominee = By.id("btnAddNominee");
	By stripText = By.xpath("(//*[@class='ui-pnotify-text'])[last()]");
	By confirmStopScheduleBtn = By.id("btnConfirmStop");
	By drpsubWallet = By.id("SubWalletBalID");
	By btnDelete = By.xpath("(//*[normalize-space(text())='Delete'])[last()]");
	By drpPocket = By.id("WalletPocketID");
	By btnUnlock = By.xpath("(//*[normalize-space(text())='Unlock'])[last()]");
	By txtResellerAccountName = By.id("ResellerName");
	By drpRetailSegment = By.id("CategoryID");
	By txtAlternatePhone = By.id("AlternatePhone");
	By txtDateOfBirthInFilter = By.id("txtDate");
	By txtTransactionIDFilter = By.id("cmbTransactionID");
	static String requestID;

	/**
	 * @author shivani.patel
	 * @param driver
	 *            constructor
	 * @creation date 29/05/2019
	 */
	public SupportCustomerWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnCustomerDetail() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.CUSTOMER_DETAIL + "']"));
	}

	public void clickOnEKYCUpadate() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.EKYCUPDATE + "']"));
	}

	public void clickOnAccountBlockOrUnblock() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.ACCOUNTBLOCKORUNBLOCK + "']"));
	}

	public void clickOnTerminateAccount() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.TERMINATE_ACCOUNT + "']"));
	}

	public void clickOnLoginPinReset() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.LOGINPIN_RESET + "']"));
	}

	public void clickOnStatementOfAccount() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.STATEMENTOFACCOUNT + "']"));
	}

	public void clickOnPhoneNumberEdit() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.PHONENUMBEREDIT + "']"));
	}

	public void clickOnResetSecurityQuestion() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.RESETSECURITYQUESTION + "']"));
	}

	public void clickOnManageNominee() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.MANAGENOMINEE + "']"));
	}

	public void clickOnStopSchedulePayments() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.STOPSCHELDULEPAYMENTS + "']"));
	}

	public void clickOnDeleteSubWallet() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.DELETE_SUBWALLET + "']"));
	}

	public void clickOnForcePocketUnlock() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.FORCE_POCKET_UNLOCK + "']"));
	}

	public void clickOnTransactionReversal() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.TRANSACTION_REVERSAL + "']"));
	}

	public void clickOnBecomeAgent() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.BECOME_AGENT + "']"));
	}

	public void clickOnResendNotification() {
		clickOnElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.RESEND_NOTIFICATION + "']"));
	}

	/**
	 * @author shivani.patel select value In DropdownFeild
	 * @param value
	 * @creation date 30/05/2019
	 */
	public void selectValueInDropdownFeild(By element, String value) {
		selectFromDropdown(element, value);
	}

	/**
	 * @author shivani.patel Send Text In AdditionslField FileUploader Field
	 * @creation date 30/05/2019
	 */
	public void sendFileInFileUploadField(By element, String FileUploader) {
		sendTextInTextBox(element, resources_folder_path + FileUploader);
	}

	/**
	 * @author shivani.patel send text In StringFeild
	 * @param value
	 * @creation date 30/05/2019
	 */
	public void sendTextInStringFeild(String value, By element) {
		sendTextWithRemoveReadOnlyProperty(value, element);
	}

	/**
	 * @author shivani.patel click on Radio Feild
	 * @param value
	 * @creation date 30/05/2019
	 */
	public void clickOnRadioFeild(By element) {
		clickOnElement(element);
	}

	/**
	 * @author shivani.patel click on CheckBOx Feild
	 * @param value
	 * @creation date 30/05/2019
	 */
	public void clickOnCheckBoxFeild(By element) {
		clickOnElement(element);
	}

	/**
	 * @author shivani.patel send text value In TextFeild
	 * @param value
	 * @creation date 30/05/2019
	 */
	public void sendTextInTextFeild(By element, String value) {
		clearAndSendTextInTextBox(element, value);
	}

	/**
	 * @author shivani.patel Send Text In Email Field
	 * @param Email
	 * @creation date 31/05/2019
	 */
	public void sendTextInEmail(String Email) {
		clearAndSendTextInTextBox(txtEmail, Email);
	}

	/**
	 * @author shivani.patel Send Text In FirstName Field
	 * @param FirstName
	 * @creation date 31/05/2019
	 */
	public void sendTextInFirstName(String FirstName) {
		clearAndSendTextInTextBox(txtFirstName, FirstName);
	}

	/**
	 * @author shivani.patel Send Text In MiddleName Field
	 * @param MiddleName
	 * @creation date 31/05/2019
	 */
	public void sendTextInMiddleName(String MiddleName) {
		clearAndSendTextInTextBox(txtMiddleName, MiddleName);
	}

	/**
	 * @author shivani.patel Send Text In LastName Field
	 * @param LastName
	 * @creation date 31/05/2019
	 */
	public void sendTextInLastName(String LastName) {
		clearAndSendTextInTextBox(txtLastName, LastName);
	}

	/**
	 * @author shivani.patel Select Gender Field
	 * @param Gender
	 * @creation date 31/05/2019
	 */
	public void selectGender(String Gender) {
		clickOnElement(By.xpath(".//*[normalize-space(text())='" + Gender.trim() + "']"));
	}

	/**
	 * @author shivani.patel Select IDProofType
	 * @param IDProofType
	 * @creation date 31/05/2019
	 */
	public void selectIDProofType(String IDProofType) {
		selectFromDropdown(drpIDProofType, IDProofType);
	}

	/**
	 * @author shivani.patel Send Text In IDNumber Field
	 * @param IDNumber
	 * @creation date 31/05/2019
	 */
	public void sendTextInIDNumber(String IDNumber) {
		clearAndSendTextInTextBox(txtIDNumber, IDNumber);
	}

	/**
	 * @author shivani.patel Select Country
	 * @param Country
	 * @creation date 31/05/2019
	 */
	public void selectCountry(String Country) {
		selectFromDropdown(drpCountry, Country);
	}

	/**
	 * @author shivani.patel Select State
	 * @param State
	 * @creation date 31/05/2019
	 */
	public void selectState(String State) {
		selectFromDropdown(drpState, State);
	}

	/**
	 * @author shivani.patel Select MapCode
	 * @param MapCode
	 * @creation date 31/05/2019
	 */
	public void selectMapCode(String MapCode) {
		selectFromDropdown(drpMapCode, MapCode);
	}

	/**
	 * @author shivani.patel Send Text In Address1 Field
	 * @param Address1
	 * @creation date 31/05/2019
	 */
	public void sendTextInAddress1(String Address1) {
		clearAndSendTextInTextBox(txtAddress1, Address1);
	}

	/**
	 * @author shivani.patel Send Text In Address2 Field
	 * @param Address2
	 * @creation date 31/05/2019
	 */
	public void sendTextInAddress2(String Address2) {
		clearAndSendTextInTextBox(txtAddress2, Address2);
	}

	/**
	 * @author shivani.patel clickOn ConfirmStopScheduleBtn
	 * @creation date 06/06/2019
	 */
	public void clickOnConfirmStopSchedule() {
		clickOnElement(confirmStopScheduleBtn);
	}

	/**
	 * @author shivani.patel clickOn support delete button
	 * @creation date 12/06/2019
	 */
	public void clickOnSupportDeleteBtn() {
		clickOnElement(btnDelete);
	}

	/**
	 * @author shivani.patel clickOn support Unlock button
	 * @creation date 13/06/2019
	 */
	public void clickOnSupportUnlockBtn() {
		clickOnElement(btnUnlock);
	}

	/**
	 * @author shivani.patel Select subWallet
	 * @param subWallet
	 * @creation date 12/06/2019
	 */
	public void selectSubWallet(String subWallet) {
		selectFromDropdown(drpsubWallet, subWallet);
	}

	/**
	 * @author shivani.patel Select pocket
	 * @param pocket
	 * @creation date 13/06/2019
	 */
	public void selectPocket(String pocket) {
		selectFromDropdown(drpPocket, pocket);
	}

	/**
	 * @author shivani.patel Send Text In ResellerAccountName Field
	 * @param AgentName
	 * @creation date 13/06/2019
	 */
	public void sendTextInResellerAccountName(String ResellerAccountName) {
		sendTextInTextBox(txtResellerAccountName, ResellerAccountName);
	}

	/**
	 * @author shivani.patel Select RetailSegment
	 * @param RetailSegment
	 * @creation date 13/06/2019
	 */
	public void selectRetailSegment(String RetailSegment) {
		selectFromDropdown(drpRetailSegment, RetailSegment);
	}

	/**
	 * @author shivani.patel Send Text In AlternatePhone Field
	 * @param AlternatePhone
	 * @creation date 13/06/2019
	 */
	public void sendTextInAlternatePhone(String AlternatePhone) {
		sendTextInTextBox(txtAlternatePhone, AlternatePhone);
	}

	/**
	 * @author shivani.patel to send text in dateOfBirth field
	 * @creation data 30/05/2019
	 * 
	 */
	public void sendTextInDateOfBirthInFilter(String str) {
		sendTextWithRemoveReadOnlyProperty(str, txtDateOfBirthInFilter);
	}

	/**
	 * @author shivani.patel Send Text In transactionID Field
	 * @param transactionID
	 * @creation date 13/06/2019
	 */
	public void sendTextInTransactionIDInFilter(String transactionID) {
		sendTextInTextBox(txtTransactionIDFilter, transactionID);
	}

	/**
	 * @author shivani.patel Create addTree Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 29/05/2019
	 */
	public void customerDetail(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		clickOnCustomerDetail();
	}

	/**
	 * @author shivani.patel to verify customerDetail
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/12/2018
	 * @return true if customerDetail is valid
	 */
	public boolean verifyCustomerDetail(Map<Object, Object> map, List<Object> mapKeys) {
		By phoneNumber = By.xpath("//*[@id='divProfileFields']//label[normalize-space(text()) = '"
				+ ConstantsFile.PHONE_NUMBER + "']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(1)).toString() + "']");
		By walletAccountID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.WALLET_ACCOUNT_ID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(1)).toString()
				+ "']");

		if (map.get(mapKeys.get(0)).toString().toLowerCase().equals("phone")) {
			if (!verifyElement(phoneNumber, false)) {
				return false;
			}
		} else {
			if (!verifyElement(walletAccountID, false)) {
				return false;
			}
		}
		clickOnReset();
		return true;
	}

	/**
	 * @author shivani.patel Create eKYCUpdate Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 29/05/2019
	 */
	public void eKYCUpdate(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By.xpath(".//*[@id='account']//following-sibling::span[normalize-space(text())='"
				+ ConstantsFile.EKYCUPDATE + "']"), false)) {
			clickOnEKYCUpadate();
			if (!verifyElement(
					By.xpath(
							".//*[contains(@class,'alert-danger')]//strong[contains(text(),'e-KYC upgrade options is not available')]"),
					false)) {
				clickOnElement(eKYCUpdateLink);
				selectKYCStatus(map.get(mapKeys.get(3)).toString());
				if (map.get(mapKeys.get(4)).toString().trim().length() != 0) {
					sendTextInEmail(map.get(mapKeys.get(4)).toString());
				}
				if (map.get(mapKeys.get(5)).toString().trim().length() != 0) {
					sendTextInFirstName(map.get(mapKeys.get(5)).toString());
				}
				if (map.get(mapKeys.get(6)).toString().trim().length() != 0) {
					sendTextInMiddleName(map.get(mapKeys.get(6)).toString());
				}
				if (map.get(mapKeys.get(7)).toString().trim().length() != 0) {
					sendTextInLastName(map.get(mapKeys.get(7)).toString());
				}
				if (map.get(mapKeys.get(8)).toString().trim().length() != 0) {
					sendTextInDateOfBirth(map.get(mapKeys.get(8)).toString());
				}
				if (map.get(mapKeys.get(9)).toString().trim().length() != 0) {
					selectGender(map.get(mapKeys.get(9)).toString());
				}
				if (map.get(mapKeys.get(10)).toString().trim().length() != 0) {
					selectIDProofType(map.get(mapKeys.get(10)).toString());
					sendTextInIDNumber(map.get(mapKeys.get(11)).toString());
				}
				if (map.get(mapKeys.get(12)).toString().trim().length() != 0) {
					selectCountry(map.get(mapKeys.get(12)).toString());
				}
				if (map.get(mapKeys.get(13)).toString().trim().length() != 0) {
					selectState(map.get(mapKeys.get(13)).toString());
				}
				if (map.get(mapKeys.get(14)).toString().trim().length() != 0) {
					selectMapCode(map.get(mapKeys.get(14)).toString());
				}
				if (map.get(mapKeys.get(15)).toString().trim().length() != 0) {
					sendTextInAddress1(map.get(mapKeys.get(15)).toString());
				}
				if (map.get(mapKeys.get(16)).toString().trim().length() != 0) {
					sendTextInAddress2(map.get(mapKeys.get(16)).toString());
				}

				if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(21)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						selectValueInDropdownFeild(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']//..//select[contains(@id,'subfieldname_') ])[1]"),
								subCategoryField[1].trim());
					}
				}
				if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(17)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendFileInFileUploadField(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
								subCategoryField[1].trim());
					}
				}
				if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(18)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendTextInStringFeild(subCategoryField[1].trim(),
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
					}
				}
				if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(19)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
								+ subCategoryField[1].trim() + "']"));
					}
				}
				if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(20)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] CategoryFeieldSub = CategoryField[i].split(";");
						for (int j = 0; j < CategoryFeieldSub.length; j++) {
							String[] subCategoryField = CategoryFeieldSub[j].split(":");
							clickOnCheckBoxFeild(
									By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
											+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'checkbox')]//following-sibling:: label[normalize-space(text()) = '"
											+ subCategoryField[1].trim() + "']"));
						}
					}
				}
				if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(22)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendTextWithRemoveReadOnlyProperty(subCategoryField[1].trim(),
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
					}
				}
				if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(23)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] CategoryFeieldSub = CategoryField[i].split(";");
						for (int j = 0; j < CategoryFeieldSub.length; j++) {
							String[] subCategoryField = CategoryFeieldSub[j].split(":");
							sendTextInTextFeild(
									By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
											+ "']//..//select[contains(@id,'subfieldname_') and @multiple='']//following-sibling::div//input)[1]"),
									subCategoryField[1].trim());
						}
					}
				}
				if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendTextInTextFeild(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
								subCategoryField[1].trim());
					}
				}
				if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
					String[] CategoryField = map.get(mapKeys.get(25)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendTextInTextFeild(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Number')])[1]"),
								subCategoryField[1].trim());
					}
				}
				sendTextInSupportComment(map.get(mapKeys.get(25)).toString());
				clickOnSubmitRequestBtn();
			} else {
				clickOnReset();
				log("This User Already in Full KYC");
				verifyFalse(true);
			}
		} else {
			log("e-KYC is not available");
			clickOnReset();
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel to verify customerDetail
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/12/2018
	 * @return true if customerDetail is valid
	 */
	public boolean verifyEKYCUpdate(Map<Object, Object> map, List<Object> mapKeys) {
		By phoneNumber = By.xpath("//*[@id='divProfileFields']//label[normalize-space(text()) = '"
				+ ConstantsFile.PHONE_NUMBER + "']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(1)).toString() + "']");
		By walletAccountID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.WALLET_ACCOUNT_ID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(1)).toString()
				+ "']");

		if (map.get(mapKeys.get(0)).toString().toLowerCase().equals("phone")) {
			if (!verifyElement(phoneNumber, false)) {
				return false;
			}
		} else {
			if (!verifyElement(walletAccountID, false)) {
				return false;
			}
		}
		clickOnReset();
		return true;
	}

	/**
	 * @author shivani.patel create profileUpgrade method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 03/06/2019
	 */
	public void profileUpgrade(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By
				.xpath(".//following-sibling::span[normalize-space(text())='" + ConstantsFile.TERMINATE_ACCOUNT + "']"),
				false)) {
			clickOnTerminateAccount();
			sendTextInSupportComment(map.get(mapKeys.get(3)).toString());
			clickOnSubmitRequestBtn();
		} else {
			log("Terimnate Account is not available");
			clickOnReset();
			verifyTrue(true);
		}
	}

	/**
	 * @author shivani.patel to verify terminate account
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 03/06/2019
	 * @return true if account is terminate
	 */
	public boolean verifyProfileUpgrade(Map<Object, Object> map, List<Object> mapKeys) {
		String requestID = getRequestIDText().trim();
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + getRequestIDText().trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		getStriptText();
		commonWait();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel Create accountBlock/unblock Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 31/05/2019
	 */
	public void accountBlockOrUnblock(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By.xpath(
				".//following-sibling::span[normalize-space(text())='" + ConstantsFile.ACCOUNTBLOCKORUNBLOCK + "']"),
				false)) {
			clickOnAccountBlockOrUnblock();
			if (!verifyElement(By.xpath(".//div[@id='pinsetform']//*[contains(@class,'tile-box danger')]"), false)) {
				clickOnBlockLink();
				sendTextInSupportComment(map.get(mapKeys.get(3)).toString());
				clickOnSubmitRequestBtn();
			} else {
				clickOnUnblockLink();
				sendTextInSupportComment(map.get(mapKeys.get(3)).toString());
				clickOnSubmitRequestBtn();
			}
		} else {
			log("Account Block/Unblock is not available");
			clickOnReset();
			verifyTrue(true);
		}
	}

	/**
	 * @author shivani.patel to verify customerDetail
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 31/05/2019
	 * @return true if accountblock/unblock is valid
	 */
	public boolean verifyAccountBlockOrUnblock(Map<Object, Object> map, List<Object> mapKeys) {
		String requestID = getRequestIDText().trim();
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + getRequestIDText().trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		getStriptText();
		commonWait();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create terminate account method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 03/06/2019
	 */
	public void terminateAccount(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By
				.xpath(".//following-sibling::span[normalize-space(text())='" + ConstantsFile.TERMINATE_ACCOUNT + "']"),
				false)) {
			clickOnTerminateAccount();
			if (!verifyElement(By.xpath("//*[@class='tile-footer text-center text-danger']"))) {
				sendTextInSupportComment(map.get(mapKeys.get(3)).toString());
				clickOnSubmitRequestBtn();
			}
			clickOnReset();
		} else {
			log("Terimnate Account is not available");
			clickOnReset();
			verifyTrue(true);
		}
	}

	/**
	 * @author shivani.patel to verify terminate account
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 03/06/2019
	 * @return true if account is terminate
	 */
	public boolean verifyTerminateAccount(Map<Object, Object> map, List<Object> mapKeys) {
		String requestID = getRequestIDText().trim();
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + getRequestIDText().trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		getStriptText();
		commonWait();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create loginPinReset method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 03/06/2019
	 */
	public void loginPinReset(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(
				By.xpath(".//following-sibling::span[normalize-space(text())='" + ConstantsFile.LOGINPIN_RESET + "']"),
				false)) {
			clickOnLoginPinReset();
			selectTerminal();
			sendTextInSupportComment(map.get(mapKeys.get(3)).toString());
			clickOnSubmitRequestBtn();
			requestID = getRequestIDText().trim();
			clickOnReset();
		} else {
			log("loginPinReset is not available");
			clickOnReset();
			verifyTrue(true);
		}
	}

	/**
	 * @author shivani.patel to verify loginPinReset
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 03/06/2019
	 * @return true if loginPinReset successfully
	 */
	public boolean verifyLoginPinReset(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		getStriptText();
		commonWait();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create statementOfAccount method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 03/06/2019
	 */
	public void statementOfAccount(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By.xpath(
				".//following-sibling::span[normalize-space(text())='" + ConstantsFile.STATEMENTOFACCOUNT + "']"),
				false)) {
			clickOnStatementOfAccount();
			if (!map.get(mapKeys.get(3)).toString().equals("")) {
				clickOnEmailBox();
				requestID = getRequestIDText().trim();
			}
			clickOnReset();
			verifyTrue(true);
		} else {
			log("StatementOfAccount is not available");
			clickOnReset();
			verifyTrue(true);
		}
	}

	/**
	 * @author shivani.patel to verify statementOfAccount
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 03/06/2019
	 * @return true if statementOfAccount successfully
	 */
	public boolean verifyStatementOfAccount(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		getStriptText();
		commonWait();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create phoneNumberEdit method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 05/06/2019
	 */
	public void phoneNumberEdit(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(
				By.xpath(".//following-sibling::span[normalize-space(text())='" + ConstantsFile.PHONENUMBEREDIT + "']"),
				false)) {
			clickOnPhoneNumberEdit();
			sendTextInNewPhoneNumber(map.get(mapKeys.get(3)).toString());
			clickOnGenerateOTP();
			sendTextInOTPField(getActivationLinkFromDB());
			clickOnSubmitBtn();
			requestID = getRequestIDText().trim();
		} else {
			log("PhoneNumberEdit is not available");
			clickOnReset();
			verifyTrue(true);
		}
	}

	/**
	 * @author shivani.patel to verify phoneNumberEdit
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 05/06/2019
	 * @return true if phoneNumberEdit successfully
	 */
	public boolean verifyPhoneNumberEdit(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		// getStriptText();
		commonWait();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create resetSecurityQuestion method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 05/06/2019
	 */
	public void resetSecurityQuestion(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By.xpath(
				".//following-sibling::span[normalize-space(text())='" + ConstantsFile.RESETSECURITYQUESTION + "']"),
				false)) {
			clickOnResetSecurityQuestion();
			clickOnYesBtn();
			requestID = getRequestIDText().trim();
			clickOnReset();
		} else {
			log("ResetSecurityQuestion is not available");
			clickOnReset();
			verifyTrue(true);
		}
	}

	/**
	 * @author shivani.patel to verify resetSecurityQuestion
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 05/06/2019
	 * @return true if resetSecurityQuestion successfully
	 */
	public boolean verifyResetSecurityQuestion(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		getStriptText();
		commonWait();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create manageNominee method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 05/06/2019
	 */
	public void manageNominee(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(
				By.xpath(".//following-sibling::span[normalize-space(text())='" + ConstantsFile.MANAGENOMINEE + "']"),
				false)) {
			clickOnManageNominee();
			if (verifyElement(btnAddNominee, false)) {
				clickOnAddNomineeBtn();
				sendTextInFirstName(map.get(mapKeys.get(3)).toString());
				sendTextInLastName(map.get(mapKeys.get(4)).toString());
				sendTextInMiddleName(map.get(mapKeys.get(5)).toString());
				clickOnSaveBtn();
				requestID = getRequestIDText().trim();
				clickOnElement(By.xpath("//div[@class='ui-pnotify-sticker']"));
				clickOnReset();
				clickOnElement(By.xpath("//div[@class='ui-pnotify-sticker']"));
			} else {
				log("AddNominee Button is not available");
				clickOnReset();
				verifyTrue(true);
			}
		} else {
			log("Manage Nominee is not available");
			clickOnReset();
			verifyTrue(true);

		}
	}

	/**
	 * @author shivani.patel to verify manageNominee
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 05/06/2019
	 * @return true if nominee successfully add
	 */
	public boolean verifyManageNominee(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		// getStriptText();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create deleteSubWallet method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 06/06/2019
	 */
	public void deleteSubWallet(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(
				By.xpath(
						".//following-sibling::span[normalize-space(text())='" + ConstantsFile.DELETE_SUBWALLET + "']"),
				false)) {
			clickOnDeleteSubWallet();
			if (!map.get(mapKeys.get(3)).toString().equals("")) {
				selectSubWallet(map.get(mapKeys.get(3)).toString());
				clickOnSupportDeleteBtn();
				requestID = getRequestIDText().trim();
			}
			clickOnReset();
			verifyTrue(true);
		} else {
			log("Delete SubWallet is not available");
			clickOnReset();
			verifyTrue(true);
		}
	}

	/**
	 * @author shivani.patel to verify deleteSubWallet
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 12/06/2019
	 * @return true if deleteSubWallet successfully delete
	 */
	public boolean verifyDeleteSubWallet(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		// getStriptText();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create forcePocketUnlock method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 13/06/2019
	 */
	public void forcePocketUnlock(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By.xpath(
				".//following-sibling::span[normalize-space(text())='" + ConstantsFile.FORCE_POCKET_UNLOCK + "']"),
				false)) {
			clickOnForcePocketUnlock();
			selectPocket(map.get(mapKeys.get(3)).toString());
			clickOnSupportUnlockBtn();
			requestID = getRequestIDText().trim();
			clickOnReset();
		} else {
			log("Force Pocket Unlock is not available");
			clickOnReset();
			verifyTrue(true);

		}
	}

	/**
	 * @author shivani.patel to verify forcePocketUnlock
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 13/06/2019
	 */
	public boolean verifyForcePocketUnlock(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		// getStriptText();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create stopSchedulePayments method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 06/06/2019
	 */
	public void stopSchedulePayments(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By.xpath(
				".//following-sibling::span[normalize-space(text())='" + ConstantsFile.STOPSCHELDULEPAYMENTS + "']"),
				false)) {
			clickOnStopSchedulePayments();
			if (!map.get(mapKeys.get(3)).toString().equals("")) {
				String[] list = map.get(mapKeys.get(3)).toString().split(":");
				for (int i = 0; i < list.length; i++) {
					clickOnElement(
							By.xpath("//td[normalize-space(text())='" + list[i].trim() + "']//preceding-sibling::td"));
				}
				clickOnAddStopScheduleBtn();
				clickOnElement(By.xpath("//*[normalize-space(text())='Confirmation']"));
				clickOnElement(By.xpath("//*[normalize-space(text())='Yes']"));
				// clickOnYesBtn();
				clickOnConfirmStopSchedule();
				requestID = getRequestIDText().trim();
			}
			clickOnReset();
			verifyTrue(true);
		} else {
			log("Stop Schedule Payments is not available");
			clickOnReset();
			verifyTrue(true);

		}
	}

	/**
	 * @author shivani.patel to verify stopSchedulePayments
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 06/06/2019
	 * @return true if stopSchedulePayments successfully stop
	 */
	public boolean verifyStopSchedulePayments(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		// getStriptText();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create transactionReversal method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 13/06/2019
	 */
	public void transactionReversal(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By.xpath(
				".//following-sibling::span[normalize-space(text())='" + ConstantsFile.TRANSACTION_REVERSAL + "']"),
				false)) {
			clickOnTransactionReversal();
			sendTextInDateOfBirthInFilter(map.get(mapKeys.get(3)).toString());
			sendTextInTransactionIDInFilter(map.get(mapKeys.get(4)).toString());
			clickOnFilterSearchBtn();
			clickOnElement(By.xpath("//td[normalize-space(text())='" + map.get(mapKeys.get(4)).toString().trim()
					+ "']//preceding-sibling::td//button[@id='btnSupportRefund']"));
			sendTextInSupportDeleteComment(map.get(mapKeys.get(5)).toString());
			clickOnElement(By.xpath("//*[normalize-space(text())='Yes']"));
		} else {
			log("Transaction Reversal is not available");
			clickOnReset();
			verifyTrue(true);

		}
	}

	/**
	 * @author shivani.patel to verify transactionReversal
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 13/06/2019
	 */
	public boolean verifyTransactionReversal(Map<Object, Object> map, List<Object> mapKeys) {
		requestID = getRequestIDText().trim();
		clickOnReset();
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		// getStriptText();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create becomeAgent method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 13/06/2019
	 */
	public void becomeAgent(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();

		if (verifyElement(
				By.xpath(".//following-sibling::span[normalize-space(text())='" + ConstantsFile.BECOME_AGENT + "']"),
				false)) {
			clickOnBecomeAgent();
			sendTextInResellerAccountName(map.get(mapKeys.get(3)).toString());
			selectRetailSegment(map.get(mapKeys.get(4)).toString());
			sendTextInAlternatePhone(map.get(mapKeys.get(5)).toString());
			if (map.get(mapKeys.get(6)).toString().trim().length() != 0) {
				sendTextInEmail(map.get(mapKeys.get(6)).toString());
			}
			if (map.get(mapKeys.get(7)).toString().trim().length() != 0) {
				sendTextInFirstName(map.get(mapKeys.get(7)).toString());
			}
			if (map.get(mapKeys.get(8)).toString().trim().length() != 0) {
				sendTextInLastName(map.get(mapKeys.get(8)).toString());
			}
			if (map.get(mapKeys.get(9)).toString().trim().length() != 0) {
				sendTextInDateOfBirth(map.get(mapKeys.get(9)).toString());
			}
			if (map.get(mapKeys.get(10)).toString().trim().length() != 0) {
				selectIDProofType(map.get(mapKeys.get(10)).toString());
				sendTextInIDNumber(map.get(mapKeys.get(11)).toString());
			}
			if (map.get(mapKeys.get(12)).toString().trim().length() != 0) {
				selectCountry(map.get(mapKeys.get(12)).toString());
			}
			if (map.get(mapKeys.get(13)).toString().trim().length() != 0) {
				selectState(map.get(mapKeys.get(13)).toString());
			}
			if (map.get(mapKeys.get(14)).toString().trim().length() != 0) {
				selectMapCode(map.get(mapKeys.get(14)).toString());
			}
			if (map.get(mapKeys.get(15)).toString().trim().length() != 0) {
				sendTextInAddress1(map.get(mapKeys.get(15)).toString());
			}
			if (map.get(mapKeys.get(16)).toString().trim().length() != 0) {
				sendTextInAddress2(map.get(mapKeys.get(16)).toString());
			}
			if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(21)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					selectValueInDropdownFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//select[contains(@id,'subfieldname_') ])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(17)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendFileInFileUploadField(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(18)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInStringFeild(subCategoryField[1].trim(), By.xpath("(//label[normalize-space(text()) = '"
							+ subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(19)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
							+ subCategoryField[1].trim() + "']"));
				}
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(20)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						clickOnCheckBoxFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'checkbox')]//following-sibling:: label[normalize-space(text()) = '"
								+ subCategoryField[1].trim() + "']"));
					}
				}
			}
			if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(22)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextWithRemoveReadOnlyProperty(subCategoryField[1].trim(),
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(23)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						sendTextInTextFeild(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']//..//select[contains(@id,'subfieldname_') and @multiple='']//following-sibling::div//input)[1]"),
								subCategoryField[1].trim());
					}
				}
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(25)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Number')])[1]"),
							subCategoryField[1].trim());
				}
			}
			clickOnSaveBtn();
			requestID = getRequestIDText().trim();
		} else {
			log("Become Agent is not available");
			clickOnReset();
			verifyTrue(true);

		}
	}

	/**
	 * @author shivani.patel to verify becomeAgent
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 13/06/2019
	 */
	public boolean verifyBecomeAgent(Map<Object, Object> map, List<Object> mapKeys) {
		By supportRequestID = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.SUPPORT_REQUESTID
				+ "']//following-sibling :: div[normalize-space(text()) = '" + requestID.trim() + "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = 'Completed']");
		// getStriptText();
		sendTextInRequestNumber(requestID);
		clickOnCheckStatusBtn();
		clickOnElement(By.xpath("//*[normalize-space(text())='Support Request Details']"));
		if (!verifyElement(supportRequestID, false)) {
			return false;
		}
		if (!verifyElement(status, false)) {
			return false;
		}
		return true;
	}

	/**
	 * @author shivani.patel create resendNotification method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 13/06/2019
	 */
	public void resendNotification(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnCustomer();
		searchCustomerUser(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString());
		clickOnFilterSearchBtn();
		if (verifyElement(By.xpath(
				".//following-sibling::span[normalize-space(text())='" + ConstantsFile.RESEND_NOTIFICATION + "']"),
				false)) {
			clickOnResendNotification();
			sendTextInDateOfBirthInFilter(map.get(mapKeys.get(3)).toString());
			clickOnFilterSearchBtn();
			if (verifyElement(By.xpath("//*[contains(@class,'dataTables_empty')]"), false)) {
				clickOnReset();
				verifyTrue(true);
			}
		} else {
			log("Resend Notification is not available");
			clickOnReset();
			verifyTrue(true);

		}
	}
}
