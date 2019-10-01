package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;
import com.panamax.init.ConstantsFile;

public class AgentTreeWeb extends Common {
	By txtTreeName = By.id("TreeName");
	By drpTreeLevel = By.id("TreeLevel");
	By chkDailyBillingType = By.xpath(".//*[text()='Daily']");
	By drpBillingDay = By.id("BillingInterval");
	By drpTreestatus = By.id("IsActive");
	By selectInteroperability = By.xpath(".//a[contains(.,'Interoperability')]");
	By selectStakeHolder = By.id("stakeholders-tokenfield");
	By selectStakeHolderemail = By.id("stakeholders-tokenfield");
	By txtTreeNameSearch = By.id("txtSearchTreeManagerName");
	By selectTreeLevelSearch = By.id("TreeLevel");
	By selectStatusSearch = By.id("txtSearchIsActive");
	By stakeHolderRemove = By.xpath("//*[@class='token']//a");

	/**
	 * @author shivani.patel
	 * @param driver
	 *            constructor
	 * @creation date 03/10/2018
	 */
	public AgentTreeWeb(WebDriver driver) {
		this.driver = driver;
	}

	/**
	 * @author shivani.patel Send Text in TreeName field
	 * @param TreeName
	 * @creation date 03/10/2018
	 */
	public void sendTextInTreeName(String TreeName) {
		clearAndSendTextInTextBox(txtTreeName, TreeName);
	}

	/**
	 * @author shivani.patel Select TreeLevel from Dropdown
	 * @param treeLevel
	 * @creation date 03/10/2018
	 */
	public void selectTreeLevel(String treeLevel) {
		selectFromDropdown(drpTreeLevel, treeLevel);
	}

	/**
	 * @author shivani.patel Select Commision Disbursement
	 * @param commissionDisbursement
	 * @creation date 03/10/2018
	 */
	public void selectCommissionDisbursement(String commissionDisbursement) {
		clickOnElement(By.xpath(".//*[text()='" + commissionDisbursement + "']"));
	}

	/**
	 * @author shivani.patel Select BillingType
	 * @param billingType
	 * @creation date 03/10/2018
	 */
	public void selectBillingType(String billingType) {
		clickOnElement(By.xpath(".//*[text()='" + billingType + "']"));
	}

	/**
	 * @author shivani.patel Select BillingDay
	 * @param billingDay
	 * @creation date 03/10/2018
	 */
	public void selectBillingDay(String billingDay) {
		selectFromDropdown(drpBillingDay, billingDay);
	}

	/**
	 * @author shivani.patel Select Status
	 * @param status
	 * @creation date 03/10/2018
	 */
	public void selectTreeStatus(String status) {
		selectFromDropdown(drpTreestatus, status);
	}

	/**
	 * @author shivani.patel send Text In TreeNodeName Field
	 * @param treeNodeName
	 * @creation date 03/10/2018
	 */
	public void sendTextInTreeNodeName(By element, String treeNodeName) {
		clearAndSendTextInTextBox(element, treeNodeName);
	}

	/**
	 * @author shivani.patel send Text In Maximun Node Field
	 * @param treeMaximumNode
	 * @creation date 03/10/2018
	 */
	public void sendTextInTreeMaximumNode(By element, String treeMaximumNode) {
		clearAndSendTextInTextBox(element, treeMaximumNode);
	}

	/**
	 * @author shivani.patel send Text In Maximun Assistant Field
	 * @param treeMaximunAssistant
	 * @creation date 03/10/2018
	 */
	public void sendTextInTreeMaximumAssistant(By element, String treeMaximunAssistant) {
		clearAndSendTextInTextBox(element, treeMaximunAssistant);
	}

	/**
	 * @author shivani.patel Select Services
	 * @param interoperability_Service
	 * @creation date 03/10/2018
	 */
	public void selectService(String interoperability_Service) {
		if (interoperability_Service.equalsIgnoreCase(ConstantsFile.DIGITAL_TV))
			interoperability_Service = ConstantsFile.DIGITAL_TV;
		if (interoperability_Service.equalsIgnoreCase(ConstantsFile.PAY_TV_SERVICES))
			interoperability_Service = ConstantsFile.PAY_TV_SERVICES;
		clickOnElement(By.xpath("//*[normalize-space(text()) = '" + interoperability_Service.trim() + "']"));
	}

