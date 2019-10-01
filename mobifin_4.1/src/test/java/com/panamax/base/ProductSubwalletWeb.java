package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

public class ProductSubwalletWeb extends Common {
	By txtWalletUniqueCode = By.id("WalletUniqueCode");
	By drpSubwalletType = By.id("WalletType");
	By txtSubwalletName = By.id("Name");
	By txtDescription = By.id("Description");
	By txtSubwallteTag = By.xpath(".//*[@id='Tags_chosen']//input");
	By drpStatus = By.id("IsActive");
	By drpInType = By.id("WalletInService");
	By drpOutType = By.id("WalletOutService");
	By txtInTags = By.id("InTags_chosen");
	By txtOutTags = By.id("OutTags_chosen");
	By addInTags = By.xpath("(//*[normalize-space(text()) = 'Add'])[1]");
	By addOutTags = By.xpath("(//*[normalize-space(text()) = 'Add'])[2]");
	By drpStatusSearch = By.id("cmbIsActive");
	By txtSearchSubwalletName = By.id("txtSubwalletName");
	By btnInSource = By.xpath("//span[normalize-space(text())='In Source']//following-sibling::*");
	By btnOutSource = By.xpath("//span[normalize-space(text())='Out Source']//following-sibling::*");

	/**
	 * @author kutbuddin.compounder
	 * @param driver
	 *            constructor
	 * @creation date 30/10/2018
	 */
	public ProductSubwalletWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author kutbuddin.compounder select value from Product Subwallet
	 *         serviceMethodName drop down
	 * @param moduleName
	 * @creation date 30/10/2018
	 */
	public void senTextInWalletMethodUniqueCode(String walletUniqueCode) {
		clearAndSendTextInTextBox(txtWalletUniqueCode, walletUniqueCode);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Subwallet
	 *         serviceMethodeType drop down
	 * @param serviceMethodeType
	 * @creation date 30/10/2018
	 */
	public void selectSubWallteType(String subwalletType) {
		selectFromDropdown(drpSubwalletType, subwalletType);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Subwallet subwalletName
	 *         field
	 * @param subwalletName
	 * @creation date 30/10/2018
	 */

	public void sendTextInSubwalletName(String subwalletName) {
		clearAndSendTextInTextBox(txtSubwalletName, subwalletName);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Subwallet description
	 *         field
	 * @param description
	 * @creation date 30/10/2018
	 */

	public void sendTextInDescription(String description) {
		clearAndSendTextInTextBox(txtDescription, description);
	}

	/**
	 * @author kutbuddin.compounder send text in Product Subwallet description
	 *         field
	 * @param description
	 * @creation date 30/10/2018
	 */

	public void sendTextInSubwallteTag(String subwalletTag) {
		clearAndSendTextInTextBox(txtSubwallteTag, subwalletTag);
		sendTextInTextBox(txtSubwallteTag, Keys.ENTER);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Subwallet status
	 *         drop down
	 * @param status
	 * @creation date 30/10/2018
	 */
	public void selectStatus(String status) {
		selectFromDropdown(drpStatus, status);
	}

	/**
	 * @author kutbuddin.compounder send text in Intags
	 * @param walletInTags
	 * @creation date 30/10/2018
	 */
	public void sendTextInWalletInTags(String walletInTags) {
		clearAndSendTextInTextBox(txtInTags, walletInTags);
	}

	/**
	 * @author kutbuddOut.compounder send text Out Outtags
	 * @param walletOutTags
	 * @creation date 30/10/2018
	 */
	public void sendTextInWalletOutTags(String walletOutTags) {
		clearAndSendTextInTextBox(txtOutTags, walletOutTags);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Subwallet In Type
	 *         drop down
	 * @param serviceMethodeType
	 * @creation date 30/10/2018
	 */
	public void selectSubWalltetIntype(String subwalletInType) {
		selectFromDropdown(drpInType, subwalletInType);
	}

	/**
	 * @author kutbuddOut.compounder select value from Product Subwallet Out
	 *         Type drop down
	 * @param serviceMethodeType
	 * @creation date 30/10/2018
	 */
	public void selectSubWalltetOuttype(String subwalletOutType) {
		selectFromDropdown(drpOutType, subwalletOutType);
	}

	/**
	 * @author kutbuddin.compounder to click on clickOnIntags Input Text
	 * @creation date 16/10/2018
	 */
	public void clickOnIntags() {
		clickOnElement(txtInTags);
	}

	/**
	 * @author kutbuddin.compounder to click on clickOnOuttags Input Text
	 * @creation date 16/10/2018
	 */
	public void clickOnOuttags() {
		clickOnElement(txtOutTags);
	}

	/**
	 * @author kutbuddin.compounder to click on clickOnInternalTags Input Text
	 * @creation date 16/10/2018
	 */
	public void clickOnInternalTags(By element) {
		clickOnElement(element);
	}

	/**
	 * @author kutbuddin.compounder to click on click On Add BtnIn Tag
	 * @creation date 16/10/2018
	 */
	public void clickOnAddBtnInTag() {
		clickOnElement(addInTags);
	}

	/**
	 * @author kutbuddin.compounder to click on click On Add BtnOut Tag
	 * @creation date 16/10/2018
	 */
	public void clickOnAddBtnOutTag() {
		clickOnElement(addOutTags);
	}

	/**
	 * @author kutbuddin.compounder to click on click On SubwalletTag
	 * @creation date 16/10/2018
	 */
	public void clickSubwalletTag() {
		clickOnElement(txtSubwallteTag);
	}

	/**
	 * @author kutbuddin.compounder to click on clickOnInSource Input Text
	 * @creation date 16/10/2018
	 */
	public void clickOnInSource() {
		clickOnElement(btnInSource);
	}

	/**
	 * @author kutbuddin.compounder to click on clickOnOutSource Input Text
	 * @creation date 16/10/2018
	 */
	public void clickOnOutSource() {
		clickOnElement(btnOutSource);
	}

	/**
	 * @author kutbuddin.compounder common actions for navigation menu
	 * @param navigationMenu
	 * @creation date 31/10/2018
	 */
	public void clickOnNavigationMenu(String navigationMenu) {
		clickOnElement(By.xpath("(//*[normalize-space(text()) = '" + navigationMenu.trim() + "'])[1]"));
	}

	/**
	 * @author kutbuddin.compounder send text in Product Internal productCode
	 *         from dropdown
	 * @param productCode
	 * @creation date 30/10/2018
	 */
	public void sendToSubwalletNameTextInFilterSearch(String toName) {
		clearAndSendTextInTextBox(txtSearchSubwalletName, toName);
	}

	/**
	 * @author kutbuddin.compounder select value from Product Internal status
	 *         drop down
	 * @param statusSearch
	 * @creation date 30/10/2018
	 */
	public void selectStatusInFilterSearch(String statusSearch) {
		selectFromDropdown(drpStatusSearch, statusSearch);
	}

	/**
	 * @author kutbuddin.compounder
	 * @param str1,str2
	 * @creation date 03/12/2018
	 */
	public void filterSearch(String str1, String str2) {
		commonFilterSearch();
		sendToSubwalletNameTextInFilterSearch(str1);
		selectStatusInFilterSearch(str2);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author kutbuddin.compounder get size of Name
	 * @creation date 18/01/2019
	 */
    public int getSizeOfSubWalletName() {
    	List<String> ColumnData = getColumnData("Name");
		int length=ColumnData.size();
		return length;
    }
	/**
	 * @author kutbuddin.compounder to add Product Subwallet
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public void addProductSubwallet(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInSubwalletName(map.get(mapKeys.get(0)).toString());
		senTextInWalletMethodUniqueCode(map.get(mapKeys.get(1)).toString());
		sendTextInDescription(map.get(mapKeys.get(2)).toString());
		selectStatus(map.get(mapKeys.get(3)).toString());
		selectSubWallteType(map.get(mapKeys.get(4)).toString());
		String[] subwalletTags = map.get(mapKeys.get(5)).toString().trim().split(",");
		for (int i = 0; i < subwalletTags.length; i++) {
			clickSubwalletTag();
			sendTextInSubwallteTag(subwalletTags[i].trim());
		}
		clickOnNextBtn();
		if (verifyToolTip()) {
			clickOnCancelBtn();
		} else {

			if (!map.get(mapKeys.get(6)).toString().isEmpty()) {
				String[] inTypes = map.get(mapKeys.get(6)).toString().trim().split(",");
				//String[] intags = map.get(mapKeys.get(7)).toString().trim().split(",");
				for (int i = 0; i < inTypes.length; i++) {
					selectSubWalltetIntype(inTypes[i]);
					/*String[] intags1 = intags[i].split(":");
					for (int j = 0; j < intags1.length; j++) {
						clickOnIntags();
						By txtIntags = By
								.xpath("//*[@class='chosen-drop']//*[normalize-space(text())='" + intags1[j] + "']");
						clickOnInternalTags(txtIntags);

					}*/
					clickOnAddBtnInTag();
				}
				String[] OutTypes = map.get(mapKeys.get(8)).toString().trim().split(",");
				//String[] outtags = map.get(mapKeys.get(9)).toString().trim().split(",");
				for (int i = 0; i < OutTypes.length; i++) {
					selectSubWalltetOuttype(OutTypes[i]);
					/*String[] outtags1 = outtags[i].split(":");
					for (int j = 0; j < outtags1.length; j++) {
						clickOnOuttags();
						By txtIntags = By
								.xpath("//*[@class='chosen-drop']//*[normalize-space(text())='" + outtags1[j] + "']");
						clickOnInternalTags(txtIntags);

					}*/
					clickOnAddBtnOutTag();
				}
				clickOnNextBtn();
			} else {
				clickOnNextBtn();
			}
			clickOnSaveBtn();
		}
	}

	/**
	 * @author kutbuddin.compounder to Edit Product Subwallet
	 * @param map
	 *            - excel values
	 * @param mapkeys
	 *            - excel header
	 * @creation date 30/10/2018
	 */
	public void editProductSubwallet(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(3)).toString());
		clickOnInfoBtn(map.get(mapKeys.get(0)).toString());
		clickOnEditBtn();
		String[] NavigationMenu = map.get(mapKeys.get(10)).toString().trim().split(",");
		sendTextInDescription(map.get(mapKeys.get(2)).toString());
		selectStatus(map.get(mapKeys.get(11)).toString());
		String[] subwalletTags = map.get(mapKeys.get(5)).toString().trim().split(",");
		for (int i = 0; i < subwalletTags.length; i++) {
			clickSubwalletTag();
			sendTextInSubwallteTag(subwalletTags[i]);
		}
		if (verifyToolTip()) {
			clickOnCancelBtn();
		} else {
			if (!map.get(mapKeys.get(6)).toString().isEmpty()) {
				clickOnNavigationMenu(NavigationMenu[1]);
				String[] inTypes = map.get(mapKeys.get(6)).toString().trim().split(",");
				String[] intags = map.get(mapKeys.get(7)).toString().trim().split(",");
				for (int i = 0; i < inTypes.length; i++) {
					selectSubWalltetIntype(inTypes[i]);
					String[] intags1 = intags[i].split(":");
					for (int j = 0; j < intags1.length; j++) {
						clickOnIntags();
						By txtIntags = By
								.xpath("//*[@class='chosen-drop']//*[normalize-space(text())='" + intags1[j] + "']");
						clickOnInternalTags(txtIntags);
					}
					clickOnAddBtnInTag();
				}
				String[] OutTypes = map.get(mapKeys.get(8)).toString().trim().split(",");
				String[] outtags = map.get(mapKeys.get(9)).toString().trim().split(",");
				for (int i = 0; i < OutTypes.length; i++) {
					selectSubWalltetOuttype(OutTypes[i]);
					String[] outtags1 = outtags[i].split(":");
					for (int j = 0; j < outtags1.length; j++) {
						clickOnOuttags();
						By txtIntags = By
								.xpath("//*[@class='chosen-drop']//*[normalize-space(text())='" + outtags1[j] + "']");
						clickOnInternalTags(txtIntags);
					}
					clickOnAddBtnOutTag();
				}
			}
			clickOnNavigationMenu(NavigationMenu[2]);
			clickOnSaveBtn();
		}
	}

