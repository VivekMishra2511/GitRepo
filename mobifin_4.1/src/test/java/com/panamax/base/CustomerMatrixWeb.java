package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class CustomerMatrixWeb extends Common {
	By txtProductCode = By.id("ProductCode");
	By drpProfileName = By.id("ProfileID");
	By drpSearchServiceType = By.id("cmbSystemServiceID");
	By drpSearchOperatorName = By.id("cmbOperatorID");
	By txtSerachProductNam = By.id("txtProductName");
	By drpSerachKycStatus = By.id("cmbKycStatus");
	By drpSerachProductName = By.id("cmbSystemServiceID");
	By drpSerachStatus = By.id("cmbIsActive");
	By drpKycStatus = By.id("KycStatus");
	By drpStatus = By.id("IsActive");
	String IsYes = "Yes";
	String IsPercentage = "Percentage";
	String IsFix = "Fix";

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 14/11/2018
	 */
	public CustomerMatrixWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder select value from Customer Matrix
	 *         profileName drop down
	 * @param profileName
	 * @creation date 14/11/2018
	 */
	public void selectProfileName(String profileName) {
		selectFromDropdown(drpProfileName, profileName);
	}

	/**
	 * @author kutbuddin.compounder send text in Customer Matrix productCode
	 *         field
	 * @param productCode
	 * @creation date 14/11/2018
	 */
	public void sendTextInProductCode(String productCode) {
		clearAndSendTextInTextBox(txtProductCode, productCode);
	}

	/**
	 * @author kutbuddin.compounder common actions for navigation menu
	 * @param navigationMenu
	 * @creation date 14/11/2018
	 */
	public void clickOnNavigationMenu(String navigationMenu) {
		clickOnElement(By.xpath("//*[normalize-space(text()) = '" + navigationMenu.trim() + "']"));
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Matrix status
	 *         drop down
	 * @param status
	 * @creation date 14/11/2018
	 */
	public void selectSearchStatus(String status) {
		selectFromDropdown(drpSerachStatus, status);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Matrix Kyc status
	 *         search drop down
	 * @param kycStatus
	 * @creation date 14/11/2018
	 */
	public void selectSearchKycStatus(String kycStatus) {
		selectFromDropdown(drpSerachKycStatus, kycStatus);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Matrix
	 *         productNAme search drop down
	 * @param productNAme
	 * @creation date 14/11/2018
	 */
	public void selectSearchProductName(String productNAme) {
		selectFromDropdown(drpSerachProductName, productNAme);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Matrix
	 *         serviceType search drop down
	 * @param serviceType
	 * @creation date 14/11/2018
	 */
	public void selectSearchServiceType(String serviceType) {
		selectFromDropdown(drpSearchServiceType, serviceType);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Matrix
	 *         operatorName search drop down
	 * @param operatorName
	 * @creation date 14/11/2018
	 */
	public void selectSearchOperatorName(String operatorName) {
		selectFromDropdown(drpSearchOperatorName, operatorName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Matrix
	 *         operatorName search drop down
	 * @param operatorName
	 * @creation date 14/11/2018
	 */
	public void sendTextInSearchProductName(String productName) {
		clearAndSendTextInTextBox(txtSerachProductNam, productName);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Matrix status
	 *         drop down
	 * @param status
	 * @creation date 12/11/2018
	 */
	public void selectStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author kutbuddin.compounder select value from Customer-Matrix Kyc status
	 *         drop down
	 * @param status
	 * @creation date 12/11/2018
	 */
	public void selectKycStatus(String kycStatus) {
		selectFromDropdown(drpKycStatus, kycStatus);
	}

	/**
	 * @author kutbuddin.compounder send text in from Customer-Matrix
	 *         surchargeValue search drop down
	 * @param surchargeValue
	 * @creation date 14/11/2018
	 */
	public void sendTextInValue(By element, String Value) {
		clearAndSendTextInTextBox(element, Value);
	}

	/**
	 * @author kutbuddin.compounder to Edit Customer Matrix
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 14/11/2018
	 */
	public void editCustomerMatrix(Map<Object, Object> map, List<Object> keys) {
		selectProfileName(map.get(getMapKeys(map).get(0)).toString().trim());
		clickOnFilterSearchBtn();
		commonFilterSearch();
		String[] services = map.get(getMapKeys(map).get(1)).toString().split("/");
		int count = 0;
		for (int i = 0; i < services.length; i++) {
			String[] EditServices = services[i].split(":");
			if (!services[i].isEmpty()||services[i]!=null||services[i]!=" ") {
				clickOnNavigationMenu(EditServices[0].trim());
				clickOnFilterBtn();
				String[] searchFilterValues = EditServices[1].split(";");
				if (EditServices[0].trim().equalsIgnoreCase("Internal Services")) {
					if (!searchFilterValues[0].trim().isEmpty()) {
						selectSearchProductName(searchFilterValues[0].trim());
					}
					if (!searchFilterValues[1].trim().isEmpty()) {
						selectSearchKycStatus(searchFilterValues[1].trim());
					}
					if (!searchFilterValues[2].trim().isEmpty()) {
						selectSearchStatus(searchFilterValues[2].trim());
					}
					clickOnFilterSearchBtn();
					String[] infoButton = searchFilterValues[0].replaceAll("-", ":").split(":");
					clickOnInfoBtn(infoButton[0].trim());
				} else {
					if (!searchFilterValues[0].trim().isEmpty()) {
						selectSearchServiceType(searchFilterValues[0].trim());
					}
					if (!searchFilterValues[1].trim().isEmpty()) {
						selectSearchOperatorName(searchFilterValues[1].trim());
					}
					if (!searchFilterValues[2].trim().isEmpty()) {
						sendTextInSearchProductName(searchFilterValues[2].trim());
					}
					if (!searchFilterValues[3].trim().isEmpty()) {
						selectSearchKycStatus(searchFilterValues[3].trim());
					}
					if (!searchFilterValues[4].trim().isEmpty()) {
						selectSearchStatus(searchFilterValues[4].trim());
					}
					clickOnFilterSearchBtn();
					clickOnInfoBtn(searchFilterValues[2].trim());
				}
				clickOnEditBtn();
				String[] kycValues = map.get(getMapKeys(map).get(2)).toString().split(",");
				String[] statusValues = map.get(getMapKeys(map).get(3)).toString().split(",");
				String[] surchargeTypes = map.get(getMapKeys(map).get(4)).toString().split("/");
				String[] surchargeValues = map.get(getMapKeys(map).get(5)).toString().split("/");
				String[] cashbackTypes = map.get(getMapKeys(map).get(6)).toString().split("/");
				String[] cashbackValues = map.get(getMapKeys(map).get(7)).toString().split("/");
				selectKycStatus(kycValues[count].trim());
				selectStatus(statusValues[count].trim());
				String[] surchargeType = surchargeTypes[count].split(":");
				String[] surchargeValue = surchargeValues[count].split(":");
				String[] cashbackType = cashbackTypes[count].split(":");
				String[] cashbackValue = cashbackValues[count].split(":");
				for (int j = 0; j < surchargeType.length; j++) {
					By clickSurchargeType = By
							.xpath("(//label[contains(@id,'lblSurchargeType') and normalize-space(text())='"
									+ surchargeType[j].trim() + "'])[" + (j + 1) + "]");
					By sendTextInSurchargeValue = By.xpath("(//*[contains(@id,'SurchargeValue')])[" + (j + 1) + "]");
					clickOnElement(clickSurchargeType);
					sendTextInValue(sendTextInSurchargeValue, surchargeValue[j].trim());
					By clickCashbackType = By
							.xpath("(//label[contains(@id,'lblCashbackType') and normalize-space(text())='"
									+ cashbackType[j].trim() + "'])[" + (j + 1) + "]");
					By sendTextInCashbackValue = By.xpath("(//*[contains(@id,'CashbackValue')])[" + (j + 1) + "]");
					clickOnElement(clickCashbackType);
					sendTextInValue(sendTextInCashbackValue, cashbackValue[j].trim());
				}
				clickOnSaveBtn();
				count++;
			}
		}
	}

	/**
	 * @author kutbuddin.compounder to verify Customer Matrix edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 14/11/2018
	 * @return true if Customer Matrix edited successfully
	 */
	public boolean verifyCustomerMatrixEdited(Map<Object, Object> map, List<Object> keys) {
		String[] Services = map.get(getMapKeys(map).get(1)).toString().split("/");
		int count = 0;
		for (int i = 0; i < Services.length; i++) {
			String[] EditServices = Services[i].split(":");
			if (!Services[i].isEmpty()) {
				clickOnNavigationMenu(EditServices[0].trim());
				clickOnFilterBtn();
				String[] searchFilterValues = EditServices[1].split(";");
				if (EditServices[0].trim().equalsIgnoreCase("Internal Services")) {
					if (!searchFilterValues[0].trim().isEmpty()) {
						selectSearchProductName(searchFilterValues[0]);
					}
					if (!searchFilterValues[1].trim().isEmpty()) {
						selectSearchKycStatus(searchFilterValues[1].trim());
					}
					if (!searchFilterValues[2].trim().isEmpty()) {
						selectSearchStatus(searchFilterValues[2].trim());
					}
					clickOnFilterSearchBtn();
					String[] infoButton = searchFilterValues[0].replaceAll("-", ":").split(":");
					clickOnInfoBtn(infoButton[0].trim());
				} else {
					if (!searchFilterValues[0].trim().isEmpty()) {
						selectSearchServiceType(searchFilterValues[0].trim());
					}
					if (!searchFilterValues[1].trim().isEmpty()) {
						selectSearchOperatorName(searchFilterValues[1].trim());
					}
					if (!searchFilterValues[2].trim().isEmpty()) {
						sendTextInSearchProductName(searchFilterValues[2].trim());
					}
					if (!searchFilterValues[3].trim().isEmpty()) {
						selectSearchKycStatus(searchFilterValues[3].trim());
					}
					if (!searchFilterValues[4].trim().isEmpty()) {
						selectSearchStatus(searchFilterValues[4].trim());
					}
					clickOnFilterSearchBtn();
					clickOnInfoBtn(searchFilterValues[2]);
				}
				String[] kycValues = map.get(getMapKeys(map).get(2)).toString().split(",");
				String[] statusValues = map.get(getMapKeys(map).get(3)).toString().split(",");
				String[] surchargeTypes = map.get(getMapKeys(map).get(4)).toString().split("/");
				By kycStatus = By
						.xpath("//span[normalize-space(text())='KYC Status :']//following:: div[@class='desc-info' and normalize-space(text()) = '"
								+ kycValues[count] + "']");
				By status = By
						.xpath("//span[normalize-space(text())='Status :']//following:: div[@class='desc-info' and normalize-space(text()) = '"
								+ statusValues[count] + "']");
				if (!verifyElement(kycStatus, false))
					return false;
				if (!verifyElement(status, false))
					return false;
				String[] surchargeType = surchargeTypes[count].split(":");
				for (int j = 0; j < surchargeType.length; j++) {
					By SurchargeType = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[2]");
					By SurchargeValue = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[3]");
					By CashbackType = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[4]");
					By CashbackValue = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[5]");
					if (!verifyElement(SurchargeType, false))
						return false;
					if (!verifyElement(SurchargeValue, false))
						return false;
					if (!verifyElement(CashbackType, false))
						return false;
					if (!verifyElement(CashbackValue, false))
						return false;
				}
				count++;
			}

		}
		return true;
	}

	/**
	 * @author dishant.doshi to sort customer matrix
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 14/12/2018
	 */
	public boolean sortMatrix(Map<Object, Object> map, List<Object> mapKeys) {
		selectProfileName(map.get(getMapKeys(map).get(0)).toString().trim());
		clickOnFilterSearchBtn();
		clickOnNavigationMenu(map.get(getMapKeys(map).get(1)).toString());
		List<String> list = addColumnInGrid();
		if (verifyColumnInGrid(list)) {
			pagination();
			Map<String, List<String>> getBeforeSortTableData = getTableData(map.get(getMapKeys(map).get(4)).toString());
			clickOnSortBtn(map.get(getMapKeys(map).get(2)).toString(), map.get(getMapKeys(map).get(3)).toString());
			List<String> sortedUIColumnData = getColumnData(map.get(getMapKeys(map).get(2)).toString());
			List<String> sortedUIColumnDataCopy = new ArrayList<>(sortedUIColumnData);
			sortColumn(sortedUIColumnData, map.get(getMapKeys(map).get(3)).toString());
			if (!compareTwoLists(sortedUIColumnData, sortedUIColumnDataCopy))
				return false;
			Map<String, List<String>> getAfterSortTableData = getTableData(map.get(getMapKeys(map).get(4)).toString());
			if (!getBeforeSortTableData.equals(getAfterSortTableData))
				return false;
			reloadCurrentPage();
			return true;
		} else {
			return false;
		}
	}
}
