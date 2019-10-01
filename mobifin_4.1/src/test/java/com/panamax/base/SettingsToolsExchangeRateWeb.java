package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.panamax.init.Common;

public class SettingsToolsExchangeRateWeb extends Common {
	By txtAccountName = By.id("AccountName");
	By txtAccountNameInSearch = By.id("cmbAccountName");
	By drpServiceNameVerify = By.id("ExgRateToolID_chosen");
	By drpServiceName = By.id("ExgRateToolID");
	By drpStatus = By.id("IsActive");
	By txtCurrencyValue = By.id("text_1");

	/**
	 * @author shivani.patel
	 * @param driver
	 *            constructor
	 * @creation date 29/10/2018
	 */
	public SettingsToolsExchangeRateWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel click On AccountType
	 * @param AccountType
	 * @creation date 29/10/2018
	 */
	public void selectAccountType(String AccountType) {
		clickOnElement(By.xpath(".//*[normalize-space(text())='" + AccountType.trim() + "']"));
	}

	/**
	 * @author shivani.patel send Text In AccountName Field
	 * @param AccountName
	 * @creation date 29/10/2018
	 */
	public void sendTextInAccountName(String AccountName) {
		sendTextInTextBox(txtAccountName, AccountName);
	}

	/**
	 * @author shivani.patel send Text AccountName In Filter Search Field
	 * @param AccountName
	 * @creation date 29/10/2018
	 */
	public void selectAccountNameInFilterSearch(String AccountName) {
		clearAndSendTextInTextBox(txtAccountNameInSearch, AccountName);
	}

	/**
	 * @author shivani.patel select ServiceName in DropdownBox
	 * @param ServiceName
	 * @creation date 29/10/2018
	 */
	public void selectServiceName(String ServiceName) {
		selectFromDropdown(drpServiceName, ServiceName);
	}

	/**
	 * @author shivani.patel select Status in DropdownBox
	 * @param Status
	 * @creation date 29/10/2018
	 */
	public void selectStatus(String Status) {
		selectFromDropdown(drpStatus, Status);
	}

	/**
	 * @author shivani.patel select Country in checkBox
	 * @param Country
	 * @creation date 29/10/2018
	 */
	public void selectCountry(String Country) {
		clickOnElement(By.xpath(".//*[normalize-space(text())='" + Country.trim()
				+ "']//parent :: div//preceding-sibling :: div//label"));
	}

	/**
	 * @author shivani.patel select Minutes in radioButton
	 * @param Minutes
	 * @creation date 29/10/2018
	 */
	public void selectMinutes(String Minutes) {
		clickOnElement(By
				.xpath(".//*[normalize-space(text())='Minutes']//parent::div//following-sibling::label[normalize-space(text())='"
						+ Minutes.trim() + "']"));
	}

	/**
	 * @author shivani.patel select Hours in radioButton
	 * @param Hours
	 * @creation date 29/10/2018
	 */
	public void selectHours(String Hours) {
		clickOnElement(By
				.xpath(".//*[normalize-space(text())='Hours']//parent::div//following-sibling::label[normalize-space(text())='"
						+ Hours.trim() + "']"));
	}

	/**
	 * @author shivani.patel select DaysOfMonth in radioButton
	 * @param DaysOfMonth
	 * @creation date 29/10/2018
	 */
	public void selectDaysOfMonth(String DaysOfMonth) {
		clickOnElement(By
				.xpath(".//*[normalize-space(text())='Days Of Month']//parent::div//following-sibling::label[normalize-space(text())='"
						+ DaysOfMonth.trim() + "']"));
	}

	/**
	 * @author shivani.patel select Months in radioButton
	 * @param Months
	 * @creation date 29/10/2018
	 */
	public void selectMonths(String Months) {
		clickOnElement(By
				.xpath(".//*[normalize-space(text())='Months']//parent::div//following-sibling::label[normalize-space(text())='"
						+ Months.trim() + "']"));
	}

	/**
	 * @author shivani.patel select Weekdays in radioButton
	 * @param Weekdays
	 * @creation date 29/10/2018
	 */
	public void selectWeekdays(String Weekdays) {
		clickOnElement(By
				.xpath(".//*[normalize-space(text())='Weekdays']//parent::div//following-sibling::label[normalize-space(text())='"
						+ Weekdays.trim() + "']"));
	}

	/**
	 * @author shivani.patel Send Text In CurrencyValue
	 * @param Weekdays
	 * @creation date 29/10/2018
	 */
	public void sendTextInCountryCurrencyValue(String CurrencyValue) {
		clearAndSendTextInTextBox(txtCurrencyValue, CurrencyValue);
	}

