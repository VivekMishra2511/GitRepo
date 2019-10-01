package com.panamax.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.panamax.init.Common;
import com.panamax.init.TestDataImport;

/**
 * @author dishant.doshi Actions of Settings - DKYCMaster - Field
 * @creation date 12/10/2018
 */
public class SettingsDKYCMasterFieldWeb extends Common {
	By txtFieldName = By.id("FieldName");
	By drpStatus = By.id("IsActive");
	By radioBtnFieldTypeDocument = By.xpath("//label[text()='Document']");
	By radioBtnFieldTypeNormal = By.xpath("//label[text()='Normal']");
	By drpFieldLevel = By.id("NoOfField");
	By txtFieldNameSearch = By.id("txtFieldName");
	By drpStatusSearch = By.id("cmbIsActive");
	By noOfFieldTypes = By.xpath(
			"//input[contains(@id,'txtdeletedfieldname')]//..//label[text()[normalize-space() = 'Field Type']]//following-sibling :: div");
	By drpCategoryModule = By.id("CategoryModuleID");
	By drpFieldCategory = By.id("FieldCategoryID");
	By drpFieldCategorySearch = By.id("cmbFieldCategoryID");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 12/10/2018
	 */
	public SettingsDKYCMasterFieldWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2, String str3) {
		commonFilterSearch();
		sentTextInFieldNameInSearch(str1);
		if (!str2.equals(""))
			selectTextInFieldCategoryInSearch(str2);
		selectTextInStatusInSearch(str3);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to send text in field name
	 * @param field
	 * @creation date 12/10/2018
	 */
	public void sendTextInFieldName(String field) {
		clearAndSendTextInTextBox(txtFieldName, field);
	}

	/**
	 * @author dishant.doshi to select value from status drop down
	 * @param status
	 * @creation date 12/10/2018
	 */
	public void selectTextInStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author dishant.doshi to click on field type radio button
	 * @param element
	 * @creation date 12/10/2018
	 */
	public void clickOnFieldType(By element) {
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to select value from field level drop down
	 * @param strings
	 *            - no of fields
	 * @creation date 12/10/2018
	 */
	public void selectFieldLevel(String[] strings) {
		selectFromDropdownByIndex(drpFieldLevel, strings.length);
	}

	/**
	 * @author dishant.doshi to send text in field name EN
	 * @param element
	 * @param fieldNameEN
	 * @creation date 12/10/2018
	 */
	public void sendTextInFieldNameEN(By element, String fieldNameEN) {
		clearAndSendTextInTextBox(element, fieldNameEN);
	}

	/**
	 * @author dishant.doshi to send text in field name FR
	 * @param element
	 * @param fieldNameFR
	 * @creation date 12/10/2018
	 */
	public void sendTextInFieldNameFR(By element, String fieldNameFR) {
		clearAndSendTextInTextBox(element, fieldNameFR);
	}

	/**
	 * @author dishant.doshi to send text in field name ES
	 * @param element
	 * @param fieldNameES
	 * @creation date 12/10/2018
	 */
	public void sendTextInFieldNameES(By element, String fieldNameES) {
		clearAndSendTextInTextBox(element, fieldNameES);
	}

	/**
	 * @author dishant.doshi to select value from field type drop down
	 * @param fieldType
	 * @creation date 15/10/2018
	 */
	public void selectTextInFieldType(By element, String fieldType) {
		selectFromDropdown(element, fieldType);
	}

	/**
	 * @author dishant.doshi to select mandatory field
	 * @param element
	 * @param sheetName
	 * @creation date 12/10/2018
	 */
	public void selectTextInMandatoryField(By element, String sheetName) {
		selectFromDropdown(element, sheetName);
	}

	/**
	 * @author dishant.doshi to send text in regular expression in string field
	 *         type
	 * @param element
	 * @param regularExp
	 * @creation date 15/10/2018
	 */
	public void sendTextInRegularExpressionInStringFieldType(By element, String regularExp) {
		clearAndSendTextInTextBox(element, regularExp);
	}

	/**
	 * @author dishant.doshi to send text in minimum length in string field type
	 * @param element
	 * @param minLength
	 * @creation date 15/10/2018
	 */
	public void sendTextInMinLengthInStringFieldType(By element, String minLength) {
		clearAndSendTextInTextBox(element, minLength);
	}

	/**
	 * @author dishant.doshi to send text in maximum length in string field type
	 * @param element
	 * @param maxLength
	 * @creation date 15/10/2018
	 */
	public void sendTextInMaxLengthInStringFieldType(By element, String maxLength) {
		clearAndSendTextInTextBox(element, maxLength);
	}

	/**
	 * @author dishant.doshi to send text in value in radio field type
	 * @param element
	 * @param value
	 * @creation date 15/10/2018
	 */
	public void sendTextInValueInRadioFieldType(By element, String value) {
		clearAndSendTextInTextBox(element, value);
	}

	/**
	 * @author dishant.doshi to click on add value button in radio field type
	 * @param element
	 * @creation date 15/10/2018
	 */
	public void clickOnAddValueButtonInRadioFieldType(By element) {
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to select extension in file upload field type
	 * @param element
	 * @param extension
	 * @creation date 15/10/2018
	 */
	public void sendTextInExtensionInFileUploadFieldType(By element, String extension) {
		clearAndSendTextInTextBox(element, extension);
	}

	/**
	 * @author dishant.doshi to send text in max file size in file upload field
	 *         type
	 * @param element
	 * @param fileSize
	 * @creation date 15/10/2018
	 */
	public void sendTextInMaximumFileSizeInFileUploadFieldType(By element, String fileSize) {
		clearAndSendTextInTextBox(element, fileSize);
	}

	/**
	 * @author dishant.doshi to send text in value in check box field type
	 * @param element
	 * @param value
	 * @creation date 15/10/2018
	 */
	public void sendTextInValueInCheckBoxFieldType(By element, String value) {
		clearAndSendTextInTextBox(element, value);
	}

	/**
	 * @author dishant.doshi to click on add value button in check box field
	 *         type
	 * @param element
	 * @creation date 15/10/2018
	 */
	public void clickOnAddValueButtonInCheckBoxFieldType(By element) {
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to send text in value in multi select field type
	 * @param element
	 * @param value
	 * @creation date 15/10/2018
	 */
	public void sendTextInValueInMultiSelectFieldType(By element, String value) {
		clearAndSendTextInTextBox(element, value);
	}

	/**
	 * @author dishant.doshi to click on add value button in multi select field
	 *         type
	 * @param element
	 * @creation date 15/10/2018
	 */
	public void clickOnAddValueButtonInMultiSelectFieldType(By element) {
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to send text in value in drop down field type
	 * @param element
	 * @param value
	 * @creation date 15/10/2018
	 */
	public void sendTextInValueInDropDownFieldType(By element, String value) {
		clearAndSendTextInTextBox(element, value);
	}

	/**
	 * @author dishant.doshi to click on add value button in drop down field
	 *         type
	 * @param element
	 * @creation date 15/10/2018
	 */
	public void clickOnAddValueButtonInDropDownFieldType(By element) {
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to click on other check box button in drop down
	 *         field type
	 * @param element
	 * @creation date 15/10/2018
	 */
	public void clickOnOtherCheckBoxButtonInDropDownFieldType(By element) {
		clickOnElement(element);
	}

	/**
	 * @author dishant.doshi to send text in other option in drop down field
	 *         type
	 * @param element
	 * @param otherOption
	 * @creation date 15/10/2018
	 */
	public void sendTextInOtherOptionInDropDownFieldType(By element, String otherOption) {
		clearAndSendTextInTextBox(element, otherOption);
	}

	/**
	 * @author dishant.doshi to select allow time in date time field type
	 * @param element
	 * @param allowTime
	 * @creation date 15/10/2018
	 */
	public void selectTextInAllowTimeInDateTimeFieldType(By element, String allowTime) {
		selectFromDropdown(element, allowTime);
	}

	/**
	 * @author dishant.doshi to select date time validation in date time field
	 *         type
	 * @param element
	 * @param dateTimeValidation
	 * @creation date 15/10/2018
	 */
	public void selectTextInDateTimeValidationInDateTimeFieldType(By element, String dateTimeValidation) {
		selectFromDropdown(element, dateTimeValidation);
	}

	/**
	 * @author dishant.doshi to set start date in date time field type
	 * @param element
	 * @param startDate
	 * @creation date 15/10/2018
	 */
	public void setStartDateInDateTimeFieldType(By element, String startDate) {
		sendTextWithRemoveReadOnlyProperty(startDate, element);
	}

	/**
	 * @author dishant.doshi to set end date in date time field type
	 * @param element
	 * @param endDate
	 * @creation date 15/10/2018
	 */
	public void setEndDateInDateTimeFieldType(By element, String endDate) {
		sendTextWithRemoveReadOnlyProperty(endDate, element);
	}

	/**
	 * @author dishant.doshi to send text in minimum length in number field type
	 * @param element
	 * @param minLength
	 * @creation date 15/10/2018
	 */
	public void sendTextInMinLengthInNumberFieldType(By element, String minLength) {
		clearAndSendTextInTextBox(element, minLength);
	}

	/**
	 * @author dishant.doshi to select allow time in date time field type
	 * @param element
	 * @param allowTime
	 * @creation date 12/10/2018
	 */
	public void selectTextInDateTimeValidationInDateFieldType(By element, String dateTimeValidation) {
		selectFromDropdown(element, dateTimeValidation);
	}

	/**
	 * @author dishant.doshi to set start date in date field type
	 * @param element
	 * @param startDate
	 * @creation date 15/10/2018
	 */
	public void setStartDateInDateFieldType(By element, String startDate) {
		setDate(element, startDate);
	}

	/**
	 * @author dishant.doshi to set end date in date field type
	 * @param element
	 * @param endDate
	 * @creation date 15/10/2018
	 */
	public void setEndDateInDateFieldType(By element, String endDate) {
		setDate(element, endDate);
	}

	/**
	 * @author dishant.doshi to send text in maximum length in string field type
	 * @param element
	 * @param maxLength
	 * @creation date 15/10/2018
	 */
	public void sendTextInMaxLengthInNumberFieldType(By element, String maxLength) {
		clearAndSendTextInTextBox(element, maxLength);
	}

	/**
	 * @author dishant.doshi to select allow time in date time field type
	 * @param element
	 * @param allowTime
	 * @creation date 12/10/2018
	 */
	public void selectTextInPrecisionInDecimalFieldTypes(By element, String precision) {
		selectFromDropdown(element, precision);
	}

	/**
	 * @author dishant.doshi to send text in minimum length in decimal field
	 *         type
	 * @param element
	 * @param minLength
	 * @creation date 15/10/2018
	 */
	public void sendTextInMinLengthInDecimalFieldType(By element, String minLength) {
		clearAndSendTextInTextBox(element, minLength);
	}

	/**
	 * @author dishant.doshi to send text in maximum length in string field type
	 * @param element
	 * @param maxLength
	 * @creation date 15/10/2018
	 */
	public void sendTextInMaxLengthInDecimalFieldType(By element, String maxLength) {
		clearAndSendTextInTextBox(element, maxLength);
	}

	/**
	 * @author dishant.doshi to send text in field name EN
	 * @param element
	 * @param fieldNameEN
	 * @creation date 15/10/2018
	 */
	public void sendTextInResponseCodeEN(By element, String fieldNameEN) {
		clearAndSendTextInTextBox(element, fieldNameEN);
	}

	/**
	 * @author dishant.doshi to send text in field name EN
	 * @param element
	 * @param fieldNameEN
	 * @creation date 15/10/2018
	 */
	public void sendTextInResponseCodeFR(By element, String fieldNameFR) {
		clearAndSendTextInTextBox(element, fieldNameFR);
	}

	/**
	 * @author dishant.doshi to send text in field name EN
	 * @param element
	 * @param fieldNameEN
	 * @creation date 15/10/2018
	 */
	public void sendTextInResponseCodeES(By element, String fieldNameES) {
		clearAndSendTextInTextBox(element, fieldNameES);
	}

	/**
	 * @author dishant.doshi to send text in field name in search
	 * @param fieldName
	 * @creation date 15/10/2018
	 */
	public void sentTextInFieldNameInSearch(String fieldName) {
		clearAndSendTextInTextBox(txtFieldNameSearch, fieldName);
	}

	/**
	 * @author dishant.doshi to select text in status in search
	 * @param status
	 * @creation date 15/10/2018
	 */
	public void selectTextInStatusInSearch(String status) {
		selectFromDropdown(drpStatusSearch, status);
	}

	/**
	 * @author dishant.doshi to select value from category module drop down
	 * @param categoryModuleName
	 * @creation date 25/10/2018
	 */
	public void selectTextInCategoryModule(String categoryModuleName) {
		selectFromDropdown(drpCategoryModule, categoryModuleName);
	}

	/**
	 * @author dishant.doshi to select value from field category drop down
	 * @param fieldCategoryName
	 * @creation date 25/10/2018
	 */
	public void selectTextInFieldCategory(String fieldCategoryName) {
		selectFromDropdown(drpFieldCategory, fieldCategoryName);
	}

	/**
	 * @author dishant.doshi to select value from field category drop down in
	 *         filter search
	 * @param fieldCategoryName
	 * @creation date 25/10/2018
	 */
	public void selectTextInFieldCategoryInSearch(String fieldCategoryName) {
		selectFromDropdown(drpFieldCategorySearch, fieldCategoryName);
	}

	/**
	 * @author dishant.doshi to add field
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 12/10/2018
	 */
	public void addField(Map<Object, Object> map, List<Object> mapKeys) {
		String fileName = test_data_folder_path + dkycFile;
		String[] dkycType = map.get(mapKeys.get(4)).toString().trim().split(",");
		clickOnAddBtn();
		if (!map.get(mapKeys.get(0)).toString().trim().equals(""))
			selectTextInCategoryModule(map.get(mapKeys.get(0)).toString().trim());
		if (!map.get(mapKeys.get(1)).toString().trim().equals(""))
			selectTextInFieldCategory(map.get(mapKeys.get(1)).toString().trim());
		sendTextInFieldName(map.get(mapKeys.get(2)).toString().trim());
		if ((map.get(mapKeys.get(3)).toString().trim().equalsIgnoreCase("Document"))) {
			clickOnFieldType(radioBtnFieldTypeDocument);
			selectFieldLevel(dkycType);
			selectTextInStatus(map.get(mapKeys.get(5)).toString().trim());
			for (int d = 0; d < dkycType.length; d++) {
				String sheetName = "";
				if (dkycType[d].toLowerCase().contains("string")) {
					sheetName = "String";
				} else if (dkycType[d].toLowerCase().contains("radio")) {
					sheetName = "Radio";
				} else if (dkycType[d].toLowerCase().contains("fileupload")) {
					sheetName = "FileUpload";
				} else if (dkycType[d].toLowerCase().contains("checkbox")) {
					sheetName = "Checkbox";
				} else if (dkycType[d].toLowerCase().contains("multiselect")) {
					sheetName = "MultiSelect";
				} else if (dkycType[d].toLowerCase().contains("dropdown")) {
					sheetName = "Dropdown";
				} else if (dkycType[d].toLowerCase().contains("datetime")) {
					sheetName = "DateTime";
				} else if (dkycType[d].toLowerCase().contains("decimal")) {
					sheetName = "Decimal";
				} else if (dkycType[d].toLowerCase().contains("date")) {
					sheetName = "Date";
				} else if (dkycType[d].toLowerCase().contains("number")) {
					sheetName = "Number";
				}
				int rowNumber = TestDataImport.findRow(fileName, sheetName, dkycType[d]);
				Map<Object, Object> dkycMap = TestDataImport.readExcelFileTo2D(fileName, sheetName, rowNumber);
				sendTextInFieldNameEN(By
						.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[en]')])[" + (d + 1) + "]"),
						dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim());
				if (verifyElement(By
						.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
						false))
					sendTextInFieldNameFR(By.xpath(
							"(//input[contains(@name,'txtfieldname') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
							dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " FR");
				sendTextInFieldNameES(By
						.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[es]')])[" + (d + 1) + "]"),
						dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " ES");
				selectTextInFieldType(By.id("cmbvalidateType_" + (d + 1)), sheetName);
				selectTextInMandatoryField(By.id("Required_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim());
				switch (sheetName) {
				case "String":
					sendTextInRegularExpressionInStringFieldType(By.id("regulerexpression_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					sendTextInMinLengthInStringFieldType(By.id("minimum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					sendTextInMaxLengthInStringFieldType(By.id("maximum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
					break;
				case "Radio":
					String[] radioValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int v = 0; v < radioValues.length; v++) {
						sendTextInValueInRadioFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)), radioValues[v]);
						if (v != radioValues.length - 1) {
							commonWait();
							clickOnAddValueButtonInRadioFieldType(By.id("btnAddNew_" + (d + 1)));
						}
					}
					break;
				case "FileUpload":
					String[] extensions = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int e = 0; e < extensions.length; e++) {
						sendTextInExtensionInFileUploadFieldType(
								By.xpath(".//*[@id='fileextention_" + (d + 1) + "']//following-sibling :: div//input"),
								extensions[e] + Keys.ENTER);
					}
					sendTextInMaximumFileSizeInFileUploadFieldType(By.id("filesize_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					break;
				case "Checkbox":
					String[] checkboxValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int v = 0; v < checkboxValues.length; v++) {
						sendTextInValueInCheckBoxFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)),
								checkboxValues[v]);
						if (v != checkboxValues.length - 1) {
							commonWait();
							clickOnAddValueButtonInCheckBoxFieldType(By.id("btnAddNew_" + (d + 1)));
						}
					}
					break;
				case "MultiSelect":
					String[] multiSelectValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int v = 0; v < multiSelectValues.length; v++) {
						sendTextInValueInMultiSelectFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)),
								multiSelectValues[v]);
						if (v != multiSelectValues.length - 1) {
							clickOnAddValueButtonInMultiSelectFieldType(By.id("btnAddNew_" + (d + 1)));
						}
					}
					break;
				case "Dropdown":
					String[] dropdownValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int v = 0; v < dropdownValues.length; v++) {
						sendTextInValueInDropDownFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)),
								dropdownValues[v]);
						if (v != dropdownValues.length - 1) {
							commonWait();
							clickOnAddValueButtonInDropDownFieldType(By.id("btnAddNew_" + (d + 1)));
						}
					}
					if (!(dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equalsIgnoreCase(""))) {
						clickOnOtherCheckBoxButtonInDropDownFieldType(By.id("Othercheckbox_" + (d + 1)));
						sendTextInOtherOptionInDropDownFieldType(
								By.id("otherfield_value_" + (d + 1) + "_" + (dropdownValues.length + 1)),
								dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					}
					break;
				case "DateTime":
					selectTextInAllowTimeInDateTimeFieldType(By.id("allowtime_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					selectTextInDateTimeValidationInDateTimeFieldType(By.id("datetimevalidation_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					setStartDateInDateTimeFieldType(By.id("startdate_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
					setEndDateInDateTimeFieldType(By.id("enddate_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(6)).toString().trim());
					break;
				case "Number":
					sendTextInMinLengthInNumberFieldType(By.id("minimum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					sendTextInMaxLengthInNumberFieldType(By.id("maximum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					break;
				case "Decimal":
					selectTextInPrecisionInDecimalFieldTypes(By.id("numberprecesion_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					sendTextInMinLengthInDecimalFieldType(By.id("minimum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					sendTextInMaxLengthInDecimalFieldType(By.id("maximum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
					break;
				case "Date":
					selectTextInDateTimeValidationInDateFieldType(By.id("datetimevalidation_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					setStartDateInDateFieldType(By.id("startdate_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					setEndDateInDateFieldType(By.id("enddate_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
					break;
				default:
					break;
				}
				sendTextInResponseCodeEN(
						By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[en]')])[" + (d + 1)
								+ "]"),
						dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim());
				if (verifyElement(By
						.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
						false))
					sendTextInResponseCodeFR(
							By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[fr]')])[" + (d + 1)
									+ "]"),
							dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim()
									+ " FR");
				sendTextInResponseCodeES(
						By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[es]')])[" + (d + 1)
								+ "]"),
						dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim() + " ES");
			}
		} else {
			clickOnFieldType(radioBtnFieldTypeNormal);
			selectTextInStatus(map.get(mapKeys.get(5)).toString().trim());
			int d = 0;
			String sheetName = "";
			if (dkycType[d].toLowerCase().contains("string")) {
				sheetName = "String";
			} else if (dkycType[d].toLowerCase().contains("radio")) {
				sheetName = "Radio";
			} else if (dkycType[d].toLowerCase().contains("fileupload")) {
				sheetName = "FileUpload";
			} else if (dkycType[d].toLowerCase().contains("checkbox")) {
				sheetName = "Checkbox";
			} else if (dkycType[d].toLowerCase().contains("multiselect")) {
				sheetName = "MultiSelect";
			} else if (dkycType[d].toLowerCase().contains("dropdown")) {
				sheetName = "Dropdown";
			} else if (dkycType[d].toLowerCase().contains("datetime")) {
				sheetName = "DateTime";
			} else if (dkycType[d].toLowerCase().contains("decimal")) {
				sheetName = "Decimal";
			} else if (dkycType[d].toLowerCase().contains("date")) {
				sheetName = "Date";
			} else if (dkycType[d].toLowerCase().contains("number")) {
				sheetName = "Number";
			}
			int rowNumber = TestDataImport.findRow(fileName, sheetName, dkycType[d]);
			Map<Object, Object> dkycMap = TestDataImport.readExcelFileTo2D(fileName, sheetName, rowNumber);
			sendTextInFieldNameEN(
					By.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[en]')])[" + (d + 1) + "]"),
					dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim());
			if (verifyElement(
					By.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
					false))
				sendTextInFieldNameFR(By
						.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
						dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " FR");
			sendTextInFieldNameES(
					By.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[es]')])[" + (d + 1) + "]"),
					dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " ES");
			selectTextInFieldType(By.id("cmbvalidateType_" + (d + 1)), sheetName);
			switch (sheetName) {
			case "String":
				sendTextInRegularExpressionInStringFieldType(By.id("regulerexpression_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
				sendTextInMinLengthInStringFieldType(By.id("minimum_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
				sendTextInMaxLengthInStringFieldType(By.id("maximum_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
				break;
			case "Radio":
				String[] radioValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
				for (int v = 0; v < radioValues.length; v++) {
					sendTextInValueInRadioFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)), radioValues[v]);
					if (v != radioValues.length - 1) {
						clickOnAddValueButtonInRadioFieldType(By.id("btnAddNew_" + (d + 1)));
					}
				}
				break;
			case "FileUpload":
				String[] extensions = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
				for (int e = 0; e < extensions.length; e++) {
					sendTextInExtensionInFileUploadFieldType(
							By.xpath(".//*[@id='fileextention_" + (d + 1) + "']//following-sibling :: div//input"),
							extensions[e] + Keys.ENTER);
				}
				sendTextInMaximumFileSizeInFileUploadFieldType(By.id("filesize_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
				break;
			case "Checkbox":
				String[] checkboxValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
				for (int v = 0; v < checkboxValues.length; v++) {
					sendTextInValueInCheckBoxFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)), checkboxValues[v]);
					if (v != checkboxValues.length - 1) {
						clickOnAddValueButtonInCheckBoxFieldType(By.id("btnAddNew_" + (d + 1)));
					}
				}
				break;
			case "MultiSelect":
				String[] multiSelectValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
				for (int v = 0; v < multiSelectValues.length; v++) {
					sendTextInValueInMultiSelectFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)),
							multiSelectValues[v]);
					if (v != multiSelectValues.length - 1) {
						clickOnAddValueButtonInMultiSelectFieldType(By.id("btnAddNew_" + (d + 1)));
					}
				}
				break;
			case "Dropdown":
				String[] dropdownValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
				for (int v = 0; v < dropdownValues.length; v++) {
					sendTextInValueInDropDownFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)), dropdownValues[v]);
					if (v != dropdownValues.length - 1) {
						clickOnAddValueButtonInDropDownFieldType(By.id("btnAddNew_" + (d + 1)));
					}
				}
				if (!(dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equalsIgnoreCase(""))) {
					clickOnOtherCheckBoxButtonInDropDownFieldType(By.id("Othercheckbox_" + (d + 1)));
					sendTextInOtherOptionInDropDownFieldType(
							By.id("otherfield_value_" + (d + 1) + "_" + (dropdownValues.length + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
				}
				break;
			case "DateTime":
				selectTextInAllowTimeInDateTimeFieldType(By.id("allowtime_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
				selectTextInDateTimeValidationInDateTimeFieldType(By.id("datetimevalidation_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
				if(!dkycMap.get(getMapKeys(dkycMap).get(5)).toString().equals("")){
					setStartDateInDateTimeFieldType(By.id("startdate_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
				}
				if(!dkycMap.get(getMapKeys(dkycMap).get(6)).toString().equals("")){
					setEndDateInDateTimeFieldType(By.id("enddate_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(6)).toString().trim());
				}
				break;
			case "Number":
				sendTextInMinLengthInNumberFieldType(By.id("minimum_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
				sendTextInMaxLengthInNumberFieldType(By.id("maximum_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
				break;
			case "Decimal":
				selectTextInPrecisionInDecimalFieldTypes(By.id("numberprecesion_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
				sendTextInMinLengthInDecimalFieldType(By.id("minimum_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
				sendTextInMaxLengthInDecimalFieldType(By.id("maximum_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
				break;
			case "Date":
				selectTextInDateTimeValidationInDateFieldType(By.id("datetimevalidation_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
				if(!dkycMap.get(getMapKeys(dkycMap).get(4)).toString().equals("")){
					setStartDateInDateFieldType(By.id("startdate_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
				}
				if(!dkycMap.get(getMapKeys(dkycMap).get(5)).toString().equals("")){
					setEndDateInDateFieldType(By.id("enddate_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
				}
				break;
			default:
				break;
			}
			sendTextInResponseCodeEN(
					By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[en]')])[" + (d + 1) + "]"),
					dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim());
			if (verifyElement(
					By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
					false))
				sendTextInResponseCodeFR(
						By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[fr]')])[" + (d + 1)
								+ "]"),
						dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim() + " FR");
			sendTextInResponseCodeES(
					By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[es]')])[" + (d + 1) + "]"),
					dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim() + " ES");
		}
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify field added?
	 * @param map
	 *            - excel values
	 *            
	 * @param keys
	 *            - excel header
	 * @creation date 23/10/2018
	 * @return true if field added successfully
	 */
	public boolean verifyFieldAdded(Map<Object, Object> map, List<Object> mapKeys) {
		String[] dkycType = map.get(mapKeys.get(4)).toString().trim().split(",");
		String fileName = test_data_folder_path + dkycFile;
		By categoryModule = By
				.xpath("(//label[text()='Category Module']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(0)).toString().trim() + "']])[1]");
		By fieldCategory = By
				.xpath("(//label[text()='Field Category']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(1)).toString().trim() + "']])[1]");
		By fieldName = By.xpath("(//label[text()='Field Name']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(mapKeys.get(2)).toString().trim() + "']])[1]");
		By fieldType = By.xpath("(//label[text()='Field Type']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(mapKeys.get(3)).toString().trim() + "']])[1]");
		String fieldname = map.get(mapKeys.get(1)).toString();
		String categoryType = map.get(mapKeys.get(0)).toString();
		if(fieldname.equalsIgnoreCase("General Category")) {
			if(categoryType.equalsIgnoreCase("Customer"))
				categoryType = "Subscriber";
			fieldname = categoryType + " " + fieldname;
		}
		filterSearch(map.get(mapKeys.get(2)).toString(), fieldname,
				map.get(mapKeys.get(5)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString().trim() + "'])[1]"),
				false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString().trim());
			if (!verifyElement(categoryModule, false) && !map.get(mapKeys.get(0)).toString().trim().equals(""))
				return false;
			if (!verifyElement(fieldCategory, false) && !map.get(mapKeys.get(1)).toString().trim().equals(""))
				return false;
			if (!verifyElement(fieldName, false))
				return false;
			if (!verifyElement(fieldType, false))
				return false;
			if ((map.get(mapKeys.get(3)).toString().trim().equalsIgnoreCase("Document"))) {
				for (int d = 0; d < dkycType.length; d++) {
					String sheetName = "";
					if (dkycType[d].toLowerCase().contains("string")) {
						sheetName = "String";
					} else if (dkycType[d].toLowerCase().contains("radio")) {
						sheetName = "Radio";
					} else if (dkycType[d].toLowerCase().contains("fileupload")) {
						sheetName = "FileUpload";
					} else if (dkycType[d].toLowerCase().contains("checkbox")) {
						sheetName = "Checkbox";
					} else if (dkycType[d].toLowerCase().contains("multiselect")) {
						sheetName = "MultiSelect";
					} else if (dkycType[d].toLowerCase().contains("dropdown")) {
						sheetName = "Dropdown";
					} else if (dkycType[d].toLowerCase().contains("datetime")) {
						sheetName = "DateTime";
					} else if (dkycType[d].toLowerCase().contains("decimal")) {
						sheetName = "Decimal";
					} else if (dkycType[d].toLowerCase().contains("date")) {
						sheetName = "Date";
					} else if (dkycType[d].toLowerCase().contains("number")) {
						sheetName = "Number";
					}
					int rowNumber = TestDataImport.findRow(fileName, sheetName, dkycType[d]);
					Map<Object, Object> dkycMap = TestDataImport.readExcelFileTo2D(fileName, sheetName, rowNumber);
					By fieldNameEN = By
							.xpath("//*[text()='en']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + "']");
					By fieldNameFR = By
							.xpath("//*[text()='fr']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " FR" + "']");
					By fieldNameES = By
							.xpath("//*[text()='es']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " ES" + "']");
					By responseDescriptionEN = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString()
											.trim()
									+ "']//following-sibling::div//*[text()='en']");
					By responseDescriptionFR = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString()
											.trim()
									+ " FR" + "']//following-sibling::div//*[text()='fr']");
					By responseDescriptionES = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString()
											.trim()
									+ " ES" + "']//following-sibling::div//*[text()='es']");
					By verifyFR = By
							.xpath("(//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//button[text()='fr'])[last()]");
					if (!verifyElement(fieldNameEN, false))
						return false;
					if (!verifyElement(fieldNameFR, false) && verifyElement(verifyFR, false))
						return false;
					if (!verifyElement(fieldNameES, false))
						return false;
					switch (sheetName) {
					case "String":
						By fieldTypeInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='String']");
						By requiredInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Required']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By regularExpInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Regular Expression']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By minLengthInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Min Length']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						By maxLengthInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Max Length']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInString, false))
							return false;
						if (!verifyElement(requiredInString, false))
							return false;
						if (!verifyElement(regularExpInString, false))
							return false;
						if (!verifyElement(minLengthInString, false))
							return false;
						if (!verifyElement(maxLengthInString, false))
							return false;
						break;
					case "Radio":
						By fieldTypeInRadio = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Radio']");
						By MandatoryInRadio = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInRadio, false))
							return false;
						if (!verifyElement(MandatoryInRadio, false))
							return false;
						String[] radioValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
						for (int v = 0; v < radioValues.length; v++) {
							By valuesInRadio = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ radioValues[v] + "']");
							if (!verifyElement(valuesInRadio, false))
								return false;
						}
						break;
					case "FileUpload":
						By fieldTypeInFileUpload = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='FileUpload']");
						By MandatoryInFileUpload = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By maxFileSizeInFileUpload = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Max File Size']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInFileUpload, false))
							return false;
						if (!verifyElement(MandatoryInFileUpload, false))
							return false;
						if (!verifyElement(maxFileSizeInFileUpload, false))
							return false;
						String[] extensions = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
						for (int e = 0; e < extensions.length; e++) {
							By valuesInFileUpload = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='File Extention']//following-sibling::div[contains(text(),'"
											+ extensions[e] + "')]");
							if (!verifyElement(valuesInFileUpload, false))
								return false;
						}
						break;
					case "Checkbox":
						By fieldTypeInCheckBox = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Checkbox']");
						By MandatoryInCheckBox = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInCheckBox, false))
							return false;
						if (!verifyElement(MandatoryInCheckBox, false))
							return false;
						String[] checkboxValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
						for (int c = 0; c < checkboxValues.length; c++) {
							By valuesInCheckBox = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ checkboxValues[c] + "']");
							if (!verifyElement(valuesInCheckBox, false))
								return false;
						}
						break;
					case "MultiSelect":
						By fieldTypeInMultiSelect = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='MultiSelect']");
						By MandatoryInMultiSelect = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInMultiSelect, false))
							return false;
						if (!verifyElement(MandatoryInMultiSelect, false))
							return false;
						String[] multiSelectValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim()
								.split(",");
						for (int m = 0; m < multiSelectValues.length; m++) {
							By valuesInMultiSelect = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ multiSelectValues[m] + "']");
							if (!verifyElement(valuesInMultiSelect, false))
								return false;
						}
						break;
					case "Dropdown":
						By fieldTypeInDropDown = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Dropdown']");
						By MandatoryInDropDown = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInDropDown, false))
							return false;
						if (!verifyElement(MandatoryInDropDown, false))
							return false;
						String[] dropDownValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
						for (int v = 0; v < dropDownValues.length; v++) {
							By valuesInDropDown = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ dropDownValues[v] + "']");
							if (!verifyElement(valuesInDropDown, false))
								return false;
						}
						if (!(dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equalsIgnoreCase(""))) {
							By otherOptions = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
							By otherOptionsYes = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Other Option']//following-sibling::div[normalize-space(text())='Yes']");
							if (!verifyElement(otherOptionsYes, false) && !verifyElement(otherOptions, false))
								return false;
						} else {
							By oterOptionsNo = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Other Option']//following-sibling::div[normalize-space(text())='No']");
							if (!verifyElement(oterOptionsNo, false))
								return false;
						}
						break;
					case "DateTime":
						By fieldTypeInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='DateTime']");
						By MandatoryInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By allowTimeInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Allow Time']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By dateTimeValidationInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Date Validation']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString() + "']");
						By startDateInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Start Date']//following-sibling::div[contains(text(),'"
										+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "')]");
						By endDateInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='End Date']//following-sibling::div[contains(text(),'"
										+ dkycMap.get(getMapKeys(dkycMap).get(6)).toString().trim() + "')]");
						if (!verifyElement(fieldTypeInDateTime, false))
							return false;
						if (!verifyElement(MandatoryInDateTime, false))
							return false;
						if (!verifyElement(allowTimeInDateTime, false))
							return false;
						if (!verifyElement(dateTimeValidationInDateTime, false))
							return false;
						if (!verifyElement(startDateInDateTime, false) && !dkycMap.get(getMapKeys(dkycMap).get(5)).toString().equals(""))
							return false;
						if (!verifyElement(endDateInDateTime, false) && !dkycMap.get(getMapKeys(dkycMap).get(6)).toString().equals(""))
							return false;
						break;
					case "Number":
						By fieldTypeInNumber = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Number']");
						By MandatoryInNumber = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By minLengthInNumber = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Minimum']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By maxLengthInNumber = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Maximum']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInNumber, false))
							return false;
						if (!verifyElement(MandatoryInNumber, false))
							return false;
						if (!verifyElement(minLengthInNumber, false))
							return false;
						if (!verifyElement(maxLengthInNumber, false))
							return false;
						break;
					case "Decimal":
						By fieldTypeInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Decimal']");
						By MandatoryInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By precisionInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Decimal Precision']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By minLengthInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Minimum']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						By maxLengthInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Maximum']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInDecimal, false))
							return false;
						if (!verifyElement(MandatoryInDecimal, false))
							return false;
						if (!verifyElement(precisionInDecimal, false))
							return false;
						if (!verifyElement(minLengthInDecimal, false))
							return false;
						if (!verifyElement(maxLengthInDecimal, false))
							return false;
						break;
					case "Date":
						By fieldTypeInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Date']");
						By MandatoryInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By dateTimeValidationInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Date Validation']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By startDateInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Start Date']//following-sibling::div[contains(text(),'"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "')]");
						By endDateInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='End Date']//following-sibling::div[contains(text(),'"
										+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "')]");
						if (!verifyElement(fieldTypeInDate, false))
							return false;
						if (!verifyElement(MandatoryInDate, false))
							return false;
						if (!verifyElement(dateTimeValidationInDate, false))
							return false;
						if (!verifyElement(startDateInDate, false) && !dkycMap.get(getMapKeys(dkycMap).get(4)).toString().equals(""))
							return false;
						if (!verifyElement(endDateInDate, false) && !dkycMap.get(getMapKeys(dkycMap).get(5)).toString().equals(""))
							return false;
						break;
					default:
						break;
					}
					if (!verifyElement(responseDescriptionEN, false))
						return false;
					if (!verifyElement(responseDescriptionFR, false) && verifyElement(verifyFR, false))
						return false;
					if (!verifyElement(responseDescriptionES, false))
						return false;
				}
			} else {

				int d = 0;
				String sheetName = "";
				if (dkycType[d].toLowerCase().contains("string")) {
					sheetName = "String";
				} else if (dkycType[d].toLowerCase().contains("radio")) {
					sheetName = "Radio";
				} else if (dkycType[d].toLowerCase().contains("fileupload")) {
					sheetName = "FileUpload";
				} else if (dkycType[d].toLowerCase().contains("checkbox")) {
					sheetName = "Checkbox";
				} else if (dkycType[d].toLowerCase().contains("multiselect")) {
					sheetName = "MultiSelect";
				} else if (dkycType[d].toLowerCase().contains("dropdown")) {
					sheetName = "Dropdown";
				} else if (dkycType[d].toLowerCase().contains("datetime")) {
					sheetName = "DateTime";
				} else if (dkycType[d].toLowerCase().contains("decimal")) {
					sheetName = "Decimal";
				} else if (dkycType[d].toLowerCase().contains("date")) {
					sheetName = "Date";
				} else if (dkycType[d].toLowerCase().contains("number")) {
					sheetName = "Number";
				}
				int rowNumber = TestDataImport.findRow(fileName, sheetName, dkycType[d]);
				Map<Object, Object> dkycMap = TestDataImport.readExcelFileTo2D(fileName, sheetName, rowNumber);
				By fieldNameEN = By
						.xpath("//*[text()='en']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + "']");
				By fieldNameFR = By
						.xpath("//*[text()='fr']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " FR" + "']");
				By fieldNameES = By
						.xpath("//*[text()='es']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " ES" + "']");
				By responseDescriptionEN = By
						.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
								+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim()
								+ "']//following-sibling::div//*[text()='en']");
				By responseDescriptionFR = By
						.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
								+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim()
								+ " FR" + "']//following-sibling::div//*[text()='fr']");
				By responseDescriptionES = By
						.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
								+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim()
								+ " ES" + "']//following-sibling::div//*[text()='es']");
				By verifyFR = By
						.xpath("(//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
								+ "']//ancestor::div[@class='form-inline']//following-sibling::div//button[text()='fr'])[last()]");
				if (!verifyElement(fieldNameEN, false))
					return false;
				if (!verifyElement(fieldNameFR, false) && verifyElement(verifyFR, false))
					return false;
				if (!verifyElement(fieldNameES, false))
					return false;
				switch (sheetName) {
				case "String":
					By fieldTypeInString = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='String']");
					By regularExpInString = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Regular Expression']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					By minLengthInString = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Min Length']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					By maxLengthInString = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Max Length']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInString, false))
						return false;
					if (!verifyElement(regularExpInString, false))
						return false;
					if (!verifyElement(minLengthInString, false))
						return false;
					if (!verifyElement(maxLengthInString, false))
						return false;
					break;
				case "Radio":
					By fieldTypeInRadio = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Radio']");
					if (!verifyElement(fieldTypeInRadio, false))
						return false;
					String[] radioValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int v = 0; v < radioValues.length; v++) {
						By valuesInRadio = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ radioValues[v] + "']");
						if (!verifyElement(valuesInRadio, false))
							return false;
					}
					break;
				case "FileUpload":
					By fieldTypeInFileUpload = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='FileUpload']");
					By maxFileSizeInFileUpload = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Max File Size']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInFileUpload, false))
						return false;
					if (!verifyElement(maxFileSizeInFileUpload, false))
						return false;
					String[] extensions = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int e = 0; e < extensions.length; e++) {
						By valuesInFileUpload = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='File Extention']//following-sibling::div[contains(text(),'"
										+ extensions[e] + "')]");
						if (!verifyElement(valuesInFileUpload, false))
							return false;
					}
					break;
				case "Checkbox":
					By fieldTypeInCheckBox = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Checkbox']");
					if (!verifyElement(fieldTypeInCheckBox, false))
						return false;
					String[] checkboxValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int c = 0; c < checkboxValues.length; c++) {
						By valuesInCheckBox = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ checkboxValues[c] + "']");
						if (!verifyElement(valuesInCheckBox, false))
							return false;
					}
					break;
				case "MultiSelect":
					By fieldTypeInMultiSelect = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='MultiSelect']");
					if (!verifyElement(fieldTypeInMultiSelect, false))
						return false;
					String[] multiSelectValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int m = 0; m < multiSelectValues.length; m++) {
						By valuesInMultiSelect = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ multiSelectValues[m] + "']");
						if (!verifyElement(valuesInMultiSelect, false))
							return false;
					}
					break;
				case "Dropdown":
					By fieldTypeInDropDown = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Dropdown']");
					if (!verifyElement(fieldTypeInDropDown, false))
						return false;
					String[] dropDownValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int v = 0; v < dropDownValues.length; v++) {
						By valuesInDropDown = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ dropDownValues[v] + "']");
						if (!verifyElement(valuesInDropDown, false))
							return false;
					}
					if (!(dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equalsIgnoreCase(""))) {
						By otherOptions = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						By otherOptionsYes = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Other Option']//following-sibling::div[normalize-space(text())='Yes']");
						if (!verifyElement(otherOptionsYes, false) && !verifyElement(otherOptions, false))
							return false;
					} else {
						By oterOptionsNo = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Other Option']//following-sibling::div[normalize-space(text())='No']");
						if (!verifyElement(oterOptionsNo, false))
							return false;
					}
					break;
				case "DateTime":
					By fieldTypeInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='DateTime']");
					By allowTimeInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Allow Time']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					String dateTimeValidationValue = null;
					if (dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equals("Allow All Dates"))
						dateTimeValidationValue = "Allow All Dates";
					else if (dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equals("Allow only Future date"))
						dateTimeValidationValue = "Allow only Future date";
					else if (dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equals("Allow only past date"))
						dateTimeValidationValue = "Allow only past date";
					By dateTimeValidationInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Date Validation']//following-sibling::div[normalize-space(text())='"
									+ dateTimeValidationValue + "']");
					By startDateInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Start Date']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
					By endDateInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='End Date']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(6)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInDateTime, false))
						return false;
					if (!verifyElement(allowTimeInDateTime, false))
						return false;
					if (!verifyElement(dateTimeValidationInDateTime, false))
						return false;
					if (!verifyElement(startDateInDateTime, false))
						return false;
					if (!verifyElement(endDateInDateTime, false))
						return false;
					break;
				case "Number":
					By fieldTypeInNumber = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Number']");
					By minLengthInNumber = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Minimum']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					By maxLengthInNumber = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Maximum']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInNumber, false))
						return false;
					if (!verifyElement(minLengthInNumber, false))
						return false;
					if (!verifyElement(maxLengthInNumber, false))
						return false;
					break;
				case "Decimal":
					By fieldTypeInDecimal = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Decimal']");
					By precisionInDecimal = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Decimal Precision']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					By minLengthInDecimal = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Minimum']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					By maxLengthInDecimal = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Maximum']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInDecimal, false))
						return false;
					if (!verifyElement(precisionInDecimal, false))
						return false;
					if (!verifyElement(minLengthInDecimal, false))
						return false;
					if (!verifyElement(maxLengthInDecimal, false))
						return false;
					break;
				case "Date":
					By fieldTypeInDate = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Date']");
					By dateTimeValidationInDate = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Date Validation']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					By startDateInDate = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Start Date']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					By endDateInDate = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='End Date']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInDate, false))
						return false;
					if (!verifyElement(dateTimeValidationInDate, false))
						return false;
					if (!verifyElement(startDateInDate, false))
						return false;
					if (!verifyElement(endDateInDate, false))
						return false;
					break;
				default:
					break;
				}
				if (!verifyElement(responseDescriptionEN, false))
					return false;
				if (!verifyElement(responseDescriptionFR, false) && verifyElement(verifyFR, false))
					return false;
				if (!verifyElement(responseDescriptionES, false))
					return false;

			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * @author dishant.doshi to edit field
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 22/10/2018
	 */
	public void editField(Map<Object, Object> map, List<Object> mapKeys) {
		String fileName = test_data_folder_path + dkycFile;
		String[] dkycType = map.get(mapKeys.get(4)).toString().trim().split(",");
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(5)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString().trim() + "'])[1]"),
				false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString().trim());
			clickOnEditBtn();
			List<WebElement> noOfInputs = getElementList(By.xpath(
					"//input[contains(@id,'txtdeletedfieldname')]//..//label[text()[normalize-space() = 'Field Type']]//following-sibling :: div"));
			List<String> noOfInputsList = new ArrayList<String>();
			for (int i = 0; i < noOfInputs.size(); i++) {
				noOfInputsList.add(noOfInputs.get(i).getText());
			}
			if (!(map.get(mapKeys.get(4)).toString().trim().equals(""))) {
				selectFieldLevel(dkycType);
			}
			selectTextInStatus(map.get(mapKeys.get(5)).toString().trim());
			Map<String, Integer> DKYCFields = new HashMap<String, Integer>();
			Set<String> unique = new HashSet<String>(noOfInputsList);
			List<String> finalDKYCFields = new ArrayList<String>();
			for (String key : unique) {
				DKYCFields.put(key, Collections.frequency(noOfInputsList, key));
			}
			for (int i = 0; i < noOfInputsList.size(); i++) {
				if (DKYCFields.get(noOfInputsList.get(i)) > 1) {
					finalDKYCFields.add(noOfInputsList.get(i) + "Edit" + (i + 1));
				} else {
					finalDKYCFields.add(noOfInputsList.get(i) + "Edit1");
				}
			}
			if (!(map.get(mapKeys.get(4)).toString().trim().equals(""))) {
				for (int i = 0; i < dkycType.length; i++) {
					finalDKYCFields.add(dkycType[i]);
				}
			}
			for (int d = 0; d < finalDKYCFields.size(); d++) {
				String sheetName = "";
				if (finalDKYCFields.get(d).toLowerCase().contains("string")) {
					sheetName = "String";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("radio")) {
					sheetName = "Radio";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("fileupload")) {
					sheetName = "FileUpload";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("checkbox")) {
					sheetName = "Checkbox";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("multiselect")) {
					sheetName = "MultiSelect";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("dropdown")) {
					sheetName = "Dropdown";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("datetime")) {
					sheetName = "DateTime";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("decimal")) {
					sheetName = "Decimal";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("date")) {
					sheetName = "Date";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("number")) {
					sheetName = "Number";
				}
				int rowNumber = TestDataImport.findRow(fileName, sheetName, finalDKYCFields.get(d));
				Map<Object, Object> dkycMap = TestDataImport.readExcelFileTo2D(fileName, sheetName, rowNumber);
				sendTextInFieldNameEN(By
						.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[en]')])[" + (d + 1) + "]"),
						dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim());
				if (verifyElement(By
						.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
						false))
					sendTextInFieldNameFR(By.xpath(
							"(//input[contains(@name,'txtfieldname') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
							dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " FR");
				sendTextInFieldNameES(By
						.xpath("(//input[contains(@name,'txtfieldname') and contains(@name,'[es]')])[" + (d + 1) + "]"),
						dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " ES");
				if (!(finalDKYCFields.get(d).contains("Edit")))
					selectTextInFieldType(By.id("cmbvalidateType_" + (d + 1)), sheetName);
				selectTextInMandatoryField(By.id("Required_" + (d + 1)),
						dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim());
				List<WebElement> noOfValuesInDropdown = getElementList(By.xpath("//div[normalize-space(text())='"
						+ sheetName
						+ "']//ancestor::div[contains(@class,'form-inline')]//following-sibling::div//*[contains(@id,'value')]"));
				switch (sheetName) {
				case "String":
					sendTextInRegularExpressionInStringFieldType(By.id("regulerexpression_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					sendTextInMinLengthInStringFieldType(By.id("minimum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					sendTextInMaxLengthInStringFieldType(By.id("maximum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
					break;
				case "Radio":
					String[] radioValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					int radioValuesLength = radioValues.length;
					for (int v = 0; v < radioValues.length; v++) {
						sendTextInValueInRadioFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)), radioValues[v]);
						if (!(finalDKYCFields.get(d).contains("Edit"))) {
							if (v != radioValuesLength - 1) {
								clickOnAddValueButtonInRadioFieldType(By.id("btnAddNew_" + (d + 1)));
							}
						} else {
							if (radioValuesLength - noOfValuesInDropdown.size() != 0) {
								clickOnAddValueButtonInRadioFieldType(By.id("btnAddNew_" + (d + 1)));
								radioValuesLength--;
							}
						}
					}
					break;
				case "FileUpload":
					String[] extensions = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int e = 0; e < extensions.length; e++) {
						sendTextInExtensionInFileUploadFieldType(
								By.xpath(".//*[@id='fileextention_" + (d + 1) + "']//following-sibling :: div//input"),
								extensions[e] + Keys.ENTER);
					}
					sendTextInMaximumFileSizeInFileUploadFieldType(By.id("filesize_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					break;
				case "Checkbox":
					String[] checkboxValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					int checkBoxValuesLength = checkboxValues.length;
					for (int v = 0; v < checkboxValues.length; v++) {
						sendTextInValueInCheckBoxFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)),
								checkboxValues[v]);
						if (!(finalDKYCFields.get(d).contains("Edit"))) {
							if (v != checkboxValues.length - 1) {
								clickOnAddValueButtonInCheckBoxFieldType(By.id("btnAddNew_" + (d + 1)));
							}
						} else {
							if (checkBoxValuesLength - noOfValuesInDropdown.size() != 0) {
								clickOnAddValueButtonInCheckBoxFieldType(By.id("btnAddNew_" + (d + 1)));
								checkBoxValuesLength--;
							}
						}
					}
					break;
				case "MultiSelect":
					String[] multiSelectValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					int multiSelectValuesLength = multiSelectValues.length;
					for (int v = 0; v < multiSelectValues.length; v++) {
						sendTextInValueInMultiSelectFieldType(By.id("value_" + (d + 1) + "_" + (v + 1)),
								multiSelectValues[v]);
						if (!(finalDKYCFields.get(d).contains("Edit"))) {
							if (v != multiSelectValues.length - 1) {
								clickOnAddValueButtonInMultiSelectFieldType(By.id("btnAddNew_" + (d + 1)));
							}
						} else {
							if (multiSelectValuesLength - noOfValuesInDropdown.size() != 0) {
								clickOnAddValueButtonInMultiSelectFieldType(By.id("btnAddNew_" + (d + 1)));
								multiSelectValuesLength--;
							}
						}
					}
					break;
				case "Dropdown":
					String[] dropdownValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					int dropdownValuesLength = dropdownValues.length;
					for (int v = 0; v < dropdownValues.length; v++) {
						sendTextInValueInDropDownFieldType(
								By.xpath("//*[contains(@id,'value_" + (d + 1) + "_" + (v + 1) + "')]"),
								dropdownValues[v]);
						if (!(finalDKYCFields.get(d).contains("Edit"))) {
							if (v != dropdownValues.length - 1) {
								clickOnAddValueButtonInDropDownFieldType(By.id("btnAddNew_" + (d + 1)));
							}
						} else {
							if (dropdownValuesLength - noOfValuesInDropdown.size() != 0) {
								clickOnAddValueButtonInDropDownFieldType(By.id("btnAddNew_" + (d + 1)));
								dropdownValuesLength--;
							}
						}
					}
					break;
				case "DateTime":
					selectTextInAllowTimeInDateTimeFieldType(By.id("allowtime_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					selectTextInDateTimeValidationInDateTimeFieldType(By.id("datetimevalidation_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					if(!dkycMap.get(getMapKeys(dkycMap).get(5)).toString().equals("")){
						setStartDateInDateTimeFieldType(By.id("startdate_" + (d + 1)),
								dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
					}
					if(!dkycMap.get(getMapKeys(dkycMap).get(6)).toString().equals("")){
						setEndDateInDateTimeFieldType(By.id("enddate_" + (d + 1)),
								dkycMap.get(getMapKeys(dkycMap).get(6)).toString().trim());
					}
					break;
				case "Number":
					sendTextInMinLengthInNumberFieldType(By.id("minimum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					sendTextInMaxLengthInNumberFieldType(By.id("maximum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					break;
				case "Decimal":
					selectTextInPrecisionInDecimalFieldTypes(By.id("numberprecesion_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					sendTextInMinLengthInDecimalFieldType(By.id("minimum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					sendTextInMaxLengthInDecimalFieldType(By.id("maximum_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
					break;
				case "Date":
					selectTextInDateTimeValidationInDateFieldType(By.id("datetimevalidation_" + (d + 1)),
							dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim());
					if(!dkycMap.get(getMapKeys(dkycMap).get(4)).toString().equals("")){
						setStartDateInDateFieldType(By.id("startdate_" + (d + 1)),
								dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim());
					}
					if(!dkycMap.get(getMapKeys(dkycMap).get(5)).toString().equals("")){
						setEndDateInDateFieldType(By.id("enddate_" + (d + 1)),
								dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim());
					}
					break;
				default:
					break;
				}
				sendTextInResponseCodeEN(
						By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[en]')])[" + (d + 1)
								+ "]"),
						dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim());
				if (verifyElement(By
						.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[fr]')])[" + (d + 1) + "]"),
						false))
					sendTextInResponseCodeFR(
							By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[fr]')])[" + (d + 1)
									+ "]"),
							dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim()
									+ " FR");
				sendTextInResponseCodeES(
						By.xpath("(//input[contains(@name,'responsedesc') and contains(@name,'[es]')])[" + (d + 1)
								+ "]"),
						dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim() + " ES");
			}
		} else {
			verifyFalse(true);
		}
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify field edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 23/10/2018
	 * @return true if field edited successfully
	 */
	public boolean verifyFieldEdited(Map<Object, Object> map, List<Object> mapKeys) {
		String[] dkycType = map.get(mapKeys.get(4)).toString().trim().split(",");
		String fileName = test_data_folder_path + dkycFile;
		By categoryModule = By
				.xpath("(//label[text()='Category Module']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(0)).toString().trim() + "']])[1]");
		By fieldCategory = By
				.xpath("(//label[text()='Field Category']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(1)).toString().trim() + "']])[1]");
		By fieldName = By.xpath("(//label[text()='Field Name']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(mapKeys.get(2)).toString().trim() + "']])[1]");
		By fieldType = By.xpath("(//label[text()='Field Type']//following-sibling :: div[text()[normalize-space() = '"
				+ map.get(mapKeys.get(3)).toString().trim() + "']])[1]");
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(5)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString().trim() + "'])[1]"),
				false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString().trim());
			List<WebElement> noOfInputs = getElementList(By.xpath(
					"//*[text()='Field Information']//parent::div//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div"));
			List<String> noOfInputsList = new ArrayList<String>();
			if (!map.get(mapKeys.get(4)).toString().equals("")) {
				for (int i = 0; i < noOfInputs.size() - dkycType.length; i++) {
					noOfInputsList.add(noOfInputs.get(i).getText());
				}
			} else {
				for (int i = 0; i < noOfInputs.size(); i++) {
					noOfInputsList.add(noOfInputs.get(i).getText());
				}
			}
			Map<String, Integer> DKYCFields = new HashMap<String, Integer>();
			Set<String> unique = new HashSet<String>(noOfInputsList);
			List<String> finalDKYCFields = new ArrayList<String>();
			for (String key : unique) {
				DKYCFields.put(key, Collections.frequency(noOfInputsList, key));
			}
			for (int i = 0; i < noOfInputsList.size(); i++) {
				if (DKYCFields.get(noOfInputsList.get(i)) > 1) {
					finalDKYCFields.add(noOfInputsList.get(i) + "Edit" + (i + 1));
				} else {
					finalDKYCFields.add(noOfInputsList.get(i) + "Edit1");
				}
			}
			if (!(map.get(mapKeys.get(4)).toString().trim().equals(""))) {
				for (int i = 0; i < dkycType.length; i++) {
					finalDKYCFields.add(dkycType[i]);
				}
			}
			if (!verifyElement(categoryModule, false) && !map.get(mapKeys.get(0)).toString().trim().equals(""))
				return false;
			if (!verifyElement(fieldCategory, false) && !map.get(mapKeys.get(1)).toString().trim().equals(""))
				return false;
			if (!verifyElement(fieldName, false))
				return false;
			if (!verifyElement(fieldType, false))
				return false;
			if ((map.get(mapKeys.get(3)).toString().trim().equalsIgnoreCase("Document"))) {
				for (int d = 0; d < finalDKYCFields.size(); d++) {
					String sheetName = "";
					if (finalDKYCFields.get(d).toLowerCase().contains("string")) {
						sheetName = "String";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("radio")) {
						sheetName = "Radio";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("fileupload")) {
						sheetName = "FileUpload";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("checkbox")) {
						sheetName = "Checkbox";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("multiselect")) {
						sheetName = "MultiSelect";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("dropdown")) {
						sheetName = "Dropdown";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("datetime")) {
						sheetName = "DateTime";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("decimal")) {
						sheetName = "Decimal";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("date")) {
						sheetName = "Date";
					} else if (finalDKYCFields.get(d).toLowerCase().contains("number")) {
						sheetName = "Number";
					}
					int rowNumber = TestDataImport.findRow(fileName, sheetName, finalDKYCFields.get(d));
					Map<Object, Object> dkycMap = TestDataImport.readExcelFileTo2D(fileName, sheetName, rowNumber);
					By fieldNameEN = By
							.xpath("//*[text()='en']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + "']");
					By fieldNameFR = By
							.xpath("//*[text()='fr']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " FR" + "']");
					By fieldNameES = By
							.xpath("//*[text()='es']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " ES" + "']");
					By responseDescriptionEN = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString()
											.trim()
									+ "']//following-sibling::div//*[text()='en']");
					By responseDescriptionFR = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString()
											.trim()
									+ " FR" + "']//following-sibling::div//*[text()='fr']");
					By responseDescriptionES = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString()
											.trim()
									+ " ES" + "']//following-sibling::div//*[text()='es']");
					By verifyFR = By
							.xpath("(//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//button[text()='fr'])[last()]");
					if (!verifyElement(fieldNameEN, false))
						return false;
					if (!verifyElement(fieldNameFR, false) && verifyElement(verifyFR, false))
						return false;
					if (!verifyElement(fieldNameES, false))
						return false;
					switch (sheetName) {
					case "String":
						By fieldTypeInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='String']");
						By requiredInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Required']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By regularExpInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Regular Expression']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By minLengthInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Min Length']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						By maxLengthInString = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Max Length']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInString, false))
							return false;
						if (!verifyElement(requiredInString, false))
							return false;
						if (!verifyElement(regularExpInString, false))
							return false;
						if (!verifyElement(minLengthInString, false))
							return false;
						if (!verifyElement(maxLengthInString, false))
							return false;
						break;
					case "Radio":
						By fieldTypeInRadio = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Radio']");
						By MandatoryInRadio = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInRadio, false))
							return false;
						if (!verifyElement(MandatoryInRadio, false))
							return false;
						String[] radioValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
						for (int v = 0; v < radioValues.length; v++) {
							By valuesInRadio = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ radioValues[v] + "']");
							if (!verifyElement(valuesInRadio, false))
								return false;
						}
						break;
					case "FileUpload":
						By fieldTypeInFileUpload = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='FileUpload']");
						By MandatoryInFileUpload = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By maxFileSizeInFileUpload = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Max File Size']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInFileUpload, false))
							return false;
						if (!verifyElement(MandatoryInFileUpload, false))
							return false;
						if (!verifyElement(maxFileSizeInFileUpload, false))
							return false;
						String[] extensions = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
						for (int e = 0; e < extensions.length; e++) {
							By valuesInFileUpload = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='File Extention']//following-sibling::div[contains(text(),'"
											+ extensions[e] + "')]");
							if (!verifyElement(valuesInFileUpload, false))
								return false;
						}
						break;
					case "Checkbox":
						By fieldTypeInCheckBox = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Checkbox']");
						By MandatoryInCheckBox = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInCheckBox, false))
							return false;
						if (!verifyElement(MandatoryInCheckBox, false))
							return false;
						String[] checkboxValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
						for (int c = 0; c < checkboxValues.length; c++) {
							By valuesInCheckBox = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ checkboxValues[c] + "']");
							if (!verifyElement(valuesInCheckBox, false))
								return false;
						}
						break;
					case "MultiSelect":
						By fieldTypeInMultiSelect = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='MultiSelect']");
						By MandatoryInMultiSelect = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInMultiSelect, false))
							return false;
						if (!verifyElement(MandatoryInMultiSelect, false))
							return false;
						String[] multiSelectValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim()
								.split(",");
						for (int m = 0; m < multiSelectValues.length; m++) {
							By valuesInMultiSelect = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ multiSelectValues[m] + "']");
							if (!verifyElement(valuesInMultiSelect, false))
								return false;
						}
						break;
					case "Dropdown":
						By fieldTypeInDropDown = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Dropdown']");
						By MandatoryInDropDown = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInDropDown, false))
							return false;
						if (!verifyElement(MandatoryInDropDown, false))
							return false;
						String[] dropDownValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
						for (int v = 0; v < dropDownValues.length; v++) {
							By valuesInDropDown = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ dropDownValues[v] + "']");
							if (!verifyElement(valuesInDropDown, false))
								return false;
						}
						if (!(dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equalsIgnoreCase(""))) {
							By otherOptions = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
											+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
							By otherOptionsYes = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Other Option']//following-sibling::div[normalize-space(text())='Yes']");
							if (!verifyElement(otherOptionsYes, false) && !verifyElement(otherOptions, false))
								return false;
						} else {
							By oterOptionsNo = By
									.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
											+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
											+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Other Option']//following-sibling::div[normalize-space(text())='No']");
							if (!verifyElement(oterOptionsNo, false))
								return false;
						}
						break;
					case "DateTime":
						By fieldTypeInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='DateTime']");
						By MandatoryInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By allowTimeInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Allow Time']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By dateTimeValidationInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='DateTime Validation']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString() + "']");
						By startDateInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Start Date']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
						By endDateInDateTime = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='End Date']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(6)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInDateTime, false))
							return false;
						if (!verifyElement(MandatoryInDateTime, false))
							return false;
						if (!verifyElement(allowTimeInDateTime, false))
							return false;
						if (!verifyElement(dateTimeValidationInDateTime, false))
							return false;
						if (!verifyElement(startDateInDateTime, false) && !dkycMap.get(getMapKeys(dkycMap).get(5)).toString().equals(""))
							return false;
						if (!verifyElement(endDateInDateTime, false) && !dkycMap.get(getMapKeys(dkycMap).get(6)).toString().equals(""))
							return false;
						break;
					case "Number":
						By fieldTypeInNumber = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Number']");
						By MandatoryInNumber = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By minLengthInNumber = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Minimum']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By maxLengthInNumber = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Maximum']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInNumber, false))
							return false;
						if (!verifyElement(MandatoryInNumber, false))
							return false;
						if (!verifyElement(minLengthInNumber, false))
							return false;
						if (!verifyElement(maxLengthInNumber, false))
							return false;
						break;
					case "Decimal":
						By fieldTypeInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Decimal']");
						By MandatoryInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By precisionInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Decimal Precision']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
						By minLengthInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Minimum']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						By maxLengthInDecimal = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Maximum']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInDecimal, false))
							return false;
						if (!verifyElement(MandatoryInDecimal, false))
							return false;
						if (!verifyElement(precisionInDecimal, false))
							return false;
						if (!verifyElement(minLengthInDecimal, false))
							return false;
						if (!verifyElement(maxLengthInDecimal, false))
							return false;
						break;
					case "Date":
						By fieldTypeInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Date']");
						By MandatoryInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Mandatory']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(2)).toString().trim() + "']");
						By dateTimeValidationInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Date Validation']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString() + "']");
						By startDateInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Start Date']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						By endDateInDate = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='End Date']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
						if (!verifyElement(fieldTypeInDate, false))
							return false;
						if (!verifyElement(MandatoryInDate, false))
							return false;
						if (!verifyElement(dateTimeValidationInDate, false))
							return false;
						if (!verifyElement(startDateInDate, false) && !dkycMap.get(getMapKeys(dkycMap).get(4)).toString().equals(""))
							return false;
						if (!verifyElement(endDateInDate, false) && !dkycMap.get(getMapKeys(dkycMap).get(5)).toString().equals(""))
							return false;
						break;
					default:
						break;
					}
					if (!verifyElement(responseDescriptionEN, false))
						return false;
					if (!verifyElement(responseDescriptionFR, false) && verifyElement(verifyFR, false))
						return false;
					if (!verifyElement(responseDescriptionES, false))
						return false;
				}
			} else {

				int d = 0;
				String sheetName = "";
				if (finalDKYCFields.get(d).toLowerCase().contains("string")) {
					sheetName = "String";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("radio")) {
					sheetName = "Radio";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("fileupload")) {
					sheetName = "FileUpload";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("checkbox")) {
					sheetName = "Checkbox";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("multiselect")) {
					sheetName = "MultiSelect";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("dropdown")) {
					sheetName = "Dropdown";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("datetime")) {
					sheetName = "DateTime";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("decimal")) {
					sheetName = "Decimal";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("date")) {
					sheetName = "Date";
				} else if (finalDKYCFields.get(d).toLowerCase().contains("number")) {
					sheetName = "Number";
				}
				int rowNumber = TestDataImport.findRow(fileName, sheetName, finalDKYCFields.get(d));
				Map<Object, Object> dkycMap = TestDataImport.readExcelFileTo2D(fileName, sheetName, rowNumber);
				By fieldNameEN = By
						.xpath("//*[text()='en']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + "']");
				By fieldNameFR = By
						.xpath("//*[text()='fr']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " FR" + "']");
				By fieldNameES = By
						.xpath("//*[text()='es']//ancestor::div//preceding-sibling :: label[text()='Field Name']//following-sibling :: div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim() + " ES" + "']");
				By responseDescriptionEN = By
						.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
								+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim()
								+ "']//following-sibling::div//*[text()='en']");
				By responseDescriptionFR = By
						.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
								+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim()
								+ " FR" + "']//following-sibling::div//*[text()='fr']");
				By responseDescriptionES = By
						.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
								+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Response Description']//following-sibling::div[normalize-space(text())='"
								+ dkycMap.get(getMapKeys(dkycMap).get(getMapKeys(dkycMap).size() - 1)).toString().trim()
								+ " ES" + "']//following-sibling::div//*[text()='es']");
				By verifyFR = By
						.xpath("(//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
								+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
								+ "']//ancestor::div[@class='form-inline']//following-sibling::div//button[text()='fr'])[last()]");
				if (!verifyElement(fieldNameEN, false))
					return false;
				if (!verifyElement(fieldNameFR, false) && verifyElement(verifyFR, false))
					return false;
				if (!verifyElement(fieldNameES, false))
					return false;
				switch (sheetName) {
				case "String":
					By fieldTypeInString = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='String']");
					By regularExpInString = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Regular Expression']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					By minLengthInString = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Min Length']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					By maxLengthInString = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Max Length']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInString, false))
						return false;
					if (!verifyElement(regularExpInString, false))
						return false;
					if (!verifyElement(minLengthInString, false))
						return false;
					if (!verifyElement(maxLengthInString, false))
						return false;
					break;
				case "Radio":
					By fieldTypeInRadio = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Radio']");
					if (!verifyElement(fieldTypeInRadio, false))
						return false;
					String[] radioValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int v = 0; v < radioValues.length; v++) {
						By valuesInRadio = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ radioValues[v] + "']");
						if (!verifyElement(valuesInRadio, false))
							return false;
					}
					break;
				case "FileUpload":
					By fieldTypeInFileUpload = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='FileUpload']");
					By maxFileSizeInFileUpload = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Max File Size']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInFileUpload, false))
						return false;
					if (!verifyElement(maxFileSizeInFileUpload, false))
						return false;
					String[] extensions = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int e = 0; e < extensions.length; e++) {
						By valuesInFileUpload = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='File Extention']//following-sibling::div[contains(text(),'"
										+ extensions[e] + "')]");
						if (!verifyElement(valuesInFileUpload, false))
							return false;
					}
					break;
				case "Checkbox":
					By fieldTypeInCheckBox = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Checkbox']");
					if (!verifyElement(fieldTypeInCheckBox, false))
						return false;
					String[] checkboxValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int c = 0; c < checkboxValues.length; c++) {
						By valuesInCheckBox = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ checkboxValues[c] + "']");
						if (!verifyElement(valuesInCheckBox, false))
							return false;
					}
					break;
				case "MultiSelect":
					By fieldTypeInMultiSelect = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='MultiSelect']");
					if (!verifyElement(fieldTypeInMultiSelect, false))
						return false;
					String[] multiSelectValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int m = 0; m < multiSelectValues.length; m++) {
						By valuesInMultiSelect = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ multiSelectValues[m] + "']");
						if (!verifyElement(valuesInMultiSelect, false))
							return false;
					}
					break;
				case "Dropdown":
					By fieldTypeInDropDown = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Dropdown']");
					if (!verifyElement(fieldTypeInDropDown, false))
						return false;
					String[] dropDownValues = dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().split(",");
					for (int v = 0; v < dropDownValues.length; v++) {
						By valuesInDropDown = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ dropDownValues[v] + "']");
						if (!verifyElement(valuesInDropDown, false))
							return false;
					}
					if (!(dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equalsIgnoreCase(""))) {
						By otherOptions = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Value']//following-sibling::div[normalize-space(text())='"
										+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
						By otherOptionsYes = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Other Option']//following-sibling::div[normalize-space(text())='Yes']");
						if (!verifyElement(otherOptionsYes, false) && !verifyElement(otherOptions, false))
							return false;
					} else {
						By oterOptionsNo = By
								.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
										+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
										+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Other Option']//following-sibling::div[normalize-space(text())='No']");
						if (!verifyElement(oterOptionsNo, false))
							return false;
					}
					break;
				case "DateTime":
					By fieldTypeInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='DateTime']");
					String allowTimeInDateTimeValue = null;
					if (dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().equals("Only hours"))
						allowTimeInDateTimeValue = "only_hour";
					else if (dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim()
							.equals("All hours mins and secs"))
						allowTimeInDateTimeValue = "hour_minute_second";
					else if (dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim().equals("Both hours and mins"))
						allowTimeInDateTimeValue = "hour_minute";
					By allowTimeInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ allowTimeInDateTimeValue
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Allow Time']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					String dateTimeValidationValue = null;
					if (dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equals("Allow All Dates"))
						dateTimeValidationValue = "allow_all";
					else if (dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equals("Allow only Future date"))
						dateTimeValidationValue = "only_future_date";
					else if (dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim().equals("Allow only past date"))
						dateTimeValidationValue = "only_past_date";
					By dateTimeValidationInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='DateTime Validation']//following-sibling::div[normalize-space(text())='"
									+ dateTimeValidationValue + "']");
					By startDateInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Start Date']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
					By endDateInDateTime = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='End Date']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(6)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInDateTime, false))
						return false;
					if (!verifyElement(allowTimeInDateTime, false))
						return false;
					if (!verifyElement(dateTimeValidationInDateTime, false))
						return false;
					if (!verifyElement(startDateInDateTime, false))
						return false;
					if (!verifyElement(endDateInDateTime, false))
						return false;
					break;
				case "Number":
					By fieldTypeInNumber = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Number']");
					By minLengthInNumber = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Minimum']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					By maxLengthInNumber = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Maximum']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInNumber, false))
						return false;
					if (!verifyElement(minLengthInNumber, false))
						return false;
					if (!verifyElement(maxLengthInNumber, false))
						return false;
					break;
				case "Decimal":
					By fieldTypeInDecimal = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Decimal']");
					By precisionInDecimal = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Decimal Precision']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					By minLengthInDecimal = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Minimum']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					By maxLengthInDecimal = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Maximum']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInDecimal, false))
						return false;
					if (!verifyElement(precisionInDecimal, false))
						return false;
					if (!verifyElement(minLengthInDecimal, false))
						return false;
					if (!verifyElement(maxLengthInDecimal, false))
						return false;
					break;
				case "Date":
					By fieldTypeInDate = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Field Type']//following-sibling::div[normalize-space(text())='Date']");
					By dateTimeValidationInDate = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='DateTime Validation']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(3)).toString().trim() + "']");
					By startDateInDate = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='Start Date']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(4)).toString().trim() + "']");
					By endDateInDate = By
							.xpath("//label[text()='Field Name']//following-sibling :: div[normalize-space(text()) = '"
									+ dkycMap.get(getMapKeys(dkycMap).get(1)).toString().trim()
									+ "']//ancestor::div[@class='form-inline']//following-sibling::div//label[normalize-space(text())='End Date']//following-sibling::div[normalize-space(text())='"
									+ dkycMap.get(getMapKeys(dkycMap).get(5)).toString().trim() + "']");
					if (!verifyElement(fieldTypeInDate, false))
						return false;
					if (!verifyElement(dateTimeValidationInDate, false))
						return false;
					if (!verifyElement(startDateInDate, false))
						return false;
					if (!verifyElement(endDateInDate, false))
						return false;
					break;
				default:
					break;
				}
				if (!verifyElement(responseDescriptionEN, false))
					return false;
				if (!verifyElement(responseDescriptionFR, false) && verifyElement(verifyFR, false))
					return false;
				if (!verifyElement(responseDescriptionES, false))
					return false;

			}
		} else {
			return false;
		}
		return true;
	}

	/**
	 * @author dishant.doshi to delete field
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 23/10/2018
	 */
	public boolean deleteField(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(1)).toString(),
				map.get(mapKeys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString().trim() + "'])[1]"),
				false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString().trim());
			delete();
			return true;
		} else {
			String string = "Field already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyFieldDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(1)).toString(),
					map.get(mapKeys.get(3)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(2)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 * to verify  edited Log?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 27/12/2018
	 * @return true if Field Verify Log SuccesFullly
	 */
	public boolean verifyFeildEditLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(5)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(2)).toString().trim()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString().trim());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}
	/**
	 * @author dishant.doshi to sort dkyc fields
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 27/12/2018
	 */
	public boolean sortDKYCFields(Map<Object, Object> map, List<Object> mapKeys) {
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
