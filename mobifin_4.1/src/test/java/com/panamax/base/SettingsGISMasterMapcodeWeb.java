package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi Actions of Settings - GISMaster - State
 * @creation date 09/10/2018
 */
public class SettingsGISMasterMapcodeWeb extends Common {
	By drpCountry = By.id("CountryID");
	By drpState = By.id("state");
	By txtMapcode = By.id("MapCodeName");
	By drpCountrySearch = By.id("cmbCountryID");
	By txtStateSearch = By.id("txtState");
	By txtMapcodeSearch = By.id("MapCodeName");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 12/10/2018
	 */
	public SettingsGISMasterMapcodeWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2, String str3) {
		commonFilterSearch();
		selectTextInCountryInSearch(str1);
		sendTextInStateInSearch(str2);
		sendTextInMapcode(str3);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to select country from drop down list
	 * @param countryName
	 * @creation date 12/10/2018
	 */
	public void selectTextInCountry(String countryName) {
		selectFromDropdown(drpCountry, countryName);
	}

	/**
	 * @author dishant.doshi to select state from drop down list
	 * @param stateName
	 * @creation date 12/10/2018
	 */
	public void selectTextInState(String stateName) {
		selectFromDropdown(drpState, stateName);
	}

	/**
	 * @author dishant.doshi send text in map code
	 * @param mapCode
	 * @creation date 12/10/2018
	 */
	public void sendTextInMapcode(String mapCode) {
		clearAndSendTextInTextBox(txtMapcode, mapCode);
	}

	/**
	 * @author dishant.doshi to send text in levels
	 * @param element
	 * @param text
	 * @creation date 12/10/2018
	 */
	public void sendTextInLevels(By element, String text) {
		clearAndSendTextInTextBox(element, text);
	}

	/**
	 * @author dishant.doshi to select country from drop down list in search
	 * @param countryName
	 * @creation date 12/10/2018
	 */
	public void selectTextInCountryInSearch(String countryName) {
		selectFromDropdown(drpCountrySearch, countryName);
	}

	/**
	 * @author dishant.doshi send text in state in search
	 * @param stateName
	 * @creation date 11/10/2018
	 */
	public void sendTextInStateInSearch(String stateName) {
		clearAndSendTextInTextBox(txtStateSearch, stateName);
	}

	/**
	 * @author dishant.doshi send text in map code in search
	 * @param mapCode
	 * @creation date 12/10/2018
	 */
	public void sendTextInMapcodeInSearch(String mapCode) {
		clearAndSendTextInTextBox(txtMapcodeSearch, mapCode);
	}

	/**
	 * @author dishant.doshi to add map code
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 12/10/2018
	 */
	public void addMapcode(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectTextInCountry(map.get(mapKeys.get(0)).toString());
		sendTextInMapcode(map.get(mapKeys.get(2)).toString());
		selectTextInState(map.get(mapKeys.get(1)).toString());
		if (!map.get(mapKeys.get(3)).toString().equals("")) {
			String[] levels = map.get(mapKeys.get(3)).toString().split(",");
			for (int i = 0; i < levels.length; i++) {
				sendTextInLevels(By.xpath("(//*[contains(@id,'level_name')])[" + (i + 1) + "]"),
						map.get(mapKeys.get(i + 4)).toString());
			}
		}
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify map code added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 12/10/2018
	 * @return true if map code added successfully
	 */
	public boolean verifyMapcodeAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By countryName = By
				.xpath("//label[text()[normalize-space() = 'Country']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(0)).toString() + "']]");
		By stateName = By
				.xpath("//label[text()[normalize-space() = 'State']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(1)).toString() + "']]");
		By mapCode = By
				.xpath("//label[text()[normalize-space() = 'Map Code Name']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(2)).toString() + "']]");

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!map.get(mapKeys.get(3)).toString().equals("")) {
				String[] levels = map.get(mapKeys.get(3)).toString().split(",");
				for (int i = 0; i < levels.length; i++) {
					if (!verifyElement(By.xpath("//label[text()[normalize-space() = '" + levels[i]
							+ "']]//following-sibling :: div[text()[normalize-space() = '"
							+ map.get(mapKeys.get(i + 4)).toString() + "']]"), false))
						return false;
				}
			}
			if (!verifyElement(countryName, false))
				return false;
			if (!verifyElement(stateName, false))
				return false;
			if (!verifyElement(mapCode, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to edit map code
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 12/10/2018
	 */
	public void editMapcode(Map<Object, Object> map, List<Object> mapKeys) {

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			sendTextInMapcode(map.get(getMapKeys(map).get(3)).toString());
			if (!map.get(mapKeys.get(4)).toString().equals("")) {
				String[] levels = map.get(mapKeys.get(4)).toString().split(",");
				for (int i = 0; i < levels.length; i++) {
					sendTextInLevels(By.xpath("(//*[contains(@id,'level_name')])[" + (i + 1) + "]"),
							map.get(mapKeys.get(i + 5)).toString());
				}
			}
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify map code edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 12/10/2018
	 * @return true if map code edited successfully
	 */
	public boolean verifyMapcodeEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By countryName = By
				.xpath("//label[text()[normalize-space() = 'Country']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(0)).toString() + "']]");
		By stateName = By
				.xpath("//label[text()[normalize-space() = 'State']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(1)).toString() + "']]");
		By mapCode = By
				.xpath("//label[text()[normalize-space() = 'Map Code Name']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(3)).toString() + "']]");

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!map.get(mapKeys.get(4)).toString().equals("")) {
				String[] levels = map.get(mapKeys.get(4)).toString().split(",");
				for (int i = 0; i < levels.length; i++) {
					if (!verifyElement(By.xpath("//label[text()[normalize-space() = '" + levels[i]
							+ "']]//following-sibling :: div[text()[normalize-space() = '"
							+ map.get(mapKeys.get(i + 5)).toString() + "']]")))
						return false;
				}
			}
			if (!verifyElement(countryName, false))
				return false;
			if (!verifyElement(stateName, false))
				return false;
			if (!verifyElement(mapCode, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to delete map code
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 12/10/2018
	 */
	public boolean deleteMapcode(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Map Code already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyMapCodeDeleted(Map<Object, Object> map, List<Object> mapKeys) {
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
	 * @author dishant.doshi to sort map code
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortMapCode(Map<Object, Object> map, List<Object> mapKeys) {
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