	/**
	 * @author shivani.patel use for send value in filter search fields
	 * @param Weekdays
	 * @creation date 29/10/2018
	 */
	public void filterSearch(String Accountname) {
		commonFilterSearch();
		selectAccountNameInFilterSearch(Accountname);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author shivani.patel to Add ExchangeRate
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 29/10/2018
	 */
	public void addExchangeRate(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		selectAccountType(map.get(mapKeys.get(0)).toString());
		sendTextInAccountName(map.get(mapKeys.get(1)).toString());
		if (verifyElement(drpServiceNameVerify)) {
			selectServiceName(map.get(mapKeys.get(2)).toString());
		}
		selectStatus(map.get(mapKeys.get(3)).toString());
		String[] country = map.get(mapKeys.get(4)).toString().trim().split(",");
		for (int i = 0; i < country.length; i++) {
			selectCountry(country[i].trim());
		}
		if ((map.get(mapKeys.get(0)).toString()).equals("Manual")) {
			sendTextInCountryCurrencyValue(map.get(mapKeys.get(10)).toString());
		} else if ((map.get(mapKeys.get(0)).toString()).equals("Pre Defined")) {
			if (!(map.get(mapKeys.get(5)).toString()).isEmpty())
				selectMinutes(map.get(mapKeys.get(5)).toString());
			if (!(map.get(mapKeys.get(6)).toString()).isEmpty())
				selectHours(map.get(mapKeys.get(6)).toString());
			if (!(map.get(mapKeys.get(7)).toString()).isEmpty())
				selectDaysOfMonth(map.get(mapKeys.get(7)).toString());
			if (!(map.get(mapKeys.get(8)).toString()).isEmpty())
				selectMonths(map.get(mapKeys.get(8)).toString());
			if (!(map.get(mapKeys.get(9)).toString()).isEmpty())
				selectWeekdays(map.get(mapKeys.get(9)).toString());
		}
		clickOnSaveBtn();
	}

	/**
	 * @author shivani.patel to verify Add ExchangeRate
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 29/10/2018
	 * @return true if ExchangeRate add successfully Verified
	 */
	public boolean verifyaddExchangeRate(Map<Object, Object> map, List<Object> mapKeys) {
		By AccountType = By
				.xpath("//label[normalize-space(text()) = 'Account Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(0)).toString() + "']");
		By AccountName = By
				.xpath("//label[normalize-space(text()) = 'Account Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By ServiceName = By
				.xpath("//label[normalize-space(text()) = 'Service Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(2)).toString() + "']");
		By Status = By
				.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(3)).toString() + "']");
		By Minutes = By
				.xpath("//label[normalize-space(text()) = 'Minutes']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By Hours = By
				.xpath("//label[normalize-space(text()) = 'Hours']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By DaysOfMonth = By
				.xpath("//label[normalize-space(text()) = 'Days Of Month']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "']");
		By Months = By
				.xpath("//label[normalize-space(text()) = 'Months']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");
		By Weekdays = By
				.xpath("//label[normalize-space(text()) = 'Weekdays']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(9)).toString() + "']");

		filterSearch(map.get(mapKeys.get(1)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(1)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(1)).toString());
			if (!verifyElement(AccountType, false))
				return false;
			if (!verifyElement(AccountName, false))
				return false;
			if ((map.get(mapKeys.get(2)).toString()).length() != 0) {
				if (!verifyElement(ServiceName, false))
					return false;
			}
			if (!verifyElement(Status, false))
				return false;
			if ((map.get(mapKeys.get(5)).toString()).length() != 0) {
				if (!verifyElement(Minutes, false))
					return false;
				if (!verifyElement(Hours, false))
					return false;
				if (!verifyElement(DaysOfMonth, false))
					return false;
				if (!verifyElement(Months, false))
					return false;
				if (!verifyElement(Weekdays, false))
					return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel to Edit ExchangeRate
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 29/10/2018
	 */
	public void editExchangeRate(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnEditBtn();
			selectStatus(map.get(mapKeys.get(1)).toString());
			if ((map.get(mapKeys.get(2)).toString()).length() != 0) {
				String[] country = map.get(mapKeys.get(2)).toString().trim().split(",");
				for (int i = 0; i < country.length; i++) {
					WebElement element = driver.findElement(By.xpath("//*[normalize-space(text())='" + country[i].trim()
							+ "']//parent :: div//preceding-sibling :: div//input"));
					if (!isAttribtuePresent(element, "checked"))
						selectCountry(country[i].trim());
				}
				if ((map.get(mapKeys.get(3)).toString()).length() != 0) {
					sendTextInCountryCurrencyValue(map.get(mapKeys.get(3)).toString());
				}
			}
			if ((map.get(mapKeys.get(4)).toString()).length() != 0) {
				selectMinutes(map.get(mapKeys.get(4)).toString());
				selectHours(map.get(mapKeys.get(5)).toString());
				selectDaysOfMonth(map.get(mapKeys.get(6)).toString());
				selectMonths(map.get(mapKeys.get(7)).toString());
				selectWeekdays(map.get(mapKeys.get(8)).toString());
			}
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel to verify Edit ExchangeRate
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 29/10/2018
	 * @return true if ExchangeRate edit successfully Verified
	 */
	public boolean verifyeditExchangeRate(Map<Object, Object> map, List<Object> mapKeys) {
		By Status = By
				.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(1)).toString() + "']");
		By Minutes = By
				.xpath("//label[normalize-space(text()) = 'Minutes']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(4)).toString() + "']");
		By Hours = By
				.xpath("//label[normalize-space(text()) = 'Hours']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(5)).toString() + "']");
		By DaysOfMonth = By
				.xpath("//label[normalize-space(text()) = 'Days Of Month']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(6)).toString() + "']");
		By Months = By
				.xpath("//label[normalize-space(text()) = 'Months']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(7)).toString() + "']");
		By Weekdays = By
				.xpath("//label[normalize-space(text()) = 'Weekdays']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(mapKeys.get(8)).toString() + "']");

		filterSearch(map.get(mapKeys.get(0)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			if (!verifyElement(Status, false))
				return false;
			if ((map.get(mapKeys.get(4)).toString()).length() != 0) {
				if (!verifyElement(Minutes, false))
					return false;
				if (!verifyElement(Hours, false))
					return false;
				if (!verifyElement(DaysOfMonth, false))
					return false;
				if (!verifyElement(Months, false))
					return false;
				if (!verifyElement(Weekdays, false))
					return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author kutbuddin.compounder to verify ExchangeRate log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 18/12/2018
	 * @return true if ExchangeRate Log successfully Verified
	 */
	public boolean verifyEditLogExchangeRate(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort exchangeRate
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortExchangeRate(Map<Object, Object> map, List<Object> mapKeys) {
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
