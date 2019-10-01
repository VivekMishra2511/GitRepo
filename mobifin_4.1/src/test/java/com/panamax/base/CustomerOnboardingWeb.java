package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class CustomerOnboardingWeb extends Common {
	By drpProfileName = By.id("ProfileID");
	By drpKYCStatus = By.id("KycStatus");
	By txtPhoneNumber = By.id("Phone");
	By txtEmail = By.id("Email");
	By txtFirstName = By.id("FirstName");
	By txtMiddleName = By.id("MiddleName");
	By txtLastName = By.id("LastName");
	By txtDateOfBirth = By.id("DOB");
	By selectRadio = By.xpath(".//*[contains(@id,'lblGender')]");
	By drpIDProofType = By.id("IDProofTypeID");
	By txtIDNumber = By.id("IDNumber");
	By drpCountry = By.id("CountryID");
	By drpState = By.id("CountryStateID");
	By drpMapCode = By.id("MapCodeID");
	By txtAddress1 = By.id("Address1");
	By txtAddress2 = By.id("Address2");
	By txtFirstNameInSearch = By.id("txtFname");
	By txtLastNameInSearch = By.id("txtLname");
	By txtPhoneNumberInFilterSearch = By.id("txtPhone");
	By drpProfileNameInSearch = By.id("cmbProfileID");
	By drpKYCTypeInSearch = By.id("cmbKycStatus");
	By drpStatus = By.id("IsActive");
	By drpStatusInSearch = By.id("cmbIsActive");

	public CustomerOnboardingWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel Select ProfileName
	 * @param ProfileName
	 * @creation date 21/11/2018
	 */
	public void selectProfileName(String ProfileName) {
		selectFromDropdown(drpProfileName, ProfileName);
	}

	/**
	 * @author shivani.patel Select KYCStatus
	 * @param KYCStatus
	 * @creation date 21/11/2018
	 */
	public void selectKYCStatus(String KYCStatus) {
		selectFromDropdown(drpKYCStatus, KYCStatus);
	}

	/**
	 * @author shivani.patel Send Text In PhoneNumber Field
	 * @param PhoneNumber
	 * @creation date 21/11/2018
	 */
	public void sendTextInPhoneNumber(String PhoneNumber) {
		sendTextInTextBox(txtPhoneNumber, PhoneNumber);
	}

	/**
	 * @author shivani.patel Select Status
	 * @param Status
	 * @creation date 20/11/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author shivani.patel Send Text In Email Field
	 * @param Email
	 * @creation date 21/11/2018
	 */
	public void sendTextInEmail(String Email) {
		clearAndSendTextInTextBox(txtEmail, Email);
	}

	/**
	 * @author shivani.patel Send Text In FirstName Field
	 * @param FirstName
	 * @creation date 21/11/2018
	 */
	public void sendTextInFirstName(String FirstName) {
		clearAndSendTextInTextBox(txtFirstName, FirstName);
	}

	/**
	 * @author shivani.patel Send Text In MiddleName Field
	 * @param MiddleName
	 * @creation date 21/11/2018
	 */
	public void sendTextInMiddleName(String MiddleName) {
		clearAndSendTextInTextBox(txtMiddleName, MiddleName);
	}

	/**
	 * @author shivani.patel Send Text In LastName Field
	 * @param LastName
	 * @creation date 21/11/2018
	 */
	public void sendTextInLastName(String LastName) {
		clearAndSendTextInTextBox(txtLastName, LastName);
	}

	/**
	 * @author shivani.patel Send Text In DateOfBirth Field
	 * @param DateOfBirth
	 * @creation date 21/11/2018
	 */
	public void sendTextInDateOfBirth(String DateOfBirth) {
		sendTextWithRemoveReadOnlyProperty(DateOfBirth, txtDateOfBirth);
	}

	/**
	 * @author shivani.patel Select Gender Field
	 * @param Gender
	 * @creation date 21/11/2018
	 */
	public void selectGender(String Gender) {
		clickOnElement(By.xpath(".//*[normalize-space(text())='" + Gender.trim() + "']"));
	}

	/**
	 * @author shivani.patel Select IDProofType
	 * @param IDProofType
	 * @creation date 21/11/2018
	 */
	public void selectIDProofType(String IDProofType) {
		selectFromDropdown(drpIDProofType, IDProofType);
	}

	/**
	 * @author shivani.patel Send Text In IDNumber Field
	 * @param IDNumber
	 * @creation date 21/11/2018
	 */
	public void sendTextInIDNumber(String IDNumber) {
		clearAndSendTextInTextBox(txtIDNumber, IDNumber);
	}

	/**
	 * @author shivani.patel Select Country
	 * @param Country
	 * @creation date 21/11/2018
	 */
	public void selectCountry(String Country) {
		selectFromDropdown(drpCountry, Country);
	}

	/**
	 * @author shivani.patel Select State
	 * @param State
	 * @creation date 21/11/2018
	 */
	public void selectState(String State) {
		selectFromDropdown(drpState, State);
	}

	/**
	 * @author shivani.patel Select MapCode
	 * @param MapCode
	 * @creation date 21/11/2018
	 */
	public void selectMapCode(String MapCode) {
		selectFromDropdown(drpMapCode, MapCode);
	}

	/**
	 * @author shivani.patel Send Text In Address1 Field
	 * @param Address1
	 * @creation date 21/11/2018
	 */
	public void sendTextInAddress1(String Address1) {
		clearAndSendTextInTextBox(txtAddress1, Address1);
	}

	/**
	 * @author shivani.patel Send Text In Address2 Field
	 * @param Address2
	 * @creation date 21/11/2018
	 */
	public void sendTextInAddress2(String Address2) {
		clearAndSendTextInTextBox(txtAddress2, Address2);
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
	 * @author shivani.patel Send Text In AdditionslField
	 * @creation date 21/11/2018
	 */
	public void sendTextInTextField(By element, String Field) {
		clearAndSendTextInTextBox(element, Field);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FilterSearch Field
	 * @creation date 26/11/2018
	 */
	public void filterSearch(String firstName, String lastName, String phoneNumber, String profileName,
			String KYCType,String status) {
		filterSearch();
		sendTextInFirstNameInSearch(firstName);
		sendTextInLastNameInSearch(lastName);
		sendTextInPhoneNumberInSearch(phoneNumber);
		sendTextInProfileNameInFilterSearch(profileName);
		sendTextInKYCTypeInFilterSearch(KYCType);
		if(status.length()>2)
			selectStatusInFilterSearch(status);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder Select KYCType In FilterSearch Field
	 * @param KYCType
	 * @creation date 26/11/2018
	 */
	public void sendTextInKYCTypeInFilterSearch(String KYCType) {
		selectFromDropdown(drpKYCTypeInSearch, KYCType);
	}

	/**
	 * @author kutbuddin.compounder Select Status In FilterSearch Field
	 * @param Status
	 * @creation date 26/11/2018
	 */
	public void selectStatusInFilterSearch(String Status) {
		selectFromDropdown(drpStatusInSearch, Status);
	}

	/**
	 * @author kutbuddin.compounder Select ProfileName In FilterSearch Field
	 * @param ProfileName
	 * @creation date 26/11/2018
	 */
	public void sendTextInProfileNameInFilterSearch(String ProfileName) {
		selectFromDropdown(drpProfileNameInSearch, ProfileName);
	}

	/**
	 * @author kutbuddin.compounder send Text firstName In FilterSearch Field
	 * @param firstName
	 * @creation date 26/11/2018
	 */
	public void sendTextInFirstNameInSearch(String firstName) {
		clearAndSendTextInTextBox(txtFirstNameInSearch, firstName);
	}

	/**
	 * @author kutbuddin.compounder send Text phonenumber In FilterSearch Field
	 * @param phonenumber
	 * @creation date 26/11/2018
	 */
	public void sendTextInPhoneNumberInSearch(String phonenumber) {
		clearAndSendTextInTextBox(txtPhoneNumberInFilterSearch, phonenumber);
	}

	/**
	 * @author kutbuddin.compounder send text lastName In FilterSearch Field
	 * @param lastName
	 * @creation date 26/11/2018
	 */
	public void sendTextInLastNameInSearch(String lastName) {
		clearAndSendTextInTextBox(txtLastNameInSearch, lastName);
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
	 * @author kutbuddin.compounder click on CheckBOx Feild
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void clickOnCheckBoxFeild(By element) {
		clickOnElement(element);
	}

	/**
	 * @author shivani.patel
	 * @updated kutbuddin.compounder to add Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 21/11/2018
	 * @updation Date 22/11/2018
	 */
	public void addOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectProfileName(map.get(mapKeys.get(0)).toString());
		selectKYCStatus(map.get(mapKeys.get(1)).toString());
		sendTextInPhoneNumber(map.get(mapKeys.get(2)).toString());
		if (map.get(mapKeys.get(3)).toString().trim().length() != 0) {
			sendTextInEmail(map.get(mapKeys.get(3)).toString());
		}
		sendTextInFirstName(map.get(mapKeys.get(4)).toString());
		if (map.get(mapKeys.get(5)).toString().trim().length() != 0) {
			sendTextInMiddleName(map.get(mapKeys.get(5)).toString());
		}
		sendTextInLastName(map.get(mapKeys.get(6)).toString());
		sendTextInDateOfBirth(map.get(mapKeys.get(7)).toString());
		if (map.get(mapKeys.get(8)).toString().trim().length() != 0) {
			selectGender(map.get(mapKeys.get(8)).toString());
		}
		if (map.get(mapKeys.get(9)).toString().trim().length() != 0) {
			selectIDProofType(map.get(mapKeys.get(9)).toString());
			sendTextInIDNumber(map.get(mapKeys.get(10)).toString());
		}
		if (map.get(mapKeys.get(11)).toString().trim().length() != 0) {
			selectCountry(map.get(mapKeys.get(11)).toString());
		}
		if (map.get(mapKeys.get(12)).toString().trim().length() != 0) {
			selectState(map.get(mapKeys.get(12)).toString());
		}
		if (map.get(mapKeys.get(13)).toString().trim().length() != 0) {
			selectMapCode(map.get(mapKeys.get(13)).toString());
		}
		if (map.get(mapKeys.get(14)).toString().trim().length() != 0) {
			sendTextInAddress1(map.get(mapKeys.get(14)).toString());
		}
		if (map.get(mapKeys.get(15)).toString().trim().length() != 0) {
			sendTextInAddress2(map.get(mapKeys.get(15)).toString());
		}
		if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(20)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				selectValueInDropdownFeild(By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
						+ "']//..//select[contains(@id,'subfieldname_') ])[1]"), subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(16)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendFileInFileUploadField(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
						subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(17)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInStringFeild(subCategoryField[1].trim(),
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
			}
		}
		if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(18)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
						+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
						+ subCategoryField[1].trim() + "']"));
			}
		}
		if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(19)).toString().split("/");
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
		if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(21)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextWithRemoveReadOnlyProperty(subCategoryField[1].trim(),
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
			}
		}
		if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(22)).toString().split("/");
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
		if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(23)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInTextFeild(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
						subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
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
	 * @creation date 26/11/2018
	 */
	public boolean verifyAddedOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By ProfileName = By
				.xpath("//*[normalize-space(text()) = 'Profile']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By KYCStatus = By
				.xpath("//*[normalize-space(text()) = 'KYC Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By phone = By
				.xpath("(//*[normalize-space(text()) = 'Phone Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "'])[1]");
		By Email = By
				.xpath("(//*[normalize-space(text()) = 'Email']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "'])[1]");
		By FirstName = By
				.xpath("(//*[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "'])[1]");
		By middleName = By
				.xpath("(//*[normalize-space(text()) = 'Middle Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "'])[1]");
		By LastName = By
				.xpath("(//*[normalize-space(text()) = 'Last Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "'])[1]");
		By DateOfBirth = By
				.xpath("(//*[normalize-space(text()) = 'Date Of Birth']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "'])[1]");
		By IDProofType = By
				.xpath("(//*[normalize-space(text()) = 'ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(9)).toString() + "'])[1]");
		By IDNUmber = By
				.xpath("(//*[normalize-space(text()) = 'ID Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "'])[1]");
		By gender = By
				.xpath("(//*[normalize-space(text()) = 'Gender']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "'])[1]");
		By Country = By
				.xpath("(//*[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "'])[1]");
		By State = By
				.xpath("(//*[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(12)).toString() + "'])[1]");
		By MapCode = By
				.xpath("(//*[normalize-space(text()) = 'Map Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString() + "'])[1]");
		By Address1 = By
				.xpath("(//*[normalize-space(text()) = 'Address 1']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(14)).toString() + "'])[1]");
		By Address2 = By
				.xpath("(//*[normalize-space(text()) = 'Address 2']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(15)).toString() + "'])[1]");
		filterSearch(map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(1)).toString(),map.get(mapKeys.get(25)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(4)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(4)).toString());
			if (!verifyElement(ProfileName, false))
				return false;
			if (!verifyElement(KYCStatus, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(phone, false))
					return false;
				if ((map.get(mapKeys.get(3)).toString()).trim().length() != 0) {
					if (!verifyElement(Email, false))
						return false;
				}
			}
			if (!verifyElement(FirstName, false))
				return false;
			if ((map.get(mapKeys.get(5)).toString()).trim().length() != 0) {
				if (!verifyElement(middleName, false))
					return false;
			}
			if (!verifyElement(LastName, false))
				return false;
			if (!verifyElement(DateOfBirth, false))
				return false;
			if ((map.get(mapKeys.get(9)).toString()).trim().length() != 0) {
				if (!verifyElement(IDProofType, false))
					return false;
				if (!verifyElement(IDNUmber, false))
					return false;
			}
			if ((map.get(mapKeys.get(11)).toString()).trim().length() != 0) {
				if (!verifyElement(Country, false))
					return false;
				if (!verifyElement(State, false))
					return false;
				if (!verifyElement(MapCode, false))
					return false;
			}
			if ((map.get(mapKeys.get(8)).toString()).trim().length() != 0) {
				if (!verifyElement(gender, false))
					return false;
			}
			if ((map.get(mapKeys.get(14)).toString()).trim().length() != 0) {
				if (!verifyElement(Address1, false))
					return false;
			}
			if ((map.get(mapKeys.get(15)).toString()).trim().length() != 0) {
				if (!verifyElement(Address2, false))
					return false;
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(20)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(16)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(17)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(18)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(19)).toString().split("/");
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
			if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(21)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			/*
			 * if((map.get(mapKeys.get(22)).toString()).trim().length()!=0){
			 * String[]
			 * CategoryField=map.get(mapKeys.get(22)).toString().split("/");
			 * for(int i=0;i<CategoryField.length;i++){ String[]
			 * CategoryFeieldSub=CategoryField[i].split(";"); for(int
			 * j=0;j<CategoryFeieldSub.length;j++){ String[]
			 * subCategoryField=CategoryFeieldSub[j].split(":"); By
			 * multiSelectCategory =
			 * By.xpath("(//*[normalize-space(text()) = '"+subCategoryField[0].
			 * trim() +"']//following-sibling :: div[contains(text() , '"
			 * +subCategoryField[1].trim()+"')])[1]");
			 * if(!verifyElement(multiSelectCategory, false)) return false; } }
			 * }
			 */
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(23)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
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
	 * @creation date 26/11/2018
	 */
	public void editOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(6)).toString(), map.get(mapKeys.get(9)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(1)).toString(),map.get(mapKeys.get(29)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(6)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(6)).toString());
			clickOnEditBtn();
			selectKYCStatus(map.get(mapKeys.get(2)).toString());
			selectStatus(map.get(mapKeys.get(29)).toString());
			if (map.get(mapKeys.get(4)).toString().trim().length() != 0) {
				sendTextInPhoneNumber(map.get(mapKeys.get(4)).toString());
			}
			if (map.get(mapKeys.get(5)).toString().trim().length() != 0) {
				sendTextInEmail(map.get(mapKeys.get(5)).toString());
			}
			if (map.get(mapKeys.get(8)).toString().trim().length() != 0) {
				sendTextInFirstName(map.get(mapKeys.get(8)).toString());
			}
			if (map.get(mapKeys.get(8)).toString().trim().length() != 0) {
				sendTextInMiddleName(map.get(mapKeys.get(8)).toString());
			}
			if (map.get(mapKeys.get(10)).toString().trim().length() != 0) {
				sendTextInLastName(map.get(mapKeys.get(10)).toString());
			}
			if (map.get(mapKeys.get(11)).toString().trim().length() != 0) {
				sendTextInDateOfBirth(map.get(mapKeys.get(11)).toString());
			}
			if (map.get(mapKeys.get(12)).toString().trim().length() != 0) {
				selectGender(map.get(mapKeys.get(12)).toString());
			}
			if (map.get(mapKeys.get(13)).toString().trim().length() != 0) {
				selectIDProofType(map.get(mapKeys.get(13)).toString());
				sendTextInIDNumber(map.get(mapKeys.get(14)).toString());
			}
			if (map.get(mapKeys.get(15)).toString().trim().length() != 0) {
				selectCountry(map.get(mapKeys.get(15)).toString());
			}
			if (map.get(mapKeys.get(16)).toString().trim().length() != 0) {
				selectState(map.get(mapKeys.get(16)).toString());
			}
			if (map.get(mapKeys.get(17)).toString().trim().length() != 0) {
				selectMapCode(map.get(mapKeys.get(17)).toString());
			}
			if (map.get(mapKeys.get(18)).toString().trim().length() != 0) {
				sendTextInAddress1(map.get(mapKeys.get(18)).toString());
			}
			if (map.get(mapKeys.get(19)).toString().trim().length() != 0) {
				sendTextInAddress2(map.get(mapKeys.get(19)).toString());
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					selectValueInDropdownFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//select[contains(@id,'subfieldname_') ])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(20)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendFileInFileUploadField(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(21)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInStringFeild(subCategoryField[1].trim(), By.xpath("(//label[normalize-space(text()) = '"
							+ subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(22)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
							+ subCategoryField[1].trim() + "']"));
				}
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(23)).toString().split("/");
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
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(25)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInDobFeild(subCategoryField[1].trim(),
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(26)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						sendTextInTextBox(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']//..//select[contains(@id,'subfieldname_') and @multiple=''])[1]"),
								subCategoryField[1].trim());
					}
				}
			}
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split(",");
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
	 * @author kutbuddin.compounder to edit Onboarding verified
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 27/11/2018
	 */
	public boolean verifyEditedOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By ProfileName = By
				.xpath("//*[normalize-space(text()) = 'Profile']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By KYCStatus = By
				.xpath("//*[normalize-space(text()) = 'KYC Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By phone = By
				.xpath("(//*[normalize-space(text()) = 'Phone Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "'])[1]");
		By Email = By
				.xpath("(//*[normalize-space(text()) = 'Email']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "'])[1]");
		By FirstName = By
				.xpath("(//*[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "'])[1]");
		By middleName = By
				.xpath("(//*[normalize-space(text()) = 'Middle Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "'])[1]");
		By LastName = By
				.xpath("(//*[normalize-space(text()) = 'Last Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "'])[1]");
		By DateOfBirth = By
				.xpath("(//*[normalize-space(text()) = 'Date of Birth']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "'])[1]");
		By IDProofType = By
				.xpath("(//*[normalize-space(text()) = 'ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString() + "'])[1]");
		By IDNUmber = By
				.xpath("(//*[normalize-space(text()) = 'ID Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(14)).toString() + "'])[1]");
		By gender = By
				.xpath("(//*[normalize-space(text()) = 'Gender']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(12)).toString() + "'])[1]");
		By Country = By
				.xpath("(//*[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(15)).toString() + "'])[1]");
		By State = By
				.xpath("(//*[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(16)).toString() + "'])[1]");
		By MapCode = By
				.xpath("(//*[normalize-space(text()) = 'Map Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(17)).toString() + "'])[1]");
		By Address1 = By
				.xpath("(//*[normalize-space(text()) = 'Address 1']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(18)).toString() + "'])[1]");
		By Address2 = By
				.xpath("(//*[normalize-space(text()) = 'Address 2']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(19)).toString() + "'])[1]");
		filterSearch(map.get(mapKeys.get(6)).toString(), map.get(mapKeys.get(9)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(1)).toString(),map.get(mapKeys.get(29)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(6)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(6)).toString());
			if (!verifyElement(ProfileName, false))
				return false;
			if (!verifyElement(KYCStatus, false))
				return false;
			if (maskingAllowed) {
				if ((map.get(mapKeys.get(4)).toString()).trim().length() != 0) {
					if (!verifyElement(phone, false))
						return false;
				}

				if ((map.get(mapKeys.get(5)).toString()).trim().length() != 0) {
					if (!verifyElement(Email, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(7)).toString()).trim().length() != 0) {
				if (!verifyElement(FirstName, false))
					return false;
			}
			if ((map.get(mapKeys.get(8)).toString()).trim().length() != 0) {
				if (!verifyElement(middleName, false))
					return false;
			}
			if ((map.get(mapKeys.get(10)).toString()).trim().length() != 0) {
				if (!verifyElement(LastName, false))
					return false;
			}
			if ((map.get(mapKeys.get(11)).toString()).trim().length() != 0) {
				if (!verifyElement(DateOfBirth, false))
					return false;
			}
			if ((map.get(mapKeys.get(13)).toString()).trim().length() != 0) {
				if (!verifyElement(IDProofType, false))
					return false;
				if (!verifyElement(IDNUmber, false))
					return false;
			}
			if ((map.get(mapKeys.get(15)).toString()).trim().length() != 0) {
				if (!verifyElement(Country, false))
					return false;
				if (!verifyElement(State, false))
					return false;
				if (!verifyElement(MapCode, false))
					return false;
			}
			if ((map.get(mapKeys.get(12)).toString()).trim().length() != 0) {
				if (!verifyElement(gender, false))
					return false;
			}
			if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
				if (!verifyElement(Address1, false))
					return false;
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				if (!verifyElement(Address2, false))
					return false;
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(20)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(21)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(22)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(23)).toString().split("/");
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
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(25)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			/*
			 * if((map.get(mapKeys.get(26)).toString()).trim().length()!=0){
			 * String[]
			 * CategoryField=map.get(mapKeys.get(22)).toString().split("/");
			 * for(int i=0;i<CategoryField.length;i++){ String[]
			 * CategoryFeieldSub=CategoryField[i].split(";"); for(int
			 * j=0;j<CategoryFeieldSub.length;j++){ String[]
			 * subCategoryField=CategoryFeieldSub[j].split(":"); By
			 * multiSelectCategory =
			 * By.xpath("(//*[normalize-space(text()) = '"+subCategoryField[0].
			 * trim() +"']//following-sibling :: div[contains(text() , '"
			 * +subCategoryField[1].trim()+"')])[1]");
			 * if(!verifyElement(multiSelectCategory, false)) return false; } }
			 * }
			 */
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split(",");
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
	 * @creation date 27/11/2018
	 */
	public boolean deleteOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(1)).toString(),map.get(mapKeys.get(7)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(4)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(4)).toString());
			delete();
			return true;
		} else {
			String string = "Enterprise Onboarding already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyOnboardingDelete(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(6)).toString(),
					map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString(),
					map.get(mapKeys.get(1)).toString(),map.get(mapKeys.get(7)).toString());
			return verifyElement(
					By.xpath("(//td[normalize-space(text())='" + map.get(getMapKeys(map).get(6)).toString()
							+ "']//following-sibling::td[@data-title='Status']//div[normalize-space(text())='Delete'])[last()]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author dishant.doshi to sort customer onboarding
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 15/12/2018
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

	/**
	 * @author kutbuddin.compounder to verify customer Onboarding log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 18/12/2018
	 * @return true if CustomerOnboarding Log successfully Verified
	 */
	public boolean verifyCustomerOnboardingLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(6)).toString(), map.get(mapKeys.get(9)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(0)).toString(),
				map.get(mapKeys.get(1)).toString(),map.get(mapKeys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(6)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(6)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}
}