	/**
	 * @author shivani.patel Select ServicesName
	 * @param ServicesName
	 * @creation date 03/10/2018
	 */
	public void clickOnServiceText(String ServicesName) {
		clickOnElement(By.xpath(".//a[contains(text(),'" + ServicesName + "')]"));
	}

	/**
	 * @author shivani.patel Select StakeHolder
	 * @creation date 03/10/2018
	 */
	public void selectStakeHolder(String stakeholder) {
		removeStakeHolder();
		clearAndSendTextInTextBox(selectStakeHolderemail, stakeholder + Keys.ENTER);
	}

	/**
	 * @author shivani.patel Remove StakeHolder
	 * @creation date 03/10/2018
	 */
	public void removeStakeHolder() {
		if (verifyElement(stakeHolderRemove, false))
			clickOnElement(stakeHolderRemove);
	}

	/**
	 * @author shivani.patel Send Text TreeName in filter
	 * @creation date 04/10/2018
	 */
	public void sendTextInTreeNameInFilterSearch(String treeName) {
		clearAndSendTextInTextBox(txtTreeNameSearch, treeName);
	}

	/**
	 * @author shivani.patel Send Text TreeLevel in filter
	 * @creation date 04/10/2018
	 */
	public void selectInTreeLevelInFilterSearch(String treeLevel) {
		selectFromDropdown(selectTreeLevelSearch, treeLevel);
	}

	/**
	 * @author shivani.patel Send Text status in filter
	 * @creation date 04/10/2018
	 */
	public void selectStatusInFilterSearch(String status) {
		selectFromDropdown(selectStatusSearch, status);
	}

	/**
	 * @author shivani.patel Send Text editField in filter
	 * @creation date 04/10/2018
	 */
	public void clickOnEditedField(String editField) {
		clickOnElement(By.xpath(".//a[normalize-space(text())='" + editField.trim() + "']"));
	}

	/**
	 * @author shivani.patel Use for Send data in filter search Field
	 * @creation date 04/10/2018
	 */
	public void filterSearch(String TreeName, String TreeLevel, String Status) {
		commonFilterSearch();
		sendTextInTreeNameInFilterSearch(TreeName);
		selectInTreeLevelInFilterSearch(TreeLevel);
		selectStatusInFilterSearch(Status);
		clickOnFilterSearchBtn();
	}

	/**
	 * @author shivani.patel Create addTree Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 03/10/2018
	 */
	public void addTree(Map<Object, Object> map, List<Object> keys) {
		clickOnAddBtn();
		sendTextInTreeName(map.get(keys.get(0)).toString());
		selectTreeLevel(map.get(keys.get(1)).toString());
		selectCommissionDisbursement(map.get(keys.get(2)).toString());
		if (verifyElement(chkDailyBillingType)) {
			selectBillingType(map.get(keys.get(3)).toString());
		}
		if (verifyElement(drpBillingDay)) {
			selectBillingDay(map.get(keys.get(4)).toString());
		}
		selectTreeStatus(map.get(keys.get(5)).toString());
		clickOnNextBtn();
		if (verifyToolTip()) {
			clickOnCancelBtn();
			log("Given Tree Already Exits");
		} else {
			String NodeName_id = "TreeNodeName";
			String[] nodeNames = map.get(keys.get(6)).toString().split(",");
			for (int i = 0; i < nodeNames.length; i++) {
				sendTextInTreeNodeName(By.id(NodeName_id + "" + (i + 1)), nodeNames[i].trim());
			}
			if (!map.get(keys.get(7)).toString().equals("")) {
				String MaximumNode_id = "MaxSubNode";
				String[] maximumNode = map.get(keys.get(7)).toString().split(",");
				for (int i = 0; i < maximumNode.length; i++) {
					sendTextInTreeMaximumNode(By.id(MaximumNode_id + "" + (i + 1)), maximumNode[i].trim());
				}
			}
			String MaximumAssistance_id = "MaxAssistant";
			String[] maximumAssistance = map.get(keys.get(8)).toString().split(",");
			for (int i = 0; i < maximumAssistance.length; i++) {
				sendTextInTreeMaximumAssistant(By.id(MaximumAssistance_id + "" + (i + 1)), maximumAssistance[i].trim());
			}
			clickOnNextBtn();
			String[] serviceName = map.get(keys.get(9)).toString().split("/");
			for (int i = 0; i < serviceName.length; i++) {
				String[] service = serviceName[i].toString().split(":");
				clickOnServiceText(service[0].trim());
				String[] name = service[1].toString().split(",");
				for (int y = 0; y < name.length; y++) {
					selectService(setFirstCharInCaps(name[y].trim().toLowerCase(), true));
				}
			}
			clickOnNextBtn();
			selectStakeHolder(map.get(keys.get(10)).toString());
			clickOnSaveBtn();
		}
	}

