package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi Actions of Settings - GISMaster - Country
 * @creation date 28/09/2018
 */
public class SettingsGISMasterCountryWeb extends Common {
	By txtCountryName = By.id("CountryName");
	By txtAbbr3 = By.id("CountryCode3Char");
	By txtAbbr2 = By.id("CountryCode2Char");
	By txtDialingCode = By.id("CountryDialingCode");
	By txtMaxLength = By.id("MaxNationalNumberLength");
	By txtMinLength = By.id("MinNationalNumberLength");
	By drpCurrencyCode = By.id("CurrencyCodeID");
	By txtCountryNameSearch = By.id("txtCountryName");
	By txtAbbr2Search = By.id("txtCountryCode2Char");
	By txtDialingCodeSearch = By.id("txtCountryDialingCode");
	By drpCountryLevel = By.id("countryLevel");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 28/09/2018
	 */
	public SettingsGISMasterCountryWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2, String str3) {
		commonFilterSearch();
		sendTextInCountryNameInSearch(str1);
		sendTextInAbbreviationCode2InSearch(str2);
		sendTextInDialingCodeInSearch(str3);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi send text in country name field
	 * @param countryName
	 * @creation date 28/09/2018
	 */
	public void sendTextInCountryName(String countryName) {
		clearAndSendTextInTextBox(txtCountryName, countryName);
	}

	/**
	 * @author dishant.doshi send text in abbreviation code2 field
	 * @param abbrCode2
	 * @creation date 28/09/2018
	 */
	public void sendTextInAbbreviationCode2(String abbrCode2) {
		clearAndSendTextInTextBox(txtAbbr2, abbrCode2);
	}

	/**
	 * @author dishant.doshi send text in abbreviation code3 field
	 * @param abbrCode3
	 * @creation date 28/09/2018
	 */
	public void sendTextInAbbreviationCode3(String abbrCode3) {
		clearAndSendTextInTextBox(txtAbbr3, abbrCode3);
	}

	/**
	 * @author dishant.doshi send text in dialing code field
	 * @param dialingCode
	 * @creation date 28/09/2018
	 */
	public void sendTextInDialingCode(String dialingCode) {
		clearAndSendTextInTextBox(txtDialingCode, dialingCode);
	}

	/**
	 * @author dishant.doshi select value from currency code drop down
	 * @param currencyCode
	 * @creation date 28/09/2018
	 */
	public void selectCurrencyCode(String currencyCode) {
		selectFromDropdown(drpCurrencyCode, currencyCode);
	}

	/**
	 * @author dishant.doshi send text in minimum national number length field
	 * @param minNumber
	 * @creation date 28/09/2018
	 */
	public void sendTextInMinNationalNumberLength(String minNumber) {
		clearAndSendTextInTextBox(txtMinLength, minNumber);
	}

	/**
	 * @author dishant.doshi send text in maximum national number length field
	 * @param maxNumber
	 * @creation date 28/09/2018
	 */
	public void sendTextInMaxNationalNumberLength(String maxNumber) {
		clearAndSendTextInTextBox(txtMaxLength, maxNumber);
	}

	/**
	 * @author dishant.doshi send text in country name field in filter search
	 * @param countryName
	 * @creation date 28/09/2018
	 */
	public void sendTextInCountryNameInSearch(String countryName) {
		clearAndSendTextInTextBox(txtCountryNameSearch, countryName);
	}

	/**
	 * @author dishant.doshi send text in abbreviation code2 field in filter
	 *         search
	 * @param abbrCode2
	 * @creation date 28/09/2018
	 */
	public void sendTextInAbbreviationCode2InSearch(String abbrCode2) {
		clearAndSendTextInTextBox(txtAbbr2Search, abbrCode2);
	}

	/**
	 * @author dishant.doshi send text in dialing code field in filter search
	 * @param dialingCode
	 * @creation date 28/09/2018
	 */
	public void sendTextInDialingCodeInSearch(String dialingCode) {
		clearAndSendTextInTextBox(txtDialingCodeSearch, dialingCode);
	}

	/**
	 * @author dishant.doshi select value from country level drop down
	 * @param level
	 * @creation date 11/10/2018
	 */
	public void selectTextInCountryLevel(String level) {
		selectFromDropdown(drpCountryLevel, level);
	}

	/**
	 * @author dishant.doshi to send text in level fields
	 * @param text
	 * @param element
	 * @creation date 11/10/2018
	 */
	public void sendTextInlevel(By element, String text) {
		clearAndSendTextInTextBox(element, text);
	}

	/**
	 * @author dishant.doshi to add country
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/09/2018
	 */
	public void addCountry(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		sendTextInCountryName(map.get(keys.get(0)).toString());
		sendTextInAbbreviationCode2(map.get(keys.get(1)).toString());
		sendTextInAbbreviationCode3(map.get(keys.get(2)).toString());
		sendTextInDialingCode(map.get(keys.get(4)).toString());
		selectCurrencyCode(map.get(keys.get(3)).toString());
		sendTextInMinNationalNumberLength(map.get(keys.get(5)).toString());
		sendTextInMaxNationalNumberLength(map.get(keys.get(6)).toString());
		if (!map.get(keys.get(7)).toString().equals("")) {
			selectTextInCountryLevel(map.get(keys.get(7)).toString());
			int countryLevel = Integer.parseInt(map.get(keys.get(7)).toString());
			for (int i = 0; i < countryLevel; i++) {
				sendTextInlevel(By.xpath("(//*[contains(@id,'level_name')])[" + (i + 1) + "]"),
						map.get(keys.get(i + 8)).toString());
			}
		}
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to edit country
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/09/2018
	 */
	public void editCountry(Map<Object, Object> map, List<Object> keys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(2)).toString(),
				map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			sendTextInCountryName(map.get(keys.get(1)).toString());
			sendTextInDialingCode(map.get(keys.get(4)).toString());
			sendTextInMinNationalNumberLength(map.get(keys.get(5)).toString());
			sendTextInMaxNationalNumberLength(map.get(keys.get(6)).toString());
			if (!map.get(keys.get(7)).toString().equals(""))
				selectTextInCountryLevel(map.get(keys.get(7)).toString());
			int countryLevel = Integer.parseInt(map.get(keys.get(7)).toString());
			for (int i = 0; i < countryLevel; i++) {
				sendTextInlevel(By.xpath("(//*[contains(@id,'level_name')])[" + (i + 1) + "]"),
						map.get(keys.get(i + 8)).toString());
			}
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify country added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/09/2018
	 * @return true if country added successfully
	 */
	public boolean verifyCountryAdded(Map<Object, Object> map, List<Object> keys) {

		By countryName = By
				.xpath("//label[text()='Country Name']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(0)).toString() + "']]");
		By abbreviationCode2 = By
				.xpath("//label[text()='Abbreviation Code (2)']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(1)).toString() + "']]");
		By abbreviationCode3 = By
				.xpath("//label[text()='Abbreviation Code (3)']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(2)).toString() + "']]");
		By currencyCode = By
				.xpath("//label[text()='Currency Code (3)']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(3)).toString() + "']]");
		By dialingCode = By
				.xpath("//label[text()='Dialing Code']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(4)).toString() + "']]");
		By minNationalNoLength = By
				.xpath("//label[text()='Min National Number Length']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(5)).toString() + "']]");
		By maxNationalNoLength = By
				.xpath("//label[text()='Max National Number Length']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(6)).toString() + "']]");

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if(!map.get(keys.get(7)).toString().equals("")){
				int countryLevel = Integer.parseInt(map.get(keys.get(7)).toString());
				for (int i = 0; i < countryLevel; i++) {
					if (!verifyElement(By.xpath(
							"//label[text()='Level " + (i + 1) + "']//following-sibling :: div[text()[normalize-space() = '"
									+ map.get(keys.get(i + 8)).toString() + "']]"),
							false))
						return false;
				}
			}
			if (!verifyElement(countryName, false))
				return false;
			if (!verifyElement(abbreviationCode2, false))
				return false;
			if (!verifyElement(abbreviationCode3, false))
				return false;
			if (!verifyElement(currencyCode, false))
				return false;
			if (!verifyElement(dialingCode, false))
				return false;
			if (!verifyElement(minNationalNoLength, false))
				return false;
			if (!verifyElement(maxNationalNoLength, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to verify country edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 28/09/2018
	 * @return true if country edited successfully
	 */
	public boolean verifyCountryEdited(Map<Object, Object> map, List<Object> keys) {
		By countryName = By
				.xpath("//label[text()='Country Name']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(1)).toString() + "']]");
		By abbreviationCode2 = By
				.xpath("//label[text()='Abbreviation Code (2)']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(2)).toString() + "']]");
		By dialingCode = By
				.xpath("//label[text()='Dialing Code']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(4)).toString() + "']]");
		By minNationalNoLength = By
				.xpath("//label[text()='Min National Number Length']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(5)).toString() + "']]");
		By maxNationalNoLength = By
				.xpath("//label[text()='Max National Number Length']//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(keys.get(6)).toString() + "']]");

		filterSearch(map.get(getMapKeys(map).get(1)).toString(), map.get(getMapKeys(map).get(2)).toString(),
				map.get(getMapKeys(map).get(4)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			if(!map.get(keys.get(7)).toString().equals("")){
				int countryLevel = Integer.parseInt(map.get(keys.get(7)).toString());
				for (int i = 0; i < countryLevel; i++) {
					if (!verifyElement(By.xpath(
							"//label[text()='Level " + (i + 1) + "']//following-sibling :: div[text()[normalize-space() = '"
									+ map.get(keys.get(i + 8)).toString() + "']]"),
							false))
						return false;
				}
			}
			if (!verifyElement(countryName, false))
				return false;
			if (!verifyElement(abbreviationCode2, false))
				return false;
			if (!verifyElement(dialingCode, false))
				return false;
			if (!verifyElement(minNationalNoLength, false))
				return false;
			if (!verifyElement(maxNationalNoLength, false))
				return false;
			return true;
		} else
			return false;
	}

	/**
	 * @author dishant.doshi to delete country
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 28/09/2018
	 */
	public boolean deleteCountry(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Country already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyCountryDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
					map.get(getMapKeys(map).get(2)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author dishant.doshi to sort country
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortCountry(Map<Object, Object> map, List<Object> mapKeys) {
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
