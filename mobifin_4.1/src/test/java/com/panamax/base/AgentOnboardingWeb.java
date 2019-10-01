package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class AgentOnboardingWeb extends Common {
	By drpTreeName = By.id("TreeID");
	By drpTreeNameverify = By.id("TreeID_chosen");
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
	By txtResellerAccountName = By.id("ResellerName");
	By txtDateOfBirth = By.id("DOB");
	By drpIDProofType = By.id("IDProofTypeID");
	By txtIDNumber = By.id("IDNumber");
	By drpCountry = By.id("CountryID");
	By drpState = By.id("CountryStateID");
	By drpMapCode = By.id("MapCodeID");
	By txtCity = By.id("City");
	By txtAddress1 = By.id("Address1");
	By txtAddress2 = By.id("Address2");
	By txtResellerNameInSearch = By.id("txtSearchResellerName");
	By txtAccountNameInSearch = By.id("txtAccountName");
	By txtEmailAddressInSearch = By.id("txtSearchEmail");
	By txtPhoneInSearch = By.id("txtPhone");
	By drpCountryInSearch = By.id("CountryID");
	By drpStateInSearch = By.id("CountryStateID");
	By drpTreeNameInSearch = By.id("TreeID");
	By drpProfileNameInSearch = By.id("cmbTreeProfileID");
	By drpKYCTypeInSearch = By.id("cmbKycStatus");
	By drpRetailSegmentInSearch = By.id("cmbCategoryID");
	By drpStatus = By.id("IsActive");
	By drpStatusInSearch = By.id("cmbIsActive");
	By homeButton = By.xpath("//*[normalize-space(text())='home'][1]");

	public AgentOnboardingWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel Select TreeName
	 * @param TreeName
	 * @creation date 15/11/2018
	 */
	public void selectTreeName(String TreeName) {
		selectFromDropdown(drpTreeName, TreeName);
	}

	/**
	 * @author shivani.patel Select TreeCategory
	 * @param TreeCategory
	 * @creation date 15/11/2018
	 */
	public void selectTreeCategory(String TreeCategory) {
		selectFromDropdown(drpTreeCategory, TreeCategory);
	}

	/**
	 * @author shivani.patel Select TreeProfile
	 * @param TreeProfile
	 * @creation date 15/11/2018
	 */
	public void selectTreeProfile(String TreeProfile) {
		selectFromDropdown(drpTreeProfile, TreeProfile);
	}

	/**
	 * @author shivani.patel Select KYCStatus
	 * @param KYCStatus
	 * @creation date 15/11/2018
	 */
	public void selectKYCStatus(String KYCStatus) {
		selectFromDropdown(drpKYCStatus, KYCStatus);
	}

	/**
	 * @author shivani.patel Send Text In PhoneNumber Field
	 * @param PhoneNumber
	 * @creation date 15/11/2018
	 */
	public void sendTextInPhoneNumber(String PhoneNumber) {
		sendTextInTextBox(txtPhoneNumber, PhoneNumber);
	}

	/**
	 * @author shivani.patel Send Text In AlternatePhone Field
	 * @param AlternatePhone
	 * @creation date 15/11/2018
	 */
	public void sendTextInAlternatePhone(String AlternatePhone) {
		sendTextInTextBox(txtAlternatePhone, AlternatePhone);
	}

	/**
	 * @author shivani.patel Send Text In Email Field
	 * @param Email
	 * @creation date 15/11/2018
	 */
	public void sendTextInEmail(String Email) {
		sendTextInTextBox(txtEmail, Email);
	}

	/**
	 * @author shivani.patel Select RetailSegment
	 * @param RetailSegment
	 * @creation date 15/11/2018
	 */
	public void selectRetailSegment(String RetailSegment) {
		selectFromDropdown(drpRetailSegment, RetailSegment);
	}

	/**
	 * @author shivani.patel Send Text In Code Field
	 * @param Code
	 * @creation date 15/11/2018
	 */
	public void sendTextInCode(String Code) {
		sendTextInTextBox(txtCode, Code);
	}

	/**
	 * @author shivani.patel Send Text In FirstName Field
	 * @param FirstName
	 * @creation date 15/11/2018
	 */
	public void sendTextInFirstName(String FirstName) {
		sendTextInTextBox(txtFirstName, FirstName);
	}

	/**
	 * @author shivani.patel Send Text In LastName Field
	 * @param LastName
	 * @creation date 15/11/2018
	 */
	public void sendTextInLastName(String LastName) {
		sendTextInTextBox(txtLastName, LastName);
	}

	/**
	 * @author shivani.patel Send Text In ResellerAccountName Field
	 * @param AgentName
	 * @creation date 15/11/2018
	 */
	public void sendTextInResellerAccountName(String ResellerAccountName) {
		sendTextInTextBox(txtResellerAccountName, ResellerAccountName);
	}

	/**
	 * @author shivani.patel Send Text In DateOfBirth Field
	 * @param DateOfBirth
	 * @creation date 15/11/2018
	 */
	public void sendTextInDateOfBirth(String DateOfBirth) {
		sendTextWithRemoveReadOnlyProperty(DateOfBirth, txtDateOfBirth);
	}

	/**
	 * @author shivani.patel Select IDProofType
	 * @param IDProofType
	 * @creation date 15/11/2018
	 */
	public void selectIDProofType(String IDProofType) {
		selectFromDropdown(drpIDProofType, IDProofType);
	}

	/**
	 * @author shivani.patel Send Text In IDNumber Field
	 * @param IDNumber
	 * @creation date 15/11/2018
	 */
	public void sendTextInIDNumber(String IDNumber) {
		sendTextInTextBox(txtIDNumber, IDNumber);
	}

	/**
	 * @author shivani.patel Select Country
	 * @param Country
	 * @creation date 15/11/2018
	 */
	public void selectCountry(String Country) {
		selectFromDropdown(drpCountry, Country);
	}

	/**
	 * @author shivani.patel Select State
	 * @param State
	 * @creation date 15/11/2018
	 */
	public void selectState(String State) {
		selectFromDropdown(drpState, State);
	}

	/**
	 * @author shivani.patel Select MapCode
	 * @param MapCode
	 * @creation date 15/11/2018
	 */
	public void selectMapCode(String MapCode) {
		selectFromDropdown(drpMapCode, MapCode);
	}

	/**
	 * @author shivani.patel Send Text In City Field
	 * @param City
	 * @creation date 15/11/2018
	 */
	public void sendTextInCity(String City) {
		sendTextInTextBox(txtCity, City);
	}

	/**
	 * @author shivani.patel Send Text In Address1 Field
	 * @param Address1
	 * @creation date 15/11/2018
	 */
	public void sendTextInAddress1(String Address1) {
		sendTextInTextBox(txtAddress1, Address1);
	}

	/**
	 * @author shivani.patel Send Text In Address2 Field
	 * @param Address2
	 * @creation date 15/11/2018
	 */
	public void sendTextInAddress2(String Address2) {
		sendTextInTextBox(txtAddress2, Address2);
	}

	/**
	 * @author shivani.patel Send Text Field
	 * @param AgentName
	 * @creation date 15/11/2018
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
	 * @author shivani.patel Send Text AgentName In FilterSearch Field
	 * @param AgentName
	 * @creation date 15/11/2018
	 */
	public void sendTextInAgentNameInFilterSearch(String agentName) {
		clearAndSendTextInTextBox(txtResellerNameInSearch, agentName);
	}

	/**
	 * @author shivani.patel Send Text AccountName In FilterSearch Field
	 * @param AccountName
	 * @creation date 15/11/2018
	 */
	public void sendTextInAccountNameInFilterSearch(String AccountName) {
		clearAndSendTextInTextBox(txtAccountNameInSearch, AccountName);
	}

	/**
	 * @author shivani.patel Send Text EmailAddress In FilterSearch Field
	 * @param EmailAddress
	 * @creation date 15/11/2018
	 */
	public void sendTextInEmailAddressInFilterSearch(String EmailAddress) {
		clearAndSendTextInTextBox(txtEmailAddressInSearch, EmailAddress);
	}

	/**
	 * @author shivani.patel Send Text Phone In FilterSearch Field
	 * @param Phone
	 * @creation date 15/11/2018
	 */
	public void sendTextInPhoneInFilterSearch(String Phone) {
		clearAndSendTextInTextBox(txtPhoneInSearch, Phone);
	}

	/**
	 * @author shivani.patel Select Country In FilterSearch Field
	 * @param Country
	 * @creation date 15/11/2018
	 */
	public void sendTextInCountryInFilterSearch(String Country) {
		selectFromDropdown(drpCountryInSearch, Country);
	}

	/**
	 * @author shivani.patel Select State In FilterSearch Field
	 * @param State
	 * @creation date 15/11/2018
	 */
	public void sendTextInStateInFilterSearch(String State) {
		selectFromDropdown(drpStateInSearch, State);
	}

	/**
	 * @author shivani.patel Select TreeName In FilterSearch Field
	 * @param TreeName
	 * @creation date 15/11/2018
	 */
	public void sendTextInTreeNameInFilterSearch(String TreeName) {
		selectFromDropdown(drpTreeNameInSearch, TreeName);
	}

	/**
	 * @author shivani.patel Select ProfileName In FilterSearch Field
	 * @param ProfileName
	 * @creation date 15/11/2018
	 */
	public void sendTextInProfileNameInFilterSearch(String ProfileName) {
		selectFromDropdown(drpProfileNameInSearch, ProfileName);
	}

	/**
	 * @author shivani.patel Select KYCType In FilterSearch Field
	 * @param KYCType
	 * @creation date 15/11/2018
	 */
	public void sendTextInKYCTypeInFilterSearch(String KYCType) {
		selectFromDropdown(drpKYCTypeInSearch, KYCType);
	}

	/**
	 * @author shivani.patel Select RetailSegment In FilterSearch Field
	 * @param RetailSegment
	 * @creation date 15/11/2018
	 */
	public void sendTextInRetailSegmentInFilterSearch(String RetailSegment) {
		selectFromDropdown(drpRetailSegmentInSearch, RetailSegment);
	}

	/**
	 * @author shivani.patel Select Status In FilterSearch Field
	 * @param Status
	 * @creation date 15/11/2018
	 */
	public void selectStatusInFilterSearch(String Status) {
		selectFromDropdown(drpStatusInSearch, Status);
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
	 * @author shivani.patel ClickOnSecondLevel Element
	 * @creation date 15/11/2018
	 */
	public void clickOnLevelElement(String AgentAccountName) {
		clickOnElement(By.xpath(
				".//*[@id='moduleListTable']//u[normalize-space(text())='" + AgentAccountName + "']//parent::a"));
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
	 * @author kutbuddin.compounder click clickOnHomeButton
	 * @param value
	 * @creation date 26/11/2018
	 */
	public void clickOnHomeButton() {
		clickOnElement(homeButton);
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
	 * @author shivani.patel send Data In FilterSearch Fields
	 * @param Status,
	 * @creation date 15/11/2018
	 */
	public void filterSearch(String firstName, String lastname, String resellerName, String phone, String TreeName,
			String ProfileName, String KYCType, String RetailSegment, String Status, boolean isStatusSelect) {
		commonFilterSearch();
		sendTextInAgentNameInFilterSearch(firstName +" "+ lastname);
		sendTextInAccountNameInFilterSearch(resellerName);
		sendTextInPhoneInFilterSearch(phone);
		sendTextInTreeNameInFilterSearch(TreeName);
		sendTextInProfileNameInFilterSearch(ProfileName);
		sendTextInKYCTypeInFilterSearch(KYCType);
		sendTextInRetailSegmentInFilterSearch(RetailSegment);
		if (isStatusSelect)
			selectStatusInFilterSearch(Status);
	}

	/**
	 * @author shivani.patel to add Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 15/11/2018
	 */
	public void addOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		if ((map.get(mapKeys.get(11)).toString()).trim().length() != 0) {
			if((map.get(mapKeys.get(11)).toString()).contains(",")){
				String[] parentAgent = map.get(mapKeys.get(11)).toString().split(",");
				for (int i = 0; i < parentAgent.length; i++) {
					clickOnLevelElement(parentAgent[i].trim());
				}
			}
			else{
				clickOnLevelElement((map.get(mapKeys.get(11)).toString()));
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
		sendTextInFirstName(map.get(mapKeys.get(8)).toString());
		sendTextInLastName(map.get(mapKeys.get(9)).toString());
		sendTextInResellerAccountName(map.get(mapKeys.get(10)).toString());
		sendTextInDateOfBirth(map.get(mapKeys.get(12)).toString());
		if ((map.get(mapKeys.get(13)).toString()).trim().length() != 0) {
			selectIDProofType(map.get(mapKeys.get(13)).toString());
			sendTextInIDNumber(map.get(mapKeys.get(14)).toString());
		}
		if ((map.get(mapKeys.get(15)).toString()).trim().length() != 0) {
			selectCountry(map.get(mapKeys.get(16)).toString());
			selectState(map.get(mapKeys.get(16)).toString());
		}
		if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
			selectMapCode(map.get(mapKeys.get(17)).toString());
		}
		if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
			sendTextInCity(map.get(mapKeys.get(18)).toString());
		}
		if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
			sendTextInAddress1(map.get(mapKeys.get(19)).toString());
		}
		if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
			sendTextInAddress2(map.get(mapKeys.get(20)).toString());
		}
		if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(26)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				selectValueInDropdownFeild(By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
						+ "']//..//select[contains(@id,'subfieldname_') ])[1]"), subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(22)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendFileInFileUploadField(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
						subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(23)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInStringFeild(subCategoryField[1].trim(),
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
			}
		}
		if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
						+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
						+ subCategoryField[1].trim() + "']"));
			}
		}
		if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(25)).toString().split("/");
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
				sendTextWithRemoveReadOnlyProperty(subCategoryField[1],
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
			}
		}
		if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(28)).toString().split("/");
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
		if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(29)).toString().split(",");
			for (int i = 0; i < CategoryField.length; i++) {
				String[] subCategoryField = CategoryField[i].split(":");
				sendTextInTextFeild(
						By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
						subCategoryField[1].trim());
			}
		}
		if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
			String[] CategoryField = map.get(mapKeys.get(30)).toString().split(",");
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
	 * @author shivani.patel to verify add Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 15/11/2018
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
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Phone Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By Alterphone = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Alternate Phone']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By Email = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Email']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By RetailSegment = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Retail Segment']//following-sibling :: div[contains(text() , '"
						+ map.get(mapKeys.get(7)).toString() + "')]");
		By FirstName = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By LastName = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Last Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(9)).toString() + "']");
		By ResellerAccountName = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Reseller Account Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(10)).toString() + "']");
		By DateOfBirth = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Date Of Birth']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(12)).toString() + "']");
		By IDProofType = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString() + "']");
		By IDNUmber = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'ID Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(14)).toString() + "']");
		By Country = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(15)).toString() + "']");
		By State = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(16)).toString() + "']");
		By MapCode = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Map Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(17)).toString() + "']");
		By City = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'City']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(18)).toString() + "']");
		By Address1 = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Address 1']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(19)).toString() + "']");
		By Address2 = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Address 2']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(20)).toString() + "']");
		if (verifyElement(homeButton, false)) {
			clickOnHomeButton();
		}
		if ((map.get(mapKeys.get(11)).toString()).trim().length() != 0) {
			String[] parentAgent = map.get(mapKeys.get(11)).toString().split(",");
			for (int i = 0; i < parentAgent.length; i++) {
				clickOnLevelElement(parentAgent[i].trim());
			}
		}
		filterSearch(map.get(mapKeys.get(8)).toString(), map.get(mapKeys.get(9)).toString(),
				map.get(mapKeys.get(10)).toString(), map.get(mapKeys.get(4)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(7)).toString(),
				map.get(mapKeys.get(21)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='"
				+ (map.get(getMapKeys(map).get(8)).toString() + " " + map.get(getMapKeys(map).get(9)).toString())
				+ "'])[1]"), false)) {
			clickOnInfoBtn(
					(map.get(getMapKeys(map).get(8)).toString() + " " + map.get(getMapKeys(map).get(9)).toString()));
			if ((map.get(mapKeys.get(0)).toString()).trim().length() != 0) {
				if (!verifyElement(TreeName, false))
					return false;
			}
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
			if (!verifyElement(FirstName, false))
				return false;
			if (!verifyElement(LastName, false))
				return false;
			if (!verifyElement(ResellerAccountName, false))
				return false;
			if (!verifyElement(DateOfBirth, false))
				return false;
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
			if ((map.get(mapKeys.get(18)).toString()).trim().length() != 0) {
				if (!verifyElement(City, false))
					return false;
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				if (!verifyElement(Address1, false))
					return false;
			}
			if ((map.get(mapKeys.get(20)).toString()).trim().length() != 0) {
				if (!verifyElement(Address2, false))
					return false;
			}
			if ((map.get(mapKeys.get(26)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(26)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(22)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(23)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(24)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[last()]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(25)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(25)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						By chekBoxCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
								+ "')])[last()]");
						if (!verifyElement(chekBoxCategory, false))
							return false;
					}
				}
			}
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						By multiSelectCategory = By.xpath("(//*[normalize-space(text()) = '"
								+ subCategoryField[0].trim() + "']//following-sibling :: div[contains(text() , '"
								+ subCategoryField[1].trim() + "')])[last()]");
						if (!verifyElement(multiSelectCategory, false))
							return false;
					}
				}
			}
			if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(29)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(30)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By numberCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
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
	 * @author shivani.patel to edit Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 19/11/2018
	 */
	public void editOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		if ((map.get(mapKeys.get(15)).toString()).trim().length() != 0) {
			String[] parentAgent = map.get(mapKeys.get(15)).toString().split(",");
			for (int i = 0; i < parentAgent.length; i++) {
				clickOnLevelElement(parentAgent[i].trim());
			}
		}
		filterSearch(map.get(mapKeys.get(10)).toString(), map.get(mapKeys.get(12)).toString(),
				map.get(mapKeys.get(14)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(3)).toString(), map.get(mapKeys.get(8)).toString(),
				map.get(mapKeys.get(25)).toString(), true);
		String resellerName = map.get(getMapKeys(map).get(10)).toString();
		resellerName = resellerName + " " + map.get(getMapKeys(map).get(12)).toString();
		if (verifyElement(By.xpath("(//td[text()='" + resellerName + "'])[1]"), false)) {
			clickOnInfoBtn(resellerName);
			clickOnEditBtn();
			selectKYCStatus(map.get(mapKeys.get(4)).toString());
			selectStatus(map.get(mapKeys.get(26)).toString());
			if ((map.get(mapKeys.get(7)).toString()).trim().length() != 0) {
				sendTextInEmail(map.get(mapKeys.get(7)).toString());
			}

			if ((map.get(mapKeys.get(11)).toString()).trim().length() != 0) {
				sendTextInFirstName(map.get(mapKeys.get(11)).toString());
			}
			if ((map.get(mapKeys.get(13)).toString()).trim().length() != 0) {
				sendTextInLastName(map.get(mapKeys.get(13)).toString());
			}
			if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
				sendTextInDateOfBirth(map.get(mapKeys.get(16)).toString());
			}
			if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
				selectIDProofType(map.get(mapKeys.get(17)).toString());
				sendTextInIDNumber(map.get(mapKeys.get(18)).toString());
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				selectCountry(map.get(mapKeys.get(19)).toString());
				selectState(map.get(mapKeys.get(20)).toString());
			}
			if ((map.get(mapKeys.get(21)).toString()).trim().length() != 0) {
				selectMapCode(map.get(mapKeys.get(21)).toString());
			}
			if ((map.get(mapKeys.get(22)).toString()).trim().length() != 0) {
				sendTextInCity(map.get(mapKeys.get(22)).toString());
			}
			if ((map.get(mapKeys.get(23)).toString()).trim().length() != 0) {
				sendTextInAddress1(map.get(mapKeys.get(23)).toString());
			}
			if ((map.get(mapKeys.get(24)).toString()).trim().length() != 0) {
				sendTextInAddress2(map.get(mapKeys.get(24)).toString());
			}
			if ((map.get(mapKeys.get(31)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(31)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					selectValueInDropdownFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//select[contains(@id,'subfieldname_') ])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendFileInFileUploadField(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'file')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInStringFeild(subCategoryField[1], By.xpath("(//label[normalize-space(text()) = '"
							+ subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'String')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(29)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					clickOnRadioFeild(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//..//*[contains(@id,'subfieldname_') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
							+ subCategoryField[1].trim() + "']"));
				}
			}
			if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(30)).toString().split("/");
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
					sendTextWithRemoveReadOnlyProperty(subCategoryField[1].trim(),
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Date')])[1]"));
				}
			}
			if ((map.get(mapKeys.get(33)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(33)).toString().split("/");
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
			if ((map.get(mapKeys.get(34)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(34)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextFeild(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']//..//*[contains(@id,'subfieldname_') and contains(@fieldtype,'Decimal')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if ((map.get(mapKeys.get(35)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(35)).toString().split(",");
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
	 * @author shivani.patel to verify edit Onboarding
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 19/11/2018
	 */
	public boolean verifyEditedOnboarding(Map<Object, Object> map, List<Object> mapKeys) {
		By TreeName = By
				.xpath("//*[normalize-space(text()) = 'Tree Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By ProfileName = By
				.xpath("//*[normalize-space(text()) = 'Profile Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By KYCStatus = By
				.xpath("//*[normalize-space(text()) = 'KYC Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By phone = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Phone Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By Alterphone = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Alternate Phone']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By Email = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Email']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "']");
		By RetailSegment = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Retail Segment']//following-sibling :: div[contains(text() , '"
						+ map.get(mapKeys.get(9)).toString() + "')]");
		By FirstName = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'First Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(11)).toString() + "']");
		By LastName = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Last Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(13)).toString() + "']");
		By DateOfBirth = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Date of Birth']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(16)).toString() + "']");
		By IDProofType = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'ID Proof Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(17)).toString() + "']");
		By IDNUmber = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'ID Number']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(18)).toString() + "']");
		By Country = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Country']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(19)).toString() + "']");
		By State = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'State']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(20)).toString() + "']");
		By MapCode = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Map Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(21)).toString() + "']");
		By City = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'City']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(22)).toString() + "']");
		By Address1 = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Address 1']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(23)).toString() + "']");
		By Address2 = By
				.xpath("//div[@id='accountDivView']//*[normalize-space(text()) = 'Address 2']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(24)).toString() + "']");
		if (verifyElement(homeButton, false)) {
			clickOnHomeButton();
		}
		if ((map.get(mapKeys.get(15)).toString()).trim().length() != 0) {
			String[] parentAgent = map.get(mapKeys.get(15)).toString().split(",");
			for (int i = 0; i < parentAgent.length; i++) {
				clickOnLevelElement(parentAgent[i]);
			}
		}
		filterSearch(map.get(mapKeys.get(11)).toString(), map.get(mapKeys.get(13)).toString(),
				map.get(mapKeys.get(14)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(8)).toString(),
				map.get(mapKeys.get(26)).toString(), true);
		String resellerName = "";
		if (map.get(getMapKeys(map).get(11)).toString().equals(" ")
				|| map.get(getMapKeys(map).get(11)).toString().isEmpty())
			resellerName = map.get(getMapKeys(map).get(10)).toString();
		else
			resellerName = map.get(getMapKeys(map).get(11)).toString();
		if (map.get(getMapKeys(map).get(13)).toString().equals(" ")
				|| map.get(getMapKeys(map).get(13)).toString().isEmpty())
			resellerName = resellerName + " " + map.get(getMapKeys(map).get(12)).toString();
		else
			resellerName = resellerName + " " + map.get(getMapKeys(map).get(13)).toString();
		if (verifyElement(By.xpath("(//td[text()='" + resellerName + "'])[1]"), false)) {
			clickOnInfoBtn(resellerName);
			if ((map.get(mapKeys.get(0)).toString()).trim().length() != 0) {
				if (!verifyElement(TreeName, false))
					return false;
			}
			if (!verifyElement(ProfileName, false))
				return false;
			if (!verifyElement(KYCStatus, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(phone, false))
					return false;
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
			if ((map.get(mapKeys.get(11)).toString()).trim().length() != 0) {
				if (!verifyElement(FirstName, false))
					return false;
				if (!verifyElement(LastName, false))
					return false;
			}
			if ((map.get(mapKeys.get(16)).toString()).trim().length() != 0) {
				if (!verifyElement(DateOfBirth, false))
					return false;
			}
			if ((map.get(mapKeys.get(17)).toString()).trim().length() != 0) {
				if (!verifyElement(IDProofType, false))
					return false;
				if (!verifyElement(IDNUmber, false))
					return false;
			}
			if ((map.get(mapKeys.get(19)).toString()).trim().length() != 0) {
				if (!verifyElement(Country, false))
					return false;
				if (!verifyElement(State, false))
					return false;
				if (!verifyElement(MapCode, false))
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
			if ((map.get(mapKeys.get(27)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(27)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(28)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(28)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(29)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(29)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[last()]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(30)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(30)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						By chekBoxCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
								+ "')])[last()]");
						if (!verifyElement(chekBoxCategory, false))
							return false;
					}
				}
			}
			if ((map.get(mapKeys.get(31)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(31)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(32)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(32)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(33)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(33)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(";");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						By multiSelectCategory = By.xpath("(//*[normalize-space(text()) = '"
								+ subCategoryField[0].trim() + "']//following-sibling :: div[contains(text() , '"
								+ subCategoryField[1].trim() + "')])[last()]");
						if (!verifyElement(multiSelectCategory, false))
							return false;
					}
				}
			}
			if ((map.get(mapKeys.get(34)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(34)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if ((map.get(mapKeys.get(35)).toString()).trim().length() != 0) {
				String[] CategoryField = map.get(mapKeys.get(35)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By numberCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[last()]");
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
			String[] parentAgent = map.get(mapKeys.get(8)).toString().split(",");
			for (int i = 0; i < parentAgent.length; i++) {
				clickOnLevelElement(parentAgent[i]);
			}
		}
		filterSearch(map.get(mapKeys.get(5)).toString(), map.get(mapKeys.get(6)).toString(),
				map.get(mapKeys.get(7)).toString(), map.get(mapKeys.get(3)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(4)).toString(),
				map.get(mapKeys.get(9)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='"
				+ (map.get(getMapKeys(map).get(5)).toString() + " " + map.get(getMapKeys(map).get(6)).toString())
				+ "'])[1]"), false)) {
			clickOnInfoBtn(
					(map.get(getMapKeys(map).get(5)).toString() + " " + map.get(getMapKeys(map).get(6)).toString()));
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
							+ (map.get(getMapKeys(map).get(5)).toString() + " "
									+ map.get(getMapKeys(map).get(6)).toString())
							+ "']//following-sibling::td[@data-title='Status'and normalize-space(text())='Delete'])[last()]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify customer Onboarding log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/12/2018
	 * @return true if AgentOnboarding Log successfully Verified
	 */
	public boolean verifyAgentOnboardingLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(11)).toString(), map.get(mapKeys.get(13)).toString(),
				map.get(mapKeys.get(14)).toString(), map.get(mapKeys.get(5)).toString(),
				map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(2)).toString(),
				map.get(mapKeys.get(4)).toString(), map.get(mapKeys.get(8)).toString(),
				map.get(mapKeys.get(26)).toString(), true);
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(5)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(5)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort agent onboarding
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
}
