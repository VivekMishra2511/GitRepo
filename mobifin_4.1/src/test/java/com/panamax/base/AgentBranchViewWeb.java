package com.panamax.base;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

/**
 * @author dishant.doshi Actions of Agent - BranchView
 * @creation date 23/11/2018
 */
public class AgentBranchViewWeb extends Common {
	By txtPhone = By.id("Phone");
	By txtAlternatePhone = By.id("AlternatePhone");
	By txtFirstName = By.id("FirstName");
	By txtLastName = By.id("LastName");
	By txtResellerName = By.id("ResellerName");
	By drpRetailSegment = By.id("CategoryID");
	By txtDOB = By.id("DOB");
	By drpTreeLevel = By.id("TreeCategoryLevel");
	By drpProfile = By.id("TreeProfileID");
	By drpKYCStatus = By.id("KycStatus");
	By drpStatus = By.id("IsActive");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 23/11/2018
	 */
	public AgentBranchViewWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author dishant.doshi to send text in phone
	 * @param phone
	 * @creation date 23/11/2018
	 */
	public void sendTextInPhone(String phone) {
		clearAndSendTextInTextBox(txtPhone, phone);
	}

	/**
	 * @author dishant.doshi to send text in alternate phone
	 * @param alternatePhone
	 * @creation date 23/11/2018
	 */
	public void sendTextInAlternatePhone(String alternatePhone) {
		clearAndSendTextInTextBox(txtAlternatePhone, alternatePhone);
	}

	/**
	 * @author dishant.doshi to send text in first name
	 * @param firstName
	 * @creation date 23/11/2018
	 */
	public void sendTextInFirstName(String firstName) {
		clearAndSendTextInTextBox(txtFirstName, firstName);
	}

	/**
	 * @author dishant.doshi to send text in last name
	 * @param lastName
	 * @creation date 23/11/2018
	 */
	public void sendTextInLastName(String lastName) {
		clearAndSendTextInTextBox(txtLastName, lastName);
	}

	/**
	 * @author dishant.doshi to send text in reseller name
	 * @param resellerName
	 * @creation date 23/11/2018
	 */
	public void sendTextInResellerName(String resellerName) {
		clearAndSendTextInTextBox(txtResellerName, resellerName);
	}

	/**
	 * @author dishant.doshi to select text in retail segment
	 * @param retailSegment
	 * @creation date 23/11/2018
	 */
	public void selectTextInRetailSegment(String retailSegment) {
		selectFromDropdown(drpRetailSegment, retailSegment);
	}

	/**
	 * @author dishant.doshi to send text in date of birth
	 * @param dob
	 * @creation date 23/11/2018
	 */
	public void sendTextInDOB(String dob) {
		sendTextWithRemoveReadOnlyProperty(dob, txtDOB);
	}

	/**
	 * @author dishant.doshi to navigate to profile
	 * @param parentProfileName
	 * @creation date 23/11/2018
	 */
	public void clickOnParentProfile(By parentProfileName) {
		clickOnElement(parentProfileName);
	}

	/**
	 * @author dishant.doshi to select text in tree category level
	 * @param level
	 * @creation date 23/11/2018
	 */
	public void selectTextInTreeCategoryLevel(String level) {
		selectFromDropdown(drpTreeLevel, level);
	}

	/**
	 * @author dishant.doshi to select text in profile
	 * @param profile
	 * @creation date 23/11/2018
	 */
	public void selectTextInProfile(String profile) {
		selectFromDropdown(drpProfile, profile);
	}

	/**
	 * @author dishant.doshi to select text in kyc status
	 * @param kycStatus
	 * @creation date 23/11/2018
	 */
	public void selectTextInKYCStatus(String kycStatus) {
		selectFromDropdown(drpKYCStatus, kycStatus);
	}

	/**
	 * @author dishant.doshi to send text in file uploader sub field
	 * @creation date 23/11/2018
	 */
	public void sendFileInFileUploadField(By element, File FileUploader) {
		sendTextInTextBox(element, FileUploader.getAbsolutePath().replaceAll(FileUploader.toString(), "")
				+ RESOURCES_FOLDER + FileUploader.toString());
	}

	private void selectTextInDropdownField(By xpath, String string) {
		selectFromDropdown(xpath, string);
	}

	public void sendTextInString(String string, By xpath) {
		sendTextWithRemoveReadOnlyProperty(string, xpath);
	}

	public void sendTextInDate(String date, By xpath) {
		sendTextWithRemoveReadOnlyProperty(date, xpath);
	}

