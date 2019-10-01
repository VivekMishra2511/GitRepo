package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class MerchantMatrixWeb extends Common {
	By txtProductCode = By.id("ProductCode");
	By drpTreeName = By.id("FilterTreeID");
	By drpTreeLevel = By.id("Level");
	By drpProfileName = By.id("ProfileID");
	By drpSearchServiceType = By.id("cmbSystemServiceID");
	By drpSearchOperatorName = By.id("cmbOperatorID");
	By txtSerachProductNam = By.id("txtProductName");
	By drpSerachKycStatus = By.id("cmbKycStatus");
	By drpSerachProductName = By.id("cmbSystemServiceID");
	By drpSerachStatus = By.id("cmbIsActive");
	By drpKycStatus = By.id("KycStatus");
	By drpStatus = By.id("IsActive");
	By lblLevel1 = By.xpath("//*[@id='edit-section']//tr/th[5]");
	By lblLevel2 = By.xpath("//*[@id='edit-section']//tr/th[6]");
	By lblLevel3 = By.xpath("//*[@id='edit-section']//tr/th[7]");
	By lblVerifyLevel1 = By.xpath("//*[@id='view-section']//tr/th[5]");
	By lblVerifyLevel2 = By.xpath("//*[@id='view-section']//tr/th[6]");
	By lblVerifyLevel3 = By.xpath("//*[@id='view-section']//tr/th[7]");

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 21/11/2018
	 */
	public MerchantMatrixWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant Matrix treeName
	 *         drop down
	 * @param treeName
	 * @creation date 21/11/2018
	 */
	public void selectTreeName(String treeName) {
		selectFromDropdown(drpTreeName, treeName);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant Matrix treeLevel
	 *         drop down
	 * @param treeLevel
	 * @creation date 21/11/2018
	 */
	public void selectTreeLevel(String treeLevel) {
		selectFromDropdown(drpTreeLevel, treeLevel);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant Matrix
	 *         profileName drop down
	 * @param profileName
	 * @creation date 21/11/2018
	 */
	public void selectProfileName(String profileName) {
		selectFromDropdown(drpProfileName, profileName);
	}

	/**
	 * @author kutbuddin.compounder send text in Merchant Matrix productCode
	 *         field
	 * @param productCode
	 * @creation date 21/11/2018
	 */
	public void sendTextInProductCode(String productCode) {
		clearAndSendTextInTextBox(txtProductCode, productCode);
	}

	/**
	 * @author kutbuddin.compounder common actions for navigation menu
	 * @param navigationMenu
	 * @creation date 21/11/2018
	 */
	public void clickOnNavigationMenu(String navigationMenu) {
		clickOnElement(By.xpath("//*[normalize-space(text()) = '" + navigationMenu.trim() + "']"));
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant-Matrix status
	 *         drop down
	 * @param status
	 * @creation date 21/11/2018
	 */
	public void selectSearchStatus(String status) {
		selectFromDropdown(drpSerachStatus, status);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant-Matrix Kyc status
	 *         search drop down
	 * @param kycStatus
	 * @creation date 21/11/2018
	 */
	public void selectSearchKycStatus(String kycStatus) {
		selectFromDropdown(drpSerachKycStatus, kycStatus);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant-Matrix
	 *         productNAme search drop down
	 * @param productNAme
	 * @creation date 21/11/2018
	 */
	public void selectSearchProductName(String productNAme) {
		selectFromDropdown(drpSerachProductName, productNAme);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant-Matrix
	 *         serviceType search drop down
	 * @param serviceType
	 * @creation date 21/11/2018
	 */
	public void selectSearchServiceType(String serviceType) {
		selectFromDropdown(drpSearchServiceType, serviceType);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant-Matrix
	 *         operatorName search drop down
	 * @param operatorName
	 * @creation date 21/11/2018
	 */
	public void selectSearchOperatorName(String operatorName) {
		selectFromDropdown(drpSearchOperatorName, operatorName);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant-Matrix
	 *         operatorName search drop down
	 * @param operatorName
	 * @creation date 21/11/2018
	 */
	public void sendTextInSearchProductName(String productName) {
		clearAndSendTextInTextBox(txtSerachProductNam, productName);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant-Matrix status
	 *         drop down
	 * @param status
	 * @creation date 12/11/2018
	 */
	public void selectStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author kutbuddin.compounder select value from Merchant-Matrix Kyc status
	 *         drop down
	 * @param status
	 * @creation date 12/11/2018
	 */
	public void selectKycStatus(String kycStatus) {
		selectFromDropdown(drpKycStatus, kycStatus);
	}

	/**
	 * @author kutbuddin.compounder send text in from Merchant-Matrix
	 *         surchargeValue search drop down
	 * @param surchargeValue
	 * @creation date 21/11/2018
	 */
	public void sendTextInValue(By element, String Value) {
		clearAndSendTextInTextBox(element, Value);
	}

	/**
	 * @author kutbuddin.compounder to Edit Merchant Matrix
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 21/11/2018
	 */
	public void editMerchantMatrix(Map<Object, Object> map, List<Object> keys) {
		if (!map.get(getMapKeys(map).get(0)).toString().isEmpty()) {
			selectTreeName(map.get(getMapKeys(map).get(0)).toString().trim());
			selectTreeLevel(map.get(getMapKeys(map).get(1)).toString().trim());
		}
		selectProfileName(map.get(getMapKeys(map).get(2)).toString().trim());
		clickOnFilterSearchBtn();
		commonFilterSearch();
		String[] Services = map.get(getMapKeys(map).get(3)).toString().split("/");
		int count = 0;
		for (int i = 0; i < Services.length; i++) {
			String[] EditServices = Services[i].split(":");
			if (!Services[i].isEmpty()) {
				clickOnNavigationMenu(EditServices[0].trim());
				clickOnFilterBtn();
				String[] searchFilterValues = EditServices[1].split(";");
				if (EditServices[0].equalsIgnoreCase("Internal Services")) {
					if (!searchFilterValues[0].trim().isEmpty()) {
						selectSearchProductName(searchFilterValues[0].trim());
					}
					if (!searchFilterValues[1].trim().isEmpty()) {
						sendTextInSearchProductName(searchFilterValues[1].trim());
					}
					if (!searchFilterValues[2].trim().isEmpty()) {
						selectSearchStatus(searchFilterValues[2].trim());
					}
					clickOnFilterSearchBtn();
					// String[]
					// infoButton=searchFilterValues[0].trim().replaceAll("-",":").split(":");
					clickOnInfoBtn(searchFilterValues[1].trim());
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
						selectSearchStatus(searchFilterValues[3]);
					}
					clickOnFilterSearchBtn();
					clickOnInfoBtn(searchFilterValues[2].trim());
				}
				clickOnEditBtn();
				String[] kycValues = map.get(getMapKeys(map).get(4)).toString().split(",");
				String[] statusValues = map.get(getMapKeys(map).get(5)).toString().split(",");
				String[] surchargeTypes = map.get(getMapKeys(map).get(6)).toString().split("/");
				String[] surchargeValues = map.get(getMapKeys(map).get(7)).toString().split("/");
				String[] cashbackTypes = map.get(getMapKeys(map).get(8)).toString().split("/");
				String[] cashbackValues = map.get(getMapKeys(map).get(9)).toString().split("/");
				selectKycStatus(kycValues[count].trim());
				selectStatus(statusValues[count]);
				String[] surchargeType = surchargeTypes[count].split(":");
				String[] surchargeValue = surchargeValues[count].split(":");
				String[] commissionType = cashbackTypes[count].split(":");
				String[] cashbackValue = cashbackValues[count].trim().split(";");
				for (int j = 0; j < surchargeType.length; j++) {
					By clickSurchargeType = By
							.xpath("(//label[contains(@id,'lblSurchargeType') and normalize-space(text())='"
									+ surchargeType[j].trim() + "'])[" + (j + 1) + "]");
					By sendTextInSurchargeValue = By.xpath("(//*[contains(@id,'SurchargeValue')])[" + (j + 1) + "]");
					clickOnElement(clickSurchargeType);
					sendTextInValue(sendTextInSurchargeValue, surchargeValue[j].trim());
					By drpCommissionType = By.xpath("(//*[contains(@id,'CommissionType')])[" + (j + 1) + "]");
					selectFromDropdown(drpCommissionType, commissionType[j].trim());
					String[] cashbackValue1 = cashbackValue[j].trim().split(":");
					int countVlue = 0;
					if (verifyElement(lblLevel1, false)) {
						By txtlevel1Value = By.xpath("(//*[contains(@id,'Level1')])[" + (j + 1) + "]");
						sendTextInValue(txtlevel1Value, cashbackValue1[countVlue]);
					}
					if (verifyElement(lblLevel2, false)) {
						By txtlevel2Value = By.xpath("(//*[contains(@id,'Level2')])[" + (j + 1) + "]");
						sendTextInValue(txtlevel2Value, cashbackValue1[(countVlue + 1)]);
					}
					if (verifyElement(lblLevel3, false)) {
						By txtlevel3Value = By.xpath("(//*[contains(@id,'Level3')])[" + (j + 1) + "]");
						sendTextInValue(txtlevel3Value, cashbackValue1[(countVlue + 2)]);
					}
				}
				clickOnSaveBtn();
				count++;
			}
		}
	}

	/**
	 * @author kutbuddin.compounder to verify Merchant Matrix edited?
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 21/11/2018
	 * @return true if Merchant Matrix edited successfully
	 */
	public boolean verifyMerchantMatrixEdited(Map<Object, Object> map, List<Object> keys) {
		String[] Services = map.get(getMapKeys(map).get(3)).toString().split("/");
		int count = 0;
		for (int i = 0; i < Services.length; i++) {
			String[] EditServices = Services[i].split(":");
			if (!Services[i].isEmpty()) {
				clickOnNavigationMenu(EditServices[0]);
				clickOnFilterBtn();
				String[] searchFilterValues = EditServices[1].split(";");
				if (EditServices[0].equalsIgnoreCase("Internal Services")) {
					if (!searchFilterValues[0].trim().isEmpty()) {
						selectSearchProductName(searchFilterValues[0].trim());
					}
					if (!searchFilterValues[1].trim().isEmpty()) {
						sendTextInSearchProductName(searchFilterValues[1].trim());
					}
					if (!searchFilterValues[2].trim().isEmpty()) {
						selectSearchStatus(searchFilterValues[2].trim());
					}
					clickOnFilterSearchBtn();
					// String[]
					// infoButton=searchFilterValues[0].trim().replaceAll("-",":").split(":");
					clickOnInfoBtn(searchFilterValues[1].trim());
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
						selectSearchStatus(searchFilterValues[3]);
					}
					clickOnFilterSearchBtn();
					clickOnInfoBtn(searchFilterValues[2].trim());
				}
				String[] kycValues = map.get(getMapKeys(map).get(4)).toString().split(",");
				String[] statusValues = map.get(getMapKeys(map).get(5)).toString().split(",");
				String[] surchargeTypes = map.get(getMapKeys(map).get(6)).toString().split("/");
				String[] surchargeValues = map.get(getMapKeys(map).get(7)).toString().split("/");
				String[] cashbackTypes = map.get(getMapKeys(map).get(8)).toString().split("/");
				String[] cashbackValues = map.get(getMapKeys(map).get(9)).toString().split("/");
				By kycStatus = By
						.xpath("//span[normalize-space(text())='KYC Status :']//following:: div[@class='desc-info' and normalize-space(text()) = '"
								+ kycValues[count].trim() + "']");
				By status = By
						.xpath("//span[normalize-space(text())='Status :']//following:: div[@class='desc-info' and normalize-space(text()) = '"
								+ statusValues[count] + "']");
				if (!verifyElement(kycStatus, false))
					return false;
				if (!verifyElement(status, false))
					return false;
				String[] commissionType = cashbackTypes[count].split(":");
				String[] cashbackValue = cashbackValues[count].trim().split(";");
				String[] surchargeType = surchargeTypes[count].split(":");
				String[] surchargeValue = surchargeValues[count].split(":");
				for (int j = 0; j < surchargeType.length; j++) {
					By SurchargeType = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[2]");
					By SurchargeValue = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[3]");
					By commisionType = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[4]");
					if (getUIText(SurchargeType).equalsIgnoreCase(surchargeType[j].trim())) {
						if (!verifyElement(SurchargeType, false))
							return false;
					}
					if (getUIText(SurchargeValue).contentEquals(surchargeValue[j])) {
						if (!verifyElement(SurchargeValue, false))
							return false;
					}
					if (getUIText(commisionType).equalsIgnoreCase(commissionType[j].trim())) {
						if (!verifyElement(commisionType, false))
							return false;
					}
					String[] cashbackValue1 = cashbackValue[j].trim().split(":");
					int countVlue = 0;
					if (verifyElement(lblVerifyLevel1, false)) {
						By txtlevel1Value = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[5]");
						if (getUIText(txtlevel1Value).contentEquals(cashbackValue1[countVlue].trim())) {
							if (!verifyElement(txtlevel1Value, false))
								return false;
						}
					}
					if (verifyElement(lblVerifyLevel2, false)) {
						By txtlevel2Value = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[6]");
						if (getUIText(txtlevel2Value).contentEquals(cashbackValue1[(countVlue + 1)])) {
							if (!verifyElement(txtlevel2Value, false))
								return false;
						}
					}
					if (verifyElement(lblVerifyLevel3, false)) {
						By txtlevel3Value = By.xpath(".//*[@id='view-section']//tr[" + (j + 1) + "]/td[7]");
						if (getUIText(txtlevel3Value).contentEquals(cashbackValue1[(countVlue + 2)])) {
							if (!verifyElement(txtlevel3Value, false))
								return false;
						}
					}
				}
				count++;
			}

		}
		return true;
	}

	/**
	 * @author dishant.doshi to sort merchant matrix
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 20/12/2018
	 */
	public boolean sortMatrix(Map<Object, Object> map, List<Object> mapKeys) {
		if (!map.get(getMapKeys(map).get(0)).toString().isEmpty()) {
			selectTreeName(map.get(getMapKeys(map).get(0)).toString().trim());
			selectTreeLevel(map.get(getMapKeys(map).get(1)).toString().trim());
		}
		selectProfileName(map.get(getMapKeys(map).get(2)).toString().trim());
		clickOnFilterSearchBtn();
		clickOnNavigationMenu(map.get(getMapKeys(map).get(3)).toString());
		List<String> list = addColumnInGrid();
		if(verifyColumnInGrid(list)){
			pagination();
			Map<String, List<String>> getBeforeSortTableData = getTableData(map.get(getMapKeys(map).get(6)).toString());
			clickOnSortBtn(map.get(getMapKeys(map).get(4)).toString(), map.get(getMapKeys(map).get(5)).toString());
			List<String> sortedUIColumnData = getColumnData(map.get(getMapKeys(map).get(4)).toString());
			List<String> sortedUIColumnDataCopy = new ArrayList<>(sortedUIColumnData);
			sortColumn(sortedUIColumnData, map.get(getMapKeys(map).get(5)).toString());
			if(!compareTwoLists(sortedUIColumnData, sortedUIColumnDataCopy))
				return false;
			Map<String, List<String>> getAfterSortTableData = getTableData(map.get(getMapKeys(map).get(6)).toString());
			if(!getBeforeSortTableData.equals(getAfterSortTableData))
				return false;
			reloadCurrentPage();
			return true;
		}else{
			return false;
		}
	}
}
