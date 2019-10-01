package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class MerchantOnboardingWeb extends Common {
	By drpTreeName = By.id("TreeID");
	By drpTreeProfile = By.id("TreeProfileID");
	By drpTreeCategory = By.id("TreeCategoryLevel");
	By drpKYCStatus = By.id("KycStatus");
	By txtPhoneNumber = By.id("Phone");
	By txtAlternatePhone = By.id("AlternatePhone");
	By txtEmail = By.id("Email");
	By drpRetailSegment = By.id("CategoryID");
	By txtCode = By.id("Code");
	By txtFirstName = By.id("FirstName");
	By txtLastName = By.id("LastName");
	By txtMerchantName = By.id("MerchantName");
	By txtDateOfBirth = By.id("DOB");
	By drpIDProofType = By.id("IDProofTypeID");
	By txtIDNumber = By.id("IDNumber");
	By drpCountry = By.id("CountryID");
	By drpState = By.id("CountryStateID");
	By drpMapCode = By.id("MapCodeID");
	By txtCity = By.id("City");
	By txtAddress1 = By.id("Address1");
	By txtAddress2 = By.id("Address2");
	By txtMerchantNameInSearch = By.id("txtSearchMerchantName");
	By txtAccountNameInSearch = By.id("txtAccountName");
	By txtEmailAddressInSearch = By.id("txtSearchEmail");
	By txtPhoneInSearch = By.id("txtPhone");
	By drpCountryInSearch = By.id("CountryID");
	By drpStateInSearch = By.id("CountryStateID");
	By drpTreeNameInSearch = By.id("TreeID");
	By drpProfileNameInSearch = By.id("cmbTreeProfileID");
	By drpKYCTypeInSearch = By.id("cmbKycStatus");
	By drpRetailSegmentInSearch = By.id("cmbCategoryID");
	By drpStatusInSearch = By.id("cmbIsActive");
	By drpStatus = By.id("IsActive");
	By homeButton = By.xpath("//*[normalize-space(text())='home'][1]");

	public MerchantOnboardingWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder Select TreeName
	 * @param TreeName
	 * @creation date 12/11/2018
	 */
	public void selectTreeName(String TreeName) {
		selectFromDropdown(drpTreeName, TreeName);
	}

	/**
	 * @author kutbuddin.compounder Select TreeCategory
	 * @param TreeCategory
	 * @creation date 12/11/2018
	 */
	public void selectTreeCategory(String TreeCategory) {
		selectFromDropdown(drpTreeCategory, TreeCategory);
	}

	/**
	 * @author kutbuddin.compounder Select TreeProfile
	 * @param TreeProfile
	 * @creation date 12/11/2018
	 */
	public void selectTreeProfile(String TreeProfile) {
		selectFromDropdown(drpTreeProfile, TreeProfile);
	}

	/**
	 * @author kutbuddin.compounder Select KYCStatus
	 * @param KYCStatus
	 * @creation date 12/11/2018
	 */
	public void selectKYCStatus(String KYCStatus) {
		selectFromDropdown(drpKYCStatus, KYCStatus);
	}

	/**
	 * @author kutbuddin.compounder Send Text In PhoneNumber Field
	 * @param PhoneNumber
	 * @creation date 12/11/2018
	 */
	public void sendTextInPhoneNumber(String PhoneNumber) {
		sendTextInTextBox(txtPhoneNumber, PhoneNumber);
	}

	/**
	 * @author kutbuddin.compounder Send Text In AlternatePhone Field
	 * @param AlternatePhone
	 * @creation date 12/11/2018
	 */
	public void sendTextInAlternatePhone(String AlternatePhone) {
		sendTextInTextBox(txtAlternatePhone, AlternatePhone);
	}

	/**
	 * @author kutbuddin.compounder Send Text In Email Field
	 * @param Email
	 * @creation date 12/11/2018
	 */
	public void sendTextInEmail(String Email) {
		sendTextInTextBox(txtEmail, Email);
	}

	/**
	 * @author kutbuddin.compounder Select RetailSegment
	 * @param RetailSegment
	 * @creation date 12/11/2018
	 */
	public void selectRetailSegment(String RetailSegment) {
		selectFromDropdown(drpRetailSegment, RetailSegment);
	}

	/**
	 * @author kutbuddin.compounder Send Text In Code Field
	 * @param Code
	 * @creation date 12/11/2018
	 */
	public void sendTextInCode(String Code) {
		sendTextInTextBox(txtCode, Code);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FirstName Field
	 * @param FirstName
	 * @creation date 12/11/2018
	 */
	public void sendTextInFirstName(String FirstName) {
		sendTextInTextBox(txtFirstName, FirstName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In LastName Field
	 * @param LastName
	 * @creation date 12/11/2018
	 */
	public void sendTextInLastName(String LastName) {
		sendTextInTextBox(txtLastName, LastName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In MerchantName Field
	 * @param MerchantName
	 * @creation date 12/11/2018
	 */
	public void sendTextInMerchantName(String MerchantName) {
		sendTextInTextBox(txtMerchantName, MerchantName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In DateOfBirth Field
	 * @param DateOfBirth
	 * @creation date 12/11/2018
	 */
	public void sendTextInDateOfBirth(String DateOfBirth) {
		sendTextWithRemoveReadOnlyProperty(DateOfBirth, txtDateOfBirth);
	}

	/**
	 * @author kutbuddin.compounder Select IDProofType
	 * @param IDProofType
	 * @creation date 13/11/2018
	 */
	public void selectIDProofType(String IDProofType) {
		selectFromDropdown(drpIDProofType, IDProofType);
	}

	/**
	 * @author kutbuddin.compounder Send Text In IDNumber Field
	 * @param IDNumber
	 * @creation date 13/11/2018
	 */
	public void sendTextInIDNumber(String IDNumber) {
		sendTextInTextBox(txtIDNumber, IDNumber);
	}

	/**
	 * @author kutbuddin.compounder Select Country
	 * @param Country
	 * @creation date 13/11/2018
	 */
	public void selectCountry(String Country) {
		selectFromDropdown(drpCountry, Country);
	}

	/**
	 * @author kutbuddin.compounder Select State
	 * @param State
	 * @creation date 13/11/2018
	 */
	public void selectState(String State) {
		selectFromDropdown(drpState, State);
	}

	/**
	 * @author kutbuddin.compounder Select MapCode
	 * @param MapCode
	 * @creation date 13/11/2018
	 */
	public void selectMapCode(String MapCode) {
		selectFromDropdown(drpMapCode, MapCode);
	}

	/**
	 * @author kutbuddin.compounder Send Text In City Field
	 * @param City
	 * @creation date 13/11/2018
	 */
	public void sendTextInCity(String City) {
		sendTextInTextBox(txtCity, City);
	}

	/**
	 * @author kutbuddin.compounder Send Text In Address1 Field
	 * @param Address1
	 * @creation date 13/11/2018
	 */
	public void sendTextInAddress1(String Address1) {
		sendTextInTextBox(txtAddress1, Address1);
	}

	/**
	 * @author kutbuddin.compounder Send Text In Address2 Field
	 * @param Address2
	 * @creation date 13/11/2018
	 */
	public void sendTextInAddress2(String Address2) {
		sendTextInTextBox(txtAddress2, Address2);
	}

	/**
	 * @author kutbuddin.compounder Send Text Field
	 * @param MerchantName
	 * @creation date 30/11/2018
	 */
	public void sendTextInTextField(By element, String Field) {
		sendTextInTextBox(element, Field);
	}

	/**
	 * @author kutbuddin.compounder Send Text In AdditionslField FileUploader
	 *         Field
	 * @creation date 21/11/2018
	 */
	public void sendFileInFileUploadField(By element, String FileUploader) {
		sendTextInTextBox(element, resources_folder_path + FileUploader);
	}

	/**
	 * @author kutbuddin.compounder Send Text MerchantName In FilterSearch Field
	 * @param MerchantName
	 * @creation date 30/11/2018
	 */
	public void sendTextInMerchantNameInFilterSearch(String FirstName) {
		clearAndSendTextInTextBox(txtMerchantNameInSearch, FirstName);
	}

	/**
	 * @author kutbuddin.compounder Send Text AccountName In FilterSearch Field
	 * @param AccountName
	 * @creation date 30/11/2018
	 */
	public void sendTextInAccountNameInFilterSearch(String AccountName) {
		clearAndSendTextInTextBox(txtAccountNameInSearch, AccountName);
	}

	/**
	 * @author kutbuddin.compounder Send Text EmailAddress In FilterSearch Field
	 * @param EmailAddress
	 * @creation date 30/11/2018
	 */
	public void sendTextInEmailAddressInFilterSearch(String EmailAddress) {
		clearAndSendTextInTextBox(txtEmailAddressInSearch, EmailAddress);
	}

	/**
	 * @author kutbuddin.compounder Send Text Phone In FilterSearch Field
	 * @param Phone
	 * @creation date 30/11/2018
	 */
	public void sendTextInPhoneInFilterSearch(String Phone) {
		clearAndSendTextInTextBox(txtPhoneInSearch, Phone);
	}

	/**
	 * @author kutbuddin.compounder Select Country In FilterSearch Field
	 * @param Country
	 * @creation date 30/11/2018
	 */
	public void sendTextInCountryInFilterSearch(String Country) {
		selectFromDropdown(drpCountryInSearch, Country);
	}

	/**
	 * @author kutbuddin.compounder Select State In FilterSearch Field
	 * @param State
	 * @creation date 30/11/2018
	 */
	public void sendTextInStateInFilterSearch(String State) {
		selectFromDropdown(drpStateInSearch, State);
	}

	/**
	 * @author kutbuddin.compounder Select TreeName In FilterSearch Field
	 * @param TreeName
	 * @creation date 30/11/2018
	 */
	public void sendTextInTreeNameInFilterSearch(String TreeName) {
		selectFromDropdown(drpTreeNameInSearch, TreeName);
	}

	/**
	 * @author kutbuddin.compounder Select ProfileName In FilterSearch Field
	 * @param ProfileName
	 * @creation date 30/11/2018
	 */
	public void sendTextInProfileNameInFilterSearch(String ProfileName) {
		selectFromDropdown(drpProfileNameInSearch, ProfileName);
	}

	/**
	 * @author kutbuddin.compounder Select KYCType In FilterSearch Field
	 * @param KYCType
	 * @creation date 30/11/2018
	 */
	public void sendTextInKYCTypeInFilterSearch(String KYCType) {
		selectFromDropdown(drpKYCTypeInSearch, KYCType);
	}

	/**
	 * @author kutbuddin.compounder Select RetailSegment In FilterSearch Field
	 * @param RetailSegment
	 * @creation date 30/11/2018
	 */
	public void sendTextInRetailSegmentInFilterSearch(String RetailSegment) {
		selectFromDropdown(drpRetailSegmentInSearch, RetailSegment);
	}

	/**
	 * @author kutbuddin.compounder Select Status In FilterSearch Field
	 * @param Status
	 * @creation date 30/11/2018
	 */
	public void sendTextInStatusInFilterSearch(String Status) {
		selectFromDropdown(drpStatusInSearch, Status);
	}

	/**
	 * @author kutbuddin.compounder ClickOnSecondLevel Element
	 * @creation date 30/11/2018
	 */
	public void clickOnLevelElement(String MerchantAccountName) {
		clickOnElement(By
				.xpath("//td[@data-title='Status']//div[normalize-space()='Active']//parent::td//preceding-sibling::td[@data-title='Account Name']//a//u[normalize-space(text())='"
						+ MerchantAccountName + "']"));
	}

	/**
	 * @author kutbuddin.compounder send Data In FilterSearch Fields
	 * @param isStatusSelect
	 * @param Status,
	 * @creation date 30/11/2018
	 */
	public void filterSearch(String firstName, String lastname, String AccountName, String Phone, String TreeName,
			String ProfileName, String KYCType, String RetailSegment, String Status, boolean isStatusSelect) {
		clickOnFilterBtn();
		sendTextInMerchantNameInFilterSearch(firstName + lastname);
		sendTextInAccountNameInFilterSearch(AccountName);
		sendTextInPhoneInFilterSearch(Phone);
		sendTextInTreeNameInFilterSearch(TreeName);
		sendTextInProfileNameInFilterSearch(ProfileName);
		sendTextInKYCTypeInFilterSearch(KYCType);
		sendTextInRetailSegmentInFilterSearch(RetailSegment);
		if (isStatusSelect)
			sendTextInStatusInFilterSearch(Status);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder send text value In TextFeild
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void sendTextInTextFeild(By element, String value) {
		clearAndSendTextInTextBox(element, value);
	}

	/**
	 * @author kutbuddin.compounder select value In DropdownFeild
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void selectValueInDropdownFeild(By element, String value) {
		selectFromDropdown(element, value);
	}

	/**
	 * @author kutbuddin.compounder send text In StringFeild
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void sendTextInStringFeild(String value, By element) {
		sendTextWithRemoveReadOnlyProperty(value, element);
	}

	/**
	 * @author kutbuddin.compounder send text In DobFeild
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void sendTextInDobFeild(String value, By element) {
		sendTextWithRemoveReadOnlyProperty(value, element);
	}

	/**
	 * @author kutbuddin.compounder click on Radio Feild
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void clickOnRadioFeild(By element) {
		clickOnElement(element);
	}

	/**
	 * @author shivani.patel Select Status In FilterSearch Field
	 * @param Status
	 * @creation date 15/11/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author kutbuddin.compounder click on CheckBOx Feild
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void clickOnCheckBoxFeild(By element) {
		clickOnElement(element);
	}

	/**
	 * @author kutbuddin.compounder click on clickOnHomeButton
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void clickOnHomeButton() {
		clickOnElement(homeButton);
	}

	/**
	 * @author kutbuddin.compounder to add Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/11/2018
	 */
	public void addOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		if ((map.get(mapKeys.get(12)).toString()).trim().length() != 0) {
			if (map.get(mapKeys.get(12)).toString().contains(",")) {
				String[] parentMerchant = map.get(mapKeys.get(12)).toString().trim().split(",");
				for (int i = 0; i < parentMerchant.length; i++) {
					clickOnLevelElement(parentMerchant[i].trim());
				}
			} else {
				clickOnLevelElement(map.get(mapKeys.get(12)).toString());
			}

		}
		clickOnAddBtn();
		if ((map.get(mapKeys.get(1)).toString()).trim().length() == 0) {
			selectTreeName(map.get(mapKeys.get(0)).toString());
		}
		if ((map.get(mapKeys.get(1)).toString()).trim().length() != 0) {
			selectTreeCategory(map.get(mapKeys.get(1)).toString());
		}
		selectTreeProfile(map.get(mapKeys.get(2)).toString());
		selectKYCStatus(map.get(mapKeys.get(3)).toString());
		sendTextInPhoneNumber(map.get(mapKeys.get(4)).toString());
		sendTextInAlternatePhone(map.get(mapKeys.get(5)).toString());
		if ((map.get(mapKeys.get(6)).toString()).trim().length() != 0) {
			sendTextInEmail(map.get(mapKeys.get(6)).toString());
		}
		selectRetailSegment(map.get(mapKeys.get(7)).toString());
		sendTextInCode(map.get(mapKeys.get(8)).toString());
		sendTextInFirstName(map.get(mapKeys.get(9)).toString());
		sendTextInLastName(map.get(mapKeys.get(10)).toString());
		sendTextInMerchantName(map.get(mapKeys.get(11)).toString());
		sendTextInDateOfBirth(map.get(mapKeys.get(13)).toString());
		if ((map.get(mapKeys.get(14)).toString()).trim().length() != 0) {
			selectIDProofType(map.get(mapKeys.get(14)).toString());
			sendTextInIDNumber(map.get(mapKeys.get(15)).toString());
		}
		if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
			selectCountry(map.get(mapKeys.get(16)).toString());
			selectState(map.get(mapKeys.get(17)).toString());
		}
		if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
			selectMapCode(map.get(mapKeys.get(18)).toString());
		}
		if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
			sendTextInCity(map.get(mapKeys.get(19)).toString());
		}
		if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
			sendTextInAddress1(map.get(mapKeys.get(20)).toString());
		}
		if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
			sendTextInAddress2(map.get(mapKeys.get(21)).toString());
		}
		if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(23)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendFileInFileUploadField(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
						subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInStringFeild(subCategoryField[1].trim(),
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
			}
		}
		if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(25)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
						+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
						+ subCategoryField[1].trim() + "']"));
			}
		}
		if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(26)).toString().split("/");
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
		if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				selectValueInDropdownFeild(By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
						+ "']//..//select[contains(@id,'subfieldname_') ])[1]"), subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(28)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextWithRemoveReadOnlyProperty(subCategoryField[1].trim(),
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
			}
		}
		if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(29)).toString().split("/");
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
		if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(30)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInTextFeild(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
						subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(31)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(31)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInTextFeild(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Number')])[1]"),
						subCategoryField[1].trim());
			}
		}
		clickOnSaveBtn();
	}

	/**
	 * @author kutbuddin.compounder to verify add Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/11/2018
	 */
	public boolean verifyAddedOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By TreeName = By
				.xpath("//*[normalize-space(text()) = 'Tree Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By ProfileName = By
				.xpath("//*[normalize-space(text()) = 'Profile Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By KYCStatus = By
				.xpath("//*[normalize-space(text()) = 'KYC Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By phone = By
				.xpath("//*[normalize-space(text()) = 'Phone Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By Alterphone = By
				.xpath("//*[normalize-space(text()) = 'Alternate Phone']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By Email = By
				.xpath("//*[normalize-space(text()) = 'Email']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By RetailSegment = By
				.xpath("//*[normalize-space(text()) = 'Retail Segment']//following-sibling :: div[contains(text() , '"
						+ map.get(mapKeys.get(7)).toString() + "')]");
		By Code = By.xpath("//*[normalize-space(text()) = 'Code']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(8)).toString() + "']");
		By FirstName = By
				.xpath("//*[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(9)).toString() + "']");
		By LastName = By
				.xpath("//*[normalize-space(text()) = 'Last Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "']");
		By MerchantName = By
				.xpath("//*[normalize-space(text()) = 'Merchant Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "']");
		By DateOfBirth = By
				.xpath("//*[normalize-space(text()) = 'Date Of Birth']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString().replaceAll("/", "-") + "']");
		By IDProofType = By
				.xpath("//*[normalize-space(text()) = 'ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(14)).toString() + "']");
		By IDNUmber = By
				.xpath("//*[normalize-space(text()) = 'ID Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(15)).toString() + "']");
		By Country = By
				.xpath("//*[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(16)).toString() + "']");
		By State = By
				.xpath("//*[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(17)).toString() + "']");
		By MapCode = By
				.xpath("//*[normalize-space(text()) = 'Map Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(18)).toString() + "']");
		By City = By.xpath("//*[normalize-space(text()) = 'City']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(19)).toString() + "']");
		By Address1 = By
				.xpath("//*[normalize-space(text()) = 'Address 1']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(20)).toString() + "']");
		By Address2 = By
				.xpath("//*[normalize-space(text()) = 'Address 2']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(21)).toString() + "']");
		if (verifyElement(homeButton, false)) {
			clickOnHomeButton();
		}
		if ((map.get(mapKeys.get(12)).toString()).trim().length() != 0) {
			String[] parentAgent = map.get(mapKeys.get(12)).toString().trim().split(",");
			for (int i = 0; i < parentAgent.length; i++) {
				clickOnLevelElement(parentAgent[i]);
			}
		}
		filterSearch(map.get(mapKeys.get(9)).toString(), map.get(mapKeys.get(10)).toString(),
				map.get(mapKeys.get(11)).toString(), map.get(mapKeys.get(4)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(7)).toString(),
				map.get(mapKeys.get(22)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='"
				+ (map.get(getMapKeys(map).get(9)).toString() + map.get(getMapKeys(map).get(10)).toString())
				+ "'])[1]"), false)) {
			clickOnInfoBtn((map.get(getMapKeys(map).get(9)).toString() + map.get(getMapKeys(map).get(10)).toString()));
			if (!verifyElement(TreeName, false))
				return false;
			if (!verifyElement(ProfileName, false))
				return false;
			if (!verifyElement(KYCStatus, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(phone, false))
					return false;
				if (!verifyElement(Alterphone, false))
					return false;
				if ((map.get(mapKeys.get(6)).toString()).trim().length() != 0) {
					if (!verifyElement(Email, false))
						return false;
				}
			}
			if (!verifyElement(RetailSegment, false))
				return false;
			if (!verifyElement(Code, false))
				return false;
			if (!verifyElement(FirstName, false))
				return false;
			if (!verifyElement(LastName, false))
				return false;
			if (!verifyElement(MerchantName, false))
				return false;
			if (!verifyElement(DateOfBirth, false))
				return false;
			if ((map.get(mapKeys.get(14)).toString()).trim().length() != 0) {
				if (!verifyElement(IDProofType, false))
					return false;
				if (!verifyElement(IDNUmber, false))
					return false;
			}
			if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
				if (!verifyElement(Country, false))
					return false;
				if (!verifyElement(State, false))
					return false;
				if (!verifyElement(MapCode, false))
					return false;
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				if (!verifyElement(City, false))
					return false;
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				if (!verifyElement(Address1, false))
					return false;
			}
			if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
				if (!verifyElement(Address2, false))
					return false;
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(23)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(25)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(26)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						By chekBoxCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
								+ "')])[1]");
						if (!verifyElement(chekBoxCategory, false))
							return false;
					}
				}
			}
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(29)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						By multiSelectCategory = By.xpath("(//*[normalize-space(text()) = '"
								+ subCategoryField[0].trim() + "']//following-sibling :: div[contains(text() , '"
								+ subCategoryField[1].trim() + "')])[1]");
						if (!verifyElement(multiSelectCategory, false))
							return false;
					}
				}
			}
			if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(30)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(31)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(31)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By numberCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(numberCategory, false))
						return false;
				}
			}
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @author kutbuddin.compounder to edit Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/11/2018
	 */
	public void editOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
			if (map.get(mapKeys.get(16)).toString().contains(",")) {
				String[] parentAgent = map.get(mapKeys.get(16)).toString().trim().split(",");
				for (int i = 0; i < parentAgent.length; i++) {
					clickOnLevelElement(parentAgent[i]);
				}
			} else {
				clickOnLevelElement(map.get(mapKeys.get(16)).toString());
			}

		}
		filterSearch(map.get(mapKeys.get(11)).toString(), map.get(mapKeys.get(13)).toString(),
				map.get(mapKeys.get(15)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(8)).toString(),
				map.get(mapKeys.get(26)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='"
				+ (map.get(getMapKeys(map).get(11)).toString() + map.get(getMapKeys(map).get(13)).toString())
				+ "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(15)).toString());
			clickOnEditBtn();
			selectKYCStatus(map.get(mapKeys.get(4)).toString());
			selectStatus(map.get(mapKeys.get(27)).toString());
			if ((map.get(mapKeys.get(6)).toString()).trim().length() != 0) {
				sendTextInAlternatePhone(map.get(mapKeys.get(6)).toString());
			}
			if ((map.get(mapKeys.get(7)).toString()).trim().length() != 0) {
				sendTextInEmail(map.get(mapKeys.get(7)).toString());
			}
			if ((map.get(mapKeys.get(9)).toString()).trim().length() != 0) {
				selectRetailSegment(map.get(mapKeys.get(9)).toString());
			}
			if ((map.get(mapKeys.get(10)).toString()).trim().length() != 0) {
				sendTextInCode(map.get(mapKeys.get(10)).toString());
			}
			if ((map.get(mapKeys.get(12)).toString()).trim().length() != 0) {
				sendTextInFirstName(map.get(mapKeys.get(12)).toString());
			}
			if ((map.get(mapKeys.get(14)).toString()).trim().length() != 0) {
				sendTextInLastName(map.get(mapKeys.get(14)).toString());
			}
			if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
				sendTextInDateOfBirth(map.get(mapKeys.get(17)).toString());
			}
			if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
				selectIDProofType(map.get(mapKeys.get(18)).toString());
				sendTextInIDNumber(map.get(mapKeys.get(19)).toString());
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				selectCountry(map.get(mapKeys.get(20)).toString());
				selectState(map.get(mapKeys.get(21)).toString());
			}
			if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
				selectMapCode(map.get(mapKeys.get(22)).toString());
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				sendTextInCity(map.get(mapKeys.get(23)).toString());
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				sendTextInAddress1(map.get(mapKeys.get(24)).toString());
			}
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				sendTextInAddress2(map.get(mapKeys.get(25)).toString());
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendFileInFileUploadField(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(29)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInStringFeild(subCategoryField[1].trim(), By.xpath("(//label[normalize-space(text()) = '"
							+ subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(30)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
							+ subCategoryField[1].trim() + "']"));
				}
			}
			if ((map.get(mapKeys.get(31)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(31)).toString().split("/");
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
			if ((map.get(mapKeys.get(32)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(32)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					selectValueInDropdownFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//select[contains(@id,'subfieldname_') ])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(33)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(33)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextWithRemoveReadOnlyProperty(subCategoryField[1].trim(),
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(34)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(34)).toString().split("/");
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
			if ((map.get(mapKeys.get(35)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(35)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(36)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(36)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Number')])[1]"),
							subCategoryField[1].trim());
				}
			}
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author kutbuddin.compounder to verify edited Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/11/2018
	 */
	public boolean verifyEditedOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By KYCStatus = By
				.xpath("//*[normalize-space(text()) = 'KYC Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By Alterphone = By
				.xpath("//*[normalize-space(text()) = 'Alternate Phone']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By Email = By
				.xpath("//*[normalize-space(text()) = 'Email']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "']");
		By RetailSegment = By
				.xpath("//*[normalize-space(text()) = 'Retail Segment']//following-sibling :: div[contains(text() , '"
						+ map.get(mapKeys.get(9)).toString() + "')]");
		By Code = By.xpath("//*[normalize-space(text()) = 'Code']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(10)).toString() + "']");
		By FirstName = By
				.xpath("//*[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(12)).toString() + "']");
		By LastName = By
				.xpath("//*[normalize-space(text()) = 'Last Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(14)).toString() + "']");
		By DateOfBirth = By
				.xpath("//*[normalize-space(text()) = 'Date of Birth']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(17)).toString().replaceAll("/", "-") + "']");
		By IDProofType = By
				.xpath("//*[normalize-space(text()) = 'ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(18)).toString() + "']");
		By IDNUmber = By
				.xpath("//*[normalize-space(text()) = 'ID Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(19)).toString() + "']");
		By Country = By
				.xpath("//*[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(20)).toString() + "']");
		By State = By
				.xpath("//*[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(21)).toString() + "']");
		By MapCode = By
				.xpath("//*[normalize-space(text()) = 'Map Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(22)).toString() + "']");
		By City = By.xpath("//*[normalize-space(text()) = 'City']//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(mapKeys.get(23)).toString() + "']");
		By Address1 = By
				.xpath("//*[normalize-space(text()) = 'Address 1']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(24)).toString() + "']");
		By Address2 = By
				.xpath("//*[normalize-space(text()) = 'Address 2']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(25)).toString() + "']");
		if (verifyElement(homeButton, false)) {
			clickOnHomeButton();
		}
		if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
			if (map.get(mapKeys.get(16)).toString().contains(",")) {
				String[] parentAgent = map.get(mapKeys.get(16)).toString().trim().split(",");
				for (int i = 0; i < parentAgent.length; i++) {
					clickOnLevelElement(parentAgent[i]);
				}
			} else {
				clickOnLevelElement(map.get(mapKeys.get(16)).toString());
			}

		}
		filterSearch(map.get(mapKeys.get(12)).toString(), map.get(mapKeys.get(14)).toString(),
				map.get(mapKeys.get(15)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(8)).toString(),
				map.get(mapKeys.get(27)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(15)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(15)).toString());
			if (!verifyElement(KYCStatus, false))
				return false;
			if (maskingAllowed) {
				if ((map.get(mapKeys.get(6)).toString()).trim().length() != 0) {
					if (!verifyElement(Alterphone, false))
						return false;
				}
				if ((map.get(mapKeys.get(7)).toString()).trim().length() != 0) {
					if (!verifyElement(Email, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(9)).toString()).trim().length() != 0) {
				if (!verifyElement(RetailSegment, false))
					return false;
			}
			if ((map.get(mapKeys.get(10)).toString()).trim().length() != 0) {
				if (!verifyElement(Code, false))
					return false;
			}
			if ((map.get(mapKeys.get(12)).toString()).trim().length() != 0) {
				if (!verifyElement(FirstName, false))
					return false;
			}
			if ((map.get(mapKeys.get(14)).toString()).trim().length() != 0) {
				if (!verifyElement(LastName, false))
					return false;
			}
			if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
				if (!verifyElement(DateOfBirth, false))
					return false;
			}
			if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
				if (!verifyElement(IDProofType, false))
					return false;
				if (!verifyElement(IDNUmber, false))
					return false;
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				if (!verifyElement(Country, false))
					return false;
				if (!verifyElement(State, false))
					return false;
				if (!verifyElement(MapCode, false))
					return false;
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				if (!verifyElement(City, false))
					return false;
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				if (!verifyElement(Address1, false))
					return false;
			}
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				if (!verifyElement(Address2, false))
					return false;
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(29)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(30)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(31)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(31)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						By chekBoxCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
								+ "')])[1]");
						if (!verifyElement(chekBoxCategory, false))
							return false;
					}
				}
			}
			if ((map.get(mapKeys.get(32)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(32)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(33)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(33)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(34)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(34)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						By multiSelectCategory = By.xpath("(//*[normalize-space(text()) = '"
								+ subCategoryField[0].trim() + "']//following-sibling :: div[contains(text() , '"
								+ subCategoryField[1].trim() + "')])[1]");
						if (!verifyElement(multiSelectCategory, false))
							return false;
					}
				}
			}
			if ((map.get(mapKeys.get(35)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(35)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(36)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(36)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By numberCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(numberCategory, false))
						return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author kutbuddin.compounder to delete Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/11/2018
	 */
	public boolean deleteOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		if ((map.get(mapKeys.get(8)).toString()).trim().length() != 0) {
			if (map.get(mapKeys.get(8)).toString().contains(",")) {
				String[] parentAgent = map.get(mapKeys.get(8)).toString().trim().split(",");
				for (int i = 0; i < parentAgent.length; i++) {
					clickOnLevelElement(parentAgent[i]);
				}
			} else {
				clickOnLevelElement(map.get(mapKeys.get(8)).toString());
			}
		}
		filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(7)).toString(), map.get(mapKeys.get(3)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(4)).toString(),
				map.get(mapKeys.get(9)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(7)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(7)).toString());
			if (verifyDeleteBtn())
				delete();
			else
				clickOnBackBtn();
			return true;
		} else {
			String string = "Agent Onboarding already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	/**
	 * @author kutbuddin.compounder to verify delete Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 30/11/2018
	 */
	public boolean verifyOnboardingDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(6)).toString(),
					map.get(mapKeys.get(7)).toString(), map.get(mapKeys.get(3)).toString(),
					map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
					map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(4)).toString(),
					map.get(mapKeys.get(9)).toString(), false);
			return !verifyElement(
					By.xpath("(//td[normalize-space(text())='"
							+ (map.get(getMapKeys(map).get(5)).toString() + map.get(getMapKeys(map).get(6)).toString())
							+ "']//following-sibling::td[@data-title='Status']//div[normalize-space(text())='Delete'])[last()]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify Merchant Onboarding log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/12/2018
	 * @return true if MerchantOnboarding Log successfully Verified
	 */
	public boolean verifyMerchantOnboardingLog(Map<Object, Object> map, List<Object> mapKeys) {
		if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
			String[] parentAgent = map.get(mapKeys.get(16)).toString().trim().split(",");
			for (int i = 0; i < parentAgent.length; i++) {
				clickOnLevelElement(parentAgent[i]);
			}
		}
		filterSearch(map.get(mapKeys.get(12)).toString(), map.get(mapKeys.get(14)).toString(),
				map.get(mapKeys.get(15)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(8)).toString(),
				map.get(mapKeys.get(27)).toString(), false);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(5)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(5)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort merchant onboarding
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 20/12/2018
	 */
	public boolean sortOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
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