	public void sendTextInMultiSelect(By xpath, String string) {
		sendTextInTextBox(xpath, string + Keys.ENTER);
	}

	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to add BranchView
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @return
	 * @creation date 23/11/2018
	 */
	public boolean addBranchView(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			clickOnAddBtn();
			if (getStriptText())
				return false;
			else {
				selectTextInTreeCategoryLevel(map.get(mapKeys.get(1)).toString());
				selectTextInProfile(map.get(mapKeys.get(2)).toString());
				selectTextInKYCStatus(map.get(mapKeys.get(3)).toString());
				commonWait();
				sendTextInPhone(map.get(mapKeys.get(4)).toString());
				sendTextInAlternatePhone(map.get(mapKeys.get(5)).toString());
				selectTextInRetailSegment(map.get(mapKeys.get(6)).toString());
				sendTextInFirstName(map.get(mapKeys.get(7)).toString());
				sendTextInLastName(map.get(mapKeys.get(8)).toString());
				sendTextInResellerName(map.get(mapKeys.get(9)).toString());
				sendTextInDOB(map.get(mapKeys.get(10)).toString());
				if (!(map.get(mapKeys.get(15)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(15)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						selectTextInDropdownField(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']/..//select[contains(@id,'subfieldname') ])[1]"),
								subCategoryField[1].trim());
					}
				}
				if (!(map.get(mapKeys.get(11)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(11)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						File image = new File(subCategoryField[1].trim());
						sendFileInFileUploadField(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']/..//*[contains(@id,'subfieldname') and contains(@type,'file')])[1]"),
								image);
					}
				}
				if (!(map.get(mapKeys.get(12)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(12)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendTextInString(subCategoryField[1].trim(), By.xpath("(//label[normalize-space(text()) = '"
								+ subCategoryField[0].trim()
								+ "']/..//*[contains(@id,'subfieldname') and contains(@fieldtype,'String')])[1]"));
					}
				}
				if (!(map.get(mapKeys.get(13)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(13)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						clickOnElement(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']/..//*[contains(@id,'subfieldname') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
								+ subCategoryField[1].trim() + "']"));
					}
				}
				if (!(map.get(mapKeys.get(14)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(14)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] CategoryFeieldSub = CategoryField[i].split(",");
						for (int j = 0; j < CategoryFeieldSub.length; j++) {
							String[] subCategoryField = CategoryFeieldSub[j].split(":");
							clickOnElement(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']/..//*[contains(@id,'subfieldname') and contains(@type,'checkbox')]//following-sibling:: label[normalize-space(text()) = '"
									+ subCategoryField[1].trim() + "']"));
						}
					}
				}
				if (!(map.get(mapKeys.get(16)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(16)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendTextInDate(subCategoryField[1].trim(), By.xpath("(//label[normalize-space(text()) = '"
								+ subCategoryField[0].trim()
								+ "']/..//*[contains(@id,'subfieldname') and contains(@fieldtype,'Date')])[1]"));
					}
				}
				if (!(map.get(mapKeys.get(17)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(17)).toString().split("/");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] CategoryFeieldSub = CategoryField[i].split(",");
						for (int j = 0; j < CategoryFeieldSub.length; j++) {
							String[] subCategoryField = CategoryFeieldSub[j].split(":");
							sendTextInMultiSelect(
									By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
											+ "']/..//select[contains(@id,'subfieldname') and @multiple='']//following-sibling::div//input)[1]"),
									subCategoryField[1].trim());
						}
					}
				}
				if (!(map.get(mapKeys.get(18)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(18)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendTextInTextBox(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']/..//*[contains(@id,'subfieldname') and contains(@fieldtype,'Decimal')])[1]"),
								subCategoryField[1].trim());
					}
				}
				if (!(map.get(mapKeys.get(19)).toString()).equals("")) {
					String[] CategoryField = map.get(mapKeys.get(19)).toString().split(",");
					for (int i = 0; i < CategoryField.length; i++) {
						String[] subCategoryField = CategoryField[i].split(":");
						sendTextInTextBox(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']/..//*[contains(@id,'subfieldname') and contains(@fieldtype,'Number')])[1]"),
								subCategoryField[1].trim());
					}
				}
				clickOnSaveBtn();
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to verify BranchView added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 19/11/2018
	 * @return true if BranchView added successfully
	 */
	public boolean verifyBranchViewAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By profileName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.PROFILE_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(2)).toString()
				+ "']");
		By kycStatus = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.KYC_STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(3)).toString()
				+ "']");
		By phone = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.PHONE_NUMBER
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(4)).toString()
				+ "']");
		By altPhone = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.ALTERNATE_PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(5)).toString()
				+ "']");
		By retailSegment = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.RETAIL_SEGMENT
				+ "']//following-sibling :: div[contains(text(),'" + map.get(mapKeys.get(6)).toString() + "')]");
		By firstName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(7)).toString()
				+ "']");
		By lastName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.LAST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(8)).toString()
				+ "']");
		By resellerName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.RESELLER_ACCOUNT_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(9)).toString()
				+ "']");
		By dob = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.DATE_OF_BIRTH
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(10)).toString().replaceAll("/", "-")
				+ "']");
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(9)).toString() + "']");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			if (!verifyElement(profileName, false))
				return false;
			if (!verifyElement(kycStatus, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(phone, false))
					return false;
				if (!verifyElement(altPhone, false))
					return false;
			}
			if (!verifyElement(retailSegment, false))
				return false;
			if (!verifyElement(firstName, false))
				return false;
			if (!verifyElement(lastName, false))
				return false;
			if (!verifyElement(resellerName, false))
				return false;
			if (!verifyElement(dob, false))
				return false;

			if (!(map.get(mapKeys.get(15)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(15)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(11)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(11)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(12)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(12)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(13)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(13)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(14)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(14)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(",");
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
			if (!(map.get(mapKeys.get(16)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(16)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(17)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(17)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(",");
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
			if (!(map.get(mapKeys.get(18)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(18)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(19)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(19)).toString().split(",");
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
	 * @author dishant.doshi to edit BranchView
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 19/11/2018
	 */
	public void editBranchView(Map<Object, Object> map, List<Object> mapKeys) {
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			clickOnEditBtn();
			selectTextInKYCStatus(map.get(mapKeys.get(1)).toString());
			selectTextInStatus(map.get(mapKeys.get(2)).toString());
			if (!map.get(mapKeys.get(3)).toString().isEmpty())
				sendTextInPhone(map.get(mapKeys.get(3)).toString());
			if (!map.get(mapKeys.get(4)).toString().isEmpty())
				sendTextInAlternatePhone(map.get(mapKeys.get(4)).toString());
			if (!map.get(mapKeys.get(5)).toString().isEmpty())
				selectTextInRetailSegment(map.get(mapKeys.get(5)).toString());
			if (!map.get(mapKeys.get(6)).toString().isEmpty())
				sendTextInFirstName(map.get(mapKeys.get(6)).toString());
			if (!map.get(mapKeys.get(7)).toString().isEmpty())
				sendTextInLastName(map.get(mapKeys.get(7)).toString());
			if (!map.get(mapKeys.get(9)).toString().isEmpty())
				sendTextInDOB(map.get(mapKeys.get(9)).toString());
			if (!(map.get(mapKeys.get(14)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(14)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					selectTextInDropdownField(By.xpath("(//label[normalize-space(text()) = '"
							+ subCategoryField[0].trim() + "']/..//select[contains(@id,'subfieldname') ])[1]"),
							subCategoryField[1].trim());
				}
			}
			if (!(map.get(mapKeys.get(10)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(10)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					File image = new File(subCategoryField[1].trim());
					sendFileInFileUploadField(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']/..//*[contains(@id,'subfieldname') and contains(@type,'file')])[1]"),
							image);
				}
			}
			if (!(map.get(mapKeys.get(11)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(11)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInString(subCategoryField[1].trim(),
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']/..//*[contains(@id,'subfieldname') and contains(@fieldtype,'String')])[1]"));
				}
			}
			if (!(map.get(mapKeys.get(12)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(12)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					clickOnElement(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']/..//*[contains(@id,'subfieldname') and contains(@type,'radio')]//following-sibling:: label[normalize-space(text()) = '"
							+ subCategoryField[1].trim() + "']"));
				}
			}
			if (!(map.get(mapKeys.get(13)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(13)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(",");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						clickOnElement(By.xpath("//label[normalize-space(text()) = '" + subCategoryField[0].trim()
								+ "']/..//*[contains(@id,'subfieldname') and contains(@type,'checkbox')]//following-sibling:: label[normalize-space(text()) = '"
								+ subCategoryField[1].trim() + "']"));
					}
				}
			}
			if (!(map.get(mapKeys.get(15)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(15)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInDate(subCategoryField[1].trim(),
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']/..//*[contains(@id,'subfieldname') and contains(@fieldtype,'Date')])[1]"));
				}
			}
			if (!(map.get(mapKeys.get(16)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(16)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(",");
					for (int j = 0; j < CategoryFeieldSub.length; j++) {
						String[] subCategoryField = CategoryFeieldSub[j].split(":");
						sendTextInMultiSelect(
								By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
										+ "']/..//select[contains(@id,'subfieldname') and @multiple='']//following-sibling::div//input)[1]"),
								subCategoryField[1].trim());
					}
				}
			}
			if (!(map.get(mapKeys.get(17)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(17)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextBox(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']/..//*[contains(@id,'subfieldname') and contains(@fieldtype,'Decimal')])[1]"),
							subCategoryField[1].trim());
				}
			}
			if (!(map.get(mapKeys.get(18)).toString()).isEmpty()) {
				String[] CategoryField = map.get(mapKeys.get(18)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					sendTextInTextBox(
							By.xpath("(//label[normalize-space(text()) = '" + subCategoryField[0].trim()
									+ "']/..//*[contains(@id,'subfieldname') and contains(@fieldtype,'Number')])[1]"),
							subCategoryField[1].trim());
				}
			}
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify BranchView edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 20/11/2018
	 * @return true if BranchView edited successfully
	 */
	public boolean verifyBranchViewEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By kycStatus = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.KYC_STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(1)).toString()
				+ "']");
		By status = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.STATUS
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(2)).toString()
				+ "']");
		By phone = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.PHONE_NUMBER
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(3)).toString()
				+ "']");
		By altPhone = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.ALTERNATE_PHONE
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(4)).toString()
				+ "']");
		By retailSegment = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.RETAIL_SEGMENT
				+ "']//following-sibling :: div[contains(text(),'" + map.get(mapKeys.get(5)).toString() + "')]");
		By firstName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.FIRST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(6)).toString()
				+ "']");
		By lastName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.LAST_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(7)).toString()
				+ "']");
		By resellerName = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.RESELLER_ACCOUNT_NAME
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(8)).toString()
				+ "']");
		By dob = By.xpath("//label[normalize-space(text()) = '" + ConstantsFile.DATE_OF_BIRTH
				+ "']//following-sibling :: div[normalize-space(text()) = '" + map.get(mapKeys.get(9)).toString()
				+ "']");
		By parentProfile = By.xpath("//li[@id='root']//a[text()='" + map.get(mapKeys.get(0)).toString() + "']");
		if (verifyElement(parentProfile, false)) {
			clickOnParentProfile(parentProfile);
			if (!verifyElement(kycStatus, false))
				return false;
			if (!verifyElement(status, false))
				return false;
			if (maskingAllowed) {
				if (!verifyElement(phone, false))
					return false;
				if (!verifyElement(altPhone, false))
					return false;
			}
			if (!verifyElement(retailSegment, false)&&!map.get(mapKeys.get(5)).toString().isEmpty())
				return false;
			if (!verifyElement(firstName, false)&&!map.get(mapKeys.get(6)).toString().isEmpty())
				return false;
			if (!verifyElement(lastName, false)&&!map.get(mapKeys.get(7)).toString().isEmpty())
				return false;
			if (!verifyElement(resellerName, false)&&!map.get(mapKeys.get(8)).toString().isEmpty())
				return false;
			if (!verifyElement(dob, false)&&!map.get(mapKeys.get(9)).toString().isEmpty())
				return false;

			if (!(map.get(mapKeys.get(14)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(14)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dropDownCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dropDownCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(10)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(10)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By fileUploadCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div//a[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(fileUploadCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(11)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(11)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By stringCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(stringCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(12)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(12)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By radioCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[contains(text() , '" + subCategoryField[1].trim()
							+ "')])[1]");
					if (!verifyElement(radioCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(13)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(13)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(",");
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
			if (!(map.get(mapKeys.get(15)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(15)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By dobCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(dobCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(16)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(16)).toString().split("/");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] CategoryFeieldSub = CategoryField[i].split(",");
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
			if (!(map.get(mapKeys.get(17)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(17)).toString().split(",");
				for (int i = 0; i < CategoryField.length; i++) {
					String[] subCategoryField = CategoryField[i].split(":");
					By decimalCategory = By.xpath("(//*[normalize-space(text()) = '" + subCategoryField[0].trim()
							+ "']//following-sibling :: div[normalize-space(text()) = '" + subCategoryField[1].trim()
							+ "'])[1]");
					if (!verifyElement(decimalCategory, false))
						return false;
				}
			}
			if (!(map.get(mapKeys.get(18)).toString()).equals("")) {
				String[] CategoryField = map.get(mapKeys.get(18)).toString().split(",");
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
}
