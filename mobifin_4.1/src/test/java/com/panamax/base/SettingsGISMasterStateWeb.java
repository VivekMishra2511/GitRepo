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
public class SettingsGISMasterStateWeb extends Common {
	By drpCountry = By.id("CountryID");
	By txtState = By.id("Name");
	By txtAbbreviation = By.id("Code");
	By drpCountrySearch = By.id("cmbCountryID");
	By txtStateSearch = By.id("txtState");

	/**
	 * @author dishant.doshi
	 * @param driver
	 *            constructor
	 * @creation date 09/10/2018
	 */
	public SettingsGISMasterStateWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2) {
		commonFilterSearch();
		selectTextInCountryInSearch(str1);
		sendTextInStateInSearch(str2);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author dishant.doshi to select country from drop down list
	 * @param countryName
	 * @creation date 09/10/2018
	 */
	public void selectTextInCountry(String countryName) {
		selectFromDropdown(drpCountry, countryName);
	}

	/**
	 * @author dishant.doshi send text in state
	 * @param stateName
	 * @creation date 09/10/2018
	 */
	public void sendTextInState(String stateName) {
		clearAndSendTextInTextBox(txtState, stateName);
	}

	/**
	 * @author dishant.doshi send text in abbreviation
	 * @param abbreviation
	 * @creation date 09/10/2018
	 */
	public void sendTextInAbbreviation(String abbreviation) {
		clearAndSendTextInTextBox(txtAbbreviation, abbreviation);
	}

	/**
	 * @author dishant.doshi to select country from drop down list in search
	 * @param countryName
	 * @creation date 11/10/2018
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
	 * @author dishant.doshi to add state
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 11/10/2018
	 */
	public void addState(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectTextInCountry(map.get(mapKeys.get(0)).toString());
		sendTextInState(map.get(mapKeys.get(1)).toString());
		sendTextInAbbreviation(map.get(mapKeys.get(2)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi to verify state added?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 11/10/2018
	 * @return true if state added successfully
	 */
	public boolean verifyStateAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By countryName = By
				.xpath("//label[text()[normalize-space() = 'Country']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(0)).toString() + "']]");
		By stateName = By
				.xpath("//label[text()[normalize-space() = 'State']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(1)).toString() + "']]");
		By abbreviationCode = By
				.xpath("//label[text()[normalize-space() = 'Abbreviation Code']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(2)).toString() + "']]");

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(countryName, false))
				return false;
			if (!verifyElement(stateName, false))
				return false;
			if (!verifyElement(abbreviationCode, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to edit state
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 11/10/2018
	 */
	public void editState(Map<Object, Object> map, List<Object> mapKeys) {

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString());
			clickOnEditBtn();
			sendTextInState(map.get(getMapKeys(map).get(2)).toString());
			sendTextInAbbreviation(map.get(getMapKeys(map).get(3)).toString());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi to verify state edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 11/10/2018
	 * @return true if state edited successfully
	 */
	public boolean verifyStateEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By countryName = By
				.xpath("//label[text()[normalize-space() = 'Country']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(0)).toString() + "']]");
		By stateName = By
				.xpath("//label[text()[normalize-space() = 'State']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(2)).toString() + "']]");
		By abbreviationCode = By
				.xpath("//label[text()[normalize-space() = 'Abbreviation Code']]//following-sibling :: div[text()[normalize-space() = '"
						+ map.get(mapKeys.get(3)).toString() + "']]");

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(mapKeys.get(2)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(2)).toString());
			if (!verifyElement(countryName, false))
				return false;
			if (!verifyElement(stateName, false))
				return false;
			if (!verifyElement(abbreviationCode, false))
				return false;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to delete state
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @return
	 * @creation date 11/10/2018
	 */
	public boolean deleteState(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "State already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	public boolean verifyStateDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if (verifyFilterBtn()) {
			filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString());
			return verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"),
					false);
		} else {
			return true;
		}
	}

	/**
	 * @author dishant.doshi to sort state
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortState(Map<Object, Object> map, List<Object> mapKeys) {
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
