package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class EnterpriseOnboardingWeb extends Common {
	By drpProfileType = By.id("ProfileType");
	By drpProfileName = By.id("ProfileID");
	By drpKYCStatus = By.id("KycStatus");
	By drpImage = By.id("ImageID");
	By txtPhoneNumber = By.id("Phone");
	By txtEmail = By.id("Email");
	By txtCollectionWalletNo = By.id("ColWalletNo");
	By drpRetailSegment = By.id("CategoryID");
	By txtFirstName = By.id("FirstName");
	By txtLastName = By.id("LastName");
	By txtAccountName = By.id("AccountName");
	By drpIDProofType = By.id("IDProofTypeID");
	By txtIDNumber = By.id("IDNumber");
	By drpCountry = By.id("CountryID");
	By drpState = By.id("CountryStateID");
	By drpMapCode = By.id("MapCodeID");
	By txtCity = By.id("City");
	By txtAddress1 = By.id("Address1");
	By txtAddress2 = By.id("Address2");
	By txtAccountNameInSearch = By.id("txtAccountName");
	By txtPhoneInSearch = By.id("txtPhone");
	By drpKYCStatusInSearch = By.id("cmbKycStatus");
	By drpRetailSegmentInSearch = By.id("cmbCategoryID");
	By drpStatus = By.id("IsActive");

	public EnterpriseOnboardingWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder Select ProfileType
	 * @param ProfileType
	 * @creation date 19/11/2018
	 */
	public void selectProfileType(String ProfileType) {
		selectFromDropdown(drpProfileType, ProfileType);
	}

	/**
	 * @author kutbuddin.compounder Select ProfileName
	 * @param ProfileName
	 * @creation date 19/11/2018
	 */
	public void selectProfileName(String ProfileName) {
		selectFromDropdown(drpProfileName, ProfileName);
	}

	/**
	 * @author kutbuddin.compounder Select KYCStatus
	 * @param KYCStatus
	 * @creation date 19/11/2018
	 */
	public void selectKYCStatus(String KYCStatus) {
		selectFromDropdown(drpKYCStatus, KYCStatus);
	}

	/**
	 * @author kutbuddin.compounder Select Image
	 * @param Image
	 * @creation date 19/11/2018
	 */
	public void selectImage(String Image) {
		selectFromDropdown(drpImage, Image);
	}

	/**
	 * @author kutbuddin.compounder Send Text In PhoneNumber Field
	 * @param PhoneNumber
	 * @creation date 19/11/2018
	 */
	public void sendTextInPhoneNumber(String PhoneNumber) {
		sendTextInTextBox(txtPhoneNumber, PhoneNumber);
	}

	/**
	 * @author kutbuddin.compounder Send Text In Email Field
	 * @param Email
	 * @creation date 19/11/2018
	 */
	public void sendTextInEmail(String Email) {
		clearAndSendTextInTextBox(txtEmail, Email);
	}

	/**
	 * @author kutbuddin.compounder Send Text In CollectionWalletNo Field
	 * @param CollectionWalletNo
	 * @creation date 19/11/2018
	 */
	public void sendTextInCollectionWalletNo(String CollectionWalletNo) {
		sendTextInTextBox(txtCollectionWalletNo, CollectionWalletNo);
	}

	/**
	 * @author kutbuddin.compounder Select RetailSegment
	 * @param RetailSegment
	 * @creation date 19/11/2018
	 */
	public void selectRetailSegment(String RetailSegment) {
		selectFromDropdown(drpRetailSegment, RetailSegment);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FirstName Field
	 * @param FirstName
	 * @creation date 19/11/2018
	 */
	public void sendTextInFirstName(String FirstName) {
		clearAndSendTextInTextBox(txtFirstName, FirstName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In LastName Field
	 * @param LastName
	 * @creation date 19/11/2018
	 */
	public void sendTextInLastName(String LastName) {
		clearAndSendTextInTextBox(txtLastName, LastName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In AccountName Field
	 * @param AccountName
	 * @creation date 19/11/2018
	 */
	public void sendTextInAccountName(String AccountName) {
		sendTextInTextBox(txtAccountName, AccountName);
	}

	/**
	 * @author kutbuddin.compounder Select IDProofType
	 * @param IDProofType
	 * @creation date 19/11/2018
	 */
	public void selectIDProofType(String IDProofType) {
		selectFromDropdown(drpIDProofType, IDProofType);
	}

	/**
	 * @author kutbuddin.compounder Send Text In IDNumber Field
	 * @param IDNumber
	 * @creation date 19/11/2018
	 */
	public void sendTextInIDNumber(String IDNumber) {
		clearAndSendTextInTextBox(txtIDNumber, IDNumber);
	}

	/**
	 * @author kutbuddin.compounder Select Country
	 * @param Country
	 * @creation date 19/11/2018
	 */
	public void selectCountry(String Country) {
		selectFromDropdown(drpCountry, Country);
	}

	/**
	 * @author kutbuddin.compounder Select State
	 * @param State
	 * @creation date 19/11/2018
	 */
	public void selectState(String State) {
		selectFromDropdown(drpState, State);
	}

	/**
	 * @author kutbuddin.compounder Select MapCode
	 * @param MapCode
	 * @creation date 19/11/2018
	 */
	public void selectMapCode(String MapCode) {
		selectFromDropdown(drpMapCode, MapCode);
	}

	/**
	 * @author kutbuddin.compounder Send Text In City Field
	 * @param City
	 * @creation date 19/11/2018
	 */
	public void sendTextInCity(String City) {
		clearAndSendTextInTextBox(txtCity, City);
	}

	/**
	 * @author kutbuddin.compounder Send Text In Address1 Field
	 * @param Address1
	 * @creation date 19/11/2018
	 */
	public void sendTextInAddress1(String Address1) {
		clearAndSendTextInTextBox(txtAddress1, Address1);
	}

	/**
	 * @author kutbuddin.compounder Send Text In Address2 Field
	 * @param Address2
	 * @creation date 19/11/2018
	 */
	public void sendTextInAddress2(String Address2) {
		clearAndSendTextInTextBox(txtAddress2, Address2);
	}

	/**
	 * @author kutbuddin.compounder Send Text Field
	 * @param AgentName
	 * @creation date 19/11/2018
	 */
	public void sendTextInTextField(By element, String Field) {
		clearAndSendTextInTextBox(element, Field);
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
	 * @author kutbuddin.compounder Send Text In FilterSearch AccountName Field
	 * @param AccountName
	 * @creation date 28/11/2018
	 */
	public void sendTextInAccountNameInSearch(String AccountName) {
		clearAndSendTextInTextBox(txtAccountNameInSearch, AccountName);
	}

	/**
	 * @author kutbuddin.compounder Send Text In FilterSearch Phone Field
	 * @param Phone
	 * @creation date 28/11/2018
	 */
	public void sendTextInPhoneInSearch(String Phone) {
		clearAndSendTextInTextBox(txtPhoneInSearch, Phone);
	}

	/**
	 * @author kutbuddin.compounder Select KYCStatus In Filter Search
	 * @param KYCStatus
	 * @creation date 19/11/2018
	 */
	public void selectKYCStatusInSearch(String KYCStatus) {
		selectFromDropdown(drpKYCStatusInSearch, KYCStatus);
	}

	/**
	 * @author kutbuddin.compounder Select RetailSegment In FilterSearch
	 * @param RetailSegment
	 * @creation date 19/11/2018
	 */
	public void selectRetailSegmentInSearch(String RetailSegment) {
		selectFromDropdown(drpRetailSegmentInSearch, RetailSegment);
	}

	/**
	 * @author kutbuddin.compounder Select Status
	 * @param Status
	 * @creation date 28/11/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);
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
	 * @author kutbuddin.compounder send text value In TextFeild
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void sendTextInTextFeild(By element, String value) {
		clearAndSendTextInTextBox(element, value);
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
	 * @author kutbuddin.compounder Send Text In FilterSearch Field
	 * @creation date 28/11/2018
	 */
	public void filterSearch(String Accountname, String Phone, String Profiletype, String Profilename, String KYCType,
			String RetailSegment) {
		filterSearch();
		sendTextInAccountNameInSearch(Accountname);
		sendTextInPhoneInSearch(Phone);
		selectProfileType(Profiletype);
		selectProfileName(Profilename);
		selectKYCStatusInSearch(KYCType);
		selectRetailSegmentInSearch(RetailSegment);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author kutbuddin.compounder
	 * @modified by kutbuddin.compounder to add Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 19/11/2018
	 */
	public void addOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectProfileType(map.get(mapKeys.get(0)).toString());
		selectProfileName(map.get(mapKeys.get(1)).toString());
		selectKYCStatus(map.get(mapKeys.get(2)).toString());
		selectImage(map.get(mapKeys.get(3)).toString());
		sendTextInPhoneNumber(map.get(mapKeys.get(4)).toString());
		sendTextInEmail(map.get(mapKeys.get(5)).toString());
		if (verifyElement(txtCollectionWalletNo)) {
			sendTextInCollectionWalletNo(map.get(mapKeys.get(6)).toString());
		}
		selectRetailSegment(map.get(mapKeys.get(7)).toString());
		sendTextInFirstName(map.get(mapKeys.get(8)).toString());
		sendTextInLastName(map.get(mapKeys.get(9)).toString());
		sendTextInAccountName(map.get(mapKeys.get(10)).toString());
		selectIDProofType(map.get(mapKeys.get(11)).toString());
		sendTextInIDNumber(map.get(mapKeys.get(12)).toString());
		selectCountry(map.get(mapKeys.get(13)).toString());
		selectState(map.get(mapKeys.get(14)).toString());
		selectMapCode(map.get(mapKeys.get(15)).toString());
		sendTextInCity(map.get(mapKeys.get(16)).toString());
		sendTextInAddress1(map.get(mapKeys.get(17)).toString());
		sendTextInAddress2(map.get(mapKeys.get(18)).toString());
		if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(23)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				selectValueInDropdownFeild(By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
						+ "']//..//select[contains(@id,'subfieldname_') ])[1]"), subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(19)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendFileInFileUploadField(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
						subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(20)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInStringFeild(subCategoryField[1].trim(),
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
			}
		}
		if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(21)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
						+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
						+ subCategoryField[1].trim() + "']"));
			}
		}
		if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(22)).toString().split("/");
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
		if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextWithRemoveReadOnlyProperty(subCategoryField[1].trim(),
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
			}
		}
		if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(25)).toString().split("/");
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
		if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(26)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInTextFeild(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
						subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
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
	 * @creation date 28/11/2018
	 */
	public boolean verifyAddedOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By ProfileType = By
				.xpath("//*[normalize-space(text()) = 'Profile Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By ProfileName = By
				.xpath("//*[normalize-space(text()) = 'Profile Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By KYCStatus = By
				.xpath("//*[normalize-space(text()) = 'KYC Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By Image = By
				.xpath("//*[normalize-space(text()) = 'Image']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By Phone = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Phone Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By Email = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Email']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By CollectionWalletNo = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Collection Wallet No']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By RetailSegment = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Retail Segment']//following-sibling :: div[contains(text() , '"
						+ map.get(mapKeys.get(7)).toString() + "')]");
		By FirstName = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By LastName = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Last Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(9)).toString() + "']");
		By AccountName = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Account Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "']");
		By IDProofType = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "']");
		By IDNumber = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'ID Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(12)).toString() + "']");
		By Country = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString() + "']");
		By State = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(14)).toString() + "']");
		By City = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'City']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(16)).toString() + "']");
		By Address1 = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Address 1']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(17)).toString() + "']");
		By Address2 = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Address 2']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(18)).toString() + "']");

		filterSearch(map.get(mapKeys.get(10)).toString(), map.get(mapKeys.get(4)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(7)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(10)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(10)).toString());
			if (!verifyElement(ProfileType, false))
				return false;
			if (!verifyElement(ProfileName, false))
				return false;
			if (!verifyElement(KYCStatus, false))
				return false;
			if (!verifyElement(Image, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(Phone, false))
					return false;
				if (!verifyElement(Email, false))
					return false;
			}
			if (map.get(mapKeys.get(6)).toString().trim().length() != 0) {
				if (!verifyElement(CollectionWalletNo, false))
					return false;
			}
			if (!verifyElement(RetailSegment, false))
				return false;
			if (!verifyElement(FirstName, false))
				return false;
			if (!verifyElement(LastName, false))
				return false;
			if (!verifyElement(AccountName, false))
				return false;
			if (!verifyElement(IDProofType, false))
				return false;
			if (!verifyElement(IDNumber, false))
				return false;
			if (!verifyElement(Country, false))
				return false;
			if (!verifyElement(State, false))
				return false;
			if (!verifyElement(City, false))
				return false;
			if (!verifyElement(Address1, false))
				return false;
			if (!verifyElement(Address2, false))
				return false;
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(23)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(19)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(20)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(21)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(22)).toString().split("/");
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
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(25)).toString().split("/");
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
			if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(26)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
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
	 * @creation date 28/11/2018
	 */
	public void editOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(15)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(11)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(15)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(15)).toString());
			clickOnEditBtn();
			selectKYCStatus(map.get(mapKeys.get(3)).toString());
			selectImage(map.get(mapKeys.get(5)).toString());
			selectStatus(map.get(mapKeys.get(34)).toString());
			if (verifyElement(txtEmail)) {
				sendTextInEmail(map.get(mapKeys.get(8)).toString());
			}
			if (verifyElement(txtFirstName)) {
				sendTextInFirstName(map.get(mapKeys.get(13)).toString());
			}
			if (verifyElement(txtLastName)) {
				sendTextInLastName(map.get(mapKeys.get(14)).toString());
			}
			if (verifyElement(txtIDNumber)) {
				selectIDProofType(map.get(mapKeys.get(16)).toString());
				sendTextInIDNumber(map.get(mapKeys.get(17)).toString());
			}
			if (verifyElement(drpCountry)) {
				selectCountry(map.get(mapKeys.get(19)).toString());
				selectState(map.get(mapKeys.get(20)).toString());
				selectMapCode(map.get(mapKeys.get(21)).toString());
			}
			if (verifyElement(txtCity)) {
				sendTextInCity(map.get(mapKeys.get(22)).toString());
			}
			if (verifyElement(txtAddress1)) {
				sendTextInAddress1(map.get(mapKeys.get(23)).toString());
			}
			if (verifyElement(txtAddress2)) {
				sendTextInAddress2(map.get(mapKeys.get(24)).toString());
			}
			if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(29)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					selectValueInDropdownFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//select[contains(@id,'subfieldname_') ])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(25)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendFileInFileUploadField(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(26)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInStringFeild(subCategoryField[1].trim(), By.xpath("(//label[normalize-space(text()) = '"
							+ subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
							+ subCategoryField[1].trim() + "']"));
				}
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split("/");
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
			if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(30)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextWithRemoveReadOnlyProperty(subCategoryField[1].trim(),
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(31)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(31)).toString().split("/");
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
			if ((map.get(mapKeys.get(32)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(32)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(33)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(33)).toString().split(",");
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
	 * @author kutbuddin.compounder to verify edit Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/11/2018
	 */
	public boolean verifyEditedOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By ProfileType = By
				.xpath("//*[normalize-space(text()) = 'Profile Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By ProfileName = By
				.xpath("//*[normalize-space(text()) = 'Profile Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By KYCStatus = By
				.xpath("//*[normalize-space(text()) = 'KYC Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By Image = By
				.xpath("//*[normalize-space(text()) = 'Image']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By Phone = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Phone Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "']");
		By Email = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Email']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By CollectionWalletNo = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Collection Wallet No']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "']");
		By RetailSegment = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Retail Segment']//following-sibling :: div[contains(text() , '"
						+ map.get(mapKeys.get(12)).toString() + "')]");
		By FirstName = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString() + "']");
		By LastName = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Last Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(14)).toString() + "']");
		By AccountName = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Account Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(16)).toString() + "']");
		By IDProofType = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(17)).toString() + "']");
		By IDNumber = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'ID Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(18)).toString() + "']");
		By Country = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(19)).toString() + "']");
		By State = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(20)).toString() + "']");
		By City = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'City']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(22)).toString() + "']");
		By Address1 = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Address 1']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(23)).toString() + "']");
		By Address2 = By
				.xpath("//div[@id='divProfileFields']//*[normalize-space(text()) = 'Address 2']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(24)).toString() + "']");

		filterSearch(map.get(mapKeys.get(15)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(11)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(15)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(15)).toString());
			if (!verifyElement(ProfileType, false))
				return false;
			if (!verifyElement(ProfileName, false))
				return false;
			if (!verifyElement(KYCStatus, false))
				return false;
			if (!verifyElement(Image, false))
				return false;
			if (maskingAllowed) {
				if ((map.get(mapKeys.get(7)).toString()).trim().length() != 0) {
					if (!verifyElement(Phone, false))
						return false;
				}
				if ((map.get(mapKeys.get(8)).toString()).trim().length() != 0) {
					if (!verifyElement(Email, false))
						return false;
				}
			}
			if (map.get(mapKeys.get(10)).toString().trim().length() != 0) {
				if (!verifyElement(CollectionWalletNo, false))
					return false;
			}
			if ((map.get(mapKeys.get(12)).toString()).trim().length() != 0) {
				if (!verifyElement(RetailSegment, false))
					return false;
			}
			if ((map.get(mapKeys.get(13)).toString()).trim().length() != 0) {
				if (!verifyElement(FirstName, false))
					return false;
			}
			if ((map.get(mapKeys.get(14)).toString()).trim().length() != 0) {
				if (!verifyElement(LastName, false))
					return false;
			}
			if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
				if (!verifyElement(AccountName, false))
					return false;
			}
			if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
				if (!verifyElement(IDProofType, false))
					return false;
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				if (!verifyElement(IDNumber, false))
					return false;
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				if (!verifyElement(Country, false))
					return false;
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				if (!verifyElement(State, false))
					return false;
			}
			if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
				if (!verifyElement(City, false))
					return false;
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				if (!verifyElement(Address1, false))
					return false;
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				if (!verifyElement(Address2, false))
					return false;
			}
			if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(29)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(25)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(26)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split("/");
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
			if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(30)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(31)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(31)).toString().split("/");
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
			if ((map.get(mapKeys.get(32)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(32)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(33)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(33)).toString().split(",");
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
	 * @creation date 28/11/2018
	 */
	public boolean deleteOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(3)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(5)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(5)).toString());
			if (verifyDeleteBtn())
				delete();
			else
				clickOnBackBtn();
			return true;
		} else {
			String string = "Enterprise Onboarding already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifydeletedOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(3)).toString(),
					map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
					map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(4)).toString());
			return !verifyElement(
					By.xpath("(//td[normalize-space(text())='" + map.get(getMapKeys(map).get(5)).toString()
							+ "']//following-sibling::td[@data-title='Status']//div[normalize-space(text())='Delete'])[last()]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify enterprise Onboarding log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 18/12/2018
	 * @return true if EnterpriseOnboarding Log successfully Verified
	 */
	public boolean verifyEnterpriseOnboardingLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(15)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(11)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(15)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(15)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort enterprise onboarding
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
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
