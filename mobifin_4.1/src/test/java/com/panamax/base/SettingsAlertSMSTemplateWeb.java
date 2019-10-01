package com.panamax.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.panamax.init.Common;

/**
 * @author dishant.doshi
 * Actions of Settings - User Management - SMS Template
 * @creation date 31/10/2018
 */
public class SettingsAlertSMSTemplateWeb extends Common {
	By drpTemplateName = By.id("UserTemplateActiveID");
	By drpFromSMSAccount = By.id("SMSAccountID");
	By drpDynamicVariable = By.id("VariableName");
	By btnAddDynamicVariable = By.id("AddVariable");
	By txtSMSBody = By.xpath("//*[@class='note-editable panel-body']");
	By drpStatus = By.id("IsActive");
	By drpFromSMSAccountSearch = By.id("cmbSMSAccountID");
	By txtTemplateNameSearch = By.id("txtSearchTemplateSmsActiveName");
	
	/**
	 * @author dishant.doshi
	 * @param driver constructor
	 * @creation date 31/10/2018
	 */
	public SettingsAlertSMSTemplateWeb(WebDriver driver) {
		this.driver = driver;
	}

	public void filterSearch(String str1, String str2){
		commonFilterSearch();
		selectTextInFromSMSAccountInSearch(str1);
		sendTextInTemplateNameInSearch(str2);
		clickOnFilterSearchBtn();
	}
	
	/**
	 * @author dishant.doshi
	 * to select text in template name
	 * @param templateName
	 * @creation date 31/10/2018
	 */
	public void selectTextInTemplateName(String templateName){
		selectFromDropdown(drpTemplateName, templateName);
	}