	/**
	 * @author shivani.patel Create editTree Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 04/10/2018
	 */
	public void editTree(Map<Object, Object> map, List<Object> keys) {

		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			String[] editfield = map.get(keys.get(2)).toString().split(",");
			clickOnEditedField(editfield[0].trim());
			selectTreeStatus(map.get(keys.get(3)).toString());
			clickOnEditedField(editfield[1].trim());
			String NodeName_id = "TreeNodeName";
			String[] nodeNames = map.get(keys.get(4)).toString().split(",");
			for (int i = 0; i < nodeNames.length; i++) {
				sendTextInTreeNodeName(By.id(NodeName_id + "" + (i + 1)), nodeNames[i].trim());
			}
			if (!map.get(keys.get(5)).toString().equals("")) {
				String MaximumNode_id = "MaxSubNode";
				String[] maximumNode = map.get(keys.get(5)).toString().split(",");
				for (int i = 0; i < maximumNode.length; i++) {
					sendTextInTreeMaximumNode(By.id(MaximumNode_id + "" + (i + 1)), maximumNode[i].trim());
				}
			}
			String MaximumAssistance_id = "MaxAssistant";
			String[] maximumAssistance = map.get(keys.get(6)).toString().split(",");
			for (int i = 0; i < maximumAssistance.length; i++) {
				sendTextInTreeMaximumAssistant(By.id(MaximumAssistance_id + "" + (i + 1)), maximumAssistance[i].trim());
			}
			clickOnEditedField(editfield[2]);
			String[] serviceName = map.get(keys.get(7)).toString().split("/");
			for (int i = 0; i < serviceName.length; i++) {
				String[] service = serviceName[i].toString().split(":");
				clickOnServiceText(service[0].trim());
				String[] name = service[1].toString().split(",");
				for (int y = 0; y < name.length; y++) {
					selectService(setFirstCharInCaps(name[y].trim().toLowerCase(), true));
				}
			}
			clickOnEditedField(editfield[3].trim());
			selectStakeHolder(map.get(keys.get(8)).toString());
			clickOnSaveBtn();
		} else {
			verifyFalse(true);
		}
	}

	/**
	 * @author shivani.patel Create VerifyTreeAdd Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 04/10/2018
	 * @return true if AgentTree add successfully Verified
	 */
	public boolean verifyTreeAdded(Map<Object, Object> map, List<Object> keys) {

		By treeName = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.TREE_NAME
				+ "']]//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(0)).toString() + "']");
		By treeLevel = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.TREE_LEVEL
				+ "']]//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(1)).toString() + "']");
		By commissionDisbursement = By.xpath("//label[text()[normalize-space() = '"
				+ ConstantsFile.COMMISSION_DISBURSEMENT + "']]//following-sibling :: div[normalize-space(text()) = '"
				+ map.get(keys.get(2)).toString() + "']");
		By status = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.STATUS
				+ "']]//following-sibling :: div[text()[normalize-space() = '" + map.get(keys.get(5)).toString()
				+ "']]");
		By stakeholder = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.STAKEHOLDER_LIST
				+ "']]//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(10)).toString()
				+ "']");
		By Billingtype = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.BILLING_TYPE
				+ "']]//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(3)).toString() + "']");
		By BillingDay = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.BILLING_DAY
				+ "']]//following-sibling :: div[normalize-space(text()) = '" + map.get(keys.get(4)).toString() + "']");

		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(5)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			String[] nodeName = map.get(getMapKeys(map).get(6)).toString().split(",");
			for (int i = 0; i < nodeName.length; i++) {
				if (!verifyElement(By
						.xpath("(.//*[@id='frm']//*[normalize-space(text())='" + nodeName[i].trim() + "'])[last()]"))) {
					return false;
				}
			}
			if (!map.get(keys.get(7)).toString().equals("")) {
				String[] maximunNode = map.get(getMapKeys(map).get(7)).toString().split(",");
				for (int i = 0; i < maximunNode.length; i++) {
					if (!verifyElement(By.xpath("(.//*[@id='frm']//td[text()='" + nodeName[i].trim()
							+ "']//following-sibling :: td[text()='" + maximunNode[i].trim() + "'])"))) {
						return false;
					}
				}
			}
			String[] maximumAssistance = map.get(keys.get(8)).toString().split(",");
			for (int i = 0; i < maximumAssistance.length; i++) {
				if (!verifyElement(By.xpath(".//*[@id='frm']//td[text()='" + nodeName[i].trim()
						+ "']//following-sibling :: td//following-sibling ::td[text()='" + maximumAssistance[i].trim()
						+ "']"))) {
					return false;
				}
			}
			String[] serviceName = map.get(keys.get(9)).toString().split("/");
			for (int i = 0; i < serviceName.length; i++) {
				String[] service = serviceName[i].toString().split(":");
				String[] name = service[1].toString().split(",");
				for (int y = 0; y < name.length; y++) {
					String servicename = setFirstCharInCaps(name[y].trim(), true);
					if (servicename.equalsIgnoreCase(ConstantsFile.DIGITAL_TV))
						servicename = ConstantsFile.DIGITAL_TV;
					if (servicename.equalsIgnoreCase(ConstantsFile.PAY_TV_SERVICES))
						servicename = ConstantsFile.PAY_TV_SERVICES;
					By serviceElement = By.xpath("//*[normalize-space(text())='" + service[0].trim()
							+ "']//preceding-sibling::td[normalize-space(text())='" + servicename + "']");
					if (!verifyElement(serviceElement, false))
						return false;
				}
			}
			if (!verifyElement(treeName, false)) {
				return false;
			}
			if (!verifyElement(treeLevel, false)) {
				return false;
			}
			if (!verifyElement(commissionDisbursement, false)) {
				return false;
			}
			if (map.get(keys.get(3)).toString().length() != 0) {
				if (!verifyElement(Billingtype, false))
					return false;
			}
			if (map.get(keys.get(4)).toString().length() != 0) {
				if (!verifyElement(BillingDay, false))
					return false;
			}
			if (!verifyElement(status, false)) {
				return false;
			}
			if (!verifyElement(status, false)) {
				return false;
			}
			if (!verifyElement(stakeholder, false)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel Create VerifyTreeEdit Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 05/10/2018
	 * @return true if AgentTree edit successfully Verified
	 */

	public boolean verifyTreeEdited(Map<Object, Object> map, List<Object> keys) {
		By treeName = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.TREE_NAME
				+ "']]//following-sibling :: div[text()[normalize-space() = '" + map.get(keys.get(0)).toString().trim()
				+ "']]");
		By treeLevel = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.TREE_LEVEL
				+ "']]//following-sibling :: div[text()[normalize-space() = '" + map.get(keys.get(1)).toString().trim()
				+ "']]");
		By status = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.STATUS
				+ "']]//following-sibling :: div[text()[normalize-space() = '" + map.get(keys.get(3)).toString().trim()
				+ "']]");
		By stakeholder = By.xpath("//label[text()[normalize-space() = '" + ConstantsFile.STAKEHOLDER_LIST
				+ "']]//following-sibling :: div[text()[normalize-space() = '" + map.get(keys.get(8)).toString().trim()
				+ "']]");

		filterSearch(map.get(keys.get(0)).toString(), map.get(keys.get(1)).toString(), map.get(keys.get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());

			String[] nodename = map.get(getMapKeys(map).get(4)).toString().split(",");
			for (int i = 0; i < nodename.length; i++) {
				if (!verifyElement(By.xpath("(.//*[@id='frm']//td[text()='" + nodename[i].trim() + "'])[last()]"))) {
					return false;
				}
			}
			if (!map.get(keys.get(5)).toString().equals("")) {
				String[] maximunNode = map.get(getMapKeys(map).get(5)).toString().split(",");
				for (int i = 0; i < maximunNode.length; i++) {
					if (!verifyElement(By.xpath("(.//*[@id='frm']//td[text()='" + nodename[i].trim()
							+ "']//following-sibling :: td[text()='" + maximunNode[i].trim() + "'])"))) {
						return false;
					}
				}
			}
			String[] maximumAssistance = map.get(keys.get(6)).toString().split(",");
			for (int i = 0; i < maximumAssistance.length; i++) {
				if (!verifyElement(By.xpath(".//*[@id='frm']//td[text()='" + nodename[i].trim()
						+ "']//following-sibling :: td//following-sibling ::td[text()='" + maximumAssistance[i].trim()
						+ "']"))) {
					return false;
				}
			}
			String[] serviceName = map.get(keys.get(7)).toString().split("/");
			for (int i = 0; i < serviceName.length; i++) {
				String[] service = serviceName[i].toString().split(":");

				String[] name = service[1].toString().split(",");
				for (int y = 0; y < name.length; y++) {
					String servicename = setFirstCharInCaps(name[y].trim(), true);
					if (servicename.equalsIgnoreCase(ConstantsFile.DIGITAL_TV))
						servicename = ConstantsFile.DIGITAL_TV;
					if (servicename.equalsIgnoreCase(ConstantsFile.PAY_TV_SERVICES))
						servicename = ConstantsFile.PAY_TV_SERVICES;
					By serviceElement = By.xpath("//*[normalize-space(text())='" + service[0].trim()
							+ "']//preceding-sibling::td[normalize-space(text())='" + servicename + "']");
					if (!verifyElement(serviceElement, false))
						return false;
				}
			}
			if (!verifyElement(treeName, false)) {
				return false;
			}
			if (!verifyElement(treeLevel, false)) {
				return false;
			}
			if (!verifyElement(status, false)) {
				return false;
			}
			if (!verifyElement(status, false)) {
				return false;
			}
			if (!verifyElement(stakeholder, false)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @author shivani.patel Create DeleteTree Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 05/10/2018
	 */
	public boolean deleteTree(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(2)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		} else {
			String string = "Agent Tree already deleted";
			log("</br><b style='color:#02563d'>" + string + "</b>");
		}
		return false;
	}

	/**
	 * @author shivani.patel Create VerifyTreeEdit Method
	 * @param map
	 *            - excel values use for get value
	 * @param keys
	 *            - excel header use for to identify value
	 * @creation date 05/10/2018
	 * @return true if AgentTree delete successfully Verified
	 */
	public boolean verifyTreeDelete(Map<Object, Object> map, List<Object> mapKeys) {
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
	 * @author kutbuddin.compounder to verify customer Tree log
	 * @param map
	 *            - excel values
	 * @param keys
	 *            - excel header
	 * @creation date 26/12/2018
	 * @return true if AgentTree Log successfully Verified
	 */
	public boolean verifyAgentTreeLog(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(getMapKeys(map).get(0)).toString(), map.get(getMapKeys(map).get(1)).toString(),
				map.get(getMapKeys(map).get(3)).toString());
		if (verifyElement(By.xpath("(//td[text()='" + map.get(getMapKeys(map).get(0)).toString() + "'])[1]"), false)) {
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		} else {
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort agent tree
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @creation date 13/12/2018
	 */
	public boolean sortTree(Map<Object, Object> map, List<Object> mapKeys) {
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