	/**
	 * @author kutbuddin.compounder to verify Product Subwallet added?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 30/10/2018
	 * @return true if Product Subwallet added successfully
	 */
	public boolean verifyProductSubwalletAdded(Map<Object, Object> map, List<Object> keys) {
		By subwalletName = By
				.xpath("//label[normalize-space(text())='Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(0)).toString() + "']");
		By walletUniqueCode = By
				.xpath("//label[normalize-space(text())='Wallet Unique Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(1)).toString() + "']");
		By discription = By
				.xpath("//label[normalize-space(text())='Description']//following-sibling :: div[contains(text(),'"
						+ map.get(keys.get(2)).toString() + "')]");
		By type = By
				.xpath("//label[normalize-space(text())='Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(4)).toString() + "']");
		By Status = By
				.xpath("//label[normalize-space(text())='Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(3)).toString() + "']");
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(subwalletName, false))
				return false;
			if (!verifyElement(walletUniqueCode, false))
				return false;
			if (!verifyElement(discription, false))
				return false;
			if (!verifyElement(type, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			/*if (!map.get(keys.get(6)).toString().isEmpty()) {
				String[] inTypes = map.get(keys.get(6)).toString().trim().split(",");
				String[] intags = map.get(keys.get(7)).toString().trim().split(",");
				clickOnInSource();
				for (int i = 0; i < inTypes.length; i++) {
					String[] intags1 = intags[i].split(":");
					for (int j = 0; j < intags1.length; j++) {
						By txtIntags = By.xpath("//td[normalize-space(text())='" + inTypes[i]
								+ "']//following :: *[normalize-space(text()) = '" + intags1[j] + "'][1]");
						if (!verifyElement(txtIntags, false))
							return false;
					}
				}
				String[] OutTypes = map.get(keys.get(8)).toString().trim().split(",");
				String[] outtags = map.get(keys.get(9)).toString().trim().split(",");
				clickOnOutSource();
				for (int i = 0; i < OutTypes.length; i++) {
					String[] outtags1 = outtags[i].split(":");
					for (int j = 0; j < outtags1.length; j++) {
						By txtOuttags = By.xpath("//td[normalize-space(text())='" + OutTypes[i]
								+ "']//following :: *[normalize-space(text()) = '" + outtags1[j] + "'][1]");
						if (!verifyElement(txtOuttags, false))
							return false;
					}
				}
			}*/
			return true;
		} else
			return false;

	}

	/**
	 * @author kutbuddin.compounder to verify Product Subwallet edited?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 30/10/2018
	 * @return true if Product Subwallet edited successfully
	 */
	public boolean verifyProductSubwalletEdited(Map<Object, Object> map, List<Object> keys) {
		By subwalletName = By
				.xpath("//label[normalize-space(text())='Name']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(0)).toString() + "']");
		By walletUniqueCode = By
				.xpath("//label[normalize-space(text())='Wallet Unique Code']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(1)).toString() + "']");
		By discription = By
				.xpath("//label[normalize-space(text())='Description']//following-sibling :: div[contains(text(),'"
						+ map.get(keys.get(2)).toString() + "')]");
		By type = By
				.xpath("//label[normalize-space(text())='Type']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(4)).toString() + "']");
		By Status = By
				.xpath("//label[normalize-space(text())='Status']//following-sibling :: div[normalize-space(text()) = '"
						+ map.get(keys.get(3)).toString() + "']");
		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(11)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if (!verifyElement(subwalletName, false))
				return false;
			if (!verifyElement(walletUniqueCode, false))
				return false;
			if (!verifyElement(discription, false))
				return false;
			if (!verifyElement(type, false))
				return false;
			if (!verifyElement(Status, false))
				return false;
			if (!map.get(keys.get(6)).toString().isEmpty()) {
				String[] inTypes = map.get(keys.get(6)).toString().trim().split(",");
				String[] intags = map.get(keys.get(7)).toString().trim().split(",");
				clickOnInSource();
				for (int i = 0; i < inTypes.length; i++) {
					String[] intags1 = intags[i].split(":");
					for (int j = 0; j < intags1.length; j++) {
						By txtIntags = By.xpath("//td[normalize-space(text())='" + inTypes[i]
								+ "']//following :: *[normalize-space(text()) = '" + intags1[j] + "'][1]");
						if (!verifyElement(txtIntags, false))
							return false;
					}
				}
				String[] OutTypes = map.get(keys.get(8)).toString().trim().split(",");
				String[] outtags = map.get(keys.get(9)).toString().trim().split(",");
				clickOnOutSource();
				for (int i = 0; i < OutTypes.length; i++) {
					String[] outtags1 = outtags[i].split(":");
					for (int j = 0; j < outtags1.length; j++) {
						By txtOuttags = By.xpath("//td[normalize-space(text())='" + OutTypes[i]
								+ "']//following :: *[normalize-space(text()) = '" + outtags1[j] + "'][1]");
						if (!verifyElement(txtOuttags, false))
							return false;
					}
				}
			}
			return true;
		} else
			return false;
	}
	/**
	 * @author Kutbuddin.compounder to verify Product Subwallet deleted?
	 * @param map
	 *            - excel values
	 * @param mapKeys
	 *            - excel header
	 * @creation date 30/10/2018
	 * @return true if Product Subwallet deleted successfully
	 *//*
		 * public void deleteProductSubwallet(Map<Object, Object> map,
		 * List<Object> mapKeys) { filterSearch();
		 * selectServiceTypeInFilterSearch(map.get(mapKeys.get(0)).toString());
		 * String[]
		 * Services=map.get(mapKeys.get(1)).toString().trim().split(" ");
		 * selectInServiceNameInFilterSearch(map.get(mapKeys.get(1)).toString())
		 * ; sendFromNameTextInFilterSearch(Services[0]);
		 * sendToNameTextInFilterSearch(Services[2]);
		 * selectStatusInFilterSearch(map.get(mapKeys.get(3)).toString());
		 * clickOnFilterSearchBtn();
		 * if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).
		 * get(1)).toString()+"'])[1]"),false)){
		 * clickOnInfoBtn(map.get(getMapKeys(map).get(1)).toString()); delete();
		 * }else{ String string = "Product Subwallet already deleted";
		 * log("</br><b style='color:#02563d'>"+string+"</b>"); } } public
		 * boolean verifyProductSubwalletrDeleted(Map<Object, Object> map,
		 * List<Object> mapKeys) { // TODO Auto-generated method stub
		 * filterSearch();
		 * selectServiceTypeInFilterSearch(map.get(mapKeys.get(0)).toString());
		 * String[]
		 * Services=map.get(mapKeys.get(1)).toString().trim().split(" ");
		 * selectInServiceNameInFilterSearch(map.get(mapKeys.get(1)).toString())
		 * ; sendFromNameTextInFilterSearch(Services[0]);
		 * sendToNameTextInFilterSearch(Services[2]);
		 * selectStatusInFilterSearch(map.get(mapKeys.get(3)).toString());
		 * clickOnFilterSearchBtn();
		 * if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).
		 * get(1)).toString().trim()+"'])[1]"),false)){ return false; }else {
		 * return true; } }
		 */

	/**
	 * @author dishant.doshi to sort product sub wallet
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 26/12/2018
	 */
	public boolean sortProductSubWallet(Map<Object, Object> map, List<Object> mapKeys) {
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
	/**
	 * @author kutbuddin.compounder
	 *  to verify Product Subwallet log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 21/12/2018
	 * @return true if Product Subwallet  Log successfully Verified
	 */
	public boolean verifySubwalletLog(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(getMapKeys(map).get(0)).toString(),map.get(getMapKeys(map).get(11)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false))
		{
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}
}