	/**
	 * @author dishant.doshi
	 * to select text in from SMS account
	 * @param fromSMSAccount
	 * @creation date 31/10/2018
	 */
	public void selectTextInFromSMSAccount(String fromSMSAccount){
		selectFromDropdown(drpFromSMSAccount, fromSMSAccount);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in dynamic variable
	 * @param dynamicVariable
	 * @creation date 31/10/2018
	 */
	public void selectTextInDynamicVariable(String dynamicVariable){
		selectFromDropdown(drpDynamicVariable, dynamicVariable);
	}
	
	/**
	 * @author dishant.doshi
	 * to click on add  dynamic variable button
	 * @creation date 31/10/2018
	 */
	public void clickOnAddDynamicVariableButton(){
		clickOnElement(btnAddDynamicVariable);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in body
	 * @param body
	 * @creation date 31/10/2018
	 */
	public void sendTextInSMSTemplateBody(String body){
		removeReadOnlyProperty(txtSMSBody);
		clearTextFromTextBox(txtSMSBody);
		sendTextInTextBox(txtSMSBody, body);
	}
	
	/**
	 * @author dishant.doshi
	 * to select text in status
	 * @param status
	 * @creation date 31/10/2018
	 */
	public void selectTextInStatus(String status){
		selectFromDropdown(drpStatus, status);
	}
	
	/**
	 * @author dishant.doshi
	 * to select text in from SMS account in filter search
	 * @param SMSAccount
	 * @creation date 31/10/2018
	 */
	public void selectTextInFromSMSAccountInSearch(String SMSAccount){
		selectFromDropdown(drpFromSMSAccountSearch, SMSAccount);
	}
	
	/**
	 * @author dishant.doshi
	 * to send text in template name in filter search
	 * @param templateName
	 * @creation date 31/10/2018
	 */
	public void sendTextInTemplateNameInSearch(String templateName){
		clearAndSendTextInTextBox(txtTemplateNameSearch, templateName);
	}
	
	/**
	 * @author dishant.doshi
	 * to add SMS Template
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 */
	public void addSMSTemplate(Map<Object, Object> map, List<Object> mapKeys) {
		commonFilterSearch();
		sendTextInTemplateNameInSearch(map.get(getMapKeys(map).get(0)).toString());
		clickOnFilterSearchBtn();
		if(!verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnAddBtn();
			selectTextInTemplateName(map.get(mapKeys.get(0)).toString());
			selectTextInFromSMSAccount(map.get(mapKeys.get(1)).toString());
			if(!map.get(mapKeys.get(2)).toString().equals("")){
				String[] dynamicVariable = map.get(mapKeys.get(2)).toString().split(",");
				for(int i=0;i<dynamicVariable.length;i++){
					selectTextInDynamicVariable(dynamicVariable[i]);
					clickOnAddDynamicVariableButton();
				}
			}
			sendTextInSMSTemplateBody(map.get(mapKeys.get(3)).toString());
			selectTextInStatus(map.get(mapKeys.get(4)).toString());
			clickOnSaveBtn();
		}
	}

	/**
	 * @author dishant.doshi
	 * to verify SMS Template added?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 * @return true if SMS Template added successfully 
	 */
	public boolean verifySMSTemplateAdded(Map<Object, Object> map, List<Object> mapKeys) {
		By templateName = By.xpath("//label[normalize-space(text()) = 'Template Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(0)).toString().trim()+"']");
		By fromSMSAccount = By.xpath("//label[normalize-space(text()) = 'From SMS Account']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(1)).toString().trim()+"']");
		By status = By.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(4)).toString().trim()+"']");
		
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if(!verifyElement(templateName, false))
				return false;
			if(!verifyElement(fromSMSAccount, false))
				return false;
			String[] strings = StringUtils.substringsBetween(map.get(getMapKeys(map).get(3)).toString(), "{", "}");
			for(int i=0;i<strings.length;i++){
				By SMSBody = By.xpath("//label[normalize-space(text()) = 'SMS Body']//following-sibling :: div[contains(text(),'"+strings[i]+"')]");
				if(!verifyElement(SMSBody, false))
					return false;
			}
			if(!verifyElement(status, false))
				return false;
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * @author dishant.doshi
	 * to edit SMS Template
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 */
	public void editSMSTemplate(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			clickOnEditBtn();
			selectTextInFromSMSAccount(map.get(mapKeys.get(2)).toString());
			if(!map.get(mapKeys.get(3)).toString().equals("")){
				String[] dynamicVariable = map.get(mapKeys.get(3)).toString().split(",");
				for(int i=0;i<dynamicVariable.length;i++){
					selectTextInDynamicVariable(dynamicVariable[i]);
					clickOnAddDynamicVariableButton();
				}
			}
			sendTextInSMSTemplateBody(map.get(mapKeys.get(4)).toString());
			selectTextInStatus(map.get(mapKeys.get(5)).toString());
			clickOnSaveBtn();
		}else{
			verifyFalse(true);
		}
	}

	/**
	 * @author dishant.doshi
	 * to verify SMS Template added?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 * @return true if SMS Template added successfully 
	 */
	public boolean verifySMSTemplateEdited(Map<Object, Object> map, List<Object> mapKeys) {
		By templateName = By.xpath("//label[normalize-space(text()) = 'Template Name']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(0)).toString().trim()+"']");
		By fromSMSAccount = By.xpath("//label[normalize-space(text()) = 'From SMS Account']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(2)).toString().trim()+"']");
		By status = By.xpath("//label[normalize-space(text()) = 'Status']//following-sibling :: div[normalize-space(text()) = '"+map.get(mapKeys.get(5)).toString().trim()+"']");
		
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			if(!verifyElement(templateName, false))
				return false;
			if(!verifyElement(fromSMSAccount, false))
				return false;
			String[] strings = StringUtils.substringsBetween(map.get(getMapKeys(map).get(4)).toString(), "{", "}");
			for(int i=0;i<strings.length;i++){
				By SMSBody = By.xpath("//label[normalize-space(text()) = 'SMS Body']//following-sibling :: div[contains(text(),'"+strings[i]+"')]");
				if(!verifyElement(SMSBody, false))
					return false;
			}
			if(!verifyElement(status, false))
				return false;
			return true;
		}else{
			return false;
		}
	}

	/**
	 * @author dishant.doshi
	 * to delete SMS Template
	 * @param map - excel values
	 * @param keys - excel header
	 * @return 
	 * @creation date 31/10/2018
	 */
	public boolean deleteSMSTemplate(Map<Object, Object> map, List<Object> mapKeys) {
		filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString());
		if(verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false)){
			clickOnInfoBtn(map.get(getMapKeys(map).get(0)).toString());
			delete();
			return true;
		}else{
			String string = "SMS Template already deleted";
			log("</br><b style='color:#02563d'>"+string+"</b>");
		}
		return true;
	}

	/**
	 * @author dishant.doshi
	 * to verify SMS Template deleted?
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/10/2018
	 * @return true if SMS Template deleted successfully 
	 */
	public boolean verifySMSTemplateDeleted(Map<Object, Object> map, List<Object> mapKeys) {
		if(verifyFilterBtn()){
			filterSearch(map.get(mapKeys.get(1)).toString(), map.get(mapKeys.get(0)).toString());
			return verifyElement(By.xpath("(//td[text()='"+map.get(getMapKeys(map).get(0)).toString()+"'])[1]"),false);
		}else{
			return true;
		}
	}
	/**
	 * @author kutbuddin.compounder
	 *  to verify sms Template  log 
	 * @param map - excel values
	 * @param keys - excel header
	 * @creation date 31/12/2018
	 * @return true if Sms Template Log successfully Verified
	 */
	public boolean verifySMSTemplateEditedLogd(Map<Object, Object> map, List<Object> mapKeys){
		filterSearch(map.get(mapKeys.get(2)).toString(), map.get(mapKeys.get(0)).toString());
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
	 * @author dishant.doshi to sort SMSTemplate account
	 * @param map
	 *            - for excel data
	 * @param mapKeys
	 *            - for excel header
	 * @return
	 * @creation date 07/01/2019
	 */
	public boolean sortSMSTemplate(Map<Object, Object> map, List<Object> mapKeys) {
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
