package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi
 * Actions of Settings - User Management - SMS Account
 * @creation date 29/10/2018
 */
public class SettingsAlertSMSAccountWeb extends Common {
	By txtSMSAccountName = By.id("SMSAccountName");
	By txtContext = By.id("Context");
	By txtSMSLoginID = By.id("SMSLoginID");
	By txtSMSPassword = By.id("SMSKey");
	By txtRetryAttempt = By.id("RetryAttempt");
	By drpStatus = By.id("IsActive");
	By txtSMSAccountNameSearch = By.id("txtSMSAccountName");
	By txtContextSearch = By.id("txtContext");
	By txtSMSLoginIDSearch = By.id("txtSMSLoginID");
	By drpStatusSearch = By.id("cmbIsActive");
	
	/**
	 * @author dishant.doshi
	 * @param driver constructor
	 * @creation date 29/10/2018
	 */
	public SettingsAlertSMSAccountWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2, String str3, String str4){
		commonFilterSearch();
		sendTextInSMSAccountInSearch(str1);
		sendTextInSMSContextInSearch(str2);
		sendTextInSMSLoginIDInSearch(str3);
		selectTextInStatusInSearch(str4);
		clickOnFilterSearchBtn();
	}
	/**
	 * @author dishant.doshi
	 * to send text in sms account
	 * @param smsAccount
	 * @creation date 29/10/2018
	 */
	public void sendTextInSMSAccount(String smsAccount){
		clearAndSendTextInTextBox(txtSMSAccountName, smsAccount);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in sms context
	 * @param context
	 * @creation date 29/10/2018
	 */
	public void sendTextInSMSContext(String context){
		clearAndSendTextInTextBox(txtContext, context);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in sms login id
	 * @param loginId
	 * @creation date 29/10/2018
	 */
	public void sendTextInSMSLoginID(String loginId){
		sendTextWithRemoveReadOnlyProperty(loginId,txtSMSLoginID);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in sms password
	 * @param password
	 * @creation date 29/10/2018
	 */
	public void sendTextInSMSPassword(String password){
		sendTextWithRemoveReadOnlyProperty(password, txtSMSPassword);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in retry attempt
	 * @param retryAttempt
	 * @creation date 29/10/2018
	 */
	public void sendTextInRetryAttempt(String retryAttempt){
		clearAndSendTextInTextBox(txtRetryAttempt, retryAttempt);
	}
	
	/**
	 * @author dishant.doshi
	 * to select text in status
	 * @param Status
	 * @creation date 29/10/2018
	 */
	public void selectTextInStatus(String Status){
		selectFromDropdown(drpStatus, Status);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in sms account in filter search
	 * @param smsAccount
	 * @creation date 29/10/2018
	 */
	public void sendTextInSMSAccountInSearch(String smsAccount){
		clearAndSendTextInTextBox(txtSMSAccountNameSearch, smsAccount);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in sms context in filter search
	 * @param context
	 * @creation date 29/10/2018
	 */
	public void sendTextInSMSContextInSearch(String context){
		clearAndSendTextInTextBox(txtContextSearch, context);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in sms login id in filter search
	 * @param loginId
	 * @creation date 29/10/2018
	 */
	public void sendTextInSMSLoginIDInSearch(String loginId){
		clearAndSendTextInTextBox(txtSMSLoginIDSearch, loginId);
	}
	
	/**
	 * @author dishant.doshi
	 * to select text in status in filter search
	 * @param Status
	 * @creation date 29/10/2018
	 */
	public void selectTextInStatusInSearch(String Status){
		selectFromDropdown(drpStatusSearch, Status);
	}
	
	/**
	 * @author dishant.doshi
	 * to add sms account
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 29/10/2018
	 */
	public void addSMSAccount(Map<Object, Object> map, List<Object> mapKeys) {
		clickOnAddBtn();
		sendTextInSMSAccount(map.get(mapKeys.get(0)).toString());
		sendTextInSMSContext(map.get(mapKeys.get(1)).toString());
		sendTextInSMSLoginID(map.get(mapKeys.get(2)).toString());
		sendTextInSMSPassword(map.get(mapKeys.get(3)).toString());
		sendTextInRetryAttempt(map.get(mapKeys.get(4)).toString());
		selectTextInStatus(map.get(mapKeys.get(5)).toString());
		clickOnSaveBtn();
	}

	/**
	 * @author dishant.doshi
	 * to verify sms account added?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 29/10/2018
	 * @return true if sms account added successfully 
	 */
	public boolean verifySMSAccountAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By smsAccountName = By.xpath("//label[normalize-space(text()) = 'SMS Account Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(0)).toString().trim()+"']");
		By smsContext = By.xpath("//label[normalize-space(text()) = 'SMS Context']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(1)).toString().trim()+"']");
		By smsLoginID = By.xpath("//label[normalize-space(text()) = 'SMS Login ID']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(2)).toString().trim()+"']");
		By retryAttempt = By.xpath("//label[normalize-space(text()) = 'Retry Attempt']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(4)).toString().trim()+"']");
		By status = By.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(5)).toString().trim()+"']");
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(5)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if(!verifyElement(smsAccountName, false))
				return false;
			if(!verifyElement(smsContext, false))
				return false;
			if(!verifyElement(smsLoginID, false))
				return false;
			if(!verifyElement(retryAttempt, false))
				return false;
			if(!verifyElement(status, false))
				return false;
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * @author dishant.doshi
	 * to edit sms account
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 30/10/2018
	 */
	public void editSMSAccount(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(5)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			sendTextInSMSPassword(map.get(getMapKeys(map).get(3)).toString());
			sendTextInRetryAttempt(map.get(getMapKeys(map).get(4)).toString());
			clickOnSaveBtn();
		}
	}

	/**
	 * @author dishant.doshi
	 * to verify sms account added?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 29/10/2018
	 * @return true if sms account added successfully 
	 */
	public boolean verifySMSAccountEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By smsAccountName = By.xpath("//label[normalize-space(text()) = 'SMS Account Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(0)).toString().trim()+"']");
		By smsContext = By.xpath("//label[normalize-space(text()) = 'SMS Context']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(1)).toString().trim()+"']");
		By smsLoginID = By.xpath("//label[normalize-space(text()) = 'SMS Login ID']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(2)).toString().trim()+"']");
		By retryAttempt = By.xpath("//label[normalize-space(text()) = 'Retry Attempt']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(4)).toString().trim()+"']");
		By status = By.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(5)).toString().trim()+"']");
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(5)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if(!verifyElement(smsAccountName, false))
				return false;
			if(!verifyElement(smsContext, false))
				return false;
			if(!verifyElement(smsLoginID, false))
				return false;
			if(!verifyElement(retryAttempt, false))
				return false;
			if(!verifyElement(status, false))
				return false;
			return true;
		}else{
			return false;
		}
	}

	public boolean deleteSMSAccount(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(3)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		}else{
			String string = "SMS Account already deleted";
			log("</br><b style='color:#02563d'>"+string+"</b>");
		}
		return true;
	}

	public boolean verifySMSAccountDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if(verifyFilterBtn()){
			filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(3)).toString());
			return verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false);
		}else{
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify sms account  log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if sms account Log successfully Verified
	 */
	public boolean verifySMSAccountEditedLogd(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(mapKeys.get(0)).toString(), map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(5)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnLogBtn();
			return verifyLogPagination();
		}
		else 
		{
			return false;
		}
	}

	/**
	 * @author dishant.doshi to sort sms account
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortSMSAccount(Map<Object, Object> map, List<Object> mapKeys) {
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
